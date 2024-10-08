package X;

import android.widget.Adapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wgj  reason: case insensitive filesystem */
public final class C19857Wgj implements AnonymousClass8AZ {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public final List A03 = new ArrayList();
    public final int[] A04 = new int[2];
    public final int[] A05 = new int[2];

    public final void A00() {
        boolean z;
        int[] iArr = this.A04;
        List list = this.A03;
        iArr[0] = ((Adapter) list.get(0)).getCount();
        int[] iArr2 = this.A05;
        iArr2[0] = ((Adapter) list.get(0)).getViewTypeCount();
        this.A02 = true;
        for (int i = 1; i < list.size(); i++) {
            ListAdapter listAdapter = (ListAdapter) list.get(i);
            if (this.A02) {
                z = true;
                if (listAdapter.areAllItemsEnabled()) {
                    this.A02 = z;
                    int i2 = i - 1;
                    iArr[i] = iArr[i2] + listAdapter.getCount();
                    iArr2[i] = iArr2[i2] + listAdapter.getViewTypeCount();
                }
            }
            z = false;
            this.A02 = z;
            int i22 = i - 1;
            iArr[i] = iArr[i22] + listAdapter.getCount();
            iArr2[i] = iArr2[i22] + listAdapter.getViewTypeCount();
        }
        this.A00 = iArr[DbT.A02(list, 1)];
        this.A01 = iArr2[DbT.A02(list, 1)];
    }

    public final int AZP() {
        return this.A03.size();
    }

    public final int[] Ath() {
        return this.A04;
    }

    public C19857Wgj(ListAdapter... listAdapterArr) {
        int i = 0;
        do {
            this.A03.add(listAdapterArr[i]);
            i++;
        } while (i < 2);
        A00();
    }
}
