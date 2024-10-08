package X;

import java.util.List;

/* renamed from: X.9Nu  reason: invalid class name and case insensitive filesystem */
public final class C377929Nu implements AnonymousClass68Z {
    public final /* synthetic */ AnonymousClass9IO A00;
    public final /* synthetic */ 2ED A01;

    public C377929Nu(AnonymousClass9IO r1, 2ED r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        2ED r2 = this.A01;
        1bC r1 = r2.A0A.A0H;
        if (r1.A0F || r1.A0I) {
            2E2 r6 = r2.A0C;
            AnonymousClass9IO r5 = this.A00;
            r6.A00.markerAnnotate(78266157, r5.A02, "response_data_size", list.size());
            r6.A02(r5, 2);
        }
        return list;
    }
}
