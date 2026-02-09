# 🍔 HamburgueriaZ - Aplicativo Android

[![Java](https://img.shields.io/badge/Java-11%2B-orange?style=for-the-badge&logo=java)](https://www.java.com/)
[![Android](https://img.shields.io/badge/Android-API%2021%2B-3DDC84?style=for-the-badge&logo=android)](https://developer.android.com/)
[![Android Studio](https://img.shields.io/badge/Android%20Studio-Latest-3DDC84?style=for-the-badge&logo=android-studio)](https://developer.android.com/studio)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)](LICENSE)

Aplicativo Android nativo desenvolvido em Java para gerenciar pedidos de uma hamburgueria. Primeiro projeto completo de desenvolvimento mobile, demonstrando conceitos fundamentais de Android como layouts, intents, cálculos dinâmicos e integração com aplicativos do sistema.

## 🎯 Objetivo

Criar um aplicativo mobile funcional que demonstre boas práticas de desenvolvimento Android, incluindo interface responsiva, lógica de negócio, persistência de dados e integração com serviços do sistema.

## ✨ Funcionalidades

- 🍔 **Catálogo de Hambúrgueres**: Visualizar produtos disponíveis
- ➕ **Controle de Quantidade**: Aumentar/diminuir quantidade com botões
- 🥓 **Adicionais Personalizáveis**: Selecionar extras (Bacon, Queijo, Onion Rings)
- 💰 **Cálculo Automático**: Preço atualizado em tempo real
- 📋 **Resumo de Pedido**: Visualizar detalhes completos do pedido
- 📧 **Integração com Email**: Enviar pedido via Gmail usando Intent
- 📱 **Design Responsivo**: Funciona em diferentes tamanhos de tela

## 🛠️ Tecnologias Utilizadas

### Desenvolvimento
- **Java 11+** - Linguagem de programação
- **Android SDK 21+** - Plataforma Android
- **Android Studio** - IDE de desenvolvimento
- **Gradle** - Build system

### Arquitetura
- **ConstraintLayout** - Layout responsivo
- **LinearLayout** - Organização de componentes
- **Intent** - Comunicação entre componentes
- **SharedPreferences** - Persistência de dados (opcional)

### Padrões
- **MVC** - Model-View-Controller
- **Activity Lifecycle** - Gerenciamento de ciclo de vida

## 📋 Pré-requisitos

- **Android Studio** 4.0+
- **Android SDK** API 21+ (Android 5.0)
- **Java Development Kit (JDK)** 11+
- **Gradle** 6.0+
- **Dispositivo Android** ou **Emulador**

## 🚀 Instalação e Setup

### 1. Clonar o Repositório

```bash
git clone https://github.com/FHPBeto/HamburgueriaZ-Android-App.git
cd HamburgueriaZ-Android-App
```

### 2. Abrir no Android Studio

1. Abra Android Studio
2. Selecione **File** → **Open**
3. Navegue até a pasta do projeto
4. Clique em **OK**

### 3. Sincronizar Gradle

Android Studio sincronizará automaticamente as dependências. Se não sincronizar:

1. Vá em **File** → **Sync Now**
2. Aguarde a conclusão

### 4. Executar o Aplicativo

#### No Emulador

1. Clique em **AVD Manager** (ícone de telefone)
2. Selecione ou crie um emulador
3. Clique em **Run** (Shift + F10)

#### Em Dispositivo Real

1. Ative **Developer Mode** no dispositivo
2. Conecte via USB
3. Clique em **Run** (Shift + F10)

## 📁 Estrutura do Projeto

```
HamburgueriaZ-Android-App/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/hamburgueriaz/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── PedidoActivity.java
│   │   │   │   ├── models/
│   │   │   │   │   └── Hamburguer.java
│   │   │   │   ├── adapters/
│   │   │   │   └── utils/
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_pedido.xml
│   │   │   │   ├── drawable/
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── dimens.xml
│   │   │   │   └── mipmap/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── .gitignore
├── .editorconfig
└── README.md
```

## 🎨 Componentes Principais

### MainActivity.java

Tela principal onde o usuário seleciona hambúrgueres e adicionais.

```java
public class MainActivity extends AppCompatActivity {
    private int quantidade = 1;
    private double preco = 0;
    
    private void atualizarPreco() {
        // Lógica de cálculo de preço
    }
    
    private void enviarPedido() {
        // Enviar via Intent para Gmail
    }
}
```

### PedidoActivity.java

Tela de resumo do pedido com detalhes e opção de envio.

## 🔄 Fluxo da Aplicação

```
MainActivity (Seleção)
    ↓
[Selecionar Hambúrguer]
    ↓
[Escolher Adicionais]
    ↓
[Definir Quantidade]
    ↓
[Calcular Preço]
    ↓
[Enviar Pedido]
    ↓
PedidoActivity (Resumo)
    ↓
[Confirmar e Enviar Email]
```

## 📸 Capturas de Tela

O aplicativo inclui as seguintes telas:

1. **Tela Principal** - Seleção de hambúrgueres e adicionais
2. **Controle de Quantidade** - Botões +/- para ajustar quantidade
3. **Resumo do Pedido** - Detalhes completos do pedido
4. **Integração com Email** - Envio via Gmail

## 🧪 Testando o Aplicativo

1. **Inicie o emulador** ou conecte um dispositivo
2. **Execute o app**: Shift + F10
3. **Teste as funcionalidades**:
   - Selecione um hambúrguer
   - Escolha adicionais (checkbox)
   - Ajuste a quantidade (+/-)
   - Verifique o cálculo de preço
   - Envie o pedido via email

## 🐛 Troubleshooting

### Erro: "Gradle sync failed"
```
1. Vá em File → Invalidate Caches
2. Reinicie Android Studio
3. Sincronize Gradle novamente
```

### Erro: "Build failed"
```
1. Verifique se JDK está configurado corretamente
2. Limpe o build: Build → Clean Project
3. Reconstrua: Build → Rebuild Project
```

### Emulador não inicia
```
1. Verifique se virtualization está habilitada no BIOS
2. Aumente a RAM alocada para o emulador
3. Tente usar um emulador diferente
```

## 📚 Recursos Úteis

- [Documentação Android](https://developer.android.com/docs)
- [Android Studio Guide](https://developer.android.com/studio/intro)
- [Java Documentation](https://docs.oracle.com/javase/11/)
- [Material Design](https://material.io/design)
- [Android Best Practices](https://developer.android.com/guide/practices)

## 🎓 Conceitos Aprendidos

Durante o desenvolvimento deste projeto, foram aplicados:

- ✅ **ConstraintLayout** - Layouts responsivos
- ✅ **Event Listeners** - Tratamento de cliques
- ✅ **Intent** - Comunicação entre componentes
- ✅ **Activity Lifecycle** - Gerenciamento de ciclo de vida
- ✅ **SharedPreferences** - Persistência de dados
- ✅ **Cálculos Dinâmicos** - Lógica de negócio
- ✅ **UI/UX** - Design de interface

## 🚀 Melhorias Futuras

- [ ] Adicionar mais opções de produtos
- [ ] Implementar banco de dados local (SQLite)
- [ ] Adicionar sistema de login
- [ ] Integração com API backend
- [ ] Histórico de pedidos
- [ ] Sistema de avaliações
- [ ] Notificações push
- [ ] Modo offline

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do repositório
2. Crie uma branch (`git checkout -b feature/MinhaFeature`)
3. Commit suas mudanças (`git commit -m 'feat: descrição'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 👤 Autor

**FHPBeto**
- GitHub: [@FHPBeto](https://github.com/FHPBeto)
- Email: [seu-email@example.com]

## 📞 Suporte

Encontrou um problema? Abra uma [issue](https://github.com/FHPBeto/HamburgueriaZ-Android-App/issues) no repositório.

---

**Desenvolvido com ❤️ como primeiro projeto Android**
