package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.android.R;

public final class Q9w extends LinearLayout implements C13601TdT {
    public C8033Qfd A00;

    public void setViewModel(C8033Qfd qfd) {
        0qQ.A0B(qfd, 0);
        this.A00 = qfd;
        ListCell listCell = (ListCell) findViewById(R.id.list_cell);
        listCell.setTextStyle(C8922RFq.A0G);
        Context A0S = AnonymousClass7TE.A0S(this);
        Q9O q9o = new Q9O(A0S);
        q9o.setIcon(RH3.A0X);
        listCell.setRightAddOnIcon(q9o);
        C8033Qfd qfd2 = this.A00;
        if (qfd2 != null) {
            Pxh.A13(A0S, listCell, qfd2.A00);
            C8033Qfd qfd3 = this.A00;
            if (qfd3 != null) {
                listCell.A05(R.dimen.action_bar_item_spacing_left, qfd3.A01);
                listCell.A0B(false, true);
                listCell.A06(AnonymousClass7TE.A0b(listCell, R.id.image), (Integer) null, 2132017592);
                listCell.A06(AnonymousClass7TE.A0b(listCell, R.id.right_add_on_container), (Integer) null, 2132017589);
                TextView A0d = AnonymousClass7TE.A0d(listCell, R.id.primary_text);
                A0d.setGravity(16);
                C71492dQ A0N = Pxj.A0N(A0d);
                A0N.A0u = R.id.image;
                A0N.A0F = R.id.image;
                listCell.setOnClickListener(new C11497SbK(this, 70));
                C9972RkR.A00.A03(A0S, this, REP.NO_TOP_BORDER_BOTTOM_ROUNDED, 30);
                return;
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }
}
