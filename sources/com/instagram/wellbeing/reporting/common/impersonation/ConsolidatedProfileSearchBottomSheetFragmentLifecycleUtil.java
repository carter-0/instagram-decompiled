package com.instagram.wellbeing.reporting.common.impersonation;

public final class ConsolidatedProfileSearchBottomSheetFragmentLifecycleUtil {
    public static void cleanupReferences(ConsolidatedProfileSearchBottomSheetFragment consolidatedProfileSearchBottomSheetFragment) {
        consolidatedProfileSearchBottomSheetFragment.mTouchInterceptorFrameLayout = null;
    }
}
