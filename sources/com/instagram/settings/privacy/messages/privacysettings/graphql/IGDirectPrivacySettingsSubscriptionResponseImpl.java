package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;

public final class IGDirectPrivacySettingsSubscriptionResponseImpl extends C250663lr implements C250673ls {

    public final class XigDirectPrivacySettingsSubscribe extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r2 = AnonymousClass4LF.A00;
            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "read_receipts_disabled"), "typing_indicator_disabled");
        }

        public XigDirectPrivacySettingsSubscribe() {
            super(1243648941);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XigDirectPrivacySettingsSubscribe.class, "xig_direct_privacy_settings_subscribe", 1243648941);
    }

    public IGDirectPrivacySettingsSubscriptionResponseImpl() {
        super(29923216);
    }
}
