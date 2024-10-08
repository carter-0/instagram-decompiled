package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOF implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C314466iJ A04;
    public final /* synthetic */ 2Er A05;

    public FOF(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C314466iJ r5, 2Er r6) {
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = view;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1987420026);
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        View view2 = this.A00;
        2Er r6 = this.A05;
        C314466iJ r5 = this.A04;
        AnonymousClass0iw r9 = this.A02;
        r5.CLU();
        C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
        dg1.A01(2131960554);
        dg1.A02(new FOQ(2, r5, r6, userSession, view2, r9, fragmentActivity), 2131960552);
        dg1.A02(new FOQ(3, r5, r6, userSession, view2, r9, fragmentActivity), 2131960553);
        new C49945FFy(dg1).A03(fragmentActivity);
        C48803EkR.A00(r9, userSession, "thread_armadillo_biz_tools_upsell_banner_dismiss_button_click", r6.C6C());
        AnonymousClass0fD.A0C(-1871268184, A052);
    }
}
