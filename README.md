# 🎓 EduTrack – Plataforma de Gestão de Cursos Online

## 📌 Sobre o Projeto

**EduTrack** é um sistema de gerenciamento de cursos online desenvolvido em **Java**, com foco em **orientação a objetos, modelagem de domínio e regras de negócio**.

O projeto simula uma plataforma de ensino digital onde **instrutores podem criar cursos** e **alunos podem se matricular, acompanhar progresso e avaliar conteúdos**.

Este projeto foi desenvolvido com o objetivo de **praticar conceitos avançados de POO e arquitetura de sistemas backend**, servindo também como **projeto de portfólio**.

---

# 🚀 Objetivos do Projeto

Este projeto foi criado para praticar e demonstrar conhecimentos em:

* Modelagem de domínio
* Programação Orientada a Objetos
* Organização de sistemas em camadas
* Definição de regras de negócio
* Tratamento de exceções
* Estruturação de projetos Java

---

# 🧠 Conceitos Aplicados

O sistema utiliza diversos conceitos fundamentais da programação orientada a objetos:

* Classes e Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classes Abstratas
* Interfaces
* Enumerações
* Associações entre objetos
* Coleções
* Tratamento de exceções personalizadas

---

# 🏗 Estrutura do Sistema

O projeto é organizado em diferentes domínios responsáveis por partes específicas do sistema.

```
application
   └ Sistema principal da aplicação

domain
   ├ usuarios
   ├ cursos
   ├ matriculas
   ├ progresso
   ├ avaliacoes
   └ certificados

services
   └ regras de negócio do sistema

exceptions
   └ exceções personalizadas
```

Essa estrutura permite **separar responsabilidades**, facilitando manutenção e evolução do sistema.

---

# 👥 Usuários do Sistema

O sistema possui dois tipos principais de usuários:

### 👨‍🎓 Aluno

Responsável por consumir conteúdo da plataforma.

Pode:

* visualizar cursos
* se matricular
* acompanhar progresso
* avaliar cursos
* receber certificados

---

### 👨‍🏫 Instrutor

Responsável pela criação de conteúdo.

Pode:

* criar cursos
* organizar módulos
* adicionar aulas
* acompanhar alunos matriculados

---

# 🎓 Cursos

Cada curso possui:

* título
* descrição
* nível de dificuldade
* instrutor responsável
* módulos de conteúdo
* avaliações de alunos

Cursos podem possuir diferentes estados:

* **Rascunho**
* **Publicado**
* **Arquivado**

---

# 📚 Estrutura de Conteúdo

Os cursos possuem uma estrutura hierárquica:

```
Curso
 └── Módulos
       └── Aulas
```

### Módulo

Agrupa várias aulas relacionadas a um tema.

### Aula

Unidade individual de conteúdo do curso.

Tipos possíveis de aula:

* vídeo
* artigo
* exercício
* projeto

---

# 📝 Matrículas

Uma matrícula representa o relacionamento entre **aluno e curso**.

Informações importantes:

* data da matrícula
* status da matrícula
* progresso do aluno

Status possíveis:

* ativa
* concluída
* cancelada

---

# 📊 Progresso do Aluno

O sistema acompanha o progresso do aluno dentro de cada curso.

O progresso é calculado com base em:

* aulas concluídas
* porcentagem de conclusão

Quando todas as aulas são concluídas, o curso é considerado **finalizado**.

---

# ⭐ Avaliações

Após concluir um curso, o aluno pode registrar uma avaliação.

Cada avaliação possui:

* nota
* comentário
* data da avaliação

Regras:

* apenas alunos matriculados podem avaliar
* um aluno pode avaliar apenas uma vez
* a nota deve estar dentro de um intervalo válido

---

# 🏆 Certificados

Quando um aluno conclui um curso, o sistema pode emitir um certificado contendo:

* nome do aluno
* curso concluído
* data de conclusão
* código único de certificado

---

# ⚠ Regras de Negócio

O sistema possui diversas regras para garantir integridade dos dados, como:

* alunos não podem se matricular duas vezes no mesmo curso
* cursos precisam estar publicados para aceitar matrículas
* avaliações só podem ser feitas por alunos matriculados
* certificados só podem ser emitidos após conclusão do curso

Caso alguma regra seja violada, o sistema lança **exceções de negócio**.

---

# 📐 Modelagem do Sistema

Principais entidades do domínio:

```
Usuario
 ├── Aluno
 └── Instrutor

Curso
 ├── Módulo
 │     └ Aula
 ├── Matrícula
 ├── Avaliação
 └── Certificado
```

Essa modelagem permite representar **relações reais entre os elementos da plataforma**.

---

# 🎯 Objetivo Educacional

Este projeto foi desenvolvido durante os estudos de **Java e Programação Orientada a Objetos**, com o objetivo de consolidar conhecimentos fundamentais para desenvolvimento backend.

---

# 🚀 Possíveis Evoluções do Projeto

Algumas melhorias planejadas para futuras versões:

* criação de API REST
* integração com banco de dados
* autenticação de usuários
* interface web
* geração automática de certificados

---

# 👨‍💻 Autor

Projeto desenvolvido para fins educacionais e de portfólio.

Desenvolvido como parte dos estudos de **Java e desenvolvimento backend**.
