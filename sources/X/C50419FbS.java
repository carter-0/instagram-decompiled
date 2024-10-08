package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FbS  reason: case insensitive filesystem */
public final class C50419FbS implements G99 {
    public final /* synthetic */ EEP A00;

    public C50419FbS(EEP eep) {
        this.A00 = eep;
    }

    public final void CxW(View view) {
        this.A00.A0m.CxV();
    }

    public final void Dbj(DirectShareTarget directShareTarget) {
        this.A00.A0l.Dbl(directShareTarget, 6, 0, 0);
    }

    public final void Dbp(DirectShareTarget directShareTarget) {
        EEP eep = this.A00;
        eep.A0X = true;
        eep.A0l.Dbl(directShareTarget, 6, 0, 0);
    }

    public final void Dbr(DirectShareTarget directShareTarget) {
        EEP eep = this.A00;
        eep.A0C = directShareTarget;
        eep.A08.A02();
    }

    public final void Dhe() {
        this.A00.A0m.Dhe();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dhx(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00eb
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00eb
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r3 = r7.toLowerCase(r0)
        L_0x0010:
            X.EEP r5 = r6.A00
            java.lang.String r0 = r5.A0L
            boolean r0 = X.0mp.A0G(r0, r3)
            if (r0 != 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            X.Mi7 r2 = r5.A0o
            com.instagram.common.session.UserSession r1 = r5.A0g
            X.G9Y r0 = r5.A0m
            r2.A08(r0, r1, r7)
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x0038
            int r0 = X.EEP.A00(r5)
            if (r0 <= 0) goto L_0x0038
            X.2HN r0 = X.2HM.A00(r1)
            X.2HR r0 = r0.A0H
            r0.get()
        L_0x0038:
            X.7fy r0 = X.EEP.A02(r5)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = X.DbW.A1a(r3)
            r5.A0W = r0
            X.7fy r1 = X.EEP.A02(r5)
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = r5.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x00d4
        L_0x0058:
            r5.A0L = r3
            r5.A0Q()
            r5.A0P()
            r1 = 2131431591(0x7f0b10a7, float:1.8484916E38)
            boolean r0 = X.EEP.A0J(r5)
            X.EEP.A08(r5, r1, r0)
            int r1 = X.EEP.A00(r5)
            r0 = 1
            if (r1 < r0) goto L_0x00d3
            android.view.ViewGroup r0 = r5.A04
            if (r0 == 0) goto L_0x00d3
            com.instagram.common.session.UserSession r4 = r5.A0g
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318917765110519(0x8107dd00041af7, double:3.031568066974773E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r5.A0T
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x00d3
            android.view.ViewGroup r1 = r5.A04
            r0 = 2131432126(0x7f0b12be, float:1.8486E38)
            android.view.View r4 = r1.findViewById(r0)
            android.view.ViewGroup r1 = r5.A04
            r0 = 2131439297(0x7f0b2ec1, float:1.8500545E38)
            android.view.View r2 = r1.findViewById(r0)
            X.FEq r0 = r5.A0B
            if (r0 == 0) goto L_0x00b8
            X.G8J r0 = r0.A02
            boolean r0 = r0.CJp()
            if (r0 != 0) goto L_0x00b8
            X.FEq r1 = r5.A0B
            if (r1 == 0) goto L_0x00b8
            X.G8J r0 = r1.A02
            r0.EHP()
            X.G8J r0 = r1.A02
            r0.Eug()
        L_0x00b8:
            if (r4 == 0) goto L_0x00d3
            if (r2 == 0) goto L_0x00d3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            int r0 = X.DbW.A01(r0)
            r4.setVisibility(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00d0
            r1 = 8
        L_0x00d0:
            r2.setVisibility(r1)
        L_0x00d3:
            return
        L_0x00d4:
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x00e6
            X.7fy r1 = r5.A0E
        L_0x00da:
            if (r1 == 0) goto L_0x0058
            r1.EhX(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.EEP.A0B(r5, r0)
            goto L_0x0058
        L_0x00e6:
            r5.A0O()
            goto L_0x0058
        L_0x00eb:
            r3 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50419FbS.Dhx(java.lang.String, boolean):void");
    }

    public final void onFocusChange(View view, boolean z) {
        this.A00.A0m.Dhg(view, z);
    }
}
