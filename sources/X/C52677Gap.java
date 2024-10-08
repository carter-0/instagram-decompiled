package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gap  reason: case insensitive filesystem */
public final class C52677Gap implements C64721Te {
    public final /* synthetic */ C52676Gao A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Gao, android.view.View] */
    public final Drawable ALw(Resources resources, 1U1 r7, C240483Lb r8) {
        0qQ.A0B(r8, 1);
        if (!(r8 instanceof C240523Lf)) {
            return null;
        }
        ? r0 = this.A00;
        Bitmap CBJ = ((C240523Lf) r8).CBJ();
        if (CBJ != null) {
            return new C379729Vb(AnonymousClass7TE.A0S(r0), CBJ, 16.0f, (int) (r0.A03 + r0.A02));
        }
        return null;
    }

    public C52677Gap(C52676Gao gao) {
        this.A00 = gao;
    }
}
