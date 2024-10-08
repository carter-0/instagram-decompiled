package X;

import android.content.Context;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Qev  reason: case insensitive filesystem */
public final class C8008Qev extends QEW {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;
    public final 0sK A05;

    public C8008Qev(Context context, AnonymousClass07Z r4, LoggingContext loggingContext, 0sP r6, 0sP r7, 0sP r8, 0sK r9) {
        super(RH6.A0o, loggingContext, false);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A00 = context;
        this.A01 = r4;
    }

    public static final void A07(QFM qfm, C8008Qev qev, SUj sUj) {
        ListCell listCell = qfm.A01;
        listCell.A02();
        SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) sUj.A01;
        if (selectionEmailViewItem != null) {
            listCell.setPrimaryText(selectionEmailViewItem.A01);
            listCell.setQuaternaryText(selectionEmailViewItem.A03);
        }
        AnonymousClass7TF.A16(listCell.A07);
        listCell.setActionMenu(qfm.A00);
        AnonymousClass0fU.A00(new C11498SbL(qfm, qev, sUj, 4), listCell);
    }
}
