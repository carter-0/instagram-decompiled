package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.8HY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8HY implements AnonymousClass8HZ {
    public final /* synthetic */ AnonymousClass8HF A00;

    public /* synthetic */ AnonymousClass8HY(AnonymousClass8HF r1) {
        this.A00 = r1;
    }

    public final void EFD(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        AJ3 aj3;
        AnonymousClass8HF r1 = this.A00;
        if (r1.A0M.get() != 0) {
            C342917pN r0 = r1.A05;
            r0.getClass();
            C344377rl r02 = ((C345367tN) C342917pN.A00(r0)).A00;
            if (r02 != null && (aj3 = ((C344367rk) r02).A02) != null) {
                aj3.A0K.post(new C41227AqP(surfaceTexture, aj3, i, i2, i3));
            }
        }
    }
}
