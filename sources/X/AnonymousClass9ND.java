package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;

/* renamed from: X.9ND  reason: invalid class name */
public final class AnonymousClass9ND {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A02 = 0;
    public ArrayList A03 = AnonymousClass7TE.A1C();
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;

    public final int A00() {
        int i;
        int size;
        if (this.A05.A0D) {
            i = this.A03.size() - 1;
            size = -1;
        } else {
            i = 0;
            size = this.A03.size();
        }
        return A05(i, size, false, false, true);
    }

    public final int A01() {
        int size;
        int i;
        if (this.A05.A0D) {
            size = 0;
            i = this.A03.size();
        } else {
            size = this.A03.size() - 1;
            i = -1;
        }
        return A05(size, i, false, false, true);
    }

    public final int A04(int i, int i2) {
        return A05(i, i2, false, true, false);
    }

    public final View A06(int i, int i2) {
        View view = null;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i2 != -1) {
            while (i3 >= 0) {
                View view2 = (View) arrayList.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0D && C252553pI.A06(view2) >= i) {
                    break;
                } else if (staggeredGridLayoutManager.A0D || C252553pI.A06(view2) > i) {
                    if (!view2.hasFocusable()) {
                        break;
                    }
                    i3--;
                    view = view2;
                } else {
                    return view;
                }
            }
        } else {
            int i4 = 0;
            while (i4 < size) {
                View view3 = (View) arrayList.get(i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0D && C252553pI.A06(view3) <= i) || ((!staggeredGridLayoutManager2.A0D && C252553pI.A06(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i4++;
                view = view3;
            }
        }
        return view;
    }

    public AnonymousClass9ND(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public final int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A07();
        return this.A00;
    }

    public final int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A08();
        return this.A01;
    }

    public final int A05(int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        AnonymousClass3BB r8 = this.A05.A07;
        int A06 = r8.A06();
        int A032 = r8.A03();
        int i3 = -1;
        if (i2 > i) {
            i3 = 1;
        }
        while (i != i2) {
            View view = (View) this.A03.get(i);
            int A0D = r8.A0D(view);
            int A08 = r8.A08(view);
            boolean z5 = false;
            if (!z3 ? A0D >= A032 : A0D > A032) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z3 ? A08 > A06 : A08 >= A06) {
                z5 = true;
            }
            if (z4 && z5) {
                if (z) {
                    if (z2) {
                        if (A0D >= A06 && A08 <= A032) {
                        }
                    }
                    if (A0D >= A06 && A08 <= A032) {
                    }
                } else if (z2) {
                }
                return C252553pI.A06(view);
            }
            i += i3;
        }
        return -1;
    }

    public final void A07() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A002;
        int i;
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C339907kM r2 = (C339907kM) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A08(view);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(r2.mViewHolder.getLayoutPosition())) != null && A002.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A00 = i2 + i;
        }
    }

    public final void A08() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A002;
        int i;
        View view = (View) AnonymousClass7TE.A12(this.A03);
        C339907kM r2 = (C339907kM) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A0D(view);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(r2.mViewHolder.getLayoutPosition())) != null && A002.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A01 = i2 - i;
        }
    }

    public final void A09() {
        this.A03.clear();
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A02 = 0;
    }

    public final void A0A() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C339907kM r1 = (C339907kM) view.getLayoutParams();
        r1.A00 = null;
        C249703kE r12 = r1.mViewHolder;
        if (r12.isRemoved() || r12.isUpdated()) {
            this.A02 -= this.A05.A07.A0B(view);
        }
        if (size == 1) {
            this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void A0B() {
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.remove(0);
        C339907kM r1 = (C339907kM) view.getLayoutParams();
        r1.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        C249703kE r12 = r1.mViewHolder;
        if (r12.isRemoved() || r12.isUpdated()) {
            this.A02 -= this.A05.A07.A0B(view);
        }
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void A0C(View view) {
        C339907kM r3 = (C339907kM) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        if (arrayList.size() == 1) {
            this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        C249703kE r1 = r3.mViewHolder;
        if (r1.isRemoved() || r1.isUpdated()) {
            this.A02 += this.A05.A07.A0B(view);
        }
    }

    public final void A0D(View view) {
        C339907kM r3 = (C339907kM) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        if (arrayList.size() == 1) {
            this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        C249703kE r1 = r3.mViewHolder;
        if (r1.isRemoved() || r1.isUpdated()) {
            this.A02 += this.A05.A07.A0B(view);
        }
    }
}
