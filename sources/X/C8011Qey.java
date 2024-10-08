package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.Qey  reason: case insensitive filesystem */
public final class C8011Qey extends QEW {
    public final ContextThemeWrapper A00;
    public final C62320sa A01;
    public final C62320sa A02;

    public final void A0B(QF4 qf4, SUj sUj) {
        String str;
        PayButtonItem payButtonItem;
        PayButtonItem payButtonItem2;
        boolean A1U = AnonymousClass7TF.A1U(0, sUj, qf4);
        FBPayAnimationButton fBPayAnimationButton = qf4.A00;
        AnonymousClass0fU.A00(C11493SbG.A00, fBPayAnimationButton);
        Object obj = sUj.A01;
        if (obj != null && (payButtonItem2 = (PayButtonItem) obj) != null && payButtonItem2.A03 == A1U) {
            fBPayAnimationButton.A05();
            if (sUj.A00 == C8882RDz.LOADING) {
                fBPayAnimationButton.A07();
            } else {
                fBPayAnimationButton.A08(sUj);
            }
        } else if (SUj.A0V(sUj) && (payButtonItem = (PayButtonItem) obj) != null && payButtonItem.A00 != null) {
            String A07 = A07(AnonymousClass7TE.A0S(qf4.itemView), payButtonItem);
            FBPayAnimationButton.A01(fBPayAnimationButton);
            fBPayAnimationButton.getButtonView().getLayoutParams().width = -1;
            if (this.A01) {
                fBPayAnimationButton.getButtonView().setButtonStyle(C8923RFr.A09);
            }
            if (A07 == null) {
                A07 = "";
            }
            fBPayAnimationButton.setText(A07);
            fBPayAnimationButton.setPayButtonState(A1U);
            fBPayAnimationButton.A05();
            C11499SbM.A01(fBPayAnimationButton, 27, qf4, this);
        } else if (SUj.A0T(sUj)) {
            fBPayAnimationButton.setPayButtonState(false);
            fBPayAnimationButton.A06(A1U);
            C62320sa r0 = this.A02;
            if (r0 != null) {
                r0.invoke();
            }
        } else if (SUj.A0S(sUj)) {
            PayButtonItem payButtonItem3 = (PayButtonItem) obj;
            if (payButtonItem3 == null || (str = A07(AnonymousClass7TE.A0S(qf4.itemView), payButtonItem3)) == null) {
                str = "";
            }
            fBPayAnimationButton.setText(str);
            fBPayAnimationButton.setPayButtonState(false);
            fBPayAnimationButton.A05();
        }
    }

    public C8011Qey(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, C62320sa r4, C62320sa r5, boolean z) {
        super(RH6.A0T, loggingContext, z);
        this.A00 = contextThemeWrapper;
        this.A01 = r4;
        this.A02 = r5;
    }

    private final String A07(Context context, PayButtonItem payButtonItem) {
        String str;
        String format;
        if (this.A01) {
            format = payButtonItem.A02;
            if (format == null) {
                format = context.getString(2131961207);
            }
            return format;
        }
        CurrencyAmount currencyAmount = payButtonItem.A00;
        if (currencyAmount != null) {
            str = SGX.A00.A00(currencyAmount.A00, new BigDecimal(currencyAmount.A01));
        } else {
            str = null;
        }
        Locale A0w = Pxh.A0w();
        String A16 = AnonymousClass7TE.A16(context, 2131961209);
        String str2 = payButtonItem.A02;
        if (str2 == null) {
            str2 = AnonymousClass7TE.A16(context, 2131961208);
        }
        format = String.format(A0w, A16, Pxf.A1X(str2, str, 2));
        0qQ.A07(format);
        return format;
    }
}
