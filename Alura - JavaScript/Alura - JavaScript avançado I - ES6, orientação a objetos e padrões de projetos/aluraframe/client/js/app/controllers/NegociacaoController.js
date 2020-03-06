class NegociacaoController {
    
    constructor(){
        let $ = document.querySelector.bind(document);

        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');
        this._listaNegociacoes = new ListaNegociacoes();

        this._negociacoesView = new NegociacoesView($('#negociacoesView'));
        this._negociacoesView._update(this._listaNegociacoes);

        this._mensagem = new Mensagem();
        this._mensagemView = new MensagemView($('#mensagemView'));
        this._mensagemView._update(this._mensagem);
    }

    adiciona(event){
        event.preventDefault();

        let data = DateHelper.textoParaData(this._inputData.value);

        this._listaNegociacoes.adiciona(this._criaNegociacao(data));

        this._mensagem.texto = 'Negociação adicionada com sucesso!';
        this._mensagemView._update(this._mensagem);
        
        this._negociacoesView._update(this._listaNegociacoes);
        this._limparFormulario();
    }

    _criaNegociacao(data) {
        return new Negociacao(
            data,
            this._inputQuantidade.value,
            this._inputValor.value
        );
    }

    _limparFormulario(){
        this._inputQuantidade.value = 1;
        this._inputValor.value = 0.0;
        this._inputData.value = '';

        this._inputData.focus();
    };
}
