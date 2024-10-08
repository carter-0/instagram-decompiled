package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: X.AcP  reason: case insensitive filesystem */
public final class C40454AcP implements C327807Cg {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass9H7 A01;
    public final /* synthetic */ C331157Pu A02;

    public final void ESW(int i, int i2, int i3, int i4) {
    }

    public C40454AcP(Handler handler, AnonymousClass9H7 r2, C331157Pu r3) {
        this.A00 = handler;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void EPw(Drawable drawable) {
        this.A00.post(new C73197PYb(drawable, this.A01));
    }

    public final void setBackgroundColor(int i) {
        this.A00.post(new C41167ApR(this.A01, this.A02, i));
    }
}
