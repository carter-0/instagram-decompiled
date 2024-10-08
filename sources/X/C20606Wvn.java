package X;

/* renamed from: X.Wvn  reason: case insensitive filesystem */
public final class C20606Wvn extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20606Wvn(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v85, types: [X.F1I, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0374, code lost:
        if (r2.getBoolean(r0) != r1) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037a, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x014f;
                case 1: goto L_0x0048;
                case 2: goto L_0x015a;
                case 3: goto L_0x0164;
                case 4: goto L_0x016e;
                case 5: goto L_0x0186;
                case 6: goto L_0x01a1;
                case 7: goto L_0x008d;
                case 8: goto L_0x01b2;
                case 9: goto L_0x01c9;
                case 10: goto L_0x01dc;
                case 11: goto L_0x01ea;
                case 12: goto L_0x01fe;
                case 13: goto L_0x009c;
                case 14: goto L_0x0211;
                case 15: goto L_0x0224;
                case 16: goto L_0x022e;
                case 17: goto L_0x0238;
                case 18: goto L_0x0242;
                case 19: goto L_0x024c;
                case 20: goto L_0x014c;
                case 21: goto L_0x0005;
                case 22: goto L_0x0256;
                case 23: goto L_0x037d;
                case 24: goto L_0x00d4;
                case 25: goto L_0x00f9;
                case 26: goto L_0x0123;
                case 27: goto L_0x000c;
                case 28: goto L_0x0020;
                case 29: goto L_0x025d;
                case 30: goto L_0x014c;
                case 31: goto L_0x0005;
                case 32: goto L_0x0256;
                case 33: goto L_0x0275;
                case 34: goto L_0x02a9;
                case 35: goto L_0x030a;
                case 36: goto L_0x030a;
                case 37: goto L_0x030a;
                case 38: goto L_0x0316;
                case 39: goto L_0x0005;
                case 40: goto L_0x0256;
                case 41: goto L_0x00ab;
                case 42: goto L_0x031f;
                case 43: goto L_0x0338;
                case 44: goto L_0x0034;
                case 45: goto L_0x0349;
                case 46: goto L_0x0355;
                case 47: goto L_0x0361;
                case 48: goto L_0x014c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
        L_0x000b:
            return r5
        L_0x000c:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x038f }
            X.Ua6 r0 = (X.C15299Ua6) r0     // Catch:{ Exception -> 0x038f }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "entry_point"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r5 != 0) goto L_0x000b
            goto L_0x0385
        L_0x0020:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x038f }
            X.Ua6 r0 = (X.C15299Ua6) r0     // Catch:{ Exception -> 0x038f }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "media_id"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 != 0) goto L_0x000b
            goto L_0x038a
        L_0x0034:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x039e }
            X.K5y r0 = (X.C61403K5y) r0     // Catch:{ Exception -> 0x039e }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x039e }
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "entry_point"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ Exception -> 0x039e }
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 != 0) goto L_0x000b
            goto L_0x0399
        L_0x0048:
            X.4Cq r0 = X.C71132OdV.A01
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0056:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006f
            X.0eP r0 = X.JTO.A1A(r2)
            java.lang.Object r0 = r0.A00
            com.meta.flytrap.attachment.model.BugReportAttachment r0 = (com.meta.flytrap.attachment.model.BugReportAttachment) r0
            java.lang.String r1 = r0.A03
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0056
        L_0x006f:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0078:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            r0 = 1
            r5.put(r1, r0)
            goto L_0x0078
        L_0x008d:
            java.lang.Object r0 = r13.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r5 = X.DbU.A06(r0)
            if (r5 != 0) goto L_0x000b
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x009c:
            java.lang.Object r0 = r13.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r5 = X.DbU.A06(r0)
            if (r5 != 0) goto L_0x000b
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x00ab:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x03a8
            r0 = 701(0x2bd, float:9.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x03a8
            com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType[] r3 = com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType.values()
            int r2 = r3.length
            r1 = 0
        L_0x00c5:
            if (r1 >= r2) goto L_0x03a8
            r5 = r3[r1]
            java.lang.String r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x000b
            int r1 = r1 + 1
            goto L_0x00c5
        L_0x00d4:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x00ec }
            X.Ua6 r0 = (X.C15299Ua6) r0     // Catch:{ Exception -> 0x00ec }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x00ec }
            if (r1 == 0) goto L_0x00e7
            java.lang.String r0 = "boost_packages"
            android.os.Parcelable r5 = r1.getParcelable(r0)     // Catch:{ Exception -> 0x00ec }
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r5 = (com.instagram.business.promote.model.IGBoostPackagesFlowInfo) r5     // Catch:{ Exception -> 0x00ec }
            if (r5 == 0) goto L_0x00e7
            return r5
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x00ec }
            throw r0     // Catch:{ Exception -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.Ua6 r0 = (X.C15299Ua6) r0
            r0.A08 = r1
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r5 = new com.instagram.business.promote.model.IGBoostPackagesFlowInfo
            r5.<init>()
            return r5
        L_0x00f9:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x0115 }
            X.Ua6 r0 = (X.C15299Ua6) r0     // Catch:{ Exception -> 0x0115 }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x0115 }
            if (r1 == 0) goto L_0x0108
            java.lang.String r0 = "currency"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            if (r0 == 0) goto L_0x0110
            java.util.Currency r5 = java.util.Currency.getInstance(r0)     // Catch:{ Exception -> 0x0115 }
            return r5
        L_0x0110:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0115 }
            throw r0     // Catch:{ Exception -> 0x0115 }
        L_0x0115:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.Ua6 r0 = (X.C15299Ua6) r0
            r0.A08 = r1
            java.lang.String r0 = "USD"
            java.util.Currency r5 = java.util.Currency.getInstance(r0)
            return r5
        L_0x0123:
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x013f }
            X.Ua6 r0 = (X.C15299Ua6) r0     // Catch:{ Exception -> 0x013f }
            android.os.Bundle r1 = r0.mArguments     // Catch:{ Exception -> 0x013f }
            if (r1 == 0) goto L_0x0132
            java.lang.String r0 = "currency_offset"
            java.lang.Integer r0 = X.DbV.A0o(r1, r0)     // Catch:{ Exception -> 0x013f }
            goto L_0x0133
        L_0x0132:
            r0 = 0
        L_0x0133:
            if (r0 == 0) goto L_0x013a
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x013f }
            goto L_0x0147
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x013f }
            throw r0     // Catch:{ Exception -> 0x013f }
        L_0x013f:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.Ua6 r0 = (X.C15299Ua6) r0
            r0.A08 = r1
            r0 = 1
        L_0x0147:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x014c:
            java.lang.Object r5 = r13.A01
            return r5
        L_0x014f:
            java.lang.Object r0 = r13.A01
            X.Jj4 r0 = (X.C60305Jj4) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.LC9 r5 = X.C63322Kv5.A00(r0)
            return r5
        L_0x015a:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.OtM r5 = new X.OtM
            r5.<init>(r0)
            return r5
        L_0x0164:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.T75 r5 = new X.T75
            r5.<init>(r0)
            return r5
        L_0x016e:
            com.facebook.common.callercontext.CallerContext r0 = X.FRU.A0B
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0wW r1 = r0.getSession()
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.FRU r5 = new X.FRU
            r5.<init>(r0, r1)
            return r5
        L_0x0186:
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            r0 = 4010(0xfaa, float:5.619E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01a1:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0H
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            X.16V r5 = r0.A0J()
            return r5
        L_0x01b2:
            java.lang.Object r2 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r2 = (com.instagram.business.activity.BusinessConversionActivity) r2
            X.0eM r0 = r2.A0F
            java.lang.Object r1 = r0.getValue()
            X.EtT r1 = (X.EtT) r1
            X.F1I r0 = new X.F1I
            r0.<init>()
            X.FBS r5 = new X.FBS
            r5.<init>(r2, r2, r0, r1)
            return r5
        L_0x01c9:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.0wW r5 = r1.A04(r0)
            return r5
        L_0x01dc:
            java.lang.Object r0 = r13.A01
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            X.0wW r0 = r0.getSession()
            X.EtT r5 = new X.EtT
            r5.<init>(r0)
            return r5
        L_0x01ea:
            java.lang.Object r0 = r13.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_DISABLE_ACTIVITY_TRANSITION_ANIMATION"
            r0 = 0
            boolean r0 = r2.getBooleanExtra(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01fe:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.instagram.common.session.UserSession r5 = r1.A06(r0)
            return r5
        L_0x0211:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r13.A01
            com.instagram.business.activity.FbConnectPageActivity r0 = (com.instagram.business.activity.FbConnectPageActivity) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.instagram.common.session.UserSession r5 = r1.A06(r0)
            return r5
        L_0x0224:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VwK r5 = new X.VwK
            r5.<init>(r0)
            return r5
        L_0x022e:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.WT7 r5 = new X.WT7
            r5.<init>(r0)
            return r5
        L_0x0238:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.WT9 r5 = new X.WT9
            r5.<init>(r0)
            return r5
        L_0x0242:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.WT8 r5 = new X.WT8
            r5.<init>(r0)
            return r5
        L_0x024c:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.WT6 r5 = new X.WT6
            r5.<init>(r0)
            return r5
        L_0x0256:
            java.lang.Object r0 = r13.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x025d:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x026d
            java.lang.String r0 = "media_url"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x026f
        L_0x026d:
            java.lang.String r0 = ""
        L_0x026f:
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r0)
            return r5
        L_0x0275:
            java.lang.Object r1 = r13.A01
            X.Ua6 r1 = (X.C15299Ua6) r1
            X.0eM r0 = r1.A0F
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A09
            java.lang.Object r6 = r0.getValue()
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r6 = (com.instagram.business.promote.model.IGBoostPackagesFlowInfo) r6
            X.0eM r0 = r1.A0A
            java.lang.Object r11 = X.AnonymousClass7TE.A14(r0)
            java.util.Currency r11 = (java.util.Currency) r11
            X.0eM r0 = r1.A0B
            int r12 = X.DbX.A07(r0)
            X.0eM r0 = r1.A0C
            java.lang.String r9 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A0D
            java.lang.String r10 = X.DbS.A0t(r0)
            com.instagram.model.mediatype.ProductType r8 = com.instagram.model.mediatype.ProductType.FEED
            X.UhW r5 = new X.UhW
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x02a9:
            java.lang.Object r0 = r13.A01
            X.U8z r0 = (X.C14788U8z) r0
            X.Uq1 r1 = r0.A06
            java.lang.String r7 = r0.A0A
            X.UzE r0 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r9 = r0.toString()
            r0 = 1
            X.0qQ.A0B(r9, r0)
            com.instagram.common.session.UserSession r3 = r1.A01
            X.9F4 r0 = X.AnonymousClass9F3.A00(r3)
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.9F7 r0 = (X.AnonymousClass9F7) r0
            java.lang.String r2 = "BoostPackageRepository"
            com.facebook.common.callercontext.CallerContext r5 = com.facebook.common.callercontext.CallerContext.A01(r2)
            X.0qQ.A0A(r5)
            com.instagram.business.boost.model.BoostFlowType r1 = com.instagram.business.boost.model.BoostFlowType.ORIGINAL
            java.lang.String r8 = r1.toString()
            java.lang.String r6 = "ig_android_promote_ads_manager_ig_to_fb_boost_media"
            X.9JK r4 = new X.9JK
            r4.<init>((com.facebook.common.callercontext.CallerContext) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            java.lang.Object r0 = r0.Au3(r4)
            X.VVL r0 = (X.VVL) r0
            if (r0 == 0) goto L_0x0302
            X.9Gd r0 = r0.A01
            if (r0 == 0) goto L_0x0302
            com.facebook.common.callercontext.CallerContext r5 = com.facebook.common.callercontext.CallerContext.A01(r2)
            X.0qQ.A0A(r5)
            java.lang.String r8 = r1.toString()
            X.9JK r4 = new X.9JK
            r4.<init>((com.facebook.common.callercontext.CallerContext) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            java.lang.String r5 = r0.A00(r4, r3)
            if (r5 == 0) goto L_0x0302
            return r5
        L_0x0302:
            java.lang.String r0 = "Ad Account ID is non null for payment flow"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x030a:
            java.lang.Object r0 = r13.A01
            X.Vsg r0 = (X.C18485Vsg) r0
            java.util.List r0 = r0.A04
            r0.clear()
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0316:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r5 = r0.requireParentFragment()
            return r5
        L_0x031f:
            java.lang.Object r2 = r13.A01
            X.K6l r2 = (X.C61414K6l) r2
            X.0eM r0 = r2.A08
            java.lang.Object r1 = r0.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            X.0eM r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType r0 = (com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType) r0
            X.Ji9 r5 = r1.A02(r0)
            return r5
        L_0x0338:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0347
            java.lang.String r0 = "coupon_offer_id"
            java.lang.String r5 = r1.getString(r0)
            return r5
        L_0x0347:
            r5 = 0
            return r5
        L_0x0349:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x037b
            java.lang.String r0 = "is_ctwa_coupon_aymt"
            goto L_0x0370
        L_0x0355:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x037b
            java.lang.String r0 = "is_from_ctwa_upsell"
            goto L_0x0370
        L_0x0361:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x037b
            r0 = 81
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0370:
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x037b
        L_0x0376:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x037b:
            r1 = 0
            goto L_0x0376
        L_0x037d:
            java.lang.String r0 = "session$delegate"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0385:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x038f }
            goto L_0x038e
        L_0x038a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x038f }
        L_0x038e:
            throw r0     // Catch:{ Exception -> 0x038f }
        L_0x038f:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.Ua6 r0 = (X.C15299Ua6) r0
            r0.A08 = r1
            java.lang.String r5 = ""
            return r5
        L_0x0399:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x039e }
            throw r0     // Catch:{ Exception -> 0x039e }
        L_0x039e:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.K5y r0 = (X.C61403K5y) r0
            r0.A02 = r1
            java.lang.String r5 = "unknown"
            return r5
        L_0x03a8:
            java.lang.String r0 = "tabType cannot be null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20606Wvn.invoke():java.lang.Object");
    }
}
