package X;

/* renamed from: X.G2a  reason: case insensitive filesystem */
public final class C51791G2a extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51791G2a(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51791G2a(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0243, code lost:
        if (r0 == null) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0245, code lost:
        r0.DlL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r3 = X.AnonymousClass7TE.A0l(r0);
        r1 = r4.mArguments;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r2 = r1.getString("ARGUMENT_PRODUCT_ELIGIBILITY");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r1 = r4.mArguments;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r1 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = (com.instagram.api.schemas.IGRevShareProductType) r1.getParcelable("ARGUMENT_PRODUCT_TYPE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r0 = com.instagram.api.schemas.IGRevShareProductType.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        return new X.EFF(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        r0 = X.AnonymousClass7TE.A0l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        return java.lang.Boolean.valueOf(X.C49785F6t.A01(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d6, code lost:
        if (r2 == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022a, code lost:
        r1.invoke(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x023d;
                case 1: goto L_0x0233;
                case 2: goto L_0x022e;
                case 3: goto L_0x0224;
                case 4: goto L_0x021d;
                case 5: goto L_0x0216;
                case 6: goto L_0x01f5;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01de;
                case 9: goto L_0x0192;
                case 10: goto L_0x001f;
                case 11: goto L_0x024b;
                case 12: goto L_0x0005;
                case 13: goto L_0x018b;
                case 14: goto L_0x0173;
                case 15: goto L_0x0163;
                case 16: goto L_0x024b;
                case 17: goto L_0x0005;
                case 18: goto L_0x018b;
                case 19: goto L_0x0138;
                case 20: goto L_0x0125;
                case 21: goto L_0x0116;
                case 22: goto L_0x000c;
                case 23: goto L_0x000c;
                case 24: goto L_0x010b;
                case 25: goto L_0x000c;
                case 26: goto L_0x00eb;
                case 27: goto L_0x024b;
                case 28: goto L_0x0005;
                case 29: goto L_0x018b;
                case 30: goto L_0x00e4;
                case 31: goto L_0x000c;
                case 32: goto L_0x024b;
                case 33: goto L_0x0005;
                case 34: goto L_0x018b;
                case 35: goto L_0x00b8;
                case 36: goto L_0x009c;
                case 37: goto L_0x024b;
                case 38: goto L_0x0005;
                case 39: goto L_0x018b;
                case 40: goto L_0x0070;
                case 41: goto L_0x0068;
                case 42: goto L_0x004c;
                case 43: goto L_0x024b;
                case 44: goto L_0x0005;
                case 45: goto L_0x018b;
                case 46: goto L_0x0045;
                case 47: goto L_0x0035;
                case 48: goto L_0x024b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
        L_0x000b:
            return r5
        L_0x000c:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            if (r5 != 0) goto L_0x000b
        L_0x001c:
            com.instagram.api.schemas.IGRevShareProductType r5 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            return r5
        L_0x001f:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r5 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            java.io.Serializable r1 = r1.getSerializable(r0)
        L_0x002e:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x0033:
            r1 = r5
            goto L_0x002e
        L_0x0035:
            java.lang.Object r0 = r6.A01
            X.E2p r0 = (X.C47443E2p) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.JlH r5 = new X.JlH
            r5.<init>(r0)
            return r5
        L_0x0045:
            java.lang.Object r4 = r6.A01
            X.E2U r4 = (X.E2U) r4
            X.0eM r0 = r4.A02
            goto L_0x0076
        L_0x004c:
            java.lang.Object r4 = r6.A01
            X.E2U r4 = (X.E2U) r4
            X.0eM r3 = r4.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r1 = 31792201(0x1e51c49, float:8.41619E-38)
            java.lang.String r0 = "blocked_category"
            X.Dbx r5 = new X.Dbx
            r5.<init>(r2, r0, r1)
            android.content.Context r0 = r4.requireContext()
            X.DbY.A0v(r0, r5, r4, r3)
            return r5
        L_0x0068:
            java.lang.Object r0 = r6.A01
            X.E2U r0 = (X.E2U) r0
            X.0eM r0 = r0.A02
            goto L_0x012b
        L_0x0070:
            java.lang.Object r4 = r6.A01
            X.E2Q r4 = (X.E2Q) r4
            X.0eM r0 = r4.A01
        L_0x0076:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r2 = r1.getString(r0)
        L_0x0084:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r0 = (com.instagram.api.schemas.IGRevShareProductType) r0
            if (r0 != 0) goto L_0x0094
        L_0x0092:
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x0094:
            X.EFF r5 = new X.EFF
            r5.<init>(r0, r3, r2)
            return r5
        L_0x009a:
            r2 = 0
            goto L_0x0084
        L_0x009c:
            java.lang.Object r4 = r6.A01
            X.E2Q r4 = (X.E2Q) r4
            X.0eM r3 = r4.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r1 = 31792201(0x1e51c49, float:8.41619E-38)
            java.lang.String r0 = "blocked_category"
            X.Dbx r5 = new X.Dbx
            r5.<init>(r2, r0, r1)
            android.content.Context r0 = r4.requireContext()
            X.DbY.A0v(r0, r5, r4, r3)
            return r5
        L_0x00b8:
            java.lang.Object r4 = r6.A01
            X.E4F r4 = (X.E4F) r4
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r2 = (com.instagram.api.schemas.IGRevShareProductType) r2
            if (r2 != 0) goto L_0x00d2
        L_0x00d0:
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x00d2:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r0 = r1.getString(r0)
        L_0x00dc:
            X.EFH r5 = new X.EFH
            r5.<init>(r2, r3, r0)
            return r5
        L_0x00e2:
            r0 = 0
            goto L_0x00dc
        L_0x00e4:
            java.lang.Object r0 = r6.A01
            X.E4S r0 = (X.E4S) r0
            X.0eM r0 = r0.A04
            goto L_0x012b
        L_0x00eb:
            java.lang.Object r1 = r6.A01
            X.E4f r1 = (X.C47480E4f) r1
            X.0eM r0 = r1.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r1.mArguments
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r0 = (com.instagram.api.schemas.IGRevShareProductType) r0
            if (r0 != 0) goto L_0x0105
        L_0x0103:
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x0105:
            X.EF2 r5 = new X.EF2
            r5.<init>(r0, r2)
            return r5
        L_0x010b:
            java.lang.Object r0 = r6.A01
            X.E4Z r0 = (X.E4Z) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x012f
        L_0x0116:
            java.lang.Object r0 = r6.A01
            X.E4N r0 = (X.E4N) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FYn r5 = X.FCG.A00(r0)
            return r5
        L_0x0125:
            java.lang.Object r0 = r6.A01
            X.E4N r0 = (X.E4N) r0
            X.0eM r0 = r0.A04
        L_0x012b:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
        L_0x012f:
            boolean r0 = X.C49785F6t.A01(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0138:
            java.lang.Object r5 = r6.A01
            X.E2I r5 = (X.E2I) r5
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r5.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x0161
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            java.lang.String r0 = r1.getString(r0)
        L_0x014d:
            com.instagram.api.schemas.UserMonetizationProductType r2 = X.C272504kq.A00(r0)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x015b
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r3 = r1.getString(r0)
        L_0x015b:
            X.EFG r5 = new X.EFG
            r5.<init>(r2, r4, r3)
            return r5
        L_0x0161:
            r0 = r3
            goto L_0x014d
        L_0x0163:
            java.lang.Object r0 = r6.A01
            X.E2I r0 = (X.E2I) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.JlH r5 = new X.JlH
            r5.<init>(r0)
            return r5
        L_0x0173:
            java.lang.Object r2 = r6.A01
            X.E3x r2 = (X.C47473E3x) r2
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A00
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.EFE r5 = new X.EFE
            r5.<init>(r1, r0)
            return r5
        L_0x018b:
            java.lang.Object r0 = r6.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x0192:
            java.lang.Object r4 = r6.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314098811734418(0x81037b00030992, double:3.028520541455359E-306)
            boolean r3 = X.182.A06(r2, r4, r0)
            r0 = 2342157108025362833(0x2081037b00020991, double:4.060582173116351E-152)
            boolean r2 = X.182.A06(r2, r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C278814xZ.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x01ca
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L_0x01d8
            if (r3 == 0) goto L_0x01d6
            X.FpR r1 = new X.FpR
            r1.<init>()
            r0 = 212918619(0xcb0e15b, float:2.7252725E-31)
            X.0nY.A01(r0, r1)
        L_0x01ca:
            X.1Dn r0 = X.1Dm.A01
            X.1Dm r0 = r0.A00(r4)
            X.4xZ r5 = new X.4xZ
            r5.<init>(r0)
            return r5
        L_0x01d6:
            if (r2 != 0) goto L_0x01ca
        L_0x01d8:
            java.lang.String r0 = "pando-parsing-instagram-jni"
            X.0dV.A0C(r0)
            goto L_0x01ca
        L_0x01de:
            java.lang.Object r0 = r6.A01
            com.instagram.pando.livetree.LiveTreeJNI r0 = (com.instagram.pando.livetree.LiveTreeJNI) r0
            r0.clearCache()
            goto L_0x0248
        L_0x01e6:
            java.lang.Object r0 = r6.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            int r0 = X.DbS.A05(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x01f5:
            java.lang.Object r0 = r6.A01
            X.Ey7 r0 = (X.Ey7) r0
            com.instagram.profile.fragment.UserDetailFragment r3 = r0.A02
            android.view.View r2 = r0.A01
            float r1 = r0.A00
            if (r2 == 0) goto L_0x0209
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0209
            r2.setCameraDistance(r1)
        L_0x0209:
            com.instagram.common.ui.base.IgFrameLayout r0 = r3.A0K
            r0.removeAllViews()
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.A07
            com.instagram.common.ui.base.IgFrameLayout r0 = r3.A0K
            r1.removeView(r0)
            goto L_0x0248
        L_0x0216:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            X.EVE r0 = X.EVE.RemovePic
            goto L_0x022a
        L_0x021d:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            X.EVE r0 = X.EVE.ChooseNewPic
            goto L_0x022a
        L_0x0224:
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            X.EVE r0 = X.EVE.UseProfilePic
        L_0x022a:
            r1.invoke(r0)
            goto L_0x0248
        L_0x022e:
            java.lang.Object r0 = r6.A01
            X.G7h r0 = (X.C51913G7h) r0
            goto L_0x0243
        L_0x0233:
            java.lang.Object r0 = r6.A01
            X.G7h r0 = (X.C51913G7h) r0
            if (r0 == 0) goto L_0x0248
            r0.Ctz()
            goto L_0x0248
        L_0x023d:
            java.lang.Object r0 = r6.A01
            X.ENy r0 = (X.C47947ENy) r0
            X.G7h r0 = r0.A00
        L_0x0243:
            if (r0 == 0) goto L_0x0248
            r0.DlL()
        L_0x0248:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x024b:
            java.lang.Object r5 = r6.A01
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51791G2a.invoke():java.lang.Object");
    }
}
