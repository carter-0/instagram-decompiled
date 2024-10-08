package X;

import android.os.Bundle;

public final class ERQ extends R8F {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;

    public final String A0M() {
        int i;
        if (this.A00) {
            i = 2131957623;
        } else if (this.A02) {
            i = 2131972142;
        } else {
            i = 2131963398;
            if (this.A01) {
                i = 2131976092;
            }
        }
        return getString(i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1652593314);
        ERQ.super.onCreate(bundle);
        this.A00 = requireArguments().getBoolean("isDeleting", false);
        this.A02 = requireArguments().getBoolean("isRemoving", false);
        this.A01 = requireArguments().getBoolean("isUpdating", false);
        this.A01 = requireArguments().getBoolean("isArchiving", true);
        if (bundle != null) {
            this.A03 = bundle.getBoolean("shouldDismissOnResume", false);
        }
        AnonymousClass0fD.A09(-17512269, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1347008938);
        if (this.A00) {
            this.A03 = true;
        }
        ERQ.super.onPause();
        AnonymousClass0fD.A09(-137015598, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-154022537);
        ERQ.super.onResume();
        if (this.A03) {
            0hq r0 = this.mFragmentManager;
            r0.getClass();
            r0.A0c();
            A07();
        }
        AnonymousClass0fD.A09(1481201873, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldDismissOnResume", this.A03);
    }
}
