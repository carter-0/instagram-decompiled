package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.EfK  reason: case insensitive filesystem */
public abstract class C48487EfK {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        PendingRecipient pendingRecipient;
        Object A01 = r9.A01();
        String A0p = DbS.A0p(A01);
        String str = (String) A01;
        String A0i = DbW.A0i(r9, 1);
        String A0j = DbW.A0j(r9, A0p);
        UserSession A0W = DbX.A0W(r8);
        AnonymousClass0iw A08 = C308206Td.A08(r8);
        if (!(A0i == null || A0i.length() == 0)) {
            A08 = new C50223FUf(A0i);
        }
        User A0j2 = DbV.A0j(A0W, str);
        if (A0j2 != null) {
            pendingRecipient = new PendingRecipient(A0j2);
        } else {
            ImageUrl imageUrl = PendingRecipient.A0g;
            pendingRecipient = new PendingRecipient(DbS.A0V(""), str, "");
        }
        1pE A012 = 1pE.A01(C308206Td.A04(r8), A08, A0W, A0j);
        A012.A0B(AnonymousClass7TE.A1I(pendingRecipient));
        A012.A0v = true;
        A012.A06();
        return null;
    }
}
