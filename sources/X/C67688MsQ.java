package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

/* renamed from: X.MsQ  reason: case insensitive filesystem */
public final class C67688MsQ extends BaseAdapter implements Filterable {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        return ((ONB) this.A00.get(i)).A01(this.A01, this.A02, view, viewGroup, i);
    }

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(3).length;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Filter getFilter() {
        return new C67689MsT(this);
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public final int getItemViewType(int i) {
        switch (((ONB) this.A00.get(i)).A02().intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    public final boolean isEnabled(int i) {
        return ((ONB) this.A00.get(i)).A03();
    }

    public C67688MsQ(Context context, 0sn r3) {
        this.A01 = context;
        this.A00 = r3 == null ? 0sn.A00 : r3;
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        this.A02 = from;
    }
}
