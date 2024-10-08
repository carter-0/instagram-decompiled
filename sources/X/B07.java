package X;

public final class B07 extends 0Yg implements 0sK {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r11.equals("glitch_transition") != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r11.equals(r0) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            r5 = r10
            int r0 = r9.A00
            if (r0 == 0) goto L_0x002d
            byte[] r5 = (byte[]) r5
            int r8 = X.AnonymousClass7TE.A0M(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            byte r6 = r12.byteValue()
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r2 = r9.A03
            X.74t r2 = (X.C3259374t) r2
            java.lang.Object r3 = r9.A02
            X.OKk r3 = (X.C70764OKk) r3
            int r7 = r9.A01
            X.4Cq r0 = r2.A05
            r4 = 0
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1 r1 = new com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r1, r0)
        L_0x002a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002d:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r11 = (java.lang.String) r11
            boolean r4 = X.AnonymousClass7TE.A1a(r12)
            if (r5 == 0) goto L_0x003d
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0048
        L_0x003d:
            java.lang.Object r1 = r9.A02
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131955950(0x7f1310ee, float:1.9548442E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x0048:
            X.0qQ.A0A(r5)
            java.lang.Object r0 = r9.A03
            X.JlL r0 = (X.C60428JlL) r0
            X.8RF r1 = r0.A07
            int r3 = r9.A01
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.2Fj r2 = r1.A06
            if (r4 == 0) goto L_0x0079
            java.lang.Object r0 = r2.A02()
            X.88W r0 = (X.AnonymousClass88W) r0
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r0.A01
            X.L7y r0 = (X.C63817L7y) r0
            if (r0 == 0) goto L_0x0082
            java.lang.String r11 = r0.A01
        L_0x006b:
            X.L7y r1 = new X.L7y
            r1.<init>(r5, r11, r3, r4)
            X.88W r0 = new X.88W
            r0.<init>(r1)
            r2.A0B(r0)
            goto L_0x002a
        L_0x0079:
            if (r11 == 0) goto L_0x0082
            int r0 = r11.hashCode()
            switch(r0) {
                case -936195220: goto L_0x0084;
                case -123266003: goto L_0x0087;
                case 139481759: goto L_0x008a;
                case 717581682: goto L_0x0093;
                case 1296567617: goto L_0x0096;
                case 2000782950: goto L_0x0099;
                default: goto L_0x0082;
            }
        L_0x0082:
            r11 = 0
            goto L_0x006b
        L_0x0084:
            java.lang.String r0 = "warp_transition"
            goto L_0x009b
        L_0x0087:
            java.lang.String r0 = "blur_transition"
            goto L_0x009b
        L_0x008a:
            java.lang.String r0 = "glitch_transition"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0082
            goto L_0x006b
        L_0x0093:
            java.lang.String r0 = "spin_transition"
            goto L_0x009b
        L_0x0096:
            java.lang.String r0 = "zoom_transition"
            goto L_0x009b
        L_0x0099:
            java.lang.String r0 = "flare_transition"
        L_0x009b:
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x006b
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B07.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B07(int i, int i2, Object obj, Object obj2) {
        super(3);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }
}
