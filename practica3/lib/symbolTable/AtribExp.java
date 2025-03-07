package lib.symbolTable;

public class AtribExp {
    public Symbol.Types type;
    public String image;
    public Boolean isVar;
    public Boolean isConst;

    public AtribExp() {
        type = Symbol.Types.UNDEFINED;
    }

    public AtribExp(Symbol.Types type, String image, Boolean isVar, Boolean isConst) {
            this.type = type;
            this.image = image;
            this.isVar = isVar;
            this.isConst = isConst;
    }
}