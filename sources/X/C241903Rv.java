package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.3Rv  reason: invalid class name and case insensitive filesystem */
public final class C241903Rv implements C241913Rw {
    public final Context A00;
    public final AnonymousClass3RB A01;

    public C241903Rv(Context context, Boolean bool) {
        this.A00 = context;
        AnonymousClass3RB r1 = AnonymousClass3RB.A02;
        this.A01 = r1;
        if (bool != null) {
            r1.A00 = bool.booleanValue();
        }
    }

    public static final String A00(Intent intent) {
        String str;
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("auth_bundle");
            if (bundleExtra == null) {
                str = "Invalid auth bundle";
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
                if (pendingIntent != null) {
                    return pendingIntent.getCreatorPackage();
                }
                str = "Invalid auth intent";
            }
            0KC.A0C("FbnsSecurityContextHelper", str);
        }
        return null;
    }

    @Deprecated
    public final void A02(Intent intent) {
        PendingIntent pendingIntent;
        try {
            0Sy r3 = new 0Sy();
            r3.A0D = true;
            pendingIntent = r3.A01(this.A00, 0, 134217728);
        } catch (RuntimeException | SecurityException unused) {
            pendingIntent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("auth_pending_intent", pendingIntent);
        intent.putExtra("auth_bundle", bundle);
    }

    public final Integer A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass05K.A15;
        }
        Context context = this.A00;
        if (!str.equals(context.getPackageName())) {
            AnonymousClass3RX r1 = (AnonymousClass3RX) AnonymousClass3RD.A00;
            if (!r1.A08.contains(str) && !r1.A05.equals(str) && !r1.A04.equals(str)) {
                return AnonymousClass05K.A1I;
            }
            AnonymousClass3RC A012 = this.A01.A01(context, str, 64);
            C241843Rk.A00(context, A012);
            switch (A012.A02.intValue()) {
                case 1:
                    return AnonymousClass05K.A02;
                case 2:
                    return AnonymousClass05K.A03;
                case 3:
                    return AnonymousClass05K.A1F;
                case 6:
                    return AnonymousClass05K.A04;
                case 7:
                    break;
                default:
                    return AnonymousClass05K.A0u;
            }
        }
        return AnonymousClass05K.A05;
    }
}
