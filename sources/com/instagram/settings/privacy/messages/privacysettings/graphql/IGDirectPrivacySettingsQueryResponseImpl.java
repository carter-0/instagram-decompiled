package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41847B3o;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class IGDirectPrivacySettingsQueryResponseImpl extends C250663lr implements C250673ls {

    public final class Viewer extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "is_read_receipt_disabled");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "is_typing_indicator_disabled");
                AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                return C41847B3o.A0j(r2, A0f, A0f2, AnonymousClass7TE.A0f(r2, "locked_threads_count"), "disappearing_messages_expiry");
            }

            public User() {
                super(510894145);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 510894145);
        }

        public Viewer() {
            super(1887838281);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(Viewer.class, "viewer", 1887838281);
    }

    public IGDirectPrivacySettingsQueryResponseImpl() {
        super(778330017);
    }
}
