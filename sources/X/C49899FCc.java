package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;

/* renamed from: X.FCc  reason: case insensitive filesystem */
public abstract class C49899FCc {
    public static final void A02(Context context, String str, String str2) {
        0qQ.A0B(str, 0);
        0kR.A00(context, A00(str, str2));
    }

    public static final Intent A00(String str, String str2) {
        String A0R = 002.A0R("sms:", str);
        Intent A06 = DbY.A06("android.intent.action.VIEW");
        LruCache lruCache = 0cp.A00;
        A06.setData(Uri.parse(A0R));
        if (str2 != null) {
            A06.putExtra("sms_body", str2);
        }
        return A06;
    }

    public static void A01(Context context, String str, String str2) {
        new Bundle().putString("android.intent.extra.TEXT", str);
        A02(context, str2, str);
    }
}
