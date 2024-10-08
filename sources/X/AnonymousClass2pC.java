package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.2pC  reason: invalid class name */
public final class AnonymousClass2pC implements C250603lj {
    public final /* synthetic */ AnonymousClass2pB A00;
    public final /* synthetic */ C230192p8 A01;

    public AnonymousClass2pC(AnonymousClass2pB r1, C230192p8 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        0qQ.A0B(r9, 0);
        WWP wwp = (WWP) r9.A03;
        Set set = this.A00.A03;
        String id = wwp.getId();
        if (set.add(id)) {
            C230192p8 r1 = this.A01;
            UserSession userSession = r1.A03;
            int position = ((C242803Vz) r9.A04).getPosition();
            AnonymousClass4DU r3 = r1.A04;
            C254523sc r2 = new C254523sc(r3, 002.A0R("instagram_ad_", C273654mx.A00(751)));
            r2.A78 = id;
            r2.A7J = wwp.C9L();
            r2.A79 = 1UQ.A0K.toString();
            r2.A4C = Long.valueOf((long) position);
            C233822wX.A0I(userSession, r2, r3, AnonymousClass05K.A01);
        }
    }
}
