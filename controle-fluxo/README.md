# 📌 Projeto: ControleFluxo

## 📖 Descrição
O projeto **ControleFluxo** é um sistema em Java que simula um **processo seletivo de candidatos** com validação de salários, tentativa de contato por telefone e execução de uma contagem final, seguindo as regras de **controle de fluxo** estudadas no curso.

Ele possui:
- Validação de parâmetros com **exceção customizada**.
- Simulação de **aprovação de candidatos** com base no salário pretendido.
- Simulação de **ligações para candidatos aprovados** com até 3 tentativas.
- **Relatório final** com status dos candidatos.
- Execução de **contagem numérica** fornecida pelo usuário.

---
## ⚙️ Funcionalidades

### 1️⃣ Entrada do contador
- Solicita ao usuário:
  - Número inicial.
  - Número final.
- Caso o número inicial seja **maior** que o final, lança a exceção `ParametrosInvalidosException`.

### 2️⃣ Processo seletivo
- Lista de candidatos pré-definida.
- Gera um **salário pretendido aleatório** para cada candidato.
- Aprova o candidato caso o salário pretendido seja **menor ou igual** ao salário base (R$ 2000,00).

### 3️⃣ Tentativas de contato
- Para cada candidato aprovado:
  - Realiza **até 3 tentativas** de contato.
  - Caso atenda, exibe mensagem:
    > "Conseguimos contato com [candidato] após [tentativa] tentativa(s)"
  - Caso não atenda, exibe mensagem:
    > "Não conseguimos contato com o [candidato]"

### 4️⃣ Relatório final
- Mostra:
  - Quantidade de aprovados.
  - Quantidade que atendeu.
  - Quantidade que não atendeu.
  - Listas separadas para cada grupo.

### 5️⃣ Contagem final
- Imprime no console mensagens numeradas até atingir o intervalo informado pelo usuário.

---

## 🖥 Exemplo de execução

**Entrada do usuário:**
```
Digite o número inicial do contador:
1
Digite o número final do contador:
3
```

**Saída simulada:**
```
=== Sistema de Validação de Processo Seletivo ===

Lista de candidatos e salários pretendidos:
Candidato: Ana        | Salário Pretendido: R$ 1930.00 | APROVADO
Candidato: Bruno      | Salário Pretendido: R$ 2150.00 | REPROVADO
Candidato: Carlos     | Salário Pretendido: R$ 1890.00 | APROVADO
...

--- Tentativas de contato com candidatos aprovados ---
📞 Ligando para Ana... tocando...
✅ Conseguimos contato com Ana após 1 tentativa(s).
📞 Ligando para Carlos... tocando...
❌ Não conseguimos contato com Carlos.

=== 📊 RELATÓRIO FINAL DO PROCESSO SELETIVO ===
Total de candidatos aprovados: 5
Total de contatos realizados com sucesso: 3
Total de candidatos que não atenderam: 2

✅ Candidatos que atenderam:
 - Ana
 - Fernanda
 - Helena

❌ Candidatos que não atenderam:
 - Carlos
 - Eduardo

=== Contagem Final ===
Etapa 1 concluída.
Etapa 2 concluída.
```

---

## 📦 Como executar

### Pré-requisitos:
- **Java 17** ou superior instalado.
- Editor recomendado: **VS Code** ou **IntelliJ IDEA**.

### Passos para rodar:
1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/controle-fluxo.git
   ```
2. Abra o projeto no VS Code.
3. Compile as classes:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```
4. Execute:
   ```bash
   java Contador
   ```

---

## 🛠 Tecnologias usadas
- **Java** (Controle de fluxo, tratamento de exceções, estruturas de repetição).
- **Random** (Geração de salários e simulação de ligações).
- **Scanner** (Leitura de dados do terminal).

---

## 📄 Licença
Este projeto foi desenvolvido para fins educativos no curso da **DIO**.  
Você pode utilizá-lo e modificá-lo livremente.
More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
