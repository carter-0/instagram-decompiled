package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ee2  reason: case insensitive filesystem */
public abstract class C48407Ee2 {
    public static final Object A00(C307896Rx r12) {
        AnonymousClass4DH r4;
        FragmentActivity A04 = C308206Td.A04(r12);
        UserSession A0Y = DbT.A0Y(r12);
        0hq A0F = DbT.A0F(A04);
        AnonymousClass4DH A02 = C308206Td.A02(r12);
        if (A02 == null || !(A02 instanceof AnonymousClass4DH)) {
            r4 = null;
        } else {
            r4 = A02;
        }
        AnonymousClass0iw A08 = C308206Td.A08(r12);
        boolean A1Y = DbX.A1Y(A0Y);
        C67623Mqv mqv = C67620Mqs.A04;
        Context A042 = DbT.A04();
        ArrayList A1C = AnonymousClass7TE.A1C();
        EVP evp = EVP.SINGLE;
        if (r4 != null) {
            A08 = r4;
        }
        DbV.A1Q(new C47705EDo(A042, r4, A04, A0F, A08, A0Y, evp, A1C, true, A1Y));
        return null;
    }
}
