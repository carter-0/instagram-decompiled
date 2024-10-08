package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.invite.repository.InviteContactRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DkJ  reason: case insensitive filesystem */
public final class C46730DkJ extends C361478gI {
    public final Application A00;
    public final UserSession A01;
    public final InviteContactRepository A02;
    public final 05G A03 = DbS.A10(DbS.A0y());
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final 05G A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46730DkJ(Application application, UserSession userSession, InviteContactRepository inviteContactRepository) {
        super(application);
        0qQ.A0B(application, 1);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = inviteContactRepository;
        02z A10 = DbS.A10(new C53358Gmi((Integer) null, (String) null, (List) null, 63));
        this.A04 = A10;
        this.A06 = 10b.A03(A10);
        02z A102 = DbS.A10(new ULT());
        this.A07 = A102;
        this.A05 = 10b.A03(A102);
    }

    public final void A0F(String str) {
        0qQ.A0B(str, 0);
        05G r6 = this.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) this.A03.getValue()) {
            C53374Gn4 gn4 = (C53374Gn4) next;
            if (00l.A0d(gn4.A03, DbV.A12(str), true) || 00l.A0d(gn4.A04, DbV.A12(str), true)) {
                A1C.add(next);
            }
        }
        r6.Epw(new C53358Gmi(AnonymousClass05K.A01, str, A1C, 52));
    }

    public final void A0E(C48145EZn eZn) {
        AnonymousClass7TE.A1Z(new MH0((Object) eZn, (Object) this, (AnonymousClass4D7) null, 38), C318116oQ.A00(this));
        InviteContactRepository inviteContactRepository = this.A02;
        AnonymousClass11O.A03(C318116oQ.A00(this), AnonymousClass10H.A01(new MI2(this, (AnonymousClass4D7) null, 1), inviteContactRepository.A02, inviteContactRepository.A01, inviteContactRepository.A03, inviteContactRepository.A00));
    }
}
