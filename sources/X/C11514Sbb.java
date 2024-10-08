package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.Sbb  reason: case insensitive filesystem */
public final class C11514Sbb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C11514Sbb(Context context, View view, UserSession userSession, String str, String str2) {
        this.A01 = view;
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onGlobalLayout() {
        String str;
        Long l;
        View view = this.A01;
        if (view.getViewTreeObserver().isAlive()) {
            QKY qky = new QKY(this.A00, this.A02, "LITE_CHECKOUT");
            String str2 = this.A04;
            String str3 = this.A03;
            if (182.A06(0Tu.A05, qky.A03, 36315992892313435L)) {
                str = "show_merchant_branding";
            } else {
                str = "hide_merchant_branding";
            }
            0Aj A0e = AnonymousClass7TE.A0e(qky.A0C(), "client_load_shopslitecheckouteligibility_display");
            if (A0e.isSampled()) {
                A0e.AAJ(Pxz.A00(9, 10, 87), "");
                Pxh.A18(2M7.A0G, A0e);
                0bb r1 = new 0bb();
                Pxe.A1T(r1, "shops_lite_iaw_disclaimer");
                Pxe.A1S(r1, str);
                Pxe.A1Q(A0e, r1);
                0bb r2 = new 0bb();
                r2.A06("checkout_flow", "checkout_init");
                QKY.A01(r2, qky);
                r2.A06("external_session_id", qky.A02);
                r2.A06("navigation_chain", qky.A01);
                if (str3 != null) {
                    l = DbV.A0q(str3);
                } else {
                    l = null;
                }
                r2.A05("ad_id", l);
                r2.A06("merchant_domain", "");
                r2.A06("tracking_codes", (String) null);
                r2.A06("iaw_session_id", str2);
                A0e.AAK(r2, "custom_fields");
                A0e.Cgf();
            }
            C51967G9n.A0y(view, this);
        }
    }
}
