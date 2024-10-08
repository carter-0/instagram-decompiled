package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import org.webrtc.ScreenCapturerAndroid;

public final class LSQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public Bitmap A05;
    public Surface A06;
    public Surface A07;
    public S52 A08;
    public ImageUrl A09;
    public C21028XAh A0A;
    public MTD A0B;
    public S4f A0C = new S4f();
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public final Bitmap A0G;
    public final C365388n1 A0H;
    public final C346057uW A0I;
    public final UserSession A0J;
    public final Context A0K;
    public final Handler A0L = AnonymousClass7TF.A0D();

    private final float A00() {
        if (((float) this.A03) <= ((float) this.A01) * 0.6f) {
            return 0.35349f;
        }
        if (((float) this.A02) <= ((float) this.A00) * 0.6f) {
            return 0.17447f;
        }
        return 0.19225f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        X.0wb.A03("IgLiveImageStreamingController", X.AnonymousClass7TF.A0m("Exception while trying to render frame to preview surface. Error: ", r2));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.LSQ r12) {
        /*
            android.graphics.Bitmap r6 = r12.A05
            if (r6 == 0) goto L_0x00fb
            android.view.Surface r3 = r12.A06
            if (r3 == 0) goto L_0x0062
            monitor-enter(r3)     // Catch:{ Exception -> 0x0056 }
            float r9 = r12.A00()     // Catch:{ all -> 0x0053 }
            int r0 = r12.A03     // Catch:{ all -> 0x0053 }
            float r7 = (float) r0     // Catch:{ all -> 0x0053 }
            float r9 = r9 * r7
            int r0 = r12.A02     // Catch:{ all -> 0x0053 }
            float r8 = (float) r0     // Catch:{ all -> 0x0053 }
            r0 = 1033352230(0x3d97b426, float:0.074074075)
            int r11 = X.AnonymousClass7TE.A05(r7, r0)     // Catch:{ all -> 0x0053 }
            r10 = r9
            android.graphics.Bitmap r5 = A01(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0053 }
            X.S4f r4 = r12.A0C     // Catch:{ all -> 0x0053 }
            r4.A01(r3)     // Catch:{ all -> 0x0053 }
            int r1 = r5.getWidth()     // Catch:{ all -> 0x0053 }
            int r0 = r5.getHeight()     // Catch:{ all -> 0x0053 }
            X.S52 r2 = new X.S52     // Catch:{ all -> 0x0053 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0053 }
            r1 = 3553(0xde1, float:4.979E-42)
            r0 = 0
            android.opengl.GLUtils.texImage2D(r1, r0, r5, r0)     // Catch:{ all -> 0x0053 }
            r2.A01()     // Catch:{ all -> 0x0053 }
            r12.A08 = r2     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "IgLiveImageStreamingController rendered image to preview surface"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0053 }
            X.C345907uH.A02(r1, r0)     // Catch:{ all -> 0x0053 }
            android.opengl.EGLDisplay r1 = r4.A00     // Catch:{ all -> 0x0053 }
            android.opengl.EGLSurface r0 = r4.A01     // Catch:{ all -> 0x0053 }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ all -> 0x0053 }
            r4.A00()     // Catch:{ all -> 0x0053 }
            r0 = 0
            r12.A06 = r0     // Catch:{ all -> 0x0053 }
            monitor-exit(r3)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0056 }
            throw r0     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "IgLiveImageStreamingController"
            java.lang.String r0 = "Exception while trying to render frame to preview surface. Error: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)
            X.0wb.A03(r1, r0)
        L_0x0062:
            X.XAh r2 = r12.A0A
            if (r2 == 0) goto L_0x00fb
            monitor-enter(r2)     // Catch:{ Exception -> 0x00ef }
            float r9 = r12.A00()     // Catch:{ all -> 0x00ec }
            int r0 = r2.C3N()     // Catch:{ all -> 0x00ec }
            float r7 = (float) r0     // Catch:{ all -> 0x00ec }
            float r9 = r9 * r7
            android.graphics.Bitmap r4 = r12.A04     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x0088
            int r0 = r2.C3K()     // Catch:{ all -> 0x00ec }
            float r8 = (float) r0     // Catch:{ all -> 0x00ec }
            r0 = 1033352230(0x3d97b426, float:0.074074075)
            int r11 = X.AnonymousClass7TE.A05(r7, r0)     // Catch:{ all -> 0x00ec }
            r10 = r9
            android.graphics.Bitmap r4 = A01(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ec }
            r12.A04 = r4     // Catch:{ all -> 0x00ec }
        L_0x0088:
            X.S4f r5 = r12.A0C     // Catch:{ all -> 0x00ec }
            android.view.Surface r0 = r2.getSurface()     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e7
            r5.A01(r0)     // Catch:{ all -> 0x00ec }
            int r3 = r4.getWidth()     // Catch:{ all -> 0x00ec }
            int r0 = r4.getHeight()     // Catch:{ all -> 0x00ec }
            X.S52 r1 = new X.S52     // Catch:{ all -> 0x00ec }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x00ec }
            r0 = 3553(0xde1, float:4.979E-42)
            r6 = 0
            android.opengl.GLUtils.texImage2D(r0, r6, r4, r6)     // Catch:{ all -> 0x00ec }
            r1.A01()     // Catch:{ all -> 0x00ec }
            r12.A08 = r1     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "IgLiveImageStreamingController rendered image to output surface"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ec }
            X.C345907uH.A02(r1, r0)     // Catch:{ all -> 0x00ec }
            X.7uW r3 = r12.A0I     // Catch:{ all -> 0x00ec }
            X.8n1 r0 = r12.A0H     // Catch:{ all -> 0x00ec }
            long r0 = r0.ANS()     // Catch:{ all -> 0x00ec }
            long r3 = r3.A00(r0)     // Catch:{ all -> 0x00ec }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r3 / r0
            r2.EiX(r0)     // Catch:{ all -> 0x00ec }
            android.opengl.EGLDisplay r1 = r5.A00     // Catch:{ all -> 0x00ec }
            android.opengl.EGLSurface r0 = r5.A01     // Catch:{ all -> 0x00ec }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r1, r0, r3)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "IgLiveImageStreamingController set presentation time on frame to output surface"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ec }
            X.C345907uH.A02(r1, r0)     // Catch:{ all -> 0x00ec }
            android.opengl.EGLDisplay r1 = r5.A00     // Catch:{ all -> 0x00ec }
            android.opengl.EGLSurface r0 = r5.A01     // Catch:{ all -> 0x00ec }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ all -> 0x00ec }
            r5.A00()     // Catch:{ all -> 0x00ec }
            X.MTD r0 = r12.A0B     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e5
            r0.Cr7(r2)     // Catch:{ all -> 0x00ec }
        L_0x00e5:
            monitor-exit(r2)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00fb
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x00ec }
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x00ef }
            throw r0     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            r2 = move-exception
            java.lang.String r1 = "IgLiveImageStreamingController"
            java.lang.String r0 = "Exception while trying to render frame to output surface. Error: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)
            X.0wb.A03(r1, r0)
        L_0x00fb:
            android.os.Handler r3 = r12.A0L
            X.M5H r2 = new X.M5H
            r2.<init>(r12)
            r0 = 33
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSQ.A02(X.LSQ):void");
    }

    public final void A03() {
        int i = this.A0F;
        this.A0F = i + 1;
        if (i < 3) {
            this.A0L.postDelayed(new M5F(this), 300);
            Surface surface = this.A06;
            if (surface != null) {
                this.A07 = surface;
            }
        }
    }

    public final void A04() {
        this.A0L.removeCallbacksAndMessages((Object) null);
        this.A0C.A00();
        this.A0E = false;
        S52 s52 = this.A08;
        if (s52 != null) {
            s52.A00();
        }
        this.A08 = null;
        this.A04 = null;
        if (0qQ.A0K(this.A05, this.A0G)) {
            this.A05 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.KHH, X.11X] */
    public final void A05(Surface surface) {
        if (surface == null) {
            0wb.A03("IgLiveImageStreamingController", "previewSurface is null when starting to stream image");
        }
        if (this.A0E) {
            A04();
        }
        this.A0E = true;
        this.A06 = surface;
        if (this.A05 == null && !this.A0D) {
            1ES.A03(new KHH(this));
        }
        this.A0L.post(new M5G(this));
    }

    public LSQ(Context context, UserSession userSession, int i, int i2) {
        this.A0J = userSession;
        this.A0K = context;
        this.A01 = i;
        this.A00 = i2;
        C365138mb r0 = C365138mb.A01;
        0qQ.A07(r0);
        this.A0H = r0;
        this.A0I = new C346057uW();
        Bitmap createBitmap = Bitmap.createBitmap(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        this.A0G = createBitmap;
    }

    public static final Bitmap A01(Bitmap bitmap, float f, float f2, float f3, float f4, int i) {
        float f5;
        int round = Math.round(f);
        int round2 = Math.round(f2);
        Bitmap.Config config = bitmap.getConfig();
        0qQ.A0A(config);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
        0qQ.A07(createBitmap);
        Canvas A0B2 = JTO.A0B(createBitmap);
        if (f2 > f) {
            f5 = f2;
        } else {
            f5 = 1.7777778f * f;
        }
        Bitmap A092 = 1MF.A09(bitmap, round, Math.round(f5), 0, false);
        0qQ.A07(A092);
        Bitmap blur = BlurUtil.blur(A092, 1.0f, i);
        A0B2.drawBitmap(blur, (f - JTO.A02(blur)) / 2.0f, (f2 - JTO.A01(blur)) / 2.0f, (Paint) null);
        Paint A0C2 = JTO.A0C();
        A0C2.setColor(-16777216);
        A0C2.setAlpha(127);
        A0B2.drawRect(JTS.A08(blur), A0C2);
        Bitmap A052 = 1MF.A05(1MF.A09(bitmap, Math.round(f3), Math.round(f4), 0, false));
        if (A052 != null) {
            A0B2.drawBitmap(A052, (f - JTO.A02(A052)) / 2.0f, (f2 - JTO.A01(A052)) / 2.0f, (Paint) null);
            return createBitmap;
        }
        throw AnonymousClass7TE.A0y();
    }
}
