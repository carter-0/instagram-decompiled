package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class W8P implements View.OnClickListener {
    public final /* synthetic */ C306146Ky A00;

    public W8P(C306146Ky r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(871314523);
        C306146Ky r3 = this.A00;
        C306146Ky.A00(r3).A0F(C16678UzE.CREATE_AUDIENCE, "location");
        FragmentActivity requireActivity = r3.requireActivity();
        AnonymousClass0eM r1 = r3.A0S;
        C309516Yo A0N = DbX.A0N(requireActivity, r1);
        C322576w3.A00().A02();
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        0qQ.A0B(A0l, 0);
        UZP uzp = new UZP();
        DbZ.A1B(uzp, "IgSessionManager.SESSION_TOKEN_KEY", A0l.A05);
        A0N.A0D(uzp);
        A0N.A04();
        AnonymousClass0fD.A0C(382162401, A05);
    }
}
