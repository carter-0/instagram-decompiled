package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.6aR  reason: invalid class name and case insensitive filesystem */
public final class C310106aR {
    public final C310016aI A00;
    public final UserSession A01;
    public final C238513Cd A02;

    public C310106aR(UserSession userSession, C238513Cd r3, C310016aI r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        this.A00 = r4;
        this.A01 = userSession;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4LS, java.lang.Object] */
    public final void A00() {
        C230262pI r2 = this.A00.A0C;
        if (!r2.A07()) {
            C238513Cd r1 = this.A02;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis();
            linkedHashMap.putAll(((C228232l0) r1.A0B.getValue()).AUH("media/seen/"));
            linkedHashMap.putAll(((AnonymousClass4LR) r1.A07.getValue()).Bay("media/seen/"));
            r1.A01.EGc(new Object(), r1.A00.getModuleName(), "media/seen/", 00k.A0a(linkedHashMap.keySet()), 0Yt.A0B(linkedHashMap), (double) (System.currentTimeMillis() - currentTimeMillis));
            r2.A08 = linkedHashMap;
            C230262pI A04 = r2.A04();
            r2.A05();
            AnonymousClass2f9.A00(this.A01).A0L(A04);
        }
    }
}
