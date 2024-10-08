package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.MoE  reason: case insensitive filesystem */
public final class C67459MoE {
    public boolean A00;
    public final UserSession A01;
    public final C67458MoD A02;
    public final C67460MoF A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public C67459MoE(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        0eO r1 = 0eO.A02;
        this.A08 = C67485Mof.A00(this, r1, 49);
        this.A04 = C67485Mof.A00(this, r1, 44);
        this.A05 = C67485Mof.A00(this, r1, 45);
        this.A06 = C67485Mof.A00(this, r1, 46);
        this.A07 = C67485Mof.A00(this, r1, 48);
        this.A02 = new C67458MoD(userSession);
        this.A03 = new C67460MoF(userSession);
    }

    public final void A00(Fragment fragment, UserSession userSession, C74312Pso pso, Integer num) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass65E A002 = AnonymousClass65D.A00(userSession);
        boolean A003 = A002.A00();
        0KC.A0D("EncryptedBackupsInboxLauncher", 002.A1D("maybeShowNux isEncryptedBackupsEnabled ", A003));
        if (A003) {
            if (AnonymousClass65A.A02(A002.A00, 36315949952012095L)) {
                C66580MXl.A0U(this.A06).A09();
                11Z.A04(new PV7(this), 120000);
            }
            AnonymousClass3HH A004 = AnonymousClass3HG.A00(userSession);
            if (A004.A00.getBoolean("eb_disable_nux", false)) {
                0KC.A0D("EncryptedBackupsInboxLauncher", "maybeShowNux nux disabled");
                ((NUX) this.A06.getValue()).A0H("NUX_DISABLED", AnonymousClass05K.A0C);
                return;
            }
            C72203OyT A005 = C69901Nu3.A00(userSession, O4G.A00);
            A005.A07(new C67609Mqh(0, this, A004, fragment, pso, num, userSession2, A005, A002));
        }
    }
}
