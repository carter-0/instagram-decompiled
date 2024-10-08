package X;

import java.util.HashMap;

/* renamed from: X.8kM  reason: invalid class name and case insensitive filesystem */
public abstract class C363798kM {
    public static final void A00(C344037rD r7, Integer num, String str, int i) {
        String str2;
        C344037rD r2 = r7;
        0qQ.A0B(r7, 0);
        HashMap hashMap = new HashMap(1);
        switch (num.intValue()) {
            case 0:
                str2 = "PREVIEW_PHOTO";
                break;
            case 1:
                str2 = "PREVIEW_BITMAP";
                break;
            case 2:
                str2 = "NATIVE_VIEW_SIZE_PHOTO";
                break;
            case 3:
                str2 = "NATIVE_FULL_SIZE_FILE";
                break;
            default:
                str2 = "NATIVE_LOW_LIGHT_PHOTO";
                break;
        }
        hashMap.put("photo_capture_type", str2);
        r2.ChM((long) i, "photo_capture_requested", str, hashMap);
    }
}
