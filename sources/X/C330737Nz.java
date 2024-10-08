package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;

/* renamed from: X.7Nz  reason: invalid class name and case insensitive filesystem */
public final class C330737Nz {
    public RecyclerView A00;
    public ViewTreeObserver.OnDrawListener A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public final AnonymousClass7UN A03;

    public C330737Nz(AnonymousClass7UN r2) {
        0qQ.A0B(r2, 1);
        this.A03 = r2;
    }

    public final void A02(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, Set set, boolean z) {
        0qQ.A0B(set, 2);
        if (!recyclerView.isLaidOut() || !z || !A00(linearLayoutManager, this, set)) {
            this.A00 = recyclerView;
            this.A02 = new AnonymousClass7O2(linearLayoutManager, this, set);
            this.A01 = new AnonymousClass7O3(this);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
            recyclerView.getViewTreeObserver().addOnDrawListener(this.A01);
        }
    }

    public final void A01() {
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A02);
            viewTreeObserver.removeOnDrawListener(this.A01);
            this.A02 = null;
            this.A01 = null;
            this.A00 = null;
        }
    }

    public static final boolean A00(LinearLayoutManager linearLayoutManager, C330737Nz r8, Set set) {
        2Rw r1;
        AnonymousClass7UN r2;
        StringBuilder sb;
        String str;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        RecyclerView recyclerView = r8.A00;
        if (!(recyclerView == null || (r1 = recyclerView.A0A) == null)) {
            int itemCount = r1.getItemCount();
            if (A1a < 0 || A1b < 0 || A1a >= itemCount || A1b >= itemCount) {
                r2 = r8.A03;
                sb = new StringBuilder();
                sb.append("FirstVisibleItemPosition : ");
                sb.append(A1a);
                sb.append(", LastVisibleItemPosition : ");
                sb.append(A1b);
                str = ", AdapterNumViews : ";
            } else {
                itemCount = 0;
                if (A1a <= A1b) {
                    while (true) {
                        if (set.contains(Integer.valueOf(r1.getItemViewType(A1a)))) {
                            itemCount++;
                        }
                        if (A1a == A1b) {
                            break;
                        }
                        A1a++;
                    }
                    if (itemCount > 0) {
                        return r8.A03.DMX(itemCount);
                    }
                }
                r2 = r8.A03;
                sb = new StringBuilder();
                str = "visibleItemOfGivenTypeCount : ";
            }
            sb.append(str);
            sb.append(itemCount);
            r2.DMK(sb.toString());
        }
        return false;
    }
}
