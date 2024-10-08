package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class H4I extends 1P0 {
    public final /* synthetic */ C55837HoK A00;

    public H4I(C55837HoK hoK) {
        this.A00 = hoK;
    }

    public final void onFail(C268654dm r11) {
        int i;
        int A03 = AnonymousClass0fD.A03(809539108);
        0qQ.A0B(r11, 0);
        C55837HoK hoK = this.A00;
        C311636d0 r7 = hoK.A04;
        C311646d1 r0 = r7.A03;
        C243363Yl r5 = hoK.A00;
        String A0b = Dbb.A0b(r11);
        0qQ.A0B(r5, 0);
        1QP r8 = r0.A00;
        C243363Yl r3 = C243363Yl.LIKED;
        if (r5 == r3) {
            i = 4057;
        } else {
            i = 4061;
        }
        r8.flowEndFail(18943093, AnonymousClass000.A00(i), A0b);
        if (r11 instanceof C268674do) {
            1Xj r1 = hoK.A01;
            if (r5 == r3) {
                r3 = C243363Yl.NOT_LIKED;
            }
            r1.A44(r3);
            1Ng A002 = AnonymousClass1Nd.A00(r7.A01);
            String id = r1.getId();
            if (id != null) {
                A002.A00(new C317326n5(r5, id, true));
                r7.A05.A0L(hoK.A05);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass0fD.A0A(1214901866, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C310016aI r8;
        String str;
        int A03 = AnonymousClass0fD.A03(-970890178);
        int A032 = AnonymousClass0fD.A03(327620507);
        C55837HoK hoK = this.A00;
        C311636d0 r3 = hoK.A04;
        r3.A05.A0L(hoK.A05);
        r3.A03.A00.flowEndSuccess(18943093);
        if (hoK.A01.CcK() && (r8 = r3.A02) != null) {
            Reel reel = hoK.A02;
            C255773uh r9 = hoK.A03;
            C243363Yl r1 = hoK.A00;
            0qQ.A0B(r1, 2);
            if (r9.CcK()) {
                if (r1 == C243363Yl.LIKED) {
                    str = "like";
                } else {
                    str = "unlike";
                }
                1Xj r5 = r9.A0b;
                if (r5 != null) {
                    UserSession userSession = r8.A06;
                    C310026aJ r32 = r8.A0A;
                    r32.A00 = reel;
                    C254523sc A0c = C51967G9n.A0c(userSession, r5, r32, str);
                    C310016aI.A04(A0c, (GT8) r8.A0I.get(r9.CFY()), r8);
                    C233822wX.A0C(userSession, A0c, r5, r32, (Integer) null);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        AnonymousClass0fD.A0A(-1891643108, A032);
        AnonymousClass0fD.A0A(-1122953468, A03);
    }
}
