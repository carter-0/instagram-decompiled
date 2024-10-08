package X;

import com.instagram.user.model.User;

/* renamed from: X.Hpe  reason: case insensitive filesystem */
public final class C55917Hpe {
    public final /* synthetic */ H07 A00;

    public C55917Hpe(H07 h07) {
        this.A00 = h07;
    }

    public final void A00(User user, Integer num) {
        Long l;
        H07 h07 = this.A00;
        AnonymousClass0eM r4 = h07.A0A;
        0lg A0X = DbT.A0X(r4);
        AnonymousClass0iw r7 = (AnonymousClass0iw) h07.A07.getValue();
        String str = h07.A04;
        String id = user.getId();
        AnonymousClass7TF.A1H(A0X, r7);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, A0X), "instagram_organic_creator_inspiration_hub");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r7);
            C51965G9l.A1C(C54689HOu.A0H, A0e);
            A0e.AAJ("tab_type", "accounts");
            C51973G9u.A14(A0e, "section_type", str);
            A0e.A9F("userId", AnonymousClass7TE.A10(id));
            if (num != null) {
                l = DbS.A0j(num.intValue() + 1);
            } else {
                l = null;
            }
            A0e.A9F("index", l);
            A0e.Cgf();
        }
        C46474Dfc A01 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), user.getId(), "creator_inspiration_hub_account_tab", "creator_inspiration_hub_accounts_fragment");
        C309516Yo A0P = DbZ.A0P(h07, r4);
        A0P.A08();
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A01);
    }
}
