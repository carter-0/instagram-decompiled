package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class OF6 {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final List A03;

    public OF6(UserSession userSession) {
        C67237MkX mkX;
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        A1C.add(C67237MkX.A06);
        if (2El.A0F(userSession)) {
            if (2El.A0J(userSession)) {
                mkX = C67237MkX.A03;
            } else {
                mkX = C67237MkX.A04;
            }
            A1C.add(mkX);
        }
        if (2El.A0K(userSession)) {
            A1C.add(C67237MkX.A05);
        }
        if (2El.A0L(userSession)) {
            A1C.add(C67237MkX.A07);
        }
    }
}
