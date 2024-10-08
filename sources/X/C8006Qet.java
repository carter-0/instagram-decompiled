package X;

import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.otc.AnonCheckoutToggleButton;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Qet  reason: case insensitive filesystem */
public final class C8006Qet extends QEW {
    public final ContextThemeWrapper A00;
    public final C13612Tde A01;
    public final 0sP A02;
    public final boolean A03;

    public final void A0B(QFF qff, SUj sUj) {
        boolean A1U = AnonymousClass7TF.A1U(0, sUj, qff);
        AnonCheckoutToggleItem anonCheckoutToggleItem = (AnonCheckoutToggleItem) sUj.A01;
        if (SUj.A0V(sUj) && anonCheckoutToggleItem != null) {
            qff.A00.A05();
            AnonCheckoutToggleButton anonCheckoutToggleButton = qff.A01;
            anonCheckoutToggleButton.setToggleOn(anonCheckoutToggleItem.A02);
            AnonymousClass0fU.A00(this.A00, anonCheckoutToggleButton);
            anonCheckoutToggleButton.setOnToggleCheckedListener(this.A02);
            TextView textView = anonCheckoutToggleButton.A02;
            C7X c7x = anonCheckoutToggleItem.A01;
            String str = null;
            if (c7x != null) {
                str = C41845B3m.A0l(c7x, 0);
            }
            textView.setText(str);
            SRn.A02(textView, RH2.PRIMARY_TEXT);
            anonCheckoutToggleButton.A03.setVisibility(0);
            anonCheckoutToggleButton.setEnableRedesign(this.A03);
            C7X c7x2 = anonCheckoutToggleItem.A00;
            if (c7x2 != null) {
                TextView textView2 = anonCheckoutToggleButton.A01;
                String A0l = C41845B3m.A0l(c7x2, 0);
                if (A0l != null) {
                    ImmutableList A0E = c7x2.A0E();
                    0qQ.A07(A0E);
                    List A022 = C11295SKd.A02(A0E, 0, A1U);
                    0qQ.A0B(A022, A1U ? 1 : 0);
                    C11232SGr.A00(textView2, this.A01, new C11232SGr(A0l, A022));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        } else if (SUj.A0T(sUj)) {
            qff.A01.A03.setVisibility(4);
            qff.A00.A06(A1U);
        }
    }

    public C8006Qet(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, C13612Tde tde, 0sP r6, boolean z) {
        super(RH6.A0A, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A02 = r6;
        this.A01 = tde;
        this.A03 = z;
    }
}
