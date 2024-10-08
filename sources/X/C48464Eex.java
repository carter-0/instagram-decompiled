package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.Eex  reason: case insensitive filesystem */
public abstract class C48464Eex {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        String A0c = Dbb.A0c(r7);
        UserSession A0W = DbX.A0W(r6);
        User A0j = DbV.A0j(A0W, A0c);
        FragmentActivity A04 = C308206Td.A04(r6);
        0qQ.A0C(A04, "null cannot be cast to non-null type android.app.Activity");
        1pE A01 = 1pE.A01(A04, C308206Td.A08(r6), A0W, "shared_activity_direct_message");
        ImageUrl imageUrl = PendingRecipient.A0g;
        0qQ.A0A(A0j);
        Dbc.A0x(A01, A0j);
        A01.A0v = true;
        A01.A06();
        return null;
    }
}
