package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsRadioButton;
import java.util.List;

/* renamed from: X.MvH  reason: case insensitive filesystem */
public final class C67813MvH extends 2Rw {
    public static final List A00 = AnonymousClass7TE.A1C();

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C69596Noe noe = C69331NjW.values()[getItemViewType(i)].A00;
        List list = A00;
        if (noe instanceof C68778NWn) {
            boolean A1X = DbW.A1X(list);
            Object obj = list.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.HeaderItem");
            FCV.A02((C46448DfA) obj, (C46896DnC) r8, A1X, A1X);
        } else if (noe instanceof C68777NWm) {
            Object obj2 = list.get(i);
            C67997MyP myP = (C67997MyP) r8;
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.inbox.professional.DirectInboxFilterOptionsAdapter.FilterOptionModel");
            C69659Nph nph = (C69659Nph) obj2;
            View view = myP.A00;
            TextView textView = myP.A01;
            IgdsRadioButton igdsRadioButton = myP.A03;
            IgSimpleImageView igSimpleImageView = myP.A02;
            textView.setText(nph.A02);
            igdsRadioButton.setChecked(nph.A03);
            C71408Ok7.A00(view, 24, nph, igdsRadioButton);
            Integer num = nph.A01;
            if (num != null) {
                igSimpleImageView.setImageResource(num.intValue());
                igSimpleImageView.setVisibility(0);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        C69596Noe noe = C69331NjW.values()[i].A00;
        if (noe instanceof C68778NWn) {
            return FCV.A00(viewGroup.getContext(), viewGroup, false);
        }
        boolean z = noe instanceof C68777NWm;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        if (z) {
            return new C67997MyP(DbU.A09(A0D, viewGroup, R.layout.direct_inbox_filter_option, false));
        }
        View A09 = DbU.A09(A0D, viewGroup, R.layout.direct_inbox_filter_option_divider, false);
        0qQ.A0B(A09, 1);
        return new C249703kE(A09);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1089690152);
        int size = A00.size();
        AnonymousClass0fD.A0A(-1596386284, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C69331NjW njW;
        int A03 = AnonymousClass0fD.A03(1256367146);
        Object obj = A00.get(i);
        0qQ.A0B(obj, 0);
        if (obj instanceof C69659Nph) {
            njW = C69331NjW.A05;
        } else if (obj instanceof C46448DfA) {
            njW = C69331NjW.A04;
        } else if (obj instanceof C69992NvW) {
            njW = C69331NjW.A03;
        } else {
            throw AnonymousClass7TE.A0w(C273654mx.A00(62));
        }
        int ordinal = njW.ordinal();
        AnonymousClass0fD.A0A(-347869597, A03);
        return ordinal;
    }
}
