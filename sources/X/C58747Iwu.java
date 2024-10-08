package X;

/* renamed from: X.Iwu  reason: case insensitive filesystem */
public final class C58747Iwu extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58747Iwu(Object obj, int i, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r2 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
        r3.A07(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        if (r2 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bd, code lost:
        r3.A04(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        r3.A03(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        if (r1 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r3.A08(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r1 != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0066;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.2Ep r10 = (X.AnonymousClass2Ep) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            boolean r2 = r9.A02
            boolean r1 = r9.A03
            java.lang.Object r0 = r9.A01
            X.Mtz r0 = (X.C67746Mtz) r0
            X.0eM r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.7IQ r3 = (X.AnonymousClass7IQ) r3
            java.lang.String r5 = r10.C6C()
            java.lang.String r6 = r10.C6k()
            int r7 = r10.C6a()
            int r8 = r10.AdN()
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.QUESTIONS
            if (r2 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0097
        L_0x0031:
            r3.A08(r4, r5, r6, r7, r8)
        L_0x0034:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0037:
            if (r1 == 0) goto L_0x00c2
            goto L_0x00bd
        L_0x003b:
            X.5SW r10 = (X.AnonymousClass5SW) r10
            java.lang.Object r0 = r9.A01
            X.JNV r0 = (X.JNV) r0
            long r5 = r0.E4j()
            X.5Sb r1 = X.C55298HfR.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0063
            X.HL1 r3 = X.HL1.SelectionStart
        L_0x004d:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0060
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0053:
            boolean r7 = X.C289325dP.A02(r5)
            X.Ht4 r2 = new X.Ht4
            r2.<init>(r3, r4, r5, r7)
            r10.ENH(r1, r2)
            goto L_0x0034
        L_0x0060:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0053
        L_0x0063:
            X.HL1 r3 = X.HL1.SelectionEnd
            goto L_0x004d
        L_0x0066:
            X.2Ep r10 = (X.AnonymousClass2Ep) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            boolean r1 = r9.A02
            boolean r2 = r9.A03
            java.lang.Object r0 = r9.A01
            if (r1 == 0) goto L_0x009b
            X.MuF r0 = (X.C67759MuF) r0
            X.0eM r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            X.7IQ r3 = (X.AnonymousClass7IQ) r3
            java.lang.String r5 = r10.C6C()
            java.lang.String r6 = r10.C6k()
            int r7 = r10.C6a()
            int r8 = r10.AdN()
            java.lang.String r0 = r0.A0D
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.AnonymousClass79B.A01(r0)
            if (r2 == 0) goto L_0x0097
            goto L_0x0031
        L_0x0097:
            r3.A07(r4, r5, r6, r7, r8)
            goto L_0x0034
        L_0x009b:
            X.MuF r0 = (X.C67759MuF) r0
            X.0eM r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            X.7IQ r3 = (X.AnonymousClass7IQ) r3
            java.lang.String r5 = r10.C6C()
            java.lang.String r6 = r10.C6k()
            int r7 = r10.C6a()
            int r8 = r10.AdN()
            java.lang.String r0 = r0.A0D
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.AnonymousClass79B.A01(r0)
            if (r2 == 0) goto L_0x00c2
        L_0x00bd:
            r3.A04(r4, r5, r6, r7, r8)
            goto L_0x0034
        L_0x00c2:
            r3.A03(r4, r5, r6, r7, r8)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58747Iwu.invoke(java.lang.Object):java.lang.Object");
    }
}
