public class Token {

        private int index;
        private int valor;



        public Token (int index, int valor) {
            this.index = index;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return "" + this.index + " " + this.valor;
        }

        @Override
        public boolean equals(Object o) {
            Token k = (Token) o;
            return this.index == k.index && this.valor == k.valor;
        }

        public int getIndex() {
            return index;
        }

        public int getValor() {
            return valor;

    }
}
