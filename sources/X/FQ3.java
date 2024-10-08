package X;

import android.widget.CompoundButton;

public final class FQ3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ESP A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public FQ3(ESP esp, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = esp;
        this.A02 = z2;
        this.A03 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r5.A03 == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.A01
            if (r0 == r7) goto L_0x0054
            X.ESP r4 = r5.A00
            X.0eM r3 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            if (r7 == 0) goto L_0x0069
            java.lang.Integer r0 = X.AnonymousClass05K.A03
        L_0x0010:
            X.FCE.A00(r1, r0)
            if (r7 == 0) goto L_0x006c
            android.content.Context r0 = r4.requireContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r0 = X.Dbb.A0U()
            boolean r1 = X.0oI.A0I(r1, r0)
            android.content.Context r0 = r4.requireContext()
            boolean r0 = X.Dbc.A11(r0)
            X.FFR.A03()
            android.os.Bundle r2 = r4.requireArguments()
            if (r1 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x005b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x003a:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x0058;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r1 = "Authentication App"
        L_0x0043:
            java.lang.String r0 = "arg_two_fac_app_name"
            r2.putString(r0, r1)
            X.E3w r1 = new X.E3w
            r1.<init>()
        L_0x004d:
            androidx.fragment.app.FragmentActivity r0 = X.DbU.A0I(r2, r1, r4)
            X.Dbc.A0S(r1, r0, r3)
        L_0x0054:
            return
        L_0x0055:
            java.lang.String r1 = "Duo Mobile"
            goto L_0x0043
        L_0x0058:
            java.lang.String r1 = "Google Authenticator"
            goto L_0x0043
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x003a
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x003a
        L_0x0063:
            X.E3v r1 = new X.E3v
            r1.<init>()
            goto L_0x004d
        L_0x0069:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x0010
        L_0x006c:
            X.0qQ.A0A(r6)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0080
            boolean r1 = r5.A03
            r3 = 2131975613(0x7f135dbd, float:1.9588323E38)
            r0 = 2131975612(0x7f135dbc, float:1.9588321E38)
            r2 = 2131975761(0x7f135e51, float:1.9588623E38)
            if (r1 != 0) goto L_0x0089
        L_0x0080:
            r3 = 2131975611(0x7f135dbb, float:1.958832E38)
            r0 = 2131975610(0x7f135dba, float:1.9588317E38)
            r2 = 2131975787(0x7f135e6b, float:1.9588676E38)
        L_0x0089:
            X.8ab r1 = X.DbW.A0U(r4)
            r1.A09(r3)
            r1.A08(r0)
            r0 = 17
            X.C50020FJf.A01(r1, r4, r0, r2)
            r0 = 18
            X.FJf r0 = X.C50020FJf.A00(r6, r0)
            X.DbX.A16(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQ3.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
