package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOT implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C314466iJ A05;
    public final /* synthetic */ 2Er A06;

    public FOT(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C314466iJ r5, 2Er r6, int i) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = view;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(129512772);
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A02;
        View view2 = this.A01;
        2Er r6 = this.A06;
        C314466iJ r8 = this.A05;
        AnonymousClass0iw r4 = this.A03;
        int i = this.A00;
        r8.CLU();
        C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
        dg1.A01(2131960554);
        dg1.A02(new FOQ(4, r8, r6, userSession, view2, r4, fragmentActivity), 2131960552);
        dg1.A02(new C50108FOy((Object) r4, (Object) view2, (Object) r6, (Object) fragmentActivity, (Object) r8, (Object) userSession, i, 0), 2131960553);
        new C49945FFy(dg1).A03(fragmentActivity);
        AnonymousClass4k9.A00(userSession).A03(i);
        String C6C = r6.C6C();
        if (i == 1) {
            str = "thread_ctd_upsell_single_create_messaging_ads_banner_dismiss_button_click";
        } else {
            str = "thread_ctd_upsell_first_banner_dismiss_button_click";
        }
        C48805EkT.A00(r4, userSession, str, C6C);
        AnonymousClass0fD.A0C(-1931905577, A052);
    }
}
