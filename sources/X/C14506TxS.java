package X;

/* renamed from: X.TxS  reason: case insensitive filesystem */
public abstract class C14506TxS {
    public static int A00(C276544tV r1) {
        String A0K = r1.A0K(42);
        if (A0K == null || A0K.equals("column")) {
            return 1;
        }
        if (A0K.equals("row")) {
            return 0;
        }
        throw new IllegalArgumentException(002.A0R("Unknown direction: ", A0K));
    }
}
