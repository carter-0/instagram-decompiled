package X;

public abstract class V5D {
    public static float A00(C307786Rm r5, String str, String str2) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return AnonymousClass6Su.A01(str);
        } catch (C258053yO e) {
            1Kn.A00(r5, C273654mx.A00(1199), String.format("Error parsing %s: %s", new Object[]{str2, str}), e);
            return 0.0f;
        }
    }
}
