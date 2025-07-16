package com.example.hamburgueriaz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;   // Importante!
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;  // Importante!
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // NOSSA VARIÁVEL PARA GUARDAR A QUANTIDADE
    private int quantidade = 1;
    // Variáveis para os componentes da tela (no nosso "armário geral")
    private EditText editNomeCliente;
    private CheckBox checkBacon, checkQueijo, checkOnion;
    private Button btnSomar, btnSubtrair, btnEnviarPedido;
    private TextView textQuantidade, textResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this); // Você pode apagar ou comentar esta linha se quiser
        setContentView(R.layout.activity_main);

        // --- NOSSO CÓDIGO NOVO COMEÇA AQUI ---

        // 1. CAPTURANDO OS COMPONENTES DA TELA
        // CAPTURANDO OS COMPONENTES DA TELA (sem declarar de novo)
        editNomeCliente = findViewById(R.id.editNomeCliente);
        checkBacon = findViewById(R.id.checkBacon);
        checkQueijo = findViewById(R.id.checkQueijo);
        checkOnion = findViewById(R.id.checkOnion);
        textResumo = findViewById(R.id.textResumo);
        btnEnviarPedido = findViewById(R.id.btnEnviarPedido);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        textQuantidade = findViewById(R.id.textQuantidade);
        // 2. PROGRAMANDO A AÇÃO DO BOTÃO DE SOMAR
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidade++; // Soma 1 na variável
                textQuantidade.setText(String.valueOf(quantidade)); // Mostra o novo número na tela
            }
        });
        // ... (código anterior do onCreate)

        // 1. CAPTURANDO OS COMPONENTES DA TELA

        // 2. PROGRAMANDO A AÇÃO DO BOTÃO DE SOMAR
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidade++;
                textQuantidade.setText( String.valueOf(quantidade) );
            }
        });

        // 3. PROGRAMANDO A AÇÃO DO BOTÃO DE SUBTRAIR (COLE O CÓDIGO ABAIXO AQUI)
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantidade > 1) {
                    quantidade--;
                    textQuantidade.setText( String.valueOf(quantidade) );
                }
            }
        });
        btnEnviarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // --- A LÓGICA DO PEDIDO ACONTECE AQUI ---

                // 1. Pegar o nome do cliente
                String nomeCliente = editNomeCliente.getText().toString();

                // 2. Verificar os adicionais
                boolean temBacon = checkBacon.isChecked();
                boolean temQueijo = checkQueijo.isChecked();
                boolean temOnion = checkOnion.isChecked();

                // 3. Calcular o preço
                // Preço base do hambúrguer é R$ 20,00
                double precoTotal = 20.0 * quantidade;

                if (temBacon) {
                    precoTotal += 2.0 * quantidade; // Adiciona R$ 2 por cada hambúrguer
                }
                if (temQueijo) {
                    precoTotal += 2.0 * quantidade; // Adiciona R$ 2 por cada hambúrguer
                }
                if (temOnion) {
                    precoTotal += 3.0 * quantidade; // Adiciona R$ 3 por cada hambúrguer
                }

                // 4. Montar a mensagem de resumo
                String resumoPedido = "Cliente: " + nomeCliente +
                        "\nTem Bacon? " + (temBacon ? "Sim" : "Não") +
                        "\nTem Queijo? " + (temQueijo ? "Sim" : "Não") +
                        "\nTem Onion Rings? " + (temOnion ? "Sim" : "Não") +
                        "\nQuantidade: " + quantidade +
                        "\nPreço Final: R$ " + String.format("%.2f", precoTotal);

                // 5. Mostrar o resumo na tela
                textResumo.setText(resumoPedido);
                // --- CÓDIGO NOVO DA AULA 4 ---

// 6. Criar a intenção (Intent) de enviar o e-mail
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // Apenas apps de e-mail devem responder

// Colocando as informações extras no e-mail
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"pedido@hamburgueriaz.com"}); // E-mail de destino
                intent.putExtra(Intent.EXTRA_SUBJECT, "Pedido de " + nomeCliente); // Assunto do e-mail
                intent.putExtra(Intent.EXTRA_TEXT, resumoPedido); // O corpo do e-mail é o nosso resumo

// Verifica se existe um app de e-mail para abrir, para não dar erro
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });
        EditText editNomeCliente = findViewById(R.id.editNomeCliente);
        CheckBox checkBacon = findViewById(R.id.checkBacon);
        CheckBox checkQueijo = findViewById(R.id.checkQueijo);
        CheckBox checkOnion = findViewById(R.id.checkOnion);
        TextView textPrecoFinal = findViewById(R.id.textResumo);
        Button btnEnviarPedido = findViewById(R.id.btnEnviarPedido);

        // ... (resto do código do onCreate)

        // --- NOSSO CÓDIGO NOVO TERMINA AQUI ---


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}