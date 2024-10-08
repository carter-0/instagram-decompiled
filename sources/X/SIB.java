package X;

import android.net.Uri;
import android.os.Looper;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;

public abstract class SIB {
    public final C7902QcU A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcU, android.webkit.WebView] */
    public static void A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, SIB sib) {
        String str = instantExperiencesJSBridgeCall.A02;
        ? r2 = sib.A00;
        String url = r2.getUrl();
        if (!AnonymousClass5He.A00(str) && !AnonymousClass5He.A00(url)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(url);
            if (parse != null && parse2 != null && !AnonymousClass5He.A00(parse.getScheme()) && parse.getScheme().equals(parse2.getScheme()) && parse.getPort() == parse2.getPort() && !AnonymousClass5He.A00(parse.getAuthority()) && parse.getAuthority().equals(parse2.getAuthority())) {
                InstantExperiencesCallResult instantExperiencesCallResult = instantExperiencesJSBridgeCall.A00;
                if (AnonymousClass5He.A00(instantExperiencesCallResult.A01)) {
                    throw AnonymousClass7TE.A15("Invalid state: Missing or invalid callback handler name");
                } else if (!AnonymousClass5He.A00(instantExperiencesCallResult.A00)) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s", instantExperiencesCallResult.A03.toArray());
                    String str2 = instantExperiencesCallResult.A01;
                    boolean A1a = DbW.A1a(instantExperiencesCallResult.A02);
                    String str3 = instantExperiencesCallResult.A00;
                    AnonymousClass7TG.A1P(str2, str3);
                    String A002 = new C10947S2f(str2, str3, formatStrLocaleSafe, (String) null, A1a).A00();
                    if (!AnonymousClass5He.A00(A002)) {
                        r2.A00(A002);
                        return;
                    }
                    throw AnonymousClass7TE.A15("Could not construct JS callback string");
                } else {
                    throw AnonymousClass7TE.A15("Invalid state: Missing callback id");
                }
            }
        }
    }

    public void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (instantExperiencesJSBridgeCall.A00 == null) {
            instantExperiencesJSBridgeCall.A03(new InstantExperiencesCallResult(C8910RFd.INTERNAL_ERROR, "Internal error"));
            0KC.A0Q("InstantExperiencesJSBridgeCallHandler", "Result missing for call id: %s", new Object[]{instantExperiencesJSBridgeCall.A01()});
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A00(instantExperiencesJSBridgeCall, this);
        } else {
            AnonymousClass7TF.A0D().post(new TFM(instantExperiencesJSBridgeCall, this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.google.common.util.concurrent.ListenableFuture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.common.util.concurrent.ListenableFuture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.google.common.util.concurrent.ListenableFuture} */
    /* JADX WARNING: type inference failed for: r9v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.QJH
            if (r0 != 0) goto L_0x01a5
            boolean r0 = r10 instanceof X.QJK
            if (r0 == 0) goto L_0x0075
            r2 = r10
            X.QJK r2 = (X.QJK) r2
            r11.A02()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            X.RGj r1 = X.C8941RGj.PAYMENT_ID
            java.lang.String r0 = "paymentId"
            java.lang.Object r0 = r11.A00(r0)
            r3.put(r1, r0)
            X.RGj r1 = X.C8941RGj.ERROR_MESSAGE
            java.lang.String r0 = "errorMessage"
            java.lang.Object r0 = r11.A00(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r1, r0)
            com.instagram.common.session.UserSession r4 = r2.A00
            java.lang.Class<X.RPe> r2 = X.C9107RPe.class
            r1 = 20
            X.Wxa r0 = new X.Wxa
            r0.<init>(r4, r1)
            r4.A01(r2, r0)
            com.facebook.android.instantexperiences.core.InstantExperiencesParameters r2 = r11.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.instantexperiences.IGInstantExperiencesParameters"
            X.0qQ.A0C(r2, r0)
            com.instagram.business.instantexperiences.IGInstantExperiencesParameters r2 = (com.instagram.business.instantexperiences.IGInstantExperiencesParameters) r2
            java.lang.String r0 = r2.A01
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x006b
            java.util.Iterator r2 = X.Pxf.A0u(r3)
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r3.get(r1)
            X.0qQ.A0A(r0)
            goto L_0x0053
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0070:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0075:
            boolean r0 = r10 instanceof X.QJI
            if (r0 == 0) goto L_0x00cb
            r8 = r10
            X.QJI r8 = (X.QJI) r8
            com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall r11 = (com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall) r11
            r11.A02()
            java.util.HashMap r0 = r11.A04()
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = ","
            android.text.TextUtils.join(r0, r1)
            X.Rvw r7 = r8.A00
            java.util.HashMap r5 = r11.A04()
            com.google.common.util.concurrent.SettableFuture r6 = new com.google.common.util.concurrent.SettableFuture
            r6.<init>()
            X.SF6 r4 = r7.A00
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture
            r3.<init>()
            X.SkZ r2 = new X.SkZ
            r2.<init>(r4, r3)
            java.util.concurrent.Executor r1 = r4.A03
            X.TFL r0 = new X.TFL
            r0.<init>(r4, r2)
            r1.execute(r0)
            r0 = 0
            X.T0S r1 = new X.T0S
            r1.<init>(r0, r5, r6, r7)
            java.util.concurrent.Executor r0 = r7.A03
            X.C255183ti.A04(r1, r3, r0)
            r0 = 11
            X.T0J r1 = new X.T0J
            r1.<init>(r8, r0)
            java.util.concurrent.Executor r0 = r8.A03
        L_0x00c7:
            X.C255183ti.A04(r1, r6, r0)
            return
        L_0x00cb:
            r5 = r10
            X.QJL r5 = (X.QJL) r5
            com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall r11 = (com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall) r11
            r11.A02()
            X.SF6 r4 = r5.A00
            java.lang.String r1 = "selectedAutoCompleteTag"
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r6 = r11.A00(r1)
            X.DbS.A1Y(r6)
            java.lang.String r6 = (java.lang.String) r6
        L_0x00e7:
            java.util.LinkedHashSet r0 = r11.A00
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "autofillFields"
            java.lang.Object r0 = r11.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x011a
            goto L_0x00fd
        L_0x00fa:
            java.lang.String r6 = ""
            goto L_0x00e7
        L_0x00fd:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x010e }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x010e }
            r1 = 0
            int r0 = r2.length()     // Catch:{ JSONException -> 0x010e }
        L_0x0107:
            if (r1 >= r0) goto L_0x011a
            int r1 = X.Pxg.A09(r3, r2, r1)     // Catch:{ JSONException -> 0x010e }
            goto L_0x0107
        L_0x010e:
            r2 = move-exception
            java.lang.String r1 = "RequestAutofillJSBridgeCall"
            java.lang.String r0 = "Failed to getRequestedFields."
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0)
            X.0KC.A0F(r1, r0, r2)
        L_0x011a:
            X.01V.A1C(r3)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r11.A00 = r0
        L_0x0124:
            java.util.LinkedHashSet r8 = r11.A00
            X.0qQ.A0A(r8)
            r7 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r7, r6, r8)
            com.google.common.util.concurrent.SettableFuture r9 = new com.google.common.util.concurrent.SettableFuture
            r9.<init>()
            X.Ska r2 = new X.Ska
            r2.<init>(r9, r6)
            java.util.concurrent.Executor r1 = r4.A03
            X.TFL r0 = new X.TFL
            r0.<init>(r4, r2)
            r1.execute(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Set r0 = com.facebook.android.instantexperiences.autofill.model.NameAutofillData.A00
            boolean r0 = X.00k.A0u(r0, r6)
            if (r0 == 0) goto L_0x0182
            X.S6n r0 = r4.A01
            java.util.ArrayList r0 = r0.A02()
        L_0x0154:
            r2.addAll(r0)
            X.1Ks r0 = new X.1Ks
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[]{r9, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            X.MmO r2 = X.C255183ti.A00(r0)
            X.TY5 r0 = new X.TY5
            r0.<init>(r8, r7)
            X.Szs r1 = new X.Szs
            r1.<init>((int) r3, (X.0sP) r0)
            java.util.concurrent.Executor r0 = r4.A02
            X.R1y r6 = X.C303646Ae.A02(r1, r2, r0)
            r0 = 6
            X.T0O r1 = new X.T0O
            r1.<init>(r0, r11, r5)
            java.util.concurrent.Executor r0 = r5.A02
            goto L_0x00c7
        L_0x0182:
            java.util.Set r0 = com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData.A01
            boolean r0 = X.00k.A0u(r0, r6)
            if (r0 == 0) goto L_0x0191
            X.S6n r0 = r4.A01
            java.util.ArrayList r0 = r0.A03()
            goto L_0x0154
        L_0x0191:
            java.util.Set r0 = com.facebook.android.instantexperiences.autofill.model.AddressAutofillData.A00
            boolean r1 = r0.contains(r6)
            X.S6n r0 = r4.A01
            if (r1 == 0) goto L_0x01a0
            java.util.ArrayList r0 = r0.A00()
            goto L_0x0154
        L_0x01a0:
            java.util.ArrayList r0 = r0.A01()
            goto L_0x0154
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SIB.A02(com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall):void");
    }

    public SIB(C7902QcU qcU) {
        this.A00 = qcU;
    }
}
