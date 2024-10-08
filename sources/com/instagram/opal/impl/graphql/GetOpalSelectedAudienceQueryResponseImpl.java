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

public final class GetOpalSelectedAudienceQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtOpal extends C250663lr implements C250673ls {

        public final class Audience extends C250663lr implements C250673ls {

            public final class Edges extends C250663lr implements C250673ls {

                public final class Node extends C250663lr implements C250673ls {
                    public Node() {
                        super(2062210767);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A0q();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), Node.class, "node", 2062210767);
                }

                public Edges() {
                    super(-398773314);
                }
            }

            public final class PageInfo extends C250663lr implements C250673ls {
                public PageInfo() {
                    super(2059302573);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, AnonymousClass7TE.A0f(C41846B3n.A0J(), "has_next_page"), "end_cursor");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C284275Lw A01 = AnonymousClass4Ks.A01();
                return C41847B3o.A0i(AnonymousClass4Ks.A02(), C41845B3m.A0A(A01, PageInfo.class, "page_info", 2059302573), Edges.class, "edges", -398773314);
            }

            public Audience() {
                super(-1524343173);
            }
        }

        public XdtOpal() {
            super(-329775722);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(AnonymousClass7TE.A0f(C41845B3m.A0R(), "selected_audience_count"), Audience.class, AnonymousClass000.A00(515), -1524343173);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtOpal.class, "xdt_opal(input:$input)", -329775722);
    }

    public GetOpalSelectedAudienceQueryResponseImpl() {
        super(-1204715372);
    }
}
