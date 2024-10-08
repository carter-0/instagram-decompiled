package X;

import com.instagram.common.cache.base.CacheKeyGenerator;
import com.instagram.common.session.UserSession;

/* renamed from: X.NRe  reason: case insensitive filesystem */
public final class C68648NRe extends 0ng {
    public final /* synthetic */ AnonymousClass13M A00;
    public final /* synthetic */ 0lg A01;

    public final void run() {
        0lg r5 = this.A01;
        C62880wX r6 = C61170le.A00;
        18g A012 = C638918c.A01(r6);
        A012.A0O(A012.A02, "CDN_CACHE_KEY_LIBRARY_INIT_START");
        if (r5 instanceof UserSession) {
            CacheKeyGenerator cacheKeyGenerator = (CacheKeyGenerator) r5.A01(CacheKeyGenerator.class, new C20611Wvs(r5, 24));
            if (cacheKeyGenerator != null && !cacheKeyGenerator.isInitialized()) {
                0Tu r3 = 0Tu.A05;
                String A04 = 182.A04(r3, r5, 36879857673699617L);
                if (182.A06(r3, r5, 36317895562958469L)) {
                    cacheKeyGenerator.enableLogging();
                }
                cacheKeyGenerator.initializeKeyGenerator(A04);
            }
        }
        18g A013 = C638918c.A01(r6);
        A013.A0O(A013.A02, "CDN_CACHE_KEY_LIBRARY_INIT_END");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68648NRe(AnonymousClass13M r4, 0lg r5) {
        super(1311468058, 3, false, false);
        this.A00 = r4;
        this.A01 = r5;
    }
}
