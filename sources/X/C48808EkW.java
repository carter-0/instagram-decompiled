package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;

/* renamed from: X.EkW  reason: case insensitive filesystem */
public abstract class C48808EkW {
    public static final void A00(Activity activity, Uri uri, String str, String str2) {
        0qQ.A0B(str2, 3);
        Bundle A0D = DbX.A0D(str);
        String A00 = AnonymousClass000.A00(66);
        A0D.putParcelable(A00, uri);
        String A0R = 002.A0R("sms:", str2);
        Intent A06 = DbY.A06("android.intent.action.SEND");
        LruCache lruCache = 0cp.A00;
        A06.setData(Uri.parse(A0R));
        if (str != null) {
            A06.putExtra("sms_body", str);
        }
        if (uri != null) {
            A06.putExtra(A00, uri);
            A06.setType("image/jpeg");
        }
        0kR.A00(activity, A06);
    }
}
