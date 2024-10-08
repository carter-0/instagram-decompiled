package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7SV  reason: invalid class name */
public final class AnonymousClass7SV implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public AnonymousClass7SV(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass9H7 r0 = this.A00;
        UserSession userSession = r0.A10;
        Context context = r0.A02;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        return new A5T(userSession, applicationContext);
    }
}
