package X;

import android.graphics.Bitmap;

public final class WVU implements C20896X3n {
    public final /* synthetic */ AnonymousClass7EF A00;
    public final /* synthetic */ C332297Uk A01;

    public WVU(AnonymousClass7EF r1, C332297Uk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final C20895X3m ALe(Bitmap bitmap) {
        AnonymousClass4DH r2 = this.A01.A03;
        if (!r2.isResumed()) {
            return null;
        }
        return C18372VqY.A00(JTR.A0R(r2), bitmap, this.A00);
    }
}
