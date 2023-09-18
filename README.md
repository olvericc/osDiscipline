# FCFS - (First-Come, First-Served)

## Introdução

Este documento fornece uma visão geral técnica do Sistema de Escalonamento de Tarefas desenvolvido em Java. O sistema permite a entrada de tarefas com duração estimada e calcula os tempos de espera e tempo de execução de cada tarefa usando o algoritmo FCFS (First-Come, First-Served).

## Visão Geral do Projeto

O Sistema de Escalonamento de Tarefas é uma aplicação Java que permite ao usuário inserir informações sobre tarefas, calcular os tempos de espera e tempo de execução e exibir os resultados em uma tabela formatada.

## Funcionalidades Principais

- Entrada de informações sobre tarefas, incluindo a duração estimada.
- Cálculo dos tempos de espera e tempo de execução usando o algoritmo FCFS.
- Exibição dos resultados em uma tabela formatada.

## Tecnologias Envolvidas

- Linguagem de Programação: Java 19
- Ambiente de Desenvolvimento: IntelliJ IDEA
- Bibliotecas: Nenhuma biblioteca externa é utilizada neste projeto.

## Casos de Uso

O sistema possui os seguintes casos de uso:

1. Entrada de Informações sobre Tarefas:
    - O usuário insere o número de tarefas.
    - Para cada tarefa, o usuário insere a duração estimada.

2. Cálculo dos Tempos:
    - O sistema calcula os tempos de espera e tempo de execução para cada tarefa usando o algoritmo FCFS.

3. Exibição dos Resultados:
    - O sistema exibe os resultados em uma tabela formatada.

## Requisitos Funcionais

1. O sistema deve permitir ao usuário inserir o número de tarefas.
2. O sistema deve permitir ao usuário inserir a duração estimada de cada tarefa.
3. O sistema deve calcular os tempos de espera e tempo de execução para cada tarefa.
4. O sistema deve exibir os resultados em uma tabela formatada.
5. O sistema deve calcular o tempo médio de espera e tempo médio de execução.

## Regras de Negócio

1. O sistema utiliza o algoritmo FCFS para calcular os tempos de espera e tempo de execução das tarefas.
2. Os tempos de espera e tempo de execução são medidos em unidades de tempo.
3. O tempo médio de espera é calculado como a média dos tempos de espera de todas as tarefas.
4. O tempo médio de execução é calculado como a média dos tempos de execução de todas as tarefas.

## Fundamentação Teórica

O algoritmo FCFS (First-Come, First-Served) é um dos algoritmos de escalonamento mais simples. Ele opera da seguinte maneira:

- As tarefas são executadas na ordem em que chegaram, ou seja, a primeira tarefa a chegar é a primeira a ser executada.
- Quando uma tarefa é executada, ela é executada até a conclusão, sem interrupções.
- O tempo médio de espera é calculado como a média do tempo que cada tarefa passa esperando para ser executada.
- O tempo médio de execução é calculado como a média do tempo que cada tarefa leva para ser concluída.

O algoritmo FCFS é fácil de implementar, mas pode não ser eficiente em termos de tempo de espera, especialmente quando há tarefas longas na fila.

## Melhorias e Implementações

O código original fornecido pelo professor serviu como base, mas foram feitas diversas melhorias e implementações para seguir o paradigma orientado a objetos e aumentar a flexibilidade do sistema. As principais melhorias e implementações incluem:

1. Utilização de Classes: Foram criadas as classes Task e PriorityTask para representar as tarefas e as tarefas prioritárias, permitindo uma modelagem mais orientada a objetos.

2. Encapsulamento: As classes Task e PriorityTask encapsulam os dados relevantes das tarefas e fornecem métodos de acesso para esses dados.

3. Herança: A classe PriorityTask herda da classe Task, aproveitando a reutilização de código e a estrutura hierárquica.

4. Polimorfismo: As tarefas são armazenadas em uma lista polimórfica, o que permite tratar objetos Task e PriorityTask da mesma forma durante o processamento.

5. Abstração: O sistema utiliza abstração para representar tarefas genéricas e tarefas prioritárias, abstraindo os detalhes de implementação.

6. Separação de Responsabilidades: O código foi organizado em diferentes classes (Task, PriorityTask, Printer, Timing, Program) para melhorar a separação de responsabilidades e facilitar a manutenção.

7. Formatação de Saída Melhorada: A tabela de saída foi formatada para alinhar os dados das colunas e melhorar a legibilidade.

8. Cálculo de Médias Ajustado: O cálculo das médias de espera e tempo de execução foi ajustado para considerar todas as tarefas, incluindo as prioritárias.

Essas melhorias e implementações tornam o código mais modular, extensível e orientado a objetos, facilitando a compreensão e manutenção do sistema.

## Fluxo de Processo

O fluxo de processamento do sistema segue as seguintes etapas:

1. O usuário insere o número de tarefas.
2. Para cada tarefa, o usuário insere a duração estimada.
3. Uma tarefa prioritária também pode ser inserida.
4. O sistema calcula os tempos de espera e tempo de execução das tarefas.
5. Os resultados são exibidos em uma tabela formatada.
6. O sistema calcula o tempo médio de espera e o tempo médio de execução.
7. As médias são exibidas ao usuário.

Este fluxo de processamento é baseado no algoritmo FCFS, onde as tarefas são tratadas na ordem de chegada.

## Conclusão

O Sistema de Escalonamento de Tarefas é uma aplicação Java que utiliza o algoritmo FCFS para calcular os tempos de espera e tempo de execução de tarefas. As melhorias e implementações realizadas no código original visam torná-lo mais orientado a objetos e flexível. O sistema é uma ferramenta útil para entender os princípios de escalonamento de tarefas e é facilmente extensível para futuras melhorias.

