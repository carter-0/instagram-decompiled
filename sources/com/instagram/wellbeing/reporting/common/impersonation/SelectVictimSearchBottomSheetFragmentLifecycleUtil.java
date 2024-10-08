package com.instagram.wellbeing.reporting.common.impersonation;

public final class SelectVictimSearchBottomSheetFragmentLifecycleUtil {
    public static void cleanupReferences(SelectVictimSearchBottomSheetFragment selectVictimSearchBottomSheetFragment) {
        selectVictimSearchBottomSheetFragment.mTouchInterceptorFrameLayout = null;
    }
}
