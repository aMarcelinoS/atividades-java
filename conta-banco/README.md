EXERCÍCIO REALIZADO PARA A PRATICAR TRATAMENTO DE EXCESSÕES.

Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta.

TESTES:

ENTRADAS:

Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00

SAÍDA ESPERADA:
New balance: 400.00

ENTRADAS:

Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00
Enter amount for withdraw: 400.00

SAÍDA ESPERADA:
Withdraw error: The amount exceds withdraw limit


ENTRADAS:

Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00
Enter amount for withdraw: 250.00

SAÍDA ESPERADA:
Withdraw error: Not enough balance
