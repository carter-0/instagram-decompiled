package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Qep  reason: case insensitive filesystem */
public final class C8002Qep extends QEW {
    public final Context A00;

    public C8002Qep(Context context, LoggingContext loggingContext) {
        super(RH6.A0L, loggingContext, false);
        this.A00 = context;
    }

    public final void A0B(QFQ qfq, SUj sUj) {
        AnonymousClass7TG.A1N(sUj, qfq);
        InlineBackButtonItem inlineBackButtonItem = (InlineBackButtonItem) sUj.A01;
        if (inlineBackButtonItem != null) {
            LinearLayout linearLayout = qfq.A01;
            AnonymousClass0fU.A00(this.A00, linearLayout);
            TextView textView = qfq.A02;
            textView.setText(inlineBackButtonItem.A00);
            SRn.A02(textView, RH2.A0N);
            Context context = this.A00;
            C11386SQz.A01(context, linearLayout, REP.ALL_BORDERED_ALL_ROUNDED);
            SPB A0A = AnonymousClass2E0.A0A();
            RH3 rh3 = RH3.A0A;
            qfq.A00.setImageDrawable(A0A.A05(context, rh3.A00, rh3.A01));
        }
    }
}
