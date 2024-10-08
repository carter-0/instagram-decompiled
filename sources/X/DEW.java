package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

public final class DEW implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ C307286Pn A04;
    public final /* synthetic */ String A05;

    public DEW(UserSession userSession, AnonymousClass4DU r2, C255773uh r3, C250973mM r4, C307286Pn r5, String str) {
        this.A05 = str;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(-2110042303);
        C307976Sf.A06.add(this.A05);
        IgdsButton igdsButton = this.A04.A03;
        if (igdsButton != null) {
            igdsButton.setEnabled(false);
            AnonymousClass3IB r3 = this.A03.A0H.A0I;
            if (r3 == null || (str = r3.A06) == null) {
                str = "";
            }
            C307976Sf.A01(this.A00, this.A01, r3, str);
            AnonymousClass0fD.A0C(-533594488, A052);
            return;
        }
        0qQ.A0F("submitButton");
        throw AnonymousClass00P.createAndThrow();
    }
}
