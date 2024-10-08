package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class K9M extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1008057769);
        View findViewById = view.findViewById(R.id.product_cross_tagging_message);
        findViewById.getClass();
        ((TextView) findViewById).setText(AnonymousClass7TE.A0M(obj));
        AnonymousClass0fD.A0A(-61840677, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1222199464);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_product_cross_tagging);
        AnonymousClass0fD.A0A(422769401, A03);
        return A0C;
    }
}
