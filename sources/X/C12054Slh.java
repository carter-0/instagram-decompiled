package X;

import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;

/* renamed from: X.Slh  reason: case insensitive filesystem */
public final class C12054Slh implements C13705TfO {
    public final int A00;
    public final Object A01;

    public C12054Slh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r5.length() == 0) goto L_0x001b;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfV(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x013b;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00c0;
                case 4: goto L_0x0096;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A01
            X.QKu r3 = (X.C7579QKu) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = r3.A01
            java.lang.String r5 = r0.A00
            r4 = 0
            if (r5 == 0) goto L_0x001b
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            r0 = 0
            android.content.Context r2 = r3.A00
            if (r1 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x0032
            r1 = 2131970096(0x7f134830, float:1.9577133E38)
            java.lang.String r0 = r3.A01()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x002e:
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x0032:
            X.C7579QKu.A00(r3, r0)
            r3.A00 = r4
        L_0x0037:
            com.instagram.common.session.UserSession r1 = r3.A02
            java.lang.String r6 = r3.A03
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = r3.A01
            java.util.List r0 = r0.A02
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            java.lang.String r5 = r0.A00
            java.lang.String r4 = r3.A01()
            java.lang.String r3 = r3.A05
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.T5u r0 = new X.T5u
            r0.<init>()
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_promo_ads_autofill_injection_success"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0085
            long r0 = java.lang.Long.parseLong(r6)
            X.C51970G9q.A17(r2, r0)
            if (r5 == 0) goto L_0x0086
            java.lang.Long r1 = X.DbV.A0q(r5)
        L_0x0073:
            java.lang.String r0 = "offer_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "promo_code"
            r2.AAJ(r0, r4)
            X.C51965G9l.A1L(r2, r3)
            r2.Cgf()
        L_0x0085:
            return
        L_0x0086:
            r1 = 0
            goto L_0x0073
        L_0x0088:
            if (r2 == 0) goto L_0x0032
            r1 = 2131970097(0x7f134831, float:1.9577135E38)
            java.lang.String r0 = r3.A01()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r5}
            goto L_0x002e
        L_0x0096:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0085
            org.json.JSONObject r5 = X.C66580MXl.A17(r10)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r4 = r5.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x00a4:
            boolean r0 = r4.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r0 == 0) goto L_0x0085
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)     // Catch:{ JSONException -> 0x0085 }
            java.lang.Object r0 = r9.A01     // Catch:{ JSONException -> 0x0085 }
            X.QKt r0 = (X.C7578QKt) r0     // Catch:{ JSONException -> 0x0085 }
            java.util.Map r2 = r0.A0B     // Catch:{ JSONException -> 0x0085 }
            long r0 = r5.getLong(r3)     // Catch:{ JSONException -> 0x0085 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0085 }
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x00a4
        L_0x00c0:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0085
            org.json.JSONObject r1 = X.C66580MXl.A17(r10)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r0 = "text_and_dom"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r0 = "text_only"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r0 = "dom_only"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0085 }
            java.lang.Object r0 = r9.A01     // Catch:{ JSONException -> 0x0085 }
            X.QKt r0 = (X.C7578QKt) r0     // Catch:{ JSONException -> 0x0085 }
            X.RzE r0 = r0.A04     // Catch:{ JSONException -> 0x0085 }
            r0.A02 = r3     // Catch:{ JSONException -> 0x0085 }
            r0.A04 = r2     // Catch:{ JSONException -> 0x0085 }
            r0.A03 = r1     // Catch:{ JSONException -> 0x0085 }
            goto L_0x014b
        L_0x00eb:
            if (r10 == 0) goto L_0x0085
            java.lang.Long r1 = X.DbV.A0q(r10)     // Catch:{  }
            java.lang.Object r0 = r9.A01     // Catch:{  }
            X.QKt r0 = (X.C7578QKt) r0     // Catch:{  }
            X.RzE r0 = r0.A04     // Catch:{  }
            r0.A00 = r1     // Catch:{  }
            goto L_0x014c
        L_0x00fa:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0085
            org.json.JSONObject r7 = X.C66580MXl.A17(r10)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r8 = r7.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0108:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r0 == 0) goto L_0x0085
            java.lang.String r6 = X.AnonymousClass7TE.A18(r8)     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r0 = "width"
            int r2 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r0 = "height"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0085 }
            if (r2 != 0) goto L_0x0128
            if (r1 != 0) goto L_0x0128
            goto L_0x0108
        L_0x0128:
            java.lang.Object r0 = r9.A01     // Catch:{ JSONException -> 0x0085 }
            X.TBN r0 = (X.TBN) r0     // Catch:{ JSONException -> 0x0085 }
            X.QKt r0 = r0.A00     // Catch:{ JSONException -> 0x0085 }
            java.util.Map r5 = r0.A07     // Catch:{ JSONException -> 0x0085 }
            long r3 = (long) r2     // Catch:{ JSONException -> 0x0085 }
            long r1 = (long) r1     // Catch:{ JSONException -> 0x0085 }
            X.T9G r0 = new X.T9G     // Catch:{ JSONException -> 0x0085 }
            r0.<init>(r3, r1)     // Catch:{ JSONException -> 0x0085 }
            r5.put(r6, r0)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0108
        L_0x013b:
            java.lang.Object r2 = r9.A01
            X.S6T r2 = (X.S6T) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0085
            X.REu r1 = X.C8902REu.CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_SUCCESS
            java.util.Map r0 = r2.A01
            X.C11418SSt.A03(r1, r0)
            return
        L_0x014b:
            return
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12054Slh.DfV(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.0iw, java.lang.Object] */
    public final void onFailure() {
        Long l;
        switch (this.A00) {
            case 0:
                S6T s6t = (S6T) this.A01;
                if (s6t.A02) {
                    C11418SSt.A03(C8902REu.CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_FAIL, s6t.A01);
                    return;
                }
                return;
            case 5:
                C7579QKu qKu = (C7579QKu) this.A01;
                UserSession userSession = qKu.A02;
                String str = qKu.A03;
                String str2 = ((IgPromoAdsPromoCode) AnonymousClass7TE.A13(qKu.A01.A02)).A00;
                String A012 = qKu.A01();
                String str3 = qKu.A05;
                0qQ.A0B(A012, 3);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new Object(), userSession), "ig_promo_ads_autofill_injection_fail");
                if (A0e.isSampled()) {
                    C51970G9q.A17(A0e, Long.parseLong(str));
                    if (str2 != null) {
                        l = DbV.A0q(str2);
                    } else {
                        l = null;
                    }
                    A0e.A9F("offer_id", l);
                    A0e.AAJ("promo_code", A012);
                    C51965G9l.A1L(A0e, str3);
                    A0e.Cgf();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
