package com.instagram.creator.inspiration.repository.graphql;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C289835eI;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import com.google.common.collect.ImmutableList;

public final class GetCreatorInspirationHubQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtAsyncGetCreatorInspirationHub extends C250663lr implements C250673ls {

        public final class SectionContent extends C250663lr implements C250673ls {

            public final class Data extends C250663lr implements C250673ls {

                public final class AccountsSectionContentData extends C250663lr implements C250673ls {

                    public final class UserItems extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0X(UserInfoFragmentImpl.class, "UserInfoFragment", 1766112135);
                        }

                        public UserItems() {
                            super(-924154888);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), UserItems.class, "user_items", -924154888);
                    }

                    public AccountsSectionContentData() {
                        super(-1283851880);
                    }
                }

                public final class AudiosSectionContentData extends C250663lr implements C250673ls {

                    public final class AudioItems extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0X(AudioFragmentImpl.class, "AudioFragment", -1423030943);
                        }

                        public AudioItems() {
                            super(-1820006451);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), AudioItems.class, "audio_items", -1820006451);
                    }

                    public AudiosSectionContentData() {
                        super(-701503055);
                    }
                }

                public final class ClipsSectionContentData extends C250663lr implements C250673ls {

                    public final class ClipsItems extends C250663lr implements C250673ls {

                        public final class Media extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0X(IGCreatorInspirationHubMediaFragmentImpl.class, "IGCreatorInspirationHubMediaFragment", -1290013599);
                            }

                            public Media() {
                                super(-251780288);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), Media.class, "media", -251780288);
                        }

                        public ClipsItems() {
                            super(1639908408);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), ClipsItems.class, "clips_items", 1639908408);
                    }

                    public ClipsSectionContentData() {
                        super(-2052938767);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0k(C41845B3m.A0C(ClipsSectionContentData.class, "clips_section_content_data", -2052938767), C41845B3m.A0C(AudiosSectionContentData.class, "audios_section_content_data", -701503055), AccountsSectionContentData.class, "accounts_section_content_data", -1283851880);
                }

                public Data() {
                    super(27989596);
                }
            }

            public final class PagingInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(C41846B3n.A0J(), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "max_id"), "more_available");
                }

                public PagingInfo() {
                    super(1229464085);
                }
            }

            public final Data A0E() {
                C250663lr A05 = A05(Data.class, "data", 27989596);
                0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data");
                return (Data) A05;
            }

            public final PagingInfo A0F() {
                C250663lr requiredTreeField = getRequiredTreeField(1, "paging_info", PagingInfo.class, 1229464085);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo");
                return (PagingInfo) requiredTreeField;
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0j(C41846B3n.A0J(), C41845B3m.A0A(AnonymousClass4Ks.A01(), Data.class, "data", 27989596), C41845B3m.A0A(AnonymousClass4Ks.A01(), PagingInfo.class, "paging_info", 1229464085), AnonymousClass7TE.A0f(C41845B3m.A0P(), "section_id"), "should_collapse");
            }

            public SectionContent() {
                super(744944815);
            }
        }

        public final class Sections extends C250663lr implements C250673ls {
            public final String A0E() {
                return C41847B3o.A1A(this, "section_id", 2);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(3145));
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r1), AnonymousClass000.A00(3350));
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(A0f, A0f2, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "section_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "section_type"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "title_text"));
            }

            public Sections() {
                super(1404705625);
            }
        }

        public final ImmutableList A0E() {
            return getRequiredCompactedTreeListField(1, "section_content", SectionContent.class, 744944815);
        }

        public final ImmutableList A0F() {
            return getOptionalCompactedTreeListField(0, "sections", Sections.class, 1404705625);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            C289835eI A00 = AnonymousClass4Ks.A00();
            return C41847B3o.A0i(AnonymousClass4Ks.A02(), C41845B3m.A0A(A00, Sections.class, "sections", 1404705625), SectionContent.class, "section_content", 744944815);
        }

        public XdtAsyncGetCreatorInspirationHub() {
            super(347885277);
        }
    }

    public final XdtAsyncGetCreatorInspirationHub A0E() {
        C250663lr A05 = A05(XdtAsyncGetCreatorInspirationHub.class, "xdt_async_get_creator_inspiration_hub(data:$input)", 347885277);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub");
        return (XdtAsyncGetCreatorInspirationHub) A05;
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtAsyncGetCreatorInspirationHub.class, "xdt_async_get_creator_inspiration_hub(data:$input)", 347885277);
    }

    public GetCreatorInspirationHubQueryResponseImpl() {
        super(-1349916154);
    }
}
