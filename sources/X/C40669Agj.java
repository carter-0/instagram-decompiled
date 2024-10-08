package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Agj  reason: case insensitive filesystem */
public final class C40669Agj implements B2J {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C3510387i A01;
    public final /* synthetic */ C3498482b A02;

    public final /* synthetic */ void Dgr(float f) {
    }

    public C40669Agj(Drawable drawable, C3510387i r2, C3498482b r3) {
        this.A00 = drawable;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DH7(boolean z) {
        Drawable drawable = this.A00;
        if (z) {
            AnonymousClass91L.A03(drawable, this.A01, 0.0f);
            this.A02.A00();
            return;
        }
        C3498482b r2 = this.A02;
        AnonymousClass91L.A03(drawable, this.A01, ((float) r2.A01) * 0.04f);
        r2.A01();
    }
}
