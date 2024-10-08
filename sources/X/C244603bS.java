package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3bS  reason: invalid class name and case insensitive filesystem */
public final class C244603bS extends C243963aQ {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final 2V5 A04;
    public final 2WX A05;

    public C244603bS(Drawable drawable, ImageView.ScaleType scaleType, 2V5 r4, 2WX r5, int i, int i2) {
        0qQ.A0B(drawable, 1);
        this.A02 = drawable;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = scaleType;
        this.A04 = r4;
        this.A05 = r5;
    }

    public final C244523bK A0X(C244463bE r12) {
        0qQ.A0B(r12, 0);
        return new C244523bK(this.A05, new C244613bT(this.A02), new AnonymousClass2WG(new 2WU(C243983aS.A00, C244633bV.A00, 5, true), C244623bU.A00, new C377439Lv(29, r12, this), r12.A01()));
    }
}
