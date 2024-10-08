package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6rz  reason: invalid class name and case insensitive filesystem */
public final class C320206rz extends C320216s0 {
    public final AnonymousClass71F A00;
    public final UserSession A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C320206rz(AnonymousClass0iw r2, UserSession userSession, User user, AnonymousClass71F r5, String str) {
        super(r2, userSession, user, str);
        0qQ.A0B(r5, 3);
        this.A01 = userSession;
        this.A00 = r5;
        this.A02 = str;
    }

    public final void A0B(AnonymousClass3UL r3, int i) {
        0qQ.A0B(r3, 1);
        super.A0B(r3, i);
        this.A00.DwV(r3.A03, i);
    }

    public final void A0C(AnonymousClass3UL r5, int i) {
        0qQ.A0B(r5, 1);
        super.A0C(r5, i);
        1ES.A03(F88.A01(this.A01, r5.getId(), r5.A08, r5.A04));
    }

    public final void A0D(AnonymousClass3UL r3, int i) {
        0qQ.A0B(r3, 1);
        super.A0D(r3, i);
        this.A00.DGM(r3.A03, i);
    }

    public final void A02() {
        super.A02();
        this.A00.Dkk();
    }

    public final void A05(View view, User user, int i) {
        super.A05(view, user, i);
        this.A00.DwW(view, user, i);
    }

    public final void A08(User user, int i) {
        super.A08(user, i);
        1ES.A03(F88.A00(this.A01, this.A02, user.getId()));
    }

    public final void A09(User user, int i) {
        super.A09(user, i);
        this.A00.DGM(user, i);
    }

    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        this.A00.Dkl(this.A02);
    }
}
