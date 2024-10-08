package X;

/* renamed from: X.9Fb  reason: invalid class name and case insensitive filesystem */
public abstract class C375789Fb {
    public static C375799Fc A00;

    public static final C375799Fc A00() {
        C375799Fc r0 = A00;
        if (r0 != null) {
            return r0;
        }
        try {
            C375799Fc r02 = new C375799Fc();
            A00 = r02;
            return r02;
        } catch (Exception e) {
            0wc A002 = new AnonymousClass0kM(C61170le.A00).A00();
            0Aj A003 = A002.A00(A002.A00, "android_on_device_install_referrer_logging");
            if (A003.isSampled()) {
                A003.AAJ("action", "create new storage exception");
                A003.AAJ("asset_id", "");
                A003.A9F("activity_type", -1L);
                A003.AAJ("error", e.getMessage());
                A003.Cgf();
            }
            return null;
        }
    }
}
