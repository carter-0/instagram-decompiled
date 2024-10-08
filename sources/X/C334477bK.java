package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7bK  reason: invalid class name and case insensitive filesystem */
public final class C334477bK implements View.OnFocusChangeListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ C334347b7 A02;
    public final /* synthetic */ C52971GgO A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C62320sa A05;

    public C334477bK(Context context, C53335GmL gmL, C334347b7 r3, C52971GgO ggO, UserSession userSession, C62320sa r6) {
        this.A05 = r6;
        this.A03 = ggO;
        this.A02 = r3;
        this.A00 = context;
        this.A04 = userSession;
        this.A01 = gmL;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (((java.lang.Boolean) r3.A7M.CDM(r3, X.1Av.A8a[277(0x115, float:3.88E-43)])).booleanValue() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (((java.lang.Boolean) r3.A7S.CDM(r3, X.1Av.A8a[281(0x119, float:3.94E-43)])).booleanValue() != false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r13, boolean r14) {
        /*
            r12 = this;
            r11 = r14
            if (r14 == 0) goto L_0x015b
            X.0sa r0 = r12.A05
            r0.invoke()
            X.GgO r5 = r12.A03
            X.7a5 r4 = r5.A0B
            X.1Xl r0 = r4.A00
            if (r0 == 0) goto L_0x008a
            X.1Xj r7 = r0.BPf()
            if (r7 == 0) goto L_0x008a
            X.7a3 r0 = r5.A09
            X.0Ud r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            r8 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x008a
            com.instagram.common.session.UserSession r9 = r5.A0E
            X.0Ud r0 = r4.A03
            java.lang.Object r10 = r0.getValue()
            X.7a7 r10 = (X.C333777a7) r10
            if (r10 == 0) goto L_0x008a
            if (r1 != 0) goto L_0x008a
            boolean r0 = r10.A0W
            if (r0 == 0) goto L_0x0056
            boolean r0 = r10.A0g
            if (r0 == 0) goto L_0x0056
            X.1Av r3 = X.1Au.A00(r9)
            X.0s0 r2 = r3.A7M
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 277(0x115, float:3.88E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            boolean r0 = r10.A0Z
            if (r0 == 0) goto L_0x0074
            X.1Av r3 = X.1Au.A00(r9)
            X.0s0 r2 = r3.A7S
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 281(0x119, float:3.94E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 == 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r6 != 0) goto L_0x0079
            if (r0 == 0) goto L_0x008a
        L_0x0079:
            r5.A03 = r8
            X.9pG r2 = new X.9pG
            r2.<init>(r5, r7)
            X.05G r1 = r5.A0P
            X.7co r0 = new X.7co
            r0.<init>(r2)
            r1.Epw(r0)
        L_0x008a:
            X.1Xl r0 = r4.A00
            if (r0 == 0) goto L_0x00d4
            X.1Xj r2 = r0.BPf()
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x00d4
            com.instagram.common.session.UserSession r1 = r5.A0E
            boolean r0 = r2.A5T()
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r2.A5G()
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r2.A5F()
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r2.A5E()
            if (r0 == 0) goto L_0x00d4
        L_0x00b2:
            X.1Av r3 = X.1Au.A00(r1)
            X.0s0 r2 = r3.A7P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 278(0x116, float:3.9E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d4
            r0 = 1
            r5.A03 = r0
            X.05G r1 = r5.A0P
            X.7cp r0 = X.C335357cp.A00
            r1.Epw(r0)
        L_0x00d4:
            X.1Xl r0 = r4.A00
            if (r0 == 0) goto L_0x0102
            X.1Xj r3 = r0.BPf()
            if (r3 == 0) goto L_0x0102
            X.7a3 r0 = r5.A09
            X.0Ud r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            r2 = 0
            if (r0 == 0) goto L_0x00ea
            r2 = 1
        L_0x00ea:
            X.0Rd r1 = r5.A0F
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0102
            boolean r0 = r1.A03(r3, r2)
            if (r0 == 0) goto L_0x0102
            X.05G r1 = r5.A0P
            X.7cm r0 = new X.7cm
            r0.<init>(r3)
            r1.Epw(r0)
        L_0x0102:
            X.GmL r1 = r5.A08
            java.lang.Integer r6 = r1.A03
            X.0Rd r0 = r5.A0F
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x0152
            if (r6 == 0) goto L_0x0152
            X.7a3 r0 = r5.A09
            X.0Ud r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0152
            X.05G r1 = r5.A0Q
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0152
            X.1Xl r0 = r4.A00
            if (r0 == 0) goto L_0x0152
            X.1Xj r0 = r0.BPf()
            if (r0 == 0) goto L_0x0152
            java.lang.String r3 = r0.A2n()
            if (r3 == 0) goto L_0x0152
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
            X.05G r2 = r5.A0P
            int r1 = r6.intValue()
            X.7cc r0 = new X.7cc
            r0.<init>(r1, r3)
            r2.Epw(r0)
        L_0x0152:
            X.7b7 r0 = r12.A02
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A08
            r0 = 8
            r1.setVisibility(r0)
        L_0x015b:
            X.GgO r0 = r12.A03
            X.0Ud r0 = r0.A0V
            java.lang.Object r8 = r0.getValue()
            X.7ac r8 = (X.C334067ac) r8
            boolean r0 = r8 instanceof X.C335417cv
            if (r0 == 0) goto L_0x0185
            X.7b7 r0 = r12.A02
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r0.A0B
            android.content.Context r6 = r12.A00
            X.0qQ.A0A(r6)
            X.7cv r8 = (X.C335417cv) r8
            com.instagram.common.session.UserSession r9 = r12.A04
            X.GmL r7 = r12.A01
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r10 = r0.A01(r9)
            java.lang.CharSequence r0 = X.C334337b6.A02(r6, r7, r8, r9, r10, r11)
            r1.setHint(r0)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334477bK.onFocusChange(android.view.View, boolean):void");
    }
}
