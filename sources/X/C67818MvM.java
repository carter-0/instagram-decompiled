package X;

import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.util.List;

/* renamed from: X.MvM  reason: case insensitive filesystem */
public final class C67818MvM extends C231402rc {
    public final /* synthetic */ StickyHeadersLinearLayoutManager A00;

    public C67818MvM(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = stickyHeadersLinearLayoutManager;
    }

    public final void onChanged() {
        int i;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        list.clear();
        Tq8 tq8 = stickyHeadersLinearLayoutManager.A04;
        if (tq8 != null) {
            i = tq8.getItemCount();
        } else {
            i = 0;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            if (C14541Ty1.A00(stickyHeadersLinearLayoutManager.A04, i2)) {
                list.add(Integer.valueOf(i2));
                if (i2 == stickyHeadersLinearLayoutManager.A02) {
                    z = false;
                }
            }
        }
        if (stickyHeadersLinearLayoutManager.A03 != null && z) {
            StickyHeadersLinearLayoutManager.A0F((AnonymousClass3AN) null, stickyHeadersLinearLayoutManager);
        }
    }

    public final void onItemRangeInserted(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size();
        int A01 = StickyHeadersLinearLayoutManager.A01(stickyHeadersLinearLayoutManager, i);
        if (size > 0 && A01 != -1) {
            while (A01 < size) {
                list.set(A01, Integer.valueOf(C51971G9r.A0I(list, A01) + i2));
                A01++;
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (C14541Ty1.A00(stickyHeadersLinearLayoutManager.A04, i)) {
                int A012 = StickyHeadersLinearLayoutManager.A01(stickyHeadersLinearLayoutManager, i);
                Integer valueOf = Integer.valueOf(i);
                if (A012 != -1) {
                    list.add(A012, valueOf);
                } else {
                    list.add(valueOf);
                }
            }
            i++;
        }
    }

    public final void onItemRangeRemoved(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size();
        if (size > 0) {
            boolean z = false;
            int i3 = i + i2;
            int i4 = i3 - 1;
            if (i <= i4) {
                while (true) {
                    int A1J = 0sr.A1J(Integer.valueOf(i4), list, list.size());
                    if (A1J >= 0) {
                        list.remove(Integer.valueOf(A1J));
                        size--;
                        if (A1J == stickyHeadersLinearLayoutManager.A02) {
                            z = true;
                        }
                    }
                    if (i4 == i) {
                        break;
                    }
                    i4--;
                }
            }
            if (stickyHeadersLinearLayoutManager.A03 != null && z) {
                StickyHeadersLinearLayoutManager.A0F((AnonymousClass3AN) null, stickyHeadersLinearLayoutManager);
            }
            int A01 = StickyHeadersLinearLayoutManager.A01(stickyHeadersLinearLayoutManager, i3);
            if (A01 != -1) {
                while (A01 < size) {
                    list.set(A01, Integer.valueOf(-i2));
                    A01++;
                }
            }
        }
    }
}
