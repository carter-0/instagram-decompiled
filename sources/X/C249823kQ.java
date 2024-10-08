package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.3kQ  reason: invalid class name and case insensitive filesystem */
public final class C249823kQ extends C249813kP {
    public final 2TT A00;
    public final 2UQ A01;

    public final void A07(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        AnonymousClass2UU.A00(new AnonymousClass37H(str, str2, SystemClock.uptimeMillis()));
    }

    public static final void A00(C249823kQ r1, 0sP r2, int i) {
        Object obj;
        Map map = r1.A00.A06;
        if (map != null && (obj = map.get(Integer.valueOf(i))) != null) {
            r2.invoke(obj);
        }
    }

    public C249823kQ(2TT r1, 2UQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
