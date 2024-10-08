package X;

import android.content.Context;

/* renamed from: X.3j8  reason: invalid class name and case insensitive filesystem */
public abstract class C249103j8 {
    public static final void A00(Context context) {
        0qQ.A0B(context, 0);
        if (C249113j9.A00 != null) {
            C62507Kgx A00 = C272854lX.A00();
            C62507Kgx kgx = C62507Kgx.BROWSER_LOADED;
            if (A00 != kgx && C272854lX.A00() != C62507Kgx.PROVIDER_LOADED) {
                return;
            }
            if (C272854lX.A00() == kgx || C272854lX.A00() == C62507Kgx.PROVIDER_LOADED) {
                RRL rrl = C272854lX.A00;
                if (rrl != null) {
                    rrl.A02(context);
                    return;
                }
                throw new RuntimeException("Voltron bridge was null, but Helium was marked loaded");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to warm up child process without Helium browser process initialization, current state:");
            sb.append(C272854lX.A00());
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final boolean A01(Context context) {
        0qQ.A0B(context, 0);
        if (C249113j9.A00 == null || !C272854lX.A02 || !0gH.A01(context, "heliumiab") || C272854lX.A01() != AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }
}
