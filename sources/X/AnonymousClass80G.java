package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import java.util.function.Consumer;

/* renamed from: X.80G  reason: invalid class name */
public final class AnonymousClass80G {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public ImageReader A05;
    public Surface A06;
    public SurfaceHolder.Callback A07;
    public TextureView.SurfaceTextureListener A08;
    public B1J A09;
    public boolean A0A;
    public SurfaceControl A0B;
    public final SurfaceView A0C;
    public final MultiListenerTextureView A0D;
    public final AnonymousClass8KF A0E;
    public final Consumer A0F = new AnonymousClass8KE(this);

    public AnonymousClass80G(SurfaceView surfaceView) {
        0qQ.A0B(surfaceView, 1);
        this.A0C = surfaceView;
        this.A0D = null;
        this.A0E = new AnonymousClass8KF((AnonymousClass8KF) null);
        C378509Qb r1 = new C378509Qb(surfaceView, this);
        surfaceView.getHolder().addCallback(r1);
        this.A07 = r1;
    }

    public final void A08(AnonymousClass8KG r3) {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        MultiListenerTextureView multiListenerTextureView;
        0qQ.A0B(r3, 0);
        this.A0E.A00.add(r3);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A08;
        if (!(surfaceTextureListener == null || (multiListenerTextureView = this.A0D) == null)) {
            multiListenerTextureView.A02(surfaceTextureListener);
        }
        SurfaceHolder.Callback callback = this.A07;
        if (callback != null && (surfaceView = this.A0C) != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(callback);
        }
    }

    public static final void A01(AnonymousClass80G r6) {
        SurfaceControl surfaceControl;
        ImageReader imageReader = r6.A05;
        if (imageReader != null && Build.VERSION.SDK_INT >= 34 && (surfaceControl = r6.A0B) != null) {
            Image image = null;
            try {
                Image acquireNextImage = imageReader.acquireNextImage();
                SyncFence fence = acquireNextImage.getFence();
                0qQ.A07(fence);
                float f = r6.A00;
                if (f <= 0.0f) {
                    f = r6.A01;
                }
                new SurfaceControl.Transaction().setDataSpace(surfaceControl, 411107328).setExtendedRangeBrightness(surfaceControl, f, 3.0f).setBuffer(surfaceControl, acquireNextImage.getHardwareBuffer(), fence, new C41377Asy(acquireNextImage, r6)).apply();
            } catch (Throwable unused) {
                if (image != null) {
                    image.close();
                }
            }
        }
    }

