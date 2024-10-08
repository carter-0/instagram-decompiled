package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjs  reason: case insensitive filesystem */
public final class C50874Fjs implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A2l;
        String obj = uri.toString();
        UserSession userSession = this.A02;
        if (r1.A01(userSession, obj)) {
            AnonymousClass0t1.A01.A01(userSession);
            C324476zN.A0P(this.A00, userSession, this.A01.getModuleName(), "megaphone", true);
        } else if (2bg.A2k.A01(userSession, uri.toString())) {
            C249713kF.A00.A0c(this.A00, userSession, this.A01.getModuleName(), true);
        }
    }

    public C50874Fjs(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
