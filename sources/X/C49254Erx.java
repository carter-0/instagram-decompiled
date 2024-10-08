package X;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Erx  reason: case insensitive filesystem */
public abstract class C49254Erx {
    public static final boolean A00(Context context) {
        0cS r3 = new 0cS();
        Set singleton = Collections.singleton(C60020ci.A1f);
        0qQ.A07(singleton);
        r3.A01 = new 0Pj(0cQ.A03(singleton, Collections.unmodifiableSet(new HashSet(Collections.singletonList(AnonymousClass000.A00(561))))));
        return r3.A00().A03(context, (Intent) null, (0bY) null);
    }
}
