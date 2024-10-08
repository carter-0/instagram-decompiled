package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.354  reason: invalid class name */
public final class AnonymousClass354 {
    public WeakReference A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C228062kj A03;

    public static final C227802jw A00(AnonymousClass354 r0) {
        WeakReference weakReference = r0.A00;
        if (weakReference != null) {
            return (C227802jw) weakReference.get();
        }
        return null;
    }

    public AnonymousClass354(UserSession userSession, AnonymousClass4DU r3, C227802jw r4, C228062kj r5) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = new WeakReference(r4);
    }
}
