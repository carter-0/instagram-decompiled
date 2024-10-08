package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Deq  reason: case insensitive filesystem */
public final class C46429Deq implements View.OnLayoutChangeListener {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C3254672n A01;

    public C46429Deq(Drawable drawable, C3254672n r2) {
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.A01.A01.setTopMarginRatio(((C321016tR) this.A00).A01);
    }
}
