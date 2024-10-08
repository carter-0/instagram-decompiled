package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTo  reason: case insensitive filesystem */
public final class C70967OTo {
    public final 1aU A00;
    public final UserSession A01;
    public final OW5 A02;
    public final C70971OTs A03;
    public final C67458MoD A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public /* synthetic */ C70967OTo(UserSession userSession) {
        1aU A002 = OP5.A00(userSession, "EncryptedBackupsBlockNuxManager");
        OW5 A003 = C69900Nu2.A00(userSession);
        C70971OTs oTs = new C70971OTs(userSession);
        C67458MoD moD = new C67458MoD(userSession);
        AnonymousClass7TG.A1U(userSession, A002, A003);
        this.A01 = userSession;
        this.A00 = A002;
        this.A02 = A003;
        this.A03 = oTs;
        this.A04 = moD;
        0eO r1 = 0eO.A02;
        this.A06 = C67485Mof.A00(this, r1, 34);
        this.A08 = AnonymousClass0eN.A00(r1, C73730Pir.A00);
        this.A05 = C67485Mof.A00(this, r1, 33);
        this.A07 = AnonymousClass0eN.A00(r1, C73729Piq.A00);
    }

    public static final void A00(Activity activity, Fragment fragment, C70967OTo oTo, boolean z, boolean z2) {
        C69358Njy njy;
        Bundle A0a;
        AnonymousClass0eM r1 = oTo.A06;
        if (!C66582MXn.A1X(r1) || !((AnonymousClass65E) r1.getValue()).A02(activity)) {
            njy = C69358Njy.SETUP_PIN_HARDBLOCK_V2;
        } else {
            njy = C69358Njy.GDRIVE_OPTIN_HARD_BLOCK;
        }
        if (z) {
            A0a = DbY.A0B("BUNDLE_IS_HARDBLOCK_RELEASE", AnonymousClass7TE.A0v());
        } else {
            A0a = AnonymousClass7TE.A0a();
        }
        A0a.putBoolean("BUNDLE_HAS_IMPLICIT_BACKUP", z2);
        OW5 ow5 = oTo.A02;
        Integer num = AnonymousClass05K.A1I;
        Integer num2 = AnonymousClass05K.A0j;
        if (((AnonymousClass65E) ow5.A03.getValue()).A00()) {
            11Z.A03(new C73397Pbu(A0a, fragment, njy, ow5, num, num2));
        }
    }
}
