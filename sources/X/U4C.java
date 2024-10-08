package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class U4C extends BaseAdapter {
    public C18932WDk A00;
    public boolean A01;
    public int A02 = -1;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r5 == r1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r4 = 0
            if (r8 != 0) goto L_0x000b
            android.view.LayoutInflater r1 = r6.A04
            int r0 = r6.A03
            android.view.View r8 = r1.inflate(r0, r9, r4)
        L_0x000b:
            X.WDm r0 = r6.getItem(r7)
            int r5 = r0.getGroupId()
            int r0 = r7 + -1
            if (r0 < 0) goto L_0x0044
            X.WDm r0 = r6.getItem(r0)
            int r1 = r0.getGroupId()
        L_0x001f:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.WDk r0 = r6.A00
            boolean r0 = r0.A0E()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            r0 = 1
            if (r5 != r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.setGroupDividerEnabled(r0)
            r1 = r8
            X.X5f r1 = (X.C20937X5f) r1
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x003c
            r3.setForceShowIcon(r2)
        L_0x003c:
            X.WDm r0 = r6.getItem(r7)
            r1.CN5(r0, r4)
            return r8
        L_0x0044:
            r1 = r5
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U4C.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: A00 */
    public final C18934WDm getItem(int i) {
        ArrayList A032;
        boolean z = this.A05;
        C18932WDk wDk = this.A00;
        if (z) {
            wDk.A04();
            A032 = wDk.A08;
        } else {
            A032 = wDk.A03();
        }
        int i2 = this.A02;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C18934WDm) A032.get(i);
    }

    public final void A01() {
        int i;
        C18932WDk wDk = this.A00;
        C18934WDm wDm = wDk.A04;
        if (wDm != null) {
            wDk.A04();
            ArrayList arrayList = wDk.A08;
            int size = arrayList.size();
            i = 0;
            while (true) {
                if (i < size) {
                    if (arrayList.get(i) == wDm) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            this.A02 = i;
        }
        i = -1;
        this.A02 = i;
    }

    public final int getCount() {
        ArrayList A032;
        boolean z = this.A05;
        C18932WDk wDk = this.A00;
        if (z) {
            wDk.A04();
            A032 = wDk.A08;
        } else {
            A032 = wDk.A03();
        }
        int i = this.A02;
        int size = A032.size();
        if (i >= 0) {
            return size - 1;
        }
        return size;
    }

    public U4C(LayoutInflater layoutInflater, C18932WDk wDk, int i, boolean z) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A00 = wDk;
        this.A03 = i;
        A01();
    }

    public final void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
