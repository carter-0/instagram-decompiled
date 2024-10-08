package X;

public final class MF2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MF2(Object obj, Object obj2, Object obj3, String str, String str2, String str3, AnonymousClass4D7 r8, int i, int i2) {
        super(2, r8);
        this.A01 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A06 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A04 = obj3;
        this.A07 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.MF2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Object obj2;
        String str;
        int i;
        String str2;
        Object obj3;
        String str3;
        int i2;
        int i3 = this.A01;
        Object obj4 = this.A05;
        AnonymousClass4D7 r7 = r12;
        if (i3 != 0) {
            str = this.A06;
            str2 = this.A08;
            obj3 = this.A04;
            i = this.A02;
            str3 = this.A07;
            obj2 = this.A03;
            i2 = 1;
        } else {
            obj2 = this.A03;
            str = this.A06;
            i = this.A02;
            str2 = this.A08;
            obj3 = this.A04;
            str3 = this.A07;
            i2 = 0;
        }
        return new MF2(obj4, obj2, obj3, str, str2, str3, r7, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.0r6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.0r6} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MF2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r8 = r24
            int r1 = r0.A01
            if (r1 == 0) goto L_0x00ff
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 == r6) goto L_0x0020
            X.0eS.A00(r8)
        L_0x0015:
            java.lang.Object r1 = r0.A05
            X.83A r1 = (X.AnonymousClass83A) r1
            java.lang.String r0 = r0.A06
            r1.A00 = r0
        L_0x001d:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0020:
            X.0eS.A00(r8)
            goto L_0x009c
        L_0x0024:
            X.0eS.A00(r8)
            java.lang.Object r11 = r0.A05
            X.83A r11 = (X.AnonymousClass83A) r11
            java.util.Map r8 = r11.A02
            java.lang.String r14 = r0.A06
            boolean r2 = r8.containsKey(r14)
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r10 = r8.get(r14)
            if (r10 == 0) goto L_0x0135
            X.JvY r10 = (X.C61034JvY) r10
            java.lang.String r4 = r10.A06
            java.lang.String r15 = r0.A08
            boolean r2 = X.00p.A0j(r4, r15, r6)
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r3 = r10.A03
            java.lang.Object r2 = r0.A04
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r9 = r10.A02
            X.8fx r9 = (X.C361278fx) r9
        L_0x0055:
            java.lang.String r5 = r10.A05
            int r4 = r0.A02
            java.lang.Object r13 = r0.A04
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r13 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r13
            java.lang.String r3 = r10.A04
            X.Dba.A0j(r6, r3, r15)
            X.0qQ.A0B(r5, r7)
            r2 = 3
            X.DbW.A1N(r9, r2, r13)
            X.JvY r2 = new X.JvY
            r18 = r13
            r19 = r3
            r20 = r15
            r21 = r5
            r22 = r4
            r17 = r9
            r16 = r2
            r16.<init>((X.C361278fx) r17, (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (int) r22)
        L_0x007c:
            r8.put(r14, r2)
            X.AnonymousClass83A.A00(r11, r8)
            java.lang.Object r2 = r2.A02
            X.8fx r2 = (X.C361278fx) r2
            int r2 = r2.A00
            if (r2 != 0) goto L_0x0015
            java.lang.Object r12 = r0.A03
            r0.A00 = r6
            r16 = 0
            r17 = 3
            X.MGS r10 = new X.MGS
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.05E r8 = new X.05E
            r8.<init>(r10)
        L_0x009c:
            X.0r6 r8 = (X.AnonymousClass0r6) r8
            java.lang.Object r6 = r0.A05
            java.lang.String r5 = r0.A06
            r4 = 0
            r3 = 7
            X.JaI r2 = new X.JaI
            r2.<init>((java.lang.Object) r6, (java.lang.String) r5, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r7
            java.lang.Object r2 = X.AnonymousClass11O.A00(r0, r2, r8)
            if (r2 != r1) goto L_0x0015
            return r1
        L_0x00b2:
            X.839 r3 = r11.A01
            r2 = 0
            X.0qQ.A0B(r4, r2)
            java.io.File r2 = r3.A00(r4)
            X.JTR.A1O(r2)     // Catch:{ IOException | SecurityException -> 0x00bf }
        L_0x00bf:
            X.8fw r9 = X.C361268fw.A00
            goto L_0x0055
        L_0x00c2:
            X.839 r2 = r11.A01
            java.io.File r9 = r2.A00(r14)
            boolean r3 = r9.exists()
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x00d4
            java.lang.String r5 = r0.A07
            if (r5 != 0) goto L_0x00d5
        L_0x00d4:
            r5 = r2
        L_0x00d5:
            boolean r2 = r9.exists()
            if (r2 == 0) goto L_0x00fc
            X.8Y4 r4 = new X.8Y4
            r4.<init>(r9)
        L_0x00e0:
            java.lang.String r15 = r0.A08
            int r3 = r0.A02
            java.lang.Object r13 = r0.A04
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r13 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r13
            X.JvY r2 = new X.JvY
            r18 = r13
            r19 = r14
            r20 = r15
            r21 = r5
            r22 = r3
            r17 = r4
            r16 = r2
            r16.<init>((X.C361278fx) r17, (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (int) r22)
            goto L_0x007c
        L_0x00fc:
            X.8fw r4 = X.C361268fw.A00
            goto L_0x00e0
        L_0x00ff:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x010d
            if (r2 != r11) goto L_0x013a
            X.0eS.A00(r8)
            goto L_0x001d
        L_0x010d:
            X.0eS.A00(r8)
            java.lang.Object r2 = r0.A05
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r2 = (com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore) r2
            X.83A r3 = r2.A0A
            java.lang.Object r4 = r0.A03
            java.lang.String r6 = r0.A06
            int r10 = r0.A02
            java.lang.String r7 = r0.A08
            java.lang.Object r5 = r0.A04
            java.lang.String r8 = r0.A07
            r0.A00 = r11
            r9 = 0
            X.MF2 r2 = new X.MF2
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.19E.A00(r0, r2)
            if (r0 == r1) goto L_0x0132
            X.0gF r0 = X.C60340gF.A00
        L_0x0132:
            if (r0 != r1) goto L_0x001d
            return r1
        L_0x0135:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MF2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MF2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
