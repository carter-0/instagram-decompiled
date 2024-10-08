package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NLU extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public NLU(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        N4Q n4q;
        int A03 = AnonymousClass0fD.A03(-931255104);
        if (!(view == null || obj == null || !N4Q.A00(6, obj) || (n4q = (N4Q) obj) == null)) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.BottomSheetListHeaderViewBinder.Holder");
            View view2 = ((OAU) tag).A00;
            TextView A0F = C66582MXn.A0F(view2);
            TextView A0R = AnonymousClass7TG.A0R(view2, R.id.subtitle);
            A0F.setText(n4q.A00);
            String str = n4q.A02;
            if (!(str == null && n4q.A01 == null)) {
                A0R.setVisibility(0);
                Number number = (Number) n4q.A01;
                if (number != null) {
                    A0R.setText(number.intValue());
                } else if (str != null) {
                    A0R.setText(str);
                }
            }
        }
        AnonymousClass0fD.A0A(-1780538924, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1120468393);
        LayoutInflater from = LayoutInflater.from(this.A00);
        0qQ.A0A(from);
        0qQ.A0B(from, 0);
        View A0A = DbU.A0A(from, viewGroup, R.layout.reporting_bottom_sheet_list_header_row, false);
        A0A.setTag(new OAU(A0A));
        AnonymousClass0fD.A0A(-1791982402, A03);
        return A0A;
    }
}
