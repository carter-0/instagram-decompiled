package com.instagram.schools.management.data;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41847B3o;
import X.C66579MXk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class UserSchoolEligibilityResponseImpl extends C250663lr implements C250673ls {

    public final class XdtUserSchoolEligibility extends C250663lr implements C250673ls {

        public final class PreviousRegistrationAttemptInfo extends C250663lr implements C250673ls {

            public final class School extends C250663lr implements C250673ls {
                public School() {
                    super(-2022516561);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(C41845B3m.A0P(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, C66579MXk.A00(169));
                AnonymousClass4Kp A0C = C41845B3m.A0C(School.class, "school", -2022516561);
                AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                return C41847B3o.A0j(r2, A0f, A0C, AnonymousClass7TE.A0f(r2, "graduation_year"), C66579MXk.A00(860));
            }

            public PreviousRegistrationAttemptInfo() {
                super(-1093949010);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0k(AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "user_verification_status"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "user_eligibility_status"), PreviousRegistrationAttemptInfo.class, "previous_registration_attempt_info", -1093949010);
        }

        public XdtUserSchoolEligibility() {
            super(-505317559);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XdtUserSchoolEligibility.class, "xdt_user_school_eligibility(input:$input)", -505317559);
    }

    public UserSchoolEligibilityResponseImpl() {
        super(647906811);
    }
}
