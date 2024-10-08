package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.HDg  reason: case insensitive filesystem */
public final class C54433HDg extends C252733pa {
    public final LruCache A00 = new LruCache(30);
    public final C55596HkG A01;
    public final UserSession A02;
    public final 1E8 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54433HDg(UserSession userSession) {
        super("barcelona_permalink_prefetch", AnonymousClass43D.A00(1751638608));
        1E8 A002 = 1E7.A00(userSession);
        C55596HkG hkG = new C55596HkG(C51966G9m.A0P(userSession), userSession);
        this.A02 = userSession;
        this.A03 = A002;
        this.A01 = hkG;
    }

    public final void close() {
        super.close();
        this.A00.evictAll();
    }
}
