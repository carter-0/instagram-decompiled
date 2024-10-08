package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.List;

public final class U4F extends BaseAdapter {
    public C19857Wgj A00;
    public final DataSetObserver A01;
    public final ListAdapter A02;
    public final C60048JeG A03;

    public final long getItemId(int i) {
        return 0;
    }

    public final int A00(String str) {
        if (str == null) {
            return 0;
        }
        int count = this.A02.getCount();
        C60048JeG jeG = this.A03;
        int i = 0;
        while (true) {
            List list = jeG.A00;
            if (i < list.size()) {
                String id = DbZ.A0T(list, i).getId();
                id.getClass();
                if (id.equals(str)) {
                    return count + i;
                }
                i++;
            } else {
                throw DbW.A0c("Could not find media with id ", str);
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return this.A00.A02;
    }

    public final int getCount() {
        return this.A00.A00;
    }

    public final Object getItem(int i) {
        int i2;
        C19857Wgj wgj = this.A00;
        int A002 = C378349Pl.A00(wgj, i);
        Adapter adapter = (Adapter) wgj.A03.get(A002);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = wgj.A04[A002 - 1];
        }
        Object item = adapter.getItem(i - i2);
        if (item != null) {
            return item;
        }
        throw C13989Tnp.A0k("cannot find item at position ", i);
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        C19857Wgj wgj = this.A00;
        int A002 = C378349Pl.A00(wgj, i);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = wgj.A05[A002 - 1];
        }
        Adapter adapter = (Adapter) wgj.A03.get(A002);
        if (A002 == 0) {
            i3 = 0;
        } else {
            i3 = wgj.A04[A002 - 1];
        }
        return i2 + adapter.getItemViewType(i - i3);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        C19857Wgj wgj = this.A00;
        int A002 = C378349Pl.A00(wgj, i);
        Adapter adapter = (Adapter) wgj.A03.get(A002);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = wgj.A04[A002 - 1];
        }
        View view2 = adapter.getView(i - i2, view, viewGroup);
        if (view2 != null) {
            return view2;
        }
        throw C13989Tnp.A0k("cannot get view for position: ", i);
    }

    public final int getViewTypeCount() {
        return this.A00.A01;
    }

    public final boolean isEnabled(int i) {
        int i2;
        C19857Wgj wgj = this.A00;
        int A002 = C378349Pl.A00(wgj, i);
        ListAdapter listAdapter = (ListAdapter) wgj.A03.get(A002);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = wgj.A04[A002 - 1];
        }
        return listAdapter.isEnabled(i - i2);
    }

    public final void notifyDataSetChanged() {
        this.A00.A00();
        super.notifyDataSetChanged();
    }

    public U4F(C63591Kze kze, AnonymousClass0iw r7, List list) {
        this();
        C60048JeG jeG = new C60048JeG(kze, r7, list);
        this.A03 = jeG;
        C60047JeF jeF = new C60047JeF(kze);
        this.A02 = jeF;
        ListAdapter[] listAdapterArr = {jeF, jeG};
        if (this.A00 == null) {
            int i = 0;
            do {
                listAdapterArr[i].registerDataSetObserver(this.A01);
                i++;
            } while (i < 2);
            this.A00 = new C19857Wgj(listAdapterArr);
            return;
        }
        throw new RuntimeException("Section adapter should only be initialized once.");
    }

    public U4F() {
        this.A01 = new C46665Diu(this, 1);
    }
}
