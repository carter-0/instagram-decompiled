package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mc2  reason: case insensitive filesystem */
public final class C66757Mc2 extends C392289uY implements G76 {
    public C70445O6w A00;
    public AnonymousClass2Ep A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final AnonymousClass4kA A04;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C70445O6w o6w = new C70445O6w(context, this);
        this.A00 = o6w;
        return o6w.A00;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r5, boolean z) {
        0qQ.A0B(puH, 1);
        this.A01 = r5;
        if (r5 == null || !C371168xj.A00(this.A03, r5, this.A04)) {
            puH.onFailure();
        } else {
            puH.DoM(this);
        }
    }

    public final void A04(boolean z) {
        AnonymousClass2Ep r1 = this.A01;
        if (r1 != null) {
            C313756gx A002 = C313746gw.A00(this.A03);
            int AdN = r1.AdN();
            String C6C = r1.C6C();
            String C6k = r1.C6k();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                C66581MXm.A1I(A0J, "view_comment_upsell_nux");
                A0J.A0p(C273654mx.A00(2188));
                A0J.A0i(DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
                A0J.Cgf();
            }
        }
    }

    public final void onActionClicked() {
        String str;
        String C6C;
        AnonymousClass2Ep r0 = this.A01;
        if (!(r0 == null || (C6C = r0.C6C()) == null)) {
            UserSession userSession = this.A03;
            Dba.A12(C69939Nuf.A00(userSession, C66580MXl.A0g(C6C), "upsell_banner"), DbS.A0M(this.A02, userSession));
        }
        C70445O6w o6w = this.A00;
        if (o6w != null) {
            o6w.A00.setVisibility(8);
        }
        AnonymousClass2Ep r5 = this.A01;
        if (r5 != null) {
            C313746gw.A00(this.A03).A0O(Integer.valueOf(r5.AdN()), r5.C6C(), r5.C6k(), true);
        }
        AnonymousClass4kA r1 = this.A04;
        AnonymousClass2Ep r02 = this.A01;
        if (r02 == null || (str = r02.C6C()) == null) {
            str = "";
        }
        r1.A05(str);
    }

    public final void onBannerDismissed() {
        String str;
        AnonymousClass2Ep r1 = this.A01;
        if (r1 != null) {
            C313746gw.A00(this.A03).A0O(Integer.valueOf(r1.AdN()), r1.C6C(), r1.C6k(), false);
        }
        AnonymousClass4kA r12 = this.A04;
        AnonymousClass2Ep r0 = this.A01;
        if (r0 == null || (str = r0.C6C()) == null) {
            str = "";
        }
        r12.A05(str);
    }

    public C66757Mc2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = AnonymousClass4k9.A00(userSession);
    }
}
