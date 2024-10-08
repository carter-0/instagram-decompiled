package X;

/* renamed from: X.9Ke  reason: invalid class name and case insensitive filesystem */
public final class C377009Ke extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377009Ke(GPK gpk, AnonymousClass4JK r3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass4D7 r12, int i) {
        super(2, r12);
        this.A01 = i;
        this.A05 = r3;
        this.A09 = str;
        this.A0A = str2;
        this.A03 = gpk;
        this.A06 = str3;
        this.A08 = str4;
        this.A0B = str5;
        this.A04 = num;
        this.A07 = str6;
        this.A02 = num2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Ke, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        int i;
        int i2 = this.A01;
        AnonymousClass4JK r2 = (AnonymousClass4JK) this.A05;
        String str = this.A09;
        String str2 = this.A0A;
        GPK gpk = (GPK) this.A03;
        String str3 = this.A06;
        String str4 = this.A08;
        String str5 = this.A0B;
        Integer num = (Integer) this.A04;
        String str6 = this.A07;
        Integer num2 = (Integer) this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C377009Ke(gpk, r2, num, num2, str, str2, str3, str4, str5, str6, r15, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C377009Ke) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9Ke, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.contentnotes.data.OptimisticNetworkOperation] */
    /* JADX WARNING: type inference failed for: r14v6, types: [X.H8q] */
    /* JADX WARNING: type inference failed for: r14v7, types: [X.H8s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r13 = r27
            int r1 = r13.A01
            X.1Hj r12 = X.1Hj.A02
            int r0 = r13.A00
            r11 = 1
            if (r1 == 0) goto L_0x0063
            if (r0 != 0) goto L_0x00b3
            X.0eS.A00(r28)
            java.lang.Object r1 = r13.A05
            X.4JK r1 = (X.AnonymousClass4JK) r1
            com.instagram.common.session.UserSession r0 = r1.A00
            r16 = r0
            X.0eM r0 = r1.A02
            java.lang.Object r14 = r0.getValue()
            com.instagram.direct.inbox.notes.NotesApi r14 = (com.instagram.direct.inbox.notes.NotesApi) r14
            java.lang.String r10 = r13.A09
            java.lang.String r9 = r13.A0A
            java.lang.Object r8 = r13.A03
            X.GPK r8 = (X.GPK) r8
            java.lang.String r7 = r13.A06
            java.lang.String r6 = r13.A08
            java.lang.String r5 = r13.A0B
            java.lang.Object r4 = r13.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r3 = r13.A07
            java.lang.Object r2 = r13.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r15 = 29
            X.PmN r0 = new X.PmN
            r0.<init>(r9, r1, r15)
            X.H8s r1 = new X.H8s
            r26 = r0
            r24 = r5
            r25 = r3
            r22 = r7
            r23 = r6
            r20 = r10
            r21 = r9
            r18 = r4
            r19 = r2
            r17 = r14
            r14 = r1
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x005a:
            r13.A00 = r11
            java.lang.Object r0 = r1.A00(r13)
            if (r0 != r12) goto L_0x00b6
            return r12
        L_0x0063:
            if (r0 != 0) goto L_0x00b3
            X.0eS.A00(r28)
            java.lang.Object r14 = r13.A05
            X.4JK r14 = (X.AnonymousClass4JK) r14
            com.instagram.common.session.UserSession r0 = r14.A00
            r16 = r0
            X.0eM r0 = r14.A02
            java.lang.Object r15 = r0.getValue()
            com.instagram.direct.inbox.notes.NotesApi r15 = (com.instagram.direct.inbox.notes.NotesApi) r15
            java.lang.String r10 = r13.A09
            java.lang.String r9 = r13.A0A
            java.lang.Object r8 = r13.A03
            X.GPK r8 = (X.GPK) r8
            java.lang.String r7 = r13.A06
            java.lang.String r6 = r13.A08
            java.lang.String r5 = r13.A0B
            java.lang.Object r4 = r13.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r3 = r13.A07
            java.lang.Object r2 = r13.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 28
            X.PmN r0 = new X.PmN
            r0.<init>(r9, r14, r1)
            X.H8q r1 = new X.H8q
            r26 = r0
            r24 = r5
            r25 = r3
            r22 = r7
            r23 = r6
            r20 = r10
            r21 = r9
            r18 = r4
            r19 = r2
            r17 = r15
            r14 = r1
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x005a
        L_0x00b3:
            X.0eS.A00(r28)
        L_0x00b6:
            X.0gF r12 = X.C60340gF.A00
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377009Ke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
