package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class FNN implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1ps A02;

    public FNN(Context context, UserSession userSession, 1ps r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-796795784);
        UserSession userSession = this.A01;
        Context context = this.A00;
        C46649DiU diU = new C46649DiU(AnonymousClass7TE.A1E(), AnonymousClass7TE.A1E(), "com.bloks.www.ig.gen_ai_agent.profile.education");
        C49672F1e f1e = new C49672F1e(userSession);
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.FLEXIBLE_SHEET;
        f1e.A00(fFt.A03());
        diU.A0F(context, f1e.A00);
        AnonymousClass0fD.A0C(1205756285, A05);
    }
}
