package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.75f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3260575f implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C3260475e A00;

    public /* synthetic */ C3260575f(C3260475e r1) {
        this.A00 = r1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        C3260475e r1 = this.A00;
        if (adapterView != null) {
            obj = adapterView.getItemAtPosition(i);
        } else {
            obj = null;
        }
        r1.D23(obj);
    }
}
