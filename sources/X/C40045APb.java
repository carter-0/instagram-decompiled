package X;

/* renamed from: X.APb  reason: case insensitive filesystem */
public final class C40045APb implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass86m A00;

    public C40045APb(AnonymousClass86m r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass87G A01;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnonymousClass86m r3 = this.A00;
            boolean booleanValue = bool.booleanValue();
            if (!r3.A0W.A03) {
                AnonymousClass86m.A05(r3);
                C347487wt r1 = r3.A0A;
                if (r1 != null) {
                    r1.A02 = !booleanValue;
                    if (!booleanValue) {
                        r1.setCurrentTitle(C342507oi.A07);
                        return;
                    }
                    AnonymousClass876 r12 = r3.A08;
                    String str = null;
                    if (r12 != null && r12.A01() != null) {
                        AnonymousClass876 r13 = r3.A08;
                        if (!(r13 == null || (A01 = r13.A01()) == null)) {
                            str = A01.A0G;
                        }
                        r3.ETd(str);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
