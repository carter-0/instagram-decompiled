package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.QXn  reason: case insensitive filesystem */
public final class C7802QXn extends C250663lr implements C13930TlY {
    public final String AZd() {
        return getOptionalStringField(6, "address_city");
    }

    public final String AZf() {
        return getOptionalStringField(7, "address_state");
    }

    public final String Arl() {
        return A0D("country_code");
    }

    public final String CHc() {
        return getOptionalStringField(9, ServerW3CShippingAddressConstants.POSTAL_CODE);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "first_name"), AnonymousClass7TE.A0f(r1, "middle_name"), AnonymousClass7TE.A0f(r1, "last_name"), AnonymousClass7TE.A0f(r1, "street1"), AnonymousClass7TE.A0f(r1, "street2"), AnonymousClass7TE.A0f(r1, "street3"), AnonymousClass7TE.A0f(r1, "address_city"), AnonymousClass7TE.A0f(r1, "address_state"), AnonymousClass7TE.A0f(r1, "country_code"), AnonymousClass7TE.A0f(r1, ServerW3CShippingAddressConstants.POSTAL_CODE)});
    }

    public final String C1d() {
        return A0A("street1");
    }

    public final String C1e() {
        return A0B("street2");
    }

    public C7802QXn(int i) {
        super(i);
    }

    public C7802QXn() {
        super(1653097835);
    }
}
