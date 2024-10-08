package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4X6  reason: invalid class name */
public class AnonymousClass4X6 implements TextureView.SurfaceTextureListener {
    public final Set A00;

    public void A00() {
    }

    public void A01() {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        for (TextureView.SurfaceTextureListener onSurfaceTextureAvailable : this.A00) {
            onSurfaceTextureAvailable.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        boolean z = true;
        for (TextureView.SurfaceTextureListener onSurfaceTextureDestroyed : this.A00) {
            z &= onSurfaceTextureDestroyed.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        for (TextureView.SurfaceTextureListener onSurfaceTextureSizeChanged : this.A00) {
            onSurfaceTextureSizeChanged.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        for (TextureView.SurfaceTextureListener onSurfaceTextureUpdated : this.A00) {
            onSurfaceTextureUpdated.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public AnonymousClass4X6(AnonymousClass4X6 r3) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (r3 != null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet(r3.A00);
        } else {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
        }
        this.A00 = copyOnWriteArraySet;
    }

    public AnonymousClass4X6() {
        this((AnonymousClass4X6) null);
    }
}
