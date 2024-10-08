package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;

/* renamed from: X.59a  reason: invalid class name and case insensitive filesystem */
public abstract class C2816959a {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r1 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r5 != null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.iabadscontext.IgPromoAdsExtension A01(X.C250363lK r5, com.instagram.common.session.UserSession r6, X.1Xj r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r5 == 0) goto L_0x0036
            X.4g0 r0 = r5.Bhe()
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = r0.Bhg()
            if (r0 == 0) goto L_0x0036
            java.util.Iterator r3 = r0.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r3.next()
            X.DSd r0 = (X.C46248DSd) r0
            java.lang.String r2 = r0.Bhf()
            if (r2 == 0) goto L_0x0017
            java.lang.String r1 = r0.BXn()
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = new com.facebook.iabadscontext.IgPromoAdsPromoCode
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0017
        L_0x0036:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x0073
            com.instagram.user.model.User r0 = r7.A2A(r6)
            if (r0 == 0) goto L_0x0049
            java.lang.String r3 = r0.getFullName()
        L_0x0049:
            if (r5 == 0) goto L_0x006f
            X.4g0 r0 = r5.Bhe()
            if (r0 == 0) goto L_0x006f
            java.lang.Boolean r0 = r0.CP8()
            if (r0 == 0) goto L_0x006f
            boolean r2 = r0.booleanValue()
        L_0x005b:
            X.4g0 r0 = r5.Bhe()
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r0.B7E()
            if (r1 != 0) goto L_0x0069
        L_0x0067:
            java.lang.String r1 = "none"
        L_0x0069:
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = new com.facebook.iabadscontext.IgPromoAdsExtension
            r0.<init>(r4, r2, r3, r1)
            return r0
        L_0x006f:
            r2 = 0
            if (r5 == 0) goto L_0x0067
            goto L_0x005b
        L_0x0073:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2816959a.A01(X.3lK, com.instagram.common.session.UserSession, X.1Xj):com.facebook.iabadscontext.IgPromoAdsExtension");
    }

    public static final RFY A00(IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes) {
        switch (iGPostClickEligibleExperienceTypes.ordinal()) {
            case 2:
                return RFY.IAB_AUTOFILL_ADS_PERSONALIZATION;
            case 5:
                return RFY.IAB_META_CHECKOUT_FIRMLY;
            case 6:
                return RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK;
            case 7:
                return RFY.IAB_META_CHECKOUT_SCA;
            case 8:
                return RFY.IAB_META_CHECKOUT_SDK;
            case 10:
                return RFY.IAB_STICKY_UTM_PARAMS;
            default:
                return RFY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
    }
}
