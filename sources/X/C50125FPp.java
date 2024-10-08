package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.FPp  reason: case insensitive filesystem */
public final class C50125FPp implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C40499Ad8 A00;

    public C50125FPp(C40499Ad8 ad8) {
        this.A00 = ad8;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        if (adapterView != null) {
            obj = adapterView.getItemAtPosition(i);
        } else {
            obj = null;
        }
        this.A00.D23(obj);
    }
}
