package com.instagram.direct.armadilloexpress.transportpayload;

import X.AnonymousClass05K;
import X.C13662TeT;
import X.C66580MXl;
import X.C68404NFl;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class AddMessageContent extends R5b implements C13662TeT {
    public static final int ADMIN_MESSAGE_FIELD_NUMBER = 8;
    public static final int COLLECTION_FIELD_NUMBER = 7;
    public static final AddMessageContent DEFAULT_INSTANCE;
    public static final int LIKE_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int MEDIA_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 6;
    public static final int RECEIVER_FETCH_XMA_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public int addMessageContentCase_ = 0;
    public Object addMessageContent_;
    public int bitField0_;

    static {
        AddMessageContent addMessageContent = new AddMessageContent();
        DEFAULT_INSTANCE = addMessageContent;
        R5b.A0B(addMessageContent, AddMessageContent.class);
    }

    public static C68404NFl A00() {
        return (C68404NFl) DEFAULT_INSTANCE.A0I();
    }

    public final Media A0L() {
        if (this.addMessageContentCase_ == 5) {
            return (Media) this.addMessageContent_;
        }
        return Media.DEFAULT_INSTANCE;
    }

    public final ReceiverFetchXma A0M() {
        if (this.addMessageContentCase_ == 4) {
            return (ReceiverFetchXma) this.addMessageContent_;
        }
        return ReceiverFetchXma.DEFAULT_INSTANCE;
    }

    public final Text A0N() {
        if (this.addMessageContentCase_ == 1) {
            return (Text) this.addMessageContent_;
        }
        return Text.DEFAULT_INSTANCE;
    }

    public final Integer A0O() {
        switch (this.addMessageContentCase_) {
            case 0:
                return AnonymousClass05K.A1F;
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
            case 7:
                return AnonymousClass05K.A0u;
            case 8:
                return AnonymousClass05K.A15;
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
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"addMessageContent_", "addMessageContentCase_", "bitField0_", Text.class, Like.class, Link.class, ReceiverFetchXma.class, Media.class, Placeholder.class, Collection.class, AdminMessage.class});
            case 3:
                return new AddMessageContent();
            case 4:
                return new C68404NFl();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (AddMessageContent.class) {
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
