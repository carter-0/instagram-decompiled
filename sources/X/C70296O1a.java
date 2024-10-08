package X;

/* renamed from: X.O1a  reason: case insensitive filesystem */
public abstract class C70296O1a {
    public static final C69360Nk0 A00(String str) {
        0qQ.A0B(str, 0);
        C69360Nk0 nk0 = C69360Nk0.EVERYONE;
        if (!"everyone".equals(str)) {
            nk0 = C69360Nk0.PEOPLE_YOU_FOLLOW;
            if (!"people_you_follow".equals(str)) {
                nk0 = C69360Nk0.OFF;
                if (!"off".equals(str)) {
                    throw AnonymousClass7TE.A0w("Could not convert to UserTagSettings");
                }
            }
        }
        return nk0;
    }
}
