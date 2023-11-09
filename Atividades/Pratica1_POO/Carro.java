public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean vendido;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.vendido = false; }

        public String getMarca () {
            return marca; }
        public void setMarca (String marca){
            this.marca = marca; }

        public String getModelo () {
            return modelo; }
        public void setModelo (String modelo){
            this.modelo = modelo; }

        public int getAno () {
            return ano;}
        public void setAno( int ano){
            this.ano = ano; }

        public double getPreco () {
            return preco; }
        public void setPreco ( double preco){
            this.preco = preco;}

        public boolean isVendido () {
            return vendido; }
        public void setVendido ( boolean vendido){
            this.vendido = vendido; }
    }

    public class Cliente {
        private String nome;
        private String cpf;
        private String endereco;
        private String telefone;

        public Cliente(String nome, String cpf, String endereco, String telefone) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.telefone = telefone; }

        public String getNome() {
            return nome; }
        public void setNome(String nome) {
                this.nome = nome; }

        public String getCpf () {
                return cpf; }
        public void setCpf (String cpf){
                this.cpf = cpf;}

        public String getEndereco () {
                return endereco;}
        public void setEndereco (String endereco){
                this.endereco = endereco;}

        public String getTelefone () {
                return telefone;}

        public void setTelefone (String telefone){
                this.telefone = telefone; }
        }
        public class Transacao {
            private Carro carro;
            private Cliente cliente;
            private double valor;
            private String data;

            public Transacao(Carro carro, Cliente cliente, double valor, String data) {
                this.carro = carro;
                this.cliente = cliente;
                this.valor = valor;
                this.data = data; }

            public Carro getCarro() {
                return carro; }
            public void setCarro(Carro carro) {
                this.carro = carro; }

            public Cliente getCliente() {
                return cliente; }
            public void setCliente(Cliente cliente) {
                this.cliente = cliente; }

            public double getValor() {
                return valor; }
            public void setValor(double valor) {
                this.valor = valor; }

            public String getData() {
                return data; }
            public void setData(String data) {
                this.data = data; }
        }
    }
}
