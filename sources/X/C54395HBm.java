package X;

import android.app.Activity;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;

/* renamed from: X.HBm  reason: case insensitive filesystem */
public final class C54395HBm extends AnonymousClass2xK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ ReelsMediaInteractivityType A04;
    public final /* synthetic */ C52030GCc A05;
    public final /* synthetic */ C267324bN A06;
    public final /* synthetic */ AnonymousClass3W1 A07;
    public final /* synthetic */ AnonymousClass3OA A08;
    public final /* synthetic */ S6e A09;
    public final /* synthetic */ C55681Hle A0A;
    public final /* synthetic */ C52046GCs A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r2 = X.AnonymousClass37D.A00;
        r1 = r8.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Ds8(X.AnonymousClass5Gv r9) {
        /*
            r8 = this;
            r7 = 0
            X.0qQ.A0B(r9, r7)
            X.Hle r6 = r8.A0A
            r3 = 1
            long r1 = r6.A00
            r4 = -1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            X.0JR r0 = r6.A01
            long r4 = r0.now()
            long r0 = r6.A00
            long r4 = r4 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
        L_0x001e:
            r0 = -1
            r6.A00 = r0
            X.3W1 r0 = r8.A07
            boolean r0 = r0.A2z
            if (r0 == 0) goto L_0x0052
            X.37E r2 = X.AnonymousClass37D.A00
            android.app.Activity r1 = r8.A02
            X.37D r0 = r2.A01(r1)
            if (r0 == 0) goto L_0x0052
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r3) goto L_0x0052
            X.37D r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x0043
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0T(r0)
        L_0x0043:
            X.S6e r3 = r8.A09
            if (r3 == 0) goto L_0x0050
            java.lang.String r2 = "full"
            java.lang.String r1 = "expand"
            java.lang.String r0 = "tooltip_tap"
            r3.A02(r2, r1, r0)
        L_0x0050:
            r7 = 1
        L_0x0051:
            return r7
        L_0x0052:
            X.GCs r0 = r8.A0B
            android.view.View r1 = r8.A03
            X.3OA r4 = r8.A08
            X.3Ds r2 = X.C238863Ds.TOOLTIP_CTA
            r3 = 0
            r5 = r3
            r0.A04(r1, r2, r3, r4, r5)
            X.0sa r0 = r8.A0C
            if (r0 == 0) goto L_0x0050
            r0.invoke()
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54395HBm.Ds8(X.5Gv):boolean");
    }

    public final void DsC(AnonymousClass5Gv r4) {
        0qQ.A0B(r4, 0);
        11Z.A04(new C57882Ihz(this.A07, this.A0D), 100);
        this.A0A.A00 = -1;
    }

    public final void DsH(AnonymousClass5Gv r10) {
        String str;
        0qQ.A0B(r10, 0);
        C52030GCc gCc = this.A05;
        if (gCc != null) {
            C267324bN r5 = this.A06;
            int i = this.A00;
            int i2 = this.A01;
            ReelsMediaInteractivityType reelsMediaInteractivityType = this.A04;
            GSY gsy = new GSY(Float.valueOf((float) i), Float.valueOf((float) i2), "tooltip_presented", (String) null);
            if (reelsMediaInteractivityType == ReelsMediaInteractivityType.SINGLE_TAP) {
                str = "single_tap";
            } else {
                str = "long_press_end";
            }
            if (r5.A02 != null) {
                C52030GCc.A01(gsy, gCc, r5, "primary", new C58739Iwm("tooltip_presented", str, 0));
            }
        }
    }

    public C54395HBm(Activity activity, View view, ReelsMediaInteractivityType reelsMediaInteractivityType, C52030GCc gCc, C267324bN r5, AnonymousClass3W1 r6, AnonymousClass3OA r7, S6e s6e, C55681Hle hle, C52046GCs gCs, C62320sa r11, int i, int i2, boolean z) {
        this.A0A = hle;
        this.A07 = r6;
        this.A02 = activity;
        this.A09 = s6e;
        this.A0B = gCs;
        this.A03 = view;
        this.A08 = r7;
        this.A0C = r11;
        this.A05 = gCc;
        this.A06 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = reelsMediaInteractivityType;
        this.A0D = z;
    }
}
