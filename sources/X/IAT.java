package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class IAT implements View.OnClickListener {
    public final /* synthetic */ C314186hn A00;

    public IAT(C314186hn r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1825079812);
        C314186hn r3 = this.A00;
        C314166hl r6 = r3.A0a;
        C255773uh r7 = r3.A0B;
        Integer num = AnonymousClass05K.A01;
        r6.A00(r7, num, "unknown", r3.A01, r3.A0J);
        UserSession userSession = r3.A0W;
        if (182.A06(0Tu.A05, userSession, 36325489065014256L)) {
            r6.A00(r3.A0B, num, "unknown", r3.A01, r3.A0J);
            Context context = r3.A0T;
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            new BitSet(0);
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A03 = new C54187H2h(r3, 1);
            C46649DiU A06 = C46649DiU.A06(AnonymousClass000.A00(1186), C359608dC.A01(A1E), A1E2);
            C46649DiU.A0B(A06, -1);
            A06.A03 = null;
            A06.A02 = null;
            A06.A04 = null;
            A06.A0H(A1E3);
            A06.A0E(context, A0N);
            r3.A0d.invoke();
        }
        AnonymousClass0fD.A0C(150828994, A05);
    }
}
