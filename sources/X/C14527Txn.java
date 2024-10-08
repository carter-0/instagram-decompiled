package X;

/* renamed from: X.Txn  reason: case insensitive filesystem */
public abstract class C14527Txn {
    public static final int A00(C14515Txb txb) {
        int i = 0;
        if (txb != null) {
            for (C14517Txd txd : txb.A01) {
                String str = txd.A01;
                if (str != null) {
                    i += str.length();
                }
            }
        }
        return i;
    }
}
