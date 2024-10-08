package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AOM implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C334347b7 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C249763kK A03;
    public final /* synthetic */ AnonymousClass0eM A04;

    public AOM(FragmentActivity fragmentActivity, C334347b7 r2, UserSession userSession, C249763kK r4, AnonymousClass0eM r5) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-190118087);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        String A0f = AnonymousClass7TF.A0f(this.A01.A0B);
        String sessionId = this.A03.getSessionId();
        this.A04.getValue();
        C334337b6.A05(fragmentActivity, userSession, (C317966o8) null, A0f, sessionId, false);
        AnonymousClass0fD.A0C(1190162038, A05);
    }
}
