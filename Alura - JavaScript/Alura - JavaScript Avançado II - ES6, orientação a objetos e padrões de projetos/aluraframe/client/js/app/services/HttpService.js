class HttpService {

    get(url) {

        return new Promise((resolve, reject) => {
            //instancia o objeto para ajax
            let xhr = new XMLHttpRequest();
    
            //abre a requisição
            xhr.open('GET', url);
    
            //toda vez que o estado mudar executa a função
            xhr.onreadystatechange = () => {
                //se o estado for igual a == resposta pronta
                if(xhr.readyState == 4) {
                    //status da requisição for 200 == sucesso
                    if(xhr.status == 200) {
                        console.log('Deu bom!');
                        //extrai o JSON e transforma em objeto do java script
                        //se der certo retorna null para o err e as negociacoes
                        resolve(JSON.parse(xhr.responseText));
                    }else {
                        console.log('Deu ruim!');
                        //retorna uma mensagem de erro para err
                        reject(xhr.responseText);
                    }
                }
    
            };
    
            //termina a requisição
            xhr.send();
            
        });

    }
}