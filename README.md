# 📇 Agenda de Contatos em Java

> Uma aplicação de console em Java para gerenciamento de contatos, desenvolvida passo a passo para demonstrar a evolução do uso de variáveis simples a estruturas de dados dinâmicas, modularização em múltiplas classes, persistência em arquivos de texto, orientação a objetos e integração com interface gráfica nativa.

---

## 📌 Sobre o Projeto

Este projeto tem como objetivo demonstrar a evolução de um sistema CRUD (*Create, Read, Update, Delete*) básico feito em terminal no ecossistema Java. Acompanhando o histórico de versões, é possível observar melhorias graduais em **arquitetura de dados**, **otimização de memória**, **decomposição em classes**, **modularização**, **persistência de dados em arquivos**, **orientação a objetos** e **usabilidade**.

---

## 🚀 Histórico de Evolução & Versões

### 🔹 v0.0.0 — *Armazenamento Estático Simples*
> **Conceito principal:** Estrutura básica de repetição, menus e variáveis primárias.

Nesta primeira versão, o sistema suportava apenas **1 único contato por vez**, armazenado diretamente em variáveis simples `String`.

- **Funcionalidades:**
  - `1` Adicionar contato
  - `2` Listar contato
  - `3` Procurar contato (com `equalsIgnoreCase`)
  - `4` Excluir contato (limpando o valor das variáveis)
  - `5` Sair
- **Características Técnicas:**
  - Utilização do `Scanner` e estrutura condicional `switch-case`.
  - Armazenamento em memória através de variáveis estáticas (`nome`, `celular`, `email`).

---

### 🔹 v0.1.0 — *Armazenamento Multi-Contato com Arrays Vetoriais*
> **Conceito principal:** Gerenciamento de múltiplos dados utilizando Vetores/Arrays fixos.

A segunda versão expandiu o sistema para aceitar uma quantidade de contatos pré-definida (`capacidade = 2`), utilizando **Arrays paralelos**.

- **Novidades e Melhorias:**
  - Substituição das variáveis simples por **Arrays** (`String[]`).
  - Criação de um contador de controle (`cont`) para mapear o limite de posições preenchidas.
  - **Remoção avançada em Array:** Lógica de deslocamento (*shift*) de elementos para não deixar posições `null` vazias no meio da lista.
  - Estrutura de repetição `for` para varredura e busca nos vetores.

---

### 🔹 v0.2.0 — *Refatoração com Coleções Dinâmicas (`ArrayList`)*
> **Conceito principal:** Transição para Coleções do Java (`java.util.List` / `java.util.ArrayList`).

Com a necessidade de superar o limite fixo de tamanho dos vetores, a terceira versão introduziu o uso de **`ArrayList`**, tornando o sistema dinâmico e sem limite pré-determinado de cadastros.

- **Novidades e Otimizações:**
  - Fim dos Arrays fixos e remoção da variável estática de capacidade.
  - Manipulação nativa através de métodos do `ArrayList`:
    - `.add()` para inclusão de novos registros.
    - `.get(index)` para leitura e iteração.
    - `.size()` para verificação dinâmica de tamanho.
    - `.remove(index)` para exclusão automatizada sem necessidade de deslocamento manual.

---

### 🔹 v0.3.0 — *Inclusão da Funcionalidade de Edição & Boas Práticas*
> **Conceito principal:** CRUD completo (Create, Read, Update, Delete) e encerramento correto de recursos.

Inclusão da opção de **alteração/edição** de contatos existentes e melhoria no controle de fluxo.

- **Novidades:**
  - 🆕 **Opção 4 — Alterar contato:** Permite localizar um contato pelo nome e atualizar seus dados (`.set(posicao, novoValor)`).
  - Ajuste na numeração do menu principal (Opção 6 agora é "Sair").
  - Encerramento do recurso de leitura no terminal via `sc.close()`.

---

### 🔹 v1.0.0 — *Modularização e Organização do Código*
> **Conceito principal:** Arquitetura limpa, decomposição em métodos estáticos especialistas e organização em pacotes.

A versão **1.0.0** representa o primeiro marco estável do projeto. Todo o fluxo procedural presente no método `main` foi refatorado e isolado em métodos reaproveitáveis e com responsabilidade única.

- **Novidades e Refatorações:**
  - 📦 **Estruturação em Pacotes:** Organização da classe principal sob o pacote `br.edu.principal`.
  - 🧩 **Modularização do Código:** Separação do CRUD e das exibições em métodos `public static`.
  - ⚡ **Uso de Switch Expressions:** Adoção da sintaxe moderna do `switch-case` com setas (`->`) para um código mais limpo.

