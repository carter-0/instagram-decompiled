package X;

import android.os.Bundle;
import com.instagram.user.model.User;

/* renamed from: X.El1  reason: case insensitive filesystem */
public abstract class C48839El1 {
    public static E5l A00(Bundle bundle, C51868G5f g5f, User user) {
        E5l e5l = new E5l();
        C320236s2.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        C320236s2.A01(bundle, AnonymousClass000.A00(220));
        e5l.setArguments(bundle);
        e5l.A04 = g5f;
        e5l.A05 = user;
        return e5l;
    }
}
