package X;

/* renamed from: X.9Y3  reason: invalid class name */
public final class AnonymousClass9Y3 extends 01e {
    public final /* synthetic */ AT1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9Y3(AT1 at1) {
        super(10);
        this.A00 = at1;
    }

    public final /* bridge */ /* synthetic */ void A06(boolean z, Object obj, Object obj2, Object obj3) {
        C295015nP r6 = (C295015nP) obj2;
        if (z) {
            AnonymousClass9OB r2 = this.A00.A00;
            C338587iC r1 = r2.A00;
            if (!r1.A05) {
                return;
            }
            if (AnonymousClass2VL.A01()) {
                r6.A04();
            } else {
                r1.A04.post(new C40950Alw(r6, r2));
            }
        }
    }
}
