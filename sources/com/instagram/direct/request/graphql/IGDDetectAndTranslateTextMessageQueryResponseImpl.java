package com.instagram.direct.request.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C342787pA;

public final class IGDDetectAndTranslateTextMessageQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XigIgdDetectAndTranslateTextMessageQuery extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(C342787pA.A00, "classification_confidence");
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "translation_confidence");
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(1831)), AnonymousClass7TE.A0f(r1, "error_message"), AnonymousClass7TE.A0f(r1, "item_id"), AnonymousClass7TE.A0f(r1, "translated_text")});
        }

        public XigIgdDetectAndTranslateTextMessageQuery() {
            super(1202135458);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), XigIgdDetectAndTranslateTextMessageQuery.class, AnonymousClass000.A00(4281), 1202135458);
    }

    public IGDDetectAndTranslateTextMessageQueryResponseImpl() {
        super(-1286817171);
    }
}
