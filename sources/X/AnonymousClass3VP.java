package X;

/* renamed from: X.3VP  reason: invalid class name */
public abstract class AnonymousClass3VP {
    public static final boolean A00(1Xg r4) {
        if (r4 == null) {
            return false;
        }
        1UQ r2 = r4.A06;
        if (r2 != 1UQ.A0Y && r2 != 1UQ.A0l) {
            return r2 == 1UQ.A0K || r2 == 1UQ.A0T;
        }
        1Xj A02 = 1Xi.A02(r4.A05);
        if (A02 == null || !A02.CcK()) {
            return false;
        }
    }

    public static final boolean A02(1Xg r1) {
        0qQ.A0B(r1, 0);
        return AnonymousClass3VO.A09(1Xi.A02(r1.A05));
    }

    public static final boolean A03(1Xg r3) {
        if (r3 == null) {
            return false;
        }
        1UQ r2 = r3.A06;
        if (r2 == 1UQ.A0m) {
            AnonymousClass1Xn r1 = r3.A05;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.feed.feeditem.StoriesNetegoItem");
            Boolean bool = ((C275464qK) r1).A00.A03;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } else if (r2 != 1UQ.A0C) {
            return (r3.A05 instanceof AnonymousClass3O9) && r2 != 1UQ.A0K;
        } else {
            AnonymousClass1Xn r12 = r3.A05;
            0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
            return ((AnonymousClass3Y6) r12).A0P;
        }
    }

    public static final boolean A04(1Xg r3) {
        1Xj A02;
        0qQ.A0B(r3, 0);
        if (r3.A06 != 1UQ.A0Y || (A02 = 1Xi.A02(r3.A05)) == null || A02.CcK()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(1Xg r1) {
        if (A00(r1) || A03(r1)) {
            return true;
        }
        return false;
    }
}
