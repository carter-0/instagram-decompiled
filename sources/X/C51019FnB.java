package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FnB  reason: case insensitive filesystem */
public final class C51019FnB implements G7O {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C51017Fn9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C51019FnB(FragmentActivity fragmentActivity, UserSession userSession, C51017Fn9 fn9, String str, String str2) {
        this.A02 = fn9;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void DwC() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            C358248ab A0Y = DbS.A0Y(fragmentActivity);
            A0Y.A09(2131974239);
            A0Y.A08(2131974238);
            A0Y.A0E(C50021FJg.A00(this, 39));
            Dba.A1M(A0Y);
            C49968FHb.A00(A0Y, this, 10);
            DbT.A1V(A0Y);
        }
    }

    public final void DwD(C3727892k r6) {
        C298935uH r0 = r6.A02;
        if (r0 == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        User CCd = r0.CCd();
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            CCd.getClass();
            if (CCd.A0B() != SellerShoppableFeedType.A06) {
                C51017Fn9.A01(fragmentActivity, this.A01, this.A02, CCd, this.A03);
            } else {
                UserSession userSession = this.A01;
                C46474Dfc.A02(Dba.A0B(fragmentActivity, userSession), userSession, C46447Df9.A02(), C46548Dgp.A02(userSession, this.A04, "deep_link", "shop_url"));
                C358248ab A0Y = DbS.A0Y(fragmentActivity);
                A0Y.A09(2131974239);
                A0Y.A08(2131974238);
                A0Y.A06();
                AnonymousClass7TH.A0a(A0Y, true);
            }
            ((BaseFragmentActivity) fragmentActivity).A0a();
        }
    }
}
