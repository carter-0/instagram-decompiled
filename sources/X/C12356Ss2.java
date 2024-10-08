package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.lang.Thread;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ss2  reason: case insensitive filesystem */
public final class C12356Ss2 implements C13862Tii, Handler.Callback {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public Handler A0E;
    public C13724Tfu A0F;
    public C13587TdF A0G;
    public SJL A0H;
    public Q1J A0I;
    public C266724aF A0J;
    public SOP A0K;
    public SRI A0L;
    public C10810RyW A0M;
    public C13596TdO A0N;
    public C13597TdP A0O;
    public C10862RzN A0P;
    public C13726Tfw A0Q;
    public C10292Rpq A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public ScheduledExecutorService A0V;
    public ScheduledFuture A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Context A0a;
    public final ConditionVariable A0b;
    public final Handler.Callback A0c;
    public final Handler A0d;
    public final HandlerThread A0e;
    public final C13886Tj9 A0f;
    public final C7255Q1d A0g;
    public final SNJ A0h;
    public final C13588TdG A0i;
    public final C13725Tfv A0j;
    public final C13590TdI A0k;
    public final C13780Tgv A0l;
    public final C13804ThT A0m;
    public final S0X A0n;
    public final C10796RyI A0o;
    public final S2O A0p;
    public final C13598TdQ A0q;
    public final SO6 A0r;
    public final File A0s;
    public final String A0t;
    public final String A0u;
    public final Thread.UncaughtExceptionHandler A0v;
    public final boolean A0w;
    public final boolean A0x;
    public volatile SU1 A0y;
    public volatile C390949s6 A0z;
    public volatile boolean A10;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    private void A02() {
        A0A(this, "cleanupCodecState", new Object[0]);
        ? obj = new Object();
        try {
            A0A(this, "cleanupVideoEncoderSafely", new Object[0]);
            C10810RyW ryW = this.A0M;
            if (ryW != null) {
                Iterator A0u2 = AnonymousClass7TF.A0u(ryW.A07);
                while (A0u2.hasNext()) {
                    Pxh.A0Q(A0u2).AVT();
                }
                this.A0M = null;
            }
        } catch (Throwable th) {
            C7254Q1b.A00(obj, th);
            C9603Rdh.A00("cleanupVideoEncoderSafely", th);
        }
        this.A0Q = null;
        this.A0M = null;
        if (this.A0y != null) {
            try {
                this.A0y.A0A();
            } catch (Throwable th2) {
                A0A(this, "cleanupCodecState: mMultipleTrackCoordinatorRealtime.releasePlayer Exception=%s", th2);
                C7254Q1b.A00(obj, th2);
                C9603Rdh.A00("cleanup", th2);
            }
        }
        this.A0y = null;
        try {
            obj.A01();
        } catch (Throwable th3) {
            A0A(this, "cleanupCodecState: context Exception=%s", th3);
            A0B(this, th3);
        }
    }

    public final void APK() {
        this.A0Y = true;
    }

    public final void ETy(String str) {
        this.A0T = null;
    }

