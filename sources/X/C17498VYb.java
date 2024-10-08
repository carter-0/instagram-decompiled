package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.VYb  reason: case insensitive filesystem */
public final class C17498VYb {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final 1wY A03;

    public C17498VYb(Context context, UserSession userSession, AnonymousClass4DU r7, 1wY r8, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r7;
        this.A03 = r8;
        if (z) {
            AnonymousClass34R r3 = new AnonymousClass34R(userSession, (AnonymousClass34Q) null, r7.getModuleName());
            AnonymousClass34L r2 = new AnonymousClass34L(userSession, r7.getModuleName());
            String moduleName = r7.getModuleName();
            0qQ.A08(1wY.A0F);
            r8.A07(r2, r3, moduleName);
        }
    }
}
