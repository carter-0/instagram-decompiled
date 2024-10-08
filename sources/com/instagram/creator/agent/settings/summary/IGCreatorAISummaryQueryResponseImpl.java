package com.instagram.creator.agent.settings.summary;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;

public final class IGCreatorAISummaryQueryResponseImpl extends C250663lr implements C250673ls {

    public final class FetchIGUser extends C250663lr implements C250673ls {

        public final class CreatorAi extends C250663lr implements C250673ls {

            public final class Ai extends C250663lr implements C250673ls {

                public final class Persona extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "bio");
                    }

                    public Persona() {
                        super(-1584022921);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(Persona.class, "persona", -1584022921);
                }

                public Ai() {
                    super(1573602634);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(Ai.class, "ai", 1573602634);
            }

            public CreatorAi() {
                super(1928901240);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(CreatorAi.class, "creator_ai", 1928901240);
        }

        public FetchIGUser() {
            super(254180558);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(FetchIGUser.class, "fetch__IGUser(igid:$igid)", 254180558);
    }

    public IGCreatorAISummaryQueryResponseImpl() {
        super(-1454498102);
    }
}
