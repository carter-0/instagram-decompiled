package X;

public abstract class TA9 implements Comparable {
    public final int A02() {
        if (this instanceof C8471QvG) {
            return 3;
        }
        if (this instanceof C8473QvI) {
            return 5;
        }
        if (this instanceof C8474QvJ) {
            int i = 32;
            if (((C8474QvJ) this).A00 >= 0) {
                i = 0;
            }
            return (i >> 5) & 7;
        } else if (this instanceof C8470QvF) {
            return 2;
        } else {
            if (this instanceof C8469QvE) {
                return 7;
            }
            return 4;
        }
    }

    public final int A03() {
        if (this instanceof C8473QvI) {
            return ((C8473QvI) this).A00;
        }
        if (this instanceof C8472QvH) {
            return ((C8472QvH) this).A00;
        }
        return 0;
    }

    public static final TA9 A01(TA9 ta9, Class cls) {
        if (cls.isInstance(ta9)) {
            return (TA9) cls.cast(ta9);
        }
        throw new Exception(002.A0u("Expected a ", cls.getName(), " value, but got ", C66581MXm.A0y(ta9)));
    }
}
