package X;

import android.widget.CompoundButton;

public final class FQ2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ES3 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public FQ2(ES3 es3, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = es3;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r10.A02 == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r11, boolean r12) {
        /*
            r10 = this;
            boolean r2 = r10.A01
            if (r2 == r12) goto L_0x0036
            if (r12 == 0) goto L_0x0046
            X.ES3 r3 = r10.A00
            X.0eM r2 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.FCE.A00(r1, r0)
            android.os.Bundle r5 = r3.requireArguments()
            java.lang.String r0 = "is_phone_confirmed"
            boolean r0 = r5.getBoolean(r0)
            X.F3Y r4 = X.FFR.A00()
            if (r0 == 0) goto L_0x0037
            java.lang.String r8 = X.Dbb.A0Z(r5)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r9 = 1
            r7 = r6
            X.E2r r0 = r4.A01(r5, r6, r7, r8, r9)
        L_0x002f:
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.Dbc.A0S(r0, r1, r2)
        L_0x0036:
            return
        L_0x0037:
            r1 = 0
            java.lang.String r0 = "ARG_IS_ENABLING_WHATSAPP"
            r5.putBoolean(r0, r1)
            X.E3L r0 = new X.E3L
            r0.<init>()
            r0.setArguments(r5)
            goto L_0x002f
        L_0x0046:
            X.ES3 r6 = r10.A00
            X.0eM r0 = r6.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.FCE.A00(r1, r0)
            X.0qQ.A0A(r11)
            if (r2 == 0) goto L_0x0063
            boolean r0 = r10.A02
            r2 = 1
            r5 = 2131975775(0x7f135e5f, float:1.9588652E38)
            r1 = 2131975774(0x7f135e5e, float:1.958865E38)
            if (r0 != 0) goto L_0x006a
        L_0x0063:
            r2 = 0
            r5 = 2131975611(0x7f135dbb, float:1.958832E38)
            r1 = 2131975610(0x7f135dba, float:1.9588317E38)
        L_0x006a:
            r0 = 2131975787(0x7f135e6b, float:1.9588676E38)
            java.lang.String r4 = X.DbU.A0m(r6, r0)
            if (r2 == 0) goto L_0x0093
            X.8ae r3 = X.C358278ae.BLUE_BOLD
        L_0x0075:
            X.8ab r2 = X.DbW.A0U(r6)
            r2.A09(r5)
            r2.A08(r1)
            r0 = 24
            X.FJf r1 = X.C50020FJf.A00(r6, r0)
            r0 = 1
            r2.A0Y(r1, r3, r4, r0)
            r0 = 25
            X.FJf r0 = X.C50020FJf.A00(r11, r0)
            X.DbX.A16(r0, r2)
            return
        L_0x0093:
            X.8ae r3 = X.C358278ae.RED_BOLD
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQ2.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
