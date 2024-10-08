package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Mc8  reason: case insensitive filesystem */
public final class C66763Mc8 extends C392289uY implements G76 {
    public C70673OFu A00;
    public AnonymousClass2Ep A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C370818x7 A04;
    public final int A05;
    public final Capabilities A06;
    public final AnonymousClass7SD A07;

    public final View A06(Context context) {
        String str;
        0qQ.A0B(context, 0);
        C70673OFu oFu = new C70673OFu(context, this.A04, this, AnonymousClass48N.A09(this.A01));
        this.A00 = oFu;
        String str2 = oFu.A04;
        if (str2 != null) {
            str = oFu.A02.A00(str2);
        } else {
            str = "";
        }
        IgdsBanner igdsBanner = new IgdsBanner(oFu.A01, (AttributeSet) null, 0);
        DbT.A1U(igdsBanner, str, false);
        Context context2 = igdsBanner.getContext();
        DbT.A16(context2, igdsBanner, 2Yu.A0C(context2));
        igdsBanner.setAction((CharSequence) context2.getString(2131952506));
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = oFu.A03;
        oFu.A00 = igdsBanner;
        return igdsBanner;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        String A09;
        0qQ.A0B(puH, 1);
        if (DcS.A00(this.A03, false) && r7 != null && !r7.CUG() && (A09 = AnonymousClass48N.A09(r7)) != null) {
            C370818x7 r2 = this.A04;
            if (r2.A01(A09).length() > 0) {
                String A092 = AnonymousClass48N.A09(r7);
                if (A092 == null || !r2.A05(A092)) {
                    this.A01 = r7;
                    puH.DoM(this);
                    return;
                }
                String A093 = AnonymousClass48N.A09(r7);
                if (A093 != null) {
                    r2.A02(this.A02, A093, false);
                }
            }
        }
        puH.onFailure();
    }

    public final void A04(boolean z) {
        C370818x7.A03 = new C73657PhW(this, 22);
        String A09 = AnonymousClass48N.A09(this.A01);
        if (A09 != null) {
            String A012 = this.A04.A01(A09);
            if (A012.length() != 0) {
                UserSession userSession = this.A03;
                C69864NtS.A00(userSession).A01(userSession.A06, A012);
            }
        }
    }

    public final boolean A05() {
        IgdsBanner igdsBanner;
        C70673OFu oFu = this.A00;
        if (oFu == null || (igdsBanner = oFu.A00) == null || igdsBanner.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void onActionClicked() {
        String C6C;
        AnonymousClass2Ep r0 = this.A01;
        if (r0 != null && (C6C = r0.C6C()) != null) {
            C254763t0 A0g = C66580MXl.A0g(C6C);
            UserSession userSession = this.A03;
            AnonymousClass7SD r1 = this.A07;
            DbY.A1S(userSession, r1);
            NJm A002 = C69944Nuk.A00(userSession, this.A06, A0g, this.A05, C308556Us.A0C(userSession, r1, true));
            String A09 = AnonymousClass48N.A09(this.A01);
            if (A09 != null) {
                this.A04.A03(A09);
                C370818x7.A03 = null;
            }
            Dba.A12(A002, DbS.A0M(this.A02, userSession));
        }
    }

    public final void onBannerDismissed() {
        String A09 = AnonymousClass48N.A09(this.A01);
        if (A09 != null) {
            this.A04.A03(A09);
            C370818x7.A03 = null;
        }
    }

    public C66763Mc8(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, AnonymousClass7SD r5, int i) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A06 = capabilities;
        this.A07 = r5;
        this.A05 = i;
        this.A04 = new C370818x7(userSession);
    }
}
