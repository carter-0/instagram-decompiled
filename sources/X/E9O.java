package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E9O extends C231632rz {
    public Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-964101937);
        DbU.A0G(view, R.id.header_title).setText((String) obj);
        AnonymousClass0fD.A0A(-1591462193, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(461782892);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.direct_simple_header_text);
        AnonymousClass0fD.A0A(1035457189, A03);
        return A0C;
    }
}
