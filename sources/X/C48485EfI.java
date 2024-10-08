package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.EfI  reason: case insensitive filesystem */
public abstract class C48485EfI {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        PendingRecipient pendingRecipient;
        List list = r8.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        17k.A07(A0t2, "Merchant ID should not be null");
        17k.A07(A0t, "Entrypoint must be provided");
        FragmentActivity A04 = C308206Td.A04(r7);
        A04.finish();
        UserSession A0Z = DbT.A0Z(r7);
        User A0j = DbV.A0j(A0Z, A0t2);
        if (A0j == null) {
            pendingRecipient = new PendingRecipient(A0t2);
        }
        1pE A01 = 1pE.A01(A04, new C50222FUe(A0t), A0Z, A0t);
        A01.A0B(Collections.singletonList(pendingRecipient));
        A01.A0v = true;
        A01.A06();
        if (A0t.equals("service_buyer_booking_confirmation") && 1Wj.A00 != null) {
            DcL.A00().A02(A04, A0Z, "803330587195545", (Map) null);
        }
        return null;
    }
}
