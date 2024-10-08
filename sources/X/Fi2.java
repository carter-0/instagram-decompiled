package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class Fi2 implements G6H {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C51765G0h(this, 3));

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        ((C363548ju) this.A01.getValue()).A01(this.A00, "upsell", uri.getBooleanQueryParameter(AnonymousClass000.A00(1511), false));
    }

    public Fi2(UserSession userSession) {
        this.A00 = userSession;
    }
}
