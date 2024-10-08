package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.Det  reason: case insensitive filesystem */
public final class C46432Det {
    public boolean A00;
    public boolean A01;
    public final Bundle A02;
    public final UserSession A03;
    public final C46443Df5 A04;
    public final String A05;
    public final boolean A06;
    public final FollowListData A07;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r0 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46432Det(android.os.Bundle r3, com.instagram.common.session.UserSession r4, com.instagram.user.recommended.FollowListData r5) {
        /*
            r2 = this;
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r2.<init>()
            r2.A02 = r3
            r2.A03 = r4
            r2.A07 = r5
            if (r5 == 0) goto L_0x002c
            java.lang.String r1 = r5.A02
        L_0x0011:
            java.lang.String r0 = r4.A06
            boolean r0 = X.2R8.A07(r0, r1)
            r2.A06 = r0
            java.lang.String r0 = "FollowListFragment.Group"
            java.lang.String r0 = r3.getString(r0)
            r2.A05 = r0
            if (r5 == 0) goto L_0x0027
            X.Df5 r0 = r5.A00
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            X.Df5 r0 = X.C46443Df5.UNKNOWN
        L_0x0029:
            r2.A04 = r0
            return
        L_0x002c:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46432Det.<init>(android.os.Bundle, com.instagram.common.session.UserSession, com.instagram.user.recommended.FollowListData):void");
    }

    public static final boolean A00(C46432Det det) {
        String str = det.A05;
        if ("creators".equals(str) || "businesses".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this.A06) {
            return false;
        }
        C46443Df5 df5 = this.A04;
        if (df5 != C46443Df5.FOLLOWERS && df5 != C46443Df5.FOLLOWING) {
            return false;
        }
        if (!182.A06(0Tu.A06, this.A03, 36324853409788329L)) {
            return false;
        }
        if (this.A00 || this.A01) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        FollowListData followListData = this.A07;
        if (followListData != null) {
            UserSession userSession = this.A03;
            User A022 = 17h.A00(userSession).A02(followListData.A02);
            if (A022 == null || A022.A2K() || ((!A04() && !A06()) || !182.A06(0Tu.A06, userSession, 36315644999765442L))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (0qQ.A0K(this.A05, "non_recip_followers") && this.A02.getBoolean("FollowListFragment.HideRemoveButton", false)) {
            if (!182.A06(0Tu.A05, this.A03, 36315644999896516L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A03, 36315644999962053L) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r5 = this;
            boolean r0 = A00(r5)
            r4 = 1
            if (r0 != 0) goto L_0x0022
            boolean r0 = r5.A04()
            if (r0 != 0) goto L_0x0013
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0023
        L_0x0013:
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315644999962053(0x8104e300030dc5, double:3.0294983571165157E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r4
        L_0x0023:
            boolean r4 = r5.A01()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46432Det.A02():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A03, 36315645000027590L) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r5 = this;
            boolean r0 = A00(r5)
            r4 = 1
            if (r0 != 0) goto L_0x0022
            boolean r0 = r5.A04()
            if (r0 != 0) goto L_0x0013
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0023
        L_0x0013:
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315645000027590(0x8104e300040dc6, double:3.0294983571579615E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r4
        L_0x0023:
            boolean r4 = r5.A01()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46432Det.A03():boolean");
    }

    public final boolean A04() {
        if (!A00(this)) {
            if (!0qQ.A0K(this.A05, "non_recip_followers") || this.A02.getBoolean("FollowListFragment.HideRemoveButton", false)) {
                return false;
            }
            if (182.A06(0Tu.A05, this.A03, 36315644999830979L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
