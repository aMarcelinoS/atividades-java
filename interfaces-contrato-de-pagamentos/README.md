EXERCICIO PROPOSTO PARA IMPLEMENTAR INTERFACE E INJEÇÃO DE DEPENDÊNCIA.

Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.


EXERCISE PROPOSED TO IMPLEMENT INTERFACE AND DEPENDENCE INJECTION.

A company wants to automate the processing of its contracts. the processing of
a contract consists of generating the installments to be paid for that contract, based on the
number of months desired.

The company uses an online payment service to pay the installments.
Online payment services charge a monthly interest as well as a fee.
by payment. For now, the service contracted by the company is Paypal, which applies
Simple interest of 1% on each installment, plus a 2% payment fee.
Make a program to read data from a contract (contract number, contract data,
and total contract value). Then the program must read the number of months to
installment of the contract, and then generate the records of installments to be paid (date and amount),
the first installment being paid one month after the contract date, a second installment two
months after the contract and so on. Show plot data on screen.

ENTRADAS:

Enter contract data
Number: 8028
Date (dd/MM/yyyy): 25/06/2018
Contract value: 600.00
Enter number of installments: 3

SAÍDA ESPERADA:

Installments:
25/07/2018 - $ 206.04
25/08/2018 - $ 208.08
25/09/2018 - $ 210.12
