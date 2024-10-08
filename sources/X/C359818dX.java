package X;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.8dX  reason: invalid class name and case insensitive filesystem */
public abstract class C359818dX implements Cloneable {
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, X.8de] */
    public static C359918dh A00(C359808dW r11, C359698dL r12) {
        C359848da r2;
        if (r12.A06) {
            r2 = new AnonymousClass9g5(new A7R(r12.A02, r12.A03, 002.A0R(r12.A04, "loaded_screen_query"), r12.A05, r12.A00, r12.A01));
        } else {
            String str = r12.A03;
            String A0R = 002.A0R(r12.A04, "loaded_screen_query");
            0lg r1 = r12.A02;
            HashMap hashMap = r12.A05;
            boolean z = r12.A08;
            r2 = new C359838dZ(new C359828dY(r1, str, A0R, hashMap, r12.A00, r12.A01, r12.A07, z));
        }
        C359898df r4 = new C359898df(r2, new Handler(C359788dU.A01));
        r2.A00 = r4;
        C359918dh r3 = new C359918dh(r11, new C359908dg(), r4);
        C359888de r22 = r4.A02;
        if (r22.CYP()) {
            C359898df.A00(r3, r4);
            return r3;
        }
        r22.E3G(new C359938dj(r3, r4), "Emitter_subscribe");
        return r3;
    }
}
