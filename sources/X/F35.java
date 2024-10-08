package X;

import com.instagram.user.model.User;

public final class F35 {
    public final 0wc A00;

    public F35(0wc r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C14631Tzd tzd, boolean z) {
        1Xj r3;
        1Ln A0F;
        User user = tzd.A0L;
        if (user != null) {
            C255773uh r0 = tzd.A0K;
            if (r0 == null || (r3 = r0.A0b) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            0wc r1 = this.A00;
            if (z) {
                A0F = Dbb.A0F(AnonymousClass7TE.A0e(r1, "unblock_dialog_confirmed"), user, 381);
                A0F.A0Q("entity_user_type", DbS.A0j(user.BIW()));
            } else {
                A0F = Dbb.A0F(AnonymousClass7TE.A0e(r1, "block_dialog_confirmed"), user, 7);
                A0F.A0Q("entity_user_type", DbS.A0j(user.BIW()));
                A0F.A0m(r3.getId());
                Dbb.A1F(A0F);
            }
            A0F.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A01(User user) {
        1Ln A0F;
        String valueOf;
        String str;
        boolean CPV = user.CPV();
        0wc r1 = this.A00;
        if (CPV) {
            A0F = new 1Ln(AnonymousClass7TE.A0e(r1, "unblock_button_tapped"), 380);
            valueOf = user.getId();
            str = "target_id";
        } else {
            A0F = Dbb.A0F(AnonymousClass7TE.A0e(r1, "block_button_tapped"), user, 6);
            Dbb.A1F(A0F);
            valueOf = String.valueOf(user.BIW());
            str = "entity_user_type";
        }
        A0F.A0R(str, valueOf);
        A0F.Cgf();
    }
}
