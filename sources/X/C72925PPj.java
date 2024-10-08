package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PPj  reason: case insensitive filesystem */
public final class C72925PPj implements 0Jp {
    public final /* synthetic */ int A00;

    public C72925PPj(int i) {
        this.A00 = i;
    }

    public final void ATC(UserSession userSession, 0Jv r5) {
        AnonymousClass7TG.A1N(userSession, r5);
        int i = this.A00;
        0xY AR4 = ((AnonymousClass2KK) userSession.A01(AnonymousClass2KK.class, new C73657PhW(userSession, 19))).A00.AR4();
        AR4.E5Z("direct_threads_badge_count", i);
        AR4.apply();
        r5.AId((Object) null);
    }
}
