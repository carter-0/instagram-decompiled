package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class PRZ implements C51922G7q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C254743sy A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public PRZ(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C254743sy r4, User user, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = r4;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = user;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void D84() {
        UserSession userSession;
        C67101MiL nbt;
        C254743sy r2 = this.A04;
        if (C66647MaG.A0F(r2)) {
            FragmentActivity fragmentActivity = this.A01;
            userSession = this.A03;
            AnonymousClass7TG.A1N(fragmentActivity, userSession);
            nbt = new C67100MiK(fragmentActivity, userSession);
        } else {
            FragmentActivity fragmentActivity2 = this.A01;
            userSession = this.A03;
            nbt = new C68966Nbt(fragmentActivity2, userSession);
        }
        nbt.A03(r2, AnonymousClass05K.A05);
        String A032 = C330397Mp.A03(r2);
        if (A032 != null) {
            0Aj A0H = C66583MXo.A0H(userSession);
            DbS.A1J(A0H, "block_action_chaining_delete_cta_clicked");
            C66580MXl.A1J(A0H, A032);
            A0H.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void De2() {
        UserSession userSession = this.A03;
        User user = this.A05;
        boolean z = true;
        if (user.BIW() != 1 && !182.A06(0Tu.A05, userSession, 36311328557629946L)) {
            z = false;
        }
        FragmentActivity fragmentActivity = this.A01;
        if (z) {
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            boolean z4 = this.A0A;
            String str = this.A06;
            String str2 = this.A07;
            String A032 = C330397Mp.A03(this.A04);
            if (A032 != null) {
                boolean z5 = z2;
                C71117OdB.A01(fragmentActivity, this.A02, userSession, (C231002qi) null, str, str2, A032, user.getId(), this.A00, z5, z3, z4, false, false);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            C71117OdB.A02(fragmentActivity, this.A02, userSession, user.getId(), this.A06, this.A09);
        }
        String A033 = C330397Mp.A03(this.A04);
        if (A033 != null) {
            0Aj A0H = C66583MXo.A0H(userSession);
            DbS.A1J(A0H, "block_action_chaining_report_cta_clicked");
            C66580MXl.A1J(A0H, A033);
            A0H.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onDismiss() {
        UserSession userSession = this.A03;
        String A032 = C330397Mp.A03(this.A04);
        if (A032 != null) {
            0Aj A0H = C66583MXo.A0H(userSession);
            DbS.A1J(A0H, "block_action_chaining_report_dismissed");
            C66580MXl.A1J(A0H, A032);
            A0H.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
