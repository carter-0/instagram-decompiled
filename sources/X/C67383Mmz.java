package X;

import com.instagram.common.session.UserSession;
import java.util.Comparator;

/* renamed from: X.Mmz  reason: case insensitive filesystem */
public final class C67383Mmz implements AnonymousClass0lh {
    public final int A00;
    public final int A01;
    public final C363368jb A02;
    public final C363348jZ A03;
    public final NMI A04;
    public final UserSession A05;
    public final C61410nE A06 = C61410nE.A00;
    public final Comparator A07;

    public final synchronized void onSessionWillEnd() {
        this.A02.A01();
    }

    public static final void A00(C67383Mmz mmz) {
        1NY A0b = AnonymousClass7TG.A0b(mmz.A05);
        A0b.A0A("fbsearch/nullstate_popular_keywords/");
        1OC A0S = DbU.A0S(A0b, C67440Mnv.class, C67439Mnu.class);
        A0S.A00 = mmz.A04;
        1ES.A03(A0S);
    }

    public C67383Mmz(UserSession userSession) {
        this.A05 = userSession;
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        this.A01 = DbS.A04(A0H, userSession, 36597828646341608L);
        this.A00 = DbS.A04(A0H, userSession, 36597828646538219L);
        C73429PcU pcU = new C73429PcU(40);
        this.A07 = pcU;
        C67384Mn0 mn0 = new C67384Mn0();
        this.A03 = mn0;
        this.A02 = new C363368jb(mn0, C51969G9p.A0n(1Al.A01(userSession), 1An.A22, this), "popularKeyword:", pcU);
        this.A04 = new NMI((Object) this, 28);
    }
}
