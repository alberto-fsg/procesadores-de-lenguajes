
package lib.symbolTable;

public class AtribTipo {
    public boolean isArray;
    public Symbol.Types type;
    public int size;

    /** Constructor para tipo primitivo */
    public AtribTipo(Symbol.Types _type) {
        isArray = false;
        type = _type;
    }

    /** Constructor para array */
    public AtribTipo(Symbol.Types _type, int _size) {
        isArray = true;
        type = _type;
        size = _size;
    }
}