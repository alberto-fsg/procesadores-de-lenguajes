package lib.symbolTable;

public class AtribExp {
    public Symbol.Types type;
    public String op;
    public AtribExp left;
    public AtribExp right;
    public String value;
    public boolean isConst;
    public boolean isLiteral;

    // Constantes
    public AtribExp(Symbol.Types type, String value, boolean isConst, boolean isLiteral) {
        this.type = type;
        this.value = value;
        this.isConst = isConst;
        this.isLiteral = isLiteral;
        this.op = null;
        this.left = null;
        this.right = null;
    }

    // Expresión
    public AtribExp(Symbol.Types type, String op, AtribExp left, AtribExp right, boolean isConst) {
        this.type = type;
        this.op = op;
        this.left = left;
        this.right = right;
        this.isConst = isConst;
        this.isLiteral = false;
        this.value = null;
    }

    // Evauluar expresiones en tiempo de compilación
    public boolean evaluate() throws RuntimeException {
        /*
        if (isConstant) {
            return Boolean.parseBoolean(value);
        }
        if (op.equals("&&")) {
            return left.evaluate() && right.evaluate();
        } else if (op.equals("||")) {
            return left.evaluate() || right.evaluate();
        }
        throw new RuntimeException("Unknown operator: " + op);
        */

        switch (this.op) {
            case ("&")
        }
    }
}
