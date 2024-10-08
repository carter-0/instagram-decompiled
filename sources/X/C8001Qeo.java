package X;

import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Qeo  reason: case insensitive filesystem */
public final class C8001Qeo extends QEW {
    public final ContextThemeWrapper A00;

    public C8001Qeo(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext) {
        super(RH6.A0D, loggingContext, false);
        this.A00 = contextThemeWrapper;
    }

    public final void A0B(QFG qfg, SUj sUj) {
        AnonymousClass7TG.A1N(sUj, qfg);
        CheckoutOptionalityItem checkoutOptionalityItem = (CheckoutOptionalityItem) sUj.A01;
        if (checkoutOptionalityItem != null) {
            TextView textView = qfg.A00;
            textView.setText(checkoutOptionalityItem.A00);
            SRn.A02(textView, RH2.A0E);
            AnonymousClass0fU.A00(this.A00, textView);
        }
    }
}
