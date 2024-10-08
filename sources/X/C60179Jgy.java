package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.Jgy  reason: case insensitive filesystem */
public final class C60179Jgy extends 2YL {
    public List A00;
    public Set A01 = 0sl.A00;
    public final UserSession A02;
    public final C64972LlB A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public C60179Jgy(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        0sn r2 = 0sn.A00;
        this.A00 = r2;
        02z A10 = DbS.A10(new C61070Jw8(AnonymousClass05K.A0C, r2));
        this.A04 = A10;
        this.A05 = A10;
        this.A03 = new C64972LlB(userSession, new C65277LqW(this));
        0nY.A00().ATE(new KIW(this));
    }
}
