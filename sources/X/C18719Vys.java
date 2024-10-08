package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vys  reason: case insensitive filesystem */
public abstract class C18719Vys {
    public static String A00 = "v1";
    public static UserSession A01;

    public static final View A00(ViewGroup viewGroup, UserSession userSession, String str) {
        int i;
        A01 = userSession;
        A00 = str;
        if (str.equals("v3")) {
            i = R.layout.question_header_view_v3;
        } else {
            boolean equals = str.equals("v2");
            i = R.layout.question_header_view;
            if (equals) {
                i = R.layout.question_header_view_v2;
            }
        }
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, i, false);
        A09.setTag(new C14907UEm(A09));
        return A09;
    }

    public static final void A01(AnonymousClass2pA r2, C14907UEm uEm, C57251IUm iUm, C17983VjL vjL) {
        0qQ.A0B(uEm, 0);
        AnonymousClass7TF.A1B(iUm, 1, vjL);
        uEm.A01 = vjL;
        iUm.A03.add(uEm);
        A02(r2, uEm, vjL.A01(iUm.A00), true);
    }

    public static final void A02(AnonymousClass2pA r5, C14907UEm uEm, C17997VjZ vjZ, boolean z) {
        boolean A1b = C51973G9u.A1b(uEm, vjZ, r5);
        TextView textView = uEm.A07;
        textView.setText(vjZ.A03.A07);
        if (0qQ.A0K(A00, "v1")) {
            textView.setTypeface(textView.getTypeface(), A1b ? 1 : 0);
            0nA.A0l(uEm.A05, R.dimen.action_bar_item_spacing_right, R.dimen.abc_select_dialog_padding_start_material, R.dimen.action_bar_item_spacing_right, R.dimen.abc_select_dialog_padding_start_material);
        }
        View view = uEm.A03;
        if (z) {
            view.setVisibility(0);
            WBG.A01(view, 28, vjZ, r5);
            return;
        }
        view.setVisibility(8);
    }
}
