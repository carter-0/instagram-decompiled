package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6Ko  reason: invalid class name and case insensitive filesystem */
public abstract class C306046Ko {
    public static final C306066Kq A01(Integer num, String str) {
        C377579Mj r5 = new C377579Mj(str, 0);
        List singletonList = Collections.singletonList("fully-visible");
        0qQ.A07(singletonList);
        return C306056Kp.A00(num, "viewLifecycle", "visibility", singletonList, 0Yt.A0E(), r5);
    }

    public static final C306066Kq A02(Integer num, String str) {
        C377579Mj r5 = new C377579Mj(str, 1);
        List singletonList = Collections.singletonList("partially-visible");
        0qQ.A07(singletonList);
        return C306056Kp.A00(num, "viewLifecycle", "visibility", singletonList, 0Yt.A0E(), r5);
    }

    public static final C306066Kq A00(Integer num) {
        AnonymousClass6L2 r5 = AnonymousClass6L2.A00;
        List singletonList = Collections.singletonList("not-visible");
        0qQ.A07(singletonList);
        return C306056Kp.A00(num, "viewLifecycle", "visibility", singletonList, 0Yt.A0E(), r5);
    }
}
