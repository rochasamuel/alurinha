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

    get volumeTotal() {
        return this._negociacoes.reduce((total, n) => total + n.volume, 0.0);
     }

}