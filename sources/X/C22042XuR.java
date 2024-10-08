package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: X.XuR  reason: case insensitive filesystem */
public final class C22042XuR implements TextureView.SurfaceTextureListener, SurfaceHolder.Callback, TZX, C22522Y7t, C22524Y7v, Y84, Y89, Y8B, Y8J {
    public final /* synthetic */ C22056Xui A00;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C22042XuR(C22056Xui xui) {
        this.A00 = xui;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C22056Xui xui = this.A00;
        C22056Xui xui2 = C22056Xui.$redex_init_class;
        Surface surface = new Surface(surfaceTexture);
        C22056Xui.A05(xui, surface);
        xui.A03 = surface;
        C22056Xui.A03(xui, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22056Xui xui = this.A00;
        C22056Xui.A05(xui, (Object) null);
        C22056Xui.A03(xui, 0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C22056Xui.A03(this.A00, i, i2);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C22056Xui.A03(this.A00, i2, i3);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C22056Xui.A03(this.A00, 0, 0);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C22056Xui xui = C22056Xui.$redex_init_class;
    }
}
