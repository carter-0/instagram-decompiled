package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Bz  reason: invalid class name and case insensitive filesystem */
public final class C375039Bz {
    public static final HashSet A06 = new HashSet(Arrays.asList(new Integer[]{1, 2}));
    public 14s A00 = null;
    public 14w A01 = null;
    public Set A02 = null;
    public final int A03;
    public final int A04;
    public final AnonymousClass15J A05;

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "cpuBoost";
            case 2:
                return "gpuBoost";
            case 3:
                return "delayedGC";
            case 4:
                return "layoutPreinflation";
            case 5:
                return "threadAffinity";
            case 6:
                return "renderThreadBoost";
            case 7:
                return "classPreloading";
            case 8:
                return "uiThreadBoost";
            case 9:
                return "lithoLayoutThreadBoost";
            case 10:
                return "delayedAnalytics";
            case 11:
                return "deepDataCollection";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "memoryManagerTrim";
            case 13:
                return "softKeyboard";
            case 14:
                return "jitSampleOnly";
            case 15:
                return "blockIdleJob";
            case 16:
                return "activityThread";
            case 17:
                return "uiThreadPeriodic";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "ioThreadPeriodic";
            case 19:
                return "graphQLExecutor";
            case 20:
                return "binder";
            case 21:
                return "smartFsync";
            case 22:
                return "mlock";
            case 23:
                return "threadBoostByName";
            case 24:
                return "displayCache";
            case 25:
                return "ditto";
            case 26:
                return "msysThreadsBoost";
            case 27:
                return "noOp";
            case 28:
                return "perfHintManagerBoost";
            default:
                return "";
        }
    }

    public static int[] A01() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    }

    public C375039Bz(AnonymousClass15J r2, int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r2;
        if (r2 != null) {
            r2.A01 = i;
        }
    }
}
