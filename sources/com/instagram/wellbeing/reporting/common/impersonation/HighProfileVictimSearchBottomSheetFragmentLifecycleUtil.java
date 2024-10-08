package com.instagram.wellbeing.reporting.common.impersonation;

public final class HighProfileVictimSearchBottomSheetFragmentLifecycleUtil {
    public static void cleanupReferences(HighProfileVictimSearchBottomSheetFragment highProfileVictimSearchBottomSheetFragment) {
        highProfileVictimSearchBottomSheetFragment.mTouchInterceptorFrameLayout = null;
    }
}
