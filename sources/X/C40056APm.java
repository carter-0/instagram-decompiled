package X;

/* renamed from: X.APm  reason: case insensitive filesystem */
public final class C40056APm implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass88F A00;

    public C40056APm(AnonymousClass88F r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        AnonymousClass88C r4 = (AnonymousClass88C) obj;
        if (r4 == AnonymousClass88C.SUCCESS) {
            AnonymousClass88F r2 = this.A00;
            AnonymousClass804 r0 = r2.A05;
            if (r0 != null) {
                str = r0.getTypeName();
            } else {
                str = null;
            }
            if (!"HIDDEN".equals(str) || !AnonymousClass7TE.A1a(AnonymousClass7TE.A14(r2.A0T))) {
                r2.A08(r4);
            }
        }
    }
}
