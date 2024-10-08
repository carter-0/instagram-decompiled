package X;

import go.Seq;

public abstract class RX5 {
    public static String A00(int i) {
        switch (i) {
            case 1:
                return "COMPONENTS_CALCULATE_LAYOUT";
            case 7:
                return "COMPONENTS_MOUNT";
            case 11:
                return "COMPONENTS_PRE_ALLOCATE_MOUNT_CONTENT";
            case 25:
                return "COMPONENTS_SECTIONS_INITIAL_TTI";
            case 28:
                return "COMPONENTS_FETCH_GRAPHQL";
            case 35:
                return "COMPONENTS_CALCULATE_LAYOUT_STATE";
            case 37:
                return "COMPONENTS_BENCHMARK_RUN";
            case Seq.NULL_REFNUM /*41*/:
                return "COMPONENTS_LAYOUT_STATE_FUTURE_GET_WAIT";
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return "COMPONENTS_INIT_RANGE";
            case 4027:
                return "COMPONENTS_COMPONENT_RESOLVE";
            case 11951:
                return "COMPONENTS_CALCULATE_RESOLVE";
            case 11985:
                return "COMPONENTS_COMPONENT_PREPARE";
            case 12790:
                return "COMPONENTS_SECTIONS_RV_LAYOUT";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
