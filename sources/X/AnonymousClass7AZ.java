package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.7AZ  reason: invalid class name */
public final class AnonymousClass7AZ {
    public final C327257Ab A00 = new C327257Ab();
    public final Executor A01 = new 0na(163434731, 2, false, false);
    public final Executor A02 = C327247Aa.A00;
    public final Context A03;
    public final UserSession A04;
    public volatile C327297Af A05;

    public AnonymousClass7AZ(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }

    public final C327297Af A00() {
        C327297Af r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A03;
        String str = this.A04.A06;
        C327297Af r02 = new C327297Af(new C327277Ad(context, str), this.A01, this.A02);
        this.A05 = r02;
        return r02;
    }
}
