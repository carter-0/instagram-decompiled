package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4lj  reason: invalid class name and case insensitive filesystem */
public final class C272974lj implements View.OnClickListener {
    public final /* synthetic */ C243613Zn A00;
    public final /* synthetic */ C252643pR A01;
    public final /* synthetic */ C243503Za A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public C272974lj(C243613Zn r1, C252643pR r2, C243503Za r3, AnonymousClass3W1 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1674304654);
        0eE r1 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01.A03;
        String id = r1.A01(userSession).getId();
        C243503Za r4 = this.A02;
        if (id.equals(r4.A0F.getId())) {
            0wc A022 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A022.A00(A022.A00, AnonymousClass000.A00(3370));
            if (A002.isSampled()) {
                A002.AAJ("tool", "");
                A002.AAJ("debug", "");
                A002.Cgf();
            }
        }
        ((C244183am) this.A00.A06.getValue()).A00(r4.A01, this.A03);
        AnonymousClass0fD.A0C(2003455903, A05);
    }
}
