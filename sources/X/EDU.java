package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;

public final class EDU extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public EDU(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = str;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r5) {
        int A032;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-225071350);
                EDU.super.onFail(r5);
                E3Y.A04((E3Y) this.A02, (RegFlowExtras) this.A03, this.A04);
                i = -857923774;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-2142311351);
                DbS.A1U(this.A01);
                i = 698121896;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(2140724949);
                DbS.A1U(this.A01);
                i = 2071281574;
                break;
            case 3:
                A032 = AnonymousClass7TG.A0D(r5, 186324889);
                EDU.super.onFail(r5);
                DbS.A1V(this.A01);
                Throwable A012 = r5.A01();
                if (A012 == null || (str = A012.getMessage()) == null) {
                    str = "";
                }
                C14164Tr2.A01("Deep link", 002.A0R("Fetch Superlative fail - ", str));
                Activity activity = (Activity) this.A03;
                C59689JTv.A0C(activity, "DeeplinkSuperlative_unknown_error_occured");
                if (activity.isTaskRoot()) {
                    0kR.A0B(activity, DbX.A08(activity));
                }
                activity.finish();
                i = -2002760630;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-95996219);
                C59689JTv.A0A((Context) this.A01, "clips_archive_failed");
                i = 2089000184;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1598134867);
                EDU.super.onStart();
                ((E3Y) this.A02).A0L.A01();
                i2 = 2076668558;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1800115290);
                EDU.super.onStart();
                AnonymousClass0fN.A00((Dialog) this.A01);
                i2 = 921723710;
                break;
            default:
                EDU.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.content.Context, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e4, code lost:
        r0 = "media";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0113, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0071;
                case 2: goto L_0x004c;
                case 3: goto L_0x00e7;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1988487177(0xffffffff897a17f7, float:-3.0103924E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 566194040(0x21bf6f78, float:1.2972169E-18)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r14.A02
            X.4gf r5 = (X.C270394gf) r5
            if (r5 == 0) goto L_0x002a
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            java.lang.Object r2 = r14.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r0 = "activity_center"
            X.0xG r1 = X.DbS.A0O(r0)
            java.lang.String r0 = r14.A04
            X.F8R.A00(r1, r2, r5, r3, r0)
        L_0x002a:
            java.lang.Object r2 = r14.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r0 = r2.A05
            X.Ubz r1 = X.LT8.A02(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r0 = X.DbS.A0M(r0, r2)
            X.Dba.A12(r1, r0)
            r0 = 437724213(0x1a172435, float:3.1255316E-23)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -128644426(0xfffffffff8550ab6, float:-1.7284007E34)
        L_0x0048:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x004c:
            r0 = -1067593382(0xffffffffc05dd15a, float:-3.4659028)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXO r15 = (X.UXO) r15
            r0 = 1831964698(0x6d31901a, float:3.434566E27)
            int r2 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r1 = r14.A02
            X.0sP r1 = (X.0sP) r1
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x00e4
            A00(r14, r0, r1)
            r0 = -1417374626(0xffffffffab84945e, float:-9.420344E-13)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 2041652886(0x79b12696, float:1.14977395E35)
            goto L_0x0048
        L_0x0071:
            r0 = -64377853(0xfffffffffc29ac03, float:-3.523948E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXO r15 = (X.UXO) r15
            r0 = 1084387429(0x40a27065, float:5.07622)
            int r2 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r1 = r14.A02
            X.0sP r1 = (X.0sP) r1
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x00e4
            A00(r14, r0, r1)
            r0 = 1843158789(0x6ddc5f05, float:8.525197E27)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 646020936(0x26817f48, float:8.985673E-16)
            goto L_0x0048
        L_0x0096:
            r0 = -382469146(0xffffffffe933fbe6, float:-1.3599205E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dw3 r15 = (X.Dw3) r15
            r0 = -1551275834(0xffffffffa38968c6, float:-1.4897943E-17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -159289508(0xfffffffff6816f5c, float:-1.3126268E33)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.EDU.super.onSuccess(r15)
            java.lang.Object r1 = r14.A01
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            if (r1 == 0) goto L_0x00c6
            boolean r0 = r15.A01
            r1.A0g = r0
            boolean r0 = r15.A02
            r1.A0n = r0
            java.lang.String r0 = r15.A00
            r1.A0X = r0
            boolean r0 = r15.A03
            r1.A12 = r0
        L_0x00c6:
            r0 = -1710448244(0xffffffff9a0ca18c, float:-2.9081818E-23)
            X.AnonymousClass0fD.A0A(r0, r2)
            java.lang.Object r2 = r14.A02
            X.E3Y r2 = (X.E3Y) r2
            java.lang.String r1 = r14.A04
            java.lang.Object r0 = r14.A03
            com.instagram.registration.model.RegFlowExtras r0 = (com.instagram.registration.model.RegFlowExtras) r0
            X.E3Y.A04(r2, r0, r1)
            r0 = 532788274(0x1fc1b432, float:8.203679E-20)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 200387740(0xbf1ac9c, float:9.3089537E-32)
            goto L_0x0048
        L_0x00e4:
            java.lang.String r0 = "media"
            goto L_0x0113
        L_0x00e7:
            r0 = 1829580479(0x6d0d2ebf, float:2.7308687E27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.DuY r15 = (X.C47305DuY) r15
            r0 = 2069644427(0x7b5c448b, float:1.1436955E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r15, r8)
            X.EDU.super.onSuccess(r15)
            java.lang.Object r0 = r14.A01
            X.DbS.A1V(r0)
            java.lang.Object r5 = r14.A03
            com.instagram.urlhandler.UserSessionUrlHandlerActivity r5 = (com.instagram.urlhandler.UserSessionUrlHandlerActivity) r5
            java.lang.String r7 = r14.A04
            java.lang.Object r6 = r14.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.G8W r0 = r15.A00
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "response"
        L_0x0113:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011b:
            X.FTX r0 = (X.FTX) r0
            X.3HX r1 = r0.A00
            if (r1 == 0) goto L_0x0201
            X.1E5 r0 = X.1E4.A00(r6)
            X.3HX r2 = r1.FEr(r0)
        L_0x0129:
            android.net.Uri r9 = X.DbT.A09(r7)
            java.lang.String r0 = X.DbT.A10(r9)
            java.lang.String r1 = "instagram.com/standouts"
            boolean r0 = X.00l.A0d(r0, r1, r8)
            if (r0 == 0) goto L_0x01bf
            X.3BQ r9 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_UNIVERSAL_LINK
        L_0x013b:
            if (r2 == 0) goto L_0x0188
            java.lang.Long r0 = r2.A1K
            if (r0 == 0) goto L_0x0179
            r12 = 0
            long r10 = r0.longValue()
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            X.LOR r1 = X.LOR.A01
            X.3IP r0 = r2.A0F
            r1.A01(r0)
            boolean r0 = r5.isTaskRoot()
            if (r0 == 0) goto L_0x015f
            android.content.Intent r0 = X.DbX.A08(r5)
            X.0kR.A0B(r5, r0)
        L_0x015f:
            X.0wW r0 = r5.A00
            X.DbS.A1Z(r0)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FCP.A01(r5, r0, r2, r9)
        L_0x0169:
            r5.finish()
            r0 = -1178749072(0xffffffffb9bdb770, float:-3.618556E-4)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -261687933(0xfffffffff066f583, float:-2.8591343E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0179:
            java.lang.String r10 = "Deep link : latestReelMedia is null "
            java.lang.String r0 = X.AnonymousClass3P9.A03(r6, r2)
            java.lang.String r2 = X.002.A0R(r10, r0)
            java.lang.String r0 = "Superlative"
            X.C14164Tr2.A01(r0, r2)
        L_0x0188:
            java.lang.String r6 = r9.A00
            boolean r0 = X.00l.A0d(r7, r1, r8)
            if (r0 == 0) goto L_0x01a9
            X.EVh r1 = X.C48089EVh.INSTAGRAM
            java.lang.String r7 = "INSTAGRAM_URL_SCHEME"
            java.lang.Class<com.facebook.common.build.BuildConstants> r0 = com.facebook.common.build.BuildConstants.class
            java.lang.reflect.Field r0 = r0.getField(r7)     // Catch:{ Exception -> 0x0204 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0204 }
            X.DbS.A1Y(r1)     // Catch:{ Exception -> 0x0204 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0204 }
            java.lang.String r0 = "://superlative"
            java.lang.String r7 = X.002.A0R(r1, r0)
        L_0x01a9:
            android.net.Uri$Builder r2 = X.DbW.A07(r7)
            java.lang.String r1 = "is_eligible"
            java.lang.String r0 = "false"
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r1, r0)
            java.lang.String r0 = "source"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r6)
            X.Dbc.A0I(r5, r0)
            goto L_0x0169
        L_0x01bf:
            java.lang.String r0 = "source"
            java.lang.String r9 = r9.getQueryParameter(r0)
            if (r9 == 0) goto L_0x01fd
            int r10 = r9.hashCode()
            r0 = 3615(0xe1f, float:5.066E-42)
            if (r10 == r0) goto L_0x01f1
            r0 = 563217739(0x2192054b, float:9.894746E-19)
            if (r10 == r0) goto L_0x01e5
            r0 = 595233003(0x237a88eb, float:1.3581521E-17)
            if (r10 != r0) goto L_0x01fd
            java.lang.String r0 = "notification"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01fd
            X.3BQ r9 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_NOTIFICATION
            goto L_0x013b
        L_0x01e5:
            java.lang.String r0 = "qr_code"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01fd
            X.3BQ r9 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_QR_CODE
            goto L_0x013b
        L_0x01f1:
            java.lang.String r0 = "qp"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01fd
            X.3BQ r9 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_QP
            goto L_0x013b
        L_0x01fd:
            X.3BQ r9 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_DEEP_LINK
            goto L_0x013b
        L_0x0201:
            r2 = 0
            goto L_0x0129
        L_0x0204:
            r2 = move-exception
            r1 = 2
            java.lang.String r0 = "BuildConstants"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Could not access %s.%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDU.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public static void A00(EDU edu, Object obj, 0sP r5) {
        r5.invoke(obj);
        long j = C19226WQh.A04;
        UserSession userSession = (UserSession) edu.A03;
        C17088VHk.A00(userSession).A00();
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(edu.A04, 1);
        A002.A00(new Object());
    }
}
