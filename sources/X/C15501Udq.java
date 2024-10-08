package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Udq  reason: case insensitive filesystem */
public final class C15501Udq extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15501Udq(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(1227150176, AnonymousClass0fD.A03(-77554925));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1977195792);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.row_divider_thick, false);
        AnonymousClass0fD.A0A(-945090249, A04);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
