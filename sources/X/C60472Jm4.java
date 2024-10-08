package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.Jm4  reason: case insensitive filesystem */
public final class C60472Jm4 extends C249403jg {
    public boolean A00;
    public final int A01;
    public final C252553pI A02;
    public final MT9 A03;

    public C60472Jm4(C252553pI r1, MT9 mt9, int i) {
        this.A02 = r1;
        this.A01 = i;
        this.A03 = mt9;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D = AnonymousClass7TG.A0D(recyclerView, 603089439);
        super.onScrollStateChanged(recyclerView, i);
        AnonymousClass0fD.A0A(-1011640206, A0D);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int A04;
        int A032 = AnonymousClass0fD.A03(-639366420);
        C252553pI r8 = this.A02;
        int A0U = r8.A0U();
        if ((r8 instanceof LinearLayoutManager) || (r8 instanceof GridLayoutManager)) {
            i4 = ((LinearLayoutManager) r8).A1b();
        } else if (r8 instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r8;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i5 = 0; i5 < staggeredGridLayoutManager.A06; i5++) {
                AnonymousClass9ND r3 = staggeredGridLayoutManager.A0H[i5];
                boolean z = r3.A05.A0D;
                int size = r3.A03.size();
                if (z) {
                    A04 = r3.A04(0, size);
                } else {
                    A04 = r3.A04(size - 1, -1);
                }
                iArr[i5] = A04;
            }
            i4 = 0;
            for (int i6 : iArr) {
                if (i6 > i4) {
                    i4 = i6;
                }
            }
        } else {
            0wb.A03("RecyclerViewPaginationScrollListener", "Unsupported layout manager");
            i3 = 1686701446;
            AnonymousClass0fD.A0A(i3, A032);
        }
        if (!this.A00 && i4 + this.A01 > A0U) {
            this.A00 = true;
            this.A03.CgO();
        }
        i3 = -1985980458;
        AnonymousClass0fD.A0A(i3, A032);
    }
}
