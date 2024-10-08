package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jhz  reason: case insensitive filesystem */
public final class C60242Jhz extends 2YL {
    public C61050Jvo A00;
    public final 2Fk A01;
    public final C63615L0d A02;
    public final LAL A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final UserSession A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;

    public C60242Jhz(AnonymousClass12V r10, UserSession userSession, C63615L0d l0d, LAL lal) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r10, 4);
        this.A06 = userSession;
        this.A03 = lal;
        this.A02 = l0d;
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        05G r8 = lal.A06;
        05F A032 = 10b.A03(r8);
        05G r7 = lal.A05;
        C61820pm A033 = AnonymousClass10H.A03(MIF.A00, A032, 10b.A03(r7));
        this.A07 = A033;
        AnonymousClass0r6 A013 = 11M.A01(r10.AOJ(1369994819, 3), new C62170rn(new MG6(this, (AnonymousClass4D7) null, 16), AnonymousClass10H.A03(MIG.A00, A033, A012)));
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r3 = AnonymousClass10A.A00;
        C61050Jvo jvo = (C61050Jvo) r8.getValue();
        List list = (List) r7.getValue();
        AnonymousClass7TG.A1N(jvo, list);
        05F A022 = 10b.A02(new C60987Juj(new C60989Jul(jvo, list)), A002, A013, r3);
        19B r32 = 19B.A00;
        this.A01 = C226292g8.A00(r32, A022);
        1HR A0w = G9w.A0w();
        this.A04 = A0w;
        this.A05 = 0u9.A04(A0w);
        1Eo.A05(r32, new MG6(this, (AnonymousClass4D7) null, 15), C318116oQ.A00(this));
    }

    public final void onCleared() {
        LAL lal = this.A03;
        AnonymousClass1Nd.A00(lal.A03).A02(lal.A02, C64667Lft.class);
    }
}
