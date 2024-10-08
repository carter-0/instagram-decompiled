package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.WPp  reason: case insensitive filesystem */
public final class C19209WPp implements C308256Ti {
    public RefreshableNestedScrollingParent A00;
    public boolean A01;

    public final boolean EOz(C307786Rm r3, Object obj, int i) {
        if (i != 38) {
            return false;
        }
        boolean A012 = Q0A.A01(obj);
        this.A01 = A012;
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent == null) {
            return true;
        }
        refreshableNestedScrollingParent.setRefreshing(A012);
        return true;
    }
}
