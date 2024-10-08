package com.instagram.crossposting.feed.graphql;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.C250663lr;
import X.C250673ls;
import X.C295075nX;

public final class FBToIGDefaultAudienceSettingQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XcxpGetFeedCrosspostingDefaultAudienceStatus extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r5 = AnonymousClass4LF.A00;
            C295075nX r6 = new C295075nX(new AnonymousClass4L7(r5, "is_ig_user_opt_in_default_audience"), "is_opt_in_default_audience");
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r6, new C295075nX(new AnonymousClass4L7(r4, "current_phase"), "enable_default_audience_migration"), new C295075nX(new AnonymousClass4L7(r4, "fb_feed_audience"), "enable_default_audience_migration"), new C295075nX(new AnonymousClass4L7(r4, "consent_accept_deadline"), "enable_default_audience_migration"), new C295075nX(new AnonymousClass4L7(r5, "is_old_crossposter"), "is_opt_in_default_audience"), new C295075nX(new AnonymousClass4L7(r4, "audience_cohort"), "is_opt_in_default_audience")});
        }

        public XcxpGetFeedCrosspostingDefaultAudienceStatus() {
            super(-1843243575);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4Kp(XcxpGetFeedCrosspostingDefaultAudienceStatus.class, "xcxp_get_feed_crossposting_default_audience_status", -1843243575)});
    }

    public FBToIGDefaultAudienceSettingQueryResponseImpl() {
        super(1537164479);
    }
}
