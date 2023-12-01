package AV2_POO;

import java.util.Date;

public class Evento {

        private String nomeEvento;
        private Date dataEvento;
        private double precoEvento;
        private String descEvento;
        private int qtdIngressos;
        private Categoria categoria;

        public Evento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdIngressos, Categoria categoria) {
            this.nomeEvento = nomeEvento;
            this.dataEvento = dataEvento;
            this.precoEvento = precoEvento;
            this.descEvento = descEvento;
            this.qtdIngressos = qtdIngressos;
            this.categoria = categoria;
        }

        public String getNomeEvento() {
            return nomeEvento;
        }
        public void setNomeEvento(String nomeEvento) {
            this.nomeEvento = nomeEvento;
        }

        public Date getDataEvento() {
            return dataEvento;
        }
        public void setDataEvento(Date dataEvento) {
            this.dataEvento = dataEvento;
        }

        public double getPrecoEvento() {
            return precoEvento;
        }
        public void setPrecoEvento(double precoEvento) {
            this.precoEvento = precoEvento;
        }

        public String getDescEvento() {
             return descEvento;
        }
        public void setDescEvento(String descEvento) {
             this.descEvento = descEvento;
        }

         public int getQtdIngressos() {
            return qtdIngressos;
        }
        public void setQtdIngressos(int qtdIngressos) {
            this.qtdIngressos = qtdIngressos;
        }

        public Categoria getCategoria() {
            return categoria;
        }
        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

        public boolean buscarEvento(Evento evento) {
            return this.nomeEvento.equals(evento.nomeEvento);
        }
    }


