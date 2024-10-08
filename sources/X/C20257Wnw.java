package X;

import android.widget.AbsListView;
import androidx.fragment.app.Fragment;

/* renamed from: X.Wnw  reason: case insensitive filesystem */
public final class C20257Wnw implements Runnable {
    public final /* synthetic */ AbsListView A00;
    public final /* synthetic */ Fragment A01;

    public C20257Wnw(AbsListView absListView, Fragment fragment) {
        this.A01 = fragment;
        this.A00 = absListView;
    }

    public final void run() {
        if (this.A01.mView != null) {
            AbsListView absListView = this.A00;
            absListView.smoothScrollBy(0, 0);
            absListView.setSelection(0);
        }
    }
}
