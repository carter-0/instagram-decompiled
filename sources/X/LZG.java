package X;

import android.view.View;
import android.widget.AbsListView;

public final class LZG implements AbsListView.RecyclerListener {
    public final /* synthetic */ C61441K7r A00;

    public LZG(C61441K7r k7r) {
        this.A00 = k7r;
    }

    public final void onMovedToScrapHeap(View view) {
        C62936Koo koo = (C62936Koo) DbT.A0o(view);
        koo.A05.removeTextChangedListener(koo.A02);
    }
}
