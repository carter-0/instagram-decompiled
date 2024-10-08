package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3AC  reason: invalid class name */
public final class AnonymousClass3AC implements AnonymousClass3AD {
    public RefreshableNestedScrollingParent A00;

    public final void Eou(int i) {
    }

    public final void setIsLoading(boolean z) {
        EaL(z, false);
    }

    public final void APL() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setEnabled(false);
        }
    }

    public final void ARa() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setEnabled(true);
        }
    }

    public final void EaL(boolean z, boolean z2) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            if (z && z2) {
                RefreshableNestedScrollingParent.A00(refreshableNestedScrollingParent, true, true);
            }
            refreshableNestedScrollingParent.setRefreshing(z);
        }
    }

    public final boolean isLoading() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent == null) {
            return false;
        }
        return refreshableNestedScrollingParent.A0B;
    }
}
