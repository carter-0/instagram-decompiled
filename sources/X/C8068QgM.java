package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.QgM  reason: case insensitive filesystem */
public final class C8068QgM extends Qme {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r17, java.lang.String r18) {
        /*
            r16 = this;
            r12 = 0
            r4 = r18
            X.0qQ.A0B(r4, r12)
            java.lang.String r0 = "home_fragment"
            boolean r0 = r4.equals(r0)
            java.lang.String r14 = "referrer"
            java.lang.String r2 = "logging_data"
            r9 = 0
            r1 = r16
            r3 = r17
            if (r0 == 0) goto L_0x0089
            if (r17 == 0) goto L_0x007f
            android.os.Parcelable r0 = r3.getParcelable(r2)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x007f
            java.lang.String r11 = r0.A00
        L_0x0024:
            java.lang.String r10 = r3.getString(r14)
        L_0x0028:
            com.instagram.common.session.UserSession r0 = r1.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r6.<init>((X.0lg) r0)
            java.lang.String r8 = "com.bloks.www.fbpay.bsc.ig.shell"
            r6.A0R = r8
            android.content.Context r7 = r1.A00
            r0 = 2131969245(0x7f1344dd, float:1.9575407E38)
            java.lang.String r0 = r7.getString(r0)
            r6.A0U = r0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 2
            java.util.BitSet r1 = X.DbS.A0w(r2)
            java.lang.String r0 = "logging_session_id"
            r5.put(r0, r11)
            r1.set(r12)
            java.lang.String r0 = "referer"
            r5.put(r0, r10)
            r0 = 1
            r1.set(r0)
            int r0 = r1.nextClearBit(r12)
            if (r0 < r2) goto L_0x0084
            X.DiU r1 = X.Pxf.A0T(r8, r5, r4)
            r0 = 667752497(0x27cd1831, float:5.692516E-15)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r9
            r1.A02 = r9
            r1.A04 = r9
            r1.A0H(r3)
            X.3M3 r0 = r1.A0C(r7, r6)
            return r0
        L_0x007f:
            r11 = r9
            if (r17 != 0) goto L_0x0024
            r10 = r9
            goto L_0x0028
        L_0x0084:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x0089:
            java.lang.String r0 = "settings_fragment"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x011b
            if (r17 == 0) goto L_0x010f
            android.os.Parcelable r0 = r3.getParcelable(r2)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x010f
            java.lang.String r15 = r0.A00
        L_0x009e:
            java.lang.String r13 = r3.getString(r14)
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r11 = r3.getString(r0)
            java.lang.String r0 = "payout_subtype"
            java.lang.String r10 = r3.getString(r0)
        L_0x00af:
            com.instagram.common.session.UserSession r0 = r1.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r8.<init>((X.0lg) r0)
            java.lang.String r7 = "com.bloks.www.bsc.settings"
            r8.A0R = r7
            android.content.Context r6 = r1.A00
            r0 = 2131973394(0x7f135512, float:1.9583823E38)
            java.lang.String r0 = r6.getString(r0)
            r8.A0U = r0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 2
            java.util.BitSet r1 = X.DbS.A0w(r2)
            java.lang.String r0 = "upl_session_id"
            r5.put(r0, r15)
            r0 = 1
            r1.set(r0)
            r5.put(r14, r13)
            r1.set(r12)
            java.lang.String r0 = "financial_entity_id"
            r5.put(r0, r11)
            java.lang.String r0 = "payout_subtype"
            r5.put(r0, r10)
            int r0 = r1.nextClearBit(r12)
            if (r0 < r2) goto L_0x0116
            X.DiU r1 = X.Pxf.A0T(r7, r5, r4)
            r0 = 667749724(0x27cd0d5c, float:5.6913414E-15)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r9
            r1.A02 = r9
            r1.A04 = r9
            r1.A0H(r3)
            X.3M3 r0 = r1.A0C(r6, r8)
            return r0
        L_0x010f:
            r15 = r9
            if (r17 != 0) goto L_0x009e
            r13 = r9
            r11 = r9
            r10 = r9
            goto L_0x00af
        L_0x0116:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x011b:
            androidx.fragment.app.Fragment r0 = super.A01(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8068QgM.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }

    public final Fragment A00(Bundle bundle, String str) {
        if (str.equals("home_fragment") || str.equals("settings_fragment")) {
            return A01(bundle, str);
        }
        return super.A00(bundle, str);
    }

    public C8068QgM(Context context, UserSession userSession, AnonymousClass0eK r3) {
        super(context, r3);
        this.A01 = userSession;
        this.A00 = context;
    }
}
