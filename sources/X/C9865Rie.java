package X;

/* renamed from: X.Rie  reason: case insensitive filesystem */
public abstract class C9865Rie {
    public static final void A00(0lg r5, String str, String str2, String str3) {
        String A0o = Pxg.A0o(r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "instagram_android_install_with_referrer");
        if (str2 != null) {
            A0e.AAJ("error", str2);
        }
        if (A0o != null) {
            A0e.AAJ("pigeon_session_id", A0o);
        }
        A0e.AAJ("family_device_id", str3);
        A0e.AAJ("waterfall_id", 1Q0.A01());
        A0e.AAJ("containermodule", "install_referrer");
        A0e.AAJ("referrer", str);
        A0e.Cgf();
    }
}
