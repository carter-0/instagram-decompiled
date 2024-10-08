package com.instagram.schools.management.data;

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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class UpdateBadgeNameResponseImpl extends C250663lr implements C250673ls {

    public final class XdtUpdateBadgeName extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class ShowSchoolsBadge extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(C41845B3m.A0R(), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "school_name"), AnonymousClass7TE.A0f(r2, "school_name_abbreviation"), "graduation_year");
                }

                public ShowSchoolsBadge() {
                    super(364802321);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ShowSchoolsBadge.class, "show_schools_badge", 364802321);
            }

            public User() {
                super(-1624490405);
            }
        }

        public XdtUpdateBadgeName() {
            super(384275345);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(C41848B3p.A0C(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1624490405);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtUpdateBadgeName.class, "xdt_update_badge_name(input:$input)", 384275345);
    }

    public UpdateBadgeNameResponseImpl() {
        super(-888832041);
    }
}
