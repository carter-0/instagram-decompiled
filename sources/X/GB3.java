package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GB3 implements C59545JNr {
    public GYV A00;
    public GYU A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final AnonymousClass07V A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass93U A06;
    public final C51982GAf A07;
    public final boolean A08;

    public GB3(AnonymousClass07V r4, UserSession userSession, AnonymousClass4DU r6, AnonymousClass93U r7, C51982GAf gAf) {
        this.A03 = r4;
        this.A04 = userSession;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = gAf;
        this.A08 = 182.A06(0Tu.A05, userSession, 36318913470143214L);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2oN, java.lang.Object] */
    public final void EBO(View view, C267324bN r11, C52058GDe gDe, 2el r13, int i) {
        C51974G9v.A1O(r13, view, r11, gDe);
        if (r11.A01 == C295365o2.NETEGO) {
            C2354830a A002 = AnonymousClass30Y.A00(r11, gDe, r11.getId());
            AnonymousClass07V r3 = this.A03;
            UserSession userSession = this.A04;
            AnonymousClass4DU r6 = this.A05;
            GYU gyu = new GYU(r3, userSession, r6, this.A06);
            this.A01 = gyu;
            A002.A00(gyu);
            if (this.A08) {
                GYV gyv = new GYV(C51972G9s.A0c(userSession), userSession, r6, AnonymousClass2oO.A00(userSession), new Object());
                this.A00 = gyv;
                A002.A00(gyv);
            }
            for (C233612w1 ABb : this.A07.A00) {
                ABb.ABb(A002);
            }
            for (C250603lj A003 : this.A02) {
                A002.A00(A003);
            }
            C51967G9n.A0z(view, A002, r13);
        }
    }
}
