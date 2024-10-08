package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFH;
import X.R5b;
import X.SQg;
import X.T5L;

public final class CommandRangeData extends R5b implements C13662TeT {
    public static final CommandRangeData DEFAULT_INSTANCE;
    public static final int FBID_FIELD_NUMBER = 4;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int OFFSET_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USER_OR_THREAD_FBID_FIELD_NUMBER = 5;
    public int bitField0_;
    public String fbid_ = "";
    public int length_;
    public int offset_;
    public int type_;
    public String userOrThreadFbid_ = "";

    static {
        CommandRangeData commandRangeData = new CommandRangeData();
        DEFAULT_INSTANCE = commandRangeData;
        R5b.A0B(commandRangeData, CommandRangeData.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "offset_", "length_", "type_", "fbid_", "userOrThreadFbid_"});
            case 3:
                return new CommandRangeData();
            case 4:
                return new NFH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (CommandRangeData.class) {
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
