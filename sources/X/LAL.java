package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class LAL {
    public String A00;
    public final C61050Jvo A01;
    public final 1wn A02;
    public final UserSession A03;
    public final List A04;
    public final 05G A05;
    public final 05G A06;

    public /* synthetic */ LAL(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        01N A1H = 0jo.A1H();
        for (C62555Khl khl : C62555Khl.values()) {
            if ((khl != C62555Khl.CTWA || AnonymousClass7TF.A0Q(userSession).A1d()) && ((khl != C62555Khl.BOOK_APPOINTMENT || (AnonymousClass7TF.A0Q(userSession).A2L() && 182.A06(0Tu.A05, userSession, 36315932762771138L))) && khl != C62555Khl.SELL_PRODUCT)) {
                A1H.add(C63189Ksw.A00(userSession, khl));
            }
        }
        01N A1I = 0jo.A1I(A1H);
        this.A04 = A1I;
        C61050Jvo A002 = C63189Ksw.A00(userSession, C62555Khl.CTD);
        this.A01 = A002;
        this.A00 = LLF.A00;
        this.A02 = C64698LgT.A00(this, 13);
        this.A06 = 106.A01(A002);
        this.A05 = 106.A01(A1I);
        AnonymousClass1Nd.A00(this.A03).A01(this.A02, C64667Lft.class);
    }
}
