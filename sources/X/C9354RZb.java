package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RZb  reason: case insensitive filesystem */
public abstract class C9354RZb {
    public static String A00(int i) {
        switch (i) {
            case 2:
                return "MOBILE_BOOST_MOBILE_BOOST_IG_OPTIMIZATION_TEST";
            case 4:
                return "MOBILE_BOOST_INIT_MOBILE_BOOST";
            case 5:
                return "MOBILE_BOOST_INIT_ALL_BOOSTERS";
            case 6:
                return "MOBILE_BOOST_INIT_BOOSTER";
            case 7:
                return "MOBILE_BOOST_TRIGGER_BOOSTING";
            case 8:
                return "MOBILE_BOOST_NO_OP_BOOSTER";
            case 10:
                return "MOBILE_BOOST_ENABLED_BOOSTERS";
            case 11:
                return "MOBILE_BOOST_MB_GENERIC_EVENT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "MOBILE_BOOST_INIT_MARKERS";
            case 13:
                return "MOBILE_BOOST_MB_GENERIC_INIT_EVENT";
            case 14:
                return "MOBILE_BOOST_MB_OVERLAPPING_BOOST";
            case 15:
                return "MOBILE_BOOST_CPU_BOOST_COMPATIBILITY";
            case 16:
                return "MOBILE_BOOST_RAW_OPTIMIZATION_JSON";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
