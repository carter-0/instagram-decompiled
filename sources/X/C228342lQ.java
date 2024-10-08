package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.2lQ  reason: invalid class name and case insensitive filesystem */
public abstract class C228342lQ {
    public static final 1Az A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36312879041545570L)) {
            return 1Az.A0A;
        }
        if (182.A06(r2, userSession, 36312879041480033L)) {
            return 1Az.A02;
        }
        if (182.A06(r2, userSession, 36312879041611107L)) {
            return 1Az.A03;
        }
        if (182.A06(r2, userSession, 36312879041676644L)) {
            return 1Az.A04;
        }
        if (182.A06(r2, userSession, 36312879041742181L)) {
            return 1Az.A05;
        }
        if (182.A06(r2, userSession, 36312879041938790L)) {
            return 1Az.A08;
        }
        return 1Az.A07;
    }

    public static final 1Az A01(1Av r3) {
        0qQ.A0B(r3, 0);
        String A0C = r3.A0C();
        1Az r2 = 1Az.A0A;
        if (0qQ.A0K(A0C, r2.toString())) {
            return r2;
        }
        String A0C2 = r3.A0C();
        1Az r22 = 1Az.A02;
        if (0qQ.A0K(A0C2, r22.toString())) {
            return r22;
        }
        String A0C3 = r3.A0C();
        1Az r23 = 1Az.A03;
        if (0qQ.A0K(A0C3, r23.toString())) {
            return r23;
        }
        String A0C4 = r3.A0C();
        1Az r24 = 1Az.A04;
        if (0qQ.A0K(A0C4, r24.toString())) {
            return r24;
        }
        String A0C5 = r3.A0C();
        1Az r25 = 1Az.A05;
        if (0qQ.A0K(A0C5, r25.toString())) {
            return r25;
        }
        String A0C6 = r3.A0C();
        1Az r26 = 1Az.A08;
        if (0qQ.A0K(A0C6, r26.toString())) {
            return r26;
        }
        String A0C7 = r3.A0C();
        1Az r27 = 1Az.A06;
        if (0qQ.A0K(A0C7, r27.toString())) {
            return r27;
        }
        String A0C8 = r3.A0C();
        1Az r28 = 1Az.A09;
        if (!0qQ.A0K(A0C8, r28.toString())) {
            return 1Az.A07;
        }
        return r28;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36312879042069863L);
    }

    public static final boolean A07(UserSession userSession, 1Av r2) {
        0qQ.A0B(r2, 0);
        1Az A01 = A01(r2);
        1Az r22 = 1Az.A07;
        if (A01 == r22 && A00(userSession) == r22) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Should replace with surface level implementation instead")
    public static final boolean A08(UserSession userSession, 1Av r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(userSession, 1);
        if (0qQ.A0K(r4.A0C(), 1Az.A0A.toString()) || 182.A06(0Tu.A05, userSession, 36312879041545570L)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, 1Av r4) {
        0qQ.A0B(r4, 0);
        if (!182.A06(0Tu.A05, userSession, 36312879042594159L)) {
            return false;
        }
        1Az A01 = A01(r4);
        1Az r1 = 1Az.A07;
        if (A01 == r1 && A00(userSession) == r1) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, 1Av r4) {
        0qQ.A0B(r4, 0);
        1Az A01 = A01(r4);
        1Az r1 = 1Az.A07;
        if ((A01 != r1 || A00(userSession) != r1) && 182.A06(0Tu.A05, userSession, 36312879042790770L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, 1Av r4) {
        0qQ.A0B(r4, 0);
        if (!0qQ.A0K(r4.A0C(), 1Az.A05.toString())) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36312879041742181L) || 0qQ.A0K(r4.A0C(), 1Az.A08.toString()) || 182.A06(r2, userSession, 36312879041938790L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        if (0qQ.A0K(1Au.A00(userSession).A0C(), 1Az.A0A.toString()) || 182.A06(0Tu.A05, userSession, 36312879041545570L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (!A03(userSession) || !182.A06(0Tu.A05, userSession, 36312879041348960L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        1Az A01 = A01(1Au.A00(userSession));
        1Az r2 = 1Az.A07;
        if (A01 == r2 && A00(userSession) == r2) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        if (!A05(userSession) || !182.A06(0Tu.A05, userSession, 36312879041348960L)) {
            return false;
        }
        return true;
    }
}
