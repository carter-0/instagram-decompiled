package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.46p  reason: invalid class name and case insensitive filesystem */
public abstract class C2606746p {
    public static C271374ik A00(C282485Dg r4, C271434iq r5, 1Xj r6, Integer num, String str, String str2, int i) {
        if (Systrace.A0E(32)) {
            0fh.A01("DirectMessagePostProcessHelper.migrateToVisualMedia", -383801318);
        }
        try {
            C271374ik r1 = new C271374ik();
            r1.A03 = r4;
            r1.A05 = r6;
            r1.A04 = r5;
            r1.A0A = str;
            r1.A00 = i;
            if (num != null) {
                r1.A00 = Math.max(i, num.intValue());
            }
            r1.A09 = str2;
            if (r5 != null) {
                r1.A06 = r5.A0C;
                r1.A07 = r5.A0D;
                r1.A08 = r5.A0E;
                r1.A0B = r5.A0M;
            }
            return r1;
        } finally {
            if (Systrace.A0E(32)) {
                0fh.A00(-575035564);
            }
        }
    }

    public static 1Xj A01(UserSession userSession, 1Xj r5, String str) {
        User A02;
        if (Systrace.A0E(32)) {
            0fh.A01("DirectMessagePostProcessHelper.updateMediaCache", -1212622093);
        }
        if (r5 != null) {
            try {
                if (!(r5.getId() == null || r5.A2A(userSession) != null || (A02 = 17h.A00(userSession).A02(str)) == null)) {
                    r5.A0C.Epn(A02);
                    return 1E7.A00(userSession).A00(r5);
                }
            } finally {
                if (Systrace.A0E(32)) {
                    0fh.A00(1022956074);
                }
            }
        }
        if (Systrace.A0E(32)) {
            0fh.A00(-2033391762);
        }
        return r5;
    }

    public static 1Xj A02(UserSession userSession, 1Xj r5, String str) {
        User A02;
        if (Systrace.A0E(32)) {
            0fh.A01("DirectMessagePostProcessHelper.updateMediaCacheNotNull", -1231759664);
        }
        try {
            if (r5.A2A(userSession) != null || (A02 = 17h.A00(userSession).A02(str)) == null) {
                if (Systrace.A0E(32)) {
                    0fh.A00(-299285988);
                }
                return r5;
            }
            r5.A0C.Epn(A02);
            return 1E7.A00(userSession).A00(r5);
        } finally {
            if (Systrace.A0E(32)) {
                0fh.A00(-680044565);
            }
        }
    }
}
