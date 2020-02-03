USE SUCOS;

/*INSERINDO REGISTROS NA TABELA*/
INSERT INTO TBPRODUTOS(
PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) 
VALUES(
'1040107',
'Light - 350ml - Melância',
'Lata',
'350ml',
'Melância',
4.56);

/*INSERINDO VÁRIOS REGISTROS NA TABELA*/
INSERT INTO TBPRODUTOS(
PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) 
VALUES(
'1037797',
'Clean - 2 Litros - Laranja',
'PET',
'2 litros',
'Laranja',
16.01);

INSERT INTO TBPRODUTOS(
PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) 
VALUES(
'1000889',
'Sabor da Montanha - 700 ml - Uva',
'Garrafa',
'700 ml',
'Uva',
6.31);

INSERT INTO TBPRODUTOS(
PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) 
VALUES(
'1004327',
'Videira do Campo - 1,5 Litros - Melância',
'PET',
'1,5 litros',
'Melância',
19.51);

SELECT * FROM TBPRODUTOS;

/*ALTERANDO REGISTROS*/
UPDATE TBPRODUTOS 
SET TAMANHO = '350 ml'
WHERE PRODUTO = '1040107';

/*EXCLUINDO REGISTROS*/
DELETE FROM tbprodutos WHERE PRODUTO = '1004327';

/*INCLUINDO CHAVE PRIMÁRIA*/
ALTER TABLE tbprodutos ADD PRIMARY KEY (PRODUTO);

/*MANIPULANDO DATAS E CAMPOS LÓGICOS*/
ALTER TABLE tbclientes ADD PRIMARY KEY (CPF);

ALTER TABLE tbclientes ADD COLUMN (DATA_NASCIMENTO DATE);

INSERT INTO tbclientes(
CPF, NOME, ENDERECO1, ENDERECO2, BAIRRO, CIDADE, ESTADO,
CEP, IDADE, SEXO, LIMITE_CREDITO, VOLUME_COMPRA, PRIMEIRA_COMPRA,
DATA_NASCIMENTO)
VALUES(
'00388934505', 'João da Silva', 'Rua projetada A número 10', '', 
'VILA ROMAN', 'CARATINGA', 'AMAZONAS', '71266105', 30, 'M', 10000.00, 
2000, 0, '1989-10-05');