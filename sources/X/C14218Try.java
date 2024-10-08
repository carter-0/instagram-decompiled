package X;

import android.view.View;
import android.widget.AbsListView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.Try  reason: case insensitive filesystem */
public final class C14218Try extends C14160Tqw implements C238143As {
    public final AbsListView A00;

    public final void EUW(boolean z) {
        ((RefreshableListView) ((AnonymousClass3DB) this.A00)).A07 = false;
    }

    public final void EUY(int i) {
        ((RefreshableListView) ((AnonymousClass3DB) this.A00)).A00 = 0;
    }

    public final void Epc(X20 x20, C19763Wf4 wf4) {
    }

    public final void APL() {
        ((AnonymousClass3DB) this.A00).APL();
    }

    public final void ARa() {
        ((AnonymousClass3DB) this.A00).ARa();
    }

    public final View CFN() {
        return this.A00;
    }

    public final boolean CaA() {
        return ((RefreshableListView) ((AnonymousClass3DB) this.A00)).A08;
    }

    public final boolean CaY() {
        return ((AnonymousClass3DB) this.A00).CaY();
    }

    public final void EaP(boolean z) {
        ((AnonymousClass3DB) this.A00).setIsLoading(z);
    }

    public final void EhT(C228252l5 r2) {
        ((RefreshableListView) ((AnonymousClass3DB) this.A00)).A04 = r2;
    }

    public final void ErF(Runnable runnable) {
        ((AnonymousClass3DB) this.A00).setupAndEnableRefresh(new WBG(69, runnable, this));
    }

    public final void Ev6() {
        ((AnonymousClass3DB) this.A00).AWI();
    }

    public final void setIsLoading(boolean z) {
        ((AnonymousClass3DB) this.A00).setIsLoading(z);
    }

    public final void setUpPTRSpinner(C19763Wf4 wf4) {
        ((AnonymousClass3DB) this.A00).setUpPTRSpinner(wf4);
    }

    public C14218Try(AbsListView absListView) {
        super(absListView);
        this.A00 = absListView;
    }
}
