package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jie  reason: case insensitive filesystem */
public final class C60283Jie extends 2YL {
    public final 2Fk A00;
    public final C63613L0b A01;
    public final C62439Kfp A02;
    public final C63849L9e A03;
    public final C63614L0c A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final AnonymousClass0Ud A07;
    public final UserSession A08;
    public final String A09;
    public final AnonymousClass0Ud A0A;

    public C60283Jie(AnonymousClass12V r10, UserSession userSession, C63613L0b l0b, C62439Kfp kfp, C63849L9e l9e, C63614L0c l0c, String str) {
        String str2 = str;
        C51974G9v.A1N(userSession, str2, r10);
        this.A03 = l9e;
        this.A01 = l0b;
        this.A04 = l0c;
        this.A02 = kfp;
        this.A08 = userSession;
        this.A09 = str2;
        05G r8 = l9e.A05;
        05F A032 = 10b.A03(r8);
        this.A0A = A032;
        05G r7 = l9e.A04;
        05F A033 = 10b.A03(r7);
        this.A07 = A033;
        AnonymousClass0r6 A002 = AnonymousClass11E.A00(new C66200MIh(this, 23), 11M.A01(r10.AOJ(1369994819, 3), AnonymousClass10H.A03(MIE.A00, A032, A033)));
        C62170rn r0 = new C62170rn(new MG0(this, (AnonymousClass4D7) null, 30), 10b.A02(new C60988Juk((Integer) r8.getValue(), (String) r7.getValue()), C318116oQ.A00(this), A002, AnonymousClass10A.A00));
        19B r3 = 19B.A00;
        this.A00 = C226292g8.A00(r3, r0);
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A06 = 0u9.A04(A0w);
        1Eo.A05(r3, new MG6(this, (AnonymousClass4D7) null, 13), C318116oQ.A00(this));
    }

    public static final void A00(C60283Jie jie) {
        if (0qQ.A0K(jie.A09, "clips_share_sheet")) {
            27p.A01(jie.A08).A1B(C62674Kka.A04, AnonymousClass80P.ADD_MESSAGE_BUTTON);
            return;
        }
        C59847JaN.A00(jie.A08).A04("ADD_MESSAGE_BUTTON_TAPPED");
    }

    public final void onCleared() {
        C63849L9e l9e = this.A03;
        1Ng A002 = AnonymousClass1Nd.A00(l9e.A02);
        A002.A02(l9e.A01, C64645LfX.class);
        A002.A02(l9e.A00, C64668Lfu.class);
    }
}
