package X;

import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SGq  reason: case insensitive filesystem */
public final class C11231SGq {
    public final LoggingContext A00;
    public final QDH A01;

    public final void A00(FormCellFocusEvents formCellFocusEvents, Boolean bool, boolean z) {
        String str;
        String str2;
        String str3;
        Map map;
        if (z) {
            str = formCellFocusEvents.A02;
            str2 = formCellFocusEvents.A03;
            str3 = null;
        } else {
            if (DbX.A1a(bool)) {
                str = formCellFocusEvents.A01;
            } else {
                str = formCellFocusEvents.A00;
            }
            str2 = null;
            str3 = formCellFocusEvents.A03;
        }
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = this.A00;
        SEB A03 = this.A01.A03();
        0qQ.A0B(loggingContext, 0);
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        if (str2 != null) {
            A0n.put("TARGET_NAME", str2);
        }
        if (str3 != null) {
            A0n.put("VIEW_NAME", str3);
        }
        Object obj = A0n.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
            map = AnonymousClass7TE.A1H();
        }
        SUU.A0A(A03, map);
        C12411Sto.A0A(A002, "extra_data", map, str, A0n);
    }

    public C11231SGq(LoggingContext loggingContext, QDH qdh) {
        this.A00 = loggingContext;
        this.A01 = qdh;
    }

    public C11231SGq() {
    }
}
