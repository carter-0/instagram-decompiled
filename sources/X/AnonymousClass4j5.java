package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4j5  reason: invalid class name */
public final class AnonymousClass4j5 {
    public final Context A00;
    public final UserSession A01;

    public AnonymousClass4j5(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        this.A01 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [X.9FX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (X.AnonymousClass1B1.A00(r5).A00(X.1B2.A0M) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ec, code lost:
        if (X.AnonymousClass1B1.A00(r5).A00(X.1B2.A0M) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015e, code lost:
        if (X.AnonymousClass1B1.A00(r5).A00(X.1B2.A0Z) != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass4j5 r8) {
        /*
            com.instagram.common.session.UserSession r5 = r8.A01
            X.2TO r0 = X.2TN.A00(r5)
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "mobile_config_has_pending_update"
            r4 = 0
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.2TO r2 = X.2TN.A00(r5)
            long r0 = X.AnonymousClass1B0.A02
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1B0 r1 = X.AnonymousClass1B1.A00(r0)
            X.1B2 r0 = X.1B2.A0J
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x002e
            r2.A02()
        L_0x002e:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328873499311763(0x8110eb00043e93, double:3.0378641133721636E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0122
            r0 = 36328873499442837(0x8110eb00063e95, double:3.0378641134550554E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0050
            X.1Av r0 = X.1Au.A00(r5)
            boolean r0 = X.A17.A00(r5, r0)
            if (r0 == 0) goto L_0x0122
        L_0x0050:
            android.content.Context r7 = r8.A00
            r0 = 1
            X.C243473Yx.A04 = r0
            X.93C r6 = X.AnonymousClass93C.A04
            X.93F r2 = X.AnonymousClass93D.A00(r5, r6)
            X.ITG r1 = new X.ITG
            r1.<init>(r5, r7)
            X.9FW r0 = new X.9FW
            r0.<init>()
            r2.B5y(r0, r1, r6)
            X.C243473Yx.A04 = r4
        L_0x006a:
            r0 = 36319592074714634(0x81087a00001e0a, double:3.031994503083642E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0084
            android.content.Context r1 = r8.A00
            boolean r0 = X.C61970qY.A0E(r1)
            if (r0 == 0) goto L_0x0084
            X.0rJ r0 = X.0rL.A00(r5)
            r0.A01(r1)
        L_0x0084:
            r0 = 36328607211142607(0x8110ad00013dcf, double:3.037695711661733E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 2342171616424771022(0x208110ad00003dce, double:4.072884065101511E-152)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00d5
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0M
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00d5
        L_0x00a8:
            X.1pN r0 = X.1pN.A04
            if (r0 == 0) goto L_0x00d4
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0B
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00d4
            r0 = 36320936399479769(0x8109b3000023d9, double:3.032844659478275E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00d4
            X.1pN r2 = X.C243443Yu.A00()
            r1 = 1
            r0 = 0
            X.545 r0 = r2.A00(r0, r5, r1)
            if (r0 == 0) goto L_0x00d4
            r0.run()
        L_0x00d4:
            return
        L_0x00d5:
            r0 = 36328607211470290(0x8110ad00063dd2, double:3.037695711868961E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00ef
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0M
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00ef
            goto L_0x00a8
        L_0x00ef:
            r0 = 36328873499246226(0x8110eb00033e92, double:3.037864113330718E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 36328873499442837(0x8110eb00063e95, double:3.0378641134550554E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0110
            X.1Av r0 = X.1Au.A00(r5)
            boolean r0 = X.A17.A00(r5, r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x00a8
        L_0x0110:
            X.1Hb r2 = X.AnonymousClass1HI.A02
            android.content.Context r0 = r8.A00
            X.4xR r1 = new X.4xR
            r1.<init>(r0, r5)
            X.KJP r0 = new X.KJP
            r0.<init>(r1)
            r2.Eym(r0)
            goto L_0x00a8
        L_0x0122:
            r0 = 36328250729905292(0x81105a00113c8c, double:3.03747027149182E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x013a
            X.0Tu r2 = X.0Tu.A06
            r0 = 36331089703093140(0x8112ef000e4394, double:3.039265649567443E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x006a
        L_0x013a:
            r0 = 36328250729839755(0x81105a00103c8b, double:3.0374702714503744E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x0152
            X.0Tu r2 = X.0Tu.A06
            r0 = 36331089703027603(0x8112ef000d4393, double:3.039265649525997E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0050
        L_0x0152:
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0Z
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0050
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4j5.A00(X.4j5):void");
    }
}
