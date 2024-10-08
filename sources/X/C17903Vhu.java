package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: X.Vhu  reason: case insensitive filesystem */
public final class C17903Vhu {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ StaggeredGridLayoutManager A06;

    public final void A00() {
        this.A01 = -1;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A03 = false;
        this.A02 = false;
        this.A04 = false;
        int[] iArr = this.A05;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public C17903Vhu(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.A06 = staggeredGridLayoutManager;
        A00();
    }
}
