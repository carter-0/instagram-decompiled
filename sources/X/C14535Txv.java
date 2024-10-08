package X;

/* renamed from: X.Txv  reason: case insensitive filesystem */
public abstract class C14535Txv {
    public static final int A00(C276544tV r2) {
        String A0G = r2.A0G();
        if (A0G == null || A0G.equals("column")) {
            return 1;
        }
        if (A0G.equals("row")) {
            return 0;
        }
        throw AnonymousClass7TF.A0W("Unknown direction ", A0G);
    }
}
