 alert('Boas vindas ao jogo do número secreto');
 let numeroMaximo = 10;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;
// enauanto o chute não for igual  ao número secreto
while(chute != numeroSecreto ){
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`); 
    // se o chute for diferente do número secreto
    if(chute == numeroSecreto){
        break;
    } else{
        if( chute > numeroSecreto){
            alert(`O número secreto é menor que o ${chute}`);
        } else{
            alert(`O número secreto é maior que o ${chute}`);
        }
    }  
    tentativas++; // ou tentativas = tentativas + 1;
}

let palavraTentativas = tentativas > 1? 'tentativas' : 'tentativa';

alert(`Isso ai! voce descobriu o número secreto  ${numeroSecreto} com ${tentativas} ${palavraTentativas}`);
