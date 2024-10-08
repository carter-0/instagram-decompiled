package X;

import java.util.List;

/* renamed from: X.APd  reason: case insensitive filesystem */
public final class C40047APd implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public C40047APd(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass6ST r0;
        List list = (List) obj;
        C353498Hw r1 = this.A00;
        C39642A3g a3g = r1.A09;
        if (!(a3g == null || (r0 = a3g.A00) == null)) {
            r0.dismiss();
        }
        if (list != null && !list.isEmpty()) {
            r1.A1o.A06.A0B(new AnonymousClass88W(new AnonymousClass88X(r1.A19, r1.A1z, r1.A0R, list, (List) null, 930, false, true, false)));
        }
    }
}
