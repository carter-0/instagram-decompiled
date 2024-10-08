package X;

/* renamed from: X.Xyp  reason: case insensitive filesystem */
public final class C22280Xyp implements Y9R {
    public final int A00;
    public final Object A01;

    public C22280Xyp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ C21392Xa0 AJm(Object obj) {
        Object obj2;
        int i;
        C22280Xyp xyp;
        Object wLi;
        int i2;
        switch (this.A00) {
            case 1:
                wLi = new C19101WLi(new UVO(AnonymousClass05K.A01));
                i = 0;
                break;
            case 3:
                wLi = new C19101WLi(new Object());
                i = 2;
                break;
            default:
                C22277Xym xym = (C22277Xym) ((C22280Xyp) this.A01).A01;
                if (xym instanceof XOD) {
                    obj2 = new C19106WLn(UVE.class);
                    i2 = 3;
                } else {
                    obj2 = new C19106WLn(UVH.class);
                    i2 = 1;
                }
                xyp = new C22280Xyp(xym, i2);
                break;
        }
        xyp = new C22280Xyp(this, i);
        return new C21392Xa0(xyp, obj2);
    }
}
