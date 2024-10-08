package com.instagram.avatars.suggestions.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C284275Lw;
import X.C41845B3m;
import X.C41847B3o;

public final class IGContextualSuggestionsQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XigContextualSuggestionsData extends C250663lr implements C250673ls {

        public final class StickersRanking extends C250663lr implements C250673ls {

            public final class IntentRanking extends C250663lr implements C250673ls {

                public final class Stickers extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0X(RankedStickerImpl.class, "RankedSticker", -1231237410);
                    }

                    public Stickers() {
                        super(-57436586);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4LF.A00, AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "intent"), C41845B3m.A0A(AnonymousClass4Ks.A02(), Stickers.class, "stickers", -57436586), "is_complete");
                }

                public IntentRanking() {
                    super(-1431638724);
                }
            }

            public final class PhraseRanking extends C250663lr implements C250673ls {

                public final class Stickers extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0X(RankedStickerImpl.class, "RankedSticker", -1231237410);
                    }

                    public Stickers() {
                        super(-332698846);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4LF.A00, AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "phrase"), C41845B3m.A0A(AnonymousClass4Ks.A02(), Stickers.class, "stickers", -332698846), "is_complete");
                }

                public PhraseRanking() {
                    super(1831790809);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C284275Lw A02 = AnonymousClass4Ks.A02();
                return C41847B3o.A0i(AnonymousClass4Ks.A02(), C41845B3m.A0A(A02, IntentRanking.class, AnonymousClass000.A00(1486), -1431638724), PhraseRanking.class, AnonymousClass000.A00(1683), 1831790809);
            }

            public StickersRanking() {
                super(-805091010);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return C41847B3o.A0k(AnonymousClass7TE.A0f(r1, "lexicon_version"), AnonymousClass7TE.A0f(r1, "model_name"), StickersRanking.class, "stickers_ranking", -805091010);
        }

        public XigContextualSuggestionsData() {
            super(1337481285);
        }
    }

    public final XigContextualSuggestionsData A0E() {
        return (XigContextualSuggestionsData) A03(XigContextualSuggestionsData.class, "xig_contextual_suggestions_data(avatar_config_hash:$avatar_config_hash,input:$query_params)", 1337481285);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XigContextualSuggestionsData.class, "xig_contextual_suggestions_data(avatar_config_hash:$avatar_config_hash,input:$query_params)", 1337481285);
    }

    public IGContextualSuggestionsQueryResponseImpl() {
        super(-1908940288);
    }
}
