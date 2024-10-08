package X;

import android.widget.ListView;

public final class Us9 extends C361748gj {
    public final ListView A00;

    public final void A02(int i, int i2) {
        this.A00.smoothScrollBy(0, 0);
    }

    public final int A00() {
        return this.A00.getFirstVisiblePosition();
    }

    public final void A01(int i, int i2) {
        this.A00.setSelectionFromTop(i, i2);
    }

    public Us9(ListView listView) {
        super(listView);
        this.A00 = listView;
    }
}
