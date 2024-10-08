package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.KrF  reason: case insensitive filesystem */
public abstract class C63086KrF {
    public static final Object A00(C307896Rx r5) {
        UserSession A0B = C308206Td.A0B(r5);
        FragmentActivity A04 = C308206Td.A04(r5);
        0xY AR4 = C314986jA.A00(A0B).A01.AR4();
        AR4.E5T(AnonymousClass000.A00(1814), true);
        AR4.apply();
        AnonymousClass2o3.A00(A0B).A03(UserMonetizationProductType.FAN_CLUB_CREATOR, true);
        MH8.A03(A0B, AnonymousClass1HX.A00(), 10);
        Dba.A0l(A04, AnonymousClass7TE.A0a(), A0B, C273654mx.A00(27));
        return null;
    }
}
