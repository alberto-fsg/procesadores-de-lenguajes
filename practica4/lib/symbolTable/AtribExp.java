package lib.symbolTable;

import lib.tools.codeGeneration.*;

public class AtribExp {
    public Symbol.Types type;
    public Boolean isConst;
    public CodeBlock code;
    public String image;

    public AtribExp() {
        this(Symbol.Types.UNDEFINED, false, "");
    }

    public AtribExp(Symbol.Types type, Boolean isConst) {
        this(type, isConst, "");
    }

    public AtribExp(Symbol.Types type, Boolean isConst, String image) {
            this.type = type;
            this.image = image;
            this.isConst = isConst;
            code = new CodeBlock();
    }

    public static AtribExp copy(AtribExp ae) {
        return new AtribExp(ae.type, ae.isConst, ae.image);
    }
}