package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Lv6  reason: case insensitive filesystem */
public final class C65537Lv6 implements MU6 {
    public final UserSession A00;

    public final String getName() {
        return "ArmadilloExpressMediaScrutinyStep";
    }

    public C65537Lv6(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r12) {
        C241503Pl A0m = JTQ.A0m(r12);
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A05, userSession, 36318892002122431L)) {
            A0m.resumeWith(C62012KVl.A00);
        } else {
            AnonymousClass3Q2 r3 = lp8.A0D;
            String str = r3.A1N.A0F;
            if (str != null) {
                Uri A09 = JTQ.A09(str);
                Uri fromFile = Uri.fromFile((File) AnonymousClass45D.A01.getValue());
                Integer A002 = C71023OYz.A00(r3.A1G);
                0qQ.A0A(A09);
                0qQ.A0A(fromFile);
                String str2 = r3.A3p;
                C64415LbW lbW = new C64415LbW(0, lp8, this, A0m);
                AnonymousClass7TG.A1U(A002, A09, fromFile);
                OXH.A02(new C73963Pmh(lbW, fromFile, A002, A09, str2, 11), userSession);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return A0m.A00();
    }
}
