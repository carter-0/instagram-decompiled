package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;

/* renamed from: X.PnW  reason: case insensitive filesystem */
public final class C74005PnW extends 0Yg implements 0sP {
    public static final C74005PnW A00 = new C74005PnW();

    public C74005PnW() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(C51970G9q.A1T((AnonymousClass7TE.A0R(obj) > (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 1 : (AnonymousClass7TE.A0R(obj) == (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 0 : -1))));
    }
}
