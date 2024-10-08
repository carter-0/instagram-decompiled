package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.LcJ  reason: case insensitive filesystem */
public final class C64459LcJ implements 1UV {
    public static final C64459LcJ A00 = new C64459LcJ();

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        AnonymousClass5IC r4 = (1us) obj;
        if (!(r4 instanceof AnonymousClass5IC)) {
            return false;
        }
        UserStoryTarget A01 = r4.A01();
        if (A01 != null) {
            if (!(A01 == UserStoryTarget.A01 || A01 == UserStoryTarget.A02 || A01 == UserStoryTarget.A09)) {
                String CAh = A01.CAh();
                if (CAh == null) {
                    return false;
                }
                if (CAh.equals("ALL_WITH_BLACKLIST") || CAh.equals("CLOSE_FRIENDS_WITH_BLACKLIST")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }
}