---

### 🔹 v1.0.1 — *Correção de Bug no Fluxo de Encerramento (Bug Fix)*
> **Conceito principal:** Correção de repasse de parâmetros primitivos (passagem por valor) no controle do loop principal.

Versão de correção focada na estabilidade do encerramento da aplicação.

- **Correções Realizadas:**
  - 🐛 **Fix no encerramento da aplicação:** Correção da função `sair()`, alterando seu retorno para `boolean` (`public static boolean sair()`) a fim de reatribuir o estado da variável de controle (`continuar = sair()`) e encerrar o loop da `main`.

---

### 🔹 v1.1.1 — *Arquitetura Multi-Classe e Interface Gráfica Básica*
> **Conceito principal:** Princípio de Responsabilidade Única (SRP) com múltiplas classes e introdução ao Java Swing.

A versão **1.1.1** reorganiza a arquitetura da aplicação dividindo as responsabilidades entre classes distintas, além de adicionar um recurso de interface gráfica.

- **Novidades e Refatorações:**
  - 🏛️ **Arquitetura Multi-Classe (Separação de Responsabilidades):**
    - `Principal.java`: Responsável unicamente pela inicialização da aplicação e controle do menu principal.
    - `Agenda.java`: Classe especialista que contém todas as regras de negócio do CRUD (`adicionar`, `listar`, `pesquisar`, `atualizar`, `excluir`).
    - `Uteis.java`: Classe utilitária com métodos de suporte à interface de linha de comando (`mostraInicializacao`, `mostraMenu`, `selecionaOpcao`, `sair`, `sobre`).
  - 🆕 **Opção 7 — Sobre:** Adição de uma nova opção no menu.
  - 🖼️ **Introdução ao Java Swing:** Integração com o pacote `javax.swing.JOptionPane` no método `Uteis.sobre()`, exibindo os créditos do autor através de uma janela modal (*pop-up*) nativa do Java.

---

### 🔹 v2.1.0 — *Persistência de Dados em Arquivos de Texto (I/O) & Refatoração da Camada de Persistência*
> **Conceito principal:** Armazenamento permanente em disco (`java.io`), tratamento de exceções, validação de registros e criação da classe especialista `Persistencia`.

A versão **2.1.0** traz a persistência de dados para a aplicação, garantindo que os contatos salvos não sejam perdidos ao encerrar o sistema. Os dados passam a ser gravados e lidos de um arquivo texto local (`contatos.txt`).

- **Novidades e Funcionalidades de Persistência:**
  - 💾 **Salvar Contatos:** Utilização de `PrintWriter` e `FileWriter` no formato delimitado (`nome;celular;email`) para gravar todos os contatos em disco ao encerrar o programa na opção `6 - Sair`.
  - 📂 **Carregar Contatos:** Leitura automática de `contatos.txt` via `BufferedReader` e `FileReader` no momento em que a aplicação é iniciada.
  - 🛡️ **Tratamento de Exceções e Erros de I/O:** Captura segura de exceções (`try-catch` com `IOException`) evitando que a aplicação quebre durante operações de arquivo.
  - 🔍 **Validação de Registros Corrompidos:** Checagem das linhas usando `.split(";")` para ignorar formatos inválidos ou corrompidos, além do uso de `File.exists()` para evitar erros caso o arquivo ainda não tenha sido criado.
- **Arquitetura e Refatorações:**
  - 🏛️ **Nova Classe `Persistencia.java`:** Criação de uma classe especialista em operações de I/O, isolando completamente o gerenciamento do arquivo `contatos.txt` das regras de negócio e da interface.
  - 🏷️ **Atualização de Interface e Identificação:** Atualização do banner inicial em `Uteis.mostraInicializacao()` exibindo a versão **v2.1.0**.

---

### 🔹 v3.0.0 — *Iniciação à Programação Orientada a Objetos (POO)*
> **Conceito principal:** Transição do modelo procedural baseado em listas paralelas para a modelagem orientada a objetos com a classe `Contato`.

A versão **3.0.0** representa o início do paradigma de Orientação a Objetos no projeto. Estruturas como a classe `Contato` passam a encapsular os atributos e abstrações do sistema, preparando a aplicação para manipulação de listas de objetos (`List<Contato>`).

- **Novidades e Refatorações:**
  - 🧱 **Criação da Classe Dominial `Contato.java`:** Definição da classe base do modelo de domínio no pacote `br.edu.principal`.
  - 🔄 **Evolução do Encapsulamento:** Preparação da arquitetura para a substituição de listas paralelas independentes (`nomes`, `celulares`, `emails`) por uma única coleção tipada do objeto de modelo.

