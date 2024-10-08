package X;

/* renamed from: X.VAv  reason: case insensitive filesystem */
public abstract class C16918VAv {
    public static final float A00(C276544tV r3, int i) {
        String A0K = r3.A0K(i);
        if (A0K == null) {
            return 0.0f;
        }
        try {
            return AnonymousClass6Su.A01(A0K);
        } catch (C258053yO unused) {
            1Kn.A02("BloksModelUtils", 002.A0R("Error parsing pixel value ", A0K));
            return 0.0f;
        }
    }
}
