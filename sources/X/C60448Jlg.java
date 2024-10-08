package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlg  reason: case insensitive filesystem */
public final class C60448Jlg extends C231402rc {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C60448Jlg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onItemRangeInserted(int i, int i2) {
        RecyclerView recyclerView;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                if (i == 0 && i2 > 0 && (recyclerView = ((C59713JUw) this.A02).A01) != null) {
                    runnable = new C59828Ja3((Fragment) this.A01);
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                recyclerView = ((C65521Luk) this.A02).A02;
                if (recyclerView != null) {
                    runnable = new C65914M4d((Fragment) this.A01);
                    break;
                } else {
                    return;
                }
            default:
                if (i == 0) {
                    ((C252553pI) this.A02).A1O(0);
                    return;
                }
                return;
        }
        recyclerView.post(runnable);
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        if (2 - this.A00 != 0) {
            super.onItemRangeMoved(i, i2, i3);
        } else if (i == 0 || i2 == 0) {
            ((C252553pI) this.A02).A1O(0);
        }
    }

    public final void onItemRangeRemoved(int i, int i2) {
        if (2 - this.A00 != 0) {
            super.onItemRangeRemoved(i, i2);
        } else if (i == 0) {
            ((C252553pI) this.A02).A1O(0);
        }
    }
}
