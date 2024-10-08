package X;

import android.content.Context;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.Qex  reason: case insensitive filesystem */
public final class C8010Qex extends QEW {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8010Qex(Context context, AnonymousClass07Z r4, LoggingContext loggingContext, 0sP r6, 0sP r7, 0sP r8, boolean z) {
        super(RH6.A08, loggingContext, false);
        0qQ.A0B(r6, 2);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A00 = context;
        this.A01 = r4;
        this.A05 = z;
    }

    public static final void A07(QFO qfo, C8010Qex qex, SUj sUj) {
        InlineActionMenu inlineActionMenu;
        ListCell listCell = qfo.A01;
        listCell.A02();
        SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) sUj.A01;
        if (selectionShippingAddressItem != null) {
            listCell.setPrimaryText(selectionShippingAddressItem.A03);
            listCell.setSecondaryText(selectionShippingAddressItem.A02);
            listCell.setTertiaryText(selectionShippingAddressItem.A04);
            String str = null;
            if (selectionShippingAddressItem.A0H) {
                inlineActionMenu = qfo.A00;
            } else {
                inlineActionMenu = null;
            }
            listCell.setActionMenu(inlineActionMenu);
            String str2 = selectionShippingAddressItem.A05;
            if (str2 == null) {
                Integer num = selectionShippingAddressItem.A00;
                if (num != null) {
                    str = qex.A00.getString(num.intValue());
                }
            } else {
                str = str2;
            }
            listCell.setErrorText(str);
        }
        AnonymousClass7TF.A16(listCell.A07);
        AnonymousClass0fU.A00(new C11498SbL(8, (Object) sUj, (Object) qfo, (Object) qex), listCell);
    }
}
