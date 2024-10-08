package X;

/* renamed from: X.PnV  reason: case insensitive filesystem */
public final class C74004PnV extends 0Yg implements 0sP {
    public static final C74004PnV A00 = new C74004PnV();

    public C74004PnV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        try {
            0qQ.A0A(str);
            return DbV.A0q(C66580MXl.A0z(str, 27));
        } catch (NumberFormatException unused) {
            0KC.A0D("com.fbpay.w3c.security.SecurityProviderEphemeral", 002.A0R("Broken alias for the ephemeral key:", str));
            return null;
        }
    }
}
