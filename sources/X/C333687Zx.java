package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7Zx  reason: invalid class name and case insensitive filesystem */
public final class C333687Zx implements AnonymousClass0lh {
    public ContentFilterEngineImpl A00;
    public AnonymousClass1p0 A01;
    public boolean A02;
    public final UserSession A03;
    public final C333697Zy A04;
    public final Set A05 = new LinkedHashSet();
    public final C262224Cq A06;
    public final 0nV A07;

    public C333687Zx(AnonymousClass12V r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A03 = userSession;
        this.A04 = new C333697Zy(userSession, AnonymousClass92I.A07, this);
        0nV AOJ = r3.AOJ(967036599, 3);
        this.A07 = AOJ;
        this.A06 = 19E.A02(AOJ);
    }

    public final void onSessionWillEnd() {
        this.A02 = false;
        this.A05.clear();
        AnonymousClass1p0 r1 = this.A01;
        if (r1 != null) {
            r1.A02(this.A04);
        }
    }
}
