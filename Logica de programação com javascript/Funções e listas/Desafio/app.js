let tituloDaPagina = document.querySelector('h1');
tituloDaPagina.innerHTML = 'Hora do Desafio!';

// quando o botão for clicado irá disparar a função mostrarConsole e exibirá a mensagem no console
function mostrarConsole() {
    console.log('Botão clicado!');
}

// quando o botão for clicado irá disparar a função mostrarAlerta e exibirá a mensagem em um alerta
function mostrarAlerta(){
    alert('Eu amo JS');
}

// quando o botão for clicado irá disparar a função perguntarNome e exibirá um prompt para o usuário inserir o nome
function perguntarCidade(){
   let cidade =  prompt('Qual é a sua cidade?');
    alert(`Estive em ${cidade} e gostei muito!`);
}

// quando o botão for clicado irá disparar a função somaDosNumeros e exibirá um prompt para o usuário inserir dois números
function somaDosumeros(){
    let numero1 = parseInt(prompt('Digite o primeiro número:'));
    let numero2 = parseInt(prompt('Digite o segundo número:'));
    let soma = numero1 + numero2;

    alert(`A soma de ${numero1} + ${numero2} é igual a ${soma}`);
}