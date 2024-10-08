package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjd  reason: case insensitive filesystem */
public final class C50859Fjd implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final Ey8 A02;

    public C50859Fjd(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = new Ey8(r2, userSession);
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Ey8 ey8 = this.A02;
        ey8.A00 = new C51657FyJ(ey8, 10);
        FG4.A02(ey8.A02, ey8, 13);
    }
}
