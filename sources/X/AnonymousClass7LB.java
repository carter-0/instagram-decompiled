package X;

/* renamed from: X.7LB  reason: invalid class name */
public abstract class AnonymousClass7LB implements C229122ms {
    public AnonymousClass7Z5 A00;

    public final boolean CJz() {
        return true;
    }

    public final void A00(AnonymousClass7Z5 r2) {
        if (this instanceof AnonymousClass7PP) {
            ((AnonymousClass7PP) this).A00.A00.A00(r2);
        } else {
            ((AnonymousClass7LA) this).A00.CgQ();
        }
    }

    public final boolean A01(AnonymousClass7Z5 r2) {
        if (this instanceof AnonymousClass7PP) {
            return ((AnonymousClass7PP) this).A00.A00.A01(r2);
        }
        return r2.A00;
    }

    public final boolean A02(AnonymousClass7Z5 r2) {
        if (this instanceof AnonymousClass7PP) {
            return ((AnonymousClass7PP) this).A00.A00.A02(r2);
        }
        return r2.A01;
    }

    public final boolean A03(AnonymousClass7Z5 r3) {
        if (this instanceof AnonymousClass7PP) {
            return ((AnonymousClass7PP) this).A00.A00.A03(r3);
        }
        if (((AnonymousClass7LA) this).A01.CBU() != null) {
            return true;
        }
        return false;
    }

    public final boolean A04(AnonymousClass7Z5 r2) {
        if (this instanceof AnonymousClass7PP) {
            return ((AnonymousClass7PP) this).A00.A00.A04(r2);
        }
        if (r2.A02 || r2.A03) {
            return true;
        }
        if (!r2.A00 || r2.A01) {
            return false;
        }
        return true;
    }

    public final boolean CKB() {
        AnonymousClass7Z5 r0 = this.A00;
        if (r0 != null) {
            return A01(r0);
        }
        0wb.A03("ModelBasedLoadMoreDelegate", "calling hasMoreItems() when model is null");
        return false;
    }

    public final boolean CT5() {
        AnonymousClass7Z5 r0 = this.A00;
        if (r0 != null) {
            return A02(r0);
        }
        0wb.A03("ModelBasedLoadMoreDelegate", "calling isFailed() when model is null");
        return false;
    }

    public final boolean CWV() {
        AnonymousClass7Z5 r0 = this.A00;
        if (r0 != null) {
            return A03(r0);
        }
        0wb.A03("ModelBasedLoadMoreDelegate", "calling isLoadMoreVisible() when model is null");
        return false;
    }

    public final void CgO() {
        AnonymousClass7Z5 r0 = this.A00;
        if (r0 != null) {
            A00(r0);
        } else {
            0wb.A03("ModelBasedLoadMoreDelegate", "calling loadMore() when model is null");
        }
    }

    public final boolean isLoading() {
        AnonymousClass7Z5 r0 = this.A00;
        if (r0 != null) {
            return A04(r0);
        }
        0wb.A03("ModelBasedLoadMoreDelegate", "calling isLoading() when model is null");
        return false;
    }
}
