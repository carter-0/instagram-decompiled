package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3EM  reason: invalid class name */
public abstract class AnonymousClass3EM {
    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A07(userSession, 36325974396319157L) || A07(userSession, 36325974396188083L)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, boolean z) {
        long j;
        0qQ.A0B(userSession, 0);
        if (A05(18301950866428154L, true) && A07(userSession, 2342162562633702879L)) {
            if (!z) {
                return false;
            }
            if (!A07(userSession, 36319553420074464L)) {
                j = 18301950868590862L;
            } else if (A07(userSession, 36319553420205538L)) {
                return false;
            } else {
                j = 18310682534031968L;
            }
            if (!A05(j, true)) {
                return false;
            }
        }
        if (A05(18301950868132107L, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, boolean z) {
        boolean A05;
        0qQ.A0B(userSession, 0);
        if (!A07(userSession, 2342162562633702879L)) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (!A07(userSession, 36319553420074464L)) {
            A05 = A07(userSession, 36325089632924258L);
        } else if (A07(userSession, 36319553420205538L)) {
            return true;
        } else {
            A05 = A05(18310682534031968L, true);
        }
        return !A05;
    }

    public static final boolean A05(long j, boolean z) {
        if (z) {
            1AW.A05(j);
        }
        0Tu r1 = 0Tu.A04;
        if (!z) {
            r1 = 0Tu.A00(r1);
            r1.A03 = true;
        }
        0qQ.A0A(r1);
        return 1AW.A06(r1, j);
    }

    public static final int A00(int i) {
        if (A05(18301950867214593L, true)) {
            return 1;
        }
        if (A05(18301950866559228L, true)) {
            return 2;
        }
        return i;
    }

    public static final boolean A01() {
        return A05(18301950865182964L, true);
    }

    public static final boolean A02() {
        return A05(18301950865051890L, true);
    }

    public static final boolean A03() {
        return A05(18301950865117427L, true);
    }

    public static final boolean A04() {
        if (!A05(18301950865379573L, true) || !A05(18301950867476738L, true)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, long j) {
        boolean Agw;
        boolean A05 = A05(18312026858206979L, true);
        1AA A02 = 182.A02(userSession, j);
        if (A05) {
            if (A02 == null) {
                return false;
            }
            Agw = A02.Ah0(0Tu.A04, j);
        } else if (A02 == null) {
            return false;
        } else {
            Agw = A02.Agw(j);
        }
        if (Agw) {
            return true;
        }
        return false;
    }
}
