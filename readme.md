# 🐸 groq + langChain4j minimal

uma aplicação Java minimalista para interagir com o modelo **Kimi K2** via **Groq API** usando **LangChain4j**

## pré-requisitos

- **Java 17+** (recomendado Java 21)
- **Maven 3.6+**
- **Groq API Key** ([obter aqui](https://console.groq.com/keys))

## setup

### clone ou baixe o projeto
```bash
git clone https://github.com/seu-usuario/groq-minimal.git
cd groq-minimal
```

### configure sua API key
Edite o arquivo `src/main/java/Main.java` e substitua:
```java
.apiKey("gsk_sua_api_key_aqui")
```

### compile o projeto
```bash
mvn clean compile
```

## como usar

### execução direta:
```bash
mvn exec:java -Dexec.mainClass="Main"
```

### ou compile e execute:
```bash
# compilar
mvn clean package

# executar
java -cp target/classes:target/dependency/* Main
```

## exemplo de uso

```
Digite sua pergunta: explique o que são opossums em uma frase
Resposta: os opossums são marsupiais americanos conhecidos por fingirem morte quando se sentem ameaçados.
```

## estrutura do projeto

```
groq-minimal/
├── pom.xml                    # configurações maven
├── src/main/java/
│   └── Main.java             # aplicação principal
└── README.md                 # esse arquivo
```

## dependências

- **LangChain4j OpenAI**: `0.34.0`
  - Compatível com Groq API (OpenAI-compatible)


## recursos úteis

- [Groq Console](https://console.groq.com/)
- [LangChain4j Docs](https://docs.langchain4j.dev/)
- [Groq Models](https://console.groq.com/docs/models)

## contribuindo (ce vai conseguir estagio no google, hein!?)

1. fork do projeto
2. crie sua feature
3. me marca no discord pra eu ver! @guilhhotina