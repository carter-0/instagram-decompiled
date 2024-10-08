package X;

public final class GTW extends C249383je implements C228162kt {
    public int A00;
    public final C228172ku A01 = new C228172ku();

    public final void EBt(C249383je r2) {
        0qQ.A0B(r2, 0);
        this.A01.A03(r2);
    }

    public final int AuP() {
        return this.A00;
    }

    public final void FJ2(C249383je r2) {
        this.A01.A02.remove(r2);
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(515721585);
        0qQ.A0B(r10, 0);
        this.A01.onScroll(r10, i, i2, i3, i4, i5);
        AnonymousClass0fD.A0A(-1831386393, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A0D = AnonymousClass7TG.A0D(r3, -1320659294);
        this.A00 = i;
        this.A01.onScrollStateChanged(r3, i);
        AnonymousClass0fD.A0A(-488369862, A0D);
    }
}
