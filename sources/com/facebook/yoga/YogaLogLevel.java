package com.facebook.yoga;

import X.C273654mx;
import X.DbW;

public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    
    public final int mIntValue;

    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        throw DbW.A0a(C273654mx.A00(523), i);
    }

    /* access modifiers changed from: public */
    YogaLogLevel(int i) {
        this.mIntValue = i;
    }
}
