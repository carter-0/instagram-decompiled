package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class NLT extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public NLT(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C61072JwA jwA;
        int A03 = AnonymousClass0fD.A03(-435472866);
        if (!(view == null || obj == null || !C61072JwA.A00(24, obj) || (jwA = (C61072JwA) obj) == null)) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.BottomSheetHeadlineViewBinder.Holder");
            IgdsHeadline A0O = C66584MXp.A0O(((OAT) tag).A00);
            A0O.setHeadline(jwA.A01);
            Number number = (Number) jwA.A02;
            if (number != null) {
                A0O.setBody(number.intValue());
            }
        }
        AnonymousClass0fD.A0A(-1496187299, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1531599388);
        LayoutInflater from = LayoutInflater.from(this.A00);
        0qQ.A0A(from);
        0qQ.A0B(from, 0);
        View A0A = DbU.A0A(from, viewGroup, R.layout.reporting_bottom_sheet_headline_row, false);
        A0A.setTag(new OAT(A0A));
        AnonymousClass0fD.A0A(1729857402, A03);
        return A0A;
    }
}
