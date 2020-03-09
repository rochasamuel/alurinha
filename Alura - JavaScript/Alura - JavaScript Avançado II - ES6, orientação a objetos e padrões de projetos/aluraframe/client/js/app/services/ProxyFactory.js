class ProxyFactory {

    static create(objeto, props, acao) {

        return new Proxy(objeto, {
            
            //aplica o proxy para funcoes
            get(target, prop, receiver) {

                if(props.includes(prop) && ProxyFactory._ehFuncao(target[prop])) {
                    return function() {

                        console.log(`a propriedade "${prop}" foi interceptada`);
                        let retorno = Reflect.apply(target[prop], target, arguments);
                        acao(target);
                        return retorno;
                    }
                }
                return Reflect.get(target, prop, receiver);       
            },

            //aplica o proxy paara setters
            set(target, prop, value, receiver) {
                console.log(`a propriedade "${prop}" foi interceptada`);
                let retorno = Reflect.set(target, prop, value, receiver);
                if(props.includes(prop)) {
                    acao(target);    
                }
                return retorno;
            }
        })
    }

    static _ehFuncao(func) {
        return typeof(func) == typeof(Function);
    }
}