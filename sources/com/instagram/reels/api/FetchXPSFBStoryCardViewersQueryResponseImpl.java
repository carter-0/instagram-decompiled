package com.instagram.reels.api;

import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;

public final class FetchXPSFBStoryCardViewersQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XcxpFetchStory extends C250663lr implements C250673ls {

        public final class InlineXFBXPSStoryCardCXPWrapper extends C250663lr implements C250673ls {

            public final class FbStory extends C250663lr implements C250673ls {

                public final class Author extends C250663lr implements C250673ls {

                    public final class InlineXFBXPSUser extends C250663lr implements C250673ls {

                        public final class StorySettings extends C250663lr implements C250673ls {

                            public final class InlineXFBXPSStorySettings extends C250663lr implements C250673ls {
                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "is_public");
                                }

                                public InlineXFBXPSStorySettings() {
                                    super(593418214);
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41847B3o.A0n(C41845B3m.A08(InlineXFBXPSStorySettings.class, "InlineXFBXPSStorySettings", 593418214), "XFBXPSStorySettings");
                            }

                            public StorySettings() {
                                super(-1680007459);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0Y(StorySettings.class, "story_settings", -1680007459);
                        }

                        public InlineXFBXPSUser() {
                            super(-1947391127);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0n(C41845B3m.A08(InlineXFBXPSUser.class, "InlineXFBXPSUser", -1947391127), "XFBXPSUser");
                    }

                    public Author() {
                        super(-2122200585);
                    }
                }

                public final FBStoryFeedbackFragmentImpl A0E() {
                    return (FBStoryFeedbackFragmentImpl) reinterpretRequired(3, FBStoryFeedbackFragmentImpl.class, -1063303607);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41846B3n.A0L(C41845B3m.A0C(Author.class, "author", -2122200585), C41846B3n.A07(), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_archived_story"), C41845B3m.A08(FBStoryFeedbackFragmentImpl.class, "FBStoryFeedbackFragment", -1063303607));
                }

                public FbStory() {
                    super(276374327);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(FbStory.class, "story_card", 276374327);
            }

            public InlineXFBXPSStoryCardCXPWrapper() {
                super(-1351886448);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0n(C41845B3m.A08(InlineXFBXPSStoryCardCXPWrapper.class, "InlineXFBXPSStoryCardCXPWrapper", -1351886448), "XFBXPSStoryCardCXPWrapper");
        }

        public XcxpFetchStory() {
            super(-1568071472);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), XcxpFetchStory.class, "xcxp_fetch_story(content_destinations:[\"FB\"],content_source:\"IG\",id:$id)", -1568071472);
    }

    public FetchXPSFBStoryCardViewersQueryResponseImpl() {
        super(-1453994290);
    }
}
