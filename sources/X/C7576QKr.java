package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest;
import com.facebook.iabadscontext.IABAdsContext;

/* renamed from: X.QKr  reason: case insensitive filesystem */
public abstract class C7576QKr extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public QLA A00;
    public QPy A01;
    public String A02;
    public final IABAdsContext A03;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017d, code lost:
        if (r14 != false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EsV(X.QLA r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.String r29) {
        /*
            r25 = this;
            r3 = 1
            r9 = r25
            X.QPy r1 = r9.A01
            r6 = 0
            if (r1 == 0) goto L_0x000d
            boolean r0 = r1.A05
            if (r0 != r3) goto L_0x000d
        L_0x000c:
            return r6
        L_0x000d:
            r0 = 0
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r1.A00
        L_0x0012:
            r11 = r29
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x000c
            android.net.Uri r18 = X.0cp.A03(r11)
            r17 = 0
            if (r18 == 0) goto L_0x000c
            java.lang.String r2 = r18.getPath()
            if (r2 == 0) goto L_0x0041
            java.lang.String r1 = "checkout"
            boolean r1 = X.00l.A0d(r2, r1, r6)
            if (r1 != 0) goto L_0x0041
            java.lang.String r2 = r18.getPath()
            if (r2 == 0) goto L_0x0041
            java.lang.String r1 = "cart"
            boolean r1 = X.00l.A0d(r2, r1, r6)
            if (r1 != 0) goto L_0x0041
            return r6
        L_0x003f:
            r1 = r0
            goto L_0x0012
        L_0x0041:
            com.instagram.common.session.UserSession r4 = X.C11431STx.A00()
            X.0Tu r10 = X.0Tu.A06
            r1 = 36315992892706654(0x81053400090f5e, double:3.029718365889053E-306)
            boolean r1 = X.182.A06(r10, r4, r1)
            if (r1 != 0) goto L_0x0061
            java.lang.String r2 = r18.getHost()
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = ".myshopify.com"
            boolean r1 = X.00p.A0i(r2, r1, r3)
            if (r1 != 0) goto L_0x0061
            return r6
        L_0x0061:
            com.instagram.common.session.UserSession r4 = X.C11431STx.A00()
            r1 = 36878942845993187(0x830534000700e3, double:3.3857301831649704E-306)
            java.lang.String r12 = X.182.A04(r10, r4, r1)
            java.lang.String r8 = r9.A02
            com.facebook.iabadscontext.IABAdsContext r1 = r9.A03
            java.lang.String r4 = r1.A09
            r16 = r4
            java.lang.String r15 = ""
            r20 = r15
            if (r4 != 0) goto L_0x007d
            r4 = r15
        L_0x007d:
            r2 = r9
            X.QKc r2 = (X.C7571QKc) r2
            r1 = 2
            X.0qQ.A0B(r4, r1)
            X.QKY r7 = r2.A01
            X.0wc r5 = r7.A0C()
            java.lang.String r1 = "client_load_shopslitecheckouteligibility_init"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r1)
            r1 = 102(0x66, float:1.43E-43)
            X.1Ln r13 = X.C51965G9l.A0U(r5, r1)
            boolean r1 = X.DbT.A1Y(r13)
            if (r1 == 0) goto L_0x00e2
            r13.A0v(r8)
            X.2M7 r1 = X.2M7.A0G
            X.Pxk.A0U(r1, r13)
            X.QIq r14 = new X.QIq
            r14.<init>()
            java.lang.String r1 = "checkout_url_intercept"
            X.SUF.A09(r14, r7, r1)
            X.0eP r5 = X.SUF.A08(r11)
            java.lang.String r1 = "checkout_url_patterns"
            java.util.LinkedHashMap r5 = X.DbY.A0p(r1, r12, r5)
            java.lang.String r1 = "checkout_info"
            r14.A08(r1, r5)
            java.lang.String r1 = "event_payload"
            r13.A0N(r14, r1)
            X.QHi r5 = new X.QHi
            r5.<init>()
            java.lang.String r1 = r7.A01
            X.SUF.A0A(r5, r7, r1, r8)
            java.lang.Long r4 = X.DbV.A0q(r4)
            java.lang.String r1 = "ad_id"
            r5.A05(r1, r4)
            java.lang.String r1 = "iaw_session_id"
            r5.A06(r1, r8)
            java.lang.String r1 = "custom_fields"
            r13.A0N(r5, r1)
            r13.Cgf()
        L_0x00e2:
            int r1 = r12.length()
            boolean r1 = X.AnonymousClass7TF.A1Q(r1)
            java.lang.String r13 = ","
            if (r1 == 0) goto L_0x013c
            java.util.List r1 = X.C9920RjZ.A00
        L_0x00f0:
            java.util.Iterator r5 = r1.iterator()
        L_0x00f4:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x013a
            java.lang.String r4 = X.AnonymousClass7TE.A18(r5)
            java.lang.String r1 = r18.getPath()
            if (r1 == 0) goto L_0x00f4
            boolean r1 = X.C66580MXl.A1a(r4, r3, r1)
            if (r1 != r3) goto L_0x00f4
            r14 = 1
        L_0x010b:
            com.instagram.common.session.UserSession r1 = X.C11431STx.A00()
            r4 = 36315992892837727(0x810534000b0f5f, double:3.029718365971944E-306)
            boolean r1 = X.182.A06(r10, r1, r4)
            if (r1 == 0) goto L_0x014b
            java.lang.String r4 = r18.getPath()
            if (r4 == 0) goto L_0x0313
            java.lang.String r1 = "/"
            java.util.List r1 = X.DbV.A18(r4, r1)
            if (r1 == 0) goto L_0x0313
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x0130:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0141
            X.Pxj.A1R(r5, r4)
            goto L_0x0130
        L_0x013a:
            r14 = 0
            goto L_0x010b
        L_0x013c:
            java.util.List r1 = X.DbV.A18(r12, r13)
            goto L_0x00f0
        L_0x0141:
            int r4 = r5.size()
            r1 = 3
            if (r4 != r1) goto L_0x0313
            r17 = 1
            goto L_0x017f
        L_0x014b:
            com.instagram.common.session.UserSession r1 = X.C11431STx.A00()
            r4 = 36878942846189796(0x830534000a00e4, double:3.385730183289307E-306)
            java.lang.String r1 = X.182.A04(r10, r1, r4)
            java.util.List r1 = X.DbV.A18(r1, r13)
            java.util.Iterator r5 = r1.iterator()
        L_0x0160:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x017b
            java.lang.String r4 = X.AnonymousClass7TE.A18(r5)
            java.lang.String r1 = r18.getPath()
            if (r1 == 0) goto L_0x0160
            X.0qQ.A0B(r4, r3)
            boolean r1 = r1.endsWith(r4)
            if (r1 != r3) goto L_0x0160
            r14 = 0
            goto L_0x0160
        L_0x017b:
            r17 = r14
            if (r14 == 0) goto L_0x0313
        L_0x017f:
            if (r16 == 0) goto L_0x0183
            r15 = r16
        L_0x0183:
            X.0wc r4 = r7.A0C()
            java.lang.String r1 = "client_load_shopslitecheckouteligibility_success"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            r1 = 103(0x67, float:1.44E-43)
            X.1Ln r5 = X.C51965G9l.A0U(r4, r1)
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x01df
            r5.A0v(r8)
            X.2M7 r1 = X.2M7.A0G
            X.Pxk.A0U(r1, r5)
            X.QIq r10 = new X.QIq
            r10.<init>()
            java.lang.String r1 = "checkout_url_intercept"
            X.SUF.A09(r10, r7, r1)
            X.0eP r4 = X.SUF.A08(r11)
            java.lang.String r1 = "checkout_url_patterns"
            java.util.LinkedHashMap r4 = X.DbY.A0p(r1, r12, r4)
            java.lang.String r1 = "checkout_info"
            r10.A08(r1, r4)
            java.lang.String r1 = "event_payload"
            r5.A0N(r10, r1)
            X.QHj r10 = new X.QHj
            r10.<init>()
        L_0x01c4:
            java.lang.String r1 = r7.A01
            X.SUF.A0A(r10, r7, r1, r8)
            java.lang.Long r4 = X.DbV.A0q(r15)
            java.lang.String r1 = "ad_id"
            r10.A05(r1, r4)
            java.lang.String r1 = "iaw_session_id"
            r10.A06(r1, r8)
            java.lang.String r1 = "custom_fields"
            r5.A0N(r10, r1)
            r5.Cgf()
        L_0x01df:
            if (r17 == 0) goto L_0x000c
            java.lang.String r1 = X.C2818159r.A01()
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            java.lang.String r10 = r2.A02
            com.facebook.iabadscontext.IABAdsContext r5 = r2.A02
            java.lang.String r4 = r5.A09
            if (r4 == 0) goto L_0x030f
            long r16 = java.lang.Long.parseLong(r4)
        L_0x01f3:
            r12 = r7
            r14 = r10
            r15 = r1
            r12.A0G(r13, r14, r15, r16)
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            X.QPy r4 = r9.A01
            if (r4 == 0) goto L_0x0201
            java.lang.String r0 = "2024-10"
        L_0x0201:
            r7 = 507383195(0x1e3e0d9b, float:1.006133E-20)
            com.facebook.quicklog.QuickPerformanceLogger r4 = X.C11401SRw.A00
            if (r4 == 0) goto L_0x020b
            r4.markerStart(r7)
        L_0x020b:
            X.C11401SRw.A03(r7, r8, r1, r0)
            com.facebook.browser.lite.extensions.shopifycheckout.instagram.IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1 r12 = new com.facebook.browser.lite.extensions.shopifycheckout.instagram.IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1
            r12.<init>(r2)
            X.SRY r9 = X.SRY.A00()
            android.content.Context r4 = r2.A00
            java.util.HashMap r16 = X.AnonymousClass7TE.A1E()
            java.lang.String r7 = "com.bloks.www.bloks.commerce.meta.checkout.shopify.sdk.entrypoint"
            java.lang.String r0 = "www.bloks.commerce.meta.checkout.shopify.sdk.entrypoint"
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            android.util.SparseArray r14 = X.Pxe.A0L()
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            java.lang.String r13 = "CommerceCheckoutIAWOpenBloksRequest.IAB_ADS_CONTEXT"
            r8.putParcelable(r13, r5)
            java.lang.ref.WeakReference r5 = X.C51965G9l.A0v(r4)
            int r13 = X.C14615TzM.A00(r5)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.CONTEXT"
            r8.putInt(r5, r13)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.APP_ID"
            r8.putString(r5, r7)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.SCREEN_ID"
            r8.putString(r5, r0)
            int r13 = X.C14615TzM.A00(r16)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.PARAMS"
            r8.putInt(r5, r13)
            int r13 = X.C14615TzM.A00(r15)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.NATIVE_PROPS"
            r8.putInt(r5, r13)
            int r13 = X.C14615TzM.A00(r14)
            java.lang.String r5 = "CommerceCheckoutIAWOpenBloksRequest.OBJECT_SET"
            r8.putInt(r5, r13)
            X.QJx r5 = new X.QJx
            r5.<init>((android.os.Bundle) r8, (X.SRY) r9, (com.facebook.browser.lite.ipc.OnShopsLiteCallback) r12)
            X.SRY.A02(r5, r9, r6)
            X.Di6 r16 = X.C46471DfZ.A0T
            X.EX6 r14 = X.C46471DfZ.A0R
            X.EX7 r13 = X.EX7.ANIMATED_WHILE_LOADING
            X.Di7 r15 = X.C46627Di7.DISABLED
            com.facebook.browser.lite.extensions.shopifycheckout.instagram.IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$cdsOpenScreenConfig$1 r5 = new com.facebook.browser.lite.extensions.shopifycheckout.instagram.IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$cdsOpenScreenConfig$1
            r5.<init>(r2)
            X.VQZ r12 = new X.VQZ
            r12.<init>(r2, r1)
            r17 = r5
            r19 = r6
            X.DfZ r6 = X.C49940FFt.A02(r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r5 = r2.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r9.<init>((X.0lg) r5)
            r9.A0R = r7
            r9.A0S = r0
            r9.A0C = r6
            java.lang.String r5 = "iaw_session_id"
            X.0eP r13 = X.AnonymousClass7TE.A1L(r5, r10)
            com.facebook.iabadscontext.IABAdsContext r5 = r2.A03
            java.lang.String r8 = r5.A09
            r6 = r8
            r15 = r20
            if (r8 != 0) goto L_0x02a4
            r6 = r15
        L_0x02a4:
            java.lang.String r5 = "ad_id"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r5, r6)
            java.lang.String r5 = "shopify_checkout_url"
            X.0eP r14 = X.AnonymousClass7TE.A1L(r5, r11)
            java.lang.String r5 = "logging_id"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r5, r1)
            X.QLA r6 = r2.A00
            if (r6 == 0) goto L_0x02d0
            X.T9q r5 = r6.A01()
            java.util.List r5 = r5.A01
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x02d0
            int r5 = r5 + -1
            java.lang.String r5 = r6.A07(r5)
            if (r5 == 0) goto L_0x02d0
            r15 = r5
        L_0x02d0:
            java.lang.String r5 = "source_url"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r5, r15)
            X.0eP[] r5 = new X.0eP[]{r13, r12, r14, r11, r5}
            java.util.HashMap r5 = X.0Yt.A02(r5)
            X.DiU r5 = X.C46649DiU.A04(r7, r5)
            android.util.SparseArray r7 = X.Pxe.A0L()
            if (r8 != 0) goto L_0x02eb
            r8 = r20
        L_0x02eb:
            android.content.Context r6 = r2.A00
            if (r6 == 0) goto L_0x030c
            boolean r24 = X.AnonymousClass3HA.A00(r6)
        L_0x02f3:
            java.lang.String r11 = "LITE_CHECKOUT"
            r22 = 0
            X.QPy r6 = new X.QPy
            r17 = r6
            r19 = r10
            r20 = r1
            r21 = r8
            r17.<init>(r18, r19, r20, r21, r22, r24)
            r6.A00 = r11
            r2.A01 = r6
            java.lang.Object r1 = X.C10071Rm8.A01
            monitor-enter(r1)
            goto L_0x035c
        L_0x030c:
            r24 = 0
            goto L_0x02f3
        L_0x030f:
            r16 = 0
            goto L_0x01f3
        L_0x0313:
            if (r16 == 0) goto L_0x0317
            r15 = r16
        L_0x0317:
            X.0wc r4 = r7.A0C()
            java.lang.String r1 = "client_load_shopslitecheckouteligibility_fail"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            r1 = 101(0x65, float:1.42E-43)
            X.1Ln r5 = X.C51965G9l.A0U(r4, r1)
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x01df
            r5.A0v(r8)
            X.2M7 r1 = X.2M7.A0G
            X.Pxk.A0U(r1, r5)
            X.QIq r10 = new X.QIq
            r10.<init>()
            java.lang.String r1 = "checkout_url_intercept"
            X.SUF.A09(r10, r7, r1)
            java.lang.String r1 = "checkout_url"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r11)
            java.lang.String r1 = "checkout_url_patterns"
            java.util.LinkedHashMap r4 = X.DbY.A0p(r1, r12, r4)
            java.lang.String r1 = "checkout_info"
            r10.A08(r1, r4)
            java.lang.String r1 = "event_payload"
            r5.A0N(r10, r1)
            X.QHh r10 = new X.QHh
            r10.<init>()
            goto L_0x01c4
        L_0x035c:
            X.C10071Rm8.A00 = r6     // Catch:{ all -> 0x0375 }
            monitor-exit(r1)
            r5.A02 = r7
            r1 = 13784(0x35d8, float:1.9315E-41)
            X.4tV r2 = new X.4tV
            r2.<init>(r1)
            r1 = 45
            r2.A0P(r1, r0)
            r5.A03 = r2
            r5.A06 = r0
            r5.A0F(r4, r9)
            return r3
        L_0x0375:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7576QKr.EsV(X.QLA, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    public final void A00(Bundle bundle) {
        Object parcelable;
        String str;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("CommerceCheckoutConstant.request_type", MetaCheckoutRequest.class);
        } else {
            parcelable = bundle.getParcelable("CommerceCheckoutConstant.request_type");
        }
        MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) parcelable;
        if (metaCheckoutRequest != null && metaCheckoutRequest.A00.intValue() == 0 && (str = metaCheckoutRequest.A01) != null) {
            SB5.A00(new C12943TFc(this, str));
        }
    }

    public C7576QKr(IABAdsContext iABAdsContext, String str) {
        this.A03 = iABAdsContext;
        this.A02 = str;
        this.A02 = str.length() == 0 ? C2818159r.A01() : str;
    }
}
