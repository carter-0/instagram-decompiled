package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.PDp  reason: case insensitive filesystem */
public final class C72636PDp implements C74412PuS {
    public final /* synthetic */ NKK A00;

    public C72636PDp(NKK nkk) {
        this.A00 = nkk;
    }

    public final void CqL(MessagingUser messagingUser) {
        C70458O7j o7j = this.A00.A03;
        if (o7j != null) {
            C72535P9s p9s = o7j.A00;
            C331157Pu r0 = p9s.A02;
            if (r0 != null) {
                r0.A07();
            }
            p9s.A01 = messagingUser;
        }
    }

    public final void D38(String str) {
        NKK nkk = this.A00;
        C70458O7j o7j = nkk.A03;
        if (o7j != null) {
            String str2 = nkk.A07;
            if (str2 != null) {
                String str3 = nkk.A06;
                long j = nkk.A02;
                2FW r4 = nkk.A04;
                if (r4 != null) {
                    C72535P9s p9s = o7j.A00;
                    p9s.A00.DRs(r4, C66580MXl.A0i(str2, str3), str, "users_list", j);
                    C331157Pu r0 = p9s.A02;
                    if (r0 != null) {
                        r0.A07();
                        return;
                    }
                    return;
                }
                0qQ.A0F("messageContentType");
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
