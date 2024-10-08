package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JTr  reason: case insensitive filesystem */
public final class C59685JTr extends 0vM {
    public final /* synthetic */ C228692m9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59685JTr(C228692m9 r7) {
        super("prefetchNewsfeed", 353, 2, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A00;
        AnonymousClass4HO.A00(userSession, new AnonymousClass4HN(userSession)).A03(false);
    }
}
