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

public final class GetOpalSuggestedAudienceQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtOpal extends C250663lr implements C250673ls {

        public final class SuggestedAudiencePaginated extends C250663lr implements C250673ls {

            public final class Edges extends C250663lr implements C250673ls {

                public final class Node extends C250663lr implements C250673ls {
                    public Node() {
                        super(-341997121);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A0q();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), Node.class, "node", -341997121);
                }

                public Edges() {
                    super(141969700);
                }
            }

            public final class PageInfo extends C250663lr implements C250673ls {
                public PageInfo() {
                    super(2041944670);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, AnonymousClass7TE.A0f(C41846B3n.A0J(), "has_next_page"), "end_cursor");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C284275Lw A01 = AnonymousClass4Ks.A01();
                return C41847B3o.A0i(AnonymousClass4Ks.A02(), C41845B3m.A0A(A01, PageInfo.class, "page_info", 2041944670), Edges.class, "edges", 141969700);
            }

            public SuggestedAudiencePaginated() {
                super(-1843339477);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), SuggestedAudiencePaginated.class, AnonymousClass000.A00(1859), -1843339477);
        }

        public XdtOpal() {
            super(-1330464266);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtOpal.class, "xdt_opal(input:$input)", -1330464266);
    }

    public GetOpalSuggestedAudienceQueryResponseImpl() {
        super(-769279061);
    }
}
