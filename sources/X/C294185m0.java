package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.5m0  reason: invalid class name and case insensitive filesystem */
public abstract class C294185m0 {
    public static final long A00(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 0);
        User A2A = r2.A2A(userSession);
        if (A2A == null) {
            return -1;
        }
        long parseLong = Long.parseLong(A2A.getId());
        if (Long.valueOf(parseLong) != null) {
            return parseLong;
        }
        return -1;
    }

    public static final Long A03(1Xj r1, Integer num) {
        int intValue;
        0qQ.A0B(r1, 0);
        if (!r1.A5D() || num == null || (intValue = num.intValue()) == -1) {
            return null;
        }
        return Long.valueOf((long) intValue);
    }

    public static final String A06(UserSession userSession, 1Xj r2) {
        FollowStatus followStatus;
        0qQ.A0B(userSession, 0);
        Parcelable.Creator creator = User.CREATOR;
        User A2A = r2.A2A(userSession);
        if (A2A != null) {
            followStatus = A2A.B6o();
        } else {
            followStatus = null;
        }
        return 1aC.A06(followStatus);
    }

    public static final String A07(UserSession userSession, 1Xj r2, AnonymousClass4DU r3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 2);
        if (AnonymousClass3WX.A02(r2, r3)) {
            return C231122qu.A0F(userSession, r2);
        }
        return r2.A0C.getOrganicTrackingToken();
    }

    public static final String A08(1Xj r2) {
        0qQ.A0B(r2, 0);
        if (!r2.A5D() || (r2 = r2.A1c(0)) != null) {
            return r2.A0C.AYt();
        }
        return null;
    }

    public static final String A09(1Xj r1) {
        0qQ.A0B(r1, 0);
        String id = r1.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A0A(1Xj r4, Integer num) {
        1Xj A1c;
        if (!r4.A5D() || num == null || num.intValue() == -1 || (A1c = r4.A1c(0)) == null) {
            return null;
        }
        return A1c.getId();
    }

    public static final Long A01(UserSession userSession, 1Xj r1) {
        String A07 = C231122qu.A07(userSession, r1);
        if (A07 != null) {
            return 00y.A0n(10, A07);
        }
        return null;
    }

    public static final Long A02(UserSession userSession, 1Xj r2) {
        if (r2.CcK()) {
            return Long.valueOf((long) C243483Yy.A00.A06(userSession, r2).size());
        }
        return null;
    }

    public static final Long A04(1Xj r3, Integer num) {
        int intValue;
        1Xj A1c;
        if (!r3.A5D() || num == null || (intValue = num.intValue()) == -1 || (A1c = r3.A1c(intValue)) == null) {
            return null;
        }
        return Long.valueOf((long) A1c.BR7().A00);
    }

    public static final Long A05(1Xj r2, Integer num) {
        if (!r2.A5D() || num == null || num.intValue() == -1) {
            return null;
        }
        return Long.valueOf((long) r2.A0o());
    }

    public static final String A0B(1Xj r3, Integer num) {
        int intValue;
        1Xj A1c;
        if (!r3.A5D() || num == null || (intValue = num.intValue()) == -1 || (A1c = r3.A1c(intValue)) == null) {
            return null;
        }
        return A1c.getId();
    }
}
