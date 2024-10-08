package X;

/* renamed from: X.6Jw  reason: invalid class name and case insensitive filesystem */
public final class C305866Jw {
    public C256003v4 A00;
    public C242423Ua A01;
    public final OI0 A02;
    public final C307786Rm A03;
    public final C276544tV A04;

    public final String A00() {
        C276544tV A07 = this.A04.A07(61);
        17k.A07(A07, "Expected valid player identifier but got null");
        String A0K = A07.A0K(35);
        A0K.getClass();
        return A0K;
    }

    public final void A01(String str) {
        C276544tV r4 = this.A04;
        C277014uI A0A = r4.A0A(55);
        if (A0A != null) {
            C308276Tl r1 = new C308276Tl();
            r1.A03(str, 0);
            C307786Rm r2 = this.A03;
            r1.A03(r2, 1);
            C307886Rw.A03(r2, r4, new AnonymousClass6Tm(r1.A00), A0A);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C305866Jw(X.C307786Rm r14, X.C276544tV r15) {
        /*
            r13 = this;
            r13.<init>()
            r13.A04 = r15
            r13.A03 = r14
            r0 = 70
            X.4uI r2 = r15.A0A(r0)
            if (r2 == 0) goto L_0x0035
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.util.List r0 = r15.A09
            X.6Rx r0 = X.C307896Rx.A01(r14, r2, r0)
            java.lang.Object r2 = X.C299275ur.A00(r0, r1, r2)
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ ClassCastException -> 0x001f }
            goto L_0x0036
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Expected IG_LOGGING_EXTRA_FIELDS to be a map, but got "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "BKVideoBinderUtils"
            X.1Kn.A02(r0, r1)
        L_0x0035:
            r7 = 0
        L_0x0036:
            java.lang.String r3 = ""
            r2 = 38
            r5 = r3
            java.lang.String r0 = r15.A0K(r2)
            if (r0 == 0) goto L_0x0042
            r5 = r0
        L_0x0042:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.String r0 = r15.A0K(r2)
            if (r0 == 0) goto L_0x004b
            r3 = r0
        L_0x004b:
            X.4im r2 = new X.4im
            r2.<init>(r1, r3)
            r0 = 35
            java.lang.String r0 = r15.A0K(r0)
            r2.A08 = r0
            r1 = 36
            r0 = 0
            boolean r0 = r15.A0R(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 40
            java.lang.String r0 = r15.A0K(r0)
            r2.A09 = r0
            r0 = 44
            java.util.List r0 = r15.A0M(r0)
            java.util.ArrayList r0 = X.C16862V8r.A00(r0)
            r2.A0C = r0
            r0 = 41
            java.lang.String r0 = r15.A0K(r0)
            r2.A0A = r0
            X.3WR r4 = r2.A00()
            X.0iw r0 = X.C308206Td.A07(r14)
            java.lang.String r6 = r0.getModuleName()
            r0 = 46
            java.lang.String r0 = r15.A0K(r0)
            if (r0 == 0) goto L_0x0096
            r6 = r0
        L_0x0096:
            r0 = 52
            r1 = 1
            boolean r10 = r15.A0R(r0, r1)
            r0 = 56
            boolean r11 = r15.A0R(r0, r1)
            r0 = 59
            boolean r12 = r15.A0R(r0, r1)
            java.lang.String r1 = "cover"
            r0 = 62
            java.lang.String r0 = r15.A0K(r0)
            if (r0 == 0) goto L_0x00b4
            r1 = r0
        L_0x00b4:
            java.lang.String r0 = "contain"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ce
            X.4M7 r3 = X.AnonymousClass4M7.FIT
        L_0x00be:
            r2 = 42
            r0 = 0
            long r8 = r15.A04(r2, r0)
            X.OI0 r2 = new X.OI0
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r13.A02 = r2
            return
        L_0x00ce:
            X.4M7 r3 = X.AnonymousClass4M7.FILL
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305866Jw.<init>(X.6Rm, X.4tV):void");
    }
}
