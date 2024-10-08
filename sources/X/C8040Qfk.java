package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.Qfk  reason: case insensitive filesystem */
public final class C8040Qfk extends SRc {
    public final SelectionActionViewItem A00;
    public final LoggingContext A01;
    public final List A02;
    public final boolean A03;

    public final void A0L(BaseCheckoutItem baseCheckoutItem) {
        BaseSelectionCheckoutItem baseSelectionCheckoutItem;
        BaseSelectionCheckoutItem baseSelectionCheckoutItem2;
        AnonymousClass2gB r2 = this.A05;
        Object A022 = r2.A02();
        if ((A022 instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem2 = (BaseSelectionCheckoutItem) A022) != null) {
            baseSelectionCheckoutItem2.Ejn(AnonymousClass05K.A0N);
        }
        if ((baseCheckoutItem instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem = (BaseSelectionCheckoutItem) baseCheckoutItem) != null) {
            baseSelectionCheckoutItem.Ejn(AnonymousClass05K.A0C);
        }
        r2.A0B(baseCheckoutItem);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8040Qfk(BaseCheckoutItem baseCheckoutItem, LoggingContext loggingContext, List list, int i, int i2, boolean z, boolean z2) {
        super(i, true, z);
        C51972G9s.A1D(list, baseCheckoutItem);
        0qQ.A0B(loggingContext, 6);
        this.A02 = list;
        this.A01 = loggingContext;
        this.A03 = z2;
        this.A00 = new SelectionActionViewItem(RH6.A0n, (Integer) null, Integer.valueOf(i2), (String) null, (String) null);
        this.A04.put(i, baseCheckoutItem);
        A0L(baseCheckoutItem);
    }
}
