package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.FcD  reason: case insensitive filesystem */
public final class C50465FcD implements C51873G5k {
    public final /* synthetic */ AnonymousClass36O A00;
    public final /* synthetic */ String A01;

    public C50465FcD(AnonymousClass36O r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final void D5S() {
        Uri fromFile = Uri.fromFile(new File(this.A01));
        AnonymousClass36O r4 = this.A00;
        AnonymousClass36O.A00(fromFile, r4, 1);
        C50335FYr A002 = C48927EmR.A00(r4.A04);
        UserSession userSession = A002.A01;
        0Tu r2 = 0Tu.A05;
        if ((182.A06(r2, userSession, 2342155969858897461L) && A002.A00.A03 && !C50335FYr.A00(A002, false) && 182.A06(r2, userSession, 36312952055531058L)) || (182.A06(r2, userSession, 2342155969858897461L) && A002.A00.A04 && !C50335FYr.A00(A002, false) && 182.A06(r2, userSession, 36312956350498356L))) {
            r4.A00 = true;
        }
    }
}
