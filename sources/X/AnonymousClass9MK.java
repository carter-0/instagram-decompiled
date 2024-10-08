package X;

/* renamed from: X.9MK  reason: invalid class name */
public final class AnonymousClass9MK extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                ((Number) obj2).intValue();
                ((C305436Hz) this.A04).A6s((C286575Wy) obj3, this.A03, (0sL) this.A02, C301445zH.A00(this.A01 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ((AnonymousClass5PJ) this.A04).A02((C286575Wy) obj3, this.A02, this.A03, C301445zH.A00(this.A01) | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                AnonymousClass5YA.A00((C286575Wy) obj3, (C268124co) this.A03, (C286835Xz) this.A04, (0sL) this.A02, C301445zH.A00(this.A01 | 1));
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Object obj4 = this.A03;
                if (obj4 == null) {
                    return null;
                }
                return new ICX(this.A01, 0, obj3, obj4, this.A04, this.A02, booleanValue);
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MK(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }
}
