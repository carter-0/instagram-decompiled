package X;

import java.io.Writer;

/* renamed from: X.S0j  reason: case insensitive filesystem */
public final class C10909S0j {
    public final /* synthetic */ C12730T4o A00;

    public C10909S0j(C12730T4o t4o) {
        this.A00 = t4o;
    }

    public final void A00(Writer writer, Object obj) {
        C12730T4o t4o = this.A00;
        C13962TmP tmP = C12730T4o.A05;
        Writer writer2 = writer;
        C12716T4a t4a = new C12716T4a(t4o.A00, writer2, t4o.A02, t4o.A03, t4o.A01);
        t4a.A00(obj);
        t4a.A00.flush();
    }
}
