package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.Dfz  reason: case insensitive filesystem */
public final class C46496Dfz extends AnonymousClass14B {
    public final Intent A02(Context context, int i) {
        0qQ.A0B(context, 0);
        return A03(context, i);
    }

    public final Intent A03(Context context, int i) {
        Intent intent;
        0qQ.A0B(context, 0);
        String packageName = context.getPackageName();
        if (packageName != null) {
            intent = DbS.A09();
            intent.setComponent(new ComponentName(packageName, "com.instagram.mainactivity.InstagramMainActivity"));
        } else {
            intent = new Intent(context, InstagramMainActivity.class);
        }
        intent.setFlags(i);
        return intent;
    }

    public final Intent A04(Context context, Uri uri) {
        AnonymousClass7TG.A1N(context, uri);
        Intent intent = new Intent(context, UrlHandlerActivity.class);
        intent.setData(uri);
        return intent;
    }
}
