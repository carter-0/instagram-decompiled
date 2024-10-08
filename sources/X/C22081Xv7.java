package X;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.Xv7  reason: case insensitive filesystem */
public final class C22081Xv7 implements C22553YAc, YA2 {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public final int A03;
    public PlaybackMetrics.Builder A04;
    public C21281XSl A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public String A0B;
    public final long A0C = SystemClock.elapsedRealtime();
    public final Context A0D;
    public final PlaybackSession A0E;
    public final XcO A0F = new XcO();
    public final C22549Y8z A0G;
    public final SIQ A0H = new SIQ();
    public final HashMap A0I = AnonymousClass7TE.A1E();
    public final HashMap A0J = AnonymousClass7TE.A1E();

    public static C22081Xv7 A00(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C22081Xv7(context, mediaMetricsManager.createPlaybackSession());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3.longValue() <= 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r8 = this;
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            r5 = 0
            if (r1 == 0) goto L_0x0060
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0060
            int r0 = r8.A00
            r1.setAudioUnderrunCount(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            int r0 = r8.A09
            r1.setVideoFramesDropped(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            int r0 = r8.A0A
            r1.setVideoFramesPlayed(r0)
            java.util.HashMap r1 = r8.A0J
            java.lang.String r0 = r8.A0B
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A04
            r6 = 0
            if (r0 != 0) goto L_0x0073
            r0 = 0
        L_0x002e:
            r2.setNetworkTransferDurationMillis(r0)
            java.util.HashMap r1 = r8.A0I
            java.lang.String r0 = r8.A0B
            java.lang.Object r3 = r1.get(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A04
            if (r3 != 0) goto L_0x006e
            r0 = 0
        L_0x0041:
            r2.setNetworkBytesRead(r0)
            android.media.metrics.PlaybackMetrics$Builder r4 = r8.A04
            if (r3 == 0) goto L_0x0051
            long r2 = r3.longValue()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r4.setStreamSource(r0)
            android.media.metrics.PlaybackSession r1 = r8.A0E
            android.media.metrics.PlaybackMetrics$Builder r0 = r8.A04
            android.media.metrics.PlaybackMetrics r0 = r0.build()
            r1.reportPlaybackMetrics(r0)
        L_0x0060:
            r0 = 0
            r8.A04 = r0
            r8.A0B = r0
            r8.A00 = r5
            r8.A09 = r5
            r8.A0A = r5
            r8.A08 = r5
            return
        L_0x006e:
            long r0 = r3.longValue()
            goto L_0x0041
        L_0x0073:
            long r0 = r0.longValue()
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22081Xv7.A01():void");
    }

    public final LogSessionId A02() {
        return this.A0E.getSessionId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e2, code lost:
        if (r13 == 2) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0258, code lost:
        if (((android.system.ErrnoException) r1).errno != android.system.OsConstants.EACCES) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0285, code lost:
        if (((X.C7454QDt) r1).A00 != 1) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        if (r10.A02 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (r2 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r4.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        r4.A02.DjP(r5, r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DDA(X.C22546Y8v r19, X.C21371XZe r20) {
        /*
            r18 = this;
            r8 = r20
            r9 = r19
            X.Xct r11 = r8.A01
            android.util.SparseBooleanArray r7 = r11.A00
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0401
            r6 = 0
        L_0x000f:
            int r0 = r7.size()
            r10 = r18
            if (r6 >= r0) goto L_0x00f3
            int r1 = r11.A00(r6)
            android.util.SparseArray r0 = r8.A00
            java.lang.Object r5 = r0.get(r1)
            r5.getClass()
            X.Xch r5 = (X.C21490Xch) r5
            if (r1 != 0) goto L_0x0083
            X.Y8z r2 = r10.A0G
            X.Xv8 r2 = (X.C22082Xv8) r2
            monitor-enter(r2)
            X.YA2 r0 = r2.A02     // Catch:{ all -> 0x00ed }
            r0.getClass()     // Catch:{ all -> 0x00ed }
            androidx.media3.common.Timeline r4 = r2.A01     // Catch:{ all -> 0x00ed }
            androidx.media3.common.Timeline r0 = r5.A07     // Catch:{ all -> 0x00ed }
            r2.A01 = r0     // Catch:{ all -> 0x00ed }
            java.util.HashMap r0 = r2.A07     // Catch:{ all -> 0x00ed }
            java.util.Iterator r13 = X.AnonymousClass7TF.A0t(r0)     // Catch:{ all -> 0x00ed }
        L_0x003e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x00ed }
            X.Xar r12 = (X.C21439Xar) r12     // Catch:{ all -> 0x00ed }
            androidx.media3.common.Timeline r10 = r2.A01     // Catch:{ all -> 0x00ed }
            int r3 = r12.A00     // Catch:{ all -> 0x00ed }
            int r0 = r4.A02()     // Catch:{ all -> 0x00ed }
            r1 = -1
            if (r3 < r0) goto L_0x00e1
            int r0 = r10.A02()     // Catch:{ all -> 0x00ed }
            if (r3 < r0) goto L_0x005c
            r3 = -1
        L_0x005c:
            r12.A00 = r3     // Catch:{ all -> 0x00ed }
            if (r3 == r1) goto L_0x0064
            int r0 = r5.A01     // Catch:{ all -> 0x00ed }
            if (r3 == r0) goto L_0x003e
        L_0x0064:
            r13.remove()     // Catch:{ all -> 0x00ed }
            boolean r0 = r12.A03     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x003e
            java.lang.String r3 = r12.A04     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x00ed }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x0078
            r0 = 0
            r2.A03 = r0     // Catch:{ all -> 0x00ed }
        L_0x0078:
            X.YA2 r1 = r2.A02     // Catch:{ all -> 0x00ed }
            r0 = 0
            r1.DjP(r5, r3, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x003e
        L_0x007f:
            X.C22082Xv8.A01(r5, r2)     // Catch:{ all -> 0x00ed }
            goto L_0x00dc
        L_0x0083:
            r0 = 11
            X.Y8z r4 = r10.A0G
            if (r1 != r0) goto L_0x00d8
            int r1 = r10.A03
            X.Xv8 r4 = (X.C22082Xv8) r4
            monitor-enter(r4)
            X.YA2 r0 = r4.A02     // Catch:{ all -> 0x00f0 }
            r0.getClass()     // Catch:{ all -> 0x00f0 }
            boolean r13 = X.AnonymousClass7TF.A1Q(r1)
            java.util.HashMap r0 = r4.A07     // Catch:{ all -> 0x00f0 }
            java.util.Iterator r12 = X.AnonymousClass7TF.A0t(r0)     // Catch:{ all -> 0x00f0 }
        L_0x009d:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x00f0 }
            X.Xar r10 = (X.C21439Xar) r10     // Catch:{ all -> 0x00f0 }
            int r1 = r10.A00     // Catch:{ all -> 0x00f0 }
            int r0 = r5.A01     // Catch:{ all -> 0x00f0 }
            if (r1 == r0) goto L_0x009d
            r12.remove()     // Catch:{ all -> 0x00f0 }
            boolean r0 = r10.A03     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r3 = r10.A04     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r4.A03     // Catch:{ all -> 0x00f0 }
            boolean r2 = r3.equals(r0)     // Catch:{ all -> 0x00f0 }
            if (r13 == 0) goto L_0x00c7
            if (r2 == 0) goto L_0x00c7
            boolean r0 = r10.A02     // Catch:{ all -> 0x00f0 }
            r1 = 1
            if (r0 != 0) goto L_0x00ca
        L_0x00c7:
            r1 = 0
            if (r2 == 0) goto L_0x00cd
        L_0x00ca:
            r0 = 0
            r4.A03 = r0     // Catch:{ all -> 0x00f0 }
        L_0x00cd:
            X.YA2 r0 = r4.A02     // Catch:{ all -> 0x00f0 }
            r0.DjP(r5, r3, r1)     // Catch:{ all -> 0x00f0 }
            goto L_0x009d
        L_0x00d3:
            X.C22082Xv8.A01(r5, r4)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r4)
            goto L_0x00dd
        L_0x00d8:
            r4.FLU(r5)
            goto L_0x00dd
        L_0x00dc:
            monitor-exit(r2)
        L_0x00dd:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x00e1:
            X.Xv8 r0 = r12.A05     // Catch:{ all -> 0x00ed }
            X.SIQ r0 = r0.A05     // Catch:{ all -> 0x00ed }
            r4.A0A(r0, r3)     // Catch:{ all -> 0x00ed }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00ed }
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00f3:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            boolean r0 = r7.get(r4)
            if (r0 == 0) goto L_0x0107
            android.util.SparseArray r0 = r8.A00
            java.lang.Object r0 = r0.get(r4)
            r0.getClass()
        L_0x0107:
            r0 = 2
            boolean r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0134
            android.media.metrics.PlaybackMetrics$Builder r0 = r10.A04
            if (r0 == 0) goto L_0x0134
            r0 = r9
            X.Xui r0 = (X.C22056Xui) r0
            X.C22056Xui.A02(r0)
            X.Xqt r0 = r0.A0A
            X.XaD r0 = r0.A0B
            X.XoI r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A00
            X.3kO r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0134
            r1.next()
            java.lang.String r0 = "trackSelected"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0134:
            r0 = 1011(0x3f3, float:1.417E-42)
            boolean r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0142
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
        L_0x0142:
            X.XSl r11 = r10.A05
            if (r11 == 0) goto L_0x0184
            android.content.Context r0 = r10.A0D
            r17 = r0
            r12 = 1
            int r14 = r11.A00
            r2 = 0
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r14 != r0) goto L_0x01a9
            r3 = 20
        L_0x0154:
            X.XZf r13 = new X.XZf
            r13.<init>(r3, r4)
        L_0x0159:
            android.media.metrics.PlaybackSession r14 = r10.A0E
            android.media.metrics.PlaybackErrorEvent$Builder r15 = new android.media.metrics.PlaybackErrorEvent$Builder
            r15.<init>()
            long r2 = r10.A0C
            long r0 = r5 - r2
            android.media.metrics.PlaybackErrorEvent$Builder r1 = r15.setTimeSinceCreatedMillis(r0)
            int r0 = r13.A00
            android.media.metrics.PlaybackErrorEvent$Builder r1 = r1.setErrorCode(r0)
            int r0 = r13.A01
            android.media.metrics.PlaybackErrorEvent$Builder r0 = r1.setSubErrorCode(r0)
            android.media.metrics.PlaybackErrorEvent$Builder r0 = r0.setException(r11)
            android.media.metrics.PlaybackErrorEvent r0 = r0.build()
            r14.reportPlaybackErrorEvent(r0)
            r10.A08 = r12
            r0 = 0
            r10.A05 = r0
        L_0x0184:
            r11 = 2
            boolean r0 = r7.get(r11)
            if (r0 == 0) goto L_0x02b5
            r0 = r9
            X.Xui r0 = (X.C22056Xui) r0
            X.C22056Xui.A02(r0)
            X.Xqt r0 = r0.A0A
            X.XaD r0 = r0.A0B
            X.XoI r2 = r0.A00
            com.google.common.collect.ImmutableList r1 = r2.A00
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0293
            r1.get(r4)
            java.lang.String r0 = "trackSelected"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01a9:
            boolean r0 = r11 instanceof X.XGY
            if (r0 == 0) goto L_0x021b
            r1 = r11
            X.XGY r1 = (X.XGY) r1
            int r0 = r1.A01
            boolean r16 = X.AnonymousClass7TF.A1S(r0, r12)
            int r13 = r1.A00
        L_0x01b8:
            java.lang.Throwable r1 = r11.getCause()
            r1.getClass()
            boolean r0 = r1 instanceof java.io.IOException
            r3 = 3
            r15 = 23
            if (r0 == 0) goto L_0x01d5
            boolean r0 = r1 instanceof X.C7453QDs
            if (r0 == 0) goto L_0x021f
            X.QDs r1 = (X.C7453QDs) r1
            int r2 = r1.A00
            r15 = 5
        L_0x01cf:
            X.XZf r13 = new X.XZf
            r13.<init>(r15, r2)
            goto L_0x0159
        L_0x01d5:
            if (r16 == 0) goto L_0x01e5
            if (r13 == 0) goto L_0x028b
            if (r13 == r12) goto L_0x028b
            if (r13 != r3) goto L_0x01e1
            r3 = 15
            goto L_0x0154
        L_0x01e1:
            r0 = 2
            if (r13 != r0) goto L_0x01e5
            goto L_0x01cf
        L_0x01e5:
            r3 = 14
            boolean r0 = r1 instanceof java.lang.OutOfMemoryError
            if (r0 != 0) goto L_0x0154
            boolean r0 = r1 instanceof android.media.MediaCodec.CryptoException
            if (r0 == 0) goto L_0x028f
            android.media.MediaCodec$CryptoException r1 = (android.media.MediaCodec.CryptoException) r1
            int r2 = r1.getErrorCode()
            r0 = 2
            if (r2 == r0) goto L_0x0218
            r0 = 4
            if (r2 == r0) goto L_0x0218
            r0 = 10
            if (r2 == r0) goto L_0x0215
            r0 = 7
            if (r2 == r0) goto L_0x0218
            r0 = 8
            if (r2 == r0) goto L_0x0212
            switch(r2) {
                case 15: goto L_0x0212;
                case 16: goto L_0x0218;
                case 17: goto L_0x0215;
                case 18: goto L_0x0218;
                case 19: goto L_0x0215;
                case 20: goto L_0x0215;
                case 21: goto L_0x0215;
                case 22: goto L_0x0215;
                default: goto L_0x0209;
            }
        L_0x0209:
            switch(r2) {
                case 24: goto L_0x020f;
                case 25: goto L_0x020f;
                case 26: goto L_0x020f;
                case 27: goto L_0x020f;
                case 28: goto L_0x020f;
                default: goto L_0x020c;
            }
        L_0x020c:
            r15 = 27
            goto L_0x01cf
        L_0x020f:
            r15 = 24
            goto L_0x01cf
        L_0x0212:
            r15 = 28
            goto L_0x01cf
        L_0x0215:
            r15 = 25
            goto L_0x01cf
        L_0x0218:
            r15 = 26
            goto L_0x01cf
        L_0x021b:
            r13 = 0
            r16 = 0
            goto L_0x01b8
        L_0x021f:
            boolean r0 = r1 instanceof X.XQX
            if (r0 == 0) goto L_0x0227
            r3 = 11
            goto L_0x0154
        L_0x0227:
            boolean r13 = r1 instanceof X.C7454QDt
            if (r13 != 0) goto L_0x0262
            boolean r0 = r1 instanceof X.C7451QDq
            if (r0 != 0) goto L_0x0262
            r0 = 1002(0x3ea, float:1.404E-42)
            r3 = 21
            if (r14 == r0) goto L_0x0154
            boolean r0 = r1 instanceof X.C7449QDo
            if (r0 == 0) goto L_0x025e
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x025e
            java.lang.Throwable r0 = r1.getCause()
            r0.getClass()
            java.lang.Throwable r1 = r0.getCause()
            boolean r0 = r1 instanceof android.system.ErrnoException
            if (r0 == 0) goto L_0x025a
            android.system.ErrnoException r1 = (android.system.ErrnoException) r1
            int r1 = r1.errno
            int r0 = android.system.OsConstants.EACCES
            r3 = 32
            if (r1 == r0) goto L_0x0154
        L_0x025a:
            r3 = 31
            goto L_0x0154
        L_0x025e:
            r3 = 9
            goto L_0x0154
        L_0x0262:
            X.SOE r0 = X.SOE.A00(r17)
            int r0 = r0.A02()
            if (r0 == r12) goto L_0x0154
            java.lang.Throwable r2 = r1.getCause()
            boolean r0 = r2 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0277
            r3 = 6
            goto L_0x0154
        L_0x0277:
            boolean r0 = r2 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L_0x027e
            r3 = 7
            goto L_0x0154
        L_0x027e:
            if (r13 == 0) goto L_0x0287
            X.QDt r1 = (X.C7454QDt) r1
            int r0 = r1.A00
            r3 = 4
            if (r0 == r12) goto L_0x0154
        L_0x0287:
            r3 = 8
            goto L_0x0154
        L_0x028b:
            r3 = 35
            goto L_0x0154
        L_0x028f:
            r3 = 22
            goto L_0x0154
        L_0x0293:
            com.google.common.collect.ImmutableList r1 = r2.A00
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x02a5
            r1.get(r4)
            java.lang.String r0 = "trackSelected"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02a5:
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x02b5
            r1.get(r4)
            java.lang.String r0 = "trackSelected"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02b5:
            android.content.Context r0 = r10.A0D
            X.SOE r0 = X.SOE.A00(r0)
            int r0 = r0.A02()
            switch(r0) {
                case 0: goto L_0x03c4;
                case 1: goto L_0x03c0;
                case 2: goto L_0x03bd;
                case 3: goto L_0x03ba;
                case 4: goto L_0x03b7;
                case 5: goto L_0x03b4;
                case 6: goto L_0x02c2;
                case 7: goto L_0x03b1;
                case 8: goto L_0x02c2;
                case 9: goto L_0x03ad;
                case 10: goto L_0x03aa;
                default: goto L_0x02c2;
            }
        L_0x02c2:
            r1 = 1
        L_0x02c3:
            int r0 = r10.A01
            if (r1 == r0) goto L_0x02e3
            r10.A01 = r1
            android.media.metrics.PlaybackSession r13 = r10.A0E
            android.media.metrics.NetworkEvent$Builder r0 = new android.media.metrics.NetworkEvent$Builder
            r0.<init>()
            android.media.metrics.NetworkEvent$Builder r12 = r0.setNetworkType(r1)
            long r2 = r10.A0C
            long r0 = r5 - r2
            android.media.metrics.NetworkEvent$Builder r0 = r12.setTimeSinceCreatedMillis(r0)
            android.media.metrics.NetworkEvent r0 = r0.build()
            r13.reportNetworkEvent(r0)
        L_0x02e3:
            X.Xui r9 = (X.C22056Xui) r9
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            int r0 = r0.A01
            if (r0 == r11) goto L_0x02f0
            r10.A07 = r4
        L_0x02f0:
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            X.XGY r0 = r0.A07
            r1 = 1
            if (r0 != 0) goto L_0x039e
            r10.A06 = r4
        L_0x02fc:
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            int r12 = r0.A01
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0345
            r3 = 5
        L_0x0308:
            int r0 = r10.A02
            if (r0 == r3) goto L_0x032b
            r10.A02 = r3
            r10.A08 = r1
            android.media.metrics.PlaybackSession r3 = r10.A0E
            android.media.metrics.PlaybackStateEvent$Builder r1 = new android.media.metrics.PlaybackStateEvent$Builder
            r1.<init>()
            int r0 = r10.A02
            android.media.metrics.PlaybackStateEvent$Builder r2 = r1.setState(r0)
            long r0 = r10.A0C
            long r5 = r5 - r0
            android.media.metrics.PlaybackStateEvent$Builder r0 = r2.setTimeSinceCreatedMillis(r5)
            android.media.metrics.PlaybackStateEvent r0 = r0.build()
            r3.reportPlaybackStateEvent(r0)
        L_0x032b:
            r1 = 1028(0x404, float:1.44E-42)
            boolean r0 = r7.get(r1)
            if (r0 == 0) goto L_0x0401
            X.Y8z r6 = r10.A0G
            android.util.SparseArray r0 = r8.A00
            java.lang.Object r5 = r0.get(r1)
            r5.getClass()
            X.Xch r5 = (X.C21490Xch) r5
            X.Xv8 r6 = (X.C22082Xv8) r6
            monitor-enter(r6)
            goto L_0x03c7
        L_0x0345:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x034c
            r3 = 13
            goto L_0x0308
        L_0x034c:
            r0 = 4
            r3 = 11
            if (r12 == r0) goto L_0x0308
            r3 = 12
            r2 = 2
            if (r12 != r11) goto L_0x0376
            int r0 = r10.A02
            if (r0 == 0) goto L_0x038f
            if (r0 == r11) goto L_0x038f
            if (r0 == r3) goto L_0x038f
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            boolean r0 = r0.A0E
            if (r0 != 0) goto L_0x0369
            r3 = 7
            goto L_0x0308
        L_0x0369:
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            int r0 = r0.A02
            r3 = 6
            if (r0 == 0) goto L_0x0308
            r3 = 10
            goto L_0x0308
        L_0x0376:
            r2 = 3
            if (r12 != r2) goto L_0x0392
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            boolean r0 = r0.A0E
            if (r0 != 0) goto L_0x0384
            r3 = 4
            goto L_0x0308
        L_0x0384:
            X.C22056Xui.A02(r9)
            X.Xqt r0 = r9.A0A
            int r0 = r0.A02
            if (r0 == 0) goto L_0x038f
            r2 = 9
        L_0x038f:
            r3 = r2
            goto L_0x0308
        L_0x0392:
            if (r12 != r1) goto L_0x039a
            int r0 = r10.A02
            if (r0 == 0) goto L_0x039a
            goto L_0x0308
        L_0x039a:
            int r3 = r10.A02
            goto L_0x0308
        L_0x039e:
            r0 = 10
            boolean r0 = r7.get(r0)
            if (r0 == 0) goto L_0x02fc
            r10.A06 = r1
            goto L_0x02fc
        L_0x03aa:
            r1 = 7
            goto L_0x02c3
        L_0x03ad:
            r1 = 8
            goto L_0x02c3
        L_0x03b1:
            r1 = 3
            goto L_0x02c3
        L_0x03b4:
            r1 = 6
            goto L_0x02c3
        L_0x03b7:
            r1 = 5
            goto L_0x02c3
        L_0x03ba:
            r1 = 4
            goto L_0x02c3
        L_0x03bd:
            r1 = 2
            goto L_0x02c3
        L_0x03c0:
            r1 = 9
            goto L_0x02c3
        L_0x03c4:
            r1 = 0
            goto L_0x02c3
        L_0x03c7:
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03d9
            java.util.HashMap r0 = r6.A07     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x03fe }
            X.Xar r0 = (X.C21439Xar) r0     // Catch:{ all -> 0x03fe }
            r0.getClass()     // Catch:{ all -> 0x03fe }
            r0 = 0
            r6.A03 = r0     // Catch:{ all -> 0x03fe }
        L_0x03d9:
            java.util.HashMap r0 = r6.A07     // Catch:{ all -> 0x03fe }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0t(r0)     // Catch:{ all -> 0x03fe }
        L_0x03df:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03fc
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x03fe }
            X.Xar r2 = (X.C21439Xar) r2     // Catch:{ all -> 0x03fe }
            r3.remove()     // Catch:{ all -> 0x03fe }
            boolean r0 = r2.A03     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03df
            X.YA2 r1 = r6.A02     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03df
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x03fe }
            r1.DjP(r5, r0, r4)     // Catch:{ all -> 0x03fe }
            goto L_0x03df
        L_0x03fc:
            monitor-exit(r6)
            return
        L_0x03fe:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0401:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22081Xv7.DDA(X.Y8v, X.XZe):void");
    }

    public final void DjP(C21490Xch xch, String str, boolean z) {
        if (str.equals(this.A0B)) {
            A01();
        }
        this.A0J.remove(str);
        this.A0I.remove(str);
    }

    public final void DxK(C21459XbP xbP, C21490Xch xch) {
        this.A09 = this.A09;
        this.A0A = this.A0A;
    }

    public C22081Xv7(Context context, PlaybackSession playbackSession) {
        this.A0D = context.getApplicationContext();
        this.A0E = playbackSession;
        C22082Xv8 xv8 = new C22082Xv8();
        this.A0G = xv8;
        xv8.A02 = this;
    }

    public final void DjM(C21490Xch xch, String str) {
        A01();
        this.A0B = str;
        this.A04 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.0");
    }

    public final void DXn(C21281XSl xSl, C21490Xch xch) {
        this.A05 = xSl;
    }

    public final void Cxn(C21490Xch xch, int i, long j, long j2) {
    }
}
