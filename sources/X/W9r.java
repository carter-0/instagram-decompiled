package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class W9r implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C317286n1 A02;

    public W9r(AnonymousClass0iw r1, UserSession userSession, C317286n1 r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-464601589);
        this.A02.DpL();
        UserSession userSession = this.A01;
        AnonymousClass0iw r4 = this.A00;
        new C230012om(r4, userSession).A0A(new AnonymousClass6KN(new AnonymousClass6KM(C273654mx.A00(978), "", r4.getModuleName())));
        AnonymousClass0fD.A0C(-1093618772, A05);
    }
}
