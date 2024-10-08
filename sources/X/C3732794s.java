package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94s  reason: invalid class name and case insensitive filesystem */
public final class C3732794s implements AnonymousClass94T {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C3732894t.A00);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 10));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 11));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 12));
    public final Context A05;

    public final void cleanup() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e4, code lost:
        if (((X.AnonymousClass0JP) r0).now() < (((java.lang.Number) r1.A00).longValue() + (r4.Bsd() * com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS))) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN8() {
        /*
            r14 = this;
            X.0eM r3 = r14.A02
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            boolean r0 = r0.CZg()
            if (r0 != 0) goto L_0x0016
            java.lang.Class<X.94s> r2 = X.C3732794s.class
            java.lang.String r0 = "prediction disabled"
        L_0x0012:
            X.0KC.A02(r2, r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00a4
            com.instagram.common.session.UserSession r7 = r14.A00
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r10 = r0.A00
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r0 = r0.A02
            int r8 = (int) r0
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r0 = r0.A01
            int r9 = (int) r0
            X.T84 r6 = new X.T84
            r6.<init>(r7, r8, r9, r10)
            X.0eM r4 = r6.A04
            java.lang.Object r5 = r4.getValue()
            X.40N r5 = (X.AnonymousClass40N) r5
            int r1 = r6.A01
            r0 = 851(0x353, float:1.193E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.40G r0 = r5.E6Y(r0, r1)
            java.lang.Object r5 = r0.A00
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r12 = r0.A00
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r0 = r0.A02
            int r10 = (int) r0
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            long r0 = r0.A01
            int r11 = (int) r0
            X.T85 r8 = new X.T85
            r9 = r7
            r8.<init>(r9, r10, r11, r12)
            java.util.Iterator r6 = r5.iterator()
        L_0x0085:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r8.FOA(r0, r5)
            goto L_0x0085
        L_0x009b:
            java.lang.Object r0 = r4.getValue()
            X.40N r0 = (X.AnonymousClass40N) r0
            r0.EDJ()
        L_0x00a4:
            java.lang.Object r4 = r3.getValue()
            X.94Q r4 = (X.AnonymousClass94Q) r4
            r5 = 0
            X.0qQ.A0B(r4, r5)
            X.0eM r12 = X.C39619A2j.A01
            java.lang.Object r1 = r12.getValue()
            X.3zp r1 = (X.C258903zp) r1
            java.lang.String r0 = r4.CCP()
            X.40G r1 = r1.EJD(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0135
            X.0eM r0 = X.C39619A2j.A00
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            long r10 = r0.now()
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            long r6 = r4.Bsd()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r0
            long r8 = r8 + r6
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0135
        L_0x00e6:
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            boolean r0 = r0.CaD()
            if (r0 == 0) goto L_0x0015
            X.0eM r8 = r14.A04
            java.lang.Object r4 = r8.getValue()
            X.45u r4 = (X.C2604745u) r4
            java.lang.String r5 = "reels_swipe_last_prediction_ts"
            r0 = -1
            long r11 = r4.A00(r5, r0)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            X.0eM r0 = r14.A01
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            long r9 = r0.now()
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            X.0gq r4 = r0.A03
            if (r4 == 0) goto L_0x0132
            r0 = 36606483006297530(0x820d67001115ba, double:3.213425483433723E-306)
            long r6 = r4.BON(r0)
        L_0x0128:
            r0 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r0
            long r11 = r11 + r6
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c2
            return
        L_0x0132:
            r6 = 0
            goto L_0x0128
        L_0x0135:
            java.lang.Object r4 = r3.getValue()
            X.94Q r4 = (X.AnonymousClass94Q) r4
            X.0eM r0 = r14.A03
            java.lang.Object r1 = r0.getValue()
            X.94X r1 = (X.AnonymousClass94X) r1
            X.0qQ.A0B(r4, r5)
            r7 = 1
            X.0qQ.A0B(r1, r7)
            r6 = 0
            X.Jvw r0 = X.AAG.A00(r4)     // Catch:{ Exception -> 0x017d }
            X.40G r4 = r1.A00(r0)     // Catch:{ Exception -> 0x017d }
            boolean r0 = r4.A02     // Catch:{ Exception -> 0x017d }
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r4.A00     // Catch:{ Exception -> 0x017d }
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x017d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x017d }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0176
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x017d }
            java.lang.Object r0 = X.00k.A0O(r1, r5)     // Catch:{ Exception -> 0x017d }
            com.facebook.odin.model.Example r0 = (com.facebook.odin.model.Example) r0     // Catch:{ Exception -> 0x017d }
            if (r0 != 0) goto L_0x0170
            com.facebook.odin.model.Example r0 = com.facebook.odin.model.Example.A03     // Catch:{ Exception -> 0x017d }
        L_0x0170:
            X.40G r4 = new X.40G     // Catch:{ Exception -> 0x017d }
            r4.<init>(r0, r6, r7)     // Catch:{ Exception -> 0x017d }
            goto L_0x018d
        L_0x0176:
            com.facebook.odin.model.Example r0 = com.facebook.odin.model.Example.A03     // Catch:{ Exception -> 0x017d }
            X.40G r4 = X.AnonymousClass40H.A00(r4, r0)     // Catch:{ Exception -> 0x017d }
            goto L_0x018d
        L_0x017d:
            r0 = move-exception
            com.facebook.odin.model.Example r1 = com.facebook.odin.model.Example.A03
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = "unknown network fetch error"
        L_0x0188:
            X.40G r4 = new X.40G
            r4.<init>(r1, r0, r5)
        L_0x018d:
            java.lang.Object r6 = r4.A00
            com.facebook.odin.model.Example r6 = (com.facebook.odin.model.Example) r6
            java.util.HashMap r0 = r6.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r3.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r5 = r12.getValue()
            X.3zp r5 = (X.C258903zp) r5
            java.lang.String r4 = r0.CCP()
            X.0eM r0 = X.C39619A2j.A00
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            long r0 = r0.now()
            r5.EyX(r6, r4, r0)
            goto L_0x00e6
        L_0x01c2:
            com.instagram.common.session.UserSession r4 = r14.A00
            java.lang.Object r3 = r3.getValue()
            X.94Q r3 = (X.AnonymousClass94Q) r3
            X.0sn r1 = X.0sn.A00
            X.A5b r0 = new X.A5b
            r0.<init>(r3, r4, r1)
            X.0eM r0 = r0.A00
            java.lang.Object r3 = r0.getValue()
            X.408 r3 = (X.AnonymousClass408) r3
            r1 = 0
            com.facebook.odin.model.OdinContext r0 = com.facebook.odin.model.OdinContext.A05
            X.40G r3 = r3.E3W(r1, r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x022a
            java.lang.Object r0 = r3.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r0.doubleValue()
            java.lang.Object r7 = r8.getValue()
            X.45u r7 = (X.C2604745u) r7
            double r0 = r0.doubleValue()
            int r6 = (int) r0
            r0 = 3252(0xcb4, float:4.557E-42)
            java.lang.String r4 = X.C273654mx.A00(r0)
            android.content.SharedPreferences r0 = r7.A00
            android.content.SharedPreferences$Editor r3 = r0.edit()
            java.lang.String r1 = r7.A01
            r0 = 95
            java.lang.String r0 = X.002.A0T(r1, r4, r0)
            android.content.SharedPreferences$Editor r0 = r3.putInt(r0, r6)
            r0.apply()
            java.lang.Object r3 = r8.getValue()
            X.45u r3 = (X.C2604745u) r3
            X.0eM r0 = r14.A01
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            long r0 = r0.now()
            r3.A05(r5, r0)
            return
        L_0x022a:
            java.lang.Class<X.94s> r2 = X.C3732794s.class
            java.lang.String r1 = "Prediction failed with reason: "
            java.lang.String r0 = r3.A01
            java.lang.String r0 = X.002.A0R(r1, r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3732794s.CN8():void");
    }

    public C3732794s(UserSession userSession, Context context) {
        this.A00 = userSession;
        this.A05 = context;
    }
}
