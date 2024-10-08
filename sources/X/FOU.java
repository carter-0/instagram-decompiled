package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOU implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C314466iJ A05;
    public final /* synthetic */ 2Er A06;

    public FOU(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C314466iJ r5, 2Er r6, int i) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = view;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1120123500);
        UserSession userSession = this.A04;
        View view2 = this.A01;
        2Er r3 = this.A06;
        C314466iJ r0 = this.A05;
        AnonymousClass0iw r2 = this.A03;
        OPL.A01(view2, r0);
        AnonymousClass4k9.A00(userSession).A03(this.A00);
        C48805EkT.A00(r2, userSession, "thread_ctd_upsell_first_banner_no_click", r3.C6C());
        AnonymousClass0fD.A0C(-2052046913, A052);
    }
}
