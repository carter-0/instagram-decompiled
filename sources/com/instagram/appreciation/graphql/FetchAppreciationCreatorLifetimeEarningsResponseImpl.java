package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kx;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class FetchAppreciationCreatorLifetimeEarningsResponseImpl extends C250663lr implements C250673ls {

    public final class Viewer extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class ContentAppreciationInsights extends C250663lr implements C250673ls {

                public final class LifetimeEstimatedEarnings extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0X(ContentAppreciationMetricsDataImpl.class, "ContentAppreciationMetricsData", 1941391533);
                    }

                    public LifetimeEstimatedEarnings() {
                        super(-2006277420);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(LifetimeEstimatedEarnings.class, AnonymousClass000.A00(690), -2006277420);
                }

                public ContentAppreciationInsights() {
                    super(684595534);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ContentAppreciationInsights.class, AnonymousClass000.A00(569), 684595534);
            }

            public User() {
                super(-697973659);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -697973659);
        }

        public Viewer() {
            super(-1780990833);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(Viewer.class, "viewer", -1780990833);
    }

    public FetchAppreciationCreatorLifetimeEarningsResponseImpl() {
        super(1451341697);
    }
}
