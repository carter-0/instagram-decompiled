package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* renamed from: X.H6i  reason: case insensitive filesystem */
public final class C54291H6i extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final C56605I4e A02;
    public final MagicModLaunchParams A03;
    public final String A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C52973GgQ(application, userSession, this.A02, new C55615Hka(userSession), this.A03, this.A04, this.A05);
    }

    public C54291H6i(Application application, UserSession userSession, C56605I4e i4e, MagicModLaunchParams magicModLaunchParams, String str, boolean z) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = i4e;
        this.A03 = magicModLaunchParams;
        this.A05 = z;
        this.A04 = str;
    }
}
