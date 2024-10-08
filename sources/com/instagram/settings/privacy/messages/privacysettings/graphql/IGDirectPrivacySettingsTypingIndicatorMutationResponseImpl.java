package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4LF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;

public final class IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl extends C250663lr implements C250673ls {

    public final class XigSetTypingIndicatorDisabled extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "is_success");
        }

        public XigSetTypingIndicatorDisabled() {
            super(190828327);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XigSetTypingIndicatorDisabled.class, "xig_set_typing_indicator_disabled(is_disabled:$isDisabled)", 190828327);
    }

    public IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl() {
        super(-537298301);
    }
}
