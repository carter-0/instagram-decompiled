package X;

/* renamed from: X.8Ll  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C354298Ll implements AnonymousClass2gO {
    public final /* synthetic */ C354248Lf A00;

    public /* synthetic */ C354298Ll(C354248Lf r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        float floatValue;
        C354248Lf r1 = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AnonymousClass8LU r3 = r1.A06;
        if (booleanValue) {
            floatValue = 0.0f;
        } else {
            Object A02 = r1.A07.A0H.A02();
            A02.getClass();
            floatValue = ((Number) A02).floatValue();
        }
        r3.A00 = floatValue;
        C378369Pn r12 = r3.A0B;
        if (r12 != null) {
            if (r3.A0L) {
                floatValue = 0.0f;
            }
            C378459Pw r0 = r12.A08;
            if (r0 != null) {
                r0.A0G(floatValue);
            }
        }
    }
}
