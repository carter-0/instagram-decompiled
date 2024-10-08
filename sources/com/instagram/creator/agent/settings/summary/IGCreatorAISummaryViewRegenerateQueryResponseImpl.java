package com.instagram.creator.agent.settings.summary;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41846B3n;
import X.C41847B3o;

public final class IGCreatorAISummaryViewRegenerateQueryResponseImpl extends C250663lr implements C250673ls {

    public final class FetchIGUser extends C250663lr implements C250673ls {

        public final class CreatorAi extends C250663lr implements C250673ls {

            public final class Ai extends C250663lr implements C250673ls {

                public final class Persona extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "regenerate_bio");
                    }

                    public Persona() {
                        super(1211462083);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(Persona.class, "persona", 1211462083);
                }

                public Ai() {
                    super(938486414);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(Ai.class, "ai", 938486414);
            }

            public CreatorAi() {
                super(-10673103);
            }
        }

        public FetchIGUser() {
            super(383887332);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(C41846B3n.A07(), CreatorAi.class, "creator_ai", -10673103);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(FetchIGUser.class, "fetch__IGUser(igid:$igid)", 383887332);
    }

    public IGCreatorAISummaryViewRegenerateQueryResponseImpl() {
        super(-1731258501);
    }
}
