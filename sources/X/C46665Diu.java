package X;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

/* renamed from: X.Diu  reason: case insensitive filesystem */
public final class C46665Diu extends DataSetObserver {
    public final int A00;
    public final Object A01;

    public C46665Diu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onChanged() {
        switch (this.A00) {
            case 0:
                C49703F2o f2o = (C49703F2o) this.A01;
                f2o.A00(f2o.A03, f2o.A04.getItemCount());
                return;
            case 1:
                0fE.A00((BaseAdapter) this.A01, -1492474824);
                return;
            default:
                UFM ufm = (UFM) this.A01;
                C46665Diu.super.notifyDataSetChanged();
                ufm.A00.notifyChanged();
                return;
        }
    }

    public final void onInvalidated() {
        if (2 - this.A00 != 0) {
            super.onInvalidated();
        } else {
            ((UFM) this.A01).A00.notifyInvalidated();
        }
    }
}
