package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.59S  reason: invalid class name */
public abstract class AnonymousClass59S {
    public static final void A00(UserSession userSession, String str, int i) {
        int i2;
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i2), "has_responsiveness", true);
        }
    }

    public static final void A05(UserSession userSession, String str, String str2, String str3, int i) {
        int i2;
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i2), str2, str3);
        }
    }

    public static final void A06(String str, UserSession userSession, 1Xj r9) {
        String str2;
        boolean z;
        int i;
        String str3;
        User CCd;
        User CCd2;
        if (r9 == null || (CCd2 = r9.A0C.CCd()) == null) {
            str2 = null;
        } else {
            str2 = CCd2.getId();
        }
        A03(userSession, str2, str, 766842320);
        if (r9 != null) {
            z = r9.A5D();
        } else {
            z = false;
        }
        0eP r4 = new 0eP("is_carousel", Boolean.valueOf(z));
        int i2 = -1;
        if (r9 != null) {
            i = r9.A0v();
        } else {
            i = -1;
        }
        0eP r3 = new 0eP("number_of_likes", Integer.valueOf(i));
        if (r9 != null) {
            i2 = r9.A0r();
        }
        for (0eP r0 : 0sr.A1P(new 0eP[]{r4, r3, new 0eP("number_of_comments", Integer.valueOf(i2))})) {
            String str4 = (String) r0.A00;
            Object obj = r0.A01;
            if (r9 == null || (CCd = r9.A0C.CCd()) == null) {
                str3 = null;
            } else {
                str3 = CCd.getId();
            }
            A05(userSession, str3, str4, obj.toString(), 766842320);
        }
    }

    public static final void A01(UserSession userSession, String str, int i) {
        int i2;
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowEndSuccess(A00.generateFlowId(i, i2));
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        int i;
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            A00.flowMarkPoint(A00.generateFlowId(766842320, i), str2);
        }
    }

    public static final void A03(UserSession userSession, String str, String str2, int i) {
        int i2;
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowStart(A00.generateFlowId(i, i2), new UserFlowConfig(str2, false));
        }
    }

    public static final void A04(UserSession userSession, String str, String str2, int i, int i2) {
        int i3;
        if (AnonymousClass59T.A00(userSession).booleanValue()) {
            1QP A00 = AnonymousClass1QO.A00(userSession);
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i3), str2, i2);
        }
    }
}
