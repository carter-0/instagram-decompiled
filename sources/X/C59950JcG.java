package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.JcG  reason: case insensitive filesystem */
public final class C59950JcG implements 1UV {
    public static final C59950JcG A00 = new C59950JcG();

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        AnonymousClass5IC r4 = (AnonymousClass5IC) obj;
        0qQ.A0A(r4);
        UserStoryTarget A01 = r4.A01();
        if (!(A01 == UserStoryTarget.A01 || A01 == UserStoryTarget.A02 || A01 == UserStoryTarget.A06 || A01 == UserStoryTarget.A07 || A01 == UserStoryTarget.A03 || A01 == UserStoryTarget.A09)) {
            0qQ.A0A(A01);
            if (0qQ.A0K(A01.CAh(), "ALL_WITH_BLACKLIST") || 0qQ.A0K(A01.CAh(), "CLOSE_FRIENDS_WITH_BLACKLIST")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
