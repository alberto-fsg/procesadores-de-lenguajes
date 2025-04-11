package lib.symbolTable;

import lib.tools.codeGeneration.*;

public class AtribExp {
    public Symbol.Types type;
    public String image;
    public Boolean isVar;
    public Boolean isConst;
    public CodeBlock code;

    public AtribExp() {
        type = Symbol.Types.UNDEFINED;
        code = new CodeBlock();
    }

    public AtribExp(Symbol.Types type, String image, Boolean isVar, Boolean isConst) {
            this.type = type;
            this.image = image;
            this.isVar = isVar;
            this.isConst = isConst;
            code = new CodeBlock();
    }
}