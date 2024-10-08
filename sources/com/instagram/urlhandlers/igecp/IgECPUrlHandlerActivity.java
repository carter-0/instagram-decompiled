package com.instagram.urlhandlers.igecp;

import X.SNA;
import com.instagram.base.activity.IgFragmentActivity;

public final class IgECPUrlHandlerActivity extends IgFragmentActivity {
    public final SNA A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r0 = -1564255181(0xffffffffa2c35c33, float:-5.2952476E-18)
            int r10 = X.AnonymousClass0fD.A00(r0)
            r0 = r30
            r1 = r31
            super.onCreate(r1)
            X.SNA r1 = r0.A00
            r2 = 46
            X.WxU r7 = new X.WxU
            r7.<init>((java.lang.Object) r0, (int) r2)
            com.instagram.common.session.UserSession r5 = X.C11431STx.A00()
            X.0Tu r4 = X.0Tu.A05
            r2 = 36313428796770250(0x8102df000207ca, double:3.0280968212940855E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x0032
            r7.invoke()
        L_0x002b:
            r0 = 1775979009(0x69db4a01, float:3.3138029E25)
            X.AnonymousClass0fD.A07(r0, r10)
            return
        L_0x0032:
            r15 = 0
            X.S3F r2 = new X.S3F
            r2.<init>(r15, r0, r15)
            r1.A00 = r2
            android.os.Bundle r3 = X.DbU.A06(r0)
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = "extra_source_intent"
            r3.getParcelable(r2)
        L_0x0045:
            X.AnonymousClass2E0.A07()
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "key_uri"
            java.lang.String r4 = r3.getStringExtra(r2)
            java.lang.String r8 = "Required value was null."
            if (r4 == 0) goto L_0x0166
            java.lang.String r2 = "instagram://"
            r3 = 0
            boolean r2 = X.00l.A0d(r4, r2, r3)
            if (r2 == 0) goto L_0x00fa
            X.RFs r16 = X.C8924RFs.A0T
            X.RFs r17 = X.C8924RFs.A0U
            X.RFs r18 = X.C8924RFs.A0Z
            X.RFs r19 = X.C8924RFs.A0a
            X.RFs r20 = X.C8924RFs.A0V
            X.RFs r21 = X.C8924RFs.A0b
            com.facebookpay.expresscheckout.models.ItemDetails r24 = X.Pxh.A0V()
            X.RFs r22 = X.C8924RFs.A0D
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r14 = r2
            r23 = r15
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0079:
            java.lang.String r6 = X.C2818159r.A01()
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r13 = "product_id"
            java.lang.String r5 = r4.getStringExtra(r13)
            if (r5 == 0) goto L_0x015a
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r12 = "receiver_id"
            java.lang.String r9 = r4.getStringExtra(r12)
            if (r9 == 0) goto L_0x0155
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r11 = "order_id"
            java.lang.String r4 = r4.getStringExtra(r11)
            if (r4 == 0) goto L_0x0150
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()
            java.lang.String r8 = X.Dbe.A00()
            r14.putString(r8, r6)
            r14.putString(r13, r5)
            r14.putString(r12, r9)
            r14.putString(r11, r4)
            java.lang.String r8 = "ECP_UI_CONFIGURATION"
            r14.putParcelable(r8, r2)
            long r21 = java.lang.Long.parseLong(r5)
            X.0sl r19 = X.0sl.A00
            com.facebookpay.logging.LoggingContext r8 = new com.facebookpay.logging.LoggingContext
            r16 = r8
            r17 = r15
            r18 = r6
            r20 = r19
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r23)
            X.Sto r11 = X.C51965G9l.A0g()
            java.lang.String r13 = "deeplink_checkout_entry"
            X.0Ae r12 = r11.A00
            java.lang.String r11 = "user_click_ecpentry_atomic"
            X.0Aj r12 = X.C51969G9p.A0d(r12, r11)
            r11 = 397(0x18d, float:5.56E-43)
            X.1Ln r12 = X.C51965G9l.A0U(r12, r11)
            r11 = 11
            X.TY3.A00(r12, r8, r15, r13, r11)
            X.S3F r13 = r1.A00
            if (r13 != 0) goto L_0x011e
            java.lang.String r0 = "ecpCheckoutHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fa:
            java.lang.String r2 = X.C10065Rm2.A01
            boolean r2 = X.00l.A0d(r4, r2, r3)
            if (r2 == 0) goto L_0x015f
            X.RFs r16 = X.C8924RFs.A0D
            X.RFs r17 = X.C8924RFs.A0B
            X.RFs r18 = X.C8924RFs.A0E
            X.RFs r19 = X.C8924RFs.A0F
            X.RFs r20 = X.C8924RFs.A0A
            X.RFs r21 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r24 = X.Pxh.A0V()
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r14 = r2
            r22 = r16
            r23 = r15
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0079
        L_0x011e:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r8 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r8.<init>(r9, r15, r15, r15)
            java.lang.String r24 = X.AnonymousClass7TF.A0c()
            r28 = 1
            java.lang.String r26 = "DEFAULT_VALUE"
            r16 = r15
            r20 = r15
            r21 = r15
            r22 = r6
            r23 = r5
            r25 = r4
            r27 = r15
            r29 = r3
            r18 = r2
            r19 = r8
            X.2Fj r4 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = 36
            X.Iwy r2 = new X.Iwy
            r2.<init>(r3, r7, r1, r0)
            r1 = 4
            X.C51969G9p.A15(r0, r4, r2, r1)
            goto L_0x002b
        L_0x0150:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x015f:
            java.lang.String r0 = "Unsupported app for ECP deeplink"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0166:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igecp.IgECPUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
