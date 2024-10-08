package X;

import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ixo  reason: case insensitive filesystem */
public final class C58803Ixo extends 0Yg implements 0sP {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58803Ixo(C21267XRm xRm, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        super(1);
        this.A05 = loggingContext;
        this.A00 = j;
        this.A03 = xRm;
        this.A02 = list;
        this.A06 = str;
        this.A01 = list2;
        this.A04 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        1Ln r8 = (1Ln) obj;
        0bb r5 = new 0bb();
        LoggingContext loggingContext = (LoggingContext) this.A05;
        C51971G9r.A1B(r5, loggingContext);
        0bb r2 = new 0bb();
        r2.A05("credential_id", Long.valueOf(this.A00));
        C51975G9x.A19(r2, this.A03);
        r5.A07("credential_container", AnonymousClass7TE.A1I(r2));
        List list = (List) this.A02;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(arrayList, Long.parseLong(AnonymousClass7TE.A18(it)));
            }
        } else {
            arrayList = 0sn.A00;
        }
        G9t.A1L(r5, loggingContext, "container_ids", arrayList);
        r5.A06("view_name", this.A06);
        r5.A07("applied_discounts", (List) this.A01);
        r8.A0N(r5, "event_payload");
        C51969G9p.A1G(r8, this.A04);
        return r8;
    }
}
