package X;

import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.friendmap.data.MapText;

public final class HBP extends MYL {
    public final FriendMapRepository A00;
    public final C69028NdD A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HBP(FriendMapRepository friendMapRepository, C69028NdD ndD) {
        super(new C53547GqI(ndD.A0S(), (C68150N2q) null, "", 0sn.A00, AnonymousClass62Q.A04(C54621HLe.HIDE_PLACES_INTRO, C54621HLe.HIDE_PLACES_RADIUS, C54621HLe.HIDE_PLACES_NAME), 250.0f, false, true, true));
        AnonymousClass7TF.A1B(friendMapRepository, 1, ndD);
        this.A00 = friendMapRepository;
        this.A01 = ndD;
        DbY.A19(this, new C73567Pfo(this, (AnonymousClass4D7) null, 24), friendMapRepository.A0N);
    }

    public static final void A00(MapText mapText, HBP hbp) {
        C69028NdD ndD = hbp.A01;
        ndD.A0V(C69028NdD.A03(ndD));
        hbp.A0P(new C72696PGa(mapText));
        hbp.A0P(IV7.A00);
    }

    public final void A0S(C68150N2q n2q) {
        C74260Pro pGb;
        A0R(J3Y.A00);
        if (n2q == null && (n2q = ((C53547GqI) A0O()).A01) == null) {
            pGb = IV7.A00;
        } else {
            pGb = new C72697PGb(n2q.A04, new C58185Inp(28, n2q, this), new C73898PlZ(this, 43));
        }
        A0P(pGb);
    }
}
