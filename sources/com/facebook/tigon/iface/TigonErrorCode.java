package com.facebook.tigon.iface;

import X.0oU;
import X.0se;
import X.AnonymousClass3J3;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TigonErrorCode {
    NONE(0),
    CANCEL(1),
    TRANSIENT_ERROR(2),
    FATAL_ERROR(3),
    INVALID_REQUEST(4),
    REQUEST_NOT_SUPPORTED(5);
    
    public static final AnonymousClass3J3 Companion = null;
    public static final Map NUMERIC_TO_ERROR_CODE = null;
    public final int value;

    public static final TigonErrorCode fromValue(int i) {
        return Companion.fromValue(i);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.3J3] */
    /* access modifiers changed from: public */
    static {
        int i;
        TigonErrorCode[] tigonErrorCodeArr;
        $ENTRIES = 0oU.A00(tigonErrorCodeArr);
        Companion = new Object();
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (TigonErrorCode tigonErrorCode : values()) {
            linkedHashMap.put(Integer.valueOf(tigonErrorCode.value), tigonErrorCode);
        }
        NUMERIC_TO_ERROR_CODE = linkedHashMap;
    }

    /* access modifiers changed from: public */
    TigonErrorCode(int i) {
        this.value = i;
    }

    public String toString() {
        switch (ordinal()) {
            case 0:
                return "None";
            case 1:
                return "Cancel";
            case 2:
                return "TransientError";
            case 3:
                return "FatalError";
            case 4:
                return "InvalidRequest";
            case 5:
                return "RequestNotSupported";
            default:
                throw new RuntimeException();
        }
    }
}
