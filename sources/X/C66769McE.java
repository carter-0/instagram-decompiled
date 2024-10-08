package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* renamed from: X.McE  reason: case insensitive filesystem */
public final class C66769McE extends C392289uY {
    public DirectThreadAnalyticsParams A00;
    public String A01;
    public boolean A02;
    public ViewStub A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final C66748Mbt A06;
    public final AnonymousClass91K A07 = new C370498wZ(this);

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        this.A03 = new ViewStub(context);
        C69017Nct nct = new C69017Nct();
        nct.A07 = context.getString(2131973107);
        nct.A03 = Float.valueOf(context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
        nct.A04 = context.getString(2131973106);
        nct.A05 = context.getString(2131968772);
        nct.A01 = 0;
        nct.A06 = context.getString(2131953611);
        nct.A02 = 2;
        nct.A00 = 0;
        nct.A08 = true;
        ViewStub viewStub = this.A03;
        if (viewStub != null) {
            OSO.A00(viewStub, this.A07, nct);
            ViewStub viewStub2 = this.A03;
            if (viewStub2 != null) {
                return viewStub2;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        String C6C;
        0qQ.A0B(puH, 1);
        if (!(r7 == null || (C6C = r7.C6C()) == null)) {
            this.A01 = C6C;
            C66748Mbt mbt = this.A06;
            if (C66748Mbt.A01(mbt, C6C) == AnonymousClass05K.A0C) {
                UserSession userSession = this.A05;
                if (C66797Mcj.A00(userSession)) {
                    String str = this.A01;
                    if (str != null) {
                        String A022 = mbt.A02(str);
                        if (A022.length() > 0) {
                            2Dm A002 = 2L2.A00(userSession);
                            String str2 = this.A01;
                            if (str2 != null) {
                                C254703su BRz = A002.BRz(C66581MXm.A0e(str2), A022);
                                if (BRz != null) {
                                    boolean z2 = !BRz.A1c();
                                    this.A02 = z2;
                                    if (z2) {
                                        this.A00 = C3263376i.A01(r7, BRz.A2G);
                                    }
                                }
                            }
                        }
                        puH.DoM(this);
                        return;
                    }
                    0qQ.A0F("threadId");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        puH.onFailure();
    }

    public static final void A00(C66769McE mcE) {
        C74324Pt0 pt0 = mcE.A00;
        if (pt0 != null) {
            pt0.onDismiss();
        }
        AnonymousClass7TH.A0R(mcE.A03);
    }

    public final void A04(boolean z) {
        AnonymousClass7TF.A16(this.A03);
        C66748Mbt mbt = this.A06;
        String str = this.A01;
        if (str == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        mbt.A00.A0z(002.A0R("on_device_nudity_banner_state/sender/", str), 4);
        if (this.A02) {
            C71137Odf.A07(C69459Nm3.SENDER, this.A05, this.A00);
        }
    }

    public final boolean A05() {
        ViewStub viewStub = this.A03;
        if (viewStub == null || viewStub.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public C66769McE(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A04 = fragmentActivity;
        this.A05 = userSession;
        this.A06 = new C66748Mbt(userSession);
    }
}
