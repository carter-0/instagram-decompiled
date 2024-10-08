package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ryg  reason: case insensitive filesystem */
public final class C10820Ryg {
    public boolean A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final C250973mM A04;
    public final C273384mU A05;
    public final T8G A06;
    public final AnonymousClass6LY A07;
    public final ERK A08 = new ERK(this, 6);

    public C10820Ryg(Activity activity, UserSession userSession, C250973mM r5, C273384mU r6) {
        this.A03 = userSession;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = activity;
        this.A07 = new AnonymousClass6LY(userSession);
        this.A06 = new T8G(userSession);
    }
}
