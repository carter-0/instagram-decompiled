package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.5jJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C292655jJ implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;
    public final /* synthetic */ AnonymousClass4X8 A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ C292655jJ(AnonymousClass4M1 r1, AnonymousClass4X8 r2, Object obj) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = obj;
    }

    public final void run() {
        Surface surface;
        AnonymousClass4M1 r2 = this.A00;
        AnonymousClass4X8 r0 = this.A01;
        Object obj = this.A02;
        if (r0 instanceof AnonymousClass4X7) {
            ((SurfaceTexture) obj).release();
        } else if ((obj instanceof Surface) && (surface = (Surface) obj) != null) {
            surface.release();
        }
        r2.A0N.onSurfaceTextureDestroyed();
    }
}
