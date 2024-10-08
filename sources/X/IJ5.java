package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

public final class IJ5 implements AnonymousClass2WT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ Drawable A03;
    public final /* synthetic */ Drawable A04;

    public IJ5(Drawable drawable, Drawable drawable2, Drawable drawable3, int i, int i2) {
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = drawable3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        return new C52871Ge4(context, this.A03, this.A02, this.A04, this.A01, this.A00);
    }
}
