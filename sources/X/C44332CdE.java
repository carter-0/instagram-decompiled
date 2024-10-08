package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdE  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44332CdE {
    public static Map A00(C298905uE r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.B9j();
        A1H.put("graduation_year", Integer.valueOf(r3.B9j()));
        if (r3.Bpj() != null) {
            A1H.put("school_name", r3.Bpj());
        }
        if (r3.Bpk() != null) {
            A1H.put("school_name_abbreviation", r3.Bpk());
        }
        return 0Yt.A0B(A1H);
    }
}
