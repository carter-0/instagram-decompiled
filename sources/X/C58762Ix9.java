package X;

/* renamed from: X.Ix9  reason: case insensitive filesystem */
public final class C58762Ix9 extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58762Ix9(Object obj, Object obj2, float f, float f2, int i) {
        super(1);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = f;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        float f2;
        Object obj2;
        switch (this.A02) {
            case 0:
                SOO soo = (SOO) obj;
                0qQ.A0B(soo, 0);
                IHB ihb = (IHB) this.A04;
                Sd4 A002 = soo.A00(ihb.A01);
                0qQ.A07(A002);
                C56073HsM hsM = (C56073HsM) this.A03;
                f = this.A01;
                f2 = this.A00;
                obj2 = C11319SMt.A00[ihb.A00][hsM.A00].invoke(A002, hsM.A01);
                break;
            case 1:
                SOO soo2 = (SOO) obj;
                0qQ.A0B(soo2, 0);
                AnonymousClass5Q8 r6 = soo2.A01;
                if (r6 != null) {
                    IHC ihc = (IHC) this.A04;
                    int i = ihc.A00;
                    int i2 = i;
                    if (i < 0) {
                        i2 = i + 2;
                        if (r6 != AnonymousClass5Q8.Ltr) {
                            i2 = (-i) - 1;
                        }
                    }
                    C56074HsN hsN = (C56074HsN) this.A03;
                    int i3 = hsN.A00;
                    int i4 = i3;
                    if (i3 < 0) {
                        i4 = i3 + 2;
                        if (r6 != AnonymousClass5Q8.Ltr) {
                            i4 = (-i3) - 1;
                        }
                    }
                    Sd4 A003 = soo2.A00(ihc.A01);
                    0qQ.A07(A003);
                    f = this.A01;
                    f2 = this.A00;
                    0sK r2 = C11319SMt.A01[i2][i4];
                    Object obj3 = hsN.A01;
                    AnonymousClass5Q8 r0 = soo2.A01;
                    if (r0 != null) {
                        obj2 = r2.invoke(A003, obj3, r0);
                        break;
                    }
                }
                0qQ.A0F("layoutDirection");
                throw AnonymousClass00P.createAndThrow();
            default:
                ((C309736Zk) this.A03).D7M((C255773uh) this.A04, 2EG.A3e, this.A00, this.A01);
                break;
        }
        Sd4 sd4 = (Sd4) obj2;
        sd4.A02(C51965G9l.A0T(f));
        sd4.A03(C51965G9l.A0T(f2));
        return C60340gF.A00;
    }
}
