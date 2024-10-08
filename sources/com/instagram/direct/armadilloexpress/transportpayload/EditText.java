package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class EditText extends R5b implements C13662TeT {
    public static final EditText DEFAULT_INSTANCE;
    public static final int EDIT_COUNT_FIELD_NUMBER = 2;
    public static final int NEW_CONTENT_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public int editCount_;
    public String newContent_ = "";

    static {
        EditText editText = new EditText();
        DEFAULT_INSTANCE = editText;
        R5b.A0B(editText, EditText.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"bitField0_", "newContent_", "editCount_"});
            case 3:
                return new EditText();
            case 4:
                return new NFL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (EditText.class) {
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