---

### 🔹 v3.1.0 — *Instanciação e Manipulação Prática de Objetos `Contato`*
> **Conceito principal:** Prática direta de instanciação de objetos, atribuição de atributos e iteração sobre coleções de objetos `ArrayList<Contato>`.

A versão **3.1.0** consolida a utilização prática da classe `Contato` através de testes e manipulação direta de instâncias e coleções de objetos dentro do fluxo principal da aplicação.

- **Novidades e Implementações:**
  - 🧪 **Instanciação de Objetos:** Criação e preenchimento de múltiplos objetos da classe `Contato` (`contato1`, `contato2`, `contato3`) definindo diretamente seus atributos (`nome`, `celular`, `email`).
  - 📦 **Coleção de Objetos Dinâmica:** Criação de uma lista tipada `List<Contato> contatos = new ArrayList<>()` para armazenar e agrupar os objetos criados.
  - 🔄 **Iteração com For-Each e For Tradicional:**
    - Leitura e exibição dos dados dos contatos utilizando o laço *for-each* (`for (Contato contato : contatos)`).
    - Iteração indexada com *for* tradicional utilizando `.size()` e acessando os elementos via `.get(i)`.
  - 🎯 **Acesso Direto aos Atributos:** Demonstração de acesso encadeado e direto às propriedades do objeto (`contatos.get(0).nome`).

---

### 🔹 v3.2.0 — *Refatoração Completa do CRUD e Persistência para Objetos (`List<Contato>`)*
> **Conceito principal:** Substituição definitiva das listas paralelas (`String`) por uma única lista tipada de objetos `List<Contato>` em toda a aplicação.

A versão **3.2.0** conclui a transição para a Programação Orientada a Objetos, unificando a manipulação de dados na classe `Contato` em todas as camadas do sistema (CRUD, Persistência e Execução).

- **Novidades e Refatorações:**
  - 🎯 **CRUD Totalmente Orientado a Objetos (`Agenda.java`):**
    - `adicionar()`: Instancia novos objetos `Contato`, popula seus atributos e adiciona à `List<Contato>`.
    - `listar()` e `pesquisar()`: Iteração limpa com *for-each* navegando pelos objetos da lista.
    - `atualizar()`: Localiza a referência do objeto `Contato` e altera diretamente seus campos.
    - `excluir()`: Remoção direta do objeto da lista com `contatos.remove(contatoExcluir)`.
  - 💾 **Persistência Orientada a Objetos (`Persistencia.java`):**
    - `salvarContatos()`: Grava diretamente os atributos dos objetos `Contato` em formato delimitado (`nome;celular;email`).
    - `carregarContatos()`: Instancia e popula objetos `Contato` a partir da leitura do arquivo texto antes de adicioná-los à lista principal.
  - 🚀 **Simplificação do Fluxo Principal (`Principal.java`):**
    - Eliminação das listas paralelas de `String`. Todo o fluxo utiliza exclusivamente `List<Contato> contatos = new ArrayList<>()`.
  - 🏷️ **Atualização no Banner:** Atualização da versão para **v3.2.0** em `Uteis.mostraInicializacao()`.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Bibliotecas Nativas:** 
  - `java.util.Scanner`, `java.util.List`, `java.util.ArrayList`
  - `java.io.BufferedReader`, `java.io.File`, `java.io.FileReader`, `java.io.FileWriter`, `java.io.IOException`, `java.io.PrintWriter`
  - `javax.swing.JOptionPane`
- **Estruturas de Dados Utilizadas:**
  - Variáveis Primitivas e `String`
  - Vetores Fixos (`Array[]`)
  - Listas Dinâmicas de Objetos (`List<Contato>` / `ArrayList<Contato>`)
- **Conceitos de Programação:**
  - Programação Orientada a Objetos (POO)
  - Abstração, Encapsulamento e Modelagem de Domínio (`Contato`)
  - Iteração Avançada com For-Each e Busca por Referência de Objeto
  - Separação de Responsabilidades em Múltiplas Classes (`Principal`, `Agenda`, `Persistencia`, `Uteis`, `Contato`)
  - Persistência de Dados de Objetos em Arquivos Texto (`.txt`)
  - Tratamento de Exceções (`try-catch` / `IOException`)
  - Modularização (Métodos Estáticos)
  - Estruturação de Pacotes (`Packages`)
  - Interface Gráfica Nativa (`Swing`)

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK 17** (ou superior) instalado na sua máquina.
2. Clone o repositório:
   
```bash
   git clone [https://github.com/seu-usuario/agenda-de-contatos-java.git](https://github.com/seu-usuario/agenda-de-contatos-java.git)