    public final void pause() {
        A0A(this, "pause", new Object[0]);
        if (this.A0L != null) {
            A0A(this, "maybeCancelReverse mMediaCompositionNormalizationUtil.cancel", new Object[0]);
            this.A0L.A04();
        }
        A08(C8897REp.PLAY);
        A08(C8897REp.DO_WORK);
        A0I(C8897REp.PAUSE, (Object) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void release() {
        /*
            r11 = this;
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "release"
            A0A(r11, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "removeAllMessages: "
            r1.append(r0)
            X.REp[] r0 = X.C8897REp.values()
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            A0A(r11, r1, r0)
            X.REp[] r3 = X.C8897REp.values()
            int r1 = r3.length
        L_0x0026:
            if (r4 >= r1) goto L_0x0030
            r0 = r3[r4]
            r11.A08(r0)
            int r4 = r4 + 1
            goto L_0x0026
        L_0x0030:
            X.SU1 r10 = r11.A0y
            if (r10 == 0) goto L_0x00b6
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "release multipleTrackCoordinatorRealtime.cancel"
            A0A(r11, r0, r1)
            r0 = 1
            r10.A0b = r0
            X.RzN r0 = r10.A0M
            X.Q4k r9 = r0.A0B
            boolean r0 = r9 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0096
            r1 = r9
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0096
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0096
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r1 = "cancel: mDemuxDecodeWrapperManager.cancel"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r0, r1, r3)
            X.SEm r8 = r10.A0K
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r1 = "DemuxDecodeWrapperManager"
            java.lang.String r0 = "cancel"
            X.Q1V.A00(r1, r0, r3)
            X.4aE[] r7 = X.C266714aE.values()
            int r6 = r7.length
            r5 = 0
        L_0x0072:
            if (r5 >= r6) goto L_0x0096
            r1 = r7[r5]
            java.util.Map r0 = r8.A01
            java.lang.Object r4 = r0.get(r1)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            if (r4 == 0) goto L_0x0093
            int r3 = r4.size()
            r1 = 0
        L_0x0085:
            if (r1 >= r3) goto L_0x0093
            java.lang.Object r0 = r4.valueAt(r1)
            X.Tia r0 = (X.C13855Tia) r0
            r0.cancel()
            int r1 = r1 + 1
            goto L_0x0085
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x0096:
            boolean r0 = r9.A05()
            if (r0 == 0) goto L_0x00b6
            X.RyW r0 = r10.A0L
            java.util.Map r0 = r0.A07
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            X.Q1G r0 = X.Pxh.A0Q(r1)
            X.Tid r0 = r0.A00
            if (r0 == 0) goto L_0x00a4
            r0.cancel()
            goto L_0x00a4
        L_0x00b6:
            X.SRI r0 = r11.A0L
            if (r0 == 0) goto L_0x00c7
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "maybeCancelReverse mMediaCompositionNormalizationUtil.cancel"
            A0A(r11, r0, r1)
            X.SRI r0 = r11.A0L
            r0.A04()
        L_0x00c7:
            android.os.HandlerThread r1 = r11.A0e
            if (r1 == 0) goto L_0x00d8
            X.RzN r0 = r11.A0P
            X.Q4k r0 = r0.A0B
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00d8
            r1.interrupt()
        L_0x00d8:
            boolean r0 = r11.A0x
            if (r0 == 0) goto L_0x00f2
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            r11.A0V = r5
            X.TCy r1 = new X.TCy
            r1.<init>(r11)
            r3 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r5.schedule(r1, r3, r0)
            r11.A0W = r0
        L_0x00f2:
            X.REp r4 = X.C8897REp.RELEASE
            r3 = 0
            r0 = 0
            r11.A0I(r4, r3, r0)
            android.os.ConditionVariable r3 = r11.A0b
            X.RzN r0 = r11.A0P
            X.Q4k r1 = r0.A0B
            boolean r0 = r1 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0143
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0143
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            int r0 = r0.A03
        L_0x0112:
            long r0 = (long) r0
            r3.block(r0)
            boolean r0 = r11.A0Z
            if (r0 != 0) goto L_0x0142
            X.RzN r0 = r11.A0P
            X.Q4k r1 = r0.A0B
            boolean r0 = r1 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0132
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0132
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A15
            if (r0 != 0) goto L_0x0142
        L_0x0132:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "release timed out"
            A0A(r11, r1, r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            A0B(r11, r0)
        L_0x0142:
            return
        L_0x0143:
            r0 = 5000(0x1388, float:7.006E-42)
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.release():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r2 == r4) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r14 = this;
            X.9s6 r1 = r14.A0z
            X.9s6 r0 = X.C390949s6.PLAYING
            if (r1 != r0) goto L_0x0060
            X.4aF r0 = r14.A0J
            r0.getClass()
            X.SU1 r0 = r14.A0y
            r0.getClass()
            X.4aF r0 = r14.A0J
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r0.A02(r8)
            X.SU1 r0 = r14.A0y
            r7 = 0
            long r2 = r0.A07(r4, r7)
            X.Q1J r6 = r14.A0I
            if (r6 == 0) goto L_0x003a
            X.SU1 r11 = r14.A0y
            long r0 = r11.A0a
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x007a
            r0 = 0
        L_0x002e:
            double r0 = (double) r0
            X.SU1 r9 = r14.A0y
            long r9 = r9.A0Z
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.A00(r9, r0)
        L_0x003a:
            X.4aF r1 = r14.A0J
            X.RzN r0 = r14.A0P
            X.Q4k r0 = r0.A0B
            boolean r0 = X.C7334Q4k.A00(r1, r0, r8, r2)
            if (r0 == 0) goto L_0x004b
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            X.REp r3 = X.C8897REp.DO_WORK
            r14.A08(r3)
            r2 = 0
            if (r0 != 0) goto L_0x0061
            X.SU1 r0 = r14.A0y
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x005c
            r7 = 10
        L_0x005c:
            long r0 = (long) r7
        L_0x005d:
            r14.A0I(r3, r2, r0)
        L_0x0060:
            return
        L_0x0061:
            boolean r0 = r14.A10
            if (r0 == 0) goto L_0x0088
            X.4aF r0 = r14.A0J
            long r0 = r0.A03(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.Rp8 r0 = new X.Rp8
            r0.<init>(r1)
            r14.A09(r0)
            r0 = 10
            goto L_0x005d
        L_0x007a:
            long r0 = r11.A0Z
            float r10 = (float) r0
            long r0 = r11.A0a
            float r9 = (float) r0
            float r10 = r10 / r9
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r10, r0)
            goto L_0x002e
        L_0x0088:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "doWork setPlaybackState PLAYBACK_COMPLETE"
            A0A(r14, r0, r1)
            X.9s6 r0 = X.C390949s6.PLAYBACK_COMPLETE
            r14.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.A03():void");
    }

    private void A05() {
        String str;
        String str2;
        C390949s6 r2;
        C10833Ryt ryt;
        A0A(this, "playInternal", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0H(this) && this.A0z != (r2 = C390949s6.PLAYING)) {
                SOP sop = this.A0K;
                if (!(sop == null || (ryt = sop.A05) == null)) {
                    ryt.A05 = true;
                }
                this.A0X = true;
                A0A(this, "onPlaybackStarted", new Object[0]);
                this.A0C = System.currentTimeMillis();
                A0E(r2);
                A03();
            }
        } finally {
            HashMap A012 = A01(this, "media_player_start_time_ms", currentTimeMillis);
            SJL sjl = this.A0H;
            if (!(sjl == null || (str2 = sjl.A0G) == null)) {
                A012.put("decoder_debug_info", str2);
            }
            A0A(this, "playInternal logPlay params=%s", A012);
            str = "media_player_play";
            SNJ.A00(this.A0h, str, A012);
        }
    }

    private void A06(MediaComposition mediaComposition, int i, long j) {
        SNJ snj = this.A0h;
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        HashMap A002 = A00(this);
        0qQ.A0B(mediaComposition, 0);
        A002.put("media_composition", mediaComposition.toString());
        A002.put("target_position_ms", String.valueOf(millis));
        A002.put("media_composition_update_time_ms", String.valueOf(i));
        A002.put("media_composition_hash", mediaComposition.A05());
        SNJ.A00(snj, "media_player_update_media_composition", A002);
    }

    private void A08(C8897REp rEp) {
        this.A0d.removeMessages(rEp.ordinal());
    }

    public static void A0A(C12356Ss2 ss2, String str, Object... objArr) {
        Q1V.A00("FBMediaCompositionPlayer", 002.A0u("mPlayerSessionId: ", ss2.A0u, " ", str), objArr);
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [X.SsM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v63, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r21v7, types: [X.Tfv, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|16|(8:17|18|19|20|21|22|23|24)|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        if (r11.A0M == true) goto L_0x020a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00e5 */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038f A[Catch:{ all -> 0x03b4, all -> 0x049d }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03af A[Catch:{ all -> 0x03b4, all -> 0x049d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0202 A[Catch:{ all -> 0x03b4, all -> 0x049d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0216 A[Catch:{ all -> 0x03b4, all -> 0x049d }, LOOP:0: B:75:0x0216->B:78:0x0224, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x022c A[Catch:{ all -> 0x03b4, all -> 0x049d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(java.lang.Long r37) {
        /*
            r36 = this;
            java.lang.String r20 = "logPrepare mMediaComposition=%s, params=%s"
            java.lang.String r15 = "media_player_prepare_time_ms"
            r10 = 1
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r37}
            java.lang.String r0 = "doPrepare: seekToPositionNs=%d"
            r6 = r36
            A0A(r6, r0, r1)
            long r16 = java.lang.System.currentTimeMillis()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            X.9s6 r0 = X.C390949s6.PREPARING     // Catch:{ all -> 0x049d }
            r6.A0E(r0)     // Catch:{ all -> 0x049d }
            java.lang.String r0 = "FbMediaCompositionPlayer.reversal"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x049d }
            android.content.Context r0 = r6.A0a     // Catch:{ all -> 0x049d }
            r35 = r0
            X.Tfv r9 = r6.A0j     // Catch:{ all -> 0x049d }
            X.ThT r1 = r6.A0m     // Catch:{ all -> 0x049d }
            X.TdI r0 = r6.A0k     // Catch:{ all -> 0x049d }
            r34 = r0
            X.Tgv r0 = r6.A0l     // Catch:{ all -> 0x049d }
            r33 = r0
            X.SsM r28 = new X.SsM     // Catch:{ all -> 0x049d }
            r28.<init>()     // Catch:{ all -> 0x049d }
            r19 = 0
            X.RzN r3 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q1d r0 = r6.A0g     // Catch:{ all -> 0x049d }
            r32 = r0
            java.io.File r2 = r6.A0s     // Catch:{ all -> 0x049d }
            java.lang.Integer r31 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x049d }
            X.SRI r0 = new X.SRI     // Catch:{ all -> 0x049d }
            r24 = r9
            r25 = r34
            r26 = r33
            r27 = r1
            r29 = r3
            r30 = r2
            r21 = r0
            r22 = r35
            r23 = r32
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x049d }
            r6.A0L = r0     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r8 = r0.A03(r5)     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r1 = r0.A0B     // Catch:{ all -> 0x049d }
            boolean r0 = r1 instanceof X.C7964QeC     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x00a9
            X.QeC r1 = (X.C7964QeC) r1     // Catch:{ all -> 0x049d }
            int r0 = r1.A00     // Catch:{ all -> 0x049d }
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x00bd
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x049d }
            X.833 r0 = (X.AnonymousClass833) r0     // Catch:{ all -> 0x049d }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x049d }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x049d }
            r0 = 36330389622571622(0x81124c00014266, double:3.038822915826637E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x049d }
        L_0x0083:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049d }
            r8.A0A(r0)     // Catch:{ all -> 0x049d }
            X.C349257zq.A01()     // Catch:{ all -> 0x049d }
            X.RyI r7 = r6.A0o     // Catch:{ all -> 0x049d }
            if (r7 != 0) goto L_0x0119
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r0 = r0.A0B     // Catch:{ all -> 0x049d }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x049d }
            if (r0 != 0) goto L_0x0119
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x049d }
            r1 = 360(0x168, float:5.04E-43)
            r0 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch:{ all -> 0x049d }
            X.0qQ.A0B(r2, r5)     // Catch:{ all -> 0x049d }
            goto L_0x00bf
        L_0x00a9:
            boolean r0 = r1 instanceof X.C7967QeF     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x00bd
            X.QeF r1 = (X.C7967QeF) r1     // Catch:{ all -> 0x049d }
            com.instagram.common.session.UserSession r3 = r1.A00     // Catch:{ all -> 0x049d }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x049d }
            r0 = 36330389622571622(0x81124c00014266, double:3.038822915826637E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x049d }
            goto L_0x0083
        L_0x00bd:
            r0 = 0
            goto L_0x0083
        L_0x00bf:
            java.lang.String r1 = "dummy"
            java.lang.String r0 = ".jpg"
            java.io.File r3 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00e0 }
            java.io.FileOutputStream r1 = X.JTO.A0t(r3)     // Catch:{ all -> 0x00e0 }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00dc, all -> 0x00d6 }
            r0 = 60
            X.0fO.A02(r11, r2, r1, r0)     // Catch:{ Exception -> 0x00dc, all -> 0x00d6 }
            r1.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00e5
        L_0x00d6:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0499 }
            goto L_0x0499
        L_0x00dc:
            r1.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00e5
        L_0x00e0:
            r0 = move-exception
            goto L_0x0499
        L_0x00e3:
            r3 = r19
        L_0x00e5:
            r2.recycle()     // Catch:{ all -> 0x049d }
            X.4aH r2 = new X.4aH     // Catch:{ all -> 0x049d }
            r2.<init>(r3)     // Catch:{ all -> 0x049d }
            X.4aE r0 = X.C266714aE.AUDIO     // Catch:{ all -> 0x049d }
            long r0 = X.Q1Z.A00(r9, r0, r8)     // Catch:{ all -> 0x049d }
            r2.A02 = r0     // Catch:{ all -> 0x049d }
            X.4aI r2 = r2.A00()     // Catch:{ all -> 0x049d }
            X.4aP r1 = r8.A03()     // Catch:{ all -> 0x049d }
            X.4aE r3 = X.C266714aE.VIDEO     // Catch:{ all -> 0x049d }
            java.util.HashMap r0 = r1.A02     // Catch:{ all -> 0x049d }
            r0.remove(r3)     // Catch:{ all -> 0x049d }
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x049d }
            r0.remove(r3)     // Catch:{ all -> 0x049d }
            X.4aJ r0 = new X.4aJ     // Catch:{ all -> 0x049d }
            r0.<init>(r3)     // Catch:{ all -> 0x049d }
            r0.A02(r2)     // Catch:{ all -> 0x049d }
            X.Pxf.A1F(r1, r0)     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r8 = new com.facebook.videolite.transcoder.base.composition.MediaComposition     // Catch:{ all -> 0x049d }
            r8.<init>(r1)     // Catch:{ all -> 0x049d }
        L_0x0119:
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.RzN r0 = X.SQv.A00(r8, r0)     // Catch:{ all -> 0x049d }
            r6.A0P = r0     // Catch:{ all -> 0x049d }
            X.4aE r0 = X.C266714aE.VIDEO     // Catch:{ all -> 0x049d }
            long r2 = X.Q1Z.A00(r9, r0, r8)     // Catch:{ all -> 0x049d }
            r6.A05 = r2     // Catch:{ all -> 0x049d }
            r0 = 0
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0141
            X.RzN r11 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r11 = r11.A0B     // Catch:{ all -> 0x049d }
            boolean r11 = r11.A04()     // Catch:{ all -> 0x049d }
            if (r11 == 0) goto L_0x0141
            X.4aE r2 = X.C266714aE.AUDIO     // Catch:{ all -> 0x049d }
            long r2 = X.Q1Z.A00(r9, r2, r8)     // Catch:{ all -> 0x049d }
            r6.A05 = r2     // Catch:{ all -> 0x049d }
        L_0x0141:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x047f
            X.4aF r8 = r6.A0J     // Catch:{ all -> 0x049d }
            if (r8 != 0) goto L_0x0151
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x049d }
            X.4aF r0 = X.Pxe.A0V(r8, r0, r2)     // Catch:{ all -> 0x049d }
            r6.A0J = r0     // Catch:{ all -> 0x049d }
        L_0x0151:
            java.lang.String r1 = "doPrepare initialize"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x049d }
            A0A(r6, r1, r0)     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r1 = r0.A0B     // Catch:{ all -> 0x049d }
            boolean r0 = r1 instanceof X.C7964QeC     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0182
            X.QeC r1 = (X.C7964QeC) r1     // Catch:{ all -> 0x049d }
            int r0 = r1.A00     // Catch:{ all -> 0x049d }
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0182
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x049d }
            X.SJN r0 = (X.SJN) r0     // Catch:{ all -> 0x049d }
            boolean r0 = r0.A17     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0182
            if (r37 == 0) goto L_0x0173
            goto L_0x017c
        L_0x0173:
            X.4aF r1 = r6.A0J     // Catch:{ all -> 0x049d }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x049d }
            long r0 = r1.A03(r0)     // Catch:{ all -> 0x049d }
            goto L_0x0180
        L_0x017c:
            long r0 = r37.longValue()     // Catch:{ all -> 0x049d }
        L_0x0180:
            r6.A07 = r0     // Catch:{ all -> 0x049d }
        L_0x0182:
            X.RzN r0 = r6.A0P     // Catch:{ Exception -> 0x01a9 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08     // Catch:{ Exception -> 0x01a9 }
            r0.getClass()     // Catch:{ Exception -> 0x01a9 }
            X.SrR r21 = new X.SrR     // Catch:{ Exception -> 0x01a9 }
            r21.<init>()     // Catch:{ Exception -> 0x01a9 }
            r22 = r9
            r23 = r0
            r24 = r5
            r25 = r5
            r26 = r5
            X.Q0d r1 = X.S9V.A00(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r2 = "media_metadata"
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01a7 }
            r4.put(r2, r0)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01b5
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ac
        L_0x01a9:
            r0 = move-exception
            r1 = r19
        L_0x01ac:
            java.lang.String r2 = "doPrepare: Exception=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x049d }
            A0A(r6, r2, r0)     // Catch:{ all -> 0x049d }
        L_0x01b5:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x049d }
            java.lang.String r0 = "initialize"
            A0A(r6, r0, r2)     // Catch:{ all -> 0x049d }
            r6.A02()     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08     // Catch:{ all -> 0x049d }
            r0.getClass()     // Catch:{ all -> 0x049d }
            if (r7 != 0) goto L_0x01ca
            goto L_0x0332
        L_0x01ca:
            X.TdQ r2 = r6.A0q     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08     // Catch:{ all -> 0x049d }
            X.Tfw r11 = r2.ALN(r0, r5)     // Catch:{ all -> 0x049d }
            r6.A0Q = r11     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.SOn r8 = r0.A06     // Catch:{ all -> 0x049d }
            X.Q4k r3 = r0.A0B     // Catch:{ all -> 0x049d }
            X.Rdm r0 = r0.A0A     // Catch:{ all -> 0x049d }
            X.RyW r2 = new X.RyW     // Catch:{ all -> 0x049d }
            r21 = r2
            r22 = r35
            r23 = r8
            r24 = r7
            r25 = r0
            r26 = r3
            r27 = r11
            r28 = r19
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x049d }
            r6.A0M = r2     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r8 = r0.A0B     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = r0.A08     // Catch:{ all -> 0x049d }
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x049d }
            X.SOn r11 = r2.A02     // Catch:{ all -> 0x049d }
            if (r11 == 0) goto L_0x0350
            r0 = 3
            r11.A09 = r0     // Catch:{ all -> 0x049d }
            r2 = 1
            boolean r0 = r11.A0M     // Catch:{ all -> 0x049d }
            if (r0 != r10) goto L_0x0350
        L_0x020a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x049d }
            java.util.ArrayList r0 = X.SKZ.A00(r1, r3, r8, r0)     // Catch:{ all -> 0x049d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x049d }
        L_0x0216:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x049d }
            X.SJA r0 = (X.SJA) r0     // Catch:{ all -> 0x049d }
            boolean r0 = r0.A01     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0216
        L_0x0226:
            X.RyW r14 = r6.A0M     // Catch:{ all -> 0x049d }
            X.Tfw r1 = r14.A06     // Catch:{ all -> 0x049d }
            if (r1 == 0) goto L_0x033c
            android.content.Context r0 = r14.A01     // Catch:{ all -> 0x049d }
            r18 = r0
            if (r0 == 0) goto L_0x033c
            X.SOn r13 = r14.A02     // Catch:{ all -> 0x049d }
            if (r13 == 0) goto L_0x033c
            X.Q4k r12 = r14.A05     // Catch:{ all -> 0x049d }
            if (r12 == 0) goto L_0x033c
            X.Rdm r0 = r14.A04     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x033c
            X.RyI r11 = r14.A03     // Catch:{ all -> 0x049d }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.videolite.transcoder.resizer.VideoTranscoderJBMR2.VideoEncoderJBMR2"
            X.Tie r8 = r1.ALy()     // Catch:{ all -> 0x049d }
            X.0qQ.A0C(r8, r0)     // Catch:{ all -> 0x049d }
            X.Q1G r8 = (X.Q1G) r8     // Catch:{ all -> 0x049d }
            if (r11 == 0) goto L_0x02c1
            boolean r0 = r11 instanceof X.Qe6     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x026d
            r0 = r11
            X.Qe6 r0 = (X.Qe6) r0     // Catch:{ all -> 0x049d }
            android.view.Surface r2 = r0.A00     // Catch:{ all -> 0x049d }
        L_0x0257:
            r21 = r8
            r22 = r18
            r23 = r2
            r24 = r13
            r25 = r11
            r26 = r12
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x049d }
        L_0x0266:
            java.util.Map r0 = r14.A07     // Catch:{ all -> 0x049d }
            X.C51967G9n.A1O(r8, r0, r5)     // Catch:{ all -> 0x049d }
            goto L_0x033c
        L_0x026d:
            boolean r0 = r11 instanceof X.Qe7     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x02ae
            r3 = r11
            X.Qe7 r3 = (X.Qe7) r3     // Catch:{ all -> 0x049d }
            r3.A01 = r12     // Catch:{ all -> 0x049d }
            boolean r2 = r3.A05     // Catch:{ all -> 0x049d }
            if (r2 == 0) goto L_0x0284
            android.view.TextureView r1 = r3.A00     // Catch:{ all -> 0x049d }
            X.Sac r0 = new X.Sac     // Catch:{ all -> 0x049d }
            r0.<init>(r3)     // Catch:{ all -> 0x049d }
            r1.setSurfaceTextureListener(r0)     // Catch:{ all -> 0x049d }
        L_0x0284:
            android.view.TextureView r0 = r3.A00     // Catch:{ all -> 0x049d }
            r21 = r0
            android.graphics.SurfaceTexture r0 = r21.getSurfaceTexture()     // Catch:{ all -> 0x049d }
            if (r2 == 0) goto L_0x02a4
            if (r0 != 0) goto L_0x02a8
            java.lang.Object r2 = r3.A03     // Catch:{ all -> 0x049d }
            if (r2 == 0) goto L_0x036a
            monitor-enter(r2)     // Catch:{ all -> 0x049d }
        L_0x0295:
            boolean r0 = r3.A06     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x029f
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0353 }
            goto L_0x0295
        L_0x029f:
            monitor-exit(r2)     // Catch:{ all -> 0x049d }
            android.graphics.SurfaceTexture r0 = r21.getSurfaceTexture()     // Catch:{ all -> 0x049d }
        L_0x02a4:
            if (r0 != 0) goto L_0x02a8
            goto L_0x0370
        L_0x02a8:
            android.view.Surface r2 = new android.view.Surface     // Catch:{ all -> 0x049d }
            r2.<init>(r0)     // Catch:{ all -> 0x049d }
            goto L_0x0257
        L_0x02ae:
            r1 = r11
            X.Qe8 r1 = (X.Qe8) r1     // Catch:{ all -> 0x049d }
            r1.A01 = r12     // Catch:{ all -> 0x049d }
            android.view.Surface r2 = r1.A00     // Catch:{ all -> 0x049d }
            if (r2 != 0) goto L_0x0257
            android.graphics.SurfaceTexture r0 = r1.A01     // Catch:{ all -> 0x049d }
            android.view.Surface r2 = new android.view.Surface     // Catch:{ all -> 0x049d }
            r2.<init>(r0)     // Catch:{ all -> 0x049d }
            r1.A00 = r2     // Catch:{ all -> 0x049d }
            goto L_0x0257
        L_0x02c1:
            X.Q7u r2 = new X.Q7u     // Catch:{ all -> 0x049d }
            r2.<init>()     // Catch:{ all -> 0x049d }
            com.facebook.videolite.transcoder.resizer.DummySurface.A02 = r12     // Catch:{ all -> 0x049d }
            r2.start()     // Catch:{ all -> 0x049d }
            android.os.Looper r0 = r2.getLooper()     // Catch:{ all -> 0x049d }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x049d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x049d }
            r2.A00 = r1     // Catch:{ all -> 0x049d }
            X.TLA r0 = new X.TLA     // Catch:{ all -> 0x049d }
            r0.<init>(r1)     // Catch:{ all -> 0x049d }
            r2.A02 = r0     // Catch:{ all -> 0x049d }
            monitor-enter(r2)     // Catch:{ all -> 0x049d }
            android.os.Handler r0 = r2.A00     // Catch:{ all -> 0x0378 }
            X.Pxf.A15(r0, r10)     // Catch:{ all -> 0x0378 }
            r1 = 0
        L_0x02e4:
            com.facebook.videolite.transcoder.resizer.DummySurface r0 = r2.A01     // Catch:{ all -> 0x0378 }
            if (r0 != 0) goto L_0x0309
            java.lang.RuntimeException r0 = r2.A04     // Catch:{ all -> 0x0378 }
            if (r0 != 0) goto L_0x0309
            java.lang.Error r0 = r2.A03     // Catch:{ all -> 0x0378 }
            if (r0 != 0) goto L_0x0309
            r2.wait()     // Catch:{ InterruptedException -> 0x02f4 }
            goto L_0x02e4
        L_0x02f4:
            r1 = move-exception
            X.Q4k r0 = com.facebook.videolite.transcoder.resizer.DummySurface.A02     // Catch:{ all -> 0x0378 }
            if (r0 == 0) goto L_0x0307
            boolean r0 = r0.A09()     // Catch:{ all -> 0x0378 }
            if (r0 == 0) goto L_0x0307
            X.Pxe.A1F()     // Catch:{ all -> 0x0378 }
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r1)     // Catch:{ all -> 0x0378 }
            throw r0     // Catch:{ all -> 0x0378 }
        L_0x0307:
            r1 = 1
            goto L_0x02e4
        L_0x0309:
            monitor-exit(r2)     // Catch:{ all -> 0x0378 }
            if (r1 == 0) goto L_0x030f
            X.Pxe.A1F()     // Catch:{ all -> 0x049d }
        L_0x030f:
            java.lang.RuntimeException r0 = r2.A04     // Catch:{ all -> 0x049d }
            if (r0 != 0) goto L_0x049c
            java.lang.Error r0 = r2.A03     // Catch:{ all -> 0x049d }
            if (r0 != 0) goto L_0x049c
            com.facebook.videolite.transcoder.resizer.DummySurface r0 = r2.A01     // Catch:{ all -> 0x049d }
            X.0Sd.A00(r0)     // Catch:{ all -> 0x049d }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x049d }
            r14.A00 = r0     // Catch:{ all -> 0x049d }
            r21 = r8
            r22 = r18
            r23 = r0
            r24 = r13
            r25 = r19
            r26 = r12
            r21.A00(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x049d }
            goto L_0x0266
        L_0x0332:
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            X.Q4k r0 = r0.A0B     // Catch:{ all -> 0x049d }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x01ca
        L_0x033c:
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x049d }
            java.lang.String r0 = "initializeMediaAccuracyCapturer"
            A0A(r6, r0, r1)     // Catch:{ all -> 0x049d }
            X.RzN r1 = r6.A0P     // Catch:{ all -> 0x049d }
            X.SOn r0 = r1.A06     // Catch:{ all -> 0x049d }
            X.S2m r8 = r1.A09     // Catch:{ all -> 0x049d }
            if (r8 == 0) goto L_0x03c0
            X.RyW r2 = r6.A0M     // Catch:{ all -> 0x049d }
            if (r2 == 0) goto L_0x03c0
            goto L_0x037c
        L_0x0350:
            r2 = 0
            goto L_0x020a
        L_0x0353:
            r1 = move-exception
            X.Q4k r0 = r3.A01     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0361
            boolean r0 = r0.A09()     // Catch:{ all -> 0x0366 }
            if (r0 != r10) goto L_0x0361
            X.Pxe.A1F()     // Catch:{ all -> 0x0366 }
        L_0x0361:
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r1)     // Catch:{ all -> 0x0366 }
            throw r0     // Catch:{ all -> 0x0366 }
        L_0x0366:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x049d }
            goto L_0x049c
        L_0x036a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x049d }
            goto L_0x049c
        L_0x0370:
            java.lang.String r0 = "TextureView's SurfaceTexture is null. The TextureView either hasn't been attached to a window yet or it hasn't been initialized."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x049d }
            goto L_0x049c
        L_0x0378:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0378 }
            goto L_0x049c
        L_0x037c:
            if (r0 == 0) goto L_0x03c0
            X.Tj9 r1 = r6.A0f     // Catch:{ all -> 0x03b4 }
            java.lang.String r0 = r6.A0t     // Catch:{ all -> 0x03b4 }
            X.S5Y r3 = new X.S5Y     // Catch:{ all -> 0x03b4 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x03b4 }
            java.util.Map r0 = r2.A07     // Catch:{ all -> 0x03b4 }
            java.lang.Object r2 = X.C51968G9o.A10(r0, r5)     // Catch:{ all -> 0x03b4 }
            if (r2 == 0) goto L_0x03af
            X.Q1G r2 = (X.Q1G) r2     // Catch:{ all -> 0x03b4 }
            java.lang.String r1 = r6.A0u     // Catch:{ all -> 0x03b4 }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x03b4 }
            X.Q4k r0 = r0.A0B     // Catch:{ all -> 0x03b4 }
            r21 = r8
            r22 = r32
            r23 = r3
            r24 = r0
            r25 = r2
            r26 = r1
            X.SOP r0 = r21.A00(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x03b4 }
            r6.A0K = r0     // Catch:{ all -> 0x03b4 }
            X.SJb r0 = r0.A04     // Catch:{ all -> 0x03b4 }
            r0.A01()     // Catch:{ all -> 0x03b4 }
            goto L_0x03c0
        L_0x03af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x03b4 }
            throw r0     // Catch:{ all -> 0x03b4 }
        L_0x03b4:
            r2 = move-exception
            java.lang.String r1 = "FBMediaCompositionPlayer"
            java.lang.String r0 = "Failed to create media accuracy capturer"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x049d }
            r0 = r19
            r6.A0K = r0     // Catch:{ all -> 0x049d }
        L_0x03c0:
            if (r7 != 0) goto L_0x03c9
            X.Sr4 r0 = new X.Sr4     // Catch:{ all -> 0x049d }
            r0.<init>()     // Catch:{ all -> 0x049d }
            r6.A0F = r0     // Catch:{ all -> 0x049d }
        L_0x03c9:
            X.SJL r10 = new X.SJL     // Catch:{ all -> 0x049d }
            r10.<init>()     // Catch:{ all -> 0x049d }
            r6.A0H = r10     // Catch:{ all -> 0x049d }
            X.TdQ r7 = r6.A0q     // Catch:{ all -> 0x049d }
            X.Tfu r3 = r6.A0F     // Catch:{ all -> 0x049d }
            r2 = r34
            r1 = r33
            r0 = r35
            X.S30 r12 = X.S30.A00(r0, r9, r2, r1, r7)     // Catch:{ all -> 0x049d }
            r12.A01 = r3     // Catch:{ all -> 0x049d }
            X.TdG r11 = r6.A0i     // Catch:{ all -> 0x049d }
            X.RzN r8 = r6.A0P     // Catch:{ all -> 0x049d }
            X.RyW r7 = r6.A0M     // Catch:{ all -> 0x049d }
            r7.getClass()     // Catch:{ all -> 0x049d }
            X.Tfw r3 = r6.A0Q     // Catch:{ all -> 0x049d }
            X.SNJ r2 = r6.A0h     // Catch:{ all -> 0x049d }
            X.SOP r1 = r6.A0K     // Catch:{ all -> 0x049d }
            X.SU1 r0 = new X.SU1     // Catch:{ all -> 0x049d }
            r23 = r2
            r24 = r11
            r25 = r9
            r26 = r10
            r27 = r1
            r28 = r7
            r29 = r8
            r30 = r3
            r31 = r12
            r21 = r0
            r22 = r32
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x049d }
            r6.A0y = r0     // Catch:{ all -> 0x049d }
            boolean r0 = r6.A0Y     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0414
            X.SU1 r0 = r6.A0y     // Catch:{ all -> 0x049d }
            r0.A0B = r5     // Catch:{ all -> 0x049d }
        L_0x0414:
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x049d }
            java.lang.String r0 = "initialize mMultipleTrackCoordinatorRealtime.preparePlayer"
            A0A(r6, r0, r1)     // Catch:{ all -> 0x049d }
            X.SU1 r3 = r6.A0y     // Catch:{ all -> 0x049d }
            X.S0X r1 = r6.A0n     // Catch:{ all -> 0x049d }
            X.RzN r0 = r6.A0P     // Catch:{ all -> 0x049d }
            java.util.HashSet r0 = r0.A0G     // Catch:{ all -> 0x049d }
            r3.A0C(r1, r0)     // Catch:{ all -> 0x049d }
            X.9s6 r0 = X.C390949s6.READY     // Catch:{ all -> 0x049d }
            r6.A0E(r0)     // Catch:{ all -> 0x049d }
            if (r37 == 0) goto L_0x042e
            goto L_0x0437
        L_0x042e:
            X.4aF r1 = r6.A0J     // Catch:{ all -> 0x049d }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x049d }
            long r0 = r1.A03(r0)     // Catch:{ all -> 0x049d }
            goto L_0x0443
        L_0x0437:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x049d }
            long r0 = r37.longValue()     // Catch:{ all -> 0x049d }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x049d }
            long r0 = r5.convert(r0, r3)     // Catch:{ all -> 0x049d }
        L_0x0443:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x049d }
            X.Rp8 r0 = new X.Rp8     // Catch:{ all -> 0x049d }
            r0.<init>(r1)     // Catch:{ all -> 0x049d }
            r6.A09(r0)     // Catch:{ all -> 0x049d }
            long r7 = X.C51966G9m.A07(r16)
            java.util.HashMap r0 = A00(r6)
            r4.putAll(r0)
            java.lang.String r0 = java.lang.Long.toString(r7)
            r4.put(r15, r0)
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            r0 = r20
            A0A(r6, r0, r1)
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08
            r0.getClass()
            A07(r0, r4)
            java.lang.String r0 = "media_player_prepare"
            X.SNJ.A00(r2, r0, r4)
            return
        L_0x047f:
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x049d }
            java.lang.String r5 = "media composition duration is invalid: %d, normalized media composition is %s"
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x049d }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x049d }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x049d }
            java.lang.String r0 = java.lang.String.format(r7, r5, r0)     // Catch:{ all -> 0x049d }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x049d }
            goto L_0x049c
        L_0x0499:
            r2.recycle()     // Catch:{ all -> 0x049d }
        L_0x049c:
            throw r0     // Catch:{ all -> 0x049d }
        L_0x049d:
            r3 = move-exception
            long r1 = X.C51966G9m.A07(r16)
            java.util.HashMap r0 = A00(r6)
            r4.putAll(r0)
            java.lang.String r0 = java.lang.Long.toString(r1)
            r4.put(r15, r0)
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            r0 = r20
            A0A(r6, r0, r1)
            X.SNJ r1 = r6.A0h
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08
            r0.getClass()
            A07(r0, r4)
            java.lang.String r0 = "media_player_prepare"
            X.SNJ.A00(r1, r0, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.A0F(java.lang.Long):void");
    }

    public static boolean A0H(C12356Ss2 ss2) {
        if (ss2.A0z == C390949s6.READY || ss2.A0z == C390949s6.PLAYING || ss2.A0z == C390949s6.PAUSED || ss2.A0z == C390949s6.SEEKING || ss2.A0z == C390949s6.PLAYBACK_COMPLETE) {
            return true;
        }
        return false;
    }

    public final void A0I(C8897REp rEp, Object obj, long j) {
        if (this.A0z == C390949s6.RELEASED) {
            String name = rEp.name();
            A0A(this, 002.A0g("sendMessage player already released. ", name, " failed."), Pxe.A1b());
            A0C(this, Pxg.A0e("Player already released. ", name, " failed."));
            return;
        }
        Handler handler = this.A0d;
        handler.sendMessageDelayed(handler.obtainMessage(rEp.ordinal(), obj), j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AuJ() {
        /*
            r5 = this;
            X.SU1 r4 = r5.A0y
            X.RzN r0 = r5.A0P
            X.Q4k r1 = r0.A0B
            boolean r0 = r1 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x002b
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x002b
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A17
        L_0x0018:
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x002d
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x002d
        L_0x0022:
            long r0 = r4.A0Z
            long r0 = r0 * r2
            return r0
        L_0x0026:
            if (r4 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x002b:
            r0 = 0
            goto L_0x0018
        L_0x002d:
            long r0 = r5.A07
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.AuJ():long");
    }

    public final void E3m() {
        E3v(0);
    }

    public final void EKz(long j) {
        C10248Rp8 rp8 = new C10248Rp8(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(j)));
        A0A(this, "seekTo: %s", rp8);
        C8897REp rEp = C8897REp.SEEK;
        A08(rEp);
        A0I(rEp, rp8, 0);
    }

    public final void Efy(C13596TdO tdO) {
        this.A0d.post(new C12967TGa(this, tdO));
    }

    public final void Eg0(C10292Rpq rpq, long j) {
        this.A06 = j;
        this.A0d.post(new C13033TIp(this, rpq, j));
    }

    public final void Eg3(C13597TdP tdP) {
        this.A0d.post(new C12968TGb(this, tdP));
    }

    public final void Eka(boolean z) {
        SNJ snj = this.A0h;
        HashMap A002 = A00(this);
        A002.put("loop", String.valueOf(z));
        SNJ.A00(snj, "media_player_set_loop", A002);
        this.A10 = z;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean FKF(X.C266714aE r26, com.facebook.videolite.transcoder.base.composition.MediaEffect r27, java.lang.String r28) {
        /*
            r25 = this;
            java.lang.String r13 = "global_volume"
            r24 = r27
            java.lang.String r0 = r24.toString()
            r3 = 0
            r23 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r13}
            java.lang.String r0 = "updateEffect: newEffect=%s, effectId=%s"
            r15 = r25
            A0A(r15, r0, r1)
            X.RzN r0 = r15.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A08
            if (r2 == 0) goto L_0x0128
            java.util.HashMap r1 = r2.A01
            r14 = r26
            boolean r0 = r1.containsKey(r14)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.get(r14)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.getClass()
            boolean r0 = r0.containsKey(r13)
            if (r0 == 0) goto L_0x004c
        L_0x0036:
            X.SO6 r12 = r15.A0r
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MICROSECONDS
            r8 = 0
            r0 = r22
            long r0 = r0.toMicros(r8)
            long r3 = java.lang.Math.max(r0, r8)
            java.lang.Object r21 = X.SO6.A00(r12)
            monitor-enter(r21)
            goto L_0x007e
        L_0x004c:
            java.util.HashMap r2 = r2.A02
            boolean r0 = r2.containsKey(r14)
            if (r0 == 0) goto L_0x0128
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r2.get(r14)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Collection r0 = r0.values()
            r1.addAll(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r1.next()
            X.4aM r0 = (X.C266794aM) r0
            java.util.HashMap r0 = r0.A03
            boolean r0 = r0.containsKey(r13)
            if (r0 == 0) goto L_0x0069
            goto L_0x0036
        L_0x007e:
            X.RPc r0 = r12.A00     // Catch:{ all -> 0x0125 }
            X.R24 r0 = (X.R24) r0     // Catch:{ all -> 0x0125 }
            X.4MS r1 = r0.A00     // Catch:{ all -> 0x0125 }
            r0 = r22
            long r10 = r1.A00(r0)     // Catch:{ all -> 0x0125 }
            X.R25 r12 = (X.R25) r12     // Catch:{ all -> 0x0125 }
            long r6 = r12.A03     // Catch:{ all -> 0x0125 }
            long r1 = r6 - r3
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0123
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            long r0 = r10 - r6
            double r4 = (double) r0     // Catch:{ all -> 0x0125 }
            double r0 = r12.A01     // Catch:{ all -> 0x0125 }
            double r4 = r4 / r0
            double r2 = r12.A00     // Catch:{ all -> 0x0125 }
            double r0 = r12.A02     // Catch:{ all -> 0x0125 }
            double r0 = r0 + r4
            double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0125 }
            r12.A02 = r0     // Catch:{ all -> 0x0125 }
            r12.A03 = r10     // Catch:{ all -> 0x0125 }
            r6 = r10
        L_0x00ac:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r12.A02     // Catch:{ all -> 0x0125 }
            double r19 = java.lang.Math.min(r4, r2)     // Catch:{ all -> 0x0125 }
            double r4 = r4 - r19
            double r0 = r12.A01     // Catch:{ all -> 0x0125 }
            double r4 = r4 * r0
            long r0 = (long) r4
            long r4 = r6 + r0
            long r0 = r0 ^ r6
            r18 = 1
            int r16 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r16)
            long r16 = r6 ^ r4
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cd
            r18 = 0
        L_0x00cd:
            r1 = r1 | r18
            if (r1 != 0) goto L_0x00de
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 63
            long r4 = r4 >>> r0
            r0 = 1
            long r4 = r4 ^ r0
            long r4 = r4 + r16
        L_0x00de:
            r12.A03 = r4     // Catch:{ all -> 0x0125 }
            double r2 = r2 - r19
            r12.A02 = r2     // Catch:{ all -> 0x0125 }
            long r6 = r6 - r10
            long r0 = java.lang.Math.max(r6, r8)     // Catch:{ all -> 0x0125 }
            monitor-exit(r21)     // Catch:{ all -> 0x0125 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0114
            r6 = 0
            r2 = r22
            long r0 = r2.toNanos(r0)     // Catch:{ all -> 0x0108 }
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0108 }
            long r4 = r4 + r0
        L_0x00fa:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0100 }
            r2.sleep(r0)     // Catch:{ InterruptedException -> 0x0100 }
            goto L_0x010f
        L_0x0100:
            r6 = 1
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0108 }
            long r0 = r4 - r2
            goto L_0x00fa
        L_0x0108:
            r0 = move-exception
            if (r6 == 0) goto L_0x010e
            X.Pxe.A1F()
        L_0x010e:
            throw r0
        L_0x010f:
            if (r6 == 0) goto L_0x0114
            X.Pxe.A1F()
        L_0x0114:
            X.REp r1 = X.C8897REp.UPDATE_MEDIA_EFFECT
            r15.A08(r1)
            r0 = r24
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r0, r13}
            r15.A0I(r1, r0, r8)
            return r23
        L_0x0123:
            monitor-exit(r21)     // Catch:{ all -> 0x0125 }
            return r23
        L_0x0125:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x0125 }
            throw r0
        L_0x0128:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.FKF(X.4aE, com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.String):boolean");
    }

    public final void FKk(MediaComposition mediaComposition) {
        long AuJ;
        C7334Q4k q4k = this.A0P.A0B;
        if (q4k instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) q4k;
            if (1 - qeC.A00 == 0 && ((SJN) qeC.A01).A19) {
                AuJ = -1;
                FKl(mediaComposition, AuJ);
            }
        }
        AuJ = AuJ();
        FKl(mediaComposition, AuJ);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0463, code lost:
        r8 = new X.C10248Rp8(java.lang.Long.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x046c, code lost:
        A09(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x046f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0310 A[Catch:{ all -> 0x0358, all -> 0x0626 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0336 A[Catch:{ all -> 0x0358, all -> 0x0626 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04ff A[Catch:{ all -> 0x04a8, all -> 0x060d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r3 = r23
            int r0 = r3.what
            r17 = r0
            r2 = 1
            r4 = 0
            r16 = 0
            r5 = r22
            if (r0 < 0) goto L_0x05f6
            X.REp[] r0 = X.C8897REp.values()     // Catch:{ all -> 0x0626 }
            int r1 = r0.length     // Catch:{ all -> 0x0626 }
            r0 = r17
            if (r0 >= r1) goto L_0x05f6
            X.REp[] r0 = X.C8897REp.values()     // Catch:{ all -> 0x0626 }
            r16 = r0[r17]     // Catch:{ all -> 0x0626 }
            java.lang.Object r8 = r3.obj     // Catch:{ all -> 0x0626 }
            int r0 = r16.ordinal()     // Catch:{ all -> 0x0626 }
            switch(r0) {
                case 1: goto L_0x0444;
                case 2: goto L_0x0470;
                case 3: goto L_0x0433;
                case 4: goto L_0x0448;
                case 5: goto L_0x0440;
                case 6: goto L_0x043c;
                case 7: goto L_0x042d;
                case 8: goto L_0x0377;
                case 9: goto L_0x0292;
                case 10: goto L_0x0261;
                case 11: goto L_0x01ec;
                case 12: goto L_0x0031;
                case 13: goto L_0x0153;
                case 14: goto L_0x01c4;
                default: goto L_0x0026;
            }     // Catch:{ all -> 0x0626 }
        L_0x0026:
            r0 = 4144(0x1030, float:5.807E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0626 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0626 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0626 }
        L_0x0031:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "processUpdateTrim"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x0626 }
            r3 = r8[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0626 }
            r13 = r8[r2]     // Catch:{ all -> 0x0626 }
            X.4aF r13 = (X.C266724aF) r13     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doUpdateTrim "
            java.lang.String r1 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            A0A(r5, r1, r0)     // Catch:{ all -> 0x0626 }
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            r5.A0G(r4)     // Catch:{ all -> 0x0626 }
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A08     // Catch:{ all -> 0x0626 }
            X.4aE r1 = X.C266714aE.VIDEO     // Catch:{ all -> 0x0626 }
            int r12 = r0.A02(r1, r3)     // Catch:{ all -> 0x0626 }
            if (r12 < 0) goto L_0x014b
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            X.SU1 r2 = r5.A0y     // Catch:{ all -> 0x0626 }
            java.util.HashMap r0 = r2.A0O     // Catch:{ all -> 0x0626 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0626 }
            java.lang.Object r11 = r0.get(r6)     // Catch:{ all -> 0x0626 }
            if (r11 != 0) goto L_0x0096
            java.util.Map r0 = r2.A0R     // Catch:{ all -> 0x0626 }
            java.lang.Object r3 = X.Pxe.A0r(r1, r0)     // Catch:{ all -> 0x0626 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0626 }
            r2 = 0
        L_0x0086:
            int r0 = r3.size()     // Catch:{ all -> 0x0626 }
            if (r2 >= r0) goto L_0x0096
            int r0 = r3.keyAt(r2)     // Catch:{ all -> 0x0626 }
            if (r0 != r12) goto L_0x0147
            java.lang.Object r11 = r3.valueAt(r2)     // Catch:{ all -> 0x0626 }
        L_0x0096:
            r11.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r11 = (X.C266724aF) r11     // Catch:{ all -> 0x0626 }
            X.SU1 r10 = r5.A0y     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r2 = "updateTrim"
            java.lang.String r20 = "MultipleTrackCoordinatorRealtime"
            r0 = r20
            X.Q1V.A00(r0, r2, r3)     // Catch:{ all -> 0x0626 }
            java.util.HashMap r0 = r10.A0O     // Catch:{ all -> 0x0626 }
            r0.put(r6, r13)     // Catch:{ all -> 0x0626 }
            X.SEm r0 = r10.A0K     // Catch:{ all -> 0x0626 }
            X.C11186SEm.A00(r0)     // Catch:{ all -> 0x0626 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0626 }
            java.lang.Object r0 = X.Pxe.A0r(r1, r0)     // Catch:{ all -> 0x0626 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x0626 }
            java.lang.Object r14 = r0.get(r12)     // Catch:{ all -> 0x0626 }
            java.util.concurrent.Future r14 = (java.util.concurrent.Future) r14     // Catch:{ all -> 0x0626 }
            java.util.Map r0 = r10.A0R     // Catch:{ all -> 0x0626 }
            r21 = r0
            java.lang.Object r9 = X.Pxe.A0r(r1, r0)     // Catch:{ all -> 0x0626 }
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch:{ all -> 0x0626 }
            r6 = 0
            r18 = 0
            r8 = 0
        L_0x00d0:
            int r0 = r9.size()     // Catch:{ all -> 0x0626 }
            if (r8 >= r0) goto L_0x059c
            int r0 = r9.keyAt(r8)     // Catch:{ all -> 0x0626 }
            if (r0 != r12) goto L_0x011e
            java.lang.Object r0 = r9.valueAt(r8)     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r0 = (X.C266724aF) r0     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0626 }
            long r0 = X.Pxg.A0E(r0, r15)     // Catch:{ all -> 0x0626 }
            long r18 = X.Pxg.A0E(r13, r15)     // Catch:{ all -> 0x0626 }
            long r18 = r18 - r0
            java.lang.Object r0 = r9.valueAt(r8)     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r0 = (X.C266724aF) r0     // Catch:{ all -> 0x0626 }
            long r2 = r0.A03(r15)     // Catch:{ all -> 0x0626 }
            long r0 = r0.A02(r15)     // Catch:{ all -> 0x0626 }
            long r0 = r0 + r18
            X.4aF r0 = X.Pxe.A0V(r15, r2, r0)     // Catch:{ all -> 0x0626 }
            r9.put(r12, r0)     // Catch:{ all -> 0x0626 }
        L_0x010b:
            java.lang.Object r1 = r9.valueAt(r8)     // Catch:{ all -> 0x0626 }
            r1.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r1 = (X.C266724aF) r1     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0626 }
            long r0 = X.Pxg.A0E(r1, r0)     // Catch:{ all -> 0x0626 }
            long r6 = r6 + r0
            int r8 = r8 + 1
            goto L_0x00d0
        L_0x011e:
            int r0 = r9.keyAt(r8)     // Catch:{ all -> 0x0626 }
            if (r0 < r12) goto L_0x010b
            java.lang.Object r0 = r9.valueAt(r8)     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r0 = (X.C266724aF) r0     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0626 }
            long r2 = r0.A03(r15)     // Catch:{ all -> 0x0626 }
            long r2 = r2 + r18
            long r0 = r0.A02(r15)     // Catch:{ all -> 0x0626 }
            long r0 = r0 + r18
            X.4aF r1 = X.Pxe.A0V(r15, r2, r0)     // Catch:{ all -> 0x0626 }
            int r0 = r9.keyAt(r8)     // Catch:{ all -> 0x0626 }
            r9.put(r0, r1)     // Catch:{ all -> 0x0626 }
            goto L_0x010b
        L_0x0147:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x014b:
            java.lang.String r0 = "Can Not Find Track: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r3)     // Catch:{ all -> 0x0626 }
            goto L_0x0030
        L_0x0153:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "processUpdateMediaEffect"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x0626 }
            r7 = r8[r4]     // Catch:{ all -> 0x0626 }
            X.4aE r7 = (X.C266714aE) r7     // Catch:{ all -> 0x0626 }
            r3 = r8[r2]     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaEffect r3 = (com.facebook.videolite.transcoder.base.composition.MediaEffect) r3     // Catch:{ all -> 0x0626 }
            r0 = 2
            r6 = r8[r0]     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doUpdateEffect"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A08     // Catch:{ all -> 0x0626 }
            if (r2 == 0) goto L_0x063c
            java.util.HashMap r0 = r2.A01     // Catch:{ all -> 0x0626 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0626 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0626 }
            if (r1 == 0) goto L_0x0197
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaEffect r0 = (com.facebook.videolite.transcoder.base.composition.MediaEffect) r0     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
        L_0x0193:
            r0.FJP(r3)     // Catch:{ all -> 0x0626 }
            goto L_0x01c3
        L_0x0197:
            java.util.HashMap r0 = r2.A02     // Catch:{ all -> 0x0626 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0626 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ all -> 0x0626 }
        L_0x01a5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            java.lang.Object r0 = X.C51971G9r.A0p(r2)     // Catch:{ all -> 0x0626 }
            X.4aM r0 = (X.C266794aM) r0     // Catch:{ all -> 0x0626 }
            java.util.HashMap r1 = r0.A03     // Catch:{ all -> 0x0626 }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaEffect r0 = (com.facebook.videolite.transcoder.base.composition.MediaEffect) r0     // Catch:{ all -> 0x0626 }
            goto L_0x0193
        L_0x01c3:
            return r4
        L_0x01c4:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x0626 }
            X.RyW r0 = r5.A0M     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            r2 = r8[r4]     // Catch:{ all -> 0x0626 }
            android.view.Surface r2 = (android.view.Surface) r2     // Catch:{ all -> 0x0626 }
            X.0qQ.A0B(r2, r4)     // Catch:{ all -> 0x0626 }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x0626 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x0626 }
        L_0x01da:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            X.Q1G r0 = X.Pxh.A0Q(r1)     // Catch:{ all -> 0x0626 }
            X.Tid r0 = r0.A00     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x01da
            r0.FKI(r2)     // Catch:{ all -> 0x0626 }
            goto L_0x01da
        L_0x01ec:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x0626 }
            r2 = r8[r2]     // Catch:{ all -> 0x0626 }
            r6 = 0
            if (r2 == 0) goto L_0x025f
            X.7tA r2 = (X.C345237tA) r2     // Catch:{ all -> 0x0626 }
        L_0x01f8:
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x0200
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0626 }
        L_0x0200:
            r3 = r8[r4]     // Catch:{ all -> 0x0626 }
            X.7sc r3 = (X.C344907sc) r3     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doSendRendererEvent"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            X.RyW r0 = r5.A0M     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            r5.A0S = r6     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doSendRendererEvent: rendererEvent=%s"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            X.SNJ r7 = r5.A0h     // Catch:{ all -> 0x0626 }
            X.7sZ r0 = r3.CAG()     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = r0.name()     // Catch:{ all -> 0x0626 }
            java.util.HashMap r1 = A00(r5)     // Catch:{ all -> 0x0626 }
            X.0qQ.A0B(r6, r4)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "render_event"
            r1.put(r0, r6)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "media_player_send_render_event"
            X.SNJ.A00(r7, r0, r1)     // Catch:{ all -> 0x0626 }
            X.RyW r0 = r5.A0M     // Catch:{ all -> 0x0626 }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x0626 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x0626 }
        L_0x023f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            java.lang.Object r0 = X.C51971G9r.A0p(r1)     // Catch:{ all -> 0x0626 }
            X.Q1G r0 = (X.Q1G) r0     // Catch:{ all -> 0x0626 }
            if (r2 == 0) goto L_0x0256
            X.Tid r0 = r0.A00     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            r0.EMY(r3, r2)     // Catch:{ all -> 0x0626 }
            goto L_0x023f
        L_0x0256:
            X.Tid r0 = r0.A00     // Catch:{ all -> 0x0626 }
            r0.getClass()     // Catch:{ all -> 0x0626 }
            r0.EMX(r3)     // Catch:{ all -> 0x0626 }
            goto L_0x023f
        L_0x025f:
            r2 = r6
            goto L_0x01f8
        L_0x0261:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r8 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r8     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doUpdateAudioEffects: "
            java.lang.String r1 = X.Pxf.A0l(r0, r8)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            A0A(r5, r1, r0)     // Catch:{ all -> 0x0626 }
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            X.RzN r0 = X.SQv.A00(r8, r0)     // Catch:{ all -> 0x0626 }
            r5.A0P = r0     // Catch:{ all -> 0x0626 }
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x0626 }
            X.STM r2 = r0.A05     // Catch:{ all -> 0x0626 }
            if (r2 == 0) goto L_0x063c
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doUpdateAudioEffects audioTranscodePipeline.updateAudioEffects"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            android.os.Handler r1 = r2.A0D     // Catch:{ all -> 0x0626 }
            r0 = 8
            X.Pxe.A1N(r1, r8, r0)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0292:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x0626 }
            r10 = r8[r4]     // Catch:{ all -> 0x0626 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r10     // Catch:{ all -> 0x0626 }
            r0 = r8[r2]     // Catch:{ all -> 0x0626 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0626 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x0626 }
            java.lang.String r11 = "logUpdateMediaComposition: seekToPositionNs=%s, mediaCompositionUpdateTimeMs=%s"
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            X.Q4k r3 = r0.A0B     // Catch:{ all -> 0x0626 }
            boolean r0 = r3 instanceof X.C7964QeC     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x02c7
            X.QeC r3 = (X.C7964QeC) r3     // Catch:{ all -> 0x0626 }
            int r0 = r3.A00     // Catch:{ all -> 0x0626 }
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x02c7
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0626 }
            X.SJN r0 = (X.SJN) r0     // Catch:{ all -> 0x0626 }
            boolean r0 = r0.A19     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x02c7
            r6 = -1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x02c7
            long r1 = r5.AuJ()     // Catch:{ all -> 0x0626 }
        L_0x02c7:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0626 }
            X.9s6 r6 = r5.A0z     // Catch:{ all -> 0x0358 }
            java.lang.String r3 = "doUpdateMediaComposition: mediaComposition=%s, oldState=%s"
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0358 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}     // Catch:{ all -> 0x0358 }
            A0A(r5, r3, r0)     // Catch:{ all -> 0x0358 }
            r5.A0G(r4)     // Catch:{ all -> 0x0358 }
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0358 }
            X.RzN r0 = X.SQv.A00(r10, r0)     // Catch:{ all -> 0x0358 }
            r5.A0P = r0     // Catch:{ all -> 0x0358 }
            r7 = 0
            r5.A0J = r7     // Catch:{ all -> 0x0358 }
            X.Q4k r3 = r0.A0B     // Catch:{ all -> 0x0358 }
            boolean r0 = r3 instanceof X.C7964QeC     // Catch:{ all -> 0x0358 }
            if (r0 == 0) goto L_0x0314
            X.QeC r3 = (X.C7964QeC) r3     // Catch:{ all -> 0x0358 }
            int r0 = r3.A00     // Catch:{ all -> 0x0358 }
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0314
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0358 }
            X.SJN r0 = (X.SJN) r0     // Catch:{ all -> 0x0358 }
            boolean r0 = r0.A1B     // Catch:{ all -> 0x0358 }
            if (r0 == 0) goto L_0x0314
            java.lang.String r3 = "doUpdateMediaComposition shouldSeekOnceWhenUpdateMediaComposition doPrepare"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0358 }
            A0A(r5, r3, r0)     // Catch:{ all -> 0x0358 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0358 }
            r5.A0F(r0)     // Catch:{ all -> 0x0358 }
        L_0x030c:
            X.9s6 r0 = X.C390949s6.PLAYING     // Catch:{ all -> 0x0358 }
            if (r6 != r0) goto L_0x0336
            r5.A05()     // Catch:{ all -> 0x0358 }
            goto L_0x033b
        L_0x0314:
            java.lang.String r3 = "doUpdateMediaComposition doPrepare doSeek"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0358 }
            A0A(r5, r3, r0)     // Catch:{ all -> 0x0358 }
            r5.A0F(r7)     // Catch:{ all -> 0x0358 }
            X.4aF r3 = r5.A0J     // Catch:{ all -> 0x0358 }
            r3.getClass()     // Catch:{ all -> 0x0358 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0358 }
            long r7 = r3.A03(r0)     // Catch:{ all -> 0x0358 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0358 }
            X.Rp8 r0 = new X.Rp8     // Catch:{ all -> 0x0358 }
            r0.<init>(r3)     // Catch:{ all -> 0x0358 }
            r5.A09(r0)     // Catch:{ all -> 0x0358 }
            goto L_0x030c
        L_0x0336:
            X.9s6 r0 = X.C390949s6.PAUSED     // Catch:{ all -> 0x0358 }
            r5.A0E(r0)     // Catch:{ all -> 0x0358 }
        L_0x033b:
            long r6 = X.C51966G9m.A07(r12)     // Catch:{ all -> 0x0626 }
            int r8 = (int) r6     // Catch:{ all -> 0x0626 }
            X.S2O r0 = r5.A0p     // Catch:{ all -> 0x0626 }
            r0.A00(r8)     // Catch:{ all -> 0x0626 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0626 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch:{ all -> 0x0626 }
            A0A(r5, r11, r0)     // Catch:{ all -> 0x0626 }
            r5.A06(r10, r8, r1)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0358:
            r9 = move-exception
            long r7 = X.C51966G9m.A07(r12)     // Catch:{ all -> 0x0626 }
            int r6 = (int) r7     // Catch:{ all -> 0x0626 }
            X.S2O r0 = r5.A0p     // Catch:{ all -> 0x0626 }
            r0.A00(r6)     // Catch:{ all -> 0x0626 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0626 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch:{ all -> 0x0626 }
            A0A(r5, r11, r0)     // Catch:{ all -> 0x0626 }
            r5.A06(r10, r6, r1)     // Catch:{ all -> 0x0626 }
            goto L_0x0625
        L_0x0377:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            X.4aF r8 = (X.C266724aF) r8     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doSetPlayTimeRange: timeRange=%s"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0626 }
            long r1 = r8.A03(r9)     // Catch:{ all -> 0x0626 }
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x03bc
            long r6 = r8.A03(r9)     // Catch:{ all -> 0x0626 }
        L_0x0395:
            long r1 = r8.A02(r9)     // Catch:{ all -> 0x0626 }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x03b9
            long r2 = r8.A02(r9)     // Catch:{ all -> 0x0626 }
            long r0 = r5.A05     // Catch:{ all -> 0x0626 }
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0626 }
        L_0x03a7:
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0626 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r2}     // Catch:{ all -> 0x0626 }
            java.lang.String r10 = "doSetPlayTimeRange: adjustedStartTime=%d, adjustedEndTime=%d"
            A0A(r5, r10, r11)     // Catch:{ all -> 0x0626 }
            goto L_0x03bf
        L_0x03b9:
            long r0 = r5.A05     // Catch:{ all -> 0x0626 }
            goto L_0x03a7
        L_0x03bc:
            r6 = 0
            goto L_0x0395
        L_0x03bf:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x03e5
            X.4aF r6 = X.Pxe.A0V(r9, r6, r0)     // Catch:{ all -> 0x0626 }
            r5.A0J = r6     // Catch:{ all -> 0x0626 }
            long r1 = r5.AuJ()     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0626 }
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x0626 }
            X.Q4k r0 = r0.A0B     // Catch:{ all -> 0x0626 }
            boolean r0 = X.C7334Q4k.A00(r6, r0, r3, r1)     // Catch:{ all -> 0x0626 }
            if (r0 != 0) goto L_0x063c
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doSetPlayTimeRange: doSeek"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            long r0 = r6.A03(r9)     // Catch:{ all -> 0x0626 }
            goto L_0x0463
        L_0x03e5:
            long r0 = r5.A05     // Catch:{ all -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            long r0 = r8.A03(r9)     // Catch:{ all -> 0x0626 }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            long r0 = r8.A02(r9)     // Catch:{ all -> 0x0626 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r7, r6, r0}     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doSetPlayTimeRange: play time range start time bigger than end time. adjustedStartTime: %d, adjustedEndTime: %d, totalDuration: %d, timeRange.start: %d, timeRange.end: %d"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0626 }
            long r0 = r5.A05     // Catch:{ all -> 0x0626 }
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            long r0 = r8.A03(r9)     // Catch:{ all -> 0x0626 }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            long r0 = r8.A02(r9)     // Catch:{ all -> 0x0626 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r10, r6, r0}     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "play time range start time bigger than end time. adjustedStartTime: %d, adjustedEndTime: %d, totalDuration: %d, timeRange.start: %d, timeRange.end: %d"
            java.lang.String r0 = java.lang.String.format(r7, r0, r1)     // Catch:{ all -> 0x0626 }
            java.lang.IllegalArgumentException r9 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x0626 }
            goto L_0x0625
        L_0x042d:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            X.Rp8 r8 = (X.C10248Rp8) r8     // Catch:{ all -> 0x0626 }
            goto L_0x046c
        L_0x0433:
            r8.getClass()     // Catch:{ all -> 0x0626 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0626 }
            r5.A0F(r8)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x043c:
            r5.A03()     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0440:
            r5.A0G(r2)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0444:
            r5.A05()     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0448:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doStop"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            boolean r0 = A0H(r5)     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            r5.A0G(r4)     // Catch:{ all -> 0x0626 }
            X.4aF r1 = r5.A0J     // Catch:{ all -> 0x0626 }
            r1.getClass()     // Catch:{ all -> 0x0626 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0626 }
            long r0 = r1.A03(r0)     // Catch:{ all -> 0x0626 }
        L_0x0463:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0626 }
            X.Rp8 r8 = new X.Rp8     // Catch:{ all -> 0x0626 }
            r8.<init>(r0)     // Catch:{ all -> 0x0626 }
        L_0x046c:
            r5.A09(r8)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x0470:
            java.lang.String r7 = "doRelease complete"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "doRelease"
            A0A(r5, r0, r1)     // Catch:{ all -> 0x0626 }
            android.os.HandlerThread r8 = r5.A0e     // Catch:{ all -> 0x060d }
            boolean r0 = r8.isInterrupted()     // Catch:{ all -> 0x060d }
            if (r0 == 0) goto L_0x048e
            X.RzN r0 = r5.A0P     // Catch:{ all -> 0x060d }
            X.Q4k r0 = r0.A0B     // Catch:{ all -> 0x060d }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x060d }
            if (r0 == 0) goto L_0x048e
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x060d }
        L_0x048e:
            r5.A0G(r4)     // Catch:{ all -> 0x060d }
            X.SOP r6 = r5.A0K     // Catch:{ all -> 0x060d }
            r12 = 0
            if (r6 == 0) goto L_0x050c
            X.8MA r3 = r6.A00     // Catch:{ all -> 0x04a8 }
            if (r3 == 0) goto L_0x04a6
            java.util.concurrent.ExecutorService r1 = r6.A09     // Catch:{ all -> 0x04a8 }
            X.TGZ r0 = new X.TGZ     // Catch:{ all -> 0x04a8 }
            r0.<init>(r3, r6)     // Catch:{ all -> 0x04a8 }
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x04ad
        L_0x04a6:
            r0 = 0
            goto L_0x04ad
        L_0x04a8:
            r0 = move-exception
            X.0eQ r0 = X.JTO.A1B(r0)     // Catch:{ all -> 0x060d }
        L_0x04ad:
            java.lang.Throwable r14 = X.0eR.A00(r0)     // Catch:{ all -> 0x060d }
            if (r14 == 0) goto L_0x04be
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x060d }
            X.S5Y r9 = r6.A03     // Catch:{ all -> 0x060d }
            java.lang.Integer r10 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x060d }
            r13 = r12
            r15 = r12
            r9.A02(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x060d }
        L_0x04be:
            X.SOP r0 = r5.A0K     // Catch:{ all -> 0x060d }
            X.Ryt r3 = r0.A05     // Catch:{ all -> 0x060d }
            if (r3 == 0) goto L_0x04d4
            int r1 = r3.A00     // Catch:{ all -> 0x060d }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 < r0) goto L_0x04d4
            java.util.concurrent.ExecutorService r1 = r3.A09     // Catch:{ all -> 0x060d }
            X.TCx r0 = new X.TCx     // Catch:{ all -> 0x060d }
            r0.<init>(r3)     // Catch:{ all -> 0x060d }
            r1.submit(r0)     // Catch:{ all -> 0x060d }
        L_0x04d4:
            X.SOP r3 = r5.A0K     // Catch:{ all -> 0x060d }
            r6 = 0
        L_0x04d7:
            X.Ryt r1 = r3.A05     // Catch:{ all -> 0x060d }
            if (r1 == 0) goto L_0x04ec
            boolean r0 = r1.A04     // Catch:{ all -> 0x060d }
            if (r0 != 0) goto L_0x04ea
            r0 = 5
            if (r6 >= r0) goto L_0x04ea
            int r6 = r6 + 1
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x060d }
            goto L_0x04d7
        L_0x04ea:
            r1.A05 = r4     // Catch:{ all -> 0x060d }
        L_0x04ec:
            java.util.concurrent.ExecutorService r0 = r3.A09     // Catch:{ all -> 0x04f4 }
            r0.shutdown()     // Catch:{ all -> 0x04f4 }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x04f4 }
            goto L_0x04f9
        L_0x04f4:
            r0 = move-exception
            X.0eQ r0 = X.JTO.A1B(r0)     // Catch:{ all -> 0x060d }
        L_0x04f9:
            java.lang.Throwable r14 = X.0eR.A00(r0)     // Catch:{ all -> 0x060d }
            if (r14 == 0) goto L_0x050a
            X.S5Y r0 = r3.A03     // Catch:{ all -> 0x060d }
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x060d }
            r9 = r0
            r11 = r12
            r13 = r12
            r15 = r12
            r9.A02(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x060d }
        L_0x050a:
            r5.A0K = r12     // Catch:{ all -> 0x060d }
        L_0x050c:
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x060d }
            java.util.HashMap r0 = A00(r5)     // Catch:{ all -> 0x060d }
            r6.putAll(r0)     // Catch:{ all -> 0x060d }
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x060d }
            long r0 = r5.A09     // Catch:{ all -> 0x060d }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "overall_playback_time_ms"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
            long r0 = r5.A0B     // Catch:{ all -> 0x060d }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "overall_stuck_time_ms"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
            long r0 = r5.A0A     // Catch:{ all -> 0x060d }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "overall_rendered_frames"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
            java.util.List r0 = r5.A0U     // Catch:{ all -> 0x060d }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "stuck_times_list"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
            long r0 = r5.A0D     // Catch:{ all -> 0x060d }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "stuck_frames_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x060d }
            if (r0 == 0) goto L_0x0568
            X.SU1 r0 = r5.A0y     // Catch:{ all -> 0x060d }
            long r0 = r0.A03     // Catch:{ all -> 0x060d }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "frame_redraw_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x060d }
        L_0x0568:
            r6.putAll(r3)     // Catch:{ all -> 0x060d }
            X.SNJ r1 = r5.A0h     // Catch:{ all -> 0x060d }
            java.lang.String r0 = "media_player_release"
            X.SNJ.A00(r1, r0, r6)     // Catch:{ all -> 0x060d }
            X.9s6 r0 = X.C390949s6.RELEASED     // Catch:{ all -> 0x060d }
            r5.A0E(r0)     // Catch:{ all -> 0x060d }
            r5.A0O = r12     // Catch:{ all -> 0x060d }
            r5.A0R = r12     // Catch:{ all -> 0x060d }
            r5.A0E = r12     // Catch:{ all -> 0x060d }
            r8.quit()     // Catch:{ all -> 0x060d }
            r5.A02()     // Catch:{ all -> 0x060d }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            A0A(r5, r7, r0)     // Catch:{ all -> 0x0626 }
            r5.A0Z = r2     // Catch:{ all -> 0x0626 }
            android.os.ConditionVariable r0 = r5.A0b     // Catch:{ all -> 0x0626 }
            r0.open()     // Catch:{ all -> 0x0626 }
            boolean r0 = r5.A0x     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            java.util.concurrent.ScheduledFuture r0 = r5.A0W     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x063c
            r0.cancel(r2)     // Catch:{ all -> 0x0626 }
            return r4
        L_0x059c:
            r10.A0a = r6     // Catch:{ all -> 0x0626 }
            X.Q14 r0 = r10.A08     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x05a5
            r0.A00()     // Catch:{ all -> 0x0626 }
        L_0x05a5:
            X.RyW r0 = r10.A0L     // Catch:{ all -> 0x0626 }
            X.SsA r3 = new X.SsA     // Catch:{ all -> 0x0626 }
            r3.<init>(r0)     // Catch:{ all -> 0x0626 }
            X.Ss8 r2 = new X.Ss8     // Catch:{ all -> 0x0626 }
            r2.<init>(r0)     // Catch:{ all -> 0x0626 }
            X.RzN r0 = r10.A0M     // Catch:{ all -> 0x0626 }
            X.Q4k r1 = r0.A0B     // Catch:{ all -> 0x0626 }
            r0 = r21
            X.QeA r0 = X.SPy.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x0626 }
            r10.A08 = r0     // Catch:{ all -> 0x0626 }
            X.Q14 r0 = r10.A07     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x05c4
            r0.A00()     // Catch:{ all -> 0x0626 }
        L_0x05c4:
            r0 = 0
            r10.A07 = r0     // Catch:{ all -> 0x0626 }
            if (r14 == 0) goto L_0x05dd
            java.lang.Object r3 = r14.get()     // Catch:{ all -> 0x0626 }
            X.Tia r3 = (X.C13855Tia) r3     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r2 = new java.lang.Object[]{r13}     // Catch:{ all -> 0x0626 }
            java.lang.String r1 = "demuxDecodeWrapper.updateTrim timeRange=%s"
            r0 = r20
            X.Q1V.A00(r0, r1, r2)     // Catch:{ all -> 0x0626 }
            r3.FM5(r13)     // Catch:{ all -> 0x0626 }
        L_0x05dd:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0626 }
            long r6 = X.Pxg.A0E(r13, r8)     // Catch:{ all -> 0x0626 }
            long r0 = X.Pxg.A0E(r11, r8)     // Catch:{ all -> 0x0626 }
            long r6 = r6 - r0
            long r2 = r5.A05     // Catch:{ all -> 0x0626 }
            long r2 = r2 + r6
            r5.A05 = r2     // Catch:{ all -> 0x0626 }
            r0 = 0
            X.4aF r0 = X.Pxe.A0V(r8, r0, r2)     // Catch:{ all -> 0x0626 }
            r5.A0J = r0     // Catch:{ all -> 0x0626 }
            return r4
        L_0x05f6:
            java.lang.String r1 = "handleMessage: unknown message=%s"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0626 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0626 }
            A0A(r5, r1, r0)     // Catch:{ all -> 0x0626 }
            java.lang.String r1 = "unknown message "
            r0 = r17
            java.lang.IllegalStateException r9 = X.DbW.A0b(r1, r0)     // Catch:{ all -> 0x0626 }
            goto L_0x0625
        L_0x060d:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            A0A(r5, r7, r0)     // Catch:{ all -> 0x0626 }
            r5.A0Z = r2     // Catch:{ all -> 0x0626 }
            android.os.ConditionVariable r0 = r5.A0b     // Catch:{ all -> 0x0626 }
            r0.open()     // Catch:{ all -> 0x0626 }
            boolean r0 = r5.A0x     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x0625
            java.util.concurrent.ScheduledFuture r0 = r5.A0W     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x0625
            r0.cancel(r2)     // Catch:{ all -> 0x0626 }
        L_0x0625:
            throw r9     // Catch:{ all -> 0x0626 }
        L_0x0626:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "handleMessage: onPlaybackException=%s"
            A0A(r5, r0, r1)
            if (r16 == 0) goto L_0x063d
            java.lang.String r0 = r16.name()
        L_0x0636:
            X.C9603Rdh.A00(r0, r2)
            A0D(r5, r2)
        L_0x063c:
            return r4
        L_0x063d:
            java.lang.String r0 = java.lang.String.valueOf(r17)
            goto L_0x0636
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.handleMessage(android.os.Message):boolean");
    }

    public final boolean isPlaying() {
        return AnonymousClass7TF.A1W(this.A0z, C390949s6.PLAYING);
    }

    public static HashMap A00(C12356Ss2 ss2) {
        int i;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("current_position_ms", Long.toString(TimeUnit.NANOSECONDS.toMillis(ss2.AuJ())));
        A1E.put(TraceFieldType.CurrentState, ss2.A0z.toString());
        S2O s2o = ss2.A0p;
        int i2 = s2o.A00;
        if (i2 == -1) {
            i = 0;
        } else {
            i = (int) (s2o.A02 / ((long) ((((i2 + 10) - s2o.A01) % 10) + 1)));
        }
        A1E.put("avg_media_composition_update_time_ms", Integer.toString(i));
        A1E.put("overall_audio_volume", Float.toString(ss2.A00));
        A1E.put("number_of_video_segments", Integer.toString(ss2.A04));
        A1E.put("number_of_audio_segments", Integer.toString(ss2.A01));
        A1E.put("number_of_mixed_segments", Integer.toString(ss2.A03));
        String str = ss2.A0S;
        if (str != null) {
            A1E.put("applied_effect_id", str);
        }
        A1E.put("number_of_frames_dropped", Integer.toString(ss2.A02));
        return A1E;
    }

    public static HashMap A01(C12356Ss2 ss2, Object obj, long j) {
        HashMap A002 = A00(ss2);
        A002.put(obj, Long.toString(System.currentTimeMillis() - j));
        return A002;
    }

    private void A04() {
        A0A(this, "onPlaybackStopped", Pxe.A1b());
        long j = this.A0C;
        if (j > 0) {
            this.A09 += C51966G9m.A07(j);
            this.A0C = 0;
        }
        this.A08 = 0;
    }

    public static void A07(MediaComposition mediaComposition, AbstractMap abstractMap) {
        abstractMap.put("media_composition", mediaComposition.toString());
        abstractMap.put("media_composition_hash", mediaComposition.A05());
    }

    private void A09(C10248Rp8 rp8) {
        String str;
        C390949s6 r0;
        C10833Ryt ryt;
        boolean z = false;
        A0A(this, "doSeek: seekInfo=%s", rp8);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0H(this)) {
                C390949s6 r02 = this.A0z;
                C390949s6 r7 = C390949s6.PLAYING;
                if (r02 == r7) {
                    z = true;
                }
                A0E(C390949s6.SEEKING);
                long j = 0;
                Long l = rp8.A00;
                if (l != null) {
                    j = l.longValue();
                }
                this.A0y.getClass();
                this.A0J.getClass();
                C266724aF r2 = this.A0J;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long min = Math.min(Math.max(j, r2.A03(timeUnit)), this.A0J.A02(timeUnit));
                this.A0y.A0B(min);
                if (z) {
                    r0 = r7;
                } else {
                    r0 = C390949s6.PAUSED;
                }
                A0E(r0);
                if (this.A0z != r7) {
                    SU1 su1 = this.A0y;
                    C266724aF r1 = this.A0J;
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    su1.A07(r1.A02(timeUnit), true);
                    this.A0y.A09();
                    SOP sop = this.A0K;
                    if (!(sop == null || (ryt = sop.A05) == null)) {
                        C11283SJb sJb = ryt.A07;
                        sJb.A05.add(AnonymousClass000.A00(1925));
                        if (ryt.A00 >= 300) {
                            ryt.A05 = false;
                        } else {
                            ryt.A01 = 0;
                            ryt.A00 = 0;
                            ryt.A02 = min;
                        }
                    }
                }
            }
        } finally {
            str = "media_player_seek";
            SNJ.A00(this.A0h, str, A01(this, "media_player_seek_time_ms", currentTimeMillis));
        }
    }

    public static void A0B(C12356Ss2 ss2, Throwable th) {
        String stackTraceString;
        HashMap A002 = A00(ss2);
        String str = ss2.A0T;
        if (str != null) {
            A002.put("debug_message", str);
        }
        A0A(ss2, "logPlayerError: Exception=%s, map=%s", th, A002);
        SNJ snj = ss2.A0h;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
            0qQ.A0A(stackTraceString);
        }
        A002.put("error_trace", stackTraceString);
        SNJ.A00(snj, "media_player_error", A002);
    }

    public static void A0C(C12356Ss2 ss2, Throwable th) {
        String stackTraceString;
        HashMap A002 = A00(ss2);
        String str = ss2.A0T;
        if (str != null) {
            A002.put("debug_message", str);
        }
        A0A(ss2, "logPlayerWarning: Exception=%s, map=%s", th, A002);
        SNJ snj = ss2.A0h;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
            0qQ.A0A(stackTraceString);
        }
        A002.put("error_trace", stackTraceString);
        SNJ.A00(snj, "media_player_warning", A002);
    }

    public static void A0D(C12356Ss2 ss2, Throwable th) {
        String str;
        Handler handler;
        A0A(ss2, "onPlaybackException: e=%s", th);
        C390949s6 r3 = ss2.A0z;
        ss2.A04();
        if (!(th instanceof CancellationException)) {
            if (ss2.A0P.A0B.A09()) {
                Throwable th2 = th;
                while (true) {
                    Throwable cause = th2.getCause();
                    if (cause != null && th2 != cause) {
                        th2 = cause;
                    }
                }
                if (th2 instanceof InterruptedException) {
                    return;
                }
            }
            A0B(ss2, th);
            ss2.A0E(C390949s6.ERROR);
            C13596TdO tdO = ss2.A0N;
            if (!(tdO == null || (handler = ss2.A0E) == null)) {
                handler.post(new C13055TJl(ss2, tdO, r3, th));
            }
            C13587TdF tdF = ss2.A0G;
            if (tdF != null) {
                if (th.getMessage() != null) {
                    str = th.getMessage();
                } else {
                    str = "";
                }
                tdF.Chx(new Exception(th), "FBMediaCompositionPlayer_onPlaybackException", str);
            }
        }
    }

    private void A0E(C390949s6 r5) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("setPlaybackState state: ");
        A1A.append(r5);
        A1A.append(" mState: ");
        A0A(this, AnonymousClass7TF.A0i(this.A0z, A1A), Pxe.A1b());
        if (this.A0z != r5) {
            C390949s6 r3 = this.A0z;
            this.A0z = r5;
            C13597TdP tdP = this.A0O;
            if (tdP != null) {
                Handler handler = this.A0E;
                handler.getClass();
                handler.post(new C13056TJm(this, tdP, r3, r5));
            }
        }
    }

    private void A0G(boolean z) {
        C390949s6 r1;
        A0A(this, "doPause: isUserTriggeredPause=%s", C51968G9o.A1b(z));
        if (A0H(this) && this.A0z != (r1 = C390949s6.PAUSED)) {
            SU1 su1 = this.A0y;
            su1.getClass();
            su1.A09();
            A04();
            A0E(r1);
            if (z) {
                SNJ.A00(this.A0h, "media_player_pause", A00(this));
            }
        }
    }

    public final void E2p() {
        A0A(this, "play", Pxe.A1b());
        A0I(C8897REp.PLAY, (Object) null, 0);
    }

    public final void E3v(long j) {
        A0A(this, "prepareAndSeek: seekToPositionNs=%s", Pxf.A1W(j));
        if (this.A0P.A08 != null) {
            A0I(C8897REp.PREPARE, new Long(j), 0);
        }
    }

    public final void Efv(C266724aF r5) {
        A0A(this, "setPlayTimeRange: timeRange=%s", r5);
        SNJ snj = this.A0h;
        HashMap A002 = A00(this);
        A002.put("time_range", r5.toString());
        SNJ.A00(snj, "media_player_set_time_range", A002);
        C8897REp rEp = C8897REp.SET_RANGE;
        A08(rEp);
        A08(C8897REp.SEEK);
        A0I(rEp, r5, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKl(com.facebook.videolite.transcoder.base.composition.MediaComposition r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.toString()
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "updateMediaComposition: mediaComposition=%s, seekToPositionNs=%s"
            A0A(r6, r0, r1)
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "updateAudioVolume: mediaComposition=%s"
            A0A(r6, r0, r1)
            X.4aE r3 = X.C266714aE.AUDIO
            java.util.HashMap r0 = r7.A00
            java.util.List r1 = X.Pxe.A1B(r3, r0)
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00fe
            int r0 = r1.size()
            if (r0 <= r4) goto L_0x00ec
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x003a:
            r6.A00 = r0
        L_0x003c:
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "updateSegmentNumbers: mediaComposition=%s"
            A0A(r6, r0, r1)
            X.4aE r0 = X.C266714aE.VIDEO
            java.util.HashMap r0 = r7.A07(r0)
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.size()
        L_0x0056:
            r6.A04 = r0
            java.util.HashMap r0 = r7.A07(r3)
            if (r0 == 0) goto L_0x00e6
            int r0 = r0.size()
        L_0x0062:
            r6.A01 = r0
            X.4aE r0 = X.C266714aE.MIXED
            java.util.HashMap r0 = r7.A07(r0)
            if (r0 == 0) goto L_0x00e4
            int r0 = r0.size()
        L_0x0070:
            r6.A03 = r0
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A08
            r4 = 0
            if (r1 == 0) goto L_0x0090
            boolean r0 = X.C9602Rdg.A00(r1, r7)
            if (r0 == 0) goto L_0x0090
            java.util.HashMap r1 = r1.A06(r3)
            java.util.HashMap r0 = r7.A06(r3)
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0090
            r4 = 1
        L_0x0090:
            java.lang.Object[] r1 = X.C51968G9o.A1b(r4)
            java.lang.String r0 = "updateMediaComposition: mediaCompositionDeltaUtil.isOnlyAudioEffectChanged=%s"
            A0A(r6, r0, r1)
            X.RzN r0 = r6.A0P
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A08
            if (r1 == 0) goto L_0x00b7
            boolean r0 = X.C9602Rdg.A00(r1, r7)
            if (r0 == 0) goto L_0x00b7
            java.util.HashMap r1 = r1.A06(r3)
            java.util.HashMap r0 = r7.A06(r3)
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b7
            r5 = 1
        L_0x00b7:
            r3 = 0
            if (r5 == 0) goto L_0x0101
            java.lang.String r1 = r7.toString()
            java.util.HashMap r0 = A00(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "logUpdateAudioEffects: mediaComposition=%s, getCurPlaybackStatusParams=%s"
            A0A(r6, r0, r1)
            X.SNJ r2 = r6.A0h
            java.util.HashMap r1 = A00(r6)
            A07(r7, r1)
            java.lang.String r0 = "media_player_update_audio_effects"
            X.SNJ.A00(r2, r0, r1)
            X.REp r0 = X.C8897REp.UPDATE_AUDIO_EFFECTS
            r6.A08(r0)
            r6.A0I(r0, r7, r3)
            return
        L_0x00e4:
            r0 = 0
            goto L_0x0070
        L_0x00e6:
            r0 = 0
            goto L_0x0062
        L_0x00e9:
            r0 = 0
            goto L_0x0056
        L_0x00ec:
            java.lang.Object r0 = r1.get(r5)
            X.SIO r0 = (X.SIO) r0
            com.facebook.videolite.transcoder.base.composition.MediaEffect r1 = r0.A01
            boolean r0 = r1 instanceof X.C12333Srf
            if (r0 == 0) goto L_0x003c
            X.Srf r1 = (X.C12333Srf) r1
            float r0 = r1.A00
            goto L_0x003a
        L_0x00fe:
            r0 = 0
            goto L_0x003a
        L_0x0101:
            X.REp r1 = X.C8897REp.UPDATE_MEDIA_COMPOSITION
            r6.A08(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r2}
            r6.A0I(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.FKl(com.facebook.videolite.transcoder.base.composition.MediaComposition, long):void");
    }

    public final void FM6(C266724aF r5, String str) {
        A0A(this, "updateTrim", Pxe.A1b());
        A0I(C8897REp.UPDATE_TRIM, new Object[]{str, r5}, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e0, code lost:
        if (((X.SJN) r7.A01).A0y != false) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12356Ss2(android.content.Context r9, X.C13886Tj9 r10, X.C13724Tfu r11, X.C7255Q1d r12, X.C13587TdF r13, X.C13588TdG r14, X.C13725Tfv r15, X.C13590TdI r16, X.C13780Tgv r17, X.C13804ThT r18, X.C10796RyI r19, X.C10850RzA r20, X.C13598TdQ r21, java.io.File r22, java.lang.String r23, java.lang.String r24, java.util.Map r25) {
        /*
            r8 = this;
            r4 = r24
            X.SOn r3 = new X.SOn
            r3.<init>()
            r2 = r20
            int r0 = r2.A05
            r3.A0C = r0
            int r0 = r2.A04
            r3.A0A = r0
            int r0 = r2.A01
            r3.A01 = r0
            int r0 = r2.A03
            r3.A0B = r0
            boolean r0 = r2.A0D
            r3.A0O = r0
            int r0 = r2.A02
            r3.A03 = r0
            X.SJA r0 = r2.A08
            r3.A0G = r0
            X.SQv r1 = new X.SQv
            r1.<init>()
            r1.A06 = r3
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r2.A09
            r1.A08 = r0
            X.Ti9 r0 = r2.A07
            r1.A07 = r0
            X.Q4k r0 = r2.A0C
            r1.A0B = r0
            boolean r0 = r2.A0E
            r1.A0N = r0
            java.util.HashSet r0 = r2.A00
            r1.A0G = r0
            X.S2m r0 = r2.A0A
            r1.A09 = r0
            X.Rdm r0 = r2.A0B
            if (r0 == 0) goto L_0x004a
            r1.A0A = r0
        L_0x004a:
            X.RzN r3 = new X.RzN
            r3.<init>(r1)
            r8.<init>()
            r1 = 0
            r8.A0K = r1
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            r8.A0b = r0
            r8.A0V = r1
            r8.A0W = r1
            r8.A0I = r1
            r2 = 0
            r8.A0Y = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.A00 = r0
            r8.A02 = r2
            X.S2O r0 = new X.S2O
            r0.<init>()
            r8.A0p = r0
            r0 = 0
            r8.A07 = r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            X.R24 r5 = new X.R24
            r5.<init>()
            X.SO6 r0 = X.SO6.create(r0, r5)
            r8.A0r = r0
            X.9s6 r0 = X.C390949s6.UNPREPARED
            r8.A0z = r0
            r0 = 3
            X.SVv r1 = new X.SVv
            r1.<init>(r8, r0)
            r8.A0c = r1
            r0 = 2
            X.TLI r5 = new X.TLI
            r5.<init>(r8, r0)
            r8.A0v = r5
            X.S0X r0 = new X.S0X
            r0.<init>(r8)
            r8.A0n = r0
            r8.A0a = r9
            r6 = r23
            r8.A0t = r6
            r0 = r19
            r8.A0o = r0
            r8.A0j = r15
            r0 = r21
            r8.A0q = r0
            r8.A0P = r3
            r0 = r16
            r8.A0k = r0
            r0 = r17
            r8.A0l = r0
            r8.A0g = r12
            r0 = r22
            r8.A0s = r0
            r0 = r18
            r8.A0m = r0
            r8.A0i = r14
            r8.A0f = r10
            r8.A0F = r11
            r8.A0G = r13
            if (r24 == 0) goto L_0x0166
            X.Q4k r7 = r3.A0B
            boolean r0 = r7 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0166
            X.QeC r7 = (X.C7964QeC) r7
            int r0 = r7.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0166
            java.lang.Object r0 = r7.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0y
            if (r0 == 0) goto L_0x0166
        L_0x00e2:
            r8.A0u = r4
            X.SNJ r0 = new X.SNJ
            r7 = r25
            r0.<init>(r10, r6, r4, r7)
            r8.A0h = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r8.A0U = r0
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0161
            android.os.Looper r4 = android.os.Looper.myLooper()
        L_0x00fd:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4, r1)
            r8.A0E = r0
            r1 = -16
            java.lang.String r0 = "mediacomposition-player"
            android.os.HandlerThread r0 = X.Pxf.A0J(r0, r1)
            r8.A0e = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            r1.getClass()
            X.Q1X r0 = new X.Q1X
            r0.<init>(r8, r1, r5)
            r8.A0d = r0
            X.Q4k r4 = r3.A0B
            boolean r3 = r4 instanceof X.C7964QeC
            if (r3 == 0) goto L_0x015f
            r1 = r4
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x015f
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0V
        L_0x0135:
            r8.A0w = r0
            if (r3 == 0) goto L_0x015d
            X.QeC r4 = (X.C7964QeC) r4
            int r0 = r4.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x015d
            java.lang.Object r0 = r4.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0t
        L_0x0147:
            r8.A0x = r0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "logPlayerCreated"
            A0A(r8, r0, r1)
            X.SNJ r2 = r8.A0h
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "media_player_created"
            X.SNJ.A00(r2, r0, r1)
            return
        L_0x015d:
            r0 = 0
            goto L_0x0147
        L_0x015f:
            r0 = 0
            goto L_0x0135
        L_0x0161:
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            goto L_0x00fd
        L_0x0166:
            java.lang.String r4 = X.AnonymousClass7TF.A0b()
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12356Ss2.<init>(android.content.Context, X.Tj9, X.Tfu, X.Q1d, X.TdF, X.TdG, X.Tfv, X.TdI, X.Tgv, X.ThT, X.RyI, X.RzA, X.TdQ, java.io.File, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
