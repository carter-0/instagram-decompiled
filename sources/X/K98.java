package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class K98 extends C331047Ph {
    public final Context A00;
    public final C61485K9q A01;
    public final K9U A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Map A04 = AnonymousClass7TE.A1E();

    public K98(Context context, AnonymousClass0iw r13, UserSession userSession, C357638Yz r15, C314236hs r16) {
        this.A00 = context;
        C61485K9q k9q = new C61485K9q(context, r13, userSession, r15, r16, (String) null, false, false);
        this.A01 = k9q;
        K9U k9u = new K9U(context, (AnonymousClass8MM) null);
        this.A02 = k9u;
        A0B(k9u, k9q);
    }
}
