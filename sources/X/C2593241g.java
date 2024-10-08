package X;

import android.content.Intent;
import android.net.Uri;

/* renamed from: X.41g  reason: invalid class name and case insensitive filesystem */
public enum C2593241g {
    CAMERA("story-camera", 0, 2131954568),
    POST("share", 1, 2131969658),
    ACTIVITY("news", 2, 2131952205),
    DIRECT("direct-inbox", 3, 2131960347),
    MAP("map", 4, 2131965865),
    DIRECT_INTEROP("direct-inbox", 5, 2131959593),
    ACCOUNT_SWITCH("mainfeed", 6, 2131952097);
    
    public final int A00;
    public final Intent A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        C2593241g[] r0;
        A03 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    C2593241g(String str, int i, int i2) {
        this.A02 = r6;
        this.A00 = i2;
        Intent intent = new Intent("android.intent.action.VIEW");
        this.A01 = intent;
        intent.setData(new Uri.Builder().scheme("instagram").authority(str).appendQueryParameter("app_shortcut", "true").build());
    }
}
