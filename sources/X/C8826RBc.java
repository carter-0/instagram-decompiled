package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import com.instagram.common.session.UserSession;

/* renamed from: X.RBc  reason: case insensitive filesystem */
public final class C8826RBc extends AnonymousClass9RF implements SurfaceTexture.OnFrameAvailableListener {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = 0;
    public long A04 = -1;
    public long A05;
    public AnonymousClass9R7 A06;
    public C13825Thv A07;
    public C13830Ti1 A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public UserSession A0E;
    public boolean A0F;
    public Context A0G;
    public final C62780vc A0H = new C62780vc(0nY.A00(), 1);
    public final C13830Ti1 A0I;
    public final Object A0J = Pxe.A0p();
    public volatile long A0K = -1;
    public volatile MediaCodec A0L;
    public volatile Q0V A0M;
    public volatile boolean A0N = false;
    public volatile boolean A0O = false;
    public volatile boolean A0P = false;

    public final void A03() {
        this.A09 = false;
        A00();
        this.A00.A02(AnonymousClass05K.A01);
        C13830Ti1 ti1 = this.A08;
        AnonymousClass9R7 r1 = this.A06;
        ti1.CN7(r1, -1);
        A0A(ti1.Byl());
        ti1.E3K(r1);
    }

    private void A00() {
        synchronized (this.A0J) {
            if (!this.A0O) {
                this.A0O = A0B();
                if (!this.A0O) {
                    this.A07.DYn();
                }
            }
        }
    }

    private void A01() {
        synchronized (this.A0J) {
            if (this.A0O) {
                A08();
                this.A0O = false;
            }
        }
    }

    public final void A06() {
        if (!this.A0C) {
            this.A07.FLP();
        }
        if (this.A0C) {
            this.A07.EK8();
            this.A00.A00();
        }
    }

    public final boolean A07() {
        if (this.A0C) {
            return true;
        }
        if (!this.A0F) {
            return false;
        }
        this.A0C = true;
        C13830Ti1 ti1 = this.A0I;
        AnonymousClass9RG r2 = this.A00;
        ti1.Enx(r2);
        r2.A08.offer(new M52(r2));
        return false;
    }

    public final void A08() {
        if (this.A0L != null) {
            0fX.A06(this.A0L, 651483208);
            0fX.A03(this.A0L, 1825722047);
            this.A0L = null;
            this.A0A = false;
        }
        if (this.A0M != null) {
            this.A0M.release();
            this.A0M = null;
        }
    }

