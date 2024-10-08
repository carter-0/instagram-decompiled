package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.PDq  reason: case insensitive filesystem */
public final class C72637PDq implements C74412PuS {
    public final /* synthetic */ NKD A00;

    public C72637PDq(NKD nkd) {
        this.A00 = nkd;
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
        NKD nkd = this.A00;
        C70458O7j o7j = nkd.A03;
        if (o7j != null) {
            String str2 = nkd.A08;
            if (str2 != null) {
                String str3 = nkd.A07;
                long j = nkd.A01;
                2FW r4 = nkd.A05;
                if (r4 == null) {
                    0qQ.A0F("messageContentType");
                    throw AnonymousClass00P.createAndThrow();
                }
                C72535P9s p9s = o7j.A00;
                p9s.A00.DRs(r4, C66580MXl.A0i(str2, str3), str, "users_list", j);
                C331157Pu r0 = p9s.A02;
                if (r0 != null) {
                    r0.A07();
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
