# 🏦 Standard Bank — Sistema de Gestão de Recibos

Sistema de processamento de recibos de vendas desenvolvido em Java, que lê dados a partir de um ficheiro de texto, calcula comissões e apresenta os resultados.

---

## 📋 Descrição

O programa lê um ficheiro (`Recibo.txt`) com registos de vendas de empresas, calcula automaticamente a comissão de **1%** sobre o valor de cada venda, acumula o total de comissões recebidas e conta o número de vendas realizadas no **dia 19**.

---

## ⚙️ Funcionalidades

- 📂 **Leitura de dados** a partir do ficheiro `Recibo.txt`
- 🧾 **Apresentação** de todos os recibos com nome da empresa, data, valor de vendas e comissão
- 💰 **Cálculo automático** de comissão (1% do valor de vendas)
- 📊 **Total de comissões** acumuladas de todos os registos
- 📅 **Contagem de vendas** realizadas no dia 19

---

## 🗂️ Estrutura do Projeto

```
src/
├── Main.java           # Ponto de entrada da aplicação
├── Recibo.java         # Classe modelo do recibo (empresa, data, valor, comissão)
└── GestaoRecibo.java   # Lógica de leitura do ficheiro e cálculo dos resultados
```

---

## 📄 Formato do Ficheiro de Entrada

O ficheiro `Recibo.txt` deve ter uma linha por registo, com os campos separados por espaço:

```
NomeEmpresa  DD-MM-AAAA  ValorVendas
```

**Exemplo:**
```
EmpresaXYZ 19-05-2025 50000.00
EmpresaABC 22-06-2025 30000.00
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Passos

1. Clona o repositório:
   ```bash
   git clone https://github.com/teu-utilizador/standard-bank-recibos-java.git
   ```

2. Certifica-te que o ficheiro `Recibo.txt` está na raiz do projeto.

3. Compila e executa:
   ```bash
   javac src/*.java -d out/
   java -cp out/ Main
   ```

---

## 🖥️ Exemplo de Output

```
| Nome da Empresa: EmpresaXYZ | Data: 19-05-2025 | ValorVendas: 50,000.00MT | Comissao: 500.00MT
| Nome da Empresa: EmpresaABC | Data: 22-06-2025 | ValorVendas: 30,000.00MT | Comissao: 300.00MT
==== Resultados ====
Total de comissoes recebidas: 800.00MT
Numero de vendas no dia 19: 1
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem de programação
- **FileReader / BufferedReader** — Leitura de ficheiros de texto
- **StringTokenizer** — Parsing de linhas do ficheiro
- **DecimalFormat** — Formatação de valores monetários em MT

---

## 👨‍💻 Autor

Trabalho Prático — Desenvolvido no âmbito da unidade curricular de programação.
