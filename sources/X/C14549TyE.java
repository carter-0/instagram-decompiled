package X;

/* renamed from: X.TyE  reason: case insensitive filesystem */
public abstract class C14549TyE {
    public static final int A00(String str, int i) {
        if (str == null) {
            return C308216Te.A01(Integer.MAX_VALUE, i);
        }
        try {
            return C308216Te.A01((int) AnonymousClass6Su.A01(str), i);
        } catch (C258053yO e) {
            int A01 = C308216Te.A01(Integer.MAX_VALUE, i);
            1Kn.A03("IgIconBinderUtils", e);
            return A01;
        }
    }
}
