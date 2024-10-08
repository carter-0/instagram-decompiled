package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OZw  reason: case insensitive filesystem */
public final class C71035OZw {
    public final Activity A00;
    public final UserSession A01;
    public final C71144Ody A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C58179Inj(this, 24));

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (A01() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r7 == r1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A01, 2342164778839516912L) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (X.AnonymousClass7TG.A1a(r3, r3.A1M, X.1Av.A8a, 497) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A01, 2342164778839516912L) == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59732JVq A02(java.lang.Integer r10) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            android.app.Activity r1 = r9.A00
            r0 = 27
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.7vz r7 = X.1DL.A00(r1, r0)
            X.0qQ.A07(r7)
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.7vz r8 = X.1DL.A00(r1, r0)
            X.0qQ.A07(r8)
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L_0x002e
            r1 = 7
            r0 = 5
            X.JVq r3 = new X.JVq
            r3.<init>((int) r1, (int) r0, (boolean) r5, (boolean) r5)
            return r3
        L_0x002e:
            int r1 = r10.intValue()
            r4 = 0
            r2 = 1
            if (r1 == r5) goto L_0x00c2
            r0 = 3
            if (r1 == r0) goto L_0x00b5
            if (r1 == r2) goto L_0x0063
            r0 = 2
            if (r1 != r0) goto L_0x00b0
            X.7vz r1 = X.C346927vz.GRANTED
            if (r7 == r1) goto L_0x0044
            if (r8 != r1) goto L_0x0045
        L_0x0044:
            r5 = 1
        L_0x0045:
            if (r7 == r1) goto L_0x0050
            if (r8 == r1) goto L_0x0050
            boolean r0 = r9.A01()
            r6 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x005b
            if (r8 != r1) goto L_0x005c
            if (r7 == r1) goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            r0 = 5
            X.JVq r3 = new X.JVq
            r3.<init>((boolean) r5, (boolean) r6, (boolean) r4, (int) r0)
            return r3
        L_0x0063:
            X.7vz r6 = X.C346927vz.GRANTED
            if (r7 == r6) goto L_0x0078
            if (r8 == r6) goto L_0x0078
            com.instagram.common.session.UserSession r3 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342164778839516912(0x20810a75002926f0, double:4.067086372822106E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            r5 = 1
        L_0x0079:
            if (r7 == r6) goto L_0x00ae
            if (r8 == r6) goto L_0x00ae
            boolean r0 = r9.A01()
            if (r0 != 0) goto L_0x0097
            X.0eM r0 = r9.A03
            java.lang.Object r3 = r0.getValue()
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A1M
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 497(0x1f1, float:6.96E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x00ae
        L_0x0097:
            r6 = 1
        L_0x0098:
            boolean r0 = r9.A01()
            if (r0 != 0) goto L_0x005c
            com.instagram.common.session.UserSession r3 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342164778839516912(0x20810a75002926f0, double:4.067086372822106E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x005b
        L_0x00ae:
            r6 = 0
            goto L_0x0098
        L_0x00b0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b5:
            X.7vz r0 = X.C346927vz.GRANTED
            boolean r1 = X.AnonymousClass7TF.A1W(r7, r0)
            r0 = 5
            X.JVq r3 = new X.JVq
            r3.<init>((boolean) r1, (boolean) r5, (boolean) r2, (int) r0)
            return r3
        L_0x00c2:
            X.7vz r0 = X.C346927vz.GRANTED
            if (r7 == r0) goto L_0x00ce
            r2 = 0
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x00ce
            r4 = 1
        L_0x00ce:
            boolean r0 = r9.A01()
            r1 = r0 ^ 1
            r0 = 5
            X.JVq r3 = new X.JVq
            r3.<init>((boolean) r2, (boolean) r4, (boolean) r1, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71035OZw.A02(java.lang.Integer):X.JVq");
    }

    public static final void A00(C71035OZw oZw, C62320sa r7) {
        UserSession userSession = oZw.A01;
        if (182.A06(0Tu.A05, userSession, 36330514176623267L)) {
            1Wr r1 = 1Wr.A00;
            if (r1 != null) {
                r1.requestLocationPermission(oZw.A00, userSession, new C19425WYu(r7, 2), true, "FriendMapPermissionManager", C16530Uwa.FRIEND_MAP);
                return;
            }
            return;
        }
        JTP.A11(oZw.A00, new C19253WRm(r7, 3), AnonymousClass000.A00(27));
    }

    private final boolean A01() {
        Activity activity = this.A00;
        String A002 = AnonymousClass000.A00(27);
        C346927vz A003 = 1DL.A00(activity, A002);
        0qQ.A07(A003);
        if (A003.A00 || !1DL.A05(activity, A002)) {
            return false;
        }
        return true;
    }

    public final void A03() {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            W38.A06(activity, (Integer) null);
        }
    }

    public final boolean A04() {
        C346927vz A002 = 1DL.A00(this.A00, AnonymousClass000.A00(21));
        0qQ.A07(A002);
        return AnonymousClass7TF.A1W(A002, C346927vz.GRANTED);
    }

    public final boolean A05() {
        C346927vz A002 = 1DL.A00(this.A00, AnonymousClass000.A00(27));
        0qQ.A07(A002);
        return AnonymousClass7TF.A1W(A002, C346927vz.GRANTED);
    }

    public C71035OZw(Activity activity, UserSession userSession, C71144Ody ody) {
        AnonymousClass7TG.A1Q(userSession, ody);
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = ody;
    }
}
