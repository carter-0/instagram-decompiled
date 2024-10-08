package X;

import android.content.Context;

public abstract class Qme extends C10987S3z {
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        throw X.AnonymousClass7TF.A0W("BSCFragmentFactory does not support ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0131, code lost:
        r2.putSerializable("viewmodel_class", java.lang.Integer.valueOf(r0));
        r0 = new X.QCQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016b, code lost:
        r2.putSerializable("viewmodel_class", java.lang.Integer.valueOf(r0));
        r0 = new X.QCQ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        r0.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment A01(android.os.Bundle r15, java.lang.String r16) {
        /*
            r14 = this;
            r9 = 0
            r2 = r16
            X.0qQ.A0B(r2, r9)
            int r0 = r2.hashCode()
            java.lang.String r1 = "viewmodel_class"
            switch(r0) {
                case -1868875270: goto L_0x0017;
                case -1532810832: goto L_0x0028;
                case -1260171540: goto L_0x003a;
                case -1222594761: goto L_0x00bb;
                case -992545463: goto L_0x00ca;
                case -966253274: goto L_0x00da;
                case -895051645: goto L_0x00e9;
                case 48250454: goto L_0x00f7;
                case 1148185282: goto L_0x0106;
                case 1392861541: goto L_0x0115;
                case 1423175472: goto L_0x0124;
                case 1536698909: goto L_0x013e;
                case 1572489632: goto L_0x014e;
                case 1927794982: goto L_0x015d;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r0 = "BSCFragmentFactory does not support "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        L_0x0017:
            java.lang.String r0 = "transactions_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 8
            goto L_0x016b
        L_0x0028:
            java.lang.String r0 = "home_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            X.QCP r0 = new X.QCP
            r0.<init>()
            r0.setArguments(r15)
            goto L_0x017a
        L_0x003a:
            java.lang.String r0 = "settings_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            android.content.Context r8 = r14.A00
            r13 = 1
            X.Tiv r0 = X.AnonymousClass2E0.A00()
            java.lang.String r11 = "com.bloks.www.bsc.settings"
            r7 = 0
            com.instagram.common.session.UserSession r0 = X.Pxe.A0a(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r6.<init>((X.0lg) r0)
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = r0.A00
        L_0x0066:
            java.lang.String r0 = "page_id"
            java.lang.String r12 = r2.getString(r0)
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            r3 = 2
            java.util.BitSet r2 = X.DbS.A0w(r3)
            java.lang.String r0 = "upl_session_id"
            r10.put(r0, r1)
            r2.set(r13)
            java.lang.String r1 = "bpa_home"
            java.lang.String r0 = "referrer"
            r10.put(r0, r1)
            r2.set(r9)
            java.lang.String r0 = "payee_id"
            r10.put(r0, r12)
            int r0 = r2.nextClearBit(r9)
            if (r0 < r3) goto L_0x017d
            X.DiU r1 = X.Pxf.A0T(r11, r10, r5)
            r0 = 667749724(0x27cd0d5c, float:5.6913414E-15)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r7
            r1.A02 = r7
            r1.A04 = r7
            r1.A0H(r4)
            X.3M3 r0 = r1.A0C(r8, r6)
            return r0
        L_0x00b6:
            java.lang.String r1 = X.C2818159r.A01()
            goto L_0x0066
        L_0x00bb:
            java.lang.String r0 = "filter_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 9
            goto L_0x0131
        L_0x00ca:
            java.lang.String r0 = "app_dialog_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 13
            goto L_0x016b
        L_0x00da:
            java.lang.String r0 = "earnings_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 2
            goto L_0x016b
        L_0x00e9:
            java.lang.String r0 = "earnings_details_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 7
            goto L_0x016b
        L_0x00f7:
            java.lang.String r0 = "overview_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 5
            goto L_0x016b
        L_0x0106:
            java.lang.String r0 = "payouts_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 1
            goto L_0x016b
        L_0x0115:
            java.lang.String r0 = "info_tip_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 12
            goto L_0x016b
        L_0x0124:
            java.lang.String r0 = "fe_selector_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 6
        L_0x0131:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.putSerializable(r1, r0)
            X.QgS r0 = new X.QgS
            r0.<init>()
            goto L_0x0177
        L_0x013e:
            java.lang.String r0 = "payout_details_v2_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 11
            goto L_0x016b
        L_0x014e:
            java.lang.String r0 = "earnings_details_v2_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 10
            goto L_0x016b
        L_0x015d:
            java.lang.String r0 = "payout_details_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            android.os.Bundle r2 = X.Pxe.A0J(r15)
            r0 = 4
        L_0x016b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.putSerializable(r1, r0)
            X.QCQ r0 = new X.QCQ
            r0.<init>()
        L_0x0177:
            r0.setArguments(r2)
        L_0x017a:
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
        L_0x017d:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qme.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }

    public Qme(Context context, AnonymousClass0eK r2) {
        super(r2);
        this.A00 = context;
    }
}
