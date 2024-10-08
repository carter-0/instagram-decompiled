package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6n  reason: case insensitive filesystem */
public final class C54296H6n extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final C56605I4e A02;
    public final C362088hK A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        C362088hK r4 = this.A03;
        return new C52962GgF(application, userSession, this.A02, r4, this.A04, this.A06, this.A05);
    }

    public C54296H6n(Application application, UserSession userSession, C56605I4e i4e, C362088hK r4, String str, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = i4e;
        this.A06 = z;
        this.A04 = str;
        this.A05 = z2;
    }
}
