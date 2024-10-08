package com.instagram.urlhandlers.storycamera;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbV;
import X.DbW;
import X.DbX;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;

public final class StoryCameraUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.storycamera.StoryCameraUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(501181294);
        super.onCreate(bundle);
        Bundle A0a = AnonymousClass7TE.A0a();
        Intent A08 = DbX.A08(this);
        Uri.Builder A07 = DbW.A07("instagram://story-camera");
        0qQ.A07(A07);
        String stringExtra = getIntent().getStringExtra("story-camera-mode");
        if (stringExtra != null) {
            A07.appendQueryParameter(DatePickerDialogModule.ARG_MODE, stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("effect_id");
        if (stringExtra2 != null) {
            A0a.putString("effect_id", stringExtra2);
            A07.appendQueryParameter("effect_id", stringExtra2);
        }
        String stringExtra3 = getIntent().getStringExtra("entrypoint");
        if (stringExtra3 != null) {
            A07.appendQueryParameter("entrypoint", stringExtra3);
        }
        String stringExtra4 = getIntent().getStringExtra("ch");
        if (stringExtra4 != null) {
            A07.appendQueryParameter("test_link_crypto_hash", stringExtra4);
        }
        String stringExtra5 = getIntent().getStringExtra("revisionID");
        if (stringExtra5 != null) {
            A07.appendQueryParameter("test_link_revision_id", stringExtra5);
        }
        String stringExtra6 = getIntent().getStringExtra("unlocked_sticker_id");
        if (stringExtra6 != null) {
            A07.appendQueryParameter("unlocked_sticker_id", stringExtra6);
        }
        String stringExtra7 = getIntent().getStringExtra("interactive_sticker_id");
        if (stringExtra6 != null) {
            A07.appendQueryParameter("interactive_sticker_id", stringExtra7);
        }
        A08.setData(A07.build());
        DbV.A19(this, A08);
        finish();
        AnonymousClass0fD.A07(1927951488, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
