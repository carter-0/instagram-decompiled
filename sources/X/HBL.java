package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;

public final class HBL extends C320216s0 {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass57L A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final C242963Ww A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HBL(androidx.fragment.app.FragmentActivity r13, X.AnonymousClass0iw r14, X.0xF r15, com.instagram.common.session.UserSession r16, X.AnonymousClass57L r17, X.1Xj r18, X.AnonymousClass3W1 r19, X.C242963Ww r20, java.lang.Integer r21) {
        /*
            r12 = this;
            r0 = 1
            r6 = r14
            r8 = r16
            r2 = r20
            X.AnonymousClass7TG.A0w(r0, r8, r14, r2)
            java.lang.String r10 = "media"
            r3 = r19
            r0 = r21
            X.C51972G9s.A1E(r3, r0)
            r4 = r18
            java.lang.String r9 = r4.getId()
            java.lang.String r1 = "Required value was null."
            if (r9 == 0) goto L_0x004a
            java.lang.String r11 = X.C49180Eql.A00(r0)
            r5 = r12
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A02 = r8
            r12.A00 = r13
            r12.A01 = r14
            r12.A06 = r2
            r12.A04 = r4
            r12.A05 = r3
            r0 = r17
            r12.A03 = r0
            X.6s1 r0 = r12.A00
            java.lang.String r2 = r4.getId()
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = "parent_media_id"
            java.util.Map r0 = r0.A00
            r0.put(r1, r2)
            return
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HBL.<init>(androidx.fragment.app.FragmentActivity, X.0iw, X.0xF, com.instagram.common.session.UserSession, X.57L, X.1Xj, X.3W1, X.3Ww, java.lang.Integer):void");
    }

    public final void A02() {
        super.A02();
        AnonymousClass3W1 r2 = this.A05;
        r2.A2v = false;
        r2.A3F = false;
        r2.A3G = false;
        this.A06.Dkj(this.A04, r2);
    }

    public final void A03() {
        super.A03();
        AnonymousClass57L r1 = this.A03;
        if (r1 != null) {
            r1.A01 = true;
        }
    }

    public final void A05(View view, User user, int i) {
        super.A05(view, user, i);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            UserSession userSession = this.A02;
            C46474Dfc.A03(DbU.A0Q(fragmentActivity, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, user.getId(), "explore_chaining", this.A01.getModuleName()));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A08(User user, int i) {
        String str;
        super.A08(user, i);
        1Xj r0 = this.A04;
        UserSession userSession = this.A02;
        User A2A = r0.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = "";
        }
        String id = user.getId();
        Collection collection = (Collection) C55171HdN.A00(userSession).A00.get(str);
        if (collection != null) {
            AnonymousClass7TE.A1D(collection).remove(i);
        }
        1ES.A03(F88.A00(userSession, str, id));
    }

    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        User A2A = this.A04.A2A(this.A02);
        if (A2A != null) {
            this.A06.Dkl(A2A.getId());
        }
    }
}
