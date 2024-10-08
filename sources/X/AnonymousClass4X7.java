package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.4X7  reason: invalid class name */
public final class AnonymousClass4X7 extends AnonymousClass4X8 implements TextureView.SurfaceTextureListener {
    public final Surface A00;
    public final View A01;
    public final ScalingTextureView A02;
    public final boolean A03;
    public final SurfaceTexture A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4X7(ScalingTextureView scalingTextureView, AnonymousClass4M1 r4, int i) {
        super(r4, i);
        SurfaceTexture surfaceTexture;
        0qQ.A0B(scalingTextureView, 2);
        this.A02 = scalingTextureView;
        AnonymousClass4X9.A00("TextureVideoViewController.init()", new C377169Ku(this, 43));
        this.A01 = scalingTextureView;
        boolean isAvailable = scalingTextureView.isAvailable();
        this.A03 = isAvailable;
        Surface surface = null;
        if (isAvailable && (surfaceTexture = scalingTextureView.getSurfaceTexture()) != null) {
            surface = new Surface(surfaceTexture);
        }
        this.A00 = surface;
        this.A04 = scalingTextureView.getSurfaceTexture();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        AnonymousClass4X9.A00("TextureVideoViewController.onSurfaceAvailable()", new AnonymousClass5MT(surfaceTexture, this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        if (!this.A00.A0N(this, surfaceTexture)) {
            return false;
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass4M1 r4 = this.A00;
        C263814Nl r3 = r4.A0O;
        if (r3 != null && r4.A0M == AnonymousClass3OB.PLAYING) {
            AnonymousClass4MF r2 = r4.A0o;
            C263754Nf r0 = r3.A0B;
            r2.EHB(AnonymousClass4M1.A00(r0, r4), r0.A03);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.A00.Dpp();
    }
}
