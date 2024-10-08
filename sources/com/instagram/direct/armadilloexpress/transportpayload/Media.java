package com.instagram.direct.armadilloexpress.transportpayload;

import X.AnonymousClass05K;
import X.C13662TeT;
import X.C66580MXl;
import X.C68408NFp;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Media extends R5b implements C13662TeT {
    public static final int AVATAR_STICKER_FIELD_NUMBER = 6;
    public static final Media DEFAULT_INSTANCE;
    public static final int GIF_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int RAVEN_FIELD_NUMBER = 4;
    public static final int STATIC_PHOTO_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 3;
    public static final int VOICE_FIELD_NUMBER = 2;
    public int bitField0_;
    public int mediaCase_ = 0;
    public Object media_;

    static {
        Media media = new Media();
        DEFAULT_INSTANCE = media;
        R5b.A0B(media, Media.class);
    }

    public final AvatarSticker A0L() {
        if (this.mediaCase_ == 6) {
            return (AvatarSticker) this.media_;
        }
        return AvatarSticker.DEFAULT_INSTANCE;
    }

    public final Raven A0M() {
        if (this.mediaCase_ == 4) {
            return (Raven) this.media_;
        }
        return Raven.DEFAULT_INSTANCE;
    }

    public final StaticPhoto A0N() {
        if (this.mediaCase_ == 1) {
            return (StaticPhoto) this.media_;
        }
        return StaticPhoto.DEFAULT_INSTANCE;
    }

    public final Video A0O() {
        if (this.mediaCase_ == 3) {
            return (Video) this.media_;
        }
        return Video.DEFAULT_INSTANCE;
    }

    public final Integer A0P() {
        switch (this.mediaCase_) {
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
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"media_", "mediaCase_", "bitField0_", StaticPhoto.class, Voice.class, Video.class, Raven.class, Gif.class, AvatarSticker.class});
            case 3:
                return new Media();
            case 4:
                return new C68408NFp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Media.class) {
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
