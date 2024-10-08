package X;

import android.view.View;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8gk  reason: invalid class name and case insensitive filesystem */
public final class C361758gk implements C361768gl {
    public int A00;
    public final C361748gj A01;
    public final List A02 = new ArrayList();
    public final C361668gb A03;
    public final C361688gd A04;

    private final void A00() {
        this.A00 = 0;
        List list = this.A02;
        list.clear();
        int Bom = this.A04.Bom();
        for (int i = 0; i < Bom; i++) {
            list.add(Integer.valueOf(this.A00));
            this.A00 += this.A03.BCw(i);
        }
    }

    public final int BXr(int i, float f) {
        int i2 = (int) (f * ((float) this.A00));
        List list = this.A02;
        int size = list.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i < 0) {
            return 0;
        }
        return ((Number) list.get(i)).intValue() - i2;
    }

    public final int Boo(float f) {
        int binarySearch = Collections.binarySearch(this.A02, Integer.valueOf((int) (f * ((float) this.A00))));
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final float Bq7(int i) {
        ViewGroup viewGroup = this.A01.A00;
        View childAt = viewGroup.getChildAt(0);
        0qQ.A07(childAt);
        int i2 = -childAt.getTop();
        List list = this.A02;
        int size = list.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i < 0) {
            return 0.0f;
        }
        return 0mi.A00(BigDecimal.valueOf((double) (((float) (((Number) list.get(i)).intValue() + i2)) / ((float) (this.A00 - viewGroup.getHeight())))).setScale(5, RoundingMode.HALF_UP).floatValue(), 0.0f, 1.0f);
    }

    public final int Bqq(float f) {
        int binarySearch = Collections.binarySearch(this.A02, Integer.valueOf((int) (f * ((float) this.A00))));
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final boolean CbI() {
        int i = this.A00;
        ViewGroup viewGroup = this.A01.A00;
        if (i <= viewGroup.getHeight() || viewGroup.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    public C361758gk(C361668gb r2, C361748gj r3, C361688gd r4) {
        this.A01 = r3;
        this.A04 = r4;
        this.A03 = r2;
        A00();
    }

    public final void DNm() {
        A00();
    }
}
