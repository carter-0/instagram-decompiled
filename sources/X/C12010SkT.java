package X;

/* renamed from: X.SkT  reason: case insensitive filesystem */
public final class C12010SkT implements AnonymousClass1r3, C66831qb {
    public static C12010SkT A03;
    public int A00;
    public Integer A01;
    public String A02;

    public final synchronized void Cxe() {
        this.A00++;
        this.A01 = AnonymousClass05K.A01;
    }

    public final synchronized void DGe() {
        this.A00++;
        this.A01 = AnonymousClass05K.A00;
    }

    public final synchronized String E53() {
        StringBuilder A1A;
        String str;
        A1A = AnonymousClass7TE.A1A();
        A1A.append("UFS");
        A1A.append("-");
        A1A.append(this.A02);
        A1A.append("-");
        if (1 - this.A01.intValue() != 0) {
            str = "fg";
        } else {
            str = "bg";
        }
        A1A.append(str);
        A1A.append("-");
        return Pxe.A0z(A1A, this.A00);
    }
}
