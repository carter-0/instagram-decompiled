package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public final class R9F extends C14097Tpp {
    public final RR5 A00;
    public final C307786Rm A01;
    public final C276544tV A02;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new FrameLayout(context);
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.Rik, java.lang.Object] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x029f */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a7 A[Catch:{ all -> 0x035d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r32, X.C307786Rm r33, X.C276544tV r34, java.lang.Object r35) {
        /*
            r31 = this;
            r7 = r32
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r23 = 0
            r22 = 0
            r16 = 0
            r21 = 0
            r10 = 0
            r1 = 0
            r6 = 0
            r13 = r33
            r2 = r34
            boolean r5 = X.C51973G9u.A1b(r7, r13, r2)
            r12 = 42
            X.4tV r8 = r2.A07(r12)
            r0 = 56
            X.4tV r14 = r2.A07(r0)
            r0 = 61
            java.lang.String r4 = r2.A0K(r0)
            r0 = 53
            java.lang.String r11 = r2.A0K(r0)
            java.lang.String r9 = r2.A0F()
            r20 = 0
            if (r9 == 0) goto L_0x00a5
            X.Rqz r3 = new X.Rqz
            r3.<init>(r13, r2)
            if (r8 != 0) goto L_0x0347
            r19 = 0
        L_0x0040:
            r0 = 58
            r2.A0R(r0, r6)
            r8 = 0
            if (r14 == 0) goto L_0x0059
            java.lang.String r2 = r14.A0F()
            java.lang.String r0 = r14.A0D()
            if (r2 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0059
            r8 = 1
            r22 = r2
            r23 = r0
        L_0x0059:
            r0 = r31
            X.RR5 r4 = r0.A00
            if (r4 == 0) goto L_0x00a5
            boolean r0 = r4.A01
            if (r0 == r5) goto L_0x00a5
            r4.A01 = r5
            X.QQ0 r4 = (X.QQ0) r4
            r4.A03 = r9
            r4.A02 = r11
            r4.A00 = r3
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C11401SRw.A00
            java.lang.Integer r0 = r4.A08
            java.lang.String r3 = "sdk_present_checkout"
            X.0qQ.A0B(r0, r6)
            java.lang.Integer r0 = X.C11401SRw.A00(r0)
            if (r0 == 0) goto L_0x0088
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.C11401SRw.A00
            if (r2 == 0) goto L_0x0088
            int r0 = r0.intValue()
            r2.markerPoint(r0, r3)
        L_0x0088:
            java.lang.String r18 = ""
            if (r8 != 0) goto L_0x00a6
            X.SUF r5 = r4.A01
            if (r5 == 0) goto L_0x00a5
            java.lang.String r6 = r4.A0B
            if (r6 != 0) goto L_0x0096
            r6 = r18
        L_0x0096:
            java.lang.String r9 = r4.A0A
            long r7 = r4.A06
            java.lang.String r10 = r4.A03
            java.lang.String r12 = r4.A09
            java.lang.String r13 = r4.A02
            java.lang.String r11 = "Attempted to present checkout but sdk auth is null"
            r5.A0E(r6, r7, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r20
        L_0x00a6:
            X.SUF r13 = r4.A01
            if (r13 == 0) goto L_0x0109
            java.lang.String r12 = r4.A0B
            if (r12 != 0) goto L_0x00b0
            r12 = r18
        L_0x00b0:
            java.lang.String r9 = r4.A0A
            long r2 = r4.A06
            java.lang.String r8 = r4.A03
            java.lang.String r11 = r4.A09
            java.lang.String r17 = "2024-10"
            java.lang.String r0 = r4.A02
            r24 = r0
            X.AnonymousClass7TG.A0w(r5, r9, r8, r11)
            X.0wc r14 = r13.A0C()
            java.lang.String r0 = "client_load_metacheckoutsdk_init"
            X.0Aj r14 = X.AnonymousClass7TE.A0e(r14, r0)
            boolean r0 = r14.isSampled()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = X.Q2M.A00()
            r14.AAJ(r0, r9)
            X.2M7 r0 = X.SUF.A03(r13)
            X.Pxh.A18(r0, r14)
            X.QIU r15 = new X.QIU
            r15.<init>()
            java.lang.String r0 = "present_checkout"
            X.SUF.A09(r15, r13, r0)
            X.0eP r9 = X.SUF.A08(r8)
            java.lang.String r8 = "csp_version"
            r0 = r17
            java.util.LinkedHashMap r0 = X.DbY.A0p(r8, r0, r9)
            X.Pxi.A1B(r14, r15, r0)
            X.QHd r8 = new X.QHd
            r8.<init>()
            r0 = r24
            X.SUF.A0B(r8, r0, r12, r2)
            X.QKY.A00(r14, r8, r13, r12, r11)
            r14.Cgf()
        L_0x0109:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0119
            com.shopify.checkout.models.ThemeOptions r9 = com.shopify.checkout.models.ThemeOptions.DARK
        L_0x010f:
            X.Rvb r8 = r4.A07
            java.lang.String r4 = r4.A03
            if (r19 == 0) goto L_0x01cd
            r2 = 0
            if (r1 == 0) goto L_0x0149
            goto L_0x011c
        L_0x0119:
            com.shopify.checkout.models.ThemeOptions r9 = com.shopify.checkout.models.ThemeOptions.LIGHT
            goto L_0x010f
        L_0x011c:
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x013a }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x013a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x013a }
        L_0x0126:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x013a }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x013a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x013a }
            com.shopify.checkout.models.Address r0 = X.V68.A00(r0)     // Catch:{ Exception -> 0x013a }
            r11.add(r0)     // Catch:{ Exception -> 0x013a }
            goto L_0x0126
        L_0x013a:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "MetaCheckoutDataFormatConverter_convertShippingAddresses"
            X.1Kn.A02(r0, r1)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            goto L_0x014a
        L_0x0149:
            r11 = r2
        L_0x014a:
            if (r10 == 0) goto L_0x01c3
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.String"
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x01b5 }
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x01b5 }
            java.util.Iterator r17 = r10.iterator()     // Catch:{ Exception -> 0x01b5 }
        L_0x0159:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r15 = r17.next()     // Catch:{ Exception -> 0x01b5 }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "referenceId"
            java.lang.Object r14 = X.Pxh.A0f(r0, r13, r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "cardType"
            java.lang.Object r12 = X.Pxh.A0f(r0, r13, r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "lastFourDigits"
            java.lang.Object r10 = X.Pxh.A0f(r0, r13, r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "expirationMonth"
            java.lang.Object r3 = X.Pxh.A0f(r0, r13, r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "expirationYear"
            java.lang.Object r1 = X.Pxh.A0f(r0, r13, r15)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "billingAddress"
            java.lang.Object r15 = r15.get(r0)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.0qQ.A0C(r15, r0)     // Catch:{ Exception -> 0x01b5 }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ Exception -> 0x01b5 }
            com.shopify.checkout.models.Address r25 = X.V68.A00(r15)     // Catch:{ Exception -> 0x01b5 }
            com.shopify.checkout.models.PaymentMethod r0 = new com.shopify.checkout.models.PaymentMethod     // Catch:{ Exception -> 0x01b5 }
            r24 = r0
            r26 = r14
            r27 = r12
            r28 = r10
            r29 = r3
            r30 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x01b5 }
            r2.add(r0)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x0159
        L_0x01b5:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "MetaCheckoutDataFormatConverter_convertPaymentMethods"
            X.1Kn.A02(r0, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x01c3:
            com.shopify.checkout.models.Defaults r3 = new com.shopify.checkout.models.Defaults
            r1 = r16
            r0 = r21
            r3.<init>(r1, r0, r11, r2)
            goto L_0x01ce
        L_0x01cd:
            r3 = 0
        L_0x01ce:
            java.lang.String r1 = "0"
            r0 = r22
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0295
            com.shopify.checkout.models.AuthenticationVersion r2 = com.shopify.checkout.models.AuthenticationVersion.V1
        L_0x01da:
            com.shopify.checkout.models.Authentication r1 = new com.shopify.checkout.models.Authentication
            r0 = r23
            r1.<init>(r2, r0)
            com.shopify.checkout.models.CheckoutOptions r2 = new com.shopify.checkout.models.CheckoutOptions
            r2.<init>(r1, r3, r9)
            X.0qQ.A0B(r4, r6)
            com.shopify.checkout.models.ThemeOptions r0 = r2.A02
            X.RqR r3 = new X.RqR
            r3.<init>(r0)
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r7)
            X.S1X r1 = r8.A02
            X.Q8x r0 = new X.Q8x
            r0.<init>(r9, r1)
            r7.addView(r0)
            r0.requestDisallowInterceptTouchEvent(r5)
            r0.setBackgroundColor(r6)
            X.Q97 r6 = r8.A00
            r6.A00 = r0
            android.webkit.WebSettings r0 = r0.getSettings()
            if (r0 == 0) goto L_0x0211
            r0.setJavaScriptEnabled(r5)
        L_0x0211:
            android.webkit.WebView r0 = r6.A00
            if (r0 == 0) goto L_0x021e
            android.webkit.WebSettings r0 = r0.getSettings()
            if (r0 == 0) goto L_0x021e
            r0.setDomStorageEnabled(r5)
        L_0x021e:
            android.webkit.WebView r0 = r6.A00
            if (r0 == 0) goto L_0x0225
            r0.setWebViewClient(r6)
        L_0x0225:
            android.webkit.WebView r9 = r6.A00
            if (r9 == 0) goto L_0x02b9
            java.lang.String r0 = "MULTI_PROFILE"
            boolean r0 = X.SDO.A00(r0)
            if (r0 == 0) goto L_0x02ae
            X.QFd r11 = X.SDO.A0S
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0370
            X.TZh r10 = X.C11761Sfz.A01
            if (r10 != 0) goto L_0x024a
            X.Thd r0 = X.C9891Rj6.A00
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r0 = r0.BhH()
            X.Sfz r10 = new X.Sfz
            r10.<init>(r0)
            X.C11761Sfz.A01 = r10
        L_0x024a:
            java.lang.String r7 = "shopify_sdk_profile"
            X.Sfz r10 = (X.C11761Sfz) r10
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0369
            java.lang.Class<org.chromium.support_lib_boundary.ProfileBoundaryInterface> r1 = org.chromium.support_lib_boundary.ProfileBoundaryInterface.class
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r0 = r10.A00
            java.lang.reflect.InvocationHandler r0 = r0.getOrCreateProfile(r7)
            java.lang.Object r0 = X.SL3.A00(r1, r0)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r0 = (org.chromium.support_lib_boundary.ProfileBoundaryInterface) r0
            X.Sfy r10 = new X.Sfy
            r10.<init>(r0)
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0362
            X.Thd r0 = X.C9891Rj6.A00
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r0.ANN(r9)
            r0.setProfile(r7)
            java.lang.String r0 = "shopify_sdk_clear_cookies_thread"
            android.os.HandlerThread r9 = X.Pxf.A0I(r0)
            r9.start()
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r5)
            android.os.Handler r1 = X.Pxf.A0H(r9)
            X.THy r0 = new X.THy
            r0.<init>(r10, r7)
            r1.post(r0)
            r0 = 5
            goto L_0x0299
        L_0x0295:
            com.shopify.checkout.models.AuthenticationVersion r2 = com.shopify.checkout.models.AuthenticationVersion.V2
            goto L_0x01da
        L_0x0299:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x029f }
            r7.await(r0, r5)     // Catch:{ Exception -> 0x029f }
            goto L_0x02aa
        L_0x029f:
            X.QQ0 r0 = r6.A01     // Catch:{ all -> 0x035d }
            java.lang.String r1 = "ShopifySDKWebviewController Unable to clear cookies"
            X.SUF r0 = r0.A01     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02aa
            r0.A0D(r1)     // Catch:{ all -> 0x035d }
        L_0x02aa:
            r9.quitSafely()
            goto L_0x02b9
        L_0x02ae:
            X.QQ0 r0 = r6.A01
            java.lang.String r1 = "ShopifySDKWebviewController Unsupported version of Android, unable to properly clear cookies"
            X.SUF r0 = r0.A01
            if (r0 == 0) goto L_0x02b9
            r0.A0D(r1)
        L_0x02b9:
            android.webkit.WebView r0 = r6.A00
            if (r0 == 0) goto L_0x0345
            android.webkit.WebSettings r0 = r0.getSettings()
            if (r0 == 0) goto L_0x0345
            java.lang.String r0 = r0.getUserAgentString()
        L_0x02c7:
            r6.A07 = r0
            X.QQ0 r1 = r8.A01
            X.RqQ r0 = new X.RqQ
            r0.<init>(r1)
            r6.A02 = r0
            X.Rik r0 = new X.Rik
            r0.<init>()
            r6.A06 = r0
            r6.A05 = r3
            r6.A04 = r2
            java.lang.String r1 = "2024-10"
            java.lang.String r0 = "CheckoutSheetProtocol/"
            java.lang.String r5 = X.002.A0R(r0, r1)
            java.lang.String r1 = r6.A07
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            X.0sL r0 = r6.A09
            if (r1 != 0) goto L_0x02f1
            r1 = r18
        L_0x02f1:
            r0.invoke(r3, r1)
            android.webkit.WebView r0 = r6.A00
            if (r0 == 0) goto L_0x0309
            android.webkit.WebSettings r2 = r0.getSettings()
            if (r2 == 0) goto L_0x0309
            java.lang.String r1 = "Mozilla/5.0 (Linux; Android 14; sdk_gphone64_arm64 Build/UE1A.230829.036.A1; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/126.0.6478.170 Mobile Safari/537.36"
            r0 = 32
            java.lang.String r0 = X.002.A0j(r1, r3, r5, r0, r0)
            r2.setUserAgentString(r0)
        L_0x0309:
            android.webkit.WebView r5 = r6.A00
            if (r5 == 0) goto L_0x00a5
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            com.shopify.checkout.models.CheckoutOptions r0 = r6.A04
            if (r0 == 0) goto L_0x0341
            com.shopify.checkout.models.Authentication r2 = r0.A00
            if (r2 == 0) goto L_0x0341
            r6.A03 = r2
            X.3mC r1 = X.C250863mB.A03
            X.Wt0 r0 = X.C20520Wt0.A00
            java.lang.String r2 = r1.A02(r2, r0)
            X.RqR r0 = r6.A05
            java.lang.String r1 = "checkoutProtocolConfig"
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = "Shopify-Checkout-Sheet-Protocol-Consumer"
            r3.put(r0, r2)
            X.RqR r0 = r6.A05
            if (r0 == 0) goto L_0x0377
            com.shopify.checkout.models.ThemeOptions r0 = r0.A00
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "Sec-CH-Prefers-Color-Scheme"
            r3.put(r0, r1)
        L_0x0341:
            r5.loadUrl(r4, r3)
            return r20
        L_0x0345:
            r0 = 0
            goto L_0x02c7
        L_0x0347:
            java.lang.String r16 = r8.A0K(r12)
            r0 = 44
            java.lang.Object r1 = X.C276544tV.A00(r8, r0)
            r0 = 43
            java.lang.Object r10 = X.C276544tV.A00(r8, r0)
            r19 = 1
            r21 = r4
            goto L_0x0040
        L_0x035d:
            r0 = move-exception
            r9.quitSafely()
            throw r0
        L_0x0362:
            java.lang.String r0 = "This method is not supported by the current version of the framework and the current WebView APK"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0369:
            java.lang.String r0 = "This method is not supported by the current version of the framework and the current WebView APK"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0370:
            java.lang.String r0 = "This method is not supported by the current version of the framework and the current WebView APK"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0377:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R9F.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public R9F(RR5 rr5, C307786Rm r2, C276544tV r3) {
        super(r2, r3);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = rr5;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
