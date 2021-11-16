package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
		
	private OnlinePaymentService onlinePaymentService;								//<- USO DA INTERFACE PARA CRIAR UMA DEPEND�NCIA FRACA ENTRE O CONTRACT SERVICE
																					//   E O PAYMENT SERVICE.
	
	public ContractService (OnlinePaymentService onlinePaymentService) {			//<- INJE��O DE DEPEND�NCIA USANDO CONSTRUTOR
		this.onlinePaymentService = onlinePaymentService;
		
		}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months; 								 //<- PEGA O VALOR DO CONTRATO E DIVIDE PELA QUANTIDADE SOLICITADA
		for (int i = 1; i<=months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i); //<- ADICIONA O JUROS NA PARCELA DO CONTRATO COM BASE NO M�S
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota); //<- ADICIONA A TAXA DA OPERADORA CITADA NO CONTRATO
			Date dueDate = addMonths(contract.getDate(), i); 								 //<- PEGA A DATA DO CONTRATO E ADICIONA 1 M�S CONFORME A QNT DE PARCELAS SOLICITADAS
			contract.getInstallments().add(new Installment(dueDate, fullQuota)); 			 //<- GERA UMA NOVA "INST�NCIA" OU SEJA PARCELA COM SUA RESPECTIVA DATA DE VENCIMENTO E VALOR.
			}
		}
	
	private Date addMonths(Date date, int N) {       										 //<- AUXILIA NA GERA��O DO PARCELAMENTO ADICIONANDO 'N' MESES NA DATA BASE DO CONTRATO
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}	
}

