package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/* renamed from: X.4G7  reason: invalid class name */
public final class AnonymousClass4G7 implements C255993v3 {
    public final Adapter A00;

    public final void EC1(AnonymousClass3TD r2) {
        0qQ.A0B(r2, 0);
        this.A00.registerDataSetObserver(r2);
    }

    public final void FJ4(AnonymousClass3TD r2) {
        0qQ.A0B(r2, 0);
        this.A00.unregisterDataSetObserver(r2);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        View view2 = this.A00.getView(i, view, viewGroup);
        0qQ.A07(view2);
        return view2;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        this.A00.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        this.A00.unregisterDataSetObserver(dataSetObserver);
    }

    public final CharSequence[] getAutofillOptions() {
        return this.A00.getAutofillOptions();
    }

    public final int getCount() {
        return this.A00.getCount();
    }

    public final Object getItem(int i) {
        return this.A00.getItem(i);
    }

    public final long getItemId(int i) {
        return this.A00.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return this.A00.getItemViewType(i);
    }

    public final int getViewTypeCount() {
        return this.A00.getViewTypeCount();
    }

    public final boolean hasStableIds() {
        return this.A00.hasStableIds();
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public AnonymousClass4G7(Adapter adapter) {
        this.A00 = adapter;
    }
}
