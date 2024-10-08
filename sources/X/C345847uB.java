package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.List;

/* renamed from: X.7uB  reason: invalid class name and case insensitive filesystem */
public final class C345847uB extends C344317rf implements C345547th, C345857uC {
    public final int A00;
    public final int A01;
    public final SurfaceHolder.Callback A02 = new ALq(this);
    public final TextureView.SurfaceTextureListener A03 = new ALr(this);
    public final C3496981j A04 = new C3496981j();
    public volatile int A05;
    public volatile int A06;
    public volatile View A07;
    public volatile C346027uT A08;

    public static synchronized void A00(C345847uB r3) {
        synchronized (r3) {
            View view = r3.A07;
            r3.A07 = null;
            if (view instanceof TextureView) {
                ((TextureView) view).setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            } else if (view instanceof SurfaceView) {
                ((SurfaceView) view).getHolder().removeCallback(r3.A02);
            }
            C346027uT r0 = r3.A08;
            r3.A08 = null;
            if (r0 != null) {
                A03(r3, r0);
                r0.A01();
            }
        }
    }

    public final synchronized View Bf9() {
        if (this.A07 != null) {
        } else {
            throw new IllegalStateException("Preview view is null when invoking getPreviewView()");
        }
        return this.A07;
    }

    public final synchronized void Egb(SurfaceTexture surfaceTexture, int i, int i2) {
        C346027uT r3 = this.A08;
        if (r3 != null) {
            if (r3.A0B != surfaceTexture) {
                this.A07 = null;
                this.A08 = null;
                this.A06 = 0;
                this.A05 = 0;
                A03(this, r3);
                r3.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A04(this, r3, i, i2);
        }
        if (surfaceTexture != null) {
            r3 = new C346027uT(surfaceTexture, false);
            r3.A08 = this.A01;
            r3.A06 = this.A00;
            this.A08 = r3;
            A01(this, r3);
            this.A06 = i;
            this.A05 = i2;
            A04(this, r3, i, i2);
        }
    }

    public final synchronized void Ege(View view) {
        if (this.A07 != view) {
            A00(this);
            this.A07 = view;
            for (C344337rh DZH : this.A04.A00) {
                DZH.DZH(this.A07);
            }
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                SurfaceHolder holder = surfaceView.getHolder();
                SurfaceHolder.Callback callback = this.A02;
                holder.addCallback(callback);
                SurfaceHolder holder2 = surfaceView.getHolder();
                if (holder2.getSurface() != null && holder2.getSurface().isValid()) {
                    callback.surfaceCreated(holder2);
                    Rect surfaceFrame = holder2.getSurfaceFrame();
                    surfaceFrame.getClass();
                    int i = surfaceFrame.right - surfaceFrame.left;
                    int i2 = surfaceFrame.bottom - surfaceFrame.top;
                    if (i > 0 && i2 > 0) {
                        callback.surfaceChanged(holder2, -1, i, i2);
                    }
                }
            } else if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.A03;
                textureView.setSurfaceTextureListener(surfaceTextureListener);
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (surfaceTexture != null && width > 0 && height > 0) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, width, height);
                }
            }
        }
    }

    public static void A01(C345847uB r3, C346027uT r4) {
        List list = r3.A04.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C344337rh) list.get(i)).DZB(r4);
        }
    }

    public static void A03(C345847uB r3, C346027uT r4) {
        List list = r3.A04.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C344337rh) list.get(i)).DZC(r4);
        }
    }

    public static void A04(C345847uB r3, C346027uT r4, int i, int i2) {
        List list = r3.A04.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C344337rh) list.get(i3)).DZD(r4, i, i2);
        }
    }

    public final void A9s(C344337rh r4) {
        if (this.A04.A01(r4)) {
            if (this.A07 != null) {
                r4.DZH(this.A07);
            }
            C346027uT r2 = this.A08;
            if (r2 != null) {
                r4.DZB(r2);
                int i = this.A06;
                int i2 = this.A05;
                if (i > 0 && i2 > 0) {
                    r4.DZD(r2, i, i2);
                }
            }
        }
    }

    public final C343717qg BJt() {
        return C345547th.A00;
    }

    public final void Bes(C40091AQw aQw) {
        IllegalStateException illegalStateException;
        Surface A002;
        View view = this.A07;
        if (view instanceof TextureView) {
            try {
                Bitmap bitmap = ((TextureView) view).getBitmap(view.getWidth(), view.getHeight());
                if (bitmap != null) {
                    aQw.A00(bitmap, (C39669A4j) null);
                } else {
                    aQw.D0x(new IllegalStateException("Failed to acquire bitmap"));
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        } else {
            C346027uT r0 = this.A08;
            if (r0 == null || (A002 = r0.A00()) == null) {
                illegalStateException = new IllegalStateException("Preview view or surface is null");
                aQw.D0x(illegalStateException);
                return;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(this.A06, this.A05, Bitmap.Config.ARGB_8888);
                PixelCopy.request(A002, createBitmap, new ALn(createBitmap, aQw), ((C343897qz) ((C343927r2) this.A00.Apf(C343927r2.A00))).A00);
            } catch (Throwable th2) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th2);
            }
        }
    }

    public final boolean CKQ() {
        if (this.A07 != null) {
            return true;
        }
        return false;
    }

    public final void EES(C344337rh r2) {
        this.A04.A02(r2);
    }

    public C345847uB(C343837qt r6) {
        super(r6);
        C343667qb r4 = C345857uC.A01;
        int i = 0;
        Object obj = 0;
        C343837qt r1 = this.A00;
        Object Apu = r1.Apu(r4);
        this.A01 = ((Number) (Apu != null ? Apu : obj)).intValue();
        Object Apu2 = r1.Apu(C345857uC.A00);
        this.A00 = ((Number) (Apu2 != null ? Apu2 : i)).intValue();
        View view = (View) r1.Apu(C340357l8.A03);
        Ege(view == null ? (View) r1.Apu(C340357l8.A02) : view);
    }

    public final View AqN() {
        return Bf9();
    }
}
