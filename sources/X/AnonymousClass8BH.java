package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8BH  reason: invalid class name */
public abstract class AnonymousClass8BH {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Vc8] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Vc8] */
    public C17677Vc8 A01() {
        if (this instanceof AnonymousClass8BG) {
            AnonymousClass8BG r2 = (AnonymousClass8BG) this;
            ? obj = new Object();
            obj.A08 = AnonymousClass05K.A00;
            obj.A00 = r2.A00;
            obj.A01 = r2.A01;
            return obj;
        }
        ? obj2 = new Object();
        obj2.A08 = AnonymousClass05K.A0Y;
        return obj2;
    }

    public void A02(Drawable drawable, List list, int i, int i2) {
        if (this instanceof AnonymousClass8BG) {
            AnonymousClass8BG r2 = (AnonymousClass8BG) this;
            int intrinsicWidth = (int) (r2.A00 * ((float) (i - drawable.getIntrinsicWidth())));
            int intrinsicHeight = (int) (r2.A01 * ((float) (i2 - drawable.getIntrinsicHeight())));
            drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
            return;
        }
        Collections.sort(list, new C41283ArO(11));
        int intrinsicWidth2 = (i - drawable.getIntrinsicWidth()) / 2;
        int intrinsicHeight2 = (int) ((((float) i2) * ((C390069qg) this).A00) - ((float) drawable.getIntrinsicHeight()));
        Rect rect = new Rect(intrinsicWidth2, intrinsicHeight2, drawable.getIntrinsicWidth() + intrinsicWidth2, drawable.getIntrinsicHeight() + intrinsicHeight2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect rect2 = (Rect) it.next();
            if (Rect.intersects(rect2, rect)) {
                rect.offset(0, -Math.abs(rect.bottom - rect2.top));
            }
            if (rect.centerY() < i2 / 2) {
                break;
            }
        }
        rect.offset(0, Math.max(rect.top, (i2 - drawable.getIntrinsicHeight()) / 2) - rect.top);
        drawable.setBounds(rect);
    }
}
