package X;

import android.content.Context;
import com.facebook.msys.mci.ProxyProvider;

/* renamed from: X.3jx  reason: invalid class name and case insensitive filesystem */
public abstract class C249543jx {
    public static ProxyProvider A00(Context context, C257503xV r6) {
        synchronized (C249553jy.class) {
            if (C249553jy.A00 == null) {
                C249553jy.A00 = new C249563jz(context);
            }
        }
        C249573k0 r4 = new C249573k0();
        C249583k2 r3 = new C249583k2(context, r6);
        return new ProxyProvider(new C249603k4(), r4, new C249593k3(), r3);
    }
}
