package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.3Tw  reason: invalid class name and case insensitive filesystem */
public abstract class C242393Tw {
    public static long A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            default:
                return 1;
        }
    }
}
