package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.RxY  reason: case insensitive filesystem */
public final class C10754RxY {
    public long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public C10754RxY(String str, String str2, Map map, long j, boolean z) {
        Map emptyMap;
        AnonymousClass3Qk.A04(str);
        AnonymousClass3Qk.A04(str2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = j;
        if (map != null) {
            emptyMap = Pxe.A19(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A03 = emptyMap;
    }
}
