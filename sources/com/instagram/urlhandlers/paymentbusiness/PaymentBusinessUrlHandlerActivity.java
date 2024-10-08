package com.instagram.urlhandlers.paymentbusiness;

import X.2FO;
import X.AnonymousClass7TE;
import X.C11426STk;
import X.Dbe;
import X.Pxj;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

public final class PaymentBusinessUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public static final void A00(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        2FO A00 = C11426STk.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("view_name", "deeplink");
        A1E.put(Dbe.A00(), str);
        A1E.put("is_valid", Boolean.valueOf(z));
        Pxj.A1L("target_url", str2, str3, A1E);
        if (str4 != null) {
            A1E.put("ref", str4);
        }
        if (str5 != null) {
            A1E.put("financial_entity_id", str5);
        }
        if (str6 != null) {
            A1E.put("managed_merchant_account_id", str6);
        }
        A00.Cgl("client_load_payouthub_init", A1E);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = 464339753(0x1bad4329, float:2.866385E-22)
            int r16 = X.AnonymousClass0fD.A00(r0)
            r10 = r24
            r0 = r25
            super.onCreate(r0)
            if (r25 == 0) goto L_0x0019
            r1 = -316777352(0xffffffffed1e5c78, float:-3.0631512E27)
        L_0x0013:
            r0 = r16
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x0019:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x012d
            java.lang.String r2 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r1 = r0.getBundleExtra(r2)
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = "original_url"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x012d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x012d
            r9 = 0
            android.net.Uri r13 = X.DbT.A09(r1)
            X.08y r1 = X.09i.A0A
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x012a
            android.os.Bundle r0 = r0.getBundleExtra(r2)
        L_0x0047:
            com.instagram.common.session.UserSession r11 = r1.A07(r0)
            java.lang.String r0 = "page"
            java.lang.String r1 = r13.getQueryParameter(r0)
            java.lang.String r0 = X.Dbe.A00()
            java.lang.String r8 = r13.getQueryParameter(r0)
            if (r8 != 0) goto L_0x0060
            java.lang.String r8 = X.C2818159r.A01()
        L_0x0060:
            java.lang.String r12 = "financial_entity_id"
            java.lang.String r7 = r13.getQueryParameter(r12)
            java.lang.String r6 = "managed_merchant_account_id"
            java.lang.String r5 = r13.getQueryParameter(r6)
            java.lang.String r0 = "id"
            java.lang.String r4 = r13.getQueryParameter(r0)
            java.lang.String r3 = "referrer"
            java.lang.String r2 = r13.getQueryParameter(r3)
            java.lang.String r14 = "payout_details"
            boolean r0 = X.0qQ.A0K(r1, r14)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "payout_details_v2_fragment"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r14)
        L_0x008a:
            java.lang.Object r14 = r0.A00
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            r22 = 0
            if (r14 == 0) goto L_0x00f9
            boolean r1 = X.00l.A0W(r14)
            if (r1 != 0) goto L_0x00f9
            java.lang.String r1 = "payout_release_id"
            X.0eP r15 = X.AnonymousClass7TE.A1L(r1, r4)
            X.0eP r12 = X.AnonymousClass7TE.A1L(r12, r7)
            X.0eP r6 = X.AnonymousClass7TE.A1L(r6, r5)
            com.facebookpay.msc.logging.LoggingData r4 = new com.facebookpay.msc.logging.LoggingData
            r4.<init>(r8)
            java.lang.String r1 = "logging_data"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r4)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r3, r2)
            X.0eP[] r1 = new X.0eP[]{r15, r12, r6, r4, r1}
            android.os.Bundle r3 = X.Q21.A00(r1)
            X.STk r1 = X.AnonymousClass2E0.A02()
            X.0eK r1 = r1.A02
            java.lang.Object r1 = r1.get()
            X.S3z r1 = (X.C10987S3z) r1
            androidx.fragment.app.Fragment r3 = r1.A00(r3, r14)
            if (r3 == 0) goto L_0x0143
            java.lang.String r18 = X.DbT.A10(r13)
            r22 = 1
            r17 = r8
            r19 = r0
            r20 = r2
            r21 = r7
            r23 = r5
            A00(r17, r18, r19, r20, r21, r22, r23)
            X.6Yo r1 = X.DbS.A0M(r10, r11)
            r0 = 0
            r1.A0D = r0
            r1.A0B(r9, r3)
            r1.A04()
        L_0x00f4:
            r1 = -586449201(0xffffffffdd0b7ecf, float:-6.2823119E17)
            goto L_0x0013
        L_0x00f9:
            java.lang.String r18 = X.DbT.A10(r13)
            r20 = r9
            r21 = r9
            r23 = r9
            r19 = r9
            r17 = r8
            A00(r17, r18, r19, r20, r21, r22, r23)
            r10.finish()
            goto L_0x00f4
        L_0x010e:
            java.lang.String r0 = "home"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x011f
            if (r1 == 0) goto L_0x011f
            X.0eP r0 = new X.0eP
            r0.<init>(r9, r9)
            goto L_0x008a
        L_0x011f:
            java.lang.String r1 = "home_fragment"
            java.lang.String r0 = "overview"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x008a
        L_0x012a:
            r0 = 0
            goto L_0x0047
        L_0x012d:
            r10.finish()
            java.lang.String r0 = X.C2818159r.A01()
            r2 = 0
            java.lang.String r1 = ""
            r5 = 0
            r3 = r2
            r4 = r2
            r6 = r2
            A00(r0, r1, r2, r3, r4, r5, r6)
            r1 = -1174127728(0xffffffffba043b90, float:-5.044276E-4)
            goto L_0x0013
        L_0x0143:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.paymentbusiness.PaymentBusinessUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
