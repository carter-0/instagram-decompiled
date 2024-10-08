package X;

import java.io.Closeable;
import java.util.Locale;
import java.util.logging.Logger;

public final class Y1L implements Closeable {
    public static final Logger A03 = Logger.getLogger(C21995Xq2.class.getName());
    public final C22005XqN A00;
    public final YCT A01;
    public final C22463Y4u A02;

    /* JADX WARNING: type inference failed for: r15v3, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x028f, code lost:
        r5.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r5.Evi(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0416, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0462, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.Y7J r22, boolean r23) {
        /*
            r21 = this;
            r3 = 0
            r11 = r21
            X.YCT r5 = r11.A01     // Catch:{ EOFException -> 0x0487 }
            r0 = 9
            r5.EHi(r0)     // Catch:{ EOFException -> 0x0487 }
            int r0 = X.YCT.A00(r5)
            int r1 = r0 << 16
            int r0 = X.YCT.A00(r5)
            int r0 = r0 << 8
            r1 = r1 | r0
            int r10 = X.YCT.A00(r5)
            r10 = r10 | r1
            r4 = 1
            if (r10 < 0) goto L_0x03af
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r10 > r9) goto L_0x03af
            int r0 = X.YCT.A00(r5)
            byte r6 = (byte) r0
            if (r23 == 0) goto L_0x0042
            r0 = 4
            if (r6 == r0) goto L_0x0042
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Expected a SETTINGS frame but was %s"
        L_0x0037:
            java.lang.String[] r0 = X.C21995Xq2.A01
            X.Xt4 r0 = X.SUS.A04
            java.util.Locale r0 = java.util.Locale.US
            java.io.IOException r0 = X.C21053XCe.A0V(r1, r0, r2)
            throw r0
        L_0x0042:
            int r0 = X.YCT.A00(r5)
            byte r8 = (byte) r0
            int r7 = r5.readInt()
            r12 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r12
            java.util.logging.Logger r1 = A03
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = X.C21995Xq2.A00(r6, r8, r7, r10, r4)
            r1.fine(r0)
        L_0x0060:
            r2 = r22
            switch(r6) {
                case 0: goto L_0x006a;
                case 1: goto L_0x013d;
                case 2: goto L_0x031f;
                case 3: goto L_0x017f;
                case 4: goto L_0x01bf;
                case 5: goto L_0x0225;
                case 6: goto L_0x026b;
                case 7: goto L_0x0294;
                case 8: goto L_0x02fd;
                default: goto L_0x0065;
            }
        L_0x0065:
            long r0 = (long) r10
        L_0x0066:
            r5.Evi(r0)
        L_0x0069:
            return r4
        L_0x006a:
            r12 = 0
            if (r7 == 0) goto L_0x0339
            r0 = r8 & 1
            boolean r20 = X.AnonymousClass7TF.A1P(r0)
            r0 = r8 & 32
            if (r0 == 0) goto L_0x007c
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            goto L_0x0037
        L_0x007c:
            r0 = r8 & 8
            if (r0 == 0) goto L_0x0085
            int r0 = X.YCT.A00(r5)
            short r12 = (short) r0
        L_0x0085:
            int r6 = A00(r8, r10, r12)
            X.Y1K r14 = r2.A01
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N
            r0 = r7 & 1
            if (r0 != 0) goto L_0x00b7
            X.TPe r15 = new X.TPe
            r15.<init>()
            long r2 = (long) r6
            r5.EHi(r2)
            r5.E6C(r15, r2)
            long r0 = r15.A00
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x03b7
            java.lang.String r0 = r14.A0C
            java.lang.Object[] r16 = X.C51968G9o.A1Z(r0, r7)
            X.Y7Q r13 = new X.Y7Q
            r17 = r7
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            X.Y1K.A00(r13, r14)
        L_0x00b5:
            long r0 = (long) r12
            goto L_0x0066
        L_0x00b7:
            X.Xp3 r10 = r14.A01(r7)
            if (r10 != 0) goto L_0x00ca
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r14.A03(r7, r0)
            long r0 = (long) r6
            r14.A04(r0)
            r5.Evi(r0)
            goto L_0x00b5
        L_0x00ca:
            X.Y4v r9 = r10.A09
            long r2 = (long) r6
        L_0x00cd:
            r18 = 0
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            X.Xp3 r8 = r9.A06
            monitor-enter(r8)
            boolean r14 = r9.A02     // Catch:{ all -> 0x03c9 }
            X.TPe r11 = r9.A04     // Catch:{ all -> 0x03c9 }
            long r6 = r11.A00     // Catch:{ all -> 0x03c9 }
            long r6 = r6 + r2
            long r0 = r9.A03     // Catch:{ all -> 0x03c9 }
            r17 = 1
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r13)
            monitor-exit(r8)     // Catch:{ all -> 0x03c9 }
            if (r0 == 0) goto L_0x00fa
            r5.Evi(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r8.A05(r0)
        L_0x00f2:
            if (r20 == 0) goto L_0x00b5
            X.Xt4 r0 = X.SUS.A04
            r10.A06(r0, r4)
            goto L_0x00b5
        L_0x00fa:
            if (r14 == 0) goto L_0x0100
            r5.Evi(r2)
            goto L_0x00f2
        L_0x0100:
            X.TPe r6 = r9.A05
            long r15 = r5.E6C(r6, r2)
            r13 = -1
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x03cf
            long r2 = r2 - r15
            monitor-enter(r8)
            boolean r0 = r9.A01     // Catch:{ all -> 0x03cc }
            if (r0 == 0) goto L_0x0119
            long r0 = r6.A00     // Catch:{ all -> 0x03cc }
            r6.A0A()     // Catch:{ all -> 0x03cc }
        L_0x0117:
            monitor-exit(r8)     // Catch:{ all -> 0x03cc }
            goto L_0x0133
        L_0x0119:
            long r0 = r11.A00     // Catch:{ all -> 0x03cc }
            int r7 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0121
            r17 = 0
        L_0x0121:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r15 = r6.E6C(r11, r0)     // Catch:{ all -> 0x03cc }
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            if (r17 == 0) goto L_0x0130
            r8.notifyAll()     // Catch:{ all -> 0x03cc }
        L_0x0130:
            r0 = 0
            goto L_0x0117
        L_0x0133:
            int r6 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cd
            X.Y1K r6 = r8.A07
            r6.A04(r0)
            goto L_0x00cd
        L_0x013d:
            r1 = 0
            if (r7 == 0) goto L_0x033f
            r0 = r8 & 1
            boolean r9 = X.AnonymousClass7TF.A1P(r0)
            r0 = r8 & 8
            if (r0 == 0) goto L_0x014f
            int r0 = X.YCT.A00(r5)
            short r1 = (short) r0
        L_0x014f:
            r0 = r8 & 32
            if (r0 == 0) goto L_0x015b
            r5.readInt()
            r5.readByte()
            int r10 = r10 + -5
        L_0x015b:
            int r0 = A00(r8, r10, r1)
            java.util.ArrayList r8 = r11.A01(r8, r0, r7, r1)
            X.Y1K r5 = r2.A01
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N
            r0 = r7 & 1
            if (r0 != 0) goto L_0x03d6
            java.lang.String r1 = r5.A0C     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y7O r0 = new X.Y7O     // Catch:{ RejectedExecutionException -> 0x0069 }
            r0.<init>(r8, r5, r1, r7)     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y1K.A00(r0, r5)     // Catch:{ RejectedExecutionException -> 0x0069 }
            goto L_0x03d5
        L_0x017f:
            r0 = 4
            if (r10 != r0) goto L_0x0353
            if (r7 == 0) goto L_0x034d
            int r8 = r5.readInt()
            r0 = 11
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            int r5 = r6.length
            r1 = 0
        L_0x0190:
            if (r1 >= r5) goto L_0x0345
            r3 = r6[r1]
            int r0 = X.XY0.A00(r3)
            if (r0 != r8) goto L_0x01b3
            if (r3 == 0) goto L_0x0345
            X.Y1K r2 = r2.A01
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N
            r0 = r7 & 1
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = r2.A0C
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r0, r7)
            X.Y7G r0 = new X.Y7G
            r0.<init>(r2, r1, r7)
            X.Y1K.A00(r0, r2)
            return r4
        L_0x01b3:
            int r1 = r1 + 1
            goto L_0x0190
        L_0x01b6:
            X.Xp3 r1 = r2.A02(r7)
            if (r1 == 0) goto L_0x0069
            monitor-enter(r1)
            goto L_0x0423
        L_0x01bf:
            if (r7 != 0) goto L_0x036b
            r0 = r8 & 1
            if (r0 == 0) goto L_0x01cd
            if (r10 == 0) goto L_0x0069
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "FRAME_SIZE_ERROR ack frame should be empty!"
            goto L_0x0037
        L_0x01cd:
            int r0 = r10 % 6
            if (r0 != 0) goto L_0x0363
            X.XcW r6 = new X.XcW
            r6.<init>()
            r11 = 0
        L_0x01d7:
            if (r11 >= r10) goto L_0x0213
            short r8 = r5.readShort()
            r0 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r0
            int r7 = r5.readInt()
            r0 = 2
            r1 = 4
            if (r8 == r0) goto L_0x0209
            r0 = 3
            if (r8 == r0) goto L_0x0207
            if (r8 == r1) goto L_0x01fe
            r0 = 5
            if (r8 != r0) goto L_0x01f8
            if (r7 < r9) goto L_0x035b
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r0) goto L_0x035b
        L_0x01f8:
            r6.A01(r8, r7)
            int r11 = r11 + 6
            goto L_0x01d7
        L_0x01fe:
            r8 = 7
            if (r7 >= 0) goto L_0x01f8
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            goto L_0x0037
        L_0x0207:
            r8 = 4
            goto L_0x01f8
        L_0x0209:
            if (r7 == 0) goto L_0x01f8
            if (r7 == r4) goto L_0x01f8
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            goto L_0x0037
        L_0x0213:
            X.Y1K r1 = r2.A01     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.util.concurrent.ScheduledExecutorService r5 = r1.A0G     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.lang.String r0 = r1.A0C     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y7I r0 = new X.Y7I     // Catch:{ RejectedExecutionException -> 0x0069 }
            r0.<init>(r2, r6, r1)     // Catch:{ RejectedExecutionException -> 0x0069 }
            goto L_0x028f
        L_0x0225:
            r1 = 0
            if (r7 == 0) goto L_0x0371
            r0 = r8 & 8
            if (r0 == 0) goto L_0x0231
            int r0 = X.YCT.A00(r5)
            short r1 = (short) r0
        L_0x0231:
            int r6 = r5.readInt()
            r6 = r6 & r12
            int r0 = r10 + -4
            int r0 = A00(r8, r0, r1)
            java.util.ArrayList r5 = r11.A01(r8, r0, r7, r1)
            X.Y1K r3 = r2.A01
            monitor-enter(r3)
            java.util.Set r2 = r3.A0F     // Catch:{ all -> 0x0433 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0433 }
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x0257
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0433 }
            r3.A03(r6, r0)     // Catch:{ all -> 0x0433 }
            monitor-exit(r3)     // Catch:{ all -> 0x0433 }
            goto L_0x0431
        L_0x0257:
            r2.add(r1)     // Catch:{ all -> 0x0433 }
            monitor-exit(r3)     // Catch:{ all -> 0x0433 }
            java.lang.String r0 = r3.A0C     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y7N r0 = new X.Y7N     // Catch:{ RejectedExecutionException -> 0x0069 }
            r0.<init>(r5, r3, r1, r6)     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y1K.A00(r0, r3)     // Catch:{ RejectedExecutionException -> 0x0069 }
            goto L_0x0432
        L_0x026b:
            r0 = 8
            if (r10 != r0) goto L_0x037d
            if (r7 != 0) goto L_0x0377
            int r6 = r5.readInt()
            int r3 = r5.readInt()
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0284
            X.Y1K r5 = r2.A01
            monitor-enter(r5)
            if (r6 != r4) goto L_0x0440
            goto L_0x0436
        L_0x0284:
            X.Y1K r1 = r2.A01     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ RejectedExecutionException -> 0x0069 }
            java.util.concurrent.ScheduledExecutorService r5 = r1.A0G     // Catch:{ RejectedExecutionException -> 0x0069 }
            X.Y7P r0 = new X.Y7P     // Catch:{ RejectedExecutionException -> 0x0069 }
            r0.<init>(r1, r6, r3)     // Catch:{ RejectedExecutionException -> 0x0069 }
        L_0x028f:
            r5.execute(r0)     // Catch:{ RejectedExecutionException -> 0x0069 }
            goto L_0x0462
        L_0x0294:
            r0 = 8
            if (r10 < r0) goto L_0x0393
            if (r7 != 0) goto L_0x038d
            int r7 = r5.readInt()
            int r9 = r5.readInt()
            int r10 = r10 - r0
            r0 = 11
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r0)
            int r6 = r8.length
        L_0x02aa:
            if (r3 >= r6) goto L_0x0385
            r1 = r8[r3]
            int r0 = X.XY0.A00(r1)
            if (r0 != r9) goto L_0x02c0
            if (r1 == 0) goto L_0x0385
            if (r10 <= 0) goto L_0x02bc
            long r0 = (long) r10
            r5.E6I(r0)
        L_0x02bc:
            X.Y1K r8 = r2.A01
            monitor-enter(r8)
            goto L_0x02c3
        L_0x02c0:
            int r3 = r3 + 1
            goto L_0x02aa
        L_0x02c3:
            java.util.Map r0 = r8.A0E     // Catch:{ all -> 0x0466 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0466 }
            int r0 = r0.size()     // Catch:{ all -> 0x0466 }
            X.Xp3[] r0 = new X.C21989Xp3[r0]     // Catch:{ all -> 0x0466 }
            java.lang.Object[] r6 = r1.toArray(r0)     // Catch:{ all -> 0x0466 }
            X.Xp3[] r6 = (X.C21989Xp3[]) r6     // Catch:{ all -> 0x0466 }
            r8.A0B = r4     // Catch:{ all -> 0x0466 }
            monitor-exit(r8)     // Catch:{ all -> 0x0466 }
            int r5 = r6.length
            r3 = 0
        L_0x02da:
            if (r3 >= r5) goto L_0x0069
            r2 = r6[r3]
            int r0 = r2.A05
            if (r0 <= r7) goto L_0x02fa
            int r0 = r2.A05
            r0 = r0 & 1
            if (r0 != r4) goto L_0x02fa
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            monitor-enter(r2)
            java.lang.Integer r0 = r2.A03     // Catch:{ all -> 0x0463 }
            if (r0 != 0) goto L_0x02f4
            r2.A03 = r1     // Catch:{ all -> 0x0463 }
            r2.notifyAll()     // Catch:{ all -> 0x0463 }
        L_0x02f4:
            monitor-exit(r2)
            int r0 = r2.A05
            r8.A02(r0)
        L_0x02fa:
            int r3 = r3 + 1
            goto L_0x02da
        L_0x02fd:
            r0 = 4
            if (r10 != r0) goto L_0x03a7
            int r0 = r5.readInt()
            long r5 = (long) r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r5 & r0
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x039b
            X.Y1K r2 = r2.A01
            if (r7 != 0) goto L_0x0316
            monitor-enter(r2)
            goto L_0x0469
        L_0x0316:
            X.Xp3 r2 = r2.A01(r7)
            if (r2 == 0) goto L_0x0069
            monitor-enter(r2)
            goto L_0x0476
        L_0x031f:
            r0 = 5
            if (r10 != r0) goto L_0x0331
            if (r7 == 0) goto L_0x032b
            r5.readInt()
            r5.readByte()
            return r4
        L_0x032b:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "TYPE_PRIORITY streamId == 0"
            goto L_0x0037
        L_0x0331:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_PRIORITY length: %d != 5"
            goto L_0x0037
        L_0x0339:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            goto L_0x0037
        L_0x033f:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            goto L_0x0037
        L_0x0345:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r8)
            java.lang.String r1 = "TYPE_RST_STREAM unexpected error code: %d"
            goto L_0x0037
        L_0x034d:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "TYPE_RST_STREAM streamId == 0"
            goto L_0x0037
        L_0x0353:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_RST_STREAM length: %d != 4"
            goto L_0x0037
        L_0x035b:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r7)
            java.lang.String r1 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            goto L_0x0037
        L_0x0363:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_SETTINGS length %% 6 != 0: %s"
            goto L_0x0037
        L_0x036b:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "TYPE_SETTINGS streamId != 0"
            goto L_0x0037
        L_0x0371:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            goto L_0x0037
        L_0x0377:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "TYPE_PING streamId != 0"
            goto L_0x0037
        L_0x037d:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_PING length != 8: %s"
            goto L_0x0037
        L_0x0385:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r9)
            java.lang.String r1 = "TYPE_GOAWAY unexpected error code: %d"
            goto L_0x0037
        L_0x038d:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = "TYPE_GOAWAY streamId != 0"
            goto L_0x0037
        L_0x0393:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_GOAWAY length < 8: %s"
            goto L_0x0037
        L_0x039b:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "windowSizeIncrement was 0"
            goto L_0x0037
        L_0x03a7:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "TYPE_WINDOW_UPDATE length !=4: %s"
            goto L_0x0037
        L_0x03af:
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r10)
            java.lang.String r1 = "FRAME_SIZE_ERROR: %s"
            goto L_0x0037
        L_0x03b7:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            r2.append(r0)
            java.lang.String r0 = " != "
            java.lang.String r0 = X.Pxg.A0t(r0, r2, r6)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x03c9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03c9 }
            throw r0
        L_0x03cc:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03cc }
            throw r0
        L_0x03cf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x03d5:
            return r4
        L_0x03d6:
            monitor-enter(r5)
            X.Xp3 r1 = r5.A01(r7)     // Catch:{ all -> 0x0420 }
            if (r1 != 0) goto L_0x0417
            boolean r0 = r5.A0B     // Catch:{ all -> 0x0420 }
            if (r0 != 0) goto L_0x0415
            int r0 = r5.A00     // Catch:{ all -> 0x0420 }
            if (r7 <= r0) goto L_0x0415
            int r6 = r7 % 2
            int r1 = r5.A01     // Catch:{ all -> 0x0420 }
            r0 = 2
            int r1 = r1 % r0
            if (r6 == r1) goto L_0x0415
            X.Xt4 r11 = X.SUS.A08(r8)     // Catch:{ all -> 0x0420 }
            X.Xp3 r10 = new X.Xp3     // Catch:{ all -> 0x0420 }
            r12 = r5
            r13 = r7
            r14 = r3
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0420 }
            r5.A00 = r7     // Catch:{ all -> 0x0420 }
            java.util.Map r0 = r5.A0E     // Catch:{ all -> 0x0420 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0420 }
            r0.put(r1, r10)     // Catch:{ all -> 0x0420 }
            java.util.concurrent.ExecutorService r3 = X.Y1K.A0N     // Catch:{ all -> 0x0420 }
            java.lang.String r0 = r5.A0C     // Catch:{ all -> 0x0420 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}     // Catch:{ all -> 0x0420 }
            X.Y7H r0 = new X.Y7H     // Catch:{ all -> 0x0420 }
            r0.<init>(r2, r10, r1)     // Catch:{ all -> 0x0420 }
            r3.execute(r0)     // Catch:{ all -> 0x0420 }
        L_0x0415:
            monitor-exit(r5)     // Catch:{ all -> 0x0420 }
            return r4
        L_0x0417:
            monitor-exit(r5)     // Catch:{ all -> 0x0420 }
            X.Xt4 r0 = X.SUS.A08(r8)
            r1.A06(r0, r9)
            return r4
        L_0x0420:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0420 }
            throw r0
        L_0x0423:
            java.lang.Integer r0 = r1.A03     // Catch:{ all -> 0x042e }
            if (r0 != 0) goto L_0x042c
            r1.A03 = r3     // Catch:{ all -> 0x042e }
            r1.notifyAll()     // Catch:{ all -> 0x042e }
        L_0x042c:
            monitor-exit(r1)
            return r4
        L_0x042e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0431:
            return r4
        L_0x0432:
            return r4
        L_0x0433:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0433 }
            throw r0
        L_0x0436:
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ all -> 0x045f }
            long r2 = r5.A08     // Catch:{ all -> 0x045f }
            r0 = 1
            long r0 = r0 + r2
            r5.A08 = r0     // Catch:{ all -> 0x045f }
            goto L_0x045d
        L_0x0440:
            r0 = 2
            if (r6 != r0) goto L_0x0444
            goto L_0x0454
        L_0x0444:
            r0 = 3
            if (r6 != r0) goto L_0x045d
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ all -> 0x045f }
            long r2 = r5.A02     // Catch:{ all -> 0x045f }
            r0 = 1
            long r0 = r0 + r2
            r5.A02 = r0     // Catch:{ all -> 0x045f }
            r5.notifyAll()     // Catch:{ all -> 0x045f }
            goto L_0x045d
        L_0x0454:
            java.util.concurrent.ExecutorService r0 = X.Y1K.A0N     // Catch:{ all -> 0x045f }
            long r2 = r5.A06     // Catch:{ all -> 0x045f }
            r0 = 1
            long r0 = r0 + r2
            r5.A06 = r0     // Catch:{ all -> 0x045f }
        L_0x045d:
            monitor-exit(r5)     // Catch:{ all -> 0x045f }
            return r4
        L_0x045f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x045f }
            throw r0
        L_0x0462:
            return r4
        L_0x0463:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0466:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0466 }
            throw r0
        L_0x0469:
            long r0 = r2.A03     // Catch:{ all -> 0x0473 }
            long r0 = r0 + r5
            r2.A03 = r0     // Catch:{ all -> 0x0473 }
            r2.notifyAll()     // Catch:{ all -> 0x0473 }
            monitor-exit(r2)     // Catch:{ all -> 0x0473 }
            return r4
        L_0x0473:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0473 }
            throw r0
        L_0x0476:
            long r0 = r2.A00     // Catch:{ all -> 0x0484 }
            long r0 = r0 + r5
            r2.A00 = r0     // Catch:{ all -> 0x0484 }
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0482
            r2.notifyAll()     // Catch:{ all -> 0x0484 }
        L_0x0482:
            monitor-exit(r2)     // Catch:{ all -> 0x0484 }
            return r4
        L_0x0484:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0484 }
            throw r0
        L_0x0487:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1L.A02(X.Y7J, boolean):boolean");
    }

    public static int A00(byte b, int i, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        Object[] A1Z = C51968G9o.A1Z(Short.valueOf(s), i);
        String[] strArr = C21995Xq2.A01;
        C22023Xt4 xt4 = SUS.A04;
        throw C21053XCe.A0V("PROTOCOL_ERROR padding %s > remaining length %s", Locale.US, A1Z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        throw X.JTO.A0u(X.002.A0O("Header index too large ", r3 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A01(byte r8, int r9, int r10, short r11) {
        /*
            r7 = this;
            X.Y4u r0 = r7.A02
            r0.A01 = r9
            r0.A02 = r9
            r0.A04 = r11
            r0.A00 = r8
            r0.A03 = r10
            X.XqN r4 = r7.A00
        L_0x000e:
            X.YCT r1 = r4.A06
            boolean r0 = r1.ATS()
            if (r0 != 0) goto L_0x0135
            int r2 = X.YCT.A00(r1)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == r1) goto L_0x012e
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != r1) goto L_0x003f
            r0 = 127(0x7f, float:1.78E-43)
            int r0 = r4.A02(r2, r0)
            int r3 = r0 + -1
            r1 = 1
            if (r3 < 0) goto L_0x003d
            r0 = 60
            if (r3 > r0) goto L_0x003d
        L_0x0031:
            X.Xs6[] r0 = X.C11317SMr.A01
            if (r1 == 0) goto L_0x00fd
            r1 = r0[r3]
            java.util.List r0 = r4.A05
            r0.add(r1)
            goto L_0x000e
        L_0x003d:
            r1 = 0
            goto L_0x0031
        L_0x003f:
            r1 = 64
            if (r2 != r1) goto L_0x0095
            X.TAH r1 = r4.A03()
            X.C11317SMr.A01(r1)
        L_0x004a:
            X.TAH r0 = r4.A03()
            X.Xs6 r6 = new X.Xs6
            r6.<init>((X.TAH) r1, (X.TAH) r0)
            java.util.List r0 = r4.A05
            r0.add(r6)
            int r5 = r6.A00
            int r1 = r4.A02
            if (r5 > r1) goto L_0x00c6
            int r0 = r4.A00
            int r0 = r0 + r5
            int r0 = r0 - r1
            X.C22005XqN.A01(r4, r0)
            int r0 = r4.A01
            int r0 = r0 + 1
            X.Xs6[] r3 = r4.A04
            int r2 = r3.length
            if (r0 <= r2) goto L_0x0080
            int r0 = r2 * 2
            X.Xs6[] r1 = new X.Xs6[r0]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r2, r2)
            X.Xs6[] r0 = r4.A04
            int r0 = r0.length
            int r0 = r0 + -1
            r4.A03 = r0
            r4.A04 = r1
            r3 = r1
        L_0x0080:
            int r1 = r4.A03
            int r0 = r1 + -1
            r4.A03 = r0
            r3[r1] = r6
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            int r0 = r4.A00
            int r0 = r0 + r5
        L_0x0091:
            r4.A00 = r0
            goto L_0x000e
        L_0x0095:
            r0 = r2 & 64
            if (r0 != r1) goto L_0x00a6
            r0 = 63
            int r0 = r4.A02(r2, r0)
            int r0 = r0 + -1
            X.TAH r1 = X.C22005XqN.A00(r4, r0)
            goto L_0x004a
        L_0x00a6:
            r1 = r2 & 32
            r0 = 32
            if (r1 != r0) goto L_0x00d7
            r0 = 31
            int r1 = r4.A02(r2, r0)
            r4.A02 = r1
            if (r1 < 0) goto L_0x0116
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 > r0) goto L_0x0116
            int r0 = r4.A00
            if (r1 >= r0) goto L_0x000e
            if (r1 == 0) goto L_0x00c6
            int r0 = r0 - r1
            X.C22005XqN.A01(r4, r0)
            goto L_0x000e
        L_0x00c6:
            X.Xs6[] r1 = r4.A04
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            X.Xs6[] r0 = r4.A04
            int r0 = r0.length
            int r0 = r0 + -1
            r4.A03 = r0
            r0 = 0
            r4.A01 = r0
            goto L_0x0091
        L_0x00d7:
            r0 = 16
            if (r2 == r0) goto L_0x00f5
            if (r2 == 0) goto L_0x00f5
            r0 = 15
            int r0 = r4.A02(r2, r0)
            int r0 = r0 + -1
            X.TAH r2 = X.C22005XqN.A00(r4, r0)
        L_0x00e9:
            X.TAH r1 = r4.A03()
            java.util.List r3 = r4.A05
            X.Xs6 r0 = new X.Xs6
            r0.<init>((X.TAH) r2, (X.TAH) r1)
            goto L_0x0111
        L_0x00f5:
            X.TAH r2 = r4.A03()
            X.C11317SMr.A01(r2)
            goto L_0x00e9
        L_0x00fd:
            r0 = 61
            int r1 = r3 - r0
            int r0 = r4.A03
            int r2 = r0 + 1
            int r2 = r2 + r1
            if (r2 < 0) goto L_0x0121
            X.Xs6[] r1 = r4.A04
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0121
            java.util.List r3 = r4.A05
            r0 = r1[r2]
        L_0x0111:
            r3.add(r0)
            goto L_0x000e
        L_0x0116:
            java.lang.String r0 = "Invalid dynamic table size update "
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0121:
            java.lang.String r1 = "Header index too large "
            int r0 = r3 + 1
            java.lang.String r0 = X.002.A0O(r1, r0)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x012e:
            java.lang.String r0 = "index == 0"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0135:
            java.util.List r1 = r4.A05
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)
            r1.clear()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1L.A01(byte, int, int, short):java.util.ArrayList");
    }

    public final void close() {
        this.A01.close();
    }

    public Y1L(YCT yct) {
        this.A01 = yct;
        C22463Y4u y4u = new C22463Y4u(yct);
        this.A02 = y4u;
        this.A00 = new C22005XqN(y4u);
    }
}
