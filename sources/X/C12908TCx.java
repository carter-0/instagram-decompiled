package X;

/* renamed from: X.TCx  reason: case insensitive filesystem */
public final class C12908TCx implements Runnable {
    public final /* synthetic */ C10833Ryt A00;

    public C12908TCx(C10833Ryt ryt) {
        this.A00 = ryt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x019d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01a1, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.Ryt r0 = r0.A00
            X.SJb r6 = r0.A07     // Catch:{ all -> 0x01a2 }
            java.lang.String r5 = r0.A08     // Catch:{ all -> 0x01a2 }
            long r2 = r0.A02     // Catch:{ all -> 0x01a2 }
            r4 = 0
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = "preview_audio_"
            r7.append(r1)     // Catch:{ all -> 0x01a2 }
            r7.append(r5)     // Catch:{ all -> 0x01a2 }
            r1 = 95
            r7.append(r1)     // Catch:{ all -> 0x01a2 }
            r7.append(r2)     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = ".wav"
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r1, r7)     // Catch:{ all -> 0x01a2 }
            java.util.Map r1 = X.C11283SJb.A06     // Catch:{ all -> 0x01a2 }
            java.io.File r2 = r6.A01     // Catch:{ all -> 0x01a2 }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x01a2 }
            if (r1 != 0) goto L_0x0033
            r2.mkdir()     // Catch:{ all -> 0x01a2 }
        L_0x0033:
            java.io.File r1 = X.JTO.A0s(r2, r3)     // Catch:{ all -> 0x01a2 }
            r1.getCanonicalPath()     // Catch:{ all -> 0x01a2 }
            java.io.FileOutputStream r1 = X.JTO.A0t(r1)     // Catch:{ all -> 0x01a2 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ all -> 0x01a2 }
            r3.<init>(r1)     // Catch:{ all -> 0x01a2 }
            r6.A03(r5)     // Catch:{ all -> 0x01a2 }
            int r1 = r0.A01     // Catch:{ all -> 0x019b }
            int r8 = r1 / 2
            short[] r9 = new short[r8]     // Catch:{ all -> 0x019b }
            r7 = 0
            r10 = 0
        L_0x004e:
            if (r10 >= r8) goto L_0x0065
            byte[] r6 = r0.A0A     // Catch:{ all -> 0x019b }
            int r5 = r10 * 2
            byte r1 = r6[r5]     // Catch:{ all -> 0x019b }
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r5 + 1
            byte r1 = r6[r1]     // Catch:{ all -> 0x019b }
            int r1 = r1 << 8
            int r2 = r2 + r1
            short r1 = (short) r2     // Catch:{ all -> 0x019b }
            r9[r10] = r1     // Catch:{ all -> 0x019b }
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0065:
            byte[] r6 = new byte[r8]     // Catch:{ all -> 0x019b }
        L_0x0067:
            if (r7 >= r8) goto L_0x007d
            short r5 = r9[r7]     // Catch:{ all -> 0x019b }
            int r2 = r7 + 1
            short r1 = r9[r2]     // Catch:{ all -> 0x019b }
            int r5 = r5 + r1
            int r1 = r5 / 2
            X.Pxe.A1H(r1, r6, r7)     // Catch:{ all -> 0x019b }
            int r1 = r1 >> 8
            X.Pxe.A1H(r1, r6, r2)     // Catch:{ all -> 0x019b }
            int r7 = r7 + 2
            goto L_0x0067
        L_0x007d:
            r1 = 44
            byte[] r5 = new byte[r1]     // Catch:{ all -> 0x019b }
            int r11 = r8 + 36
            X.SEV r1 = r0.A03     // Catch:{ all -> 0x019b }
            int r10 = r1.A01     // Catch:{ all -> 0x019b }
            r16 = 16
            int r9 = r10 * 16
            r12 = 8
            int r9 = r9 / r12
            r1 = 82
            r5[r4] = r1     // Catch:{ all -> 0x019b }
            r1 = 73
            r15 = 1
            r5[r15] = r1     // Catch:{ all -> 0x019b }
            r14 = 2
            r2 = 70
            r5[r14] = r2     // Catch:{ all -> 0x019b }
            r1 = 3
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = r11 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 4
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r11 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 5
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r11 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 6
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r7 = 24
            int r11 = r11 >> r7
            r1 = r11 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 7
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = 87
            r5[r12] = r1     // Catch:{ all -> 0x019b }
            r2 = 9
            r1 = 65
            r5[r2] = r1     // Catch:{ all -> 0x019b }
            r2 = 10
            r1 = 86
            r5[r2] = r1     // Catch:{ all -> 0x019b }
            r2 = 11
            r1 = 69
            r5[r2] = r1     // Catch:{ all -> 0x019b }
            r2 = 12
            r1 = 102(0x66, float:1.43E-43)
            r5[r2] = r1     // Catch:{ all -> 0x019b }
            r2 = 13
            r1 = 109(0x6d, float:1.53E-43)
            r5[r2] = r1     // Catch:{ all -> 0x019b }
            r1 = 14
            r13 = 116(0x74, float:1.63E-43)
            r5[r1] = r13     // Catch:{ all -> 0x019b }
            r1 = 15
            r12 = 32
            r5[r1] = r12     // Catch:{ all -> 0x019b }
            r5[r16] = r16     // Catch:{ all -> 0x019b }
            r1 = 17
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r1 = 18
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r1 = 19
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r1 = 20
            r5[r1] = r15     // Catch:{ all -> 0x019b }
            r1 = 21
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r1 = 22
            r5[r1] = r15     // Catch:{ all -> 0x019b }
            r1 = 23
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            X.Pxe.A1H(r10, r5, r7)     // Catch:{ all -> 0x019b }
            int r1 = r10 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 25
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r10 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 26
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r10 = r10 >> r7
            r1 = r10 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 27
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = r9 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 28
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r9 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 29
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r9 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 30
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r9 = r9 >> r7
            r1 = r9 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 31
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r5[r12] = r14     // Catch:{ all -> 0x019b }
            r1 = 33
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r1 = 34
            r5[r1] = r16     // Catch:{ all -> 0x019b }
            r1 = 35
            r5[r1] = r4     // Catch:{ all -> 0x019b }
            r2 = 100
            r1 = 36
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = 37
            r2 = 97
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = 38
            r5[r1] = r13     // Catch:{ all -> 0x019b }
            r1 = 39
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r1 = r8 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 40
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r8 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 41
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r1 = r8 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 42
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            int r8 = r8 >> r7
            r1 = r8 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x019b }
            r1 = 43
            r5[r1] = r2     // Catch:{ all -> 0x019b }
            r3.write(r5)     // Catch:{ all -> 0x019b }
            r3.write(r6)     // Catch:{ all -> 0x019b }
            r0.A04 = r15     // Catch:{ all -> 0x019b }
            r0.A05 = r4     // Catch:{ all -> 0x019b }
            r3.close()     // Catch:{ all -> 0x01a2 }
            X.0gF r4 = X.C60340gF.A00     // Catch:{ all -> 0x01a2 }
            goto L_0x01a7
        L_0x019b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x019d }
        L_0x019d:
            r1 = move-exception
            X.1zE.A00(r3, r2)     // Catch:{ all -> 0x01a2 }
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r1 = move-exception
            X.0eQ r4 = X.JTO.A1B(r1)
        L_0x01a7:
            java.lang.Throwable r12 = X.0eR.A00(r4)
            java.lang.String r3 = "bytes_recorded"
            if (r12 == 0) goto L_0x01e2
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Exception while  writing the buffer to the file "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r12, r1, r2)
            java.lang.String r1 = "MediaAccuracyAudioCapture"
            X.0KC.A0C(r1, r2)
            X.S5Y r5 = r0.A06
            java.lang.Integer r6 = X.AnonymousClass05K.A05
            java.lang.String r9 = r0.A08
            int r1 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.Map r14 = X.AnonymousClass7TF.A0w(r3, r1)
            long r1 = r0.A02
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r10 = 0
            java.lang.String r11 = "Failed while saving bytes into a wav file."
            r13 = r10
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            r0.A01 = r1
            r0.A00 = r1
        L_0x01e2:
            boolean r1 = r4 instanceof X.0eQ
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0209
            X.S5Y r4 = r0.A06
            java.lang.Integer r5 = X.AnonymousClass05K.A06
            java.lang.String r8 = r0.A08
            int r1 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.Map r10 = X.AnonymousClass7TF.A0w(r3, r1)
            long r1 = r0.A02
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r9 = 0
            r4.A02(r5, r6, r7, r8, r9, r10)
            r1 = 0
            r0.A01 = r1
            r0.A00 = r1
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12908TCx.run():void");
    }
}
