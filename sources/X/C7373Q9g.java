package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Q9g  reason: case insensitive filesystem */
public final class C7373Q9g extends FrameLayout implements C13601TdT {
    public C8034Qfe A00;

    public void setViewModel(C8034Qfe qfe) {
        0qQ.A0B(qfe, 0);
        this.A00 = qfe;
        Context A0S = AnonymousClass7TE.A0S(this);
        Integer num = null;
        ListCell listCell = new ListCell(A0S, (AttributeSet) null);
        Context A0S2 = AnonymousClass7TE.A0S(listCell);
        Q9Q q9q = new Q9Q(A0S2);
        Context context = q9q.getContext();
        C8034Qfe qfe2 = this.A00;
        if (qfe2 != null) {
            num = Integer.valueOf(qfe2.A00);
        }
        if (num != null) {
            q9q.setText(context.getString(num.intValue()));
            q9q.setTextStyle(RH2.A14);
            listCell.setLeftAddOnText(q9q);
            C8034Qfe qfe3 = this.A00;
            if (qfe3 != null) {
                int i = qfe3.A01;
                if (Integer.valueOf(i) != null) {
                    Pxh.A13(A0S2, listCell, i);
                    listCell.setPrimaryTextStyle(RH2.A1F);
                    listCell.setBackgroundStyle(RFp.ACCORDION_PUX_CELL);
                    C11386SQz.A01(A0S, listCell, REP.ALL_BORDERED_ALL_ROUNDED);
                    addView(listCell, JTS.A0D());
                    return;
                }
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final C8034Qfe getFulfillmentOptionCellViewModel() {
        return this.A00;
    }

    public final void setFulfillmentOptionCellViewModel(C8034Qfe qfe) {
        this.A00 = qfe;
    }
}
