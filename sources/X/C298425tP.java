package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5tP  reason: invalid class name and case insensitive filesystem */
public final class C298425tP extends RecyclerView implements 0kz {
    public static final int[] A07 = {0, 0};
    public 02Z A00;
    public C299285us A01 = null;
    public ArrayList A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05;
    public final AnonymousClass03P A06 = new Object();

    private void A01(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        RecyclerView.A0D((MotionEvent) null, this, i, i2);
        this.A05 = true;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C249403jg) it.next()).onScrollStateChanged(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A1B(A07, iArr2, 0, scrollX2, 0, scrollY2, i3);
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
        A01((int[]) null, i3, i4, i5);
    }

    public final void DnO(View view, int i) {
        setIsScrollEnabled(true);
        AnonymousClass03P r0 = this.A06;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A05 = false;
            ArrayList arrayList = this.A02;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C249403jg) it.next()).onScrollStateChanged(this, 0);
                }
            }
        }
    }

    public static C299285us A00(ViewParent viewParent) {
        if (viewParent instanceof View) {
            Object tag = ((View) viewParent).getTag();
            if (tag instanceof C299285us) {
                return (C299285us) tag;
            }
        }
        if (viewParent != null) {
            return A00(viewParent.getParent());
        }
        return null;
    }

    public final void A15(C249403jg r2) {
        ArrayList arrayList = this.A02;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A02 = arrayList;
        }
        arrayList.add(r2);
        super.A15(r2);
    }

    public final void A16(C249403jg r2) {
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            arrayList.remove(r2);
        }
        super.A16(r2);
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
        A1H(iArr, A07, i, i2, i3);
    }

    public final void DTn(View view, View view2, int i, int i2) {
        AnonymousClass03P r1 = this.A06;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        if (!(view2 instanceof C59477JLb)) {
            return false;
        }
        setIsScrollEnabled(false);
        return true;
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A06;
        return r0.A01 | r0.A00;
    }

    public int getScrollState() {
        if (this.A05) {
            return 1;
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isNestedScrollingEnabled() {
        /*
            r4 = this;
            X.5us r1 = r4.A01
            r3 = 0
            if (r1 == 0) goto L_0x001b
            X.3pI r2 = r4.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            r1 = 1
            int r0 = r2.A01
            if (r1 != r0) goto L_0x001a
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x001d
        L_0x001a:
            return r3
        L_0x001b:
            if (r1 == 0) goto L_0x002b
        L_0x001d:
            X.3pI r2 = r4.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x002b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            r1 = 1
            int r0 = r2.A02
            if (r1 == r0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r3 = super.isNestedScrollingEnabled()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298425tP.isNestedScrollingEnabled():boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A04 || !this.A03 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A03;
        if (z2 != z) {
            this.A03 = z;
            if (z2) {
                this.A00 = 03v.A01(this);
            }
            if (this.A03) {
                03v.A0B(this, this.A00);
                this.A00 = null;
                return;
            }
            03v.A0B(this, new C14911UEs(this, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.03P] */
    public C298425tP(Context context) {
        super(context);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = A00(getParent());
        boolean z2 = true;
        if (!canScrollVertically(1) && !canScrollVertically(-1) && !canScrollHorizontally(1) && !canScrollHorizontally(-1)) {
            z2 = false;
        }
        this.A04 = z2;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A1F((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A05 = false;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (super.onTouchEvent(r4) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 2042593405(0x79bf807d, float:1.2429184E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0016
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0016
            boolean r0 = super.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r0 = 235934794(0xe10144a, float:1.775914E-30)
            X.AnonymousClass0fD.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298425tP.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void DTm(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A01(iArr, i3, i4, i5);
    }
}
