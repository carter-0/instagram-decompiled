package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* renamed from: X.Eh1  reason: case insensitive filesystem */
public abstract class C48592Eh1 {
    public static final Object A00(C307896Rx r3) {
        C309516Yo A0Q = DbU.A0Q(C308206Td.A04(r3), C308206Td.A0B(r3));
        FCL.A00();
        List A1I = AnonymousClass7TE.A1I(UserMonetizationProductType.REELS_OVERLAY_ADS);
        C47473E3x e3x = new C47473E3x();
        DbZ.A1B(e3x, "ARGUMENT_PRODUCT_ELIGIBILITY_LIST", A1I);
        return Dba.A0U(e3x, A0Q);
    }
}
