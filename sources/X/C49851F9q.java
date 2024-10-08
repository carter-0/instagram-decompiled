package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.F9q  reason: case insensitive filesystem */
public abstract class C49851F9q {
    public static final FFW A00 = new Object();
    public static final List A01 = 0sr.A1M(new String[]{"token", "password", "nonce", "sessionid", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE});

    public static final void A00(Intent intent, AnonymousClass0iw r7, AnonymousClass0wW r8, String str) {
        0qQ.A0B(r8, 0);
        AnonymousClass7TG.A1U(str, intent, r7);
        0wc A012 = AnonymousClass0kN.A01(r7, r8);
        String BcO = C60510iO.A00(r8).BcO();
        0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_url_loaded");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String stringExtra = intent.getStringExtra("EXTRA_REFERRER");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                A0e.AAJ("source_application", stringExtra);
            }
            String string = extras.getString("short_url");
            if (!(string == null || string.length() == 0)) {
                A0e.AAJ("short_url", FFW.A00(string));
            }
        }
        A0e.AAJ(AnonymousClass000.A00(5118), BcO);
        A0e.AAJ("url", FFW.A00(str));
        A0e.A7p("fb_installed", Boolean.valueOf(AnonymousClass1G3.A03()));
        DbW.A11(A0e);
        DbX.A1L(A0e);
    }
}
