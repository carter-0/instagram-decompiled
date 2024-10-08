package X;

import com.instagram.common.session.UserSession;

public final class JBV extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sP A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBV(UserSession userSession, AnonymousClass4DU r3, String str, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sP r11, int i) {
        super(2);
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = str;
        this.A09 = r9;
        this.A07 = r5;
        this.A0A = r10;
        this.A06 = r6;
        this.A08 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A02;
        String str = this.A03;
        0sP r9 = this.A09;
        C62320sa r5 = this.A07;
        0sP r10 = this.A0A;
        C54850HVh.A00(A0R, userSession, r3, str, r5, this.A06, this.A04, this.A05, r9, r10, this.A08, C51966G9m.A01(this.A00));
        return C60340gF.A00;
    }
}
