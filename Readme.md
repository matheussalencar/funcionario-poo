# Introdução a linguagem Java
Você recebeu a solicitação para desenvolver um sistema de gerenciamento de funcionários em uma empresa.<br> Pela escala hierárquica temos dois tipos de funcionários, CLT e PJ.<br> Funcionários PJ são prestadores de serviços e recebem por hora trabalhada. <br>Funcionários CLT recebem de acordo com o cargo que ocupam na empresa + Bônus e gratificações que são calculados em porcentagem do salário base.<br> Em geral Funcionários CLT são divididos na seguinte hierarquia: Técnicos, analistas, gerentes e diretores


* Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada
de 40h semanais e não têm descanso semanal remunerado. O salário base de
um técnico é de R$ 3.200.

* Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada
de 40h horas semanais e possuem 4h de descanso semanal remunerado. O
salário base de um analista é de R$ 4.000

* Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h
semanais com 4h de descanso semanal remunerado. O salário base de um
gerente é de R$ 6.000.

* Diretores não possuem bonificação, entretanto recebem participação nos
lucros de 3%, não possuem horário de trabalho definido e seu salário base é
de R$ 15.000.

* Você precisa implementar o método pagarSalario para cada categoria de forma a
considerar as especificidades de cada uma.