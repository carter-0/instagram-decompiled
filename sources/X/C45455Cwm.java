package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Cwm  reason: case insensitive filesystem */
public final class C45455Cwm {
    public final AddressFormFieldsConfig A00;
    public final FbPayNewCreditCardOption A01;
    public final FbPayNewPayPalOption A02;
    public final C45451Cwf A03;
    public final ImmutableList A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45455Cwm) {
                C45455Cwm cwm = (C45455Cwm) obj;
                if (!0qQ.A0K(this.A00, cwm.A00) || !0qQ.A0K(this.A01, cwm.A01) || !0qQ.A0K(this.A02, cwm.A02) || !0qQ.A0K(this.A03, cwm.A03) || !0qQ.A0K(this.A04, cwm.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C11367SPk.A02(this.A04, C11367SPk.A02(this.A03, C11367SPk.A02(this.A02, C11367SPk.A02(this.A01, C11367SPk.A02(this.A00, 1)))));
    }

    public C45455Cwm(C45395Cvb cvb) {
        this.A00 = cvb.A00;
        this.A01 = cvb.A01;
        this.A02 = cvb.A02;
        this.A03 = cvb.A03;
        ImmutableList immutableList = cvb.A04;
        C11367SPk.A03(immutableList, "paymentMethods");
        this.A04 = immutableList;
    }
}
