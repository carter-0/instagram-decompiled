package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Aj  reason: invalid class name and case insensitive filesystem */
public final class C238053Aj {
    public int A00 = 0;
    public View A01;
    public final C238063Ak A02;
    public final AnonymousClass3Ai A03;
    public final List A04;

    private int A00(int i) {
        if (i >= 0) {
            int childCount = ((C238043Ah) this.A03).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                C238063Ak r1 = this.A02;
                int A012 = i - (i2 - r1.A01(i2));
                if (A012 != 0) {
                    i2 += A012;
                } else {
                    while (r1.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void A01(View view, C238053Aj r2) {
        r2.A04.add(view);
        C238043Ah r0 = (C238043Ah) r2.A03;
        C249703kE A06 = RecyclerView.A06(view);
        if (A06 != null) {
            A06.onEnteredHiddenState(r0.A00);
        }
    }

    public static void A02(View view, C238053Aj r2) {
        if (r2.A04.remove(view)) {
            C238043Ah r0 = (C238043Ah) r2.A03;
            C249703kE A06 = RecyclerView.A06(view);
            if (A06 != null) {
                A06.onLeftHiddenState(r0.A00);
            }
        }
    }

    public final int A03() {
        return ((C238043Ah) this.A03).A00.getChildCount() - this.A04.size();
    }

    public final int A04() {
        return ((C238043Ah) this.A03).A00.getChildCount();
    }

    public final int A05(View view) {
        int indexOfChild = ((C238043Ah) this.A03).A00.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        C238063Ak r1 = this.A02;
        if (!r1.A06(indexOfChild)) {
            return indexOfChild - r1.A01(indexOfChild);
        }
        return -1;
    }

    public final View A07(int i) {
        return ((C238043Ah) this.A03).A00.getChildAt(i);
    }

    /* JADX INFO: finally extract failed */
    public final void A09(int i) {
        int i2 = this.A00;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i2 != 2) {
            try {
                int A002 = A00(i);
                RecyclerView recyclerView = ((C238043Ah) this.A03).A00;
                View childAt = recyclerView.getChildAt(A002);
                if (childAt != null) {
                    this.A00 = 1;
                    this.A01 = childAt;
                    if (this.A02.A07(A002)) {
                        A02(childAt, this);
                    }
                    View childAt2 = recyclerView.getChildAt(A002);
                    if (childAt2 != null) {
                        recyclerView.A0y(childAt2);
                        childAt2.clearAnimation();
                    }
                    recyclerView.removeViewAt(A002);
                }
                this.A00 = 0;
                this.A01 = null;
            } catch (Throwable th) {
                this.A00 = 0;
                this.A01 = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public final void A0A(View view, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((C238043Ah) this.A03).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A02.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        RecyclerView recyclerView = ((C238043Ah) this.A03).A00;
        recyclerView.addView(view, A002);
        C249703kE A06 = RecyclerView.A06(view);
        2Rw r0 = recyclerView.A0A;
        if (!(r0 == null || A06 == null)) {
            r0.onViewAttachedToWindow(A06);
        }
        List list = recyclerView.A0L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C2366234l) recyclerView.A0L.get(size)).D1l(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A0B(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((C238043Ah) this.A03).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A02.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        C238043Ah r3 = (C238043Ah) this.A03;
        C249703kE A06 = RecyclerView.A06(view);
        if (A06 != null) {
            if (A06.isTmpDetached() || A06.shouldIgnore()) {
                A06.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(A06);
                sb.append(r3.A00.A0a());
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (RecyclerView.A1C) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(A002);
            sb2.append(r3.A00.A0a());
            throw new IllegalArgumentException(sb2.toString());
        }
        r3.A00.attachViewToParent(view, A002, layoutParams);
    }

    public final String toString() {
        return 002.A0b(this.A02.toString(), ", hidden list:", this.A04.size());
    }

    public C238053Aj(AnonymousClass3Ai r2) {
        this.A03 = r2;
        this.A02 = new C238063Ak();
        this.A04 = new ArrayList();
    }

    public final View A06(int i) {
        return ((C238043Ah) this.A03).A00.getChildAt(A00(i));
    }

    public final void A08(int i) {
        int A002 = A00(i);
        this.A02.A07(A002);
        RecyclerView recyclerView = ((C238043Ah) this.A03).A00;
        View childAt = recyclerView.getChildAt(A002);
        if (childAt != null) {
            C249703kE A06 = RecyclerView.A06(childAt);
            if (A06 != null) {
                if (!A06.isTmpDetached() || A06.shouldIgnore()) {
                    A06.addFlags(256);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(A06);
                    sb.append(recyclerView.A0a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        } else if (RecyclerView.A1C) {
            throw new IllegalArgumentException(002.A0c("No view at offset ", recyclerView.A0a(), A002));
        }
        recyclerView.detachViewFromParent(A002);
    }
}
