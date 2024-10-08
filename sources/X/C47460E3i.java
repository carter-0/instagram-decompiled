package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.E3i  reason: case insensitive filesystem */
public final class C47460E3i extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ConnectFBPayFragment";
    public UserSession A00;
    public boolean A01;

    public final String getModuleName() {
        return Pxd.A00(147);
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String A002;
        int A02 = AnonymousClass0fD.A02(215757139);
        C47460E3i.super.onCreate(bundle);
        08y r1 = 09i.A0A;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            UserSession A06 = r1.A06(bundle2);
            this.A00 = A06;
            F5u.A01(A06, true);
            UserSession userSession = this.A00;
            0qQ.A0A(userSession);
            C229382nI A0N = DbT.A0N(requireActivity(), new FU4(), userSession);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null) {
                    FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) C320236s2.A00(bundle3, FBPayLoggerData.class, C273654mx.A00(805));
                    C269474fB r6 = C269474fB.A00;
                    C268194cw r7 = new C268194cw(r6);
                    r7.A0E("product_type", "FBPAY_HUB");
                    if (fBPayLoggerData == null || (A002 = fBPayLoggerData.A00()) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    r7.A0E(Py2.A00(), A002);
                    C268194cw r5 = new C268194cw(r6);
                    r5.A0B(r7, "fbpay_params");
                    r5.A0E("redirect_service", "fb_pay");
                    r5.A0E("entrypoint", "fb_pay_hub");
                    r5.A0E("transition_style", "fade");
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        r5.A0C("cds_client_value", F5u.A00(userSession3));
                        C360678ey A05 = C359988do.A05(userSession2, "com.bloks.www.fxcal.settings.async", DbZ.A0r(r5, r6));
                        E86.A01(A05, A0N, this, 2);
                        schedule(A05);
                        AnonymousClass0fD.A09(841971371, A02);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1126778055;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -141097780;
        }
        AnonymousClass0fD.A09(i, A02);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1872474354);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.hub_spinner, viewGroup, false);
        AnonymousClass0fD.A09(1257517495, A02);
        return inflate;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(182944707);
        super.onResume();
        if (this.A01) {
            DbT.A1I(this);
        }
        AnonymousClass0fD.A09(-1674325653, A02);
    }
}
