package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3BB  reason: invalid class name */
public abstract class AnonymousClass3BB {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public final Rect A01 = new Rect();
    public final C252553pI A02;

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public abstract int A0B(View view);

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract void A0E(int i);

    public static AnonymousClass3BB A00(C252553pI r1, int i) {
        if (i == 0) {
            return new AnonymousClass3BC(r1);
        }
        if (i == 1) {
            return new C238673Cy(r1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int A01() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A07() - this.A00;
    }

    public final int A09(View view) {
        boolean z = this instanceof AnonymousClass3BC;
        C252553pI r1 = this.A02;
        if (z) {
            Rect rect = this.A01;
            r1.A0f(rect, view);
            return rect.right;
        }
        Rect rect2 = this.A01;
        r1.A0f(rect2, view);
        return rect2.bottom;
    }

    public final int A0A(View view) {
        boolean z = this instanceof C238673Cy;
        C252553pI r1 = this.A02;
        if (z) {
            Rect rect = this.A01;
            r1.A0f(rect, view);
            return rect.top;
        }
        Rect rect2 = this.A01;
        r1.A0f(rect2, view);
        return rect2.left;
    }

    public AnonymousClass3BB(C252553pI r2) {
        this.A02 = r2;
    }

    public int A08(View view) {
        return this.A02.A0V(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
