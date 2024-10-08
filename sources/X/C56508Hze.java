package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hze  reason: case insensitive filesystem */
public final class C56508Hze {
    public static final C55902HpP A02 = new Object();
    public final LruCache A00 = new LruCache(3);
    public final UserSession A01;

    public C56508Hze(UserSession userSession) {
        this.A01 = userSession;
    }
}
