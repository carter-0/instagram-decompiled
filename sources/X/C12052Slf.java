package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import java.util.ArrayList;

/* renamed from: X.Slf  reason: case insensitive filesystem */
public final class C12052Slf implements C13769Tgh {
    public static final ArrayList A00 = Pxf.A0q(new String[]{"api.whatsapp.com", "call.whatsapp.com", "chat.whatsapp.com", "whatsapp.com", "www.whatsapp.com", "v.whatsapp.com", "wa.me", "whatsapp://send"});

    public static final boolean A00(Context context, Uri uri) {
        if (!0JW.A05(context.getPackageManager(), "com.whatsapp")) {
            return false;
        }
        0R7 A05 = 0b6.A00().A05();
        Intent A0E = Pxe.A0E();
        String obj = uri.toString();
        LruCache lruCache = 0cp.A00;
        A05.A0G(context, A0E.setData(Uri.parse(obj)));
        return true;
    }

    public final Bundle ALa(String str, String str2, boolean z) {
        Bundle A0J = Pxh.A0J(str, str2, z);
        A0J.putStringArrayList("package_names", A00);
        return A0J;
    }

    public final boolean FIC(Context context, Bundle bundle) {
        return A00(context, Pxe.A0I().scheme("whatsapp").appendPath("com.whatsapp").build());
    }

    public final boolean FID(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null || !string.startsWith("whatsapp://send")) {
            return false;
        }
        return A00(context, 0cp.A03(string));
    }
}
