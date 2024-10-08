package X;

import java.util.List;

/* renamed from: X.Jkr  reason: case insensitive filesystem */
public abstract class C60398Jkr extends 2Rw {
    public int A00 = -1;
    public boolean A01 = true;
    public final LMG A02 = new LMG(0);
    public final List A03 = AnonymousClass7TE.A1C();

    public final void A03(int i) {
        int i2;
        KM0 km0 = (KM0) this;
        int i3 = km0.A01;
        if (i < 0 || i >= km0.A03.size()) {
            i2 = -2;
        } else {
            i2 = (i * 2) + 1;
        }
        km0.A01 = i2;
        km0.notifyItemRangeChanged(Math.max(0, i3 - 2), 5);
        int i4 = km0.A01;
        if (i4 != -2) {
            km0.notifyItemRangeChanged(Math.max(0, i4 - 2), 5);
        }
    }

    public final void A04(int i) {
        int i2 = this.A00;
        this.A00 = i;
        if (this.A01) {
            notifyItemChanged(i2);
            notifyItemChanged(this.A00);
        }
    }

    public void A05(int i, int i2) {
        List list = this.A03;
        list.add(i2, list.remove(i));
    }
}
