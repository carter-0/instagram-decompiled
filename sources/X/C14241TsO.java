package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;

/* renamed from: X.TsO  reason: case insensitive filesystem */
public final class C14241TsO implements SpinnerAdapter {
    public final SpinnerAdapter A00;
    public final /* synthetic */ TriangleSpinner A01;

    public C14241TsO(SpinnerAdapter spinnerAdapter, TriangleSpinner triangleSpinner) {
        this.A01 = triangleSpinner;
        this.A00 = spinnerAdapter;
    }

    public final int getCount() {
        return this.A00.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.A00.getDropDownView(i, view, viewGroup);
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

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TriangleSpinner triangleSpinner = this.A01;
        if (!(triangleSpinner.A00 == null && triangleSpinner.A01 == null)) {
            i = triangleSpinner.getSelectedItemPosition();
        }
        return this.A00.getView(i, view, viewGroup);
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

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterDataSetObserver(dataSetObserver);
    }
}
