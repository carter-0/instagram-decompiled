package X;

import java.util.HashMap;
import java.util.Map;

public final class SNV {
    public static final S9T A04 = new Object();
    public final long A00;
    public final C13886Tj9 A01;
    public final Map A02;
    public final Map A03;

    public SNV(C13886Tj9 tj9, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A03 = A1E;
        if (map != null) {
            A1E.putAll(map);
        }
        this.A01 = tj9;
        this.A00 = tj9.now();
        this.A02 = AnonymousClass7TE.A1E();
    }

    public static final void A00(SNV snv, S4C s4c, Exception exc, String str, Map map, long j) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.putAll(snv.A03);
        A1E.putAll(map);
        if (s4c != null) {
            A1E.put("segment_type", AnonymousClass7TF.A0j(s4c.A01));
            A1E.put("segment_id", String.valueOf(s4c.A00));
        }
        C9596Rda.A00(snv.A01, exc, str, A1E, j);
    }
}
