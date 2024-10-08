package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.3pI  reason: invalid class name and case insensitive filesystem */
public abstract class C252553pI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C238053Aj A05;
    public AnonymousClass52T A06;
    public RecyclerView A07;
    public AnonymousClass3B7 A08;
    public AnonymousClass3B7 A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F = false;
    public final AnonymousClass3B5 A0G;
    public final AnonymousClass3B5 A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252553pI.A04(int, int, int, int, boolean):int");
    }

    public View A0Y(View view, int i) {
        return null;
    }

    public final void A0h(View view, int i) {
        A0A(view, this, i, false);
    }

    public void A0j(View view, int i, int i2) {
        AnonymousClass3MX r6 = (AnonymousClass3MX) view.getLayoutParams();
        Rect A0T = this.A07.A0T(view);
        int i3 = 0 + A0T.left + A0T.right;
        int i4 = 0 + A0T.top + A0T.bottom;
        int A042 = A04(this.A03, this.A04, Ba9() + BaB() + r6.leftMargin + r6.rightMargin + i3, r6.width, A1X());
        int A043 = A04(this.A00, this.A01, BaC() + Ba8() + r6.topMargin + r6.bottomMargin + i4, r6.height, A1Y());
        if (A0z(view, r6, A042, A043)) {
            view.measure(A042, A043);
        }
    }

    @Deprecated
    public void A0u(RecyclerView recyclerView) {
    }

    @Deprecated
    public void A0v(boolean z) {
        this.A0A = true;
    }

    public void A1C(RecyclerView recyclerView) {
    }

    public View A1E(View view, AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        return null;
    }

    public boolean A1I() {
        return false;
    }

    public boolean A1J() {
        return false;
    }

    public int A1K(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        return 0;
    }

    public int A1L(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        return 0;
    }

    public Parcelable A1M() {
        return null;
    }

    public void A1P(Parcelable parcelable) {
    }

    public void A1Q(2Rw r1, 2Rw r2) {
    }

    public abstract void A1R(AnonymousClass3AN r1, AnonymousClass3AW r2);

    public void A1S(AnonymousClass3AW r1) {
    }

    public void A1U(RecyclerView recyclerView) {
    }

    public void A1V(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1W(RecyclerView recyclerView, int i, int i2) {
    }

    public boolean A1X() {
        return false;
    }

    public abstract boolean A1Y();

    public boolean A1Z(AnonymousClass3MX r2) {
        return r2 != null;
    }

    public final int A0T() {
        C238053Aj r0 = this.A05;
        if (r0 != null) {
            return r0.A03();
        }
        return 0;
    }

    public final int A0U() {
        2Rw r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0A) == null) {
            return 0;
        }
        return r0.getItemCount();
    }

    public final View A0X(int i) {
        C238053Aj r0 = this.A05;
        if (r0 != null) {
            return r0.A06(i);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.3MX, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.3MX, X.6t4] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3MX A0Z() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 != 0) goto L_0x0065
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0034
            r1 = r3
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            boolean r0 = r1 instanceof com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat
            if (r0 == 0) goto L_0x0017
            r1 = -1
            r0 = -2
            X.3MX r2 = new X.3MX
            r2.<init>((int) r1, (int) r0)
            return r2
        L_0x0017:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x0065
            int r0 = r1.A01
            if (r0 != 0) goto L_0x002c
            r0 = -2
            r1 = -1
            X.6t4 r2 = new X.6t4
            r2.<init>((int) r0, (int) r1)
        L_0x0026:
            r2.A00 = r1
            r0 = 0
            r2.A01 = r0
            return r2
        L_0x002c:
            r1 = -1
            r0 = -2
            X.6t4 r2 = new X.6t4
            r2.<init>((int) r1, (int) r0)
            goto L_0x0026
        L_0x0034:
            boolean r0 = r3 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r0 == 0) goto L_0x0054
            r0 = -2
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r2 = new com.google.android.flexbox.FlexboxLayoutManager$LayoutParams
            r2.<init>((int) r0, (int) r0)
            r0 = 0
            r2.A01 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A02 = r0
            r0 = -1
            r2.A03 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A00 = r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2.A05 = r0
            r2.A04 = r0
            return r2
        L_0x0054:
            r0 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            int r2 = r0.A02
            r1 = -1
            r0 = -2
            if (r2 != 0) goto L_0x005f
            r1 = -2
            r0 = -1
        L_0x005f:
            X.7kM r2 = new X.7kM
            r2.<init>((int) r1, (int) r0)
            return r2
        L_0x0065:
            r0 = -2
            X.3MX r2 = new X.3MX
            r2.<init>((int) r0, (int) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252553pI.A0Z():X.3MX");
    }

    public final void A0b() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0c(int i) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (i == 0) {
                staggeredGridLayoutManager.A1i();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0g(View view) {
        C238053Aj r5 = this.A05;
        int i = r5.A00;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i != 2) {
            try {
                r5.A00 = 1;
                r5.A01 = view;
                RecyclerView recyclerView = ((C238043Ah) r5.A03).A00;
                int indexOfChild = recyclerView.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (r5.A02.A07(indexOfChild)) {
                        C238053Aj.A02(view, r5);
                    }
                    View childAt = recyclerView.getChildAt(indexOfChild);
                    if (childAt != null) {
                        recyclerView.A0y(childAt);
                        childAt.clearAnimation();
                    }
                    recyclerView.removeViewAt(indexOfChild);
                }
                r5.A00 = 0;
                r5.A01 = null;
            } catch (Throwable th) {
                r5.A00 = 0;
                r5.A01 = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public final void A0k(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0T(view));
        }
    }

    public void A0m(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass3AN r11, AnonymousClass3AW r12) {
        AccessibilityNodeInfo.CollectionItemInfo obtain;
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C320856t4)) {
                gridLayoutManager.A0l(view, accessibilityNodeInfoCompat);
                return;
            }
            C320856t4 r1 = (C320856t4) layoutParams;
            int A002 = GridLayoutManager.A00(gridLayoutManager, r11, r12, r1.mViewHolder.getLayoutPosition());
            int i = gridLayoutManager.A01;
            int i2 = r1.A00;
            int i3 = r1.A01;
            if (i == 0) {
                obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, A002, 1, false, false);
            } else {
                obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(A002, 1, i2, i3, false, false);
            }
            accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(obtain);
        }
    }

    public final void A0p(AnonymousClass3AN r8) {
        ArrayList arrayList = r8.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C249703kE) arrayList.get(i)).itemView;
            C249703kE A062 = RecyclerView.A06(view);
            if (!A062.shouldIgnore()) {
                A062.setIsRecyclable(false);
                if (A062.isTmpDetached()) {
                    this.A07.removeDetachedView(view, false);
                }
                AnonymousClass3AS r0 = this.A07.A0C;
                if (r0 != null) {
                    r0.A0K(A062);
                }
                A062.setIsRecyclable(true);
                C249703kE A063 = RecyclerView.A06(view);
                A063.mScrapContainer = null;
                A063.mInChangeScrap = false;
                A063.clearReturnedFromScrapFlag();
                r8.A0C(A063);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0r(AnonymousClass3AN r2, AnonymousClass3AW r3, int i, int i2) {
        this.A07.A0s(i, i2);
    }

    public void A0s(AnonymousClass3AN r4, RecyclerView recyclerView) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            staggeredGridLayoutManager.A0u(recyclerView);
            Runnable runnable = staggeredGridLayoutManager.A0M;
            RecyclerView recyclerView2 = staggeredGridLayoutManager.A07;
            if (recyclerView2 != null) {
                recyclerView2.removeCallbacks(runnable);
            }
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                staggeredGridLayoutManager.A0H[i].A09();
            }
            recyclerView.requestLayout();
            return;
        }
        A0u(recyclerView);
    }

    public final void A0t(AnonymousClass52T r6) {
        AnonymousClass52T r1 = this.A06;
        if (!(r1 == null || r6 == r1 || !r1.A05)) {
            r1.A02();
        }
        this.A06 = r6;
        RecyclerView recyclerView = this.A07;
        AnonymousClass3AT r12 = recyclerView.mViewFlinger;
        r12.A06.removeCallbacks(r12);
        r12.A01.abortAnimation();
        if (r6.A06) {
            String simpleName = r6.getClass().getSimpleName();
            Log.w("RecyclerView", 002.A11("An instance of ", simpleName, " was started more than once. Each instance of", simpleName, " is intended to only be used once. You should create a new instance for each use."));
        }
        r6.A03 = recyclerView;
        r6.A02 = this;
        int i = r6.A00;
        if (i != -1) {
            recyclerView.mState.A06 = i;
            r6.A05 = true;
            r6.A04 = true;
            r6.A01 = recyclerView.A0D.A1D(i);
            r6.A01();
            r6.A03.mViewFlinger.A00();
            r6.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void A0w(boolean z) {
        if (z != this.A0C) {
            this.A0C = z;
            this.A02 = 0;
            RecyclerView recyclerView = this.A07;
            if (recyclerView != null) {
                recyclerView.A0y.A08();
            }
        }
    }

    public boolean A0y(Bundle bundle, AnonymousClass3AN r9, AnonymousClass3AW r10, int i) {
        int i2;
        int i3;
        int i4;
        if (this.A07 != null) {
            int i5 = this.A00;
            int i6 = this.A03;
            Rect rect = new Rect();
            if (this.A07.getMatrix().isIdentity() && this.A07.getGlobalVisibleRect(rect)) {
                i5 = rect.height();
                i6 = rect.width();
            }
            if (i == 4096) {
                if (this.A07.canScrollVertically(1)) {
                    i4 = (i5 - BaC()) - Ba8();
                } else {
                    i4 = 0;
                }
                if (this.A07.canScrollHorizontally(1)) {
                    i3 = (i6 - Ba9()) - BaB();
                }
                i3 = 0;
            } else if (i == 8192) {
                if (this.A07.canScrollVertically(-1)) {
                    i2 = -((i5 - BaC()) - Ba8());
                } else {
                    i2 = 0;
                }
                if (this.A07.canScrollHorizontally(-1)) {
                    i3 = -((i6 - Ba9()) - BaB());
                }
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.A07.A0z((Interpolator) null, i3, i2, AnonymousClass972.MUTABLE_FLAG_MASK, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.A09.A01(r3) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A10(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            X.3B7 r0 = r2.A08
            boolean r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x0011
            X.3B7 r0 = r2.A09
            boolean r1 = r0.A01(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r4 != 0) goto L_0x0016
            r0 = r0 ^ 1
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252553pI.A10(android.view.View, boolean):boolean");
    }

    public int A11(AnonymousClass3AW r8) {
        AnonymousClass3AW r5 = r8;
        if (this instanceof LinearLayoutManager) {
            return LinearLayoutManager.A0J((LinearLayoutManager) this, r8);
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0E(r8, (FlexboxLayoutManager) this);
        }
        if (!(this instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
        if (staggeredGridLayoutManager.A0T() == 0) {
            return 0;
        }
        AnonymousClass3BB r3 = staggeredGridLayoutManager.A07;
        boolean z = staggeredGridLayoutManager.A0F;
        boolean z2 = !z;
        return C266524Zi.A00(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), r3, staggeredGridLayoutManager, r5, z);
    }

    public int A12(AnonymousClass3AW r3) {
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            boolean z = linearLayoutManager instanceof GridLayoutManager;
            GridLayoutManager gridLayoutManager = linearLayoutManager;
            if (z) {
                GridLayoutManager gridLayoutManager2 = (GridLayoutManager) linearLayoutManager;
                boolean z2 = gridLayoutManager2.A03;
                gridLayoutManager = gridLayoutManager2;
                if (z2) {
                    return GridLayoutManager.A01(gridLayoutManager2, r3);
                }
            }
            return LinearLayoutManager.A0K(gridLayoutManager, r3);
        } else if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0F(r3, (FlexboxLayoutManager) this);
        } else {
            if (this instanceof StaggeredGridLayoutManager) {
                return StaggeredGridLayoutManager.A0D(r3, (StaggeredGridLayoutManager) this);
            }
            return 0;
        }
    }

    public int A13(AnonymousClass3AW r8) {
        AnonymousClass3AW r5 = r8;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            boolean z = linearLayoutManager instanceof GridLayoutManager;
            GridLayoutManager gridLayoutManager = linearLayoutManager;
            if (z) {
                GridLayoutManager gridLayoutManager2 = (GridLayoutManager) linearLayoutManager;
                boolean z2 = gridLayoutManager2.A03;
                gridLayoutManager = gridLayoutManager2;
                if (z2) {
                    return GridLayoutManager.A02(gridLayoutManager2, r8);
                }
            }
            return LinearLayoutManager.A0L(gridLayoutManager, r8);
        } else if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0G(r8, (FlexboxLayoutManager) this);
        } else {
            if (!(this instanceof StaggeredGridLayoutManager)) {
                return 0;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() == 0) {
                return 0;
            }
            AnonymousClass3BB r3 = staggeredGridLayoutManager.A07;
            boolean z3 = staggeredGridLayoutManager.A0F;
            boolean z4 = !z3;
            return C266524Zi.A01(staggeredGridLayoutManager.A1f(z4), staggeredGridLayoutManager.A1e(z4), r3, staggeredGridLayoutManager, r5, z3);
        }
    }

    public int A14(AnonymousClass3AW r8) {
        AnonymousClass3AW r5 = r8;
        if (this instanceof LinearLayoutManager) {
            return LinearLayoutManager.A0J((LinearLayoutManager) this, r8);
        }
        if (this instanceof FlowingGridLayoutManager) {
            if (r8.A00() != 0) {
                return this.A00;
            }
            return 0;
        } else if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0E(r8, (FlexboxLayoutManager) this);
        } else {
            if (!(this instanceof StaggeredGridLayoutManager)) {
                return 0;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() == 0) {
                return 0;
            }
            AnonymousClass3BB r3 = staggeredGridLayoutManager.A07;
            boolean z = staggeredGridLayoutManager.A0F;
            boolean z2 = !z;
            return C266524Zi.A00(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), r3, staggeredGridLayoutManager, r5, z);
        }
    }

    public int A15(AnonymousClass3AW r3) {
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            boolean z = linearLayoutManager instanceof GridLayoutManager;
            GridLayoutManager gridLayoutManager = linearLayoutManager;
            if (z) {
                GridLayoutManager gridLayoutManager2 = (GridLayoutManager) linearLayoutManager;
                boolean z2 = gridLayoutManager2.A03;
                gridLayoutManager = gridLayoutManager2;
                if (z2) {
                    return GridLayoutManager.A01(gridLayoutManager2, r3);
                }
            }
            return LinearLayoutManager.A0K(gridLayoutManager, r3);
        } else if (this instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) this;
            if (r3.A00() != 0) {
                return flowingGridLayoutManager.A04;
            }
            return 0;
        } else if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0F(r3, (FlexboxLayoutManager) this);
        } else {
            if (this instanceof StaggeredGridLayoutManager) {
                return StaggeredGridLayoutManager.A0D(r3, (StaggeredGridLayoutManager) this);
            }
            return 0;
        }
    }

    public int A16(AnonymousClass3AW r8) {
        Rect A002;
        AnonymousClass3AW r5 = r8;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            boolean z = linearLayoutManager instanceof GridLayoutManager;
            GridLayoutManager gridLayoutManager = linearLayoutManager;
            if (z) {
                GridLayoutManager gridLayoutManager2 = (GridLayoutManager) linearLayoutManager;
                boolean z2 = gridLayoutManager2.A03;
                gridLayoutManager = gridLayoutManager2;
                if (z2) {
                    return GridLayoutManager.A02(gridLayoutManager2, r8);
                }
            }
            return LinearLayoutManager.A0L(gridLayoutManager, r8);
        } else if (this instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) this;
            if (r8.A00() == 0) {
                return 0;
            }
            C14323Tu0 tu0 = flowingGridLayoutManager.A06;
            int size = tu0.A07.size();
            int A003 = r8.A00();
            if (size < A003 || (A002 = tu0.A00(A003 - 1)) == null) {
                return 0;
            }
            return A002.top;
        } else if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A0G(r8, (FlexboxLayoutManager) this);
        } else {
            if (!(this instanceof StaggeredGridLayoutManager)) {
                return 0;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() == 0) {
                return 0;
            }
            AnonymousClass3BB r3 = staggeredGridLayoutManager.A07;
            boolean z3 = staggeredGridLayoutManager.A0F;
            boolean z4 = !z3;
            return C266524Zi.A01(staggeredGridLayoutManager.A1f(z4), staggeredGridLayoutManager.A1e(z4), r3, staggeredGridLayoutManager, r5, z3);
        }
    }

    public void A17(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass3AN r8, AnonymousClass3AW r9) {
        int i;
        int i2;
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
        }
        boolean z = this instanceof GridLayoutManager;
        if (z) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            if (gridLayoutManager.A01 == 0) {
                i = gridLayoutManager.A00;
            } else {
                int A002 = r9.A00();
                if (A002 < 1) {
                    i = 0;
                } else {
                    i = GridLayoutManager.A00(gridLayoutManager, r8, r9, A002 - 1) + 1;
                }
            }
        } else {
            i = -1;
        }
        if (z) {
            GridLayoutManager gridLayoutManager2 = (GridLayoutManager) this;
            if (gridLayoutManager2.A01 == 1) {
                i2 = gridLayoutManager2.A00;
            } else {
                int A003 = r9.A00();
                if (A003 < 1) {
                    i2 = 0;
                } else {
                    i2 = GridLayoutManager.A00(gridLayoutManager2, r8, r9, A003 - 1) + 1;
                }
            }
        } else {
            i2 = -1;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
    }

    public AnonymousClass3MX A18(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AnonymousClass3MX) {
            return new AnonymousClass3MX((AnonymousClass3MX) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass3MX((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass3MX(layoutParams);
    }

    public void A19(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A08.A06(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A1A(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A08.A06(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A1F(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            2Rw r0 = this.A07.A0A;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.getItemCount());
            }
        }
    }

    public void A1G(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A17(str);
        }
    }

    public boolean A1H() {
        if (!(this instanceof StaggeredGridLayoutManager)) {
            return this.A0A;
        }
        if (((StaggeredGridLayoutManager) this).A01 != 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass3MX A1N(Context context, AttributeSet attributeSet) {
        return new AnonymousClass3MX(context, attributeSet);
    }

    public void A1O(int i) {
        if (RecyclerView.A1D) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    public void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int Ba8() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int Ba9() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int BaB() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int BaC() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public C252553pI() {
        AnonymousClass3B4 r2 = new AnonymousClass3B4(this);
        this.A0G = r2;
        AnonymousClass3B6 r1 = new AnonymousClass3B6(this);
        this.A0H = r1;
        this.A08 = new AnonymousClass3B7(r2);
        this.A09 = new AnonymousClass3B7(r1);
    }

    public static int A03(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            return Math.max(i2, i3);
        }
        return size;
    }

    public static final int A05(View view) {
        return ((AnonymousClass3MX) view.getLayoutParams()).A02.left;
    }

    public static final int A06(View view) {
        return ((AnonymousClass3MX) view.getLayoutParams()).mViewHolder.getLayoutPosition();
    }

    public static final int A07(View view) {
        return ((AnonymousClass3MX) view.getLayoutParams()).A02.right;
    }

    public static final void A08(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void A09(View view, int i, int i2, int i3, int i4) {
        AnonymousClass3MX r2 = (AnonymousClass3MX) view.getLayoutParams();
        Rect rect = r2.A02;
        view.layout(i + rect.left + r2.leftMargin, i2 + rect.top + r2.topMargin, (i3 - rect.right) - r2.rightMargin, (i4 - rect.bottom) - r2.bottomMargin);
    }

    public static void A0A(View view, C252553pI r8, int i, boolean z) {
        C249703kE A062 = RecyclerView.A06(view);
        if (z || A062.isRemoved()) {
            r8.A07.A10.A02(A062);
        } else {
            r8.A07.A10.A03(A062);
        }
        AnonymousClass3MX r5 = (AnonymousClass3MX) view.getLayoutParams();
        if (A062.wasReturnedFromScrap() || A062.mScrapContainer != null) {
            if (A062.mScrapContainer != null) {
                A062.unScrap();
            } else {
                A062.clearReturnedFromScrapFlag();
            }
            r8.A05.A0B(view, view.getLayoutParams(), i, false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = r8.A07;
            C238053Aj r0 = r8.A05;
            if (parent == recyclerView) {
                int A052 = r0.A05(view);
                if (i == -1) {
                    i = r8.A05.A03();
                }
                if (A052 == -1) {
                    throw new IllegalStateException(002.A0c("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:", r8.A07.A0a(), r8.A07.indexOfChild(view)));
                } else if (A052 != i) {
                    C252553pI r2 = r8.A07.A0D;
                    View A0X = r2.A0X(A052);
                    if (A0X != null) {
                        r2.A0X(A052);
                        r2.A05.A08(A052);
                        r2.A0i(A0X, i);
                    } else {
                        throw new IllegalArgumentException(002.A0c("Cannot move a child from non-existing index:", r2.A07.toString(), A052));
                    }
                }
            } else {
                r0.A0A(view, i, false);
                r5.A00 = true;
                AnonymousClass52T r22 = r8.A06;
                if (r22 != null && r22.A05 && RecyclerView.A04(view) == r22.A00) {
                    r22.A01 = view;
                }
            }
        }
        if (r5.A01) {
            A062.itemView.invalidate();
            r5.A01 = false;
        }
    }

    public static boolean A0B(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public final int A0V(View view) {
        return view.getBottom() + ((AnonymousClass3MX) view.getLayoutParams()).A02.bottom;
    }

    public final int A0W(View view) {
        return view.getTop() - ((AnonymousClass3MX) view.getLayoutParams()).A02.top;
    }

    public final void A0a() {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T >= 0) {
                this.A05.A09(A0T);
            } else {
                return;
            }
        }
    }

    public final void A0d(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0) {
            float f = RecyclerView.A1E;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0) {
            float f2 = RecyclerView.A1E;
        }
    }

    public final void A0e(int i, int i2) {
        int A0T = A0T();
        if (A0T == 0) {
            this.A07.A0s(i, i2);
            return;
        }
        int i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i4 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0T; i7++) {
            View A0X = A0X(i7);
            Rect rect = this.A07.A0u;
            RecyclerView.A0E(A0X, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0u.set(i5, i6, i3, i4);
        A1B(this.A07.A0u, i, i2);
    }

    public final void A0f(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A0i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C249703kE A062 = RecyclerView.A06(view);
        boolean isRemoved = A062.isRemoved();
        AnonymousClass3AO r0 = this.A07.A10;
        if (isRemoved) {
            r0.A02(A062);
        } else {
            r0.A03(A062);
        }
        this.A05.A0B(view, layoutParams, i, A062.isRemoved());
    }

    public final void A0l(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C249703kE A062 = RecyclerView.A06(view);
        if (A062 != null && !A062.isRemoved()) {
            C238053Aj r0 = this.A05;
            if (!r0.A04.contains(A062.itemView)) {
                RecyclerView recyclerView = this.A07;
                A0m(view, accessibilityNodeInfoCompat, recyclerView.A0y, recyclerView.mState);
            }
        }
    }

    public final void A0n(AnonymousClass3AN r5) {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T >= 0) {
                View A0X = A0X(A0T);
                C249703kE A062 = RecyclerView.A06(A0X);
                if (!A062.shouldIgnore()) {
                    if (!A062.isInvalid() || A062.isRemoved() || this.A07.A0A.hasStableIds()) {
                        A0X(A0T);
                        this.A05.A08(A0T);
                        r5.A0B(A0X);
                        this.A07.A10.A03(A062);
                    } else {
                        if (A0X(A0T) != null) {
                            this.A05.A09(A0T);
                        }
                        r5.A0C(A062);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void A0o(AnonymousClass3AN r3) {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T < 0) {
                return;
            }
            if (!RecyclerView.A06(A0X(A0T)).shouldIgnore()) {
                A0q(r3, A0T);
            }
        }
    }

    public final void A0q(AnonymousClass3AN r3, int i) {
        View A0X = A0X(i);
        if (A0X(i) != null) {
            this.A05.A09(i);
        }
        r3.A0A(A0X);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
        if ((r1.bottom - r5) > r7) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0x(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            int r3 = r11.Ba9()
            int r4 = r11.BaC()
            int r2 = r11.A03
            int r0 = r11.BaB()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.Ba8()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r8 = r13.getTop()
            int r0 = r12.top
            int r8 = r8 + r0
            int r0 = r13.getScrollY()
            int r8 = r8 - r0
            int r7 = r12.width()
            int r7 = r7 + r9
            int r0 = r12.height()
            int r0 = r0 + r8
            int r9 = r9 - r3
            r6 = 0
            int r3 = java.lang.Math.min(r6, r9)
            int r8 = r8 - r4
            int r5 = java.lang.Math.min(r6, r8)
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r6, r7)
            int r0 = r0 - r1
            int r1 = java.lang.Math.max(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            r4 = 1
            if (r0 != r4) goto L_0x00ac
            if (r2 != 0) goto L_0x005c
            int r2 = java.lang.Math.max(r3, r7)
        L_0x005c:
            if (r5 != 0) goto L_0x0062
            int r5 = java.lang.Math.min(r8, r1)
        L_0x0062:
            int[] r0 = new int[]{r2, r5}
            r3 = r0[r6]
            if (r16 == 0) goto L_0x00a2
            android.view.View r10 = r14.getFocusedChild()
            if (r10 == 0) goto L_0x00a1
            int r8 = r11.Ba9()
            int r7 = r11.BaC()
            int r9 = r11.A03
            int r0 = r11.BaB()
            int r9 = r9 - r0
            int r2 = r11.A00
            int r0 = r11.Ba8()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0u
            androidx.recyclerview.widget.RecyclerView.A0E(r10, r1)
            int r0 = r1.left
            int r0 = r0 - r3
            if (r0 >= r9) goto L_0x00a1
            int r0 = r1.right
            int r0 = r0 - r3
            if (r0 <= r8) goto L_0x00a1
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L_0x00a1
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r7) goto L_0x00a2
        L_0x00a1:
            return r6
        L_0x00a2:
            if (r3 != 0) goto L_0x00a6
            if (r5 == 0) goto L_0x00a1
        L_0x00a6:
            if (r15 == 0) goto L_0x00b4
            r14.scrollBy(r3, r5)
            return r4
        L_0x00ac:
            if (r3 != 0) goto L_0x00b2
            int r3 = java.lang.Math.min(r9, r2)
        L_0x00b2:
            r2 = r3
            goto L_0x005c
        L_0x00b4:
            r14.A0u(r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252553pI.A0x(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public final boolean A0z(View view, AnonymousClass3MX r4, int i, int i2) {
        if (view.isLayoutRequested() || !this.A0D || !A0B(view.getWidth(), i, r4.width) || !A0B(view.getHeight(), i2, r4.height)) {
            return true;
        }
        return false;
    }

    public void A1B(Rect rect, int i, int i2) {
        int width = rect.width() + Ba9() + BaB();
        int height = rect.height() + BaC() + Ba8();
        this.A07.setMeasuredDimension(A03(i, width, this.A07.getMinimumWidth()), A03(i2, height, this.A07.getMinimumHeight()));
    }

    public View A1D(int i) {
        int A0T = A0T();
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0X = A0X(i2);
            C249703kE A062 = RecyclerView.A06(A0X);
            if (A062 != null && A062.getLayoutPosition() == i && !A062.shouldIgnore() && (this.A07.mState.A08 || !A062.isRemoved())) {
                return A0X;
            }
        }
        return null;
    }
}
