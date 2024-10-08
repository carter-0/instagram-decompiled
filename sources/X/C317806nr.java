package X;

/* renamed from: X.6nr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C317806nr implements AnonymousClass2gO {
    public final /* synthetic */ C310236ae A00;

    public /* synthetic */ C317806nr(C310236ae r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C310236ae r5 = this.A00;
        C310436b3 r7 = (C310436b3) obj;
        if (r7 instanceof C315546k5) {
            C62320sa r0 = r5.A0A.A0G;
            if (r0 != null) {
                r0.invoke();
            }
        } else if (r7 instanceof C315556k6) {
            C315556k6 r72 = (C315556k6) r7;
            r5.A0A.A04(r72.A00, r72.A01, r72.A02, r72.A03);
        } else if (r7 instanceof C315566k7) {
            r5.A0A.A05((String) null, (String) null);
        } else {
            return;
        }
        r5.A00.A05.Epw(C310426b2.A00);
    }
}
