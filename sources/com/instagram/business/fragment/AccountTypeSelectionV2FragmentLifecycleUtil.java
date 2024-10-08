package com.instagram.business.fragment;

public final class AccountTypeSelectionV2FragmentLifecycleUtil {
    public static void cleanupReferences(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        accountTypeSelectionV2Fragment.mController = null;
        accountTypeSelectionV2Fragment.mBusinessRadioButton = null;
        accountTypeSelectionV2Fragment.mCreatorRadioButton = null;
    }
}
