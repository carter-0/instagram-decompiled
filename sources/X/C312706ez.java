package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ez  reason: invalid class name and case insensitive filesystem */
public final class C312706ez {
    public ARDFileCache A00;
    public ARDFileCache A01;
    public final C312506eX A02;

    public C312706ez(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = C312506eX.A00(userSession);
    }

    public final ARDFileCache A01() {
        ARDFileCache aRDFileCache = this.A00;
        if (aRDFileCache != null) {
            return aRDFileCache;
        }
        StashARDFileCache A002 = A00(584232554, 50 << 20);
        this.A00 = A002;
        return A002;
    }

    public final ARDFileCache A02() {
        ARDFileCache aRDFileCache = this.A01;
        if (aRDFileCache != null) {
            return aRDFileCache;
        }
        StashARDFileCache A002 = A00(206282182, 50 << 20);
        this.A01 = A002;
        return A002;
    }

    public static final StashARDFileCache A00(int i, long j) {
        1L7 A012 = 1L7.A01();
        AnonymousClass1LD r1 = new AnonymousClass1LD();
        r1.A05 = "<override-ignore>";
        r1.A09 = false;
        long j2 = j;
        r1.A01 = new 1Ff(j2, j, j, -1, false, false);
        return new StashARDFileCache(j2, A012.A06(A012.A08(r1.A00(), i), i));
    }
}
