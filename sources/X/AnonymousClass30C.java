package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.30C  reason: invalid class name */
public final class AnonymousClass30C implements C250603lj {
    public final Rect A00 = new Rect();
    public final AnonymousClass2xS A01;
    public final WeakReference A02 = new WeakReference((Object) null);

    public AnonymousClass30C(AnonymousClass2xS r3) {
        this.A01 = r3;
    }

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        Object obj = r14.A03;
        0qQ.A06(obj);
        1Xj r5 = (1Xj) obj;
        float CFe = r15.CFe(r14);
        Rect rect = this.A00;
        r15.B9Y(rect, r14);
        int intValue = r15.CEk(r14).intValue();
        if (intValue == 1) {
            this.A01.A03((View) this.A02.get(), r5, r5, CFe, rect.top, rect.left);
        } else if (intValue == 0) {
            AnonymousClass2xS r3 = this.A01;
            int i = rect.top;
            int i2 = rect.left;
            int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r3.A04((View) this.A02.get(), r5, r5, CFe, i, i2, false, false, false);
        } else if (intValue == 2) {
            this.A01.A06(r5);
        }
    }
}
