package X;

import android.os.Bundle;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;

/* renamed from: X.QCh  reason: case insensitive filesystem */
public final class C7418QCh extends AnonymousClass9YH {
    public final ECPPaymentRequest A00;

    public C7418QCh(AnonymousClass0g9 r2, ECPPaymentRequest eCPPaymentRequest) {
        super((Bundle) null, r2);
        this.A00 = eCPPaymentRequest;
    }

    public final 2YL A02(C319836rJ r3, Class cls, String str) {
        AnonymousClass7TG.A1O(cls, r3);
        if (cls.isAssignableFrom(QDH.class)) {
            return new QDH(r3, this.A00);
        }
        throw C51973G9u.A0g(cls, "Unknown ViewModel class: ", AnonymousClass7TE.A1A());
    }
}
