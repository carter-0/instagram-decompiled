package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3Ap  reason: invalid class name and case insensitive filesystem */
public final class C238113Ap extends C238123Aq implements C238143As {
    public final RecyclerView A00;
    public final RefreshableNestedScrollingParent A01;

    public final void EUW(boolean z) {
    }

    public final void EUY(int i) {
        0nA.A0c(this.A01, 0);
    }

    public final void APL() {
        this.A01.setEnabled(false);
    }

    public final void ARa() {
        this.A01.setEnabled(true);
    }

    public final View CFN() {
        return this.A00;
    }

    public final boolean CaA() {
        return this.A01.isEnabled();
    }

    public final boolean CaY() {
        return this.A01.A0B;
    }

    public final void EaP(boolean z) {
        this.A01.setRefreshing(z);
    }

    public final void EhT(C228252l5 r2) {
        this.A01.A06 = r2;
    }

    public final void Epc(X20 x20, C19763Wf4 wf4) {
        this.A01.setPTRSpinnerListener(wf4);
        wf4.A00.A0D = x20;
    }

    public final void ErF(Runnable runnable) {
        this.A01.A07 = new C238803Dm(this, runnable);
    }

    public final void Ev6() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A01;
        refreshableNestedScrollingParent.A04 = this.A00;
        RefreshableNestedScrollingParent.A00(refreshableNestedScrollingParent, true, true);
    }

    public final void setIsLoading(boolean z) {
        this.A01.setRefreshing(z);
    }

    public final void setUpPTRSpinner(C19763Wf4 wf4) {
        Epc(new IHT(this, this), wf4);
    }

    public C238113Ap(RecyclerView recyclerView, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(recyclerView);
        this.A00 = recyclerView;
        this.A01 = refreshableNestedScrollingParent;
    }
}
