package X;

/* renamed from: X.4ew  reason: invalid class name and case insensitive filesystem */
public enum C269324ew {
    ANY,
    NATURAL,
    SCALAR,
    ARRAY,
    OBJECT,
    NUMBER,
    NUMBER_FLOAT,
    NUMBER_INT,
    STRING,
    BINARY;

    public final boolean A00() {
        if (this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT) {
            return true;
        }
        return false;
    }
}
