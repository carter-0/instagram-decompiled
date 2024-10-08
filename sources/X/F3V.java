package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class F3V {
    public int A00 = -2;
    public int A01 = -2;
    public int A02 = -2;
    public int A03 = -2;
    public int A04 = -2;
    public Resources.Theme A05;
    public ColorFilter A06;
    public ColorFilter A07;
    public Drawable A08;
    public Drawable A09;
    public View.OnClickListener A0A;
    public boolean A0B = true;
    public final Integer A0C;

    public F3V(Integer num) {
        this.A0C = num;
    }

    public final AnonymousClass57Z A00() {
        Drawable drawable = this.A09;
        Drawable drawable2 = this.A08;
        int i = this.A03;
        int i2 = this.A04;
        boolean z = this.A0B;
        int i3 = this.A01;
        int i4 = this.A02;
        View.OnClickListener onClickListener = this.A0A;
        int i5 = this.A00;
        return new AnonymousClass57Z(this.A05, this.A06, this.A07, drawable, drawable2, onClickListener, this.A0C, i, i2, -2, i3, i4, i5, -2, z);
    }

    public final void A01(int i) {
        this.A09 = new ColorDrawable(i);
    }
}
