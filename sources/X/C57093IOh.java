package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.IOh  reason: case insensitive filesystem */
public final class C57093IOh implements AnonymousClass0lh {
    public String A00;
    public List A01;
    public final UserSession A02;
    public final I0v A03;
    public final String A04;
    public final C262224Cq A05;

    public C57093IOh(AnonymousClass12V r3, UserSession userSession, String str, String str2, List list) {
        0qQ.A0B(r3, 5);
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = list;
        this.A00 = str2;
        this.A05 = 19E.A02(r3.CO6(594001069, 3));
        this.A03 = new I0v(userSession);
    }

    public final void onSessionWillEnd() {
        19E.A05((CancellationException) null, this.A05);
    }
}
