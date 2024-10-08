package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.List;

/* renamed from: X.Ut8  reason: case insensitive filesystem */
public final class C16338Ut8 extends AnonymousClass8BH {
    public final float A00;
    public final float A01;
    public final int A02;

    public final void A02(Drawable drawable, List list, int i, int i2) {
        Rect rect = new Rect(0, 0, i, i2);
        Rect rect2 = new Rect();
        Gravity.apply(this.A02, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
        rect2.offset((int) this.A00, (int) this.A01);
        drawable.setBounds(rect2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Vc8] */
    public final C17677Vc8 A01() {
        ? obj = new Object();
        obj.A08 = AnonymousClass05K.A0C;
        obj.A06 = this.A02;
        obj.A02 = this.A00;
        obj.A03 = this.A01;
        return obj;
    }

    public C16338Ut8(int i, float f, float f2) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }
}
