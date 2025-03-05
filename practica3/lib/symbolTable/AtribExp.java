package lib.symbolTable;

public class AtribExp {
    public Symbol.Types type;
    public String image;

    public AtribExp() {
        type = Symbol.Types.UNDEFINED;
    }

    public AtribExp(Symbol.Types type, String image) {
            this.type = type;
            this.image = image;
    }
}