package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Dd  reason: invalid class name and case insensitive filesystem */
public abstract class C238713Dd {
    public static final AtomicBoolean A00 = new AtomicBoolean();

    public static Bundle A00(AnonymousClass3EI r3) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.A00.getToken());
        C49879FBd fBd = r3.A01;
        bundle.putString(AnonymousClass000.A00(1359), fBd.A0A);
        bundle.putString(AnonymousClass000.A00(606), fBd.A08);
        bundle.putString(AnonymousClass000.A00(1356), fBd.A00);
        bundle.putString(AnonymousClass000.A00(1355), fBd.A05);
        bundle.putString(AnonymousClass000.A00(1357), fBd.A07);
        bundle.putString(AnonymousClass000.A00(1360), fBd.A06);
        return bundle;
    }

    public static void A01(Bundle bundle, 0hq r3) {
        if (!TextUtils.isEmpty(bundle.getString(AnonymousClass000.A00(606))) && r3 != null) {
            new Handler().post(new C51362Fsu(bundle, r3));
        }
    }
}
