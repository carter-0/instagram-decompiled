package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;

/* renamed from: X.Eft  reason: case insensitive filesystem */
public abstract class C48522Eft {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Object A03 = r11.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A03);
        int A04 = DbW.A04(r11.A03(2), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0W = DbX.A0W(r10);
        FragmentActivity A042 = C308206Td.A04(r10);
        Calendar instance = Calendar.getInstance();
        0qQ.A07(instance);
        instance.setTimeInMillis(A0R * 1000);
        1ES.A00(A042, AnonymousClass07i.A00(A042), C48313EcW.A00(A0W, instance.get(1), instance.get(2) + 1, DbU.A03(instance), A04));
        return null;
    }
}
