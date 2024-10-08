package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOE implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C314466iJ A04;
    public final /* synthetic */ 2Er A05;

    public FOE(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C314466iJ r5, 2Er r6) {
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = view;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1543336915);
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        View view2 = this.A00;
        2Er r1 = this.A05;
        C314466iJ r0 = this.A04;
        AnonymousClass0iw r2 = this.A02;
        C48825Ekn.A00(view2, r0);
        r0.CLU();
        new FGW(fragmentActivity, r2, userSession).A05();
        C48803EkR.A00(r2, userSession, "thread_armadillo_biz_tools_upsell_banner_cta_click", r1.C6C());
        AnonymousClass0fD.A0C(1940373070, A052);
    }
}
