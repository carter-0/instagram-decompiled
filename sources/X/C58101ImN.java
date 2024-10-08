package X;

import android.content.Context;

/* renamed from: X.ImN  reason: case insensitive filesystem */
public final class C58101ImN extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 2;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58101ImN(Context context, AnonymousClass4D7 r3, 05G r4, int i, boolean z) {
        super(2, r3);
        this.A06 = r4;
        this.A05 = context;
        this.A02 = z;
        this.A04 = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.ImN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.ImN, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r7 = r12;
        switch (this.A03) {
            case 0:
                return new C58101ImN((Context) this.A05, r12, (05G) this.A06, this.A04, this.A02);
            case 1:
                int i = this.A04;
                return new C58101ImN((C61076JwE) this.A05, (C61076JwE) this.A06, (C52966GgJ) this.A01, r7, i, this.A02);
            default:
                C58101ImN imN = new C58101ImN((C53452Gok) this.A06, (H2S) this.A01, r7, (05G) this.A05, this.A04);
                imN.A02 = AnonymousClass7TE.A1a(obj);
                return imN;
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.ImN, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r5.A07 != com.instagram.api.schemas.MidCardLayoutType.A05) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0066;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 1
            if (r0 == 0) goto L_0x0012
            X.0eS.A00(r11)
        L_0x000f:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0012:
            X.0eS.A00(r11)
            boolean r3 = r10.A02
            java.lang.Object r5 = r10.A06
            X.Gok r5 = (X.C53452Gok) r5
            X.Goh r0 = r5.A06
            java.util.List r2 = r0.A09
            int r1 = r10.A04
            java.lang.Object r0 = r2.get(r1)
            X.Goi r0 = (X.C53450Goi) r0
            X.Goj r0 = r0.A00
            java.lang.Boolean r0 = r0.A08
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x0059
            if (r3 == 0) goto L_0x0059
            com.instagram.api.schemas.ClipsMidCardType r1 = r5.A04
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            r3 = 0
            if (r1 != r0) goto L_0x0043
            com.instagram.api.schemas.MidCardLayoutType r2 = r5.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.MEGA_CARD
            r1 = 2131963576(0x7f132eb8, float:1.956391E38)
            if (r2 == r0) goto L_0x0046
        L_0x0043:
            r1 = 2131957188(0x7f1315c4, float:1.9550953E38)
        L_0x0046:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.GKO r1 = X.DbS.A0Q(r0, r1)
        L_0x004c:
            java.lang.Object r0 = r10.A05
            X.0V2 r0 = (X.0V2) r0
            r10.A00 = r4
            java.lang.Object r0 = r0.emit(r1, r10)
            if (r0 != r8) goto L_0x000f
            return r8
        L_0x0059:
            java.lang.Object r0 = r2.get(r1)
            X.Goi r0 = (X.C53450Goi) r0
            java.lang.String r0 = r0.A01
            X.GKw r1 = X.JUH.A00(r0)
            goto L_0x004c
        L_0x0066:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 1
            if (r0 == 0) goto L_0x00b5
            X.0eS.A00(r11)
        L_0x0070:
            X.3Ii r11 = (X.C239803Ii) r11
            java.lang.Object r5 = r10.A01
            X.GgJ r5 = (X.C52966GgJ) r5
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0085
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01b1
            X.C52966GgJ.A00(r5)
            X.5sO r11 = X.DbU.A0f()
        L_0x0085:
            boolean r6 = r10.A02
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x016d
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r0 = r11.A00
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x009d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r2 = r4.next()
            X.Gn6 r2 = (X.C53376Gn6) r2
            X.HpS r1 = X.I12.A07
            com.instagram.api.schemas.CameraTool r0 = com.instagram.api.schemas.CameraTool.AI_EXPANDER
            X.I12 r0 = r1.A00(r2, r0)
            r3.add(r0)
            goto L_0x009d
        L_0x00b5:
            X.0eS.A00(r11)
            java.lang.Object r6 = r10.A01
            X.GgJ r6 = (X.C52966GgJ) r6
            X.I4e r0 = r6.A04
            X.GnY r0 = r0.A00
            java.lang.String r5 = r0.A03
            int r2 = r10.A04
            X.0eM r0 = r6.A07
            java.lang.Object r0 = r0.getValue()
            X.HDl r0 = (X.C54436HDl) r0
            X.Hzi r0 = X.C54436HDl.A00(r0)
            X.05G r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            int r1 = X.DbS.A05(r0)
            r0 = 16
            X.Gms r3 = new X.Gms
            r3.<init>(r2, r1, r0)
            java.lang.Object r2 = r10.A05
            X.JwE r2 = (X.C61076JwE) r2
            java.lang.Object r0 = r10.A06
            X.JwE r0 = (X.C61076JwE) r0
            X.KS3 r1 = new X.KS3
            r1.<init>(r3, r2, r0, r5)
            X.0eM r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r0 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r0
            r10.A00 = r4
            X.MTt r0 = r0.A01
            java.lang.Object r11 = r0.AWg(r1, r10)
            if (r11 != r8) goto L_0x0070
            return r8
        L_0x0101:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x010c
            X.C52966GgJ.A00(r5)
            goto L_0x000f
        L_0x010c:
            if (r6 != 0) goto L_0x0119
            X.0eM r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            X.HDl r0 = (X.C54436HDl) r0
            r0.A03()
        L_0x0119:
            X.0Ud r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            X.Gml r0 = (X.C53361Gml) r0
            java.util.List r4 = r0.A05
            X.0eM r0 = r5.A07
            java.lang.Object r2 = r0.getValue()
            X.HDl r2 = (X.C54436HDl) r2
            java.util.ArrayList r1 = X.00k.A0S(r4, r3)
            r0 = 0
            r2.A04(r0, r1)
            java.lang.Object r0 = X.00k.A0J(r3)
            X.I12 r0 = (X.I12) r0
            if (r0 == 0) goto L_0x014b
            X.HmF r3 = r0.A03
            if (r3 == 0) goto L_0x014b
            X.I4e r2 = r5.A04
            int r0 = r4.size()
            int r1 = r0 + 1
            r0 = 0
            r2.A06(r3, r1, r0)
        L_0x014b:
            X.05G r2 = r5.A0A
        L_0x014d:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.Gml r0 = (X.C53361Gml) r0
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.I12 r3 = r0.A01
            java.util.List r8 = r0.A05
            boolean r9 = r0.A06
            X.I12 r4 = r0.A00
            java.lang.Integer r7 = r0.A02
            r6 = r5
            X.Gml r0 = X.C53361Gml.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x014d
            goto L_0x000f
        L_0x016d:
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 != 0) goto L_0x000f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0176:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto L_0x0189
            java.lang.Object r6 = r10.A01
            X.05G r6 = (X.05G) r6
            X.0eS.A00(r11)
        L_0x0184:
            r6.Epw(r11)
            goto L_0x000f
        L_0x0189:
            X.0eS.A00(r11)
            java.lang.Object r6 = r10.A06
            X.05G r6 = (X.05G) r6
            java.lang.Object r5 = r10.A05
            android.content.Context r5 = (android.content.Context) r5
            boolean r4 = r10.A02
            int r3 = r10.A04
            X.4Cq r2 = X.AnonymousClass2nW.A04
            r0 = 0
            X.JV6 r1 = new X.JV6
            r1.<init>((android.content.Context) r5, (X.AnonymousClass4D7) r0, (int) r3, (boolean) r4)
            X.19B r0 = X.19B.A00
            X.2Q8 r0 = X.1Eo.A02(r0, r1, r2)
            r10.A01 = r6
            r10.A00 = r7
            java.lang.Object r11 = r0.A0E(r10)
            if (r11 != r8) goto L_0x0184
            return r8
        L_0x01b1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58101ImN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58101ImN) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58101ImN(C61076JwE jwE, C61076JwE jwE2, C52966GgJ ggJ, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A01 = ggJ;
        this.A04 = i;
        this.A05 = jwE;
        this.A06 = jwE2;
        this.A02 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58101ImN(C53452Gok gok, H2S h2s, AnonymousClass4D7 r4, 05G r5, int i) {
        super(2, r4);
        this.A06 = gok;
        this.A04 = i;
        this.A01 = h2s;
        this.A05 = r5;
    }
}
