package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Jht  reason: case insensitive filesystem */
public final class C60236Jht extends 2YL {
    public boolean A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final 0V2 A03;
    public final C61770pa A04;
    public final 05G A05;

    public C60236Jht(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        02z A1J = JTO.A1J();
        this.A05 = A1J;
        this.A01 = DbT.A0G(A1J);
        05D A0p = JTQ.A0p();
        this.A03 = A0p;
        this.A04 = A0p;
    }

    public final void A00(String str) {
        String str2 = str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C64812LiX.A00(A1C, 2131954125, false);
        C62582KiF kiF = C62582KiF.A0B;
        LY1 ly1 = new LY1(this, 1);
        if (str == null) {
            str2 = "";
        }
        A1C.add(new C64800LiK(ly1, kiF, str2, false, false));
        A1C.add(new FY7(AnonymousClass05K.A03, "feed"));
        C64812LiX.A00(A1C, 2131954162, true);
        A1C.add(new C64800LiK((View.OnClickListener) null, C62582KiF.A0G, "", this.A00, false));
        A1C.add(new FY7(AnonymousClass05K.A1I, "feed"));
        if (this.A00) {
            A1C.add(new FY7(AnonymousClass05K.A02, "feed"));
        }
        this.A05.Epw(A1C);
    }
}
