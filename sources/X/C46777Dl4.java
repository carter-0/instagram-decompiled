package X;

import com.instagram.hallpass.repository.HallPassMemberListRepository;
import java.util.ArrayList;

/* renamed from: X.Dl4  reason: case insensitive filesystem */
public final class C46777Dl4 extends 2YL {
    public final 2Fk A00;
    public final HallPassMemberListRepository A01;

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        05G r4 = this.A01.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) r4.getValue()) {
            DbY.A1T(DbS.A0q(next), str, next, A1C);
        }
        r4.Epw(A1C);
    }

    public C46777Dl4(HallPassMemberListRepository hallPassMemberListRepository) {
        this.A01 = hallPassMemberListRepository;
        this.A00 = DbT.A0G(AnonymousClass10H.A01(new MI0(1, (AnonymousClass4D7) null), hallPassMemberListRepository.A04, hallPassMemberListRepository.A03, hallPassMemberListRepository.A02, hallPassMemberListRepository.A05));
    }

    public final void A00(String str) {
        AnonymousClass7TE.A1Z(new MFW(this, str, (AnonymousClass4D7) null, 48), C318116oQ.A00(this));
    }
}
