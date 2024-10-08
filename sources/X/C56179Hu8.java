package X;

/* renamed from: X.Hu8  reason: case insensitive filesystem */
public abstract class C56179Hu8 {
    public static float A00(C276544tV r2, float f, int i) {
        return A01(r2.A0K(i), 0.0f, f);
    }

    public static final float A01(String str, float f, float f2) {
        if (str == null) {
            return f;
        }
        if (str.endsWith("%")) {
            return AnonymousClass6Su.A00(str) * 0.01f * f2;
        }
        return AnonymousClass6Su.A01(str);
    }
}
