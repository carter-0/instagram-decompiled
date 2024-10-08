package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3vp  reason: invalid class name and case insensitive filesystem */
public enum C256473vp implements C256483vq {
    DID_ENTER_PREFETCH_QUEUE,
    DID_EXIT_PREFETCH_QUEUE,
    DID_ENTER_TASK_QUEUE,
    DID_ENTER_TASK_QUEUE_DASH_AUDIO,
    DID_ENTER_TASK_QUEUE_DASH_VIDEO,
    DID_EXIT_TASK_QUEUE,
    DID_EXIT_TASK_QUEUE_DASH_AUDIO,
    DID_EXIT_TASK_QUEUE_DASH_VIDEO,
    SUCCESS,
    SUCCESS_DASH_AUDIO,
    SUCCESS_DASH_VIDEO;
    
    public static Map A00;
    public static Map A01;
    public static Map A02;

    /* access modifiers changed from: public */
    static {
        C256473vp r2;
        C256473vp r3;
        C256473vp r4;
        C256473vp r5;
        C256473vp r6;
        C256473vp r7;
        C256473vp r8;
        C256473vp r9;
        C256473vp r10;
        C256473vp r11;
        C256473vp r12;
        HashMap hashMap = new HashMap();
        A01 = hashMap;
        hashMap.put(r2, r2);
        A01.put(r3, r3);
        A01.put(r4, r4);
        A01.put(r7, r7);
        A01.put(r10, r10);
        HashMap hashMap2 = new HashMap(A01);
        A00 = hashMap2;
        hashMap2.put(r4, r5);
        A00.put(r7, r8);
        A00.put(r10, r11);
        HashMap hashMap3 = new HashMap(A01);
        A02 = hashMap3;
        hashMap3.put(r4, r6);
        A02.put(r7, r9);
        A02.put(r10, r12);
    }

    public static C256473vp A00(C252463p9 r1, C256473vp r2) {
        Map map;
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            map = A00;
        } else if (ordinal != 1) {
            map = A01;
        } else {
            map = A02;
        }
        return (C256473vp) map.get(r2);
    }
}
