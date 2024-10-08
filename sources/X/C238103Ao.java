package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3Ao  reason: invalid class name and case insensitive filesystem */
public abstract class C238103Ao {
    public static C238133Ar A00(ViewGroup viewGroup) {
        C238133Ar r1;
        Object tag = viewGroup.getTag(-1557369111);
        if (tag == null) {
            if (viewGroup instanceof AbsListView) {
                if (viewGroup instanceof RefreshableListView) {
                    r1 = new C14218Try((AbsListView) viewGroup);
                } else {
                    r1 = new C14160Tqw((AbsListView) viewGroup);
                }
            } else if (viewGroup instanceof RecyclerView) {
                ViewParent parent = viewGroup.getParent();
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                if (parent instanceof RefreshableNestedScrollingParent) {
                    r1 = new C238113Ap(recyclerView, (RefreshableNestedScrollingParent) parent);
                } else {
                    r1 = new C238123Aq(recyclerView);
                }
            } else {
                throw new IllegalArgumentException("Trying to wrap a scrollable view that isn't either a RecyclerView or a ListView");
            }
            viewGroup.setTag(-1557369111, r1);
            return r1;
        } else if (tag instanceof C238133Ar) {
            return (C238133Ar) tag;
        } else {
            throw new IllegalStateException("view tag item is not a proxy");
        }
    }
}
