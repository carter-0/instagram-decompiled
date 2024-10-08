package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Rtw  reason: case insensitive filesystem */
public final class C10542Rtw {
    public long A00;
    public final C13886Tj9 A01;
    public final Map A02;

    public C10542Rtw(C13886Tj9 tj9, Map map, long j) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A02 = A1E;
        if (map != null) {
            A1E.putAll(map);
        }
        if (j != -1) {
            String valueOf = String.valueOf(j);
            A1E.put("file_size", valueOf);
            A1E.put("total_bytes", valueOf);
        }
        this.A01 = tj9;
    }
}
