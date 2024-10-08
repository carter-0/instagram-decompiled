package X;

public abstract class OPx {
    public static final boolean A00(int i) {
        return i == 2 || i == 8 || i == 11 || i == 16;
    }

    public static final boolean A01(OMF omf) {
        return A00(omf.A00.mResultSet.getInteger(0, 17));
    }
}
