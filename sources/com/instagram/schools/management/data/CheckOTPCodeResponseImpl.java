package com.instagram.schools.management.data;

import X.0qQ;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;

public final class CheckOTPCodeResponseImpl extends C250663lr implements C250673ls {

    public final class XdtCheckOtpCode extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class ShowSchoolsBadge extends C250663lr implements C250673ls {
                public ShowSchoolsBadge() {
                    super(-996463979);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(C41845B3m.A0R(), "graduation_year");
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r2, A0f, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "school_name"), "school_name_abbreviation");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ShowSchoolsBadge.class, "show_schools_badge", -996463979);
            }

            public User() {
                super(-292801757);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return C41846B3n.A0L(AnonymousClass7TE.A0f(r2, "affiliation_id"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_valid"), AnonymousClass7TE.A0f(r2, "error"), C41845B3m.A0B(User.class, -292801757));
        }

        public XdtCheckOtpCode() {
            super(-1567452650);
        }
    }

    public final XdtCheckOtpCode A0E() {
        C250663lr A05 = A05(XdtCheckOtpCode.class, "xdt_check_otp_code(input:$input)", -1567452650);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.schools.management.data.CheckOTPCodeResponseImpl.XdtCheckOtpCode");
        return (XdtCheckOtpCode) A05;
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtCheckOtpCode.class, "xdt_check_otp_code(input:$input)", -1567452650);
    }

    public CheckOTPCodeResponseImpl() {
        super(-1486915539);
    }
}
