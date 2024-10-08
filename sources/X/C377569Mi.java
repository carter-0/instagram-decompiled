package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Mi  reason: invalid class name and case insensitive filesystem */
public final class C377569Mi extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377569Mi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A09 = obj;
        this.A08 = obj2;
        this.A0A = z;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A04 = obj6;
        this.A01 = obj7;
        this.A07 = obj8;
        this.A02 = obj9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            AnonymousClass4DU r7 = (AnonymousClass4DU) this.A04;
            UserSession userSession = (UserSession) this.A09;
            AnonymousClass3V9 r11 = (AnonymousClass3V9) this.A02;
            C262914Gm.A01(userSession, (1Xj) this.A05, (1Xj) this.A03, r7, (AnonymousClass3W1) this.A06, (C262864Gh) this.A01, (AnonymousClass3VA) this.A08, r11, (C262944Gp) this.A07);
        } else {
            C305006Gb r4 = (C305006Gb) obj2;
            0qQ.A0B(r4, 0);
            UserSession userSession2 = (UserSession) this.A09;
            float A002 = (float) 182.A00(0Tu.A05, userSession2, 37170764399116815L);
            AnonymousClass5vX r5 = (AnonymousClass5vX) this.A08;
            if (!r5.A08) {
                AnonymousClass62P r14 = r5.A06;
                AnonymousClass6F3 r1 = AnonymousClass6F3.A00;
                int size = r14.size();
                0sL r25 = (0sL) this.A05;
                0sP r24 = (0sP) this.A04;
                0sP r23 = (0sP) this.A03;
                0sP r22 = (0sP) this.A06;
                UserSession userSession3 = userSession2;
                C299635va r19 = (C299635va) this.A07;
                C299665vd r18 = (C299665vd) this.A01;
                r4.CfA(new C377439Lv(5, r14, r1), new C377259Ld(r14, 29), AnonymousClass5PI.A03(new C59439JJo(r18, r19, userSession3, r14, r22, r23, r24, r25, A002), -1091073711), size);
            } else {
                r4.Cf4("loading_shimmer", AnonymousClass5PI.A03(new JGS(r5, A002), -2077470058));
            }
            if (this.A0A) {
                r4.Cf4("see_more_card", AnonymousClass5PI.A03(new C59351JGd(r5, (C62320sa) this.A02, A002), 658710280));
            }
        }
        return C60340gF.A00;
    }
}
