package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.S0u  reason: case insensitive filesystem */
public final class C10917S0u {
    public final Intent A00;
    public final Bundle A01;

    public final void A00(Context context, Uri uri) {
        Intent intent = this.A00;
        intent.setData(uri);
        context.startActivity(intent, this.A01);
    }

    public C10917S0u(Intent intent, Bundle bundle) {
        this.A00 = intent;
        this.A01 = bundle;
    }
}
