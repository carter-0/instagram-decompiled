package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94Z  reason: invalid class name */
public final class AnonymousClass94Z implements AnonymousClass94T {
    public final AnonymousClass0JP A00;
    public final C258913zq A01;
    public final AnonymousClass94X A02;
    public final C258743zZ A03;
    public final C2604745u A04;
    public final C3731694g A05 = new C3731694g();
    public final AnonymousClass0eM A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r11.A00.now() >= (((java.lang.Number) r1.A00).longValue() + (r2.Bsd() * com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS))) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN8() {
        /*
            r11 = this;
            X.3zZ r2 = r11.A03
            boolean r0 = r2.CZg()
            if (r0 != 0) goto L_0x000c
            r11.cleanup()
        L_0x000b:
            return
        L_0x000c:
            X.3zq r4 = r11.A01
            java.lang.String r3 = "IG_SCROLLING_SPEED"
            X.40G r1 = r4.EJD(r3)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            X.0JP r0 = r11.A00
            long r7 = r0.now()
            long r5 = r2.Bsd()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r0
            long r9 = r9 + r5
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
        L_0x0033:
            X.94X r1 = r11.A02
            X.Jvw r0 = X.AAG.A00(r2)
            X.40G r1 = r1.A00(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x005b
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005b
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            com.facebook.odin.model.Example r2 = (com.facebook.odin.model.Example) r2
            X.0JP r0 = r11.A00
            long r0 = r0.now()
            r4.EyX(r2, r3, r0)
        L_0x005b:
            X.0eM r0 = r11.A06
            java.lang.Object r2 = r0.getValue()
            X.408 r2 = (X.AnonymousClass408) r2
            r1 = 0
            com.facebook.odin.model.OdinContext r0 = com.facebook.odin.model.OdinContext.A05
            X.40G r0 = r2.E3W(r1, r0)
            java.lang.Object r1 = r0.A00
            java.lang.Number r1 = (java.lang.Number) r1
            r1.doubleValue()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x000b
            X.45u r4 = r11.A04
            double r2 = r1.doubleValue()
            float r1 = (float) r2
            java.lang.String r0 = "Result"
            r4.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94Z.CN8():void");
    }

    public final void cleanup() {
        this.A04.A03("Result");
    }

    public AnonymousClass94Z(UserSession userSession, Context context) {
        this.A04 = C3731094a.A00(userSession).A00;
        this.A03 = new AnonymousClass94N(userSession);
        this.A02 = C3731294c.A00(userSession).A00;
        0qQ.A0B(userSession, 0);
        this.A01 = ((C3731494e) userSession.A01(C3731494e.class, new C13350TVx(userSession, 26))).A00;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A00 = r0;
        this.A06 = AnonymousClass0eN.A01(new AnonymousClass9MH(4, (Object) context, (Object) this, (Object) userSession));
    }
}
