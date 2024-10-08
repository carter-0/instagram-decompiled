package com.instagram.avatars.suggestions.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C342787pA;
import X.C41845B3m;
import X.C41847B3o;

public final class RankedStickerImpl extends C250663lr implements C250673ls {

    public final class InlineXIGRankedAvatarSticker extends C250663lr implements C250673ls {

        public final class Sticker extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r2);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "cdn_url");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "template");
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "file_format");
                AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "instruction_key_id");
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0I, A0f, A0f2, A0f3, A0f4, C41845B3m.A0J(r1), C41845B3m.A0K(r1), AnonymousClass7TE.A0f(r1, "fps"), AnonymousClass7TE.A0f(r2, "accessibility_label"), C41845B3m.A0O(r2), AnonymousClass7TE.A0f(r1, "number_of_avatars"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A02(), "tags")});
            }

            public Sticker() {
                super(1928639229);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(C342787pA.A00, C41845B3m.A0C(Sticker.class, "sticker", 1928639229), "weight");
        }

        public InlineXIGRankedAvatarSticker() {
            super(1297693564);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return C41847B3o.A0n(C41845B3m.A08(InlineXIGRankedAvatarSticker.class, "InlineXIGRankedAvatarSticker", 1297693564), AnonymousClass000.A00(2549));
    }

    public RankedStickerImpl() {
        super(-1231237410);
    }
}
