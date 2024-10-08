package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

public final class AV5 implements C341047mF {
    public WeakReference A00 = new WeakReference((Object) null);
    public WeakReference A01;

    public final /* synthetic */ void D0F(int i) {
    }

    public final /* synthetic */ void D8b(int i) {
    }

    public final /* synthetic */ void Dh5(int i, int i2) {
    }

    public final /* synthetic */ void Dh8(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void Dh9(Surface surface) {
    }

    public final /* synthetic */ void ECm(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void EgZ(boolean z) {
    }

    public final boolean FNS() {
        return false;
    }

    public final /* synthetic */ C343177pn Bc6() {
        return null;
    }

    public final /* synthetic */ C343177pn Bje() {
        return null;
    }

    public final SurfaceTexture C3H(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (SurfaceTexture) this.A01.get();
    }

    public final Surface C3I() {
        return (Surface) this.A00.get();
    }

    public final SurfaceTexture C3J() {
        return (SurfaceTexture) this.A01.get();
    }

    public final /* synthetic */ C341827na CEH() {
        return null;
    }

    public final /* synthetic */ C343177pn CHY() {
        return null;
    }

    public final void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A01 = new WeakReference(surfaceTexture);
    }

    public final void Dh7(Surface surface, int i, int i2) {
        this.A00 = new WeakReference(surface);
    }

    public AV5(SurfaceTexture surfaceTexture) {
        this.A01 = new WeakReference(surfaceTexture);
    }

    public final /* synthetic */ Object BYV(C341907ni r2) {
        return null;
    }
}
