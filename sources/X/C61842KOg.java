package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KOg  reason: case insensitive filesystem */
public final class C61842KOg extends LSR {
    public FGY A00;
    public final AnonymousClass07Z A01;
    public final UserSession A02;
    public final LRK A03;
    public final 1Av A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.A00 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C61842KOg r5) {
        /*
            X.1Av r3 = r5.A04
            X.0s0 r2 = r3.A0e
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 186(0xba, float:2.6E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0013
            X.FGY r0 = r5.A00
            r4 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            X.05G r3 = r5.A06
            java.lang.Object r0 = r3.getValue()
            X.Jvk r0 = (X.C61046Jvk) r0
            boolean r0 = r0.A01
            if (r4 == r0) goto L_0x003c
            java.lang.Object r0 = r3.getValue()
            X.Jvk r0 = (X.C61046Jvk) r0
            java.lang.String r2 = r0.A00
            r1 = 4
            X.Jvk r0 = new X.Jvk
            r0.<init>((java.lang.String) r2, (boolean) r4, (int) r1)
            r3.Epw(r0)
            if (r4 == 0) goto L_0x003c
            X.FGY r1 = r5.A00
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "IMPRESSION"
            X.FGY.A04(r1, r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61842KOg.A00(X.KOg):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61842KOg(AnonymousClass07Z r5, UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass7TG.A1Q(userSession, r5);
        this.A03 = lrk;
        this.A02 = userSession;
        this.A01 = r5;
        this.A04 = 1Au.A00(userSession);
        02z A10 = DbS.A10(new C61046Jvk(4));
        this.A06 = A10;
        this.A05 = A10;
        AnonymousClass7TE.A1Z(new C66165MGc(this, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(this.A01));
    }
}
