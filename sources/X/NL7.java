package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class NL7 extends 2Ru {
    public final NLK A00;
    public final C39695A5l A01 = new Object();
    public final C336947fR A02;
    public final NLN A03;
    public final C66971Mg4 A04;
    public final C47598E9k A05;
    public final ArrayList A06;
    public final UserSession A07;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.A5l] */
    public NL7(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A07 = userSession;
        NLK nlk = new NLK(context);
        this.A00 = nlk;
        C336947fR r4 = new C336947fR(context);
        this.A02 = r4;
        NLN nln = new NLN(context);
        this.A03 = nln;
        C66971Mg4 mg4 = new C66971Mg4(context);
        this.A04 = mg4;
        C47598E9k e9k = new C47598E9k(context);
        this.A05 = e9k;
        this.A06 = AnonymousClass7TE.A1C();
        init(new C231642s0[]{nlk, r4, nln, mg4, e9k});
    }
}
