package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C13982TnY;
import X.C66580MXl;
import X.C68399NFg;
import X.C74232PrL;
import X.R33;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Text extends R5b implements C13662TeT {
    public static final int ANIMATEDEMOJICHARACTERRANGES_FIELD_NUMBER = 6;
    public static final int COMMANDS_FIELD_NUMBER = 5;
    public static final Text DEFAULT_INSTANCE;
    public static final int IS_SUGGESTED_REPLY_FIELD_NUMBER = 2;
    public static volatile C74232PrL PARSER = null;
    public static final int POSTBACK_PAYLOAD_FIELD_NUMBER = 3;
    public static final int POWER_UP_DATA_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public C13982TnY animatedEmojiCharacterRanges_;
    public int bitField0_;
    public C13982TnY commands_;
    public boolean isSuggestedReply_;
    public String postbackPayload_ = "";
    public PowerUpsData powerUpData_;
    public String text_ = "";

    static {
        Text text = new Text();
        DEFAULT_INSTANCE = text;
        R5b.A0B(text, Text.class);
    }

    public Text() {
        R33 r33 = R33.A02;
        this.commands_ = r33;
        this.animatedEmojiCharacterRanges_ = r33;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "text_", "isSuggestedReply_", "postbackPayload_", "powerUpData_", "commands_", CommandRangeData.class, "animatedEmojiCharacterRanges_", AnimatedEmojiCharacterRange.class});
            case 3:
                return new Text();
            case 4:
                return new C68399NFg();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Text.class) {
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
