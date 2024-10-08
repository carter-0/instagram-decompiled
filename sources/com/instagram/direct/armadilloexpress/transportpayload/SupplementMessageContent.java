package com.instagram.direct.armadilloexpress.transportpayload;

import X.AnonymousClass05K;
import X.C13662TeT;
import X.C66580MXl;
import X.C68398NFf;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class SupplementMessageContent extends R5b implements C13662TeT {
    public static final int CONTENT_VIEW_FIELD_NUMBER = 2;
    public static final SupplementMessageContent DEFAULT_INSTANCE;
    public static final int EDIT_TEXT_FIELD_NUMBER = 3;
    public static final int MEDIA_INTERVENTIONS_FIELD_NUMBER = 6;
    public static final int MEDIA_REACTION_FIELD_NUMBER = 4;
    public static final int ORIGINAL_TRANSPORT_PAYLOAD_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 1;
    public int bitField0_;
    public int supplementMessageContentCase_ = 0;
    public Object supplementMessageContent_;

    static {
        SupplementMessageContent supplementMessageContent = new SupplementMessageContent();
        DEFAULT_INSTANCE = supplementMessageContent;
        R5b.A0B(supplementMessageContent, SupplementMessageContent.class);
    }

    public final ContentView A0L() {
        if (this.supplementMessageContentCase_ == 2) {
            return (ContentView) this.supplementMessageContent_;
        }
        return ContentView.DEFAULT_INSTANCE;
    }

    public final Integer A0M() {
        switch (this.supplementMessageContentCase_) {
            case 0:
                return AnonymousClass05K.A0u;
            case 1:
                return AnonymousClass05K.A00;
            case 2:
                return AnonymousClass05K.A01;
            case 3:
                return AnonymousClass05K.A0C;
            case 4:
                return AnonymousClass05K.A0N;
            case 5:
                return AnonymousClass05K.A0Y;
            case 6:
                return AnonymousClass05K.A0j;
            default:
                return null;
        }
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"supplementMessageContent_", "supplementMessageContentCase_", "bitField0_", Reaction.class, ContentView.class, EditText.class, MediaReaction.class, OriginalTransportPayload.class, MediaInterventions.class});
            case 3:
                return new SupplementMessageContent();
            case 4:
                return new C68398NFf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (SupplementMessageContent.class) {
                    prL = PARSER;
                    if (prL == null) {
                        SQg sQg = T5L.A01;
                        prL = C66580MXl.A0K(DEFAULT_INSTANCE);
                        PARSER = prL;
                    }
                }
                return prL;
            default:
                throw C66580MXl.A11();
        }
    }
}
