package com.instagram.urlhandlers.ordermanagement;

import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class OrderManagementUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.ordermanagement.OrderManagementUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return 09i.A0A.A04(A0A);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (r1.isSampled() != false) goto L_0x011d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 823803231(0x311a3d5f, float:2.2444835E-9)
            int r20 = X.AnonymousClass0fD.A00(r0)
            r9 = r21
            r0 = r22
            super.onCreate(r0)
            android.os.Bundle r1 = X.DbX.A0A(r9)
            X.0wW r8 = r9.getSession()
            if (r8 == 0) goto L_0x0023
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x002c
            X.1WK r0 = X.FFQ.A00()
            r0.A00(r9, r1, r8)
        L_0x0023:
            r1 = 1866870895(0x6f46306f, float:6.1336585E28)
            r0 = r20
            X.AnonymousClass0fD.A07(r1, r0)
            return
        L_0x002c:
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r19 = 0
            r0 = r19
            X.0qQ.A0B(r8, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r10 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r10.<init>((X.0lg) r8)
            java.lang.String r18 = "com.bloks.www.messenger.ctm.orderdetailsreceipt"
            r0 = r18
            r10.A0R = r0
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r13 = "merchant_id"
            r14 = 0
            if (r0 == 0) goto L_0x01c2
            java.lang.String r15 = r0.getStringExtra(r13)
        L_0x0052:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r11 = "consumer_id"
            if (r0 == 0) goto L_0x01bf
            java.lang.String r6 = r0.getStringExtra(r11)
        L_0x005e:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r7 = "order_id"
            if (r0 == 0) goto L_0x01bc
            java.lang.String r5 = r0.getStringExtra(r7)
        L_0x006a:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "entrypoint"
            if (r0 == 0) goto L_0x01b9
            java.lang.String r3 = r0.getStringExtra(r1)
        L_0x0076:
            java.lang.String r0 = r8.A06
            boolean r0 = X.0qQ.A0K(r0, r15)
            if (r6 == 0) goto L_0x01b5
            com.instagram.user.model.User r16 = X.DbV.A0j(r8, r6)
        L_0x0082:
            if (r15 == 0) goto L_0x01b2
            com.instagram.user.model.User r4 = X.DbV.A0j(r8, r15)
        L_0x0088:
            if (r0 == 0) goto L_0x01a7
            if (r16 == 0) goto L_0x01af
            java.lang.String r2 = X.DbU.A0p(r16)
        L_0x0090:
            r12.putString(r13, r15)
            r12.putString(r11, r6)
            r12.putString(r7, r5)
            java.lang.String r6 = "is_viewer_merchant"
            r12.putBoolean(r6, r0)
            if (r16 == 0) goto L_0x01a4
            java.lang.String r0 = r16.getUsername()
        L_0x00a4:
            java.lang.String r5 = "consumer_name"
            r12.putString(r5, r0)
            if (r4 == 0) goto L_0x00af
            java.lang.String r14 = r4.getUsername()
        L_0x00af:
            java.lang.String r4 = "merchant_name"
            r12.putString(r4, r14)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0 = 5140(0x1414, float:7.203E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            r0 = r17
            r12.putString(r0, r2)
            r12.putString(r1, r3)
            java.lang.String r0 = "OrderManagementUrlHandlerActivity"
            X.VVb r15 = new X.VVb
            r15.<init>(r8, r0)
            java.lang.String r14 = X.Pxi.A0d(r12, r7)
            java.lang.String r16 = ""
            if (r14 != 0) goto L_0x00d7
            r14 = r16
        L_0x00d7:
            java.lang.String r3 = X.Pxi.A0d(r12, r13)
            if (r3 != 0) goto L_0x00df
            r3 = r16
        L_0x00df:
            java.lang.String r2 = X.Pxi.A0d(r12, r11)
            if (r2 != 0) goto L_0x00e7
            r2 = r16
        L_0x00e7:
            java.lang.String r0 = X.Pxi.A0d(r12, r1)
            if (r0 == 0) goto L_0x00ef
            r16 = r0
        L_0x00ef:
            int r0 = r14.length()
            if (r0 <= 0) goto L_0x0120
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0120
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0120
            r0 = 2390(0x956, float:3.349E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = r16
            boolean r0 = r0.equals(r1)
            X.0wc r1 = r15.A01
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = "biig_order_management_thread_details_order_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0120
        L_0x011d:
            X.C13992Tns.A0i(r1, r3, r2)
        L_0x0120:
            r2 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.HashMap r3 = X.DbX.A0v()
            java.lang.String r0 = r12.getString(r7)
            r1.put(r7, r0)
            java.lang.String r0 = r12.getString(r13)
            r1.put(r13, r0)
            java.lang.String r0 = r12.getString(r11)
            r1.put(r11, r0)
            java.lang.String r0 = r12.getString(r4)
            r1.put(r4, r0)
            java.lang.String r0 = r12.getString(r5)
            r1.put(r5, r0)
            java.lang.Boolean r0 = X.DbU.A0g(r12, r6)
            r1.put(r6, r0)
            r0 = r17
            java.lang.String r4 = r12.getString(r0)
            java.lang.String r0 = "profile_pic_url"
            r1.put(r0, r4)
            java.util.HashMap r4 = X.C359608dC.A01(r1)
            X.DiU r1 = new X.DiU
            r0 = r18
            r1.<init>(r4, r14, r0)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r2
            r1.A02 = r2
            r1.A04 = r2
            r1.A0H(r3)
            X.3M3 r0 = r1.A0C(r9, r10)
            X.6Yo r1 = new X.6Yo
            r1.<init>(r9, r8)
            r1.A0B(r2, r0)
            r0 = r19
            r1.A0D = r0
            r1.A04()
            goto L_0x0023
        L_0x0193:
            java.lang.String r0 = "biig_order_management_xma_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0120
            r1.AAJ(r7, r14)
            goto L_0x011d
        L_0x01a4:
            r0 = r14
            goto L_0x00a4
        L_0x01a7:
            if (r4 == 0) goto L_0x01af
            java.lang.String r2 = X.DbU.A0p(r4)
            goto L_0x0090
        L_0x01af:
            r2 = r14
            goto L_0x0090
        L_0x01b2:
            r4 = 0
            goto L_0x0088
        L_0x01b5:
            r16 = 0
            goto L_0x0082
        L_0x01b9:
            r3 = r14
            goto L_0x0076
        L_0x01bc:
            r5 = r14
            goto L_0x006a
        L_0x01bf:
            r6 = r14
            goto L_0x005e
        L_0x01c2:
            r15 = r14
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.ordermanagement.OrderManagementUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.ordermanagement.OrderManagementUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onPause() {
        int A00 = AnonymousClass0fD.A00(-1792137961);
        super.onPause();
        setRequestedOrientation(10);
        AnonymousClass0fD.A07(-592171435, A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.ordermanagement.OrderManagementUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onResume() {
        int A00 = AnonymousClass0fD.A00(-170436935);
        super.onResume();
        setRequestedOrientation(1);
        AnonymousClass0fD.A07(1807910873, A00);
    }
}
