package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.3Ac  reason: invalid class name and case insensitive filesystem */
public final class C238003Ac implements C238013Ad {
    public final /* synthetic */ RecyclerView A00;

    public C238003Ac(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void A00(C241543Pp r6) {
        C252553pI r3;
        int i;
        int i2;
        int i3 = r6.A00;
        if (i3 == 1) {
            RecyclerView recyclerView = this.A00;
            recyclerView.A0D.A1V(recyclerView, r6.A02, r6.A01);
        } else if (i3 != 2) {
            int i4 = 4;
            if (i3 != 4) {
                i4 = 8;
                if (i3 == 8) {
                    r3 = this.A00.A0D;
                    i = r6.A02;
                    i2 = r6.A01;
                    if (r3 instanceof FlexboxLayoutManager) {
                        FlexboxLayoutManager.A0R((FlexboxLayoutManager) r3, Math.min(i, i2));
                        return;
                    } else if (r3 instanceof FlowingGridLayoutManager) {
                        ((FlowingGridLayoutManager) r3).A06.A00 = 0;
                        return;
                    } else {
                        if (!(r3 instanceof StaggeredGridLayoutManager)) {
                            if (!(r3 instanceof GridLayoutManager)) {
                                return;
                            }
                        }
                        StaggeredGridLayoutManager.A0K((StaggeredGridLayoutManager) r3, i, i2, i4);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                r3 = this.A00.A0D;
                i = r6.A02;
                i2 = r6.A01;
                if (!(r3 instanceof GridLayoutManager)) {
                    if (r3 instanceof FlexboxLayoutManager) {
                        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) r3;
                        if (flexboxLayoutManager != null) {
                            FlexboxLayoutManager.A0R(flexboxLayoutManager, i);
                        }
                        FlexboxLayoutManager.A0R(flexboxLayoutManager, i);
                        return;
                    } else if (r3 instanceof FlowingGridLayoutManager) {
                        ((FlowingGridLayoutManager) r3).A06.A01(i);
                        return;
                    } else {
                        if (!(r3 instanceof StaggeredGridLayoutManager)) {
                            return;
                        }
                        StaggeredGridLayoutManager.A0K((StaggeredGridLayoutManager) r3, i, i2, i4);
                        return;
                    }
                }
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) r3;
            gridLayoutManager.A01.A02.clear();
            gridLayoutManager.A01.A01.clear();
        } else {
            RecyclerView recyclerView2 = this.A00;
            recyclerView2.A0D.A1W(recyclerView2, r6.A02, r6.A01);
        }
    }

    public final void Cm8(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        C238053Aj r7 = recyclerView.A08;
        int A04 = r7.A04();
        int i5 = i + i2;
        for (int i6 = 0; i6 < A04; i6++) {
            View A07 = r7.A07(i6);
            C249703kE A06 = RecyclerView.A06(A07);
            if (A06 != null && !A06.shouldIgnore() && (i4 = A06.mPosition) >= i && i4 < i5) {
                A06.addFlags(2);
                A06.addChangePayload(obj);
                ((AnonymousClass3MX) A07.getLayoutParams()).A00 = true;
            }
        }
        AnonymousClass3AN r4 = recyclerView.A0y;
        ArrayList arrayList = r4.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C249703kE r1 = (C249703kE) arrayList.get(size);
                if (r1 != null && (i3 = r1.mPosition) >= i && i3 < i5) {
                    r1.addFlags(2);
                    r4.A09(size);
                }
            } else {
                recyclerView.A0V = true;
                return;
            }
        }
    }

    public final void Csm(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        C238053Aj r4 = recyclerView.A08;
        int A04 = r4.A04();
        for (int i3 = 0; i3 < A04; i3++) {
            C249703kE A06 = RecyclerView.A06(r4.A07(i3));
            if (A06 != null && !A06.shouldIgnore() && A06.mPosition >= i) {
                A06.offsetPosition(i2, false);
                recyclerView.mState.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0y.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C249703kE r1 = (C249703kE) arrayList.get(i4);
            if (r1 != null && r1.mPosition >= i) {
                r1.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0U = true;
    }

    public final void Csn(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.A00;
        C238053Aj r10 = recyclerView.A08;
        int A04 = r10.A04();
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (i < i2) {
            i6 = -1;
            i5 = i;
            i4 = i2;
        }
        for (int i7 = 0; i7 < A04; i7++) {
            C249703kE A06 = RecyclerView.A06(r10.A07(i7));
            if (A06 != null && (i3 = A06.mPosition) >= i5 && i3 <= i4) {
                if (i3 == i) {
                    A06.offsetPosition(i2 - i, false);
                } else {
                    A06.offsetPosition(i6, false);
                }
                recyclerView.mState.A0C = true;
            }
        }
        AnonymousClass3AN r0 = recyclerView.A0y;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        if (i < i2) {
            i8 = -1;
            i10 = i;
            i9 = i2;
        }
        ArrayList arrayList = r0.A06;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C249703kE r1 = (C249703kE) arrayList.get(i11);
            if (r1 != null && r1.mPosition >= i10 && r1.mPosition <= i9) {
                if (r1.mPosition == i) {
                    r1.offsetPosition(i2 - i, false);
                } else {
                    r1.offsetPosition(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0U = true;
    }
}
