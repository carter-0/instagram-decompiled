package X;

import java.util.Locale;

public abstract class Y2B implements Runnable {
    public final String A00;

    public Y2B(String str, Object... objArr) {
        C22023Xt4 xt4 = SUS.A04;
        this.A00 = String.format(Locale.US, str, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fb, code lost:
        r7 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0145, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r0 = X.AnonymousClass05K.A01;
        r11.A05(r3, r0, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x038f A[Catch:{ IOException -> 0x033c, all -> 0x033a, all -> 0x03b7 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0041=Splitter:B:16:0x0041, B:109:0x016b=Splitter:B:109:0x016b, B:276:0x03ac=Splitter:B:276:0x03ac} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r1 = r2.getName()
            r3 = r19
            java.lang.String r0 = r3.A00
            r2.setName(r0)
            boolean r0 = r3 instanceof X.Y7J     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x005a
            X.Y7J r3 = (X.Y7J) r3     // Catch:{ all -> 0x03c0 }
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x03c0 }
            r9 = r8
            r7 = 0
            X.Y1L r5 = r3.A00     // Catch:{ IOException -> 0x003d }
            r4 = 0
            r0 = 1
            boolean r0 = r5.A02(r3, r0)     // Catch:{ IOException -> 0x003d }
            if (r0 != 0) goto L_0x0032
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x003d }
            java.lang.String r4 = "Required SETTINGS preface not received"
            java.lang.String[] r0 = X.C21995Xq2.A01     // Catch:{ IOException -> 0x003d }
            X.Xt4 r0 = X.SUS.A04     // Catch:{ IOException -> 0x003d }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x003d }
            java.io.IOException r0 = X.C21053XCe.A0V(r4, r0, r5)     // Catch:{ IOException -> 0x003d }
            throw r0     // Catch:{ IOException -> 0x003d }
        L_0x0032:
            boolean r0 = r5.A02(r3, r4)     // Catch:{ IOException -> 0x003d }
            if (r0 != 0) goto L_0x0032
            java.lang.Integer r8 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x003d }
            java.lang.Integer r4 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r7 = move-exception
            java.lang.Integer r8 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x004d }
            r4 = r8
        L_0x0041:
            X.Y1K r0 = r3.A01     // Catch:{ all -> 0x03c0 }
            r0.A05(r7, r8, r4)     // Catch:{ all -> 0x03c0 }
            X.Y1L r0 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.SUS.A09(r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x004d:
            r6 = move-exception
            X.Y1K r0 = r3.A01     // Catch:{ all -> 0x03c0 }
            r0.A05(r7, r8, r9)     // Catch:{ all -> 0x03c0 }
            X.Y1L r0 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.SUS.A09(r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03bf
        L_0x005a:
            boolean r0 = r3 instanceof X.Y7F     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0089
            X.Y7F r3 = (X.Y7F) r3     // Catch:{ all -> 0x03c0 }
            X.Y7J r0 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.Y1K r7 = r0.A01     // Catch:{ all -> 0x03c0 }
            X.XTb r6 = r7.A0H     // Catch:{ all -> 0x03c0 }
            X.Y7U r6 = (X.Y7U) r6     // Catch:{ all -> 0x03c0 }
            X.Xnx r5 = r6.A0F     // Catch:{ all -> 0x03c0 }
            monitor-enter(r5)     // Catch:{ all -> 0x03c0 }
            monitor-enter(r7)     // Catch:{ all -> 0x0085 }
            X.XcW r4 = r7.A0L     // Catch:{ all -> 0x0082 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r4.A00     // Catch:{ all -> 0x0082 }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x007c
            int[] r3 = r4.A01     // Catch:{ all -> 0x0082 }
            r0 = 4
            r3 = r3[r0]     // Catch:{ all -> 0x0082 }
        L_0x007c:
            monitor-exit(r7)     // Catch:{ all -> 0x0085 }
            r6.A00 = r3     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)     // Catch:{ all -> 0x0085 }
            goto L_0x03b3
        L_0x0082:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0085 }
            goto L_0x03bf
        L_0x0089:
            boolean r0 = r3 instanceof X.Y7I     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0184
            X.Y7I r3 = (X.Y7I) r3     // Catch:{ all -> 0x03c0 }
            X.Y7J r8 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.XcW r7 = r3.A01     // Catch:{ all -> 0x03c0 }
            X.Y1K r11 = r8.A01     // Catch:{ all -> 0x03c0 }
            X.Y1J r4 = r11.A0J     // Catch:{ all -> 0x03c0 }
            monitor-enter(r4)     // Catch:{ all -> 0x03c0 }
            monitor-enter(r11)     // Catch:{ all -> 0x0180 }
            X.XcW r13 = r11.A0L     // Catch:{ all -> 0x017d }
            int r5 = r13.A00()     // Catch:{ all -> 0x017d }
            r6 = 0
        L_0x00a0:
            r9 = 1
            int r3 = r9 << r6
            int r0 = r7.A00     // Catch:{ all -> 0x017d }
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00af
            int[] r0 = r7.A01     // Catch:{ all -> 0x017d }
            r0 = r0[r6]     // Catch:{ all -> 0x017d }
            r13.A01(r6, r0)     // Catch:{ all -> 0x017d }
        L_0x00af:
            int r6 = r6 + 1
            r0 = 10
            if (r6 < r0) goto L_0x00a0
            int r0 = r13.A00()     // Catch:{ all -> 0x017d }
            r7 = -1
            r12 = 0
            if (r0 == r7) goto L_0x00c2
            if (r0 == r5) goto L_0x00c2
            int r0 = r0 - r5
            long r5 = (long) r0     // Catch:{ all -> 0x017d }
            goto L_0x00c5
        L_0x00c2:
            r5 = 0
            goto L_0x00dd
        L_0x00c5:
            java.util.Map r10 = r11.A0E     // Catch:{ all -> 0x017d }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x017d }
            if (r0 != 0) goto L_0x00dd
            java.util.Collection r3 = r10.values()     // Catch:{ all -> 0x017d }
            int r0 = r10.size()     // Catch:{ all -> 0x017d }
            X.Xp3[] r0 = new X.C21989Xp3[r0]     // Catch:{ all -> 0x017d }
            java.lang.Object[] r12 = r3.toArray(r0)     // Catch:{ all -> 0x017d }
            X.Xp3[] r12 = (X.C21989Xp3[]) r12     // Catch:{ all -> 0x017d }
        L_0x00dd:
            monitor-exit(r11)     // Catch:{ all -> 0x017d }
            boolean r0 = r4.A01     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            int r3 = r4.A00     // Catch:{ all -> 0x0143 }
            int r10 = r13.A00     // Catch:{ all -> 0x0143 }
            r0 = r10 & 32
            if (r0 == 0) goto L_0x00ef
            int[] r3 = r13.A01     // Catch:{ all -> 0x0143 }
            r0 = 5
            r3 = r3[r0]     // Catch:{ all -> 0x0143 }
        L_0x00ef:
            r4.A00 = r3     // Catch:{ all -> 0x0143 }
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0133
            int[] r0 = r13.A01     // Catch:{ all -> 0x0143 }
            r3 = r0[r9]     // Catch:{ all -> 0x0143 }
            if (r3 == r7) goto L_0x0133
            X.XoQ r7 = r4.A02     // Catch:{ all -> 0x0143 }
            r0 = 16384(0x4000, float:2.2959E-41)
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x0143 }
            int r0 = r7.A02     // Catch:{ all -> 0x0143 }
            if (r0 == r3) goto L_0x0133
            if (r3 >= r0) goto L_0x0111
            int r0 = r7.A04     // Catch:{ all -> 0x0143 }
            int r0 = java.lang.Math.min(r0, r3)     // Catch:{ all -> 0x0143 }
            r7.A04 = r0     // Catch:{ all -> 0x0143 }
        L_0x0111:
            r7.A05 = r9     // Catch:{ all -> 0x0143 }
            r7.A02 = r3     // Catch:{ all -> 0x0143 }
            int r0 = r7.A00     // Catch:{ all -> 0x0143 }
            if (r3 >= r0) goto L_0x0133
            if (r3 != 0) goto L_0x011c
            goto L_0x0121
        L_0x011c:
            int r0 = r0 - r3
            X.C21978XoQ.A00(r7, r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0133
        L_0x0121:
            X.Xs6[] r3 = r7.A06     // Catch:{ all -> 0x0143 }
            r0 = 0
            java.util.Arrays.fill(r3, r0)     // Catch:{ all -> 0x0143 }
            X.Xs6[] r0 = r7.A06     // Catch:{ all -> 0x0143 }
            int r0 = r0.length     // Catch:{ all -> 0x0143 }
            int r0 = r0 + -1
            r7.A03 = r0     // Catch:{ all -> 0x0143 }
            r0 = 0
            r7.A01 = r0     // Catch:{ all -> 0x0143 }
            r7.A00 = r0     // Catch:{ all -> 0x0143 }
        L_0x0133:
            r3 = 4
            r0 = 0
            r4.A01(r3, r9, r0, r0)     // Catch:{ all -> 0x0143 }
            X.YCS r0 = r4.A04     // Catch:{ all -> 0x0143 }
            r0.flush()     // Catch:{ all -> 0x0143 }
            goto L_0x014b
        L_0x013e:
            java.io.IOException r0 = X.C21055XCg.A0H()     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x0145 }
        L_0x0145:
            r3 = move-exception
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0180 }
            r11.A05(r3, r0, r0)     // Catch:{ all -> 0x0180 }
        L_0x014b:
            monitor-exit(r4)     // Catch:{ all -> 0x0180 }
            if (r12 == 0) goto L_0x016b
            int r10 = r12.length     // Catch:{ all -> 0x03c0 }
            r9 = 0
        L_0x0150:
            if (r9 >= r10) goto L_0x016b
            r7 = r12[r9]     // Catch:{ all -> 0x03c0 }
            monitor-enter(r7)     // Catch:{ all -> 0x03c0 }
            long r3 = r7.A00     // Catch:{ all -> 0x0167 }
            long r3 = r3 + r5
            r7.A00 = r3     // Catch:{ all -> 0x0167 }
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0163
            r7.notifyAll()     // Catch:{ all -> 0x0167 }
        L_0x0163:
            monitor-exit(r7)     // Catch:{ all -> 0x0167 }
            int r9 = r9 + 1
            goto L_0x0150
        L_0x0167:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0167 }
            goto L_0x03bf
        L_0x016b:
            java.util.concurrent.ExecutorService r4 = X.Y1K.A0N     // Catch:{ all -> 0x03c0 }
            java.lang.String r0 = r11.A0C     // Catch:{ all -> 0x03c0 }
            java.lang.Object[] r3 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x03c0 }
            X.Y7F r0 = new X.Y7F     // Catch:{ all -> 0x03c0 }
            r0.<init>(r8, r3)     // Catch:{ all -> 0x03c0 }
            r4.execute(r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x017d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x017d }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0180 }
            goto L_0x03bf
        L_0x0184:
            boolean r0 = r3 instanceof X.Y7H     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x01b0
            X.Y7H r3 = (X.Y7H) r3     // Catch:{ all -> 0x03c0 }
            X.Xp3 r5 = r3.A01     // Catch:{ IOException -> 0x0194 }
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x0194 }
            r0 = 0
            r5.A04(r0, r4)     // Catch:{ IOException -> 0x0194 }
            goto L_0x03b3
        L_0x0194:
            r7 = move-exception
            X.SPU r6 = X.SPU.A00     // Catch:{ all -> 0x03c0 }
            r5 = 4
            java.lang.String r4 = "Http2Connection.Listener failure for "
            X.Y7J r0 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.Y1K r0 = r0.A01     // Catch:{ all -> 0x03c0 }
            java.lang.String r0 = r0.A0C     // Catch:{ all -> 0x03c0 }
            java.lang.String r0 = X.002.A0R(r4, r0)     // Catch:{ all -> 0x03c0 }
            r6.A05(r0, r7, r5)     // Catch:{ all -> 0x03c0 }
            X.Xp3 r3 = r3.A01     // Catch:{ IOException -> 0x03b3 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x03b3 }
            r3.A04(r7, r0)     // Catch:{ IOException -> 0x03b3 }
            goto L_0x03b3
        L_0x01b0:
            boolean r0 = r3 instanceof X.Y7P     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x01c2
            X.Y7P r3 = (X.Y7P) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r6 = r3.A02     // Catch:{ all -> 0x03c0 }
            r5 = 1
            int r4 = r3.A00     // Catch:{ all -> 0x03c0 }
            int r0 = r3.A01     // Catch:{ all -> 0x03c0 }
            r6.A07(r5, r4, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x01c2:
            boolean r0 = r3 instanceof X.Y7E     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x01f3
            X.Y7E r3 = (X.Y7E) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r9 = r3.A00     // Catch:{ all -> 0x03c0 }
            monitor-enter(r9)     // Catch:{ all -> 0x03c0 }
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ all -> 0x01ef }
            long r3 = r9.A08     // Catch:{ all -> 0x01ef }
            long r6 = r9.A07     // Catch:{ all -> 0x01ef }
            r8 = 1
            r5 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d9
            r0 = 1
            goto L_0x01df
        L_0x01d9:
            r3 = 1
            long r3 = r3 + r6
            r9.A07 = r3     // Catch:{ all -> 0x01ef }
            r0 = 0
        L_0x01df:
            monitor-exit(r9)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01ea
            r3 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x03c0 }
            r9.A05(r3, r0, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x01ea:
            r9.A07(r5, r8, r5)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x01ef:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01ef }
            goto L_0x03bf
        L_0x01f3:
            boolean r0 = r3 instanceof X.Y7G     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x020e
            X.Y7G r3 = (X.Y7G) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r4 = r3.A01     // Catch:{ all -> 0x03c0 }
            int r0 = r3.A00     // Catch:{ all -> 0x03c0 }
            monitor-enter(r4)     // Catch:{ all -> 0x03c0 }
            java.util.Set r3 = r4.A0F     // Catch:{ all -> 0x020a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020a }
            r3.remove(r0)     // Catch:{ all -> 0x020a }
            monitor-exit(r4)     // Catch:{ all -> 0x020a }
            goto L_0x03b3
        L_0x020a:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x020a }
            goto L_0x03bf
        L_0x020e:
            boolean r0 = r3 instanceof X.Y7Q     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0237
            X.Y7Q r3 = (X.Y7Q) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r7 = r3.A02     // Catch:{ IOException -> 0x03b3 }
            int r6 = r3.A01     // Catch:{ IOException -> 0x03b3 }
            X.TPe r5 = r3.A03     // Catch:{ IOException -> 0x03b3 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x03b3 }
            long r3 = (long) r0     // Catch:{ IOException -> 0x03b3 }
            r5.Evi(r3)     // Catch:{ IOException -> 0x03b3 }
            X.Y1J r3 = r7.A0J     // Catch:{ IOException -> 0x03b3 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x03b3 }
            r3.A03(r6, r0)     // Catch:{ IOException -> 0x03b3 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x03b3 }
            java.util.Set r3 = r7.A0F     // Catch:{ all -> 0x0234 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0234 }
            r3.remove(r0)     // Catch:{ all -> 0x0234 }
            monitor-exit(r7)     // Catch:{ all -> 0x0234 }
            goto L_0x03b3
        L_0x0234:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0234 }
            goto L_0x0278
        L_0x0237:
            boolean r0 = r3 instanceof X.Y7O     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0258
            X.Y7O r3 = (X.Y7O) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r5 = r3.A02     // Catch:{ all -> 0x03c0 }
            int r4 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.Y1J r3 = r5.A0J     // Catch:{ IOException -> 0x03b3 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x03b3 }
            r3.A03(r4, r0)     // Catch:{ IOException -> 0x03b3 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x03b3 }
            java.util.Set r3 = r5.A0F     // Catch:{ all -> 0x0255 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0255 }
            r3.remove(r0)     // Catch:{ all -> 0x0255 }
            monitor-exit(r5)     // Catch:{ all -> 0x0255 }
            goto L_0x03b3
        L_0x0255:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0255 }
            goto L_0x0278
        L_0x0258:
            boolean r0 = r3 instanceof X.Y7N     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0279
            X.Y7N r3 = (X.Y7N) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r5 = r3.A02     // Catch:{ all -> 0x03c0 }
            int r4 = r3.A00     // Catch:{ all -> 0x03c0 }
            X.Y1J r3 = r5.A0J     // Catch:{ IOException -> 0x03b3 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x03b3 }
            r3.A03(r4, r0)     // Catch:{ IOException -> 0x03b3 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x03b3 }
            java.util.Set r3 = r5.A0F     // Catch:{ all -> 0x0276 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0276 }
            r3.remove(r0)     // Catch:{ all -> 0x0276 }
            monitor-exit(r5)     // Catch:{ all -> 0x0276 }
            goto L_0x03b3
        L_0x0276:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0276 }
        L_0x0278:
            throw r0     // Catch:{ IOException -> 0x03b3 }
        L_0x0279:
            boolean r0 = r3 instanceof X.Y7D     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0288
            X.Y7D r3 = (X.Y7D) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r4 = r3.A00     // Catch:{ all -> 0x03c0 }
            r3 = 0
            r0 = 2
            r4.A07(r3, r0, r3)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x0288:
            boolean r0 = r3 instanceof X.Y7M     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x029f
            X.Y7M r3 = (X.Y7M) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r0 = r3.A02     // Catch:{ IOException -> 0x029b }
            X.Y1J r6 = r0.A0J     // Catch:{ IOException -> 0x029b }
            int r0 = r3.A00     // Catch:{ IOException -> 0x029b }
            long r4 = r3.A01     // Catch:{ IOException -> 0x029b }
            r6.A02(r0, r4)     // Catch:{ IOException -> 0x029b }
            goto L_0x03b3
        L_0x029b:
            r4 = move-exception
            X.Y1K r3 = r3.A02     // Catch:{ all -> 0x03c0 }
            goto L_0x02b5
        L_0x029f:
            boolean r0 = r3 instanceof X.Y7L     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x02be
            X.Y7L r3 = (X.Y7L) r3     // Catch:{ all -> 0x03c0 }
            X.Y1K r0 = r3.A02     // Catch:{ IOException -> 0x02b2 }
            int r5 = r3.A00     // Catch:{ IOException -> 0x02b2 }
            java.lang.Integer r4 = r3.A01     // Catch:{ IOException -> 0x02b2 }
            X.Y1J r0 = r0.A0J     // Catch:{ IOException -> 0x02b2 }
            r0.A03(r5, r4)     // Catch:{ IOException -> 0x02b2 }
            goto L_0x03b3
        L_0x02b2:
            r4 = move-exception
            X.Y1K r3 = r3.A02     // Catch:{ all -> 0x03c0 }
        L_0x02b5:
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ all -> 0x03c0 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x03c0 }
            r3.A05(r4, r0, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x03b3
        L_0x02be:
            X.Y7K r3 = (X.Y7K) r3     // Catch:{ all -> 0x03c0 }
            X.Y1T r11 = r3.A02     // Catch:{ all -> 0x03c0 }
            X.Xp1 r0 = r11.A00     // Catch:{ all -> 0x03c0 }
            X.TZ6 r0 = r0.A0E     // Catch:{ all -> 0x03c0 }
            r0.A0A()     // Catch:{ all -> 0x03c0 }
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Y1U r7 = r11.A02     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            java.util.List r0 = r7.A08     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.addAll(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Y4l r0 = new X.Y4l     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.add(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.YBQ r4 = r7.A0I     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Y4j r0 = new X.Y4j     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.add(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r13 = 0
            X.Y4h r0 = new X.Y4h     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r0.<init>()     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.add(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Y4i r0 = new X.Y4i     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.add(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            boolean r0 = r11.A04     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            if (r0 != 0) goto L_0x0300
            java.util.List r4 = r7.A09     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.addAll(r4)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
        L_0x0300:
            X.Y4k r4 = new X.Y4k     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r10.add(r4)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Xp1 r14 = r11.A00     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r15 = 0
            X.Xbw r12 = r11.A03     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            int r6 = r7.A01     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            int r5 = r7.A03     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            int r4 = r7.A04     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Xc1 r9 = new X.Xc1     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r16 = r6
            r17 = r5
            r18 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            X.Xp1 r5 = r9.A06     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            X.Xcc r4 = r9.A05     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            X.Y1H r5 = r9.A00(r12, r4, r5)     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            X.Xp1 r4 = r11.A00     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            boolean r4 = r4.A06()     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            if (r4 != 0) goto L_0x036b
            X.Xp1 r4 = r11.A00     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r4.A01(r13)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r6 = 1
            X.YAG r4 = r3.A00     // Catch:{ IOException -> 0x033c, all -> 0x033a }
            r4.DfC(r11, r5)     // Catch:{ IOException -> 0x033c, all -> 0x033a }
            goto L_0x03ac
        L_0x033a:
            r5 = move-exception
            goto L_0x0388
        L_0x033c:
            r10 = move-exception
            X.SPU r9 = X.SPU.A00     // Catch:{ all -> 0x03b7 }
            r8 = 4
            java.lang.String r7 = "Callback failure for "
            X.Xp1 r4 = r11.A00     // Catch:{ all -> 0x03b7 }
            boolean r4 = r4.A06()     // Catch:{ all -> 0x03b7 }
            if (r4 == 0) goto L_0x034d
            java.lang.String r6 = "canceled "
            goto L_0x034f
        L_0x034d:
            java.lang.String r6 = ""
        L_0x034f:
            if (r0 == 0) goto L_0x0352
            goto L_0x0355
        L_0x0352:
            java.lang.String r5 = "call"
            goto L_0x0357
        L_0x0355:
            java.lang.String r5 = "web socket"
        L_0x0357:
            java.lang.String r4 = " to "
            X.STm r0 = r12.A03     // Catch:{ all -> 0x03b7 }
            java.lang.String r0 = r0.A0A()     // Catch:{ all -> 0x03b7 }
            java.lang.String r0 = X.002.A0u(r6, r5, r4, r0)     // Catch:{ all -> 0x03b7 }
            java.lang.String r0 = X.002.A0R(r7, r0)     // Catch:{ all -> 0x03b7 }
            r9.A05(r0, r10, r8)     // Catch:{ all -> 0x03b7 }
            goto L_0x03ac
        L_0x036b:
            X.SUS.A09(r5)     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            java.lang.String r0 = "Canceled"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x0375, all -> 0x037f }
            throw r0     // Catch:{ IOException -> 0x0375, all -> 0x037f }
        L_0x0375:
            r4 = move-exception
            X.Xp1 r0 = r11.A00     // Catch:{ all -> 0x037d }
            java.io.IOException r0 = r0.A01(r4)     // Catch:{ all -> 0x037d }
            throw r0     // Catch:{ all -> 0x037d }
        L_0x037d:
            r4 = move-exception
            goto L_0x0385
        L_0x037f:
            r4 = move-exception
            X.Xp1 r0 = r11.A00     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
            r0.A01(r13)     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
        L_0x0385:
            throw r4     // Catch:{ IOException -> 0x03a6, all -> 0x0386 }
        L_0x0386:
            r5 = move-exception
            r6 = 0
        L_0x0388:
            X.Xp1 r0 = r11.A00     // Catch:{ all -> 0x03b7 }
            r0.A04()     // Catch:{ all -> 0x03b7 }
            if (r6 != 0) goto L_0x03a5
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x03b7 }
            java.lang.String r0 = "canceled due to "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r4)     // Catch:{ all -> 0x03b7 }
            java.io.IOException r4 = X.JTO.A0u(r0)     // Catch:{ all -> 0x03b7 }
            X.C9153RRe.A00(r4, r5)     // Catch:{ all -> 0x03b7 }
            X.YAG r0 = r3.A00     // Catch:{ all -> 0x03b7 }
            r0.DEl(r4, r11)     // Catch:{ all -> 0x03b7 }
        L_0x03a5:
            throw r5     // Catch:{ all -> 0x03b7 }
        L_0x03a6:
            r4 = move-exception
            X.YAG r0 = r3.A00     // Catch:{ all -> 0x03b7 }
            r0.DEl(r4, r11)     // Catch:{ all -> 0x03b7 }
        L_0x03ac:
            X.Y1U r0 = r11.A02     // Catch:{ all -> 0x03c0 }
            X.Xnv r0 = r0.A0J     // Catch:{ all -> 0x03c0 }
            r0.A01(r3)     // Catch:{ all -> 0x03c0 }
        L_0x03b3:
            r2.setName(r1)
            return
        L_0x03b7:
            r6 = move-exception
            X.Y1U r0 = r11.A02     // Catch:{ all -> 0x03c0 }
            X.Xnv r0 = r0.A0J     // Catch:{ all -> 0x03c0 }
            r0.A01(r3)     // Catch:{ all -> 0x03c0 }
        L_0x03bf:
            throw r6     // Catch:{ all -> 0x03c0 }
        L_0x03c0:
            r0 = move-exception
            r2.setName(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y2B.run():void");
    }
}