    public final Bitmap A03(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null) {
            return null;
        }
        MultiListenerTextureView multiListenerTextureView = this.A0D;
        if (multiListenerTextureView != null && (bitmap2 = multiListenerTextureView.getBitmap(bitmap)) != null) {
            return bitmap2;
        }
        Surface A042 = A04();
        if (A042 != null) {
            try {
                PixelCopy.request(A042, bitmap, new ALm(bitmap), new Handler(Looper.getMainLooper()));
                return bitmap;
            } catch (Throwable th) {
                0kD.A07("ConstrainedViewHolder", "getSurfaceBitmap failed", th);
            }
        }
        return bitmap;
    }

    public final Surface A04() {
        Surface surface;
        MultiListenerTextureView multiListenerTextureView;
        if (!(this.A06 == null || (multiListenerTextureView = this.A0D) == null || (multiListenerTextureView.isAvailable() && 0qQ.A0K(multiListenerTextureView.getSurfaceTexture(), this.A04)))) {
            Surface surface2 = this.A06;
            if (surface2 != null) {
                surface2.release();
            }
            this.A06 = null;
            this.A04 = null;
        }
        if (this.A06 == null) {
            MultiListenerTextureView multiListenerTextureView2 = this.A0D;
            if (multiListenerTextureView2 != null && multiListenerTextureView2.isAvailable()) {
                this.A06 = new Surface(multiListenerTextureView2.getSurfaceTexture());
                this.A04 = multiListenerTextureView2.getSurfaceTexture();
            }
            SurfaceView surfaceView = this.A0C;
            if (!(surfaceView == null || (surface = surfaceView.getHolder().getSurface()) == null || !surface.isValid())) {
                if (Build.VERSION.SDK_INT < 34 || this.A03 <= 0 || this.A02 <= 0) {
                    this.A06 = surface;
                } else {
                    SurfaceControl build = new SurfaceControl.Builder().setName("ConstrainedView").build();
                    0qQ.A07(build);
                    new SurfaceControl.Transaction().reparent(build, surfaceView.getSurfaceControl()).setVisibility(build, true).apply();
                    this.A0B = build;
                    ImageReader newInstance = ImageReader.newInstance(this.A03, this.A02, 1, 2, 2816);
                    0qQ.A07(newInstance);
                    newInstance.setOnImageAvailableListener(new ALE(this), (Handler) null);
                    this.A06 = newInstance.getSurface();
                    this.A05 = newInstance;
                    Display display = surfaceView.getDisplay();
                    if (this.A0A && display != null && display.isHdrSdrRatioAvailable()) {
                        float hdrSdrRatio = display.getHdrSdrRatio();
                        this.A01 = hdrSdrRatio;
                        B1J b1j = this.A09;
                        if (b1j != null) {
                            b1j.DIo(hdrSdrRatio);
                        }
                        display.registerHdrSdrRatioChangedListener(C41372Ast.A00, this.A0F);
                    }
                }
            }
        }
        return this.A06;
    }

    public final View A05() {
        View view = this.A0D;
        if (view != null || (view = this.A0C) != null) {
            return view;
        }
        throw new IllegalStateException("No View");
    }

    public final MultiListenerTextureView A06() {
        MultiListenerTextureView multiListenerTextureView = this.A0D;
        if (multiListenerTextureView != null) {
            return multiListenerTextureView;
        }
        throw new IllegalStateException("No TextureView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.0sP r6) {
        /*
            r5 = this;
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r5.A0D
            if (r0 == 0) goto L_0x001b
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto L_0x0017
        L_0x000a:
            int r2 = r5.A03
            int r1 = r5.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            X.0qQ.A07(r0)
        L_0x0017:
            r6.invoke(r0)
            return
        L_0x001b:
            android.view.SurfaceView r4 = r5.A0C
            if (r4 == 0) goto L_0x000a
            int r2 = r5.A03     // Catch:{ all -> 0x003e }
            int r1 = r5.A02     // Catch:{ all -> 0x003e }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x003e }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x003e }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x003e }
            X.ALo r2 = new X.ALo     // Catch:{ all -> 0x003e }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x003e }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x003e }
            r0.<init>(r1)     // Catch:{ all -> 0x003e }
            android.view.PixelCopy.request(r4, r3, r2, r0)     // Catch:{ all -> 0x003e }
            return
        L_0x003e:
            r2 = move-exception
            java.lang.String r1 = "ConstrainedViewHolder"
            java.lang.String r0 = "getSurfaceBitmap with callback failed"
            X.0kD.A07(r1, r0, r2)
            int r2 = r5.A03
            int r1 = r5.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            X.0qQ.A07(r0)
            r6.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80G.A09(X.0sP):void");
    }

    public final boolean A0A() {
        Display display;
        if (Build.VERSION.SDK_INT < 34 || this.A0C == null || (display = A05().getDisplay()) == null || !display.isHdrSdrRatioAvailable()) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        if (this.A0C == null || Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return true;
    }

    public final void A07(float f) {
        if (A05() instanceof B1I) {
            ((Activity) 0mE.A01(A05().getContext(), Activity.class)).runOnUiThread(new C40989AmZ(this, f));
        }
    }

    public AnonymousClass80G(MultiListenerTextureView multiListenerTextureView) {
        0qQ.A0B(multiListenerTextureView, 1);
        this.A0D = multiListenerTextureView;
        this.A0C = null;
        this.A0E = new AnonymousClass8KF((AnonymousClass8KF) null);
        AnonymousClass8KH r1 = new AnonymousClass8KH(this);
        multiListenerTextureView.setOpaque(false);
        multiListenerTextureView.A02(r1);
        this.A08 = r1;
    }
}
