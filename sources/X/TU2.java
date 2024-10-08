package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

public final class TU2 extends 0Yg implements C62320sa {
    public static final TU2 A00 = new TU2();

    public TU2() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        AnonymousClass0eM r4 = STI.A0C;
        return Pxe.A0Z(A0Q, "cc-csc", Pxh.A0z("password", Pxi.A0o(A0Q, "cc-exp", Pxh.A0z("birthdate|dob|invaliddate", Pxi.A0o(A0Q, "cc-exp-year", Pxh.A0z("cardmonthyear", Pxi.A0o(A0Q, "cc-exp-month", Pxh.A0z("cardmonthyear", Pxi.A0o(A0Q, "cc-number", Pxh.A0z("swisspass|student|wellness|traveller|shipping|user[_\\-\\s]?id|passsword|reward|charm|student|club|valid|voucher|passport|gift|password|identity|phone|id[_\\-\\s]?card|family|name|district|super[_\\-\\s]?card|loyalty|member|isic|rcpt|country[._\\-\\s]?code|formCountry|formState|zip[._\\-\\s]?code|e[._\\-\\s]?mail|cpfpix|addressnumber|shippingaddress", (Set) r4.getValue()), r4)), r4)), r4)), r4)));
    }
}
