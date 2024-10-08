package com.instagram.opal.impl.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41848B3p;

public final class GetOpalQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtOpal extends C250663lr implements C250673ls {

        public final class Audience extends C250663lr implements C250673ls {

            public final class Edges extends C250663lr implements C250673ls {

                public final class Node extends C250663lr implements C250673ls {
                    public Node() {
                        super(-712504337);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A0q();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), Node.class, "node", -712504337);
                }

                public Edges() {
                    super(-5723451);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), Edges.class, "edges", -5723451);
            }

            public Audience() {
                super(-1543286222);
            }
        }

        public final class OpalInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0U(r3, C41845B3m.A0G(r3), AnonymousClass7TE.A0f(r3, "bio"), "profile_picture_url");
            }

            public OpalInfo() {
                super(-1295484760);
            }
        }

        public final OpalInfo A0E() {
            return (OpalInfo) A03(OpalInfo.class, "opal_info", -1295484760);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0L(C41845B3m.A0C(OpalInfo.class, "opal_info", -1295484760), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, AnonymousClass000.A00(3448)), AnonymousClass7TE.A0f(C41845B3m.A0R(), "selected_audience_count"), C41845B3m.A0C(Audience.class, AnonymousClass000.A00(516), -1543286222));
        }

        public XdtOpal() {
            super(973923119);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtOpal.class, "xdt_opal(input:$input)", 973923119);
    }

    public GetOpalQueryResponseImpl() {
        super(-1724114753);
    }
}
