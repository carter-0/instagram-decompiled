package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class QKY extends SUF {
    public RId A00;
    public String A01 = AnonymousClass1QI.A00.A02.A00;
    public String A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QKY(Context context, UserSession userSession, String str) {
        super(str);
        RId rId;
        0qQ.A0B(userSession, 2);
        this.A03 = userSession;
        if (context == null) {
            rId = null;
        } else if (AnonymousClass3HA.A00(context)) {
            rId = RId.DARK;
        } else {
            rId = RId.LIGHT;
        }
        this.A00 = rId;
        this.A02 = C60510iO.A00(userSession).BcO();
    }

    public static void A00(0Aj r3, 0bb r4, SUF suf, String str, String str2) {
        QKY qky = (QKY) suf;
        r4.A01(qky.A00, "ui_mode");
        r4.A06("navigation_chain", qky.A01);
        r4.A06("external_session_id", SUF.A05(suf, str));
        r4.A05("ad_id", 00y.A0n(10, str2));
        r3.AAK(r4, "custom_fields");
    }

    public static void A01(0bb r2, QKY qky) {
        r2.A01(qky.A00, "ui_mode");
    }

    public final void A0G(Integer num, String str, String str2, long j) {
        1Ln A0U;
        0bb r4;
        int intValue = num.intValue();
        if (intValue == 1) {
            A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A0C(), "client_create_fbpaycheckout_init"), 29);
            if (DbT.A1Y(A0U)) {
                A0U.A0v(str2);
                Pxk.A0U(2M7.A0G, A0U);
                0bb r0 = new 0bb();
                Pxe.A1T(r0, "lite_checkout");
                Pxg.A1J(A0U, r0, "lite_checkout");
                r4 = new 0bb();
                A01(r4, this);
                r4.A06("checkout_flow", "checkout_init");
            } else {
                return;
            }
        } else if (intValue == 0) {
            A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A0C(), "client_load_loading_init"), 79);
            if (DbT.A1Y(A0U)) {
                A0U.A0v(str2);
                Pxk.A0U(2M7.A0G, A0U);
                0bb r02 = new 0bb();
                Pxe.A1T(r02, "lite_checkout");
                Pxg.A1J(A0U, r02, "lite_checkout");
                r4 = new 0bb();
                r4.A06("checkout_flow", "checkout_init");
                A01(r4, this);
            } else {
                return;
            }
        } else if (intValue == 2) {
            A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A0C(), "user_click_fbpaycheckout_cancel"), 401);
            if (DbT.A1Y(A0U)) {
                A0U.A0v(str2);
                Pxk.A0U(2M7.A0G, A0U);
                0bb r03 = new 0bb();
                Pxe.A1T(r03, "lite_checkout");
                Pxg.A1J(A0U, r03, "lite_checkout");
                r4 = new 0bb();
                r4.A06("checkout_flow", "checkout_init");
                A01(r4, this);
            } else {
                return;
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r4.A06("navigation_chain", this.A01);
        r4.A06("external_session_id", this.A02);
        r4.A05("ad_id", Long.valueOf(j));
        r4.A06("click_source", "");
        r4.A06("iaw_session_id", str);
        A0U.A0N(r4, "custom_fields");
        A0U.Cgf();
    }
}
