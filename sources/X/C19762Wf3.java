package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.ui.widget.expanding.ExpandingListView;

/* renamed from: X.Wf3  reason: case insensitive filesystem */
public final class C19762Wf3 implements AnonymousClass3AD {
    public ExpandingListView A00;

    public final void Eou(int i) {
    }

    public final void APL() {
        this.A00.APL();
    }

    public final void ARa() {
        this.A00.ARa();
    }

    public final void EaL(boolean z, boolean z2) {
        if (z && z2) {
            this.A00.AWI();
        }
        this.A00.setIsLoading(z);
    }

    public final boolean isLoading() {
        return this.A00.CaY();
    }

    public final void setIsLoading(boolean z) {
        this.A00.setIsLoading(z);
    }

    public C19762Wf3(View view, AnonymousClass3AB r5) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.expandinglistview_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        ExpandingListView expandingListView = (ExpandingListView) view.requireViewById(16908298);
        this.A00 = expandingListView;
        expandingListView.setupAndEnableRefresh(new WBE(26, (Object) this, (Object) r5));
    }
}
