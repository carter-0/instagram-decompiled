package X;

import android.view.View;
import com.instagram.user.model.User;

public final /* synthetic */ class FMz implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass74j A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ FMz(AnonymousClass74j r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        String str;
        AnonymousClass74j r6 = this.A00;
        User user = this.A01;
        if (user.A03.BcS() != null) {
            C321716ud A002 = C321706uc.A00(r6.A07);
            boolean z = true;
            if (user.A03.BcS().BcT().size() <= 1) {
                z = false;
            }
            0Aj A0e = AnonymousClass7TE.A0e(A002.A01, "instagram_ibc_profile_actions");
            if (A0e.isSampled()) {
                Dbc.A0Z(A0e, A002);
                Dba.A1B(A0e, "source", C273654mx.A00(3479));
                if (z) {
                    str = AnonymousClass000.A00(544);
                } else {
                    str = "single_channel_rendered";
                }
                Dbc.A0a(A0e, A002, user, str);
                Dba.A18(A0e);
                String str2 = A002.A00;
                if (str2 == null) {
                    0qQ.A0F("sessionId");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    A0e.AAJ(DcV.A02(114, 10, 118), str2);
                    A0e.Cgf();
                }
            }
        }
        ((AnonymousClass7YC) r6.A0A).CpO(r6.A05, user, "creator_dm", false);
    }
}