    public final void A09() {
        0KC.A0D("ScrubberRenderControllerBase", "Saving Poster Frame");
        this.A00.A02(AnonymousClass05K.A00);
        this.A0F = true;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B() {
        /*
            r13 = this;
            java.lang.String r1 = "Exception when configuring mDecoder "
            java.lang.String r0 = "scrubber_render_controller"
            r11 = 0
            X.Q0V r0 = X.Q0V.A00(r0)
            r13.A0M = r0
            X.Ti1 r2 = r13.A08
            X.Q0V r0 = r13.A0M
            boolean r0 = r2.ETu(r0)
            if (r0 == 0) goto L_0x00ea
            r5 = 0
        L_0x0017:
            X.Q0V r0 = r13.A0M
            android.media.MediaExtractor r0 = r0.A00
            int r0 = r0.getTrackCount()
            r8 = 0
            r6 = 1
            java.lang.String r4 = "ScrubberRenderControllerBase"
            if (r5 >= r0) goto L_0x006c
            X.Q0V r0 = r13.A0M
            android.media.MediaExtractor r0 = r0.A00
            android.media.MediaFormat r9 = r0.getTrackFormat(r5)
            java.lang.String r0 = "max-input-size"
            r9.setInteger(r0, r11)
            java.lang.String r0 = "mime"
            java.lang.String r2 = r9.getString(r0)
            r2.getClass()
            java.lang.String r0 = "video/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 444647748(0x1a80c944, float:5.326472E-23)
            android.media.MediaCodec r0 = X.0fX.A01(r2, r0)     // Catch:{ IOException -> 0x005f }
            r13.A0L = r0     // Catch:{ IOException -> 0x005f }
            X.Q0V r0 = r13.A0M     // Catch:{ IOException -> 0x005f }
            r0.ELD(r5)     // Catch:{ IOException -> 0x005f }
            java.lang.String r0 = "durationUs"
            long r2 = r9.getLong(r0)     // Catch:{ IOException -> 0x005f }
            r13.A05 = r2     // Catch:{ IOException -> 0x005f }
            r13.A0A = r11     // Catch:{ IOException -> 0x005f }
            goto L_0x006d
        L_0x005f:
            r3 = move-exception
            java.lang.Object[] r2 = X.Pxf.A1Z(r3)
            java.lang.String r0 = "Failed to create decoder: %s"
            X.0KC.A0L(r4, r0, r3, r2)
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x006c:
            r9 = r8
        L_0x006d:
            android.media.MediaCodec r0 = r13.A0L
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "Could not acquire decoder."
            X.0KC.A0D(r4, r0)
            X.Q0V r0 = r13.A0M
            r0.release()
            r13.A0M = r8
            return r11
        L_0x007e:
            android.media.MediaCodec r7 = r13.A0L     // Catch:{ Exception -> 0x0092 }
            X.9R7 r2 = r13.A06     // Catch:{ Exception -> 0x0092 }
            android.graphics.SurfaceTexture r0 = r2.A00()     // Catch:{ Exception -> 0x0092 }
            android.view.Surface r10 = new android.view.Surface     // Catch:{ Exception -> 0x0092 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0092 }
            r12 = -1882605341(0xffffffff8fc9b8e3, float:-1.9891346E-29)
            X.0fX.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00d0
        L_0x0092:
            r3 = move-exception
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0098 }
        L_0x0098:
            android.media.MediaCodec r7 = r13.A0L     // Catch:{ Exception -> 0x00b2 }
            X.9R7 r2 = r13.A06     // Catch:{ Exception -> 0x00b2 }
            android.graphics.SurfaceTexture r0 = r2.A00()     // Catch:{ Exception -> 0x00b2 }
            android.view.Surface r10 = new android.view.Surface     // Catch:{ Exception -> 0x00b2 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x00b2 }
            r12 = 1538403511(0x5bb22cb7, float:1.00303421E17)
            X.0fX.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "success on second attempt"
            X.0wb.A06(r1, r0, r3)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00d0
        L_0x00b2:
            r4 = 800(0x320, double:3.953E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x00b7 }
        L_0x00b7:
            android.media.MediaCodec r7 = r13.A0L     // Catch:{ Exception -> 0x00e3 }
            X.9R7 r2 = r13.A06     // Catch:{ Exception -> 0x00e3 }
            android.graphics.SurfaceTexture r0 = r2.A00()     // Catch:{ Exception -> 0x00e3 }
            android.view.Surface r10 = new android.view.Surface     // Catch:{ Exception -> 0x00e3 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x00e3 }
            r12 = 120315061(0x72bdcb5, float:1.292947E-34)
            X.0fX.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r0 = "success on third attempt"
            X.0wb.A06(r1, r0, r3)     // Catch:{ Exception -> 0x00e3 }
        L_0x00d0:
            android.graphics.SurfaceTexture r0 = r2.A00()
            r0.getClass()
            r0.setOnFrameAvailableListener(r13)
            android.media.MediaCodec r1 = r13.A0L
            r0 = 860696989(0x334d319d, float:4.7775405E-8)
            X.0fX.A05(r1, r0)
            return r6
        L_0x00e3:
            java.lang.String r0 = "three failed attempts"
            X.0wb.A06(r1, r0, r3)
            return r11
        L_0x00ea:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8826RBc.A0B():boolean");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.A0D) {
            this.A09 = true;
            if (this.A0B) {
                A09();
            }
        }
        if (!this.A0D) {
            this.A00.A03((Long) null);
        }
    }

    public C8826RBc(Context context, UserSession userSession, AnonymousClass9RG r8, AnonymousClass9R7 r9, C13825Thv thv, C13830Ti1 ti1, boolean z) {
        super(r8);
        this.A0I = ti1;
        this.A0B = z;
        this.A0E = userSession;
        this.A06 = r9;
        this.A0G = context;
        this.A08 = ti1;
        this.A07 = thv;
    }

    public final void A02() {
        A01();
    }

    public final void A04() {
        A01();
    }

    public final void A05() {
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r7 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r11.A07.Eub();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r11.A0H.ATE(new X.RA6(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 <= r11.A0K) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(int r12) {
        /*
            r11 = this;
            long r4 = X.Pxf.A0E(r12)
            r10 = r11
            long r1 = r11.A0K
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            monitor-enter(r10)
            long r1 = r11.A0K     // Catch:{ all -> 0x003d }
            r8 = 0
            r7 = 0
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            long r2 = r11.A0K     // Catch:{ all -> 0x003d }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r11.A0N = r0     // Catch:{ all -> 0x003d }
            r11.A0K = r4     // Catch:{ all -> 0x003d }
            boolean r0 = r11.A0P     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0028
            monitor-exit(r10)     // Catch:{ all -> 0x003d }
            return
        L_0x0028:
            r11.A0P = r6     // Catch:{ all -> 0x003d }
            long r2 = r11.A0K     // Catch:{ all -> 0x003d }
            long r0 = r11.A04     // Catch:{ all -> 0x003d }
            long r2 = r2 - r0
            long r3 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x003d }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r7 = 1
        L_0x003b:
            monitor-exit(r10)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x003d }
            throw r0
        L_0x0040:
            if (r7 == 0) goto L_0x0047
            X.Thv r0 = r11.A07
            r0.Eub()
        L_0x0047:
            X.0vc r1 = r11.A0H
            X.RA6 r0 = new X.RA6
            r0.<init>(r11)
            r1.ATE(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8826RBc.A0A(int):void");
    }
}
