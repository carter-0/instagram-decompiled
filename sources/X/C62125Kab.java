package X;

import android.widget.GridView;

/* renamed from: X.Kab  reason: case insensitive filesystem */
public final class C62125Kab extends C361748gj {
    public final GridView A00;

    public final void A02(int i, int i2) {
        this.A00.smoothScrollBy(0, 0);
    }

    public final int A00() {
        return this.A00.getFirstVisiblePosition();
    }

    public final void A01(int i, int i2) {
        this.A00.setSelection(i);
    }

    public C62125Kab(GridView gridView) {
        super(gridView);
        this.A00 = gridView;
    }
}
