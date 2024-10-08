package com.facebook.secure.deeplink;

import X.0qQ;
import X.AnonymousClass0b5;
import X.AnonymousClass0fD;
import X.C47281Du9;
import X.C48307EcQ;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Map;

public final class GlobalUriHandlerActivity extends AppCompatActivity {
    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        GlobalUriHandlerActivity.super.onNewIntent(intent);
        A00(intent);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.app.Activity, com.facebook.secure.deeplink.GlobalUriHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.hasExtra("request_code")) {
            GlobalUriHandlerActivity.super.onActivityResult(i, i2, intent);
            setResult(i2, intent);
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, android.app.Activity, com.facebook.secure.deeplink.GlobalUriHandlerActivity] */
    private final void A00(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent A00 = C47281Du9.A01.A00().A00(this, C48307EcQ.A00(this, intent), dataString, (Map) null);
            if (A00 != null) {
                if (A00.hasExtra("request_code")) {
                    AnonymousClass0b5.A00(this, A00, A00.getIntExtra("request_code", 0));
                    return;
                }
                AnonymousClass0b5.A02(this, A00);
            }
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.facebook.secure.deeplink.GlobalUriHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(614752641);
        GlobalUriHandlerActivity.super.onCreate(bundle);
        Intent intent = getIntent();
        0qQ.A07(intent);
        A00(intent);
        AnonymousClass0fD.A07(-559749092, A00);
    }
}
