package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.instagram.common.session.UserSession;

/* renamed from: X.NLi  reason: case insensitive filesystem */
public final class C68511NLi extends C336937fQ {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68511NLi(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r7 = this;
            r0 = -612029647(0xffffffffdb852b31, float:-7.4967323E16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            if (r9 != 0) goto L_0x002f
            android.view.LayoutInflater r6 = r7.A01
            com.instagram.common.session.UserSession r5 = r7.A02
            r4 = 0
            if (r5 == 0) goto L_0x0020
            X.0Tu r2 = X.0Tu.A06
            r0 = 36328989463166670(0x81110600003ece, double:3.037937449380956E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 2131628980(0x7f0e13b4, float:1.8885268E38)
            if (r1 != 0) goto L_0x0023
        L_0x0020:
            r0 = 2131628979(0x7f0e13b3, float:1.8885266E38)
        L_0x0023:
            android.view.View r9 = r6.inflate(r0, r4)
            X.OD0 r0 = new X.OD0
            r0.<init>(r9)
            r9.setTag(r0)
        L_0x002f:
            android.content.Context r0 = r7.A00
            java.lang.Object r4 = X.DbT.A0o(r9)
            X.OD0 r4 = (X.OD0) r4
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.OGX r12 = (X.OGX) r12
            android.content.res.Resources r5 = r0.getResources()
            android.view.View r6 = r4.A00
            java.lang.Integer r0 = r12.A03
            int r0 = X.C66582MXn.A07(r0)
            int r1 = r5.getDimensionPixelSize(r0)
            java.lang.Integer r0 = r12.A00
            int r0 = X.C66582MXn.A07(r0)
            int r0 = r5.getDimensionPixelSize(r0)
            r2 = 0
            r6.setPadding(r2, r1, r2, r0)
            java.lang.Integer r0 = r12.A01
            if (r0 == 0) goto L_0x0067
            android.widget.TextView r1 = r4.A01
            int r0 = X.C66581MXm.A03(r5, r0)
            float r0 = (float) r0
            r1.setTextSize(r2, r0)
        L_0x0067:
            android.widget.TextView r1 = r4.A01
            r1.setText(r11)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0072
            r2 = 17
        L_0x0072:
            r1.setGravity(r2)
            X.DbT.A1H(r1)
            r0 = 249587423(0xee066df, float:5.5319325E-30)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68511NLi.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }
}
