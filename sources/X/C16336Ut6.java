package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Ut6  reason: case insensitive filesystem */
public final class C16336Ut6 extends AnonymousClass8BH {
    public final Rect A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Vc8] */
    public final C17677Vc8 A01() {
        ? obj = new Object();
        obj.A08 = AnonymousClass05K.A0N;
        obj.A07 = this.A00;
        return obj;
    }

    public final void A02(Drawable drawable, List list, int i, int i2) {
        drawable.setBounds(this.A00);
    }

    public C16336Ut6(Rect rect) {
        this.A00 = rect;
    }
}
