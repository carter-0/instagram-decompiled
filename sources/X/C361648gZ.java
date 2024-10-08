package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.8gZ  reason: invalid class name and case insensitive filesystem */
public class C361648gZ extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public C361648gZ(int i, boolean z) {
        this(z, i, i, i, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r11) {
        int i;
        int i2;
        int i3;
        Integer valueOf;
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        C252553pI r1 = recyclerView.A0D;
        if (r1 instanceof GridLayoutManager) {
            i = ((GridLayoutManager) r1).A00;
        } else if (r1 instanceof StaggeredGridLayoutManager) {
            i = ((StaggeredGridLayoutManager) r1).A06;
        } else {
            return;
        }
        if (i >= 1) {
            int A042 = RecyclerView.A04(view) - this.A02;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C339907kM) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                0qQ.A0C(layoutParams2, C66579MXk.A00(992));
                AnonymousClass9ND r0 = ((C339907kM) layoutParams2).A00;
                if (r0 != null) {
                    i3 = r0.A04;
                }
                i2 = A042 % i;
                int i4 = this.A01;
                int i5 = (i4 * 2) - this.A00;
                rect.left = i4 - ((i5 * i2) / i);
                rect.right = i4 - ((((i - i2) - 1) * i5) / i);
                if (this.A04 && A042 < i) {
                    rect.top = this.A03;
                }
                rect.bottom = this.A03;
            }
            if (layoutParams instanceof C320856t4) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                0qQ.A0C(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                i3 = ((C320856t4) layoutParams3).A00;
            }
            i2 = A042 % i;
            int i42 = this.A01;
            int i52 = (i42 * 2) - this.A00;
            rect.left = i42 - ((i52 * i2) / i);
            rect.right = i42 - ((((i - i2) - 1) * i52) / i);
            rect.top = this.A03;
            rect.bottom = this.A03;
            if (!(i3 == -1 || (valueOf = Integer.valueOf(i3)) == null)) {
                i2 = valueOf.intValue();
                int i422 = this.A01;
                int i522 = (i422 * 2) - this.A00;
                rect.left = i422 - ((i522 * i2) / i);
                rect.right = i422 - ((((i - i2) - 1) * i522) / i);
                rect.top = this.A03;
                rect.bottom = this.A03;
            }
            i2 = A042 % i;
            int i4222 = this.A01;
            int i5222 = (i4222 * 2) - this.A00;
            rect.left = i4222 - ((i5222 * i2) / i);
            rect.right = i4222 - ((((i - i2) - 1) * i5222) / i);
            rect.top = this.A03;
            rect.bottom = this.A03;
        }
    }

    public C361648gZ(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A02 = i4;
    }
}
