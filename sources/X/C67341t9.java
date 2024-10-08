package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1t9  reason: invalid class name and case insensitive filesystem */
public abstract class C67341t9 {
    public static final long A00;

    static {
        long j;
        long j2 = 0;
        for (Integer intValue : AnonymousClass05K.A00(14)) {
            switch (intValue.intValue()) {
                case 1:
                    j = 2;
                    break;
                case 2:
                    j = 4;
                    break;
                case 3:
                    j = 8;
                    break;
                case 4:
                    j = 16;
                    break;
                case 5:
                    j = 32;
                    break;
                case 6:
                    j = 64;
                    break;
                case 7:
                    j = 128;
                    break;
                case 8:
                    j = 256;
                    break;
                case 9:
                    j = 512;
                    break;
                case 10:
                    j = 1024;
                    break;
                case 11:
                    j = 16384;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    j = 8388608;
                    break;
                case 13:
                    j = 1073741824;
                    break;
                default:
                    j = 1;
                    break;
            }
            j2 |= j;
        }
        A00 = j2;
    }
}
