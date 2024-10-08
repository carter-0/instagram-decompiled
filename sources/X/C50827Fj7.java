package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fj7  reason: case insensitive filesystem */
public final class C50827Fj7 implements G6H {
    public final ELU A00;
    public final C46525DgS A01;

    public final void CI0(Uri uri, Bundle bundle) {
        synchronized (C50827Fj7.class) {
            C46525DgS dgS = this.A01;
            synchronized (dgS) {
                1KM.A02(dgS.A00, false);
            }
            this.A00.A06("ig_fb_reauth", (List) null);
        }
    }

    public C50827Fj7(Fragment fragment, UserSession userSession) {
        this.A01 = new C46525DgS(userSession);
        this.A00 = C48920EmK.A00().A01(fragment, userSession, new C51127Foz(5));
    }
}
