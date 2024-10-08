package X;

import android.database.DataSetObserver;

public final class Q6N extends DataSetObserver {
    public final /* synthetic */ Q9E A00;

    public Q6N(Q9E q9e) {
        this.A00 = q9e;
    }

    public final void onChanged() {
        Q9E q9e = this.A00;
        q9e.A06 = true;
        0fE.A00(q9e, -1597326437);
    }

    public final void onInvalidated() {
        Q9E q9e = this.A00;
        q9e.A06 = false;
        0fE.A01(q9e, -1287184389);
    }
}
