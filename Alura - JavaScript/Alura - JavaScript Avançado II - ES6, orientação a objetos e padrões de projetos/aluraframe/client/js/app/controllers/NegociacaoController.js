class NegociacaoController {
    
    constructor(){
        let $ = document.querySelector.bind(document);

        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');

        this._listaNegociacoes = new Bind(
            new ListaNegociacoes(),
            new NegociacoesView($('#negociacoesView')),
            'adiciona', 'esvazia'
        );

        this._mensagem = new Bind(
            new Mensagem(),
            new MensagemView($('#mensagemView')),
            'texto'
        );
    }

    adiciona(event){
        event.preventDefault();

        let data = DateHelper.textoParaData(this._inputData.value);

        this._listaNegociacoes.adiciona(this._criaNegociacao(data));
        this._mensagem.texto = 'Negociação adicionada com sucesso!';
        this._limparFormulario();
    }

    apaga(event) { 
        event.preventDefault();

        this._listaNegociacoes.esvazia();
        this._mensagem.texto = 'Negociações apagadas com sucesso!';
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
