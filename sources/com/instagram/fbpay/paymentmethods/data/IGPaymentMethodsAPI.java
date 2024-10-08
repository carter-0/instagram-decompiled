package com.instagram.fbpay.paymentmethods.data;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass5A7;
import X.C12509Svf;
import X.C2818659w;
import X.C2818759x;
import com.instagram.common.session.UserSession;

public final class IGPaymentMethodsAPI {
    public C2818759x A00;
    public final C2818659w A01 = new C2818659w();
    public final AnonymousClass5A7 A02 = new C12509Svf(this, 2);
    public final UserSession A03;
    public final 1vn A04;
    public final String A05;

    public IGPaymentMethodsAPI(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = 1vm.A01(userSession);
    }
}
