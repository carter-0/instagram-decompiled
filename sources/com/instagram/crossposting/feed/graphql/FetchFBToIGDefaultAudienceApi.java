package com.instagram.crossposting.feed.graphql;

import X.0Tu;
import X.0xY;
import X.0xa;
import X.182;
import X.1Ef;
import X.2D5;
import X.2IS;
import X.AnonymousClass61B;
import X.C250663lr;
import X.C254573sh;
import X.C295065nW;
import X.C295085nY;
import X.C295095nZ;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;

public abstract class FetchFBToIGDefaultAudienceApi {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r5, X.AnonymousClass619 r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r0 = 7
            boolean r0 = X.C66145MDx.A02(r0, r8)
            if (r0 == 0) goto L_0x0083
            r4 = r8
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 != r2) goto L_0x008f
            java.lang.Object r6 = r4.A03
            X.619 r6 = (X.AnonymousClass619) r6
            java.lang.Object r7 = r4.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r4.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0eS.A00(r1)
        L_0x002f:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x004a
            com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl r0 = (com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl) r0
            X.5nZ r0 = A01(r5, r0, r7)
            r6.DoL(r0)
        L_0x004a:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0051:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005c
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0089
            r6.DED()
        L_0x005c:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x005f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0051
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0069:
            X.0eS.A00(r1)
            X.1Ef r1 = A00(r5)
            X.1vn r0 = X.1vm.A01(r5)
            r4.A01 = r5
            r4.A02 = r7
            r4.A03 = r6
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L_0x002f
            return r3
        L_0x0083:
            X.MDx r4 = new X.MDx
            r4.<init>(r8)
            goto L_0x0015
        L_0x0089:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x008f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi.A02(com.instagram.common.session.UserSession, X.619, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final 1Ef A00(UserSession userSession) {
        AnonymousClass61B r5;
        if (182.A06(0Tu.A05, userSession, 36323015163652850L)) {
            2IS r7 = r5.A01;
            r7.A02("enable_default_audience_migration", false);
            r7.A02("is_opt_in_default_audience", false);
            r7.A02("is_opt_in_default_audience", Boolean.valueOf(2D5.A00(userSession).A04.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false)));
            r7.A02("enable_default_audience_migration", true);
        } else {
            r5 = new AnonymousClass61B();
            2IS r4 = r5.A01;
            r4.A02("enable_default_audience_migration", false);
            r4.A02("is_opt_in_default_audience", false);
        }
        return r5.build().setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
    }

    public static final C295095nZ A01(UserSession userSession, FBToIGDefaultAudienceSettingQueryResponseImpl fBToIGDefaultAudienceSettingQueryResponseImpl, String str) {
        C295065nW r4;
        String optionalStringField;
        String optionalStringField2;
        boolean coercedBooleanField;
        boolean coercedBooleanField2;
        C295085nY r3;
        if (fBToIGDefaultAudienceSettingQueryResponseImpl == null) {
            return null;
        }
        C254573sh r0 = C250663lr.Companion;
        C250663lr optionalTreeField = fBToIGDefaultAudienceSettingQueryResponseImpl.getOptionalTreeField(0, "xcxp_get_feed_crossposting_default_audience_status", FBToIGDefaultAudienceSettingQueryResponseImpl.XcxpGetFeedCrosspostingDefaultAudienceStatus.class, -1843243575);
        if (optionalTreeField == null) {
            return null;
        }
        if (182.A06(0Tu.A05, userSession, 36323015163652850L)) {
            0xa r7 = 2D5.A00(userSession).A04;
            boolean z = r7.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false);
            if (!z) {
                boolean coercedBooleanField3 = optionalTreeField.getCoercedBooleanField(4, "is_old_crossposter");
                0xY AR4 = r7.AR4();
                AR4.E5T("PREFERENCE_IG_TO_FB_FEED_IS_OLD_CROSSPOSTER", coercedBooleanField3);
                AR4.apply();
                boolean coercedBooleanField4 = optionalTreeField.getCoercedBooleanField(0, "is_ig_user_opt_in_default_audience");
                0xY AR42 = r7.AR4();
                AR42.E5T("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", coercedBooleanField4);
                AR42.apply();
            }
            coercedBooleanField = r7.getBoolean("PREFERENCE_IG_TO_FB_FEED_IS_OLD_CROSSPOSTER", false);
            coercedBooleanField2 = r7.getBoolean("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", false);
            if (z) {
                r3 = C295085nY.MATCHED;
            } else {
                r3 = (C295085nY) optionalTreeField.getOptionalEnumField(5, "audience_cohort", C295085nY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }
            optionalStringField = str;
            if (str == null || r3 == null) {
                return null;
            }
            r4 = C295065nW.PHASE_3;
            optionalStringField2 = "";
        } else {
            r4 = (C295065nW) optionalTreeField.getOptionalEnumField(1, "current_phase", C295065nW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            optionalStringField = optionalTreeField.getOptionalStringField(2, "fb_feed_audience");
            optionalStringField2 = optionalTreeField.getOptionalStringField(3, "consent_accept_deadline");
            coercedBooleanField = optionalTreeField.getCoercedBooleanField(4, "is_old_crossposter");
            coercedBooleanField2 = optionalTreeField.getCoercedBooleanField(0, "is_ig_user_opt_in_default_audience");
            r3 = (C295085nY) optionalTreeField.getOptionalEnumField(5, "audience_cohort", C295085nY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (optionalStringField == null || r4 == null || optionalStringField2 == null || r3 == null) {
                return null;
            }
        }
        return new C295095nZ(r3, r4, optionalStringField, optionalStringField2, coercedBooleanField2, coercedBooleanField);
    }
}
