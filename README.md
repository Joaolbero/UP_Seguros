# UP_Seguros
> **PT-BR:** Aplicação desktop em **Java (Swing)** para simulação/cotação de seguros com múltiplas telas e classes de domínio (ex.: Carro, Moto, Eletrodomésticos, Celulares).  
> **EN:** **Java (Swing)** desktop application for insurance simulation/quotations with multiple forms and domain classes (e.g., Car, Motorcycle, Home Appliances, Cell Phones).

---

## 📌 Descrição | Description

**PT-BR**  
Projeto acadêmico GUI feito em **Java Swing**. A navegação é composta por várias telas (`Tela1`…`Tela7`) e classes de domínio (ex.: `Carro`, `Moto`, `Caminhao`, `Eletrodomesticos`, `Notebooks`, categorias A/B). O código foi originalmente estruturado com **NetBeans** (arquivos `.form` presentes) e inclui `.class` gerados.

**EN**  
Academic GUI project built with **Java Swing**. Navigation spans several forms (`Tela1`…`Tela7`) and domain classes (e.g., `Carro`, `Moto`, `Caminhao`, `Eletrodomesticos`, `Notebooks`, categories A/B). Project was originally structured with **NetBeans** (`.form` files included) and contains compiled `.class` files.

---

## ▶️ Como executar | How to run

> **Observação/Note:** Não há Maven/Gradle. É um projeto Java “puro” com **package `projeto`**. Você pode compilar via terminal ou abrir no **NetBeans** (recomendado para editar as telas `.form`).

### Opção A — Terminal (JDK instalado)

**PT-BR**  

1. Abra o terminal na pasta onde ficam os fontes (`UP_Seguros-main/UP_Seguros-main/`).

2. Compile para uma pasta `out/`:
   ```bash
   mkdir -p out
   javac -d out projeto/*.java

3. Execute alguma tela com main (exemplo Tela1):

java -cp out projeto.Tela1

**EN**

1. Open a terminal at the sources folder (`UP_Seguros-main/UP_Seguros-main/`).

2. Compile to `out/`:
```bash
mkdir -p out
javac -d out projeto/*.java

3. Run any form with main (example Tela1):

java -cp out projeto.Tela1

Opção B — NetBeans (GUI Builder)

PT-BR

File → Open Project… e aponte para a pasta do projeto.

Use o GUI Builder para editar os .form.

Defina a classe principal (ex.: projeto.Tela1) e Run.

EN

File → Open Project… and select the project folder.

Use GUI Builder to edit .form files.

Set main class (e.g., projeto.Tela1) and Run.

🗂️ Estrutura | Structure

UP_Seguros/

├─ projeto/

│  ├─ *.java          # domain + GUI (package projeto)

│  └─ *.form          # NetBeans GUI builder files

├─ *.class            # compiled classes (legacy build artifacts)

└─ manifest.mf        # legacy manifest (optional)

🧪 Qualidade / CI (opcional)

PT-BR: Por ser Java “puro”, não há necessidade de CI. Podemos adicionar uma Action simples só para compilar com javac na main e garantir que o build não quebre.
EN: Since it’s plain Java, CI isn’t required. We can add a minimal compile check Action with javac on main.

📄 Licença | License

MIT — veja LICENSE.

👤 Autor | Author

João Vitor Albero — GitHub · LinkedIn