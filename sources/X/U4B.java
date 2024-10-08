package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class U4B extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ WDT A01;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            WDT wdt = this.A01;
            view = wdt.A02.inflate(wdt.A00, viewGroup, false);
        }
        ((C20937X5f) view).CN5(getItem(i), 0);
        return view;
    }

    public U4B(WDT wdt) {
        this.A01 = wdt;
        A01();
    }

    /* renamed from: A00 */
    public final C18934WDm getItem(int i) {
        C18932WDk wDk = this.A01.A05;
        wDk.A04();
        ArrayList arrayList = wDk.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C18934WDm) arrayList.get(i);
    }

    public final void A01() {
        int i;
        C18932WDk wDk = this.A01.A05;
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
            this.A00 = i;
        }
        i = -1;
        this.A00 = i;
    }

    public final int getCount() {
        C18932WDk wDk = this.A01.A05;
        wDk.A04();
        int size = wDk.A08.size();
        if (this.A00 >= 0) {
            return size - 1;
        }
        return size;
    }

    public final void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
