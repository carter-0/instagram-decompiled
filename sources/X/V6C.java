package X;

public abstract class V6C {
    public static final int A00(String str, int i) {
        float f;
        if (str == null) {
            return i;
        }
        try {
            if (str.endsWith("%")) {
                f = (((float) AnonymousClass7TF.A0E(C64361Kj.A00().A00).heightPixels) * AnonymousClass6Su.A00(str)) / 100.0f;
            } else {
                f = AnonymousClass6Su.A01(str);
            }
            return (int) f;
        } catch (C258053yO unused) {
            return i;
        }
    }
}
