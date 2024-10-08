package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.2te  reason: invalid class name and case insensitive filesystem */
public final class C232402te extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(1813323881, AnonymousClass0fD.A03(-292764307));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1865577853);
        0qQ.A0B(viewGroup, 1);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jest_e2e_end_of_feed_indicator, viewGroup, false);
        inflate.setMinimumHeight(10);
        AnonymousClass0fD.A0A(1004605354, A03);
        return inflate;
    }
}
