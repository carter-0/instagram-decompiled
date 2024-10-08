package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Wer  reason: case insensitive filesystem */
public final class C19750Wer implements MT5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ U5O A03;
    public final /* synthetic */ boolean A04;

    public C19750Wer(Context context, PromoteData promoteData, PromoteState promoteState, U5O u5o, boolean z) {
        this.A03 = u5o;
        this.A00 = context;
        this.A04 = z;
        this.A01 = promoteData;
        this.A02 = promoteState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r13 == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1Y(android.view.View r12, boolean r13) {
        /*
            r11 = this;
            X.U5O r4 = r11.A03
            android.content.Context r10 = r11.A00
            boolean r5 = r11.A04
            com.instagram.business.promote.model.PromoteData r6 = r11.A01
            com.instagram.business.promote.model.PromoteState r3 = r11.A02
            com.instagram.common.session.UserSession r0 = r6.A0y
            X.0qQ.A06(r0)
            X.1Av r1 = X.1Au.A00(r0)
            if (r13 == 0) goto L_0x0037
            if (r5 == 0) goto L_0x0037
            boolean r0 = r6.A2M
            if (r0 != 0) goto L_0x0037
            X.0xa r9 = r1.A01
            java.lang.String r8 = "preference_default_continuous_tooltip_view_count"
            r7 = 0
            int r1 = r9.getInt(r8, r7)
            r0 = 2
            if (r1 >= r0) goto L_0x0037
            X.Wml r2 = new X.Wml
            r2.<init>(r10, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            r0 = 1
            r6.A2M = r0
            X.JTS.A1S(r9, r8, r7)
        L_0x0037:
            boolean r0 = r6.A2v
            if (r13 == r0) goto L_0x0051
            r6.A2v = r13
            r0 = 1
            r3.A06 = r0
            if (r13 == 0) goto L_0x005b
            r1 = 0
        L_0x0043:
            r6.A0A = r1
            int r0 = r6.A07
            if (r13 != 0) goto L_0x004a
            int r0 = r0 * r1
        L_0x004a:
            r6.A0I = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            com.instagram.business.promote.model.PromoteState.A01(r3, r0)
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r0 = 1
            if (r13 != 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r4.A04(r0)
            return
        L_0x005b:
            int r1 = r6.A09
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19750Wer.D1Y(android.view.View, boolean):void");
    }
}
