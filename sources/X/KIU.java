package X;

public final class KIU extends 0ng {
    public final /* synthetic */ C64144LQg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIU(C64144LQg lQg) {
        super(1907234631, 3, false, false);
        this.A00 = lQg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r13 <= r14) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r10 = r18
            X.LQg r9 = r10.A00     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            X.L6K r1 = r9.A04     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            if (r1 == 0) goto L_0x016b
            java.lang.String r0 = r1.A00     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            r17 = r0
            java.lang.String r11 = r1.A01     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            int r0 = r9.A00     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            byte[] r8 = new byte[r0]     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            java.io.File r16 = X.AnonymousClass7TE.A0t(r17)     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            java.io.FileOutputStream r0 = X.JTO.A0t(r16)     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
        L_0x001f:
            boolean r0 = r9.A05     // Catch:{ IOException -> 0x014d }
            r6 = 0
            if (r0 == 0) goto L_0x00bb
            android.media.AudioRecord r0 = r9.A02     // Catch:{ IOException -> 0x014d }
            if (r0 == 0) goto L_0x00bb
            r1 = 1
            int r0 = r0.getState()     // Catch:{ IOException -> 0x014d }
            if (r0 != r1) goto L_0x00bb
            android.media.AudioRecord r1 = r9.A02     // Catch:{ IOException -> 0x014d }
            if (r1 == 0) goto L_0x001f
            int r0 = r9.A00     // Catch:{ IOException -> 0x014d }
            int r0 = r1.read(r8, r6, r0)     // Catch:{ IOException -> 0x014d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x014d }
            if (r0 == 0) goto L_0x001f
            int r5 = r0.intValue()     // Catch:{ IOException -> 0x014d }
            if (r5 < 0) goto L_0x00b5
            r15 = 2
            if (r5 < r15) goto L_0x001f
            X.L6K r4 = r9.A04     // Catch:{ IOException -> 0x014d }
            if (r4 == 0) goto L_0x00ad
            X.2HY r0 = X.C229632nm.A0C(r6, r5)     // Catch:{ IOException -> 0x014d }
            X.2HZ r0 = X.C229632nm.A0B(r0, r15)     // Catch:{ IOException -> 0x014d }
            int r14 = r0.A00     // Catch:{ IOException -> 0x014d }
            int r13 = r0.A01     // Catch:{ IOException -> 0x014d }
            int r12 = r0.A02     // Catch:{ IOException -> 0x014d }
            r2 = 0
            if (r12 <= 0) goto L_0x0061
            if (r14 <= r13) goto L_0x0065
            goto L_0x0085
        L_0x0061:
            if (r12 >= 0) goto L_0x0085
            if (r13 > r14) goto L_0x0085
        L_0x0065:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r15)     // Catch:{ IOException -> 0x014d }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x014d }
            r1.order(r0)     // Catch:{ IOException -> 0x014d }
            byte r0 = r8[r14]     // Catch:{ IOException -> 0x014d }
            r1.put(r0)     // Catch:{ IOException -> 0x014d }
            int r0 = r14 + 1
            byte r0 = r8[r0]     // Catch:{ IOException -> 0x014d }
            r1.put(r0)     // Catch:{ IOException -> 0x014d }
            short r0 = r1.getShort(r6)     // Catch:{ IOException -> 0x014d }
            int r0 = r0 * r0
            long r0 = (long) r0     // Catch:{ IOException -> 0x014d }
            long r2 = r2 + r0
            if (r14 == r13) goto L_0x0085
            int r14 = r14 + r12
            goto L_0x0065
        L_0x0085:
            int r0 = r5 / r15
            long r0 = (long) r0     // Catch:{ IOException -> 0x014d }
            long r2 = r2 / r0
            double r0 = (double) r2     // Catch:{ IOException -> 0x014d }
            double r0 = java.lang.Math.sqrt(r0)     // Catch:{ IOException -> 0x014d }
            float r2 = (float) r0     // Catch:{ IOException -> 0x014d }
            double r0 = (double) r2     // Catch:{ IOException -> 0x014d }
            double r0 = java.lang.Math.log(r0)     // Catch:{ IOException -> 0x014d }
            float r2 = (float) r0     // Catch:{ IOException -> 0x014d }
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r2 * r0
            r0 = 1070224481(0x3fca5461, float:1.5807)
            float r2 = r2 - r0
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.0mi.A00(r2, r1, r0)     // Catch:{ IOException -> 0x014d }
            java.util.List r1 = r4.A02     // Catch:{ IOException -> 0x014d }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x014d }
            r1.add(r0)     // Catch:{ IOException -> 0x014d }
        L_0x00ad:
            r7.write(r8, r6, r5)     // Catch:{ IOException -> 0x014d }
            r7.flush()     // Catch:{ IOException -> 0x014d }
            goto L_0x001f
        L_0x00b5:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x014d }
            r0.<init>()     // Catch:{ IOException -> 0x014d }
            throw r0     // Catch:{ IOException -> 0x014d }
        L_0x00bb:
            r7.close()     // Catch:{ IOException -> 0x014d }
            boolean r0 = r9.A06     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            if (r0 == 0) goto L_0x00c5
            r9.A06 = r6     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            goto L_0x0143
        L_0x00c5:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = r17
            r2.<init>(r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.<init>(r11)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            long r0 = r0.size()     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            int r5 = (int) r0     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.lang.String r0 = "RIFF"
            X.C64144LQg.A01(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            int r0 = r5 + 36
            X.C64144LQg.A00(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.lang.String r0 = "WAVE"
            X.C64144LQg.A01(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.lang.String r0 = "fmt "
            X.C64144LQg.A01(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r1 = 16
            X.C64144LQg.A00(r3, r1)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = 1
            r3.write(r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r6)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r6)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = 44100(0xac44, float:6.1797E-41)
            X.C64144LQg.A00(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = 88200(0x15888, float:1.23595E-40)
            X.C64144LQg.A00(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = 2
            r3.write(r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r6)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r1)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.write(r6)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            java.lang.String r0 = "data"
            X.C64144LQg.A01(r3, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            X.C64144LQg.A00(r3, r5)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
        L_0x0125:
            int r0 = r9.A00     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            int r1 = r2.read(r4, r6, r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0 = -1
            if (r1 == r0) goto L_0x0135
            r3.write(r4, r6, r1)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.flush()     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            goto L_0x0125
        L_0x0135:
            r2.close()     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r3.close()     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            X.M38 r0 = new X.M38     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
            X.11Z.A02(r0)     // Catch:{ IOException -> 0x0149, FileNotFoundException -> 0x0147 }
        L_0x0143:
            r16.delete()     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            return
        L_0x0147:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014b }
        L_0x0149:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            goto L_0x0151
        L_0x014d:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
        L_0x0151:
            r16.delete()     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
            throw r0     // Catch:{ IOException -> 0x0155, FileNotFoundException -> 0x015e }
        L_0x0155:
            r1 = move-exception
            X.LQg r0 = r10.A00
            X.M6u r2 = new X.M6u
            r2.<init>(r0, r1)
            goto L_0x0166
        L_0x015e:
            r1 = move-exception
            X.LQg r0 = r10.A00
            X.M6v r2 = new X.M6v
            r2.<init>(r0, r1)
        L_0x0166:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.11Z.A02(r2)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIU.run():void");
    }
}
