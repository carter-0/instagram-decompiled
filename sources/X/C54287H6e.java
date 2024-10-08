package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6e  reason: case insensitive filesystem */
public final class C54287H6e extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final String A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C52969GgM(this.A00, this.A01, this.A02, this.A03, this.A04);
    }

    public C54287H6e(Application application, UserSession userSession, AnonymousClass4DU r4, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, r4);
        0qQ.A0B(application, 5);
        this.A01 = userSession;
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = application;
    }
}
