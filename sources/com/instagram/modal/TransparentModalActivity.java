package com.instagram.modal;

import X.06W;
import X.AnonymousClass0fD;
import X.C66588MXu;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

public class TransparentModalActivity extends ModalActivity {
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("arg_cleanup_bottom_sheet_fragments", new ArrayList(Collections.singletonList("BottomSheetConstants.FRAGMENT_TAG")));
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.modal.ModalActivity, android.content.Context, com.instagram.modal.TransparentModalActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-606044621);
        Bundle A002 = C66588MXu.A00(bundle);
        if (A002 != null) {
            06W.A00(A002, getClassLoader(), A002.getStringArrayList("arg_cleanup_bottom_sheet_fragments"));
        }
        super.onCreate(A002);
        AnonymousClass0fD.A07(439224304, A00);
    }

    public final void onNewIntent(Intent intent) {
        TransparentModalActivity.super.onNewIntent(intent);
        A0n(intent);
    }
}
