package X;

import android.view.View;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.AgZ  reason: case insensitive filesystem */
public final class C40659AgZ implements C361768gl {
    public int A00;
    public int A01;
    public int A02;
    public final C361688gd A03;
    public final C361748gj A04;

    public C40659AgZ(C361748gj r4, C361688gd r5, int i, int i2) {
        this.A04 = r4;
        this.A03 = r5;
        if (r5.Bom() > 0) {
            this.A01 = i;
        }
        if (i2 > 0) {
            this.A00 = i2;
        } else if (r5.Bom() > 1) {
            this.A00 = i;
        }
        if (r5.Bom() > 2) {
            this.A02 = i;
        }
    }

    private final int A00() {
        return ((this.A01 + (this.A02 * (this.A03.Bom() - 2))) + this.A00) - this.A04.A00.getHeight();
    }

    private final int A01(int i) {
        int i2 = this.A01;
        int i3 = this.A02;
        C361688gd r1 = this.A03;
        if (i >= i2 + (i3 * (r1.Bom() - 2))) {
            return r1.Bom() - 1;
        }
        int i4 = this.A01;
        if (i < i4) {
            return 0;
        }
        return ((i - i4) / this.A02) + 1;
    }

    public final float Bq7(int i) {
        View childAt = this.A04.A00.getChildAt(0);
        0qQ.A07(childAt);
        int i2 = -childAt.getTop();
        int i3 = 1;
        int i4 = this.A01 * (AnonymousClass7TF.A1R(i) ? 1 : 0);
        int i5 = this.A02;
        int i6 = 0;
        if (i > 0) {
            i6 = i - 1;
        }
        int i7 = i5 * i6;
        int i8 = this.A00;
        if (i <= this.A03.Bom()) {
            i3 = 0;
        }
        return C229632nm.A01(BigDecimal.valueOf((double) (((float) (((i4 + i7) + (i8 * i3)) + i2)) / ((float) A00()))).setScale(5, RoundingMode.HALF_UP).floatValue());
    }

    public final int Bqq(float f) {
        return A01((int) (f * ((float) (this.A01 + (this.A02 * (this.A03.Bom() - 2)) + this.A00))));
    }

    public final boolean CbI() {
        int Bom = this.A01 + (this.A02 * (this.A03.Bom() - 2)) + this.A00;
        ViewGroup viewGroup = this.A04.A00;
        if (Bom <= viewGroup.getHeight() || viewGroup.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    public final void DNm() {
        C361688gd r3 = this.A03;
        if (r3.Bom() == 0) {
            this.A01 = 0;
        }
        if (r3.Bom() <= 1) {
            this.A00 = 0;
        }
        if (r3.Bom() <= 2) {
            this.A02 = 0;
        }
    }

    public final int BXr(int i, float f) {
        int A002 = (int) (f * ((float) A00()));
        int i2 = 1;
        int i3 = this.A01 * (AnonymousClass7TF.A1R(i) ? 1 : 0);
        int i4 = this.A02;
        int i5 = 0;
        if (i > 0) {
            i5 = i - 1;
        }
        int i6 = i4 * i5;
        int i7 = this.A00;
        if (i <= this.A03.Bom()) {
            i2 = 0;
        }
        return ((i3 + i6) + (i7 * i2)) - A002;
    }

    public final int Boo(float f) {
        return A01((int) (f * ((float) A00())));
    }
}
