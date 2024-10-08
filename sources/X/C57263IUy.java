package X;

import android.graphics.Bitmap;

/* renamed from: X.IUy  reason: case insensitive filesystem */
public final class C57263IUy implements C247813gx {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C309426Yf A01;
    public final /* synthetic */ C309726Zj A02;

    public C57263IUy(C255773uh r1, C309426Yf r2, C309726Zj r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r6) {
        0qQ.A0B(r6, 0);
        C309426Yf r4 = this.A01;
        Bitmap bitmap = r6.A02;
        boolean z = true;
        r4.A0l = AnonymousClass7TF.A1V(bitmap);
        C309726Zj r1 = this.A02;
        if (bitmap == null) {
            z = false;
        }
        r1.DzS(this.A00, r4, z);
    }
}
