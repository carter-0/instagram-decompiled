package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.5MT  reason: invalid class name */
public final class AnonymousClass5MT extends 0Yg implements C62320sa {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ AnonymousClass4X7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MT(SurfaceTexture surfaceTexture, AnonymousClass4X7 r3) {
        super(0);
        this.A01 = r3;
        this.A00 = surfaceTexture;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass4M1 r2 = this.A01.A00;
        Surface surface = new Surface(this.A00);
        C263814Nl r0 = r2.A0O;
        if (r0 == null || !r0.A03.A03) {
            AnonymousClass4MM r02 = r2.A0K;
            if (r02 != null) {
                r02.setSurface(surface);
            }
        } else {
            AnonymousClass4M1.A0G(r2);
        }
        return C60340gF.A00;
    }
}
