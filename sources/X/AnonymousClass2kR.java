package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2kR  reason: invalid class name */
public final class AnonymousClass2kR extends 0lg {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public AnonymousClass2kR(Context context, UserSession userSession, AnonymousClass4DU r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = r4;
    }

    public final boolean hasEnded() {
        return false;
    }

    public final C62880wX getDeviceSession() {
        return this.A01.A03;
    }

    public final String getToken() {
        return this.A01.A05;
    }
}
