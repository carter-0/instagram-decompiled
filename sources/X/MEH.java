package X;

public final class MEH extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEH(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(1, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEH, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        String str;
        Object obj;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        AnonymousClass4D7 r4 = r7;
        switch (i2) {
            case 0:
                obj = this.A02;
                str = this.A04;
                i = 0;
                break;
            case 1:
                str = this.A04;
                obj = this.A02;
                i = 1;
                break;
            default:
                str = this.A04;
                obj = this.A02;
                i = 2;
                break;
        }
        return new MEH(obj2, obj, str, r4, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MEH) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MEH, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00eb, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ee, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r2 != r3) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r18
            r2 = r19
            int r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x0035;
                case 1: goto L_0x004f;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x00eb
            X.0eS.A00(r2)
            java.lang.Object r7 = r4.A03
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r7 = (com.instagram.genai.imageservice.upload.GenAIImageUploadService) r7
            java.lang.String r6 = r4.A04
            java.lang.Object r5 = r4.A02
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            r4.A00 = r0
            X.12T r1 = X.AnonymousClass12T.A00
            r2 = 0
            r0 = 1283136708(0x4c7b1cc4, float:6.58276E7)
            X.0nV r1 = X.JTP.A0V(r1, r0)
            X.MGQ r0 = new X.MGQ
            r0.<init>((android.graphics.Bitmap) r5, (com.instagram.genai.imageservice.upload.GenAIImageUploadService) r7, (java.lang.String) r6, (X.AnonymousClass4D7) r2)
            java.lang.Object r2 = X.1Eo.A00(r4, r1, r0)
        L_0x0032:
            if (r2 != r3) goto L_0x004e
            return r3
        L_0x0035:
            int r0 = r4.A00
            r5 = 1
            if (r0 != 0) goto L_0x00eb
            X.0eS.A00(r2)
            java.lang.Object r2 = r4.A03
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r2 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r2
            java.lang.Object r1 = r4.A02
            X.KS2 r1 = (X.KS2) r1
            java.lang.String r0 = r4.A04
            r4.A00 = r5
            java.lang.Object r2 = com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource.A00(r2, r1, r0, r4)
            goto L_0x0032
        L_0x004e:
            return r2
        L_0x004f:
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x005a
            X.0eS.A00(r2)
        L_0x0057:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x005a:
            X.0eS.A00(r2)
            java.lang.Object r2 = r4.A03
            X.KWZ r2 = (X.KWZ) r2
            java.lang.String r6 = r4.A04
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.String r0 = "thread_id"
            X.0Df r7 = X.C41845B3m.A03(r1, r6, r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<X.Bi7> r11 = X.C42771Bi7.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGDFetchScheduledMessagesQuery"
            r12 = 0
            r14 = 64
            java.lang.String r16 = "xig_igd_fetch_scheduled_messages"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r6.setMaxToleratedCacheAgeMs(r0)
            X.1vn r0 = r2.A02
            X.032 r7 = r0.A05(r6)
            r1 = 41
            X.MFz r0 = new X.MFz
            r0.<init>(r1, r13)
            r8 = 24
            X.MCA r6 = new X.MCA
            r6.<init>((X.0sL) r0, (X.AnonymousClass0r6) r7, (int) r8)
            r1 = 42
            X.MFz r0 = new X.MFz
            r0.<init>(r1, r13)
            X.7qX r7 = new X.7qX
            r7.<init>(r0, r6)
            java.lang.Object r6 = r4.A02
            r1 = 18
            X.MfO r0 = new X.MfO
            r0.<init>(r2, r6, r13, r1)
            X.MCA r6 = new X.MCA
            r6.<init>((X.0sL) r0, (X.AnonymousClass0r6) r7, (int) r8)
            r1 = 40
            X.MFz r0 = new X.MFz
            r0.<init>(r1, r13)
            X.7qX r1 = new X.7qX
            r1.<init>(r0, r6)
            r0 = 20
            X.MC9 r6 = X.MC9.A00(r1, r0)
            r1 = 14
            X.Pfn r0 = new X.Pfn
            r0.<init>(r2, r13, r1)
            r4.A00 = r5
            java.lang.Object r0 = X.AnonymousClass11O.A00(r4, r0, r6)
            if (r0 != r3) goto L_0x0057
            return r3
        L_0x00eb:
            X.0eS.A00(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
