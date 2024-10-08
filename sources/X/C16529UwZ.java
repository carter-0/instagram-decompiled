package X;

import java.util.EnumMap;

/* renamed from: X.UwZ  reason: case insensitive filesystem */
public enum C16529UwZ {
    DID_ENTER_PREFETCH_QUEUE,
    DID_FINISH_ENTER_PREFETCH_QUEUE,
    DID_ENTER_PREFETCH_QUEUE_AUDIO,
    DID_ENTER_PREFETCH_QUEUE_VIDEO,
    DID_FINISH_ENTER_PREFETCH_QUEUE_AUDIO,
    DID_FINISH_ENTER_PREFETCH_QUEUE_VIDEO,
    DID_EXIT_PREFETCH_QUEUE,
    DID_EXIT_PREFETCH_QUEUE_AUDIO,
    DID_EXIT_PREFETCH_QUEUE_VIDEO,
    DATA_FETCH_ISSUED,
    DATA_FETCH_ISSUED_AUDIO,
    DATA_FETCH_ISSUED_VIDEO,
    DID_INITIATE_CACHE_CHECK,
    DID_INITIATE_CACHE_CHECK_AUDIO,
    DID_INITIATE_CACHE_CHECK_VIDEO,
    DATA_FETCH_COMPLETED,
    DATA_FETCH_COMPLETED_AUDIO,
    DATA_FETCH_COMPLETED_VIDEO,
    SUCCESS,
    SUCCESS_DASH_AUDIO,
    SUCCESS_DASH_VIDEO,
    FAIL,
    FAIL_DASH_AUDIO,
    FAIL_DASH_VIDEO,
    HAS_AUDIO,
    HAS_VIDEO;
    
    public static EnumMap A00;
    public static EnumMap A01;
    public static final EnumMap A02 = null;

    /* access modifiers changed from: public */
    static {
        C16529UwZ uwZ;
        C16529UwZ uwZ2;
        C16529UwZ uwZ3;
        C16529UwZ uwZ4;
        C16529UwZ uwZ5;
        C16529UwZ uwZ6;
        C16529UwZ uwZ7;
        C16529UwZ uwZ8;
        C16529UwZ uwZ9;
        C16529UwZ uwZ10;
        C16529UwZ uwZ11;
        C16529UwZ uwZ12;
        C16529UwZ uwZ13;
        C16529UwZ uwZ14;
        C16529UwZ uwZ15;
        C16529UwZ uwZ16;
        C16529UwZ uwZ17;
        C16529UwZ uwZ18;
        C16529UwZ uwZ19;
        C16529UwZ uwZ20;
        C16529UwZ uwZ21;
        C16529UwZ uwZ22;
        C16529UwZ uwZ23;
        C16529UwZ uwZ24;
        C16529UwZ[] uwZArr;
        A03 = 0oU.A00(uwZArr);
        EnumMap enumMap = new EnumMap(C16529UwZ.class);
        A02 = enumMap;
        enumMap.put(uwZ, uwZ);
        enumMap.put(uwZ2, uwZ2);
        enumMap.put(uwZ7, uwZ7);
        enumMap.put(uwZ10, uwZ10);
        enumMap.put(uwZ16, uwZ16);
        enumMap.put(uwZ13, uwZ13);
        enumMap.put(uwZ19, uwZ19);
        enumMap.put(uwZ22, uwZ22);
        EnumMap enumMap2 = new EnumMap(enumMap);
        A00 = enumMap2;
        enumMap2.put(uwZ, uwZ3);
        A00.put(uwZ2, uwZ5);
        A00.put(uwZ7, uwZ8);
        A00.put(uwZ10, uwZ11);
        A00.put(uwZ16, uwZ17);
        A00.put(uwZ13, uwZ14);
        A00.put(uwZ19, uwZ20);
        A00.put(uwZ22, uwZ23);
        EnumMap enumMap3 = new EnumMap(enumMap);
        A01 = enumMap3;
        enumMap3.put(uwZ, uwZ4);
        A01.put(uwZ2, uwZ6);
        A01.put(uwZ7, uwZ9);
        A01.put(uwZ10, uwZ12);
        A01.put(uwZ16, uwZ18);
        A01.put(uwZ13, uwZ15);
        A01.put(uwZ19, uwZ21);
        A01.put(uwZ22, uwZ24);
    }
}
