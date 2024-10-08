package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.Qeu  reason: case insensitive filesystem */
public final class C8007Qeu extends QEW {
    public final int A00;
    public final 0hq A01;
    public final String A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final 0sP A04;

    public final void A0B(QFA qfa) {
        0qQ.A0B(qfa, 0);
        0hq r2 = this.A01;
        Fragment A0R = r2.A0R(this.A02);
        if (A0R != null && 0qQ.A0K(this.A03.get(qfa), A0R)) {
            0s1 r0 = new 0s1(r2);
            r0.A03(A0R);
            r0.A06();
        }
    }

    public final void A0C(QFA qfa, SUj sUj) {
        boolean A1U = AnonymousClass7TF.A1U(0, sUj, qfa);
        InlineFormItem inlineFormItem = (InlineFormItem) sUj.A01;
        if (inlineFormItem != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("ECP_FORM_FRAGMENT_PARAMS", inlineFormItem.A00);
            LoggingContext loggingContext = this.A03;
            A0a.putString("ECP_SESSION_ID", loggingContext.A02);
            A0a.putString("ECP_PRODUCT_ID", String.valueOf(loggingContext.A00));
            A0a.putString("ECP_CLIENT_RECEIVER_ID", inlineFormItem.A01);
            A0a.putParcelable("logging_context", loggingContext);
            C8127QhL qhL = new C8127QhL();
            qhL.setArguments(A0a);
            0sP r0 = this.A04;
            0qQ.A0B(r0, 0);
            qhL.A0I = r0;
            this.A03.put(qfa, qhL);
            0s1 r2 = new 0s1(this.A01);
            r2.A0G = A1U;
            r2.A0D(qhL, this.A02, this.A00);
            r2.A0K();
        }
    }

    public C8007Qeu(0hq r3, LoggingContext loggingContext, 0sP r5, int i) {
        super(RH6.A05, loggingContext, false);
        this.A01 = r3;
        this.A00 = i;
        this.A04 = r5;
        this.A02 = 002.A0O("form_", i);
    }
}
