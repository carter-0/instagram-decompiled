package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WXk  reason: case insensitive filesystem */
public final class C19393WXk implements G76 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C19393WXk(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onActionClicked() {
        SUL sul;
        String str;
        int i = this.A00;
        String str2 = this.A02;
        if (i != 0) {
            if (str2 != null) {
                C15320UaS uaS = (C15320UaS) this.A01;
                WGU wgu = uaS.A0B;
                if (wgu != null) {
                    wgu.A0F(C16678UzE.SUMMARY, "audience_validation_learn_more");
                }
                FragmentActivity requireActivity = uaS.requireActivity();
                UserSession userSession = uaS.A0H;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    sul = Dba.A0J(requireActivity, userSession, 2EG.A34, str2);
                    str = "promote_review";
                }
            } else {
                return;
            }
        } else if (str2 != null) {
            C15322UaU uaU = (C15322UaU) this.A01;
            WGU wgu2 = uaU.A03;
            if (wgu2 != null) {
                wgu2.A0F(C16678UzE.AUDIENCE_SELECTION, "audience_validation_learn_more");
            }
            sul = Dba.A0J(uaU.requireActivity(), AnonymousClass7TE.A0l(uaU.A0N), 2EG.A34, str2);
            str = "promote_audience";
        } else {
            return;
        }
        sul.A0S = str;
        sul.A0A();
    }

    public final void onBannerDismissed() {
        WGU wgu;
        C16678UzE uzE;
        if (this.A00 != 0) {
            wgu = ((C15320UaS) this.A01).A0B;
            if (wgu != null) {
                uzE = C16678UzE.SUMMARY;
            } else {
                return;
            }
        } else {
            wgu = ((C15322UaU) this.A01).A03;
            if (wgu != null) {
                uzE = C16678UzE.AUDIENCE_SELECTION;
            } else {
                return;
            }
        }
        wgu.A0F(uzE, "audience_validation_banner_close");
    }
}
