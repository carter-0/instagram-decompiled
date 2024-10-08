package com.instagram.opal.impl.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;

public final class UpdateOpalAudienceMutationResponseImpl extends C250663lr implements C250673ls {

    public final class XdtUpdateOpalAudience extends C250663lr implements C250673ls {

        public final class Opal extends C250663lr implements C250673ls {

            public final class Audience extends C250663lr implements C250673ls {

                public final class Edges extends C250663lr implements C250673ls {

                    public final class Node extends C250663lr implements C250673ls {
                        public Node() {
                            super(-298572088);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0q();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), Node.class, "node", -298572088);
                    }

                    public Edges() {
                        super(760970486);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), Edges.class, "edges", 760970486);
                }

                public Audience() {
                    super(-682684757);
                }
            }

            public Opal() {
                super(1639981732);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(C41845B3m.A0R(), "selected_audience_count"), Audience.class, AnonymousClass000.A00(516), -682684757);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(C41848B3p.A0Q(AnonymousClass4Kz.A00), Opal.class, "opal", 1639981732);
        }

        public XdtUpdateOpalAudience() {
            super(-479904093);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtUpdateOpalAudience.class, AnonymousClass000.A00(1950), -479904093);
    }

    public UpdateOpalAudienceMutationResponseImpl() {
        super(300399840);
    }
}
