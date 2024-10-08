package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Mb6  reason: case insensitive filesystem */
public final class C66699Mb6 {
    public static final C66699Mb6 A00 = new Object();

    public static final void A01(UserSession userSession, Capabilities capabilities, Mi5 mi5, C74516PwB pwB, List list, boolean z) {
        if (!capabilities.A00(C376179Gx.MARK_THREAD_AS_UNREAD)) {
            return;
        }
        if ((z || (2Ek.A02(0eE.A00(userSession).A00()) && ((Boolean) mi5.A05.getValue()).booleanValue())) && !pwB.CWb() && !pwB.Cdt()) {
            list.add(4);
        }
    }

    public static final void A02(UserSession userSession, Capabilities capabilities, C74516PwB pwB, List list, boolean z) {
        int i;
        if (capabilities.A00(C376179Gx.STAR_THREAD) && !pwB.CWb() && z) {
            if (!pwB.CUG() && !pwB.CVr() && (0eE.A00(userSession).A00().A1x() || (0eE.A00(userSession).A00().A20() && 182.A06(0Tu.A05, userSession, 36316830411002524L)))) {
                i = 34;
            } else if (!182.A06(0Tu.A05, userSession, 36322418163263662L)) {
                i = 3;
                if (pwB.CTo()) {
                    i = 11;
                }
            } else {
                return;
            }
            list.add(Integer.valueOf(i));
        }
    }

    public static final void A06(Mi5 mi5, List list) {
        if (mi5.A09) {
            list.add(2);
        }
    }

    public static final void A00(Context context, UserSession userSession, C74516PwB pwB, List list) {
        if ((pwB.CBV() instanceof DirectThreadKey) && LockedChatKillSwitch.isLockedChatEnabled(userSession, false)) {
            Q2C q2c = Q2C.A03;
            if (q2c == null) {
                q2c = new Q2C(context);
                Q2C.A03 = q2c;
            }
            if (q2c.A02()) {
                int i = 43;
                if (pwB.CWe()) {
                    i = 44;
                }
                list.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (((java.lang.Boolean) r6.A08.getValue()).booleanValue() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (((java.lang.Boolean) r6.A06.getValue()).booleanValue() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.session.UserSession r5, X.Mi5 r6, X.C74516PwB r7, java.util.List r8) {
        /*
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A02(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0028
            int r0 = r7.C6a()
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 != 0) goto L_0x0028
            X.0eM r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A03(r0)
            if (r0 == 0) goto L_0x0050
            int r0 = r7.C6a()
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 != 0) goto L_0x0050
            X.0eM r0 = r6.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            int r1 = r7.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x0085
            X.0eM r0 = r6.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0085
        L_0x0067:
            boolean r0 = r7.CZE()
            if (r0 == 0) goto L_0x0084
            if (r3 != 0) goto L_0x0073
            if (r2 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x0084
        L_0x0073:
            boolean r1 = r7.CZA()
            r0 = 24
            if (r1 == 0) goto L_0x007d
            r0 = 25
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x0084:
            return
        L_0x0085:
            r4 = 0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66699Mb6.A03(com.instagram.common.session.UserSession, X.Mi5, X.PwB, java.util.List):void");
    }

    public static final void A04(UserSession userSession, C74516PwB pwB, List list) {
        if (AnonymousClass9HV.A00(userSession).A00(C66647MaG.A08(pwB.CBV()), 25)) {
            int i = 8;
            if (pwB.isMuted()) {
                i = 13;
            }
            list.add(Integer.valueOf(i));
        }
    }

    public static final void A05(UserSession userSession, C74516PwB pwB, List list, int i) {
        int i2;
        if (pwB.C66() == 3 && 182.A06(0Tu.A05, userSession, 36317934218188449L)) {
            if (i != 3) {
                i2 = 36;
                if (2Ek.A03(0eE.A00(userSession).A00())) {
                    i2 = 35;
                }
            } else if (pwB.CUb()) {
                i2 = 38;
                if (2Ek.A03(0eE.A00(userSession).A00())) {
                    i2 = 37;
                }
            } else {
                return;
            }
            list.add(Integer.valueOf(i2));
        }
    }

    public static final boolean A07(UserSession userSession, C74516PwB pwB) {
        if (pwB.C6a() != 29 || !0qQ.A0K(pwB.AsX(), userSession.A06) || !182.A06(0Tu.A05, userSession, 36328680225521171L)) {
            return false;
        }
        return true;
    }
}
