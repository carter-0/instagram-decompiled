package X;

import android.view.View;

/* renamed from: X.05k  reason: invalid class name and case insensitive filesystem */
public abstract class C586905k {
    public final 0hm A00;

    public final boolean A01() {
        Integer num;
        0hm r3 = this.A00;
        View view = r3.A07.mView;
        if (view != null) {
            num = 07A.A00.A01(view);
        } else {
            num = null;
        }
        Integer num2 = r3.A00;
        if (num == num2) {
            return true;
        }
        Integer num3 = AnonymousClass05K.A01;
        if (num == num3 || num2 == num3) {
            return false;
        }
        return true;
    }

    public C586905k(0hm r1) {
        this.A00 = r1;
    }
}
