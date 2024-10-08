package X;

/* renamed from: X.8Ds  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352528Ds implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ C352528Ds(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        boolean z;
        AnonymousClass80R r3 = this.A00;
        boolean isEmpty = ((AnonymousClass831) obj).A01.isEmpty();
        C3504884v r0 = r3.A1L;
        r0.getClass();
        05G r2 = r0.A0b;
        if (isEmpty) {
            z = false;
        } else {
            z = true;
        }
        r2.Epw(Boolean.valueOf(z));
        r3.A1F.A08 = z;
    }
}