# SJF - (Shortest Job First)

## Introdução

Este documento fornece uma visão geral técnica do Sistema de Escalonamento de Tarefas desenvolvido em Java, utilizando o algoritmo SJF (Shortest Job First). O sistema permite a entrada de tarefas com duração estimada e calcula os tempos de espera e tempo de execução de cada tarefa.

## Visão Geral do Projeto

O Sistema de Escalonamento de Tarefas SJF é uma aplicação Java que permite ao usuário inserir informações sobre tarefas, calcular os tempos de espera e tempo de execução e exibir os resultados em uma tabela formatada.

## Funcionalidades Principais

-   Entrada de informações sobre tarefas, incluindo a duração estimada.

-   Cálculo dos tempos de espera e tempo de execução usando o algoritmo SJF.

-   Exibição dos resultados em uma tabela formatada.


## Tecnologias Envolvidas

-   Linguagem de Programação: Java 17

-   Ambiente de Desenvolvimento: IntelliJ IDEA

-   Bibliotecas: Nenhuma biblioteca externa é utilizada neste projeto.


## Casos de Uso

O sistema possui os seguintes casos de uso:



1.  Entrada de Informações sobre Tarefas:


1.  O usuário insere o número de tarefas.

2.  Para cada tarefa, o usuário insere a duração estimada.


3.  Cálculo dos Tempos:


1.  O sistema calcula os tempos de espera e tempo de execução para cada tarefa usando o algoritmo SJF.


5.  Exibição dos Resultados:


1.  O sistema exibe os resultados em uma tabela formatada.


## Requisitos Funcionais

1.  O sistema deve permitir ao usuário inserir o número de tarefas.

2.  O sistema deve permitir ao usuário inserir a duração estimada de cada tarefa.

3.  O sistema deve calcular os tempos de espera e tempo de execução para cada tarefa.

4.  O sistema deve exibir os resultados em uma tabela formatada.

5.  O sistema deve calcular o tempo médio de espera e tempo médio de execução.


## Regras de Negócio

1.  O sistema utiliza o algoritmo SJF (Shortest Job First) para calcular os tempos de espera e tempo de execução das tarefas.

2.  Os tempos de espera e tempo de execução são medidos em unidades de tempo.

3.  O tempo médio de espera é calculado como a média dos tempos de espera de todas as tarefas.

4.  O tempo médio de execução é calculado como a média dos tempos de execução de todas as tarefas.


## Fundamentação Teórica

O algoritmo SJF (Shortest Job First) é um dos algoritmos de escalonamento que visa minimizar o tempo médio de espera. Ele opera da seguinte maneira:



As tarefas são executadas na ordem em que chegaram, mas a tarefa mais curta (menos tempo estimado) é a primeira a ser executada.

Isso significa que as tarefas com menor duração estimada têm prioridade sobre as tarefas mais longas.



O algoritmo SJF é eficiente em termos de tempo de espera, pois reduz o tempo que as tarefas passam na fila de espera, priorizando as tarefas mais curtas.

## Melhorias e Implementações

O código original fornecido serviu como base, mas foram feitas diversas melhorias e implementações para seguir o paradigma orientado a objetos e aumentar a flexibilidade do sistema. As principais melhorias e implementações incluem:



1.  Utilização de Classes: Foram criadas as classes Task e ConcreteTask para representar as tarefas, permitindo uma modelagem mais orientada a objetos.




2.  Encapsulamento: As classes Task e ConcreteTask encapsulam os dados relevantes das tarefas e fornecem métodos de acesso para esses dados.




3.  Herança: A classe ConcreteTask herda da classe Task, aproveitando a reutilização de código e a estrutura hierárquica.




4.  Polimorfismo:  As tarefas são armazenadas em uma lista polimórfica, o que permite tratá-las da mesma forma durante o processamento.




5.  Abstração:  O sistema utiliza abstração para representar tarefas genéricas, abstraindo os detalhes de implementação.




6.  Separação de Responsabilidades: O código foi organizado em diferentes classes (ConcreteTask, Printer, Timing, Program) para melhorar a separação de responsabilidades e facilitar a manutenção.




7.  Formatação de Saída Melhorada: A tabela de saída foi formatada para alinhar os dados das colunas e melhorar a legibilidade.




8.  Cálculo de Médias Ajustado:  O cálculo das médias de espera e tempo de execução foi ajustado para considerar todas as tarefas.




Essas melhorias e implementações tornam o código mais modular, extensível e orientado a objetos, facilitando a compreensão e manutenção do sistema.

## Fluxo de Processo

O fluxo de processamento do sistema segue as seguintes etapas:



1.  O usuário insere o número de tarefas.

2.  Para cada tarefa, o usuário insere a duração estimada.

3.  O sistema calcula os tempos de espera e tempo de execução das tarefas.

4.  Os resultados são exibidos em uma tabela formatada.

5.  O sistema calcula o tempo médio de espera e o tempo médio de execução.

6.  As médias são exibidas ao usuário.




Este fluxo de processamento é baseado no algoritmo SJF, onde as tarefas são tratadas de forma a minimizar o tempo médio de espera.

## Conclusão

O Sistema de Escalonamento de Tarefas SJF é uma aplicação Java que utiliza o algoritmo SJF (Shortest Job First) para calcular os tempos de espera e tempo de execução de tarefas. As melhorias e implementações realizadas no código original visam torná-lo mais orientado a objetos e flexível. O sistema é uma ferramenta útil para entender os princípios de escalonamento de tarefas e é facilmente extensível para futuras melhorias.