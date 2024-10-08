package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AOP implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C334347b7 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C317966o8 A03;
    public final /* synthetic */ C249763kK A04;
    public final /* synthetic */ AnonymousClass0eM A05;

    public AOP(FragmentActivity fragmentActivity, C334347b7 r2, UserSession userSession, C317966o8 r4, C249763kK r5, AnonymousClass0eM r6) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-987625725);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        String A0f = AnonymousClass7TF.A0f(this.A01.A0B);
        String sessionId = this.A04.getSessionId();
        this.A05.getValue();
        C334337b6.A05(fragmentActivity, userSession, this.A03, A0f, sessionId, true);
        AnonymousClass0fD.A0C(195187165, A052);
    }
}
