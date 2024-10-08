package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class GH5 extends C243963aQ {
    public static final 2WU A04 = C51971G9r.A0d(GHB.A00, 5);
    public final Drawable A00;
    public final ImageView.ScaleType A01;
    public final boolean A02;
    public final 2WX A03;

    public GH5(Drawable drawable, ImageView.ScaleType scaleType, 2WX r4, boolean z) {
        0qQ.A0B(drawable, 1);
        this.A00 = drawable;
        this.A02 = z;
        this.A01 = scaleType;
        this.A03 = r4;
    }

    public final C244523bK A0X(C244463bE r10) {
        0qQ.A0B(r10, 0);
        return new C244523bK(this.A03, new GH6(this.A00, this.A01), new AnonymousClass2WG(A04, GHC.A00, new MP7(this, 0), r10.A01()));
    }
}
