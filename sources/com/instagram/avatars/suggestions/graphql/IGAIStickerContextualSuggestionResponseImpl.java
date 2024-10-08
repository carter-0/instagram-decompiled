package com.instagram.avatars.suggestions.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41847B3o;

public final class IGAIStickerContextualSuggestionResponseImpl extends C250663lr implements C250673ls {

    public final class XfbAiStickersContextualSuggestions extends C250663lr implements C250673ls {

        public final class Sticker extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "url");
            }

            public Sticker() {
                super(1652439996);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "context"), Sticker.class, "sticker", 1652439996);
        }

        public XfbAiStickersContextualSuggestions() {
            super(-1228959536);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), XfbAiStickersContextualSuggestions.class, AnonymousClass000.A00(1951), -1228959536);
    }

    public IGAIStickerContextualSuggestionResponseImpl() {
        super(1826815260);
    }
}
