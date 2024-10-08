package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NLe  reason: case insensitive filesystem */
public final class C68507NLe extends C336937fQ {
    public final LayoutInflater A00;
    public final NKY A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68507NLe(Context context, NKY nky) {
        this.A01 = nky;
        this.A00 = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int dimensionPixelSize;
        int A03 = AnonymousClass0fD.A03(-1372745165);
        if (view == null) {
            LayoutInflater layoutInflater = this.A00;
            0qQ.A0B(layoutInflater, 0);
            view = DbU.A08(layoutInflater, R.layout.reporting_bottom_sheet_inverse_primary_action_button_row);
            0qQ.A0A(view);
            view.setTag(new C70602OCz(view));
        }
        C70602OCz oCz = (C70602OCz) DbT.A0o(view);
        NKY nky = this.A01;
        OHB ohb = (OHB) obj;
        C69653Npb npb = (C69653Npb) obj2;
        C51974G9v.A1O(oCz, nky, ohb, npb);
        C71038Oa2 oa2 = nky.A06;
        if (oa2 != null) {
            oa2.A05(2);
        }
        oCz.A00.setVisibility(DbW.A00(npb.A01 ? 1 : 0));
        TextView textView = oCz.A01;
        textView.setText(ohb.A03.A00);
        C71409Ok8.A01(textView, 43, ohb, nky);
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(textView);
        if (npb.A00 > 0) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = DbU.A05(textView).getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        }
        A0G.setMargins(A0G.leftMargin, dimensionPixelSize, A0G.rightMargin, A0G.bottomMargin);
        textView.setLayoutParams(A0G);
        AnonymousClass0fD.A0A(-1860283427, A03);
        return view;
    }
}
