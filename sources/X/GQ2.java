package X;

public final class GQ2 extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GQ2(long j, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01b2, code lost:
        r2.setGroupEffectStatus(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return java.lang.Boolean.valueOf(X.C51970G9q.A1T((r3 > r0.A01 ? 1 : (r3 == r0.A01 ? 0 : -1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0268, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r7 = r21
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0027;
                case 1: goto L_0x004b;
                case 2: goto L_0x0060;
                case 3: goto L_0x0060;
                case 4: goto L_0x0077;
                case 5: goto L_0x0091;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b8;
                case 8: goto L_0x0100;
                case 9: goto L_0x0114;
                case 10: goto L_0x0143;
                case 11: goto L_0x0183;
                case 12: goto L_0x0193;
                case 13: goto L_0x01a3;
                case 14: goto L_0x01b7;
                case 15: goto L_0x01c6;
                case 16: goto L_0x01f3;
                case 17: goto L_0x021f;
                case 18: goto L_0x0269;
                case 19: goto L_0x0009;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x001e;
                case 24: goto L_0x0287;
                case 25: goto L_0x001e;
                case 26: goto L_0x0287;
                case 27: goto L_0x001e;
                case 28: goto L_0x0287;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.GlJ r7 = (X.C53271GlJ) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r3 = r7.A00
        L_0x0011:
            long r1 = r0.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x001e:
            X.QP4 r7 = (X.QP4) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r3 = r7.A00
            goto L_0x0011
        L_0x0027:
            X.6GH r7 = (X.AnonymousClass6GH) r7
            X.5VC r1 = r7.A00
            long r1 = r1.Bwg()
            float r4 = X.C288025bF.A02(r1)
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            X.60f r3 = X.C56607I4g.A00(r7, r4)
            long r0 = r0.A01
            X.5bV r2 = X.C51968G9o.A0R(r0)
            r1 = 3
            X.Iwv r0 = new X.Iwv
            r0.<init>(r2, r3, r4, r1)
            X.64W r6 = r7.A00(r0)
            return r6
        L_0x004b:
            X.5SW r7 = (X.AnonymousClass5SW) r7
            X.5Sb r1 = X.C55298HfR.A00
            X.HL1 r9 = X.HL1.Cursor
            long r11 = r0.A01
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r13 = 1
            X.Ht4 r8 = new X.Ht4
            r8.<init>(r9, r10, r11, r13)
            r7.ENH(r1, r8)
            goto L_0x0266
        L_0x0060:
            java.util.concurrent.Future r7 = (java.util.concurrent.Future) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r2 = r0.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r6 = r7.get(r2, r0)
            X.0qQ.A07(r6)
            return r6
        L_0x0077:
            X.0xe r7 = (X.C63010xe) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r1 = r0.A01
            X.4Dd r3 = r7.A00
            java.lang.String r0 = "last_bug_report_id"
            r3.E5b(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "last_bug_report_unixtime"
            r3.E5b(r0, r1)
            goto L_0x0266
        L_0x0091:
            X.5Q3 r2 = X.C51968G9o.A0T(r7)
            long r8 = r0.A01
            r3 = 0
            long r0 = r2.Bwg()
            float r5 = X.C288025bF.A01(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            long r10 = r2.AmQ()
            r6 = 1065353216(0x3f800000, float:1.0)
            X.5dw r4 = X.C289635dw.A00
            r7 = 3
            r2.AQV(r3, r4, r5, r6, r7, r8, r10)
            goto L_0x0266
        L_0x00b1:
            long r0 = r0.A01
            X.5d8 r6 = X.C51974G9v.A04(r0)
            return r6
        L_0x00b8:
            com.facebook.msys.mca.MailboxFeature r7 = (com.facebook.msys.mca.MailboxFeature) r7
            r5 = 0
            X.0qQ.A0B(r7, r5)
            long r0 = r0.A01
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            X.68J r1 = r7.mMailboxApiHandleMetaProvider
            r0 = 2
            X.68L r4 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r6 = new com.facebook.msys.mca.MailboxFutureImpl
            r6.<init>(r4)
            r0 = 247(0xf7, float:3.46E-43)
            java.lang.String r3 = X.C66579MXk.A00(r0)
            r0 = 826(0x33a, float:1.157E-42)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            int r9 = X.C3030067a.A00(r6)
            com.facebook.msys.mci.TraceInfo r1 = X.C3030067a.A01(r6, r3, r2)
            X.Ooh r8 = new X.Ooh
            r10 = r5
            r11 = r7
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            boolean r0 = r4.EJd(r8)
            if (r0 != 0) goto L_0x00fb
            r6.cancel(r5)
            X.C3030067a.A02(r9)
            X.C3030067a.A03(r1, r3, r2)
        L_0x00fb:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            return r6
        L_0x0100:
            java.lang.String r1 = "fetch proactive warning banner"
            X.4fh r4 = X.AnonymousClass6F9.A00(r1)
            long r2 = r0.A01
            r1 = 10
            X.Owl r0 = new X.Owl
            r0.<init>(r7, r2, r1)
            X.1aU r6 = X.1aU.A07(r0, r4)
            return r6
        L_0x0114:
            X.6GH r7 = (X.AnonymousClass6GH) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r1 = X.AnonymousClass5RW.A07
            X.5RW r2 = X.C51965G9l.A0N(r1)
            long r0 = r0.A01
            java.util.List r4 = X.G9t.A1D(r2, r0)
            r2 = 1103626240(0x41c80000, float:25.0)
            r1 = 2139095040(0x7f800000, float:Infinity)
            r0 = 0
            long r2 = X.C289325dP.A00(r2, r0)
            long r0 = X.C289325dP.A00(r1, r0)
            X.Gey r2 = X.C304796Fg.A00(r4, r2, r0)
            r1 = 18
            X.G4S r0 = new X.G4S
            r0.<init>(r2, r1)
            X.64W r6 = r7.A00(r0)
            return r6
        L_0x0143:
            X.5Q3 r7 = (X.AnonymousClass5Q3) r7
            r13 = 0
            X.0qQ.A0B(r7, r13)
            r2 = 2
            r1 = 1073741824(0x40000000, float:2.0)
            float r11 = r7.F06(r1)
            float[] r3 = new float[r2]
            r3 = {1090519040, 1090519040} // fill-array
            r2 = 0
            android.graphics.DashPathEffect r1 = new android.graphics.DashPathEffect
            r1.<init>(r3, r2)
            X.IFz r10 = new X.IFz
            r10.<init>(r1)
            r8 = 0
            r12 = 1082130432(0x40800000, float:4.0)
            X.5tg r9 = new X.5tg
            r14 = r13
            r9.<init>(r10, r11, r12, r13, r14)
            r1 = 1090519040(0x41000000, float:8.0)
            float r1 = r7.F06(r1)
            long r18 = X.AnonymousClass6GR.A00(r1, r1)
            long r12 = r0.A01
            r14 = 0
            long r16 = X.C51968G9o.A0H(r7)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 3
            r7.AQv(r8, r9, r10, r11, r12, r14, r16, r18)
            goto L_0x0266
        L_0x0183:
            X.NDr r2 = X.C51971G9r.A0i(r7)
            long r0 = r0.A01
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r2 = r2.A00
            if (r2 == 0) goto L_0x0266
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3
            goto L_0x01b2
        L_0x0193:
            X.NDr r2 = X.C51971G9r.A0i(r7)
            long r0 = r0.A01
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r2 = r2.A00
            if (r2 == 0) goto L_0x0266
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4
            goto L_0x01b2
        L_0x01a3:
            X.NDr r2 = X.C51971G9r.A0i(r7)
            long r0 = r0.A01
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r2 = r2.A00
            if (r2 == 0) goto L_0x0266
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 5
        L_0x01b2:
            r2.setGroupEffectStatus(r1, r0)
            goto L_0x0266
        L_0x01b7:
            X.NDr r3 = X.C51971G9r.A0i(r7)
            long r1 = r0.A01
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r0 = r3.A00
            if (r0 == 0) goto L_0x0266
            r0.participantModuleInitialize(r1)
            goto L_0x0266
        L_0x01c6:
            X.NDr r5 = X.C51971G9r.A0i(r7)
            long r3 = r0.A01
            java.lang.Long r0 = r5.A04
            if (r0 == 0) goto L_0x01da
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01da
            goto L_0x0266
        L_0x01da:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A04 = r0
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r0 = r5.A00
            if (r0 == 0) goto L_0x01e7
            r0.participantModuleInitialize(r3)
        L_0x01e7:
            X.IHe r1 = new X.IHe
            r1.<init>(r5)
            r5.A02 = r1
            X.AR0 r0 = r5.A07
            r0.A01 = r1
            goto L_0x0266
        L_0x01f3:
            X.NDr r5 = X.C51971G9r.A0i(r7)
            long r3 = r0.A01
            java.lang.Long r0 = r5.A03
            if (r0 == 0) goto L_0x0206
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0206
            goto L_0x0266
        L_0x0206:
            X.IHd r1 = new X.IHd
            r1.<init>(r5)
            r5.A01 = r1
            X.AR0 r0 = r5.A07
            r0.A00 = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A03 = r0
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r0 = r5.A00
            if (r0 == 0) goto L_0x0266
            r0.multipeerStartListening(r3)
            goto L_0x0266
        L_0x021f:
            X.5Q3 r5 = X.C51968G9o.A0T(r7)
            r1 = 1108344832(0x42100000, float:36.0)
            float r2 = r5.F06(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = r5.F06(r1)
            long r14 = X.C288015bE.A00(r2, r1)
            long r1 = r5.AmQ()
            float r4 = X.C289295dM.A01(r1)
            float r1 = X.C288025bF.A02(r14)
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r4 = r4 - r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r2 = r5.F06(r1)
            float r1 = X.C288025bF.A00(r14)
            float r2 = r2 - r1
            long r12 = X.C289325dP.A00(r4, r2)
            float r1 = X.C288025bF.A01(r14)
            float r1 = r1 / r3
            long r10 = r0.A01
            long r16 = X.AnonymousClass6GR.A00(r1, r1)
            r6 = 0
            X.5dw r7 = X.C289635dw.A00
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 3
            r5.AQv(r6, r7, r8, r9, r10, r12, r14, r16)
        L_0x0266:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0269:
            int r7 = X.AnonymousClass7TE.A0M(r7)
            long r0 = r0.A01
            int r0 = X.C245073cH.A00(r0)
            int r6 = r0 / 2
            double r4 = (double) r6
            double r2 = (double) r7
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0282
            r7 = r6
        L_0x0282:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            return r6
        L_0x0287:
            X.9c4 r7 = (X.C381629c4) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            long r3 = r7.A01
            long r1 = r0.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQ2.invoke(java.lang.Object):java.lang.Object");
    }
}
