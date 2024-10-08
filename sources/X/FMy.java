package X;

import android.app.Activity;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final /* synthetic */ class FMy implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass74j A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ FMy(AnonymousClass74j r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(View view) {
        AnonymousClass74j r9 = this.A00;
        String str = this.A01;
        Activity activity = r9.A05;
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A1E3 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(1);
        boolean A1Z = Dba.A1Z("profile_id", str, A1E, A0w);
        UserSession userSession = r9.A07;
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        if (A0w.nextClearBit(A1Z ? 1 : 0) >= 1) {
            C46649DiU diU = new C46649DiU(C359608dC.A01(A1E), A1E2, "com.bloks.www.nme.ig_profile.verified_label_bottom_sheet");
            C46649DiU.A0B(diU, 719983200);
            diU.A03 = null;
            diU.A02 = null;
            diU.A04 = null;
            diU.A0H(A1E3);
            diU.A0E(activity, A0N);
            F7A.A00(r9.A06, userSession, AnonymousClass000.A00(3294), str);
            return;
        }
        throw DbU.A0i();
    }
}
