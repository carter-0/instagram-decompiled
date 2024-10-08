package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.PbL  reason: case insensitive filesystem */
public final class C73362PbL implements Runnable {
    public final /* synthetic */ C61055Jvt A00;
    public final /* synthetic */ C70620ODr A01;
    public final /* synthetic */ C3259274s A02;
    public final /* synthetic */ DirectMessageIdentifier A03;

    public C73362PbL(C61055Jvt jvt, C70620ODr oDr, C3259274s r3, DirectMessageIdentifier directMessageIdentifier) {
        this.A00 = jvt;
        this.A02 = r3;
        this.A03 = directMessageIdentifier;
        this.A01 = oDr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
        if (X.182.A06(r5, ((X.C301265yp) r6.getValue()).A00, 36325527720178707L) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
        if (X.182.A06(X.0Tu.A05, ((X.C301265yp) r3.A01.getValue()).A00, 36325527720375317L) == false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            X.Jvt r4 = r15.A00
            java.lang.String r0 = r4.A02
            java.lang.String r11 = X.DbV.A12(r0)
            int r0 = r11.length()
            if (r0 != 0) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.N4D r9 = new X.N4D
            r9.<init>(r0)
            java.lang.String r5 = "Empty transcription generated."
        L_0x0017:
            X.74s r8 = r15.A02
            com.instagram.model.direct.messageid.DirectMessageIdentifier r7 = r15.A03
            r8.FJr(r9, r7)
            X.ODr r1 = r15.A01
            java.lang.String r3 = r9.A03
            if (r3 == 0) goto L_0x0097
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0097
            X.Man r0 = r1.A01
            r0.A02(r7)
        L_0x002f:
            X.74o r0 = r1.A00
            X.7GP r6 = r0.A05
            X.7Fq r0 = r1.A02
            int r0 = r0.A00
            long r0 = (long) r0
            long r1 = X.AnonymousClass7TE.A0P(r0)
            if (r3 == 0) goto L_0x0094
            java.lang.String r0 = " "
            java.util.List r0 = X.DbV.A18(r3, r0)
            if (r0 == 0) goto L_0x0094
            int r0 = r0.size()
            long r3 = (long) r0
        L_0x004b:
            java.lang.String r9 = r9.A02
            X.0wc r6 = r6.A00
            java.lang.String r0 = "audio_clips_transcription_complete"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r6, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0075
            X.C66583MXo.A12(r6, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "word_count"
            r6.A9F(r0, r1)
            if (r9 == 0) goto L_0x0072
            r0 = 3487(0xd9f, float:4.886E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.AAJ(r0, r9)
        L_0x0072:
            r6.Cgf()
        L_0x0075:
            X.930 r4 = r8.A00
            if (r4 == 0) goto L_0x0093
            int r3 = r7.hashCode()
            r2 = 331815788(0x13c71b6c, float:5.0261703E-27)
            if (r5 == 0) goto L_0x008d
            X.02m r1 = r4.A00
            r0 = 60
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.markerAnnotate(r2, r3, r0, r5)
        L_0x008d:
            X.02m r1 = r4.A00
            r0 = 2
            r1.markerEnd(r2, r3, r0)
        L_0x0093:
            return
        L_0x0094:
            r3 = 0
            goto L_0x004b
        L_0x0097:
            X.Man r0 = r1.A01
            r0.A01(r9, r7)
            goto L_0x002f
        L_0x009d:
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            X.74s r3 = r15.A02
            java.lang.Object r0 = r4.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00d8
            double r7 = r0.doubleValue()
            X.0eM r6 = r3.A01
            java.lang.Object r0 = r6.getValue()
            X.5yp r0 = (X.C301265yp) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 37169952650232319(0x840de0000901ff, double:3.5697659551682235E-306)
            double r1 = X.182.A00(r5, r2, r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            java.lang.Object r0 = r6.getValue()
            X.5yp r0 = (X.C301265yp) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36325527720178707(0x810de0000a3413, double:3.035748229176048E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            r13 = 1
            if (r0 != 0) goto L_0x00d9
        L_0x00d8:
            r13 = 0
        L_0x00d9:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x00f5
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.5yp r0 = (X.C301265yp) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325527720375317(0x810de0000d3415, double:3.035748229300385E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r14 = 1
            if (r0 != 0) goto L_0x00f6
        L_0x00f5:
            r14 = 0
        L_0x00f6:
            java.lang.String r12 = r4.A01
            X.N4D r9 = new X.N4D
            r9.<init>((java.lang.Integer) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13, (boolean) r14)
            r5 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73362PbL.run():void");
    }
}
