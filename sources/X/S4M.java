package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;

public final class S4M {
    public final AddressFormFieldsConfig A00;
    public final ImmutableList A01;

    public S4M(AddressFormFieldsConfig addressFormFieldsConfig, ImmutableList immutableList) {
        C11367SPk.A03(immutableList, "addresses");
        this.A01 = immutableList;
        this.A00 = addressFormFieldsConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S4M) {
                S4M s4m = (S4M) obj;
                if (!0qQ.A0K(this.A01, s4m.A01) || !0qQ.A0K(this.A00, s4m.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A01) * 31) + C51971G9r.A0E(this.A00);
    }
}
