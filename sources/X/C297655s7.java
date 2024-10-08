package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.5s7  reason: invalid class name and case insensitive filesystem */
public final class C297655s7 implements C250603lj {
    public final Rect A00 = new Rect();
    public final AnonymousClass2xS A01;
    public final WeakReference A02 = new WeakReference((Object) null);

    public C297655s7(AnonymousClass2xS r3) {
        this.A01 = r3;
    }

    public final void ATF(AnonymousClass30Y r15, C252093oY r16) {
        0qQ.A0B(r15, 0);
        C252093oY r0 = r16;
        0qQ.A0B(r0, 1);
        C297645s6 r3 = (C297645s6) r15.A03;
        float CFe = r0.CFe(r15);
        Rect rect = this.A00;
        r0.B9Y(rect, r15);
        int intValue = r0.CEk(r15).intValue();
        if (intValue == 1) {
            this.A01.A03((View) this.A02.get(), r3.A01, r3.A02, CFe, rect.top, rect.left);
        } else if (intValue == 0) {
            AnonymousClass2xS r4 = this.A01;
            1Xj r6 = r3.A01;
            Object obj = r3.A02;
            int i = rect.top;
            int i2 = rect.left;
            int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r4.A04((View) this.A02.get(), r6, obj, CFe, i, i2, false, false, false);
        } else if (intValue == 2) {
            this.A01.A06(r3.A01);
        } else {
            throw new RuntimeException();
        }
    }
}
