package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68412NFt;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class AvatarSticker extends R5b implements C13662TeT {
    public static final AvatarSticker DEFAULT_INSTANCE;
    public static final int IS_ANIMATED_FIELD_NUMBER = 2;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static final int NUX_TYPE_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 3;
    public static final int STICKER_TEMPLATE_FIELD_NUMBER = 4;
    public int bitField0_;
    public boolean isAnimated_;
    public CommonMediaTransport mediaTransport_;
    public int nuxType_;
    public String stickerId_ = "";
    public String stickerTemplate_ = "";

    static {
        AvatarSticker avatarSticker = new AvatarSticker();
        DEFAULT_INSTANCE = avatarSticker;
        R5b.A0B(avatarSticker, AvatarSticker.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"bitField0_", "mediaTransport_", "isAnimated_", "stickerId_", "stickerTemplate_", "nuxType_"});
            case 3:
                return new AvatarSticker();
            case 4:
                return new C68412NFt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (AvatarSticker.class) {
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
