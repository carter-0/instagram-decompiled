package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class W99 implements View.OnClickListener {
    public final /* synthetic */ C19201WPh A00;

    public W99(C19201WPh wPh) {
        this.A00 = wPh;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2147347100);
        C19201WPh wPh = this.A00;
        C255773uh r8 = wPh.A0F;
        Activity activity = wPh.A04;
        UserSession userSession = wPh.A0B;
        W2A.A01(activity, wPh.A01, wPh.A07, wPh.A08, userSession, r8);
        wPh.A01 = null;
        AnonymousClass0fD.A0C(-978765692, A05);
    }
}
