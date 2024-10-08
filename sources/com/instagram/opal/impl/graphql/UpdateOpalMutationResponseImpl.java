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
import X.C41846B3n;
import X.C41848B3p;

public final class UpdateOpalMutationResponseImpl extends C250663lr implements C250673ls {

    public final class XdtUpdateOpal extends C250663lr implements C250673ls {

        public final class Opal extends C250663lr implements C250673ls {

            public final class OpalInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r3, C41845B3m.A0G(r3), AnonymousClass7TE.A0f(r3, "bio"), "profile_picture_url");
                }

                public OpalInfo() {
                    super(-480358044);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(OpalInfo.class, "opal_info", -480358044);
            }

            public Opal() {
                super(1857650734);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            return C41846B3n.A0K(C41848B3p.A0Q(r0), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r0), "error_message"), C41845B3m.A0A(AnonymousClass4Ks.A01(), Opal.class, "opal", 1857650734));
        }

        public XdtUpdateOpal() {
            super(935844365);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtUpdateOpal.class, AnonymousClass000.A00(1949), 935844365);
    }

    public UpdateOpalMutationResponseImpl() {
        super(-2036426954);
    }
}
