package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GYg  reason: case insensitive filesystem */
public final class C52581GYg extends C230372pW {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r8 = r14.A01;
        r10 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r12 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C267324bN r15, X.AnonymousClass4HA r16, java.lang.String r17) {
        /*
            r14 = this;
            X.1iA r1 = r15.A0J
            X.1iA r0 = X.1iA.A09
            if (r1 != r0) goto L_0x0053
            r1 = r16
            X.3W1 r3 = r1.A01
            java.util.List r0 = r15.A0R
            if (r0 == 0) goto L_0x0053
            int r12 = r1.A00
            X.1Xj r6 = X.C51966G9m.A0u(r0, r12)
            if (r6 == 0) goto L_0x0053
            boolean r0 = r15.A0E()
            r11 = r17
            if (r0 == 0) goto L_0x0054
            X.3OA r8 = r15.A06()
            X.2uY r4 = r14.A01
            X.4DU r7 = r14.A02
            com.instagram.common.session.UserSession r5 = r4.A00
            java.lang.String r0 = "carousel_"
            java.lang.String r11 = X.002.A0R(r0, r11)
            X.3kK r9 = r4.A01
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            X.3sc r2 = X.C254513sb.A01(r5, r6, r7, r8, r9, r10, r11)
            X.C232852uY.A00(r4, r2, r6, r7)
            if (r2 == 0) goto L_0x0053
            r2.A03()
            r2.A02()
            java.lang.String r0 = r14.A03
            r2.A6L = r0
            boolean r0 = r3.A2R
            r2.A8A = r0
            X.C233822wX.A0Z(r2, r8, r12)
            com.instagram.common.session.UserSession r0 = r14.A00
            X.C233822wX.A0H(r0, r2, r7)
        L_0x0053:
            return
        L_0x0054:
            X.1Xj r9 = r15.A02
            if (r9 == 0) goto L_0x0053
            X.2uY r8 = r14.A01
            X.4DU r10 = r14.A02
            int r13 = r3.getPosition()
            X.3sc r8 = r8.A03(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x0053
            com.instagram.common.session.UserSession r7 = r14.A00
            r13 = 1
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r9 = r6
            X.C233822wX.A0F(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52581GYg.A00(X.4bN, X.4HA, java.lang.String):void");
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r2 = (C267324bN) obj;
        AnonymousClass4HA r3 = (AnonymousClass4HA) obj2;
        AnonymousClass7TG.A1N(r2, r3);
        A00(r2, r3, "impression");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r2 = (C267324bN) obj;
        AnonymousClass4HA r3 = (AnonymousClass4HA) obj2;
        AnonymousClass7TG.A1N(r2, r3);
        A00(r2, r3, "sub_impression");
    }

    public C52581GYg(UserSession userSession, AnonymousClass4DU r5, String str) {
        super(C51972G9s.A0c(userSession), new IP5(userSession, 0));
        this.A03 = str;
        this.A02 = r5;
        this.A00 = userSession;
        this.A01 = new C232852uY(userSession, (C249763kK) null);
    }
}
