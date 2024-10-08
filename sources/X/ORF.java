package X;

import android.widget.TextView;
import com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView;

public abstract class ORF {
    public static final void A00(C68054MzL mzL, Ou4 ou4) {
        AnonymousClass0eM r3 = mzL.A04;
        TextView A0A = JTQ.A0A(r3);
        N3O n3o = ou4.A00;
        A0A.setText(n3o.A03);
        ((ExpandingEllipsizingTextView) AnonymousClass7TE.A14(r3)).setOnExpandedStateChangeListener(new PRK(ou4));
        boolean z = n3o.A0A;
        ExpandingEllipsizingTextView expandingEllipsizingTextView = (ExpandingEllipsizingTextView) AnonymousClass7TE.A14(r3);
        if (z) {
            expandingEllipsizingTextView.A04(false);
        } else {
            expandingEllipsizingTextView.A03(false);
        }
    }

    public static final void A01(C68054MzL mzL, Ou4 ou4) {
        AnonymousClass0eM r2 = mzL.A09;
        TextView A0A = JTQ.A0A(r2);
        N3O n3o = ou4.A00;
        A0A.setText(n3o.A08);
        if (n3o.A0B) {
            AnonymousClass7TH.A06(r2).setContentDescription(DbV.A0u(AnonymousClass7TH.A06(r2).getContext(), n3o.A06, n3o.A07, 2131968787));
        }
    }
}
