package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Coj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45006Coj {
    public static Map A00(DT7 dt7) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dt7.C4e() != null) {
            List<DUJ> C4e = dt7.C4e();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (DUJ duj : C4e) {
                if (duj != null) {
                    A1C.add(duj.FHC());
                }
            }
            A1H.put("templates", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
