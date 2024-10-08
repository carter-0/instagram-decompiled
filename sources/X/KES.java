package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class KES extends C228042kh {
    public final int A00;
    public final Application A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final String A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        String str = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        return new C60097Jfd(this.A01, this.A02, userSession, str, i, z);
    }

    public KES(Application application, AnonymousClass0iw r2, UserSession userSession, String str, int i, boolean z) {
        AnonymousClass7TG.A1O(userSession, application);
        this.A03 = userSession;
        this.A01 = application;
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        this.A02 = r2;
    }
}
