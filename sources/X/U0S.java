package X;

import android.database.DataSetObserver;

public final class U0S extends DataSetObserver {
    public final /* synthetic */ WDV A00;

    public U0S(WDV wdv) {
        this.A00 = wdv;
    }

    public final void onChanged() {
        WDV wdv = this.A00;
        if (wdv.A09.isShowing()) {
            wdv.show();
        }
    }

    public final void onInvalidated() {
        this.A00.dismiss();
    }
}
