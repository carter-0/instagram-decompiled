package com.instagram.modal;

import X.0qQ;
import X.C50128FQl;
import android.content.Intent;
import android.os.Bundle;

public final class TransparentBackgroundModalActivity extends ModalActivity {
    public final boolean A0m() {
        return false;
    }

    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        TransparentBackgroundModalActivity.super.onNewIntent(intent);
        A0n(intent);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C50128FQl.A00(getSupportFragmentManager(), this, 1);
    }
}
