package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.UHm  reason: case insensitive filesystem */
public final class C14970UHm extends C14710U2v implements TextureView.SurfaceTextureListener, C13773Tgo {
    public Surface A00;
    public Integer A01;

    public final void onHostDestroy() {
    }

    public final void onHostPause() {
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00();
    }

    private void A00() {
        int i;
        int A03 = AnonymousClass0fD.A03(13212300);
        Surface surface = this.A00;
        if (surface == null || !surface.isValid()) {
            i = 19521282;
        } else {
            try {
                Canvas lockCanvas = this.A00.lockCanvas((Rect) null);
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Integer num = this.A01;
                if (num != null) {
                    lockCanvas.drawColor(num.intValue());
                }
                new Paint();
                throw new NullPointerException("size");
            } catch (IllegalArgumentException | IllegalStateException e) {
                0I1.A03("ReactNative", 002.A0R(C51968G9o.A16(e), " in Surface.unlockCanvasAndPost"));
                i = 1864906832;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onHostResume() {
        A00();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Context context = getContext();
        if (context instanceof QZL) {
            ((Q6H) context).A0A(this);
        }
        Surface surface = this.A00;
        if (surface == null) {
            return true;
        }
        surface.release();
        this.A00 = null;
        return true;
    }

    public void setBackgroundColor(int i) {
        this.A01 = Integer.valueOf(i);
    }
}
