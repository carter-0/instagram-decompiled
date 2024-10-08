package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eg3  reason: case insensitive filesystem */
public abstract class C48532Eg3 {
    public static Object A00(C307896Rx r11) {
        C229382nI A06 = C308206Td.A06(r11);
        0hq A05 = C308206Td.A05(r11);
        FragmentActivity A04 = C308206Td.A04(r11);
        AnonymousClass0iw A08 = C308206Td.A08(r11);
        UserSession A0Y = DbT.A0Y(r11);
        Fragment fragment = A06.A02;
        Fragment fragment2 = null;
        if (fragment != null) {
            fragment2 = fragment;
        }
        boolean A1Y = DbX.A1Y(A0Y);
        C67623Mqv mqv = C67620Mqs.A04;
        DbV.A1Q(new C47705EDo(A04.getApplicationContext(), fragment2, A04, A05, A08, A0Y, EVP.SINGLE, AnonymousClass7TE.A1C(), A1Y));
        return null;
    }
}
