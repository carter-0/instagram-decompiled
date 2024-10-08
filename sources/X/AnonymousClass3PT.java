package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3PT  reason: invalid class name */
public final class AnonymousClass3PT {
    public String A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass3PS A03;
    public final Set A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(AnonymousClass3PU.A00);
    public final AnonymousClass3BU A06;
    public final Map A07;

    public AnonymousClass3PT(UserSession userSession, AnonymousClass3BU r8, AnonymousClass3PS r9, String str, Map map, Set set) {
        boolean z;
        0qQ.A0B(userSession, 4);
        0qQ.A0B(str, 5);
        0qQ.A0B(r8, 6);
        this.A04 = set;
        this.A03 = r9;
        this.A07 = map;
        this.A02 = userSession;
        this.A06 = r8;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.init", 414337165);
        }
        if (map != null) {
            try {
                z = map.containsKey("force_load_from_network");
            } catch (Throwable th) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1804172878);
                }
                throw th;
            }
        } else {
            z = false;
        }
        this.A01 = z;
        if (map == null || !map.containsKey("obfuscate_request")) {
            this.A00 = str;
        } else {
            Set entrySet = map.entrySet();
            C41742AzX azX = C41742AzX.A00;
            0qQ.A0B(entrySet, 0);
            0qQ.A0B(azX, 1);
            018.A19(entrySet, azX, false);
            this.A00 = "unknown";
        }
        if (Systrace.A0E(1)) {
            0fS.A00(-1113043302);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass49H A00(X.AnonymousClass3PT r16, java.util.Set r17) {
        /*
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0010
            r1 = -590820538(0xffffffffdcc8cb46, float:-4.52147975E17)
            java.lang.String r0 = "ReelLoader.createNetworkTask"
            X.0fS.A01(r0, r1)
        L_0x0010:
            r4 = r16
            com.instagram.common.session.UserSession r7 = r4.A02     // Catch:{ all -> 0x009a }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x009a }
            r0 = 36313729444350169(0x810325000008d9, double:3.028286952034237E-306)
            boolean r0 = X.182.A06(r2, r7, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "source"
            r11 = r17
            if (r0 == 0) goto L_0x0058
            java.lang.String r9 = r4.A00     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x0092
            java.lang.String r0 = "push_notification"
            r1 = 0
            boolean r0 = X.00l.A0d(r9, r0, r1)     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "activity_feed"
            boolean r0 = X.00l.A0d(r9, r0, r1)     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0058
            java.util.Map r10 = r4.A07     // Catch:{ all -> 0x009a }
            X.3BU r8 = r4.A06     // Catch:{ all -> 0x009a }
            boolean r12 = r4.A05()     // Catch:{ all -> 0x009a }
            X.1GP r2 = X.AnonymousClass5FI.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009a }
            X.49H r3 = new X.49H     // Catch:{ all -> 0x009a }
            r3.<init>(r8, r9, r11)     // Catch:{ all -> 0x009a }
            r3.A01 = r2     // Catch:{ all -> 0x009a }
            X.3PS r1 = r4.A03     // Catch:{ all -> 0x009a }
            X.5FM r0 = new X.5FM     // Catch:{ all -> 0x009a }
            r0.<init>(r7, r3, r1, r11)     // Catch:{ all -> 0x009a }
            r2.A02(r0)     // Catch:{ all -> 0x009a }
            goto L_0x0085
        L_0x0058:
            java.util.Map r1 = r4.A07     // Catch:{ all -> 0x009a }
            java.lang.String r15 = r4.A00     // Catch:{ all -> 0x009a }
            if (r15 == 0) goto L_0x0092
            X.3BU r13 = r4.A06     // Catch:{ all -> 0x009a }
            boolean r0 = r4.A05()     // Catch:{ all -> 0x009a }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x009a }
            r12 = r7
            r16 = r1
            X.49H r3 = X.1NP.A07(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x009a }
            X.1OC r2 = r3.A00     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0085
            X.3PS r1 = r4.A03     // Catch:{ all -> 0x009a }
            boolean r0 = r4.A01     // Catch:{ all -> 0x009a }
            X.Ufg r12 = new X.Ufg     // Catch:{ all -> 0x009a }
            r13 = r7
            r14 = r3
            r15 = r1
            r16 = r11
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x009a }
            r2.A00 = r12     // Catch:{ all -> 0x009a }
        L_0x0085:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0091
            r0 = -680166930(0xffffffffd77579ee, float:-2.69904033E14)
            X.0fS.A00(r0)
        L_0x0091:
            return r3
        L_0x0092:
            X.0qQ.A0F(r2)     // Catch:{ all -> 0x009a }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x00a7
            r0 = -1529326966(0xffffffffa4d8528a, float:-9.3814894E-17)
            X.0fS.A00(r0)
        L_0x00a7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PT.A00(X.3PT, java.util.Set):X.49H");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A02, 36317517608326381L) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set A01() {
        /*
            r7 = this;
            java.lang.String r5 = r7.A00
            java.lang.String r0 = "source"
            if (r5 != 0) goto L_0x000e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            java.lang.String r0 = "push_notification"
            r4 = 0
            boolean r0 = X.00l.A0d(r5, r0, r4)
            if (r0 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r3 = r7.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317517608326381(0x810697002b14ed, double:3.0306826021865053E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0078
        L_0x0026:
            java.lang.String r0 = "activity_feed"
            boolean r0 = X.00l.A0d(r5, r0, r4)
            if (r0 != 0) goto L_0x0078
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0078
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0078
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0078
            com.instagram.common.session.UserSession r6 = r7.A02
            com.instagram.reels.store.ReelStore r5 = com.instagram.reels.store.ReelStore.A03(r6)
            X.0qQ.A07(r5)
            java.util.Set r0 = r7.A04
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.model.reels.Reel r0 = r5.A0M(r0)
            r1 = 1
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.A19(r6)
            if (r0 != r1) goto L_0x005a
            r4.add(r2)
            goto L_0x005a
        L_0x0078:
            X.0sl r4 = X.0sl.A00
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PT.A01():java.util.Set");
    }

    public static final void A02(Context context, AnonymousClass07i r5, AnonymousClass49H r6) {
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.scheduleTaskOnLoader", 1940462510);
        }
        try {
            1GP r0 = r6.A00;
            if (!(r0 == null && (r0 = r6.A01) == null)) {
                1ES.A00(context, r5, r0);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(717614229);
            }
        }
    }

    public static final void A03(AnonymousClass49H r7, AnonymousClass3PT r8) {
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.scheduleTaskOnPool", 975475790);
        }
        try {
            1GP r4 = r7.A00;
            if (!(r4 == null && (r4 = r7.A01) == null)) {
                if (182.A06(0Tu.A05, 1NM.A00(r8.A02).A00, 36317517608981749L)) {
                    1ES.A05(r4, 307591348, 1, true, true);
                } else {
                    1ES.A03(r4);
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(2089354200);
            }
        }
    }

    private final void A04(AnonymousClass3PW r7) {
        int i;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.loadReelsFromDiskAndGetFetchRemainingNetworkTask", -172772944);
        }
        try {
            if (A01().isEmpty()) {
                Set set = this.A04;
                if (!set.isEmpty()) {
                    r7.A00(A00(this, set));
                }
                if (Systrace.A0E(1)) {
                    i = 707513204;
                    0fS.A00(i);
                }
                return;
            }
        } catch (IOException e) {
            0KC.A0G(C49295Ese.A00, "Failed to create a reels media network task", e);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-109791801);
            }
            throw th;
        }
        AnonymousClass3PY r0 = AnonymousClass3PX.A02;
        AnonymousClass3PX.A01.ATE(new C241403Pb(this.A02, new C241393Pa(r7, this), A01()));
        if (Systrace.A0E(1)) {
            i = -538762986;
            0fS.A00(i);
        }
    }

    private final boolean A05() {
        switch (this.A06.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                String A042 = 182.A04(0Tu.A05, 1NM.A00(this.A02).A00, 36887601499734782L);
                String str = this.A00;
                if (str != null) {
                    return 00l.A0d(A042, str, false);
                }
                0qQ.A0F("source");
                throw AnonymousClass00P.createAndThrow();
            default:
                return false;
        }
    }

    public final void A06() {
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.load.Threadpool", -1570796513);
        }
        try {
            if (182.A06(0Tu.A05, this.A02, 36310628478157015L)) {
                A04(new AnonymousClass3PV(this));
            } else {
                Set set = this.A04;
                if (!set.isEmpty()) {
                    A03(A00(this, set), this);
                }
            }
        } catch (IOException e) {
            0KC.A0G(C49295Ese.A00, "Failed to create a reels media network task", e);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-22524571);
            }
            throw th;
        }
        if (Systrace.A0E(1)) {
            0fS.A00(-1379469013);
        }
    }

    public final void A07(Context context, AnonymousClass07i r8) {
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.load.loaderManager", -643944384);
        }
        try {
            if (182.A06(0Tu.A05, this.A02, 36310628478157015L)) {
                A04(new C47993EPz(context, r8, this));
            } else {
                Set set = this.A04;
                if (!set.isEmpty()) {
                    A02(context, r8, A00(this, set));
                }
            }
        } catch (IOException e) {
            0KC.A0G(C49295Ese.A00, "Failed to create a reels media network task", e);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-188207483);
            }
            throw th;
        }
        if (Systrace.A0E(1)) {
            0fS.A00(-1200801518);
        }
    }
}
