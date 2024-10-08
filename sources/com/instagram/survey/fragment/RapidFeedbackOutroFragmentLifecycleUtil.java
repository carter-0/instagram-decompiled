package com.instagram.survey.fragment;

public final class RapidFeedbackOutroFragmentLifecycleUtil {
    public static void cleanupReferences(RapidFeedbackOutroFragment rapidFeedbackOutroFragment) {
        rapidFeedbackOutroFragment.rootView = null;
    }
}
