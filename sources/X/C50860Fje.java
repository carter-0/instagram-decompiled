package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fje  reason: case insensitive filesystem */
public final class C50860Fje implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final Ey8 A02;

    public C50860Fje(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = new Ey8(r2, userSession);
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Ey8 ey8 = this.A02;
        C48920EmK.A00().A01(ey8.A01, ey8.A02, new C51130Fp2(ey8, 3)).A06("ig_fb_profile_link_integration", (List) null);
    }
}
