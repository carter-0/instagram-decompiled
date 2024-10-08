package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.36N  reason: invalid class name */
public final class AnonymousClass36N extends 2YL {
    public boolean A00 = true;
    public final 2Fk A01;
    public final UserSession A02;
    public final C359098c0 A03;
    public final L50 A04;
    public final QuickSnapRepository A05;
    public final AnonymousClass0r6 A06;
    public final AnonymousClass0r6 A07;
    public final 0V2 A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public AnonymousClass36N(UserSession userSession, C359098c0 r4, L50 l50, QuickSnapRepository quickSnapRepository) {
        0qQ.A0B(quickSnapRepository, 2);
        0qQ.A0B(l50, 3);
        0qQ.A0B(r4, 4);
        this.A02 = userSession;
        this.A05 = quickSnapRepository;
        this.A04 = l50;
        this.A03 = r4;
        02z r0 = new 02z(new C61069Jw7());
        this.A09 = r0;
        this.A0A = r0;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A08 = A012;
        this.A07 = A012;
        C66108MBr mBr = new C66108MBr(quickSnapRepository.A0B);
        this.A06 = mBr;
        this.A01 = C226292g8.A00(19B.A00, mBr);
    }

    public final void A02(C53401GnY gnY, User user) {
        05G r2 = this.A09;
        List list = (List) ((C61069Jw7) r2.getValue()).A02;
        0qQ.A0B(list, 0);
        r2.Epw(new C61069Jw7(gnY, user, list));
    }

    public final void A03(boolean z) {
        this.A00 = z;
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new JV6((Object) this, (AnonymousClass4D7) null, 44, z), A002);
    }

    public final void A00() {
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MG3((Object) this, (AnonymousClass4D7) null, 19), A002);
    }

    public final void A01() {
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new C66166MGd((AnonymousClass4D7) null, (Object) this, 32), A002);
    }
}
