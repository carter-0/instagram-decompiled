package X;

/* renamed from: X.JkE  reason: case insensitive filesystem */
public final class C60366JkE extends C320806sz {
    public final int A00;
    public final Object A01;

    public C60366JkE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int A00(int i) {
        switch (this.A00) {
            case 0:
                MYR myr = (MYR) this.A01;
                if (myr.isModelClass(i, C64803LiN.class) || myr.isModelClass(i, C64745LhM.class)) {
                    return 1;
                }
                return 3;
            case 1:
                K5D k5d = (K5D) this.A01;
                C60438JlW jlW = k5d.A07;
                if (jlW == null || i < 0 || i >= jlW.A06.size() || jlW.getItemViewType(i) != 4) {
                    return 1;
                }
                return k5d.A02;
            case 2:
                if (((2Rw) this.A01).getItemViewType(i) == 0) {
                    return 2;
                }
                return 1;
            case 3:
                AnonymousClass2t9 r0 = ((C64964Ll3) this.A01).A0A;
                if (r0 == null) {
                    return 1;
                }
                C232232tF A012 = r0.A03.A01(r0.getItemViewType(i));
                if ((A012 instanceof KGV) || (A012 instanceof C61667KGr)) {
                    return 2;
                }
                return 1;
            case 4:
                int itemViewType = ((2Rw) this.A01).getItemViewType(i);
                if (itemViewType == 0) {
                    return 1;
                }
                if (itemViewType == 1) {
                    return 2;
                }
                if (itemViewType == 2) {
                    return 1;
                }
                if (itemViewType == 3) {
                    return 2;
                }
                throw AnonymousClass7TE.A0z("unhandled item type");
            case 5:
                C60446Jle jle = ((C61424K6y) this.A01).A07;
                if (jle == null) {
                    0qQ.A0F("galleryAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                jle.getItemViewType(i);
                return 1;
            case 6:
                C60441JlZ jlZ = (C60441JlZ) ((K7b) this.A01).A0A.getValue();
                int A1V = AnonymousClass7TF.A1V(jlZ.A00);
                if (i < A1V || i >= jlZ.A02.size() + A1V) {
                    return 3;
                }
                return 1;
            default:
                return ((C66519MUx) this.A01).By6(i, 2);
        }
    }
}
