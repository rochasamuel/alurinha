class ListaNegociacoes {

    constructor() {
        this._negociacoes = [];
    }

    adiciona(negociacao) {
        this._negociacoes.push(negociacao);
        //a armadilha passara o model para atualização da view
    }

    get negociacoes() {
        return [].concat(this._negociacoes); //devolve uma cópia da lista para blindar e evitar alterações
    }

    esvazia() {
        this._negociacoes = [];
    }

}