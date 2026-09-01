# 📇 Agenda de Contatos em Java

> Uma aplicação de console em Java para gerenciamento de contatos, desenvolvida passo a passo para demonstrar a evolução do uso de variáveis simples a estruturas de dados dinâmicas.

---

## 📌 Sobre o Projeto

Este projeto tem como objetivo demonstrar a evolução de um sistema CRUD (*Create, Read, Update, Delete*) básico feito em terminal no ecossistema Java. Acompanhando o histórico de versões, é possível observar melhorias graduais em **arquitetura de dados**, **otimização de memória** e **usabilidade**.

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
  - Utilização do `Scanner` e estrutura condicional `switch-case` com sintaxe moderna.
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

A versão atual finaliza o ciclo completo do CRUD, incluindo a opção de **alteração/edição** de contatos existentes e melhorando o controle do fluxo.

- **Novidades:**
  - 🆕 **Opção 4 — Alterar contato:** Permite localizar um contato pelo nome e atualizar seus dados (`.set(posicao, novoValor)`).
  - Ajuste na numeração do menu principal (Opção 6 agora é "Sair").
  - Encerramento do recurso de leitura no terminal via `sc.close()`.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Estruturas de Dados Utilizadas:**
  - Variáveis Primitivas e `String`
  - Vetores Fixos (`Array[]`)
  - Listas Dinâmicas (`ArrayList<String>`)
- **Entrada de Dados:** `java.util.Scanner`

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK 17** (ou superior) instalado na sua máquina.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/agenda-de-contatos-java.git](https://github.com/seu-usuario/agenda-de-contatos-java.git)