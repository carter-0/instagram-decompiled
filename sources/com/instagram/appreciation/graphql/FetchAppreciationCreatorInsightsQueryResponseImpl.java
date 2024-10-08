package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4LF;
import X.AnonymousClass69U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class FetchAppreciationCreatorInsightsQueryResponseImpl extends C250663lr implements C250673ls {

    public final class Viewer extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class ContentAppreciationInsights extends C250663lr implements C250673ls {

                public final class LifetimeEstimatedEarnings extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0X(ContentAppreciationMetricsDataImpl.class, "ContentAppreciationMetricsData", 1941391533);
                    }

                    public LifetimeEstimatedEarnings() {
                        super(2086930639);
                    }
                }

                public final class MonthlyMetrics extends C250663lr implements C250673ls {

                    public final class Edges extends C250663lr implements C250673ls {

                        public final class Node extends C250663lr implements C250673ls {

                            public final class MetricsData extends C250663lr implements C250673ls {
                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return AnonymousClass7TG.A0X(ContentAppreciationMetricsDataImpl.class, "ContentAppreciationMetricsData", 1941391533);
                                }

                                public MetricsData() {
                                    super(-785410175);
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0C(MetricsData.class, AnonymousClass000.A00(3601), -785410175), AnonymousClass000.A00(3152));
                            }

                            public Node() {
                                super(1191000141);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0Y(Node.class, "node", 1191000141);
                        }

                        public Edges() {
                            super(-1186689805);
                        }
                    }

                    public final class PageInfo extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4LF.A00, AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "start_cursor"), "has_next_page");
                        }

                        public PageInfo() {
                            super(-2144576818);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0m(C41845B3m.A0A(AnonymousClass4Ks.A02(), Edges.class, "edges", -1186689805), PageInfo.class, "page_info", -2144576818);
                    }

                    public MonthlyMetrics() {
                        super(-1275275814);
                    }
                }

                public final class TopEarningContent extends C250663lr implements C250673ls {

                    public final class Media extends C250663lr implements C250673ls {

                        public final class MediaGiftEarnings extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                                return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "formatted_amount"), "amount_with_offset");
                            }

                            public MediaGiftEarnings() {
                                super(1942040202);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return C41846B3n.A0L(AnonymousClass7TE.A0f(r2, "instagram_media_id"), AnonymousClass7TE.A0f(AnonymousClass69U.A00, "creation_time"), AnonymousClass7TE.A0f(r2, "display_url"), C41845B3m.A0C(MediaGiftEarnings.class, AnonymousClass000.A00(696), 1942040202));
                        }

                        public Media() {
                            super(1586467715);
                        }
                    }

                    public final Media A0E() {
                        return (Media) A03(Media.class, "media", 1586467715);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0C(Media.class, "media", 1586467715), AnonymousClass000.A00(3150));
                    }

                    public TopEarningContent() {
                        super(-962291286);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0k(C41845B3m.A0C(LifetimeEstimatedEarnings.class, AnonymousClass000.A00(690), 2086930639), C41845B3m.A07(C41845B3m.A0A(AnonymousClass4Ks.A02(), TopEarningContent.class, AnonymousClass000.A00(4120), -962291286), AnonymousClass000.A00(3992)), MonthlyMetrics.class, AnonymousClass000.A00(1604), -1275275814);
                }

                public ContentAppreciationInsights() {
                    super(-1737055912);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ContentAppreciationInsights.class, AnonymousClass000.A00(569), -1737055912);
            }

            public User() {
                super(-507660251);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -507660251);
        }

        public Viewer() {
            super(317146606);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(Viewer.class, "viewer", 317146606);
    }

    public FetchAppreciationCreatorInsightsQueryResponseImpl() {
        super(1744226400);
    }
}
