package X;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.MuJ  reason: case insensitive filesystem */
public final class C67762MuJ extends 2Z7 {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67762MuJ(Application application, UserSession userSession, Integer num) {
        super(application);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = num;
    }

    public final 2YL create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        OO6 A002 = C69891Ntt.A00(application, userSession, this.A02);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        0qQ.A07(googleApiAvailability);
        return new C60096Jfc(application, new C67346MmN(googleApiAvailability), userSession, A002);
    }
}
