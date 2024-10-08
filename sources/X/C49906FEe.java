package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FEe  reason: case insensitive filesystem */
public final class C49906FEe {
    public static void A01(Context context, 0lg r2, C49906FEe fEe, C11225SFz sFz, String str) {
        sFz.A02 = str;
        fEe.A02(context, r2, new SimpleWebViewConfig(sFz));
    }

    public static final Intent A00(Context context, 0lg r3, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass7TG.A1N(context, r3);
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
        DbW.A0s(intent, r3);
        return intent;
    }

    public final void A02(Context context, 0lg r3, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass7TG.A1N(context, r3);
        0kR.A0B(context, A00(context, r3, simpleWebViewConfig));
    }
}
