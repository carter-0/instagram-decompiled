package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjS  reason: case insensitive filesystem */
public final class C71369OjS implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C314466iJ A05;
    public final /* synthetic */ 2Er A06;

    public C71369OjS(Context context, View view, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C314466iJ r6, 2Er r7) {
        this.A00 = context;
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = view;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-806305324);
        Context context = this.A00;
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A02;
        View view2 = this.A01;
        2Er r9 = this.A06;
        C314466iJ r8 = this.A05;
        AnonymousClass0iw r6 = this.A03;
        OPL.A00(context, view2, fragmentActivity, r6, userSession, r8, r9, false);
        C48805EkT.A00(r6, userSession, "thread_ctd_upsell_first_banner_yes_click", r9.C6C());
        AnonymousClass0fD.A0C(2010531594, A052);
    }
}
