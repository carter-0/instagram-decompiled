package X;

import java.util.Map;

/* renamed from: X.Rhc  reason: case insensitive filesystem */
public abstract class C9814Rhc {
    public static final Map A00(C7310Q3m q3m, Integer num) {
        String str;
        C7305Q3h q3h;
        AnonymousClass7TG.A1N(num, q3m);
        switch (num.intValue()) {
            case 0:
                str = "resolved_sync";
                break;
            case 1:
                str = "resolved_async";
                break;
            default:
                str = "failed";
                break;
        }
        0eP A1L = AnonymousClass7TE.A1L("resolution_type", str);
        if (q3m instanceof C7311Q3n) {
            q3h = ((C7311Q3n) q3m).A00;
        } else {
            q3h = q3m.A00;
        }
        return DbY.A0p("response_summary", DbY.A0p("annotations", q3h.A00, AnonymousClass7TE.A1L("points", q3h.A01)), A1L);
    }
}
