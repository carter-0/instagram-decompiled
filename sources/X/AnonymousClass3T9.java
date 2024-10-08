package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "Delegates are deprecated, see KDoc above")
/* renamed from: X.3T9  reason: invalid class name */
public final class AnonymousClass3T9 implements AnonymousClass3TA {
    public final Fragment A00;
    public final UserSession A01;
    public final 2el A02;
    public final C231332rR A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C377159Kt(this, 40));
    public final C2355030c A05;
    public final AnonymousClass311 A06;
    public final 1GI A07;
    public final AnonymousClass4DU A08;
    public final AnonymousClass30S A09;
    public final C228232l0 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r0.AgG() == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r13 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1F(X.1Xj r12, X.1Xj r13, X.1Xj r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r7 = r14
            boolean r0 = r14.A6M()
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            if (r0 != 0) goto L_0x001c
            X.1Xy r0 = r14.A0C
            X.4w4 r0 = r0.BQf()
            if (r0 == 0) goto L_0x00a2
            X.3xe r0 = r0.AgG()
            if (r0 == 0) goto L_0x00a2
        L_0x001c:
            X.2rR r0 = r11.A03
            r0.Cs9(r12)
            if (r13 == 0) goto L_0x002c
        L_0x0023:
            X.30c r0 = r11.A05
            if (r0 == 0) goto L_0x002c
            X.2pm r4 = r0.A04
            r4.ChV(r5, r6, r7, r8, r9, r10)
        L_0x002c:
            r0 = -1
            if (r15 == r0) goto L_0x0097
            if (r10 == r9) goto L_0x0097
            if (r10 <= r9) goto L_0x009f
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0035:
            com.instagram.common.session.UserSession r4 = r11.A01
            X.4DU r3 = r11.A08
            java.lang.String r0 = "gesture"
            X.3sc r2 = X.C254513sb.A04(r12, r3, r0)
            r2.A0G(r4, r12)
            r2.A08(r10)
            int r0 = r1.intValue()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "swipe_right"
        L_0x004d:
            r2.A7M = r0
            boolean r1 = r12.CcK()
            X.0wc r0 = X.AnonymousClass0kN.A01(r3, r4)
            if (r1 == 0) goto L_0x0098
            X.XWx.A00(r0, r2, r3)
        L_0x005c:
            X.2l0 r3 = r11.A0A
            X.2v9 r2 = X.C233162v9.GESTURE
            X.2rR r0 = r11.A03
            X.3W1 r1 = r0.BQr(r12)
            X.5yf r0 = X.C301155ye.A00()
            r3.DUE(r0, r2, r12, r1)
            if (r13 == 0) goto L_0x0097
            boolean r0 = r13.CcK()
            if (r0 != 0) goto L_0x0097
            X.1GI r5 = r11.A07
            java.lang.String r4 = r13.getId()
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317105288975136(0x81063700051320, double:3.030421849768501E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0097
            if (r4 == 0) goto L_0x0097
            boolean r0 = X.00l.A0W(r4)
            if (r0 != 0) goto L_0x0097
            java.util.Set r0 = r5.A04
            r0.add(r4)
        L_0x0097:
            return
        L_0x0098:
            X.XXC.A00(r0, r2, r3)
            goto L_0x005c
        L_0x009c:
            java.lang.String r0 = "swipe_left"
            goto L_0x004d
        L_0x009f:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0035
        L_0x00a2:
            if (r13 == 0) goto L_0x002c
            boolean r0 = r13.A6M()
            if (r0 != 0) goto L_0x001c
            X.1Xy r0 = r13.A0C
            X.4w4 r0 = r0.BQf()
            if (r0 == 0) goto L_0x0023
            X.3xe r0 = r0.AgG()
            if (r0 == 0) goto L_0x0023
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T9.D1F(X.1Xj, X.1Xj, X.1Xj, int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void ECH(View view, 1Xj r8, AnonymousClass3W1 r9, int i) {
        1Xj A1c;
        0qQ.A0B(r8, 1);
        AnonymousClass30S r5 = this.A09;
        if (r5 != null && (A1c = r8.A1c(i)) != null) {
            String A0b = 002.A0b(A1c.getId(), ":carousel_item:", i);
            AnonymousClass4HA r3 = new AnonymousClass4HA(r9, i);
            UserSession userSession = r5.A01;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(r8, r3, A0b);
            r2.A00 = userSession;
            r5.A05.Csb(r2, r8, r3);
            2el r1 = r5.A02;
            r1.A05(view, new AnonymousClass30X(r2));
            C245843dZ.A00 = new WeakReference(r1);
        }
    }

    public final C246893fP Ahs() {
        return this.A06.Ahs();
    }

    public final C274114nj Alp() {
        return this.A06.Alp();
    }

    public final AnonymousClass4GI Alt() {
        return this.A06.Alt();
    }

    public final AnonymousClass4GN Am6() {
        return this.A06.Am6();
    }

    public final AnonymousClass4GD AmC() {
        return this.A06.AmC();
    }

    public final AnonymousClass4G1 Aow() {
        return this.A06.Aow();
    }

    public final AnonymousClass33B Aqg() {
        return this.A06.Aqg();
    }

    public final void DeZ(View view, 1Xj r8, int i) {
        GV5 gv5 = (GV5) this.A04.getValue();
        String A0R = 002.A0R("shop_entry_point_impression_", r8.getId());
        2el r3 = gv5.A03;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(r8, valueOf, A0R);
        r1.A00(gv5.A02);
        r3.A05(view, r1.A01());
    }

    public AnonymousClass3T9(Fragment fragment, UserSession userSession, 2el r5, C2355030c r6, AnonymousClass311 r7, AnonymousClass4DU r8, C231332rR r9, AnonymousClass30S r10, C228232l0 r11) {
        this.A06 = r7;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A08 = r8;
        this.A03 = r9;
        this.A05 = r6;
        this.A0A = r11;
        this.A09 = r10;
        this.A02 = r5;
        this.A07 = 1GH.A00(userSession);
    }

    public final C262864Gh BR1() {
        throw AnonymousClass00P.createAndThrow();
    }
}
