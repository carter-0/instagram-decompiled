package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class FON implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ AnonymousClass3HX A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ C315656kI A05;

    public /* synthetic */ FON(Activity activity, C331157Pu r2, C255773uh r3, AnonymousClass3HX r4, AnonymousClass3BQ r5, C315656kI r6) {
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        C315656kI r1 = this.A05;
        C255773uh r0 = this.A02;
        AnonymousClass3BQ r6 = this.A04;
        C331157Pu r5 = this.A01;
        Activity activity = this.A00;
        AnonymousClass3HX r3 = this.A03;
        C14164Tr2 tr2 = C14164Tr2.A00;
        UserSession userSession = r1.A01;
        r0.A0k.getClass();
        0qQ.A0B(userSession, 0);
        AnonymousClass0kN.A01(tr2, userSession);
        0qQ.A07(AnonymousClass7TF.A0b());
        r5.A0L((C332277Ui) null);
        FCP.A01(activity, userSession, r3, r6);
    }
}
