package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.EfS  reason: case insensitive filesystem */
public abstract class C48495EfS {
    public static final Object A00(C307896Rx r10) {
        UserSession A0Y = DbT.A0Y(r10);
        if (!C324536zU.A00(A0Y)) {
            return null;
        }
        FragmentActivity A04 = C308206Td.A04(r10);
        C67623Mqv mqv = C67620Mqs.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        FragmentActivity fragmentActivity = A04;
        new C47705EDo(A04, (Fragment) null, fragmentActivity, DbT.A0F(A04), C308206Td.A08(r10), A0Y, EVP.SINGLE, A1C, false).A02(new Void[0]);
        return null;
    }
}
