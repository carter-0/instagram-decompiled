package X;

/* renamed from: X.MuY  reason: case insensitive filesystem */
public final class C67774MuY extends C320806sz {
    public final int A00;
    public final Object A01;

    public C67774MuY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int A00(int i) {
        switch (this.A00) {
            case 0:
                int itemViewType = ((2Rw) this.A01).getItemViewType(i);
                if (itemViewType == 0 || itemViewType == 1 || itemViewType == 2) {
                    return 1;
                }
                return UAJ.A05;
            case 1:
                MYR myr = (MYR) this.A01;
                int itemViewType2 = myr.getAdapter().getItemViewType(i);
                if (itemViewType2 == myr.getAdapter().A01(C68193N5i.class) || itemViewType2 == myr.getAdapter().A01(C14036Toc.class)) {
                    return 2;
                }
                return 1;
            case 2:
                C71083Ob6 ob6 = (C71083Ob6) this.A01;
                AnonymousClass0eM r2 = ob6.A0G;
                if (((C70692OGn) r2.getValue()).A00.A09(i, C61178JyU.class) || ((C70692OGn) r2.getValue()).A00.A09(i, C64760Lhc.class)) {
                    return ob6.A03;
                }
                return 1;
            case 3:
                P3E p3e = (P3E) this.A01;
                AnonymousClass2t9 r1 = p3e.A0K.A00;
                if (r1.A09(i, C61169JyL.class) || r1.A09(i, C61154Jy6.class)) {
                    return p3e.A0B;
                }
                return 1;
            default:
                AnonymousClass2t9 r0 = ((NKE) this.A01).A04;
                if (r0 == null) {
                    0qQ.A0F("responsesAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                int itemCount = r0.getItemCount();
                if (itemCount == 1) {
                    return 6;
                }
                if (itemCount == 2) {
                    return 3;
                }
                return 2;
        }
    }
}
