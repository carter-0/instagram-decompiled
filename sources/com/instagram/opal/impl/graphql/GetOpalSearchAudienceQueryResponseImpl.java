package com.instagram.opal.impl.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C284275Lw;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;

public final class GetOpalSearchAudienceQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtOpal extends C250663lr implements C250673ls {

        public final class SearchAudience extends C250663lr implements C250673ls {

            public final class Edges extends C250663lr implements C250673ls {

                public final class Node extends C250663lr implements C250673ls {
                    public Node() {
                        super(-266726937);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A0q();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(C41846B3n.A0J(), C41845B3m.A0A(AnonymousClass4Ks.A01(), Node.class, "node", -266726937), "selected");
                }

                public Edges() {
                    super(-435883496);
                }
            }

            public final class PageInfo extends C250663lr implements C250673ls {
                public PageInfo() {
                    super(1605480580);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, AnonymousClass7TE.A0f(C41846B3n.A0J(), "has_next_page"), "end_cursor");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C284275Lw A01 = AnonymousClass4Ks.A01();
                return C41847B3o.A0i(AnonymousClass4Ks.A02(), C41845B3m.A0A(A01, PageInfo.class, "page_info", 1605480580), Edges.class, "edges", -435883496);
            }

            public SearchAudience() {
                super(2114662413);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), SearchAudience.class, AnonymousClass000.A00(770), 2114662413);
        }

        public XdtOpal() {
            super(-1645892878);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtOpal.class, "xdt_opal(input:$input)", -1645892878);
    }

    public GetOpalSearchAudienceQueryResponseImpl() {
        super(-1619741776);
    }
}
