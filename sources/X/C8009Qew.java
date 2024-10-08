package X;

import android.content.Context;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Qew  reason: case insensitive filesystem */
public final class C8009Qew extends QEW {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;
    public final 0sK A05;

    public C8009Qew(Context context, AnonymousClass07Z r4, LoggingContext loggingContext, 0sP r6, 0sP r7, 0sP r8, 0sK r9) {
        super(RH6.A0s, loggingContext, false);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A00 = context;
        this.A01 = r4;
    }

    public static final void A07(QFN qfn, C8009Qew qew, SUj sUj) {
        ListCell listCell = qfn.A01;
        listCell.A02();
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) sUj.A01;
        if (selectionPhoneNumberViewItem != null) {
            listCell.setPrimaryText(selectionPhoneNumberViewItem.A01);
            listCell.setQuaternaryText(selectionPhoneNumberViewItem.A03);
        }
        AnonymousClass7TF.A16(listCell.A07);
        listCell.setActionMenu(qfn.A00);
        AnonymousClass0fU.A00(new C11498SbL(qfn, qew, sUj, 7), listCell);
    }
}
