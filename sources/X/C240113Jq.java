package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.List;

/* renamed from: X.3Jq  reason: invalid class name and case insensitive filesystem */
public abstract class C240113Jq {
    public static final boolean A06(C252553pI r4, RecyclerView recyclerView, int i) {
        View A0X;
        int A03 = A03(r4, recyclerView, i);
        if (!(A03 == -1 || (A0X = r4.A0X(A03)) == null)) {
            boolean A10 = r4.A10(A0X, true);
            if (Boolean.valueOf(A10) != null) {
                return A10;
            }
        }
        return false;
    }

    public static final int A00(C252553pI r9) {
        int i;
        int size;
        if (r9 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r9).A1c();
        }
        if (r9 instanceof FlowingGridLayoutManager) {
            return ((FlowingGridLayoutManager) r9).A1a();
        }
        if (r9 instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r9;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i2 = 0; i2 < staggeredGridLayoutManager.A06; i2++) {
                AnonymousClass9ND r3 = staggeredGridLayoutManager.A0H[i2];
                if (r3.A05.A0D) {
                    i = r3.A03.size() - 1;
                    size = -1;
                } else {
                    i = 0;
                    size = r3.A03.size();
                }
                iArr[i2] = r3.A05(i, size, true, true, false);
            }
            return iArr[0];
        }
        throw A04(r9);
    }

    public static final int A01(C252553pI r6) {
        int A04;
        if (r6 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r6).A1a();
        }
        if (r6 instanceof FlowingGridLayoutManager) {
            return ((FlowingGridLayoutManager) r6).A1b();
        }
        if (r6 instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r6;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                AnonymousClass9ND r3 = staggeredGridLayoutManager.A0H[i];
                boolean z = r3.A05.A0D;
                int size = r3.A03.size();
                if (z) {
                    A04 = r3.A04(size - 1, -1);
                } else {
                    A04 = r3.A04(0, size);
                }
                iArr[i] = A04;
            }
            return iArr[0];
        } else if (r6 == null) {
            throw new IllegalStateException("Required value was null.");
        } else {
            throw A04(r6);
        }
    }

    public static final int A02(C252553pI r6) {
        int A04;
        if (r6 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r6).A1b();
        }
        if (r6 instanceof FlowingGridLayoutManager) {
            return ((FlowingGridLayoutManager) r6).A1c();
        }
        if (r6 instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r6;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                AnonymousClass9ND r3 = staggeredGridLayoutManager.A0H[i];
                boolean z = r3.A05.A0D;
                int size = r3.A03.size();
                if (z) {
                    A04 = r3.A04(0, size);
                } else {
                    A04 = r3.A04(size - 1, -1);
                }
                iArr[i] = A04;
            }
            return iArr[0];
        }
        throw A04(r6);
    }

    public static final int A03(C252553pI r1, RecyclerView recyclerView, int i) {
        if (r1 instanceof LinearLayoutManager) {
            int A1a = i - ((LinearLayoutManager) r1).A1a();
            if (A1a < 0 || A1a >= recyclerView.getChildCount()) {
                return -1;
            }
            return A1a;
        } else if (r1 instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) r1;
            if (flowingGridLayoutManager.A0U() == 0) {
                return -1;
            }
            List list = flowingGridLayoutManager.A07;
            if (list.isEmpty()) {
                return -1;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((Number) list.get(i2)).intValue() == i) {
                    return i2;
                }
            }
            return -1;
        } else {
            throw A04(r1);
        }
    }

    public static final IllegalArgumentException A04(C252553pI r2) {
        String str;
        Class<?> cls;
        if (r2 == null || (cls = r2.getClass()) == null) {
            str = null;
        } else {
            str = cls.getCanonicalName();
        }
        return new IllegalArgumentException(002.A0R("Unsupported LayoutManager: ", str));
    }

    public static final void A05(C252553pI r2, int i, int i2) {
        if (r2 instanceof LinearLayoutManager) {
            ((LinearLayoutManager) r2).A1p(i, i2);
        } else if (r2 instanceof FlowingGridLayoutManager) {
            ((FlowingGridLayoutManager) r2).A1e(i, i2);
        } else if (r2 instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r2;
            StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.A0A;
            if (savedState != null) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
            }
            staggeredGridLayoutManager.A03 = i;
            staggeredGridLayoutManager.A04 = i2;
            staggeredGridLayoutManager.A0b();
        } else {
            throw A04(r2);
        }
    }
}
