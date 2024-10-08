package X;

/* renamed from: X.9MW  reason: invalid class name */
public final class AnonymousClass9MW extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MW(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C289085cz r1;
        int AB2;
        C291605ha r12;
        C268104cl r15 = (C268104cl) obj;
        if (this.A00 != 0) {
            C267974cY[] r11 = (C267974cY[]) this.A05;
            C291505hP r10 = (C291505hP) this.A06;
            int i = this.A02;
            int i2 = this.A01;
            C268014cc r7 = (C268014cc) this.A04;
            int[] iArr = (int[]) this.A03;
            int length = r11.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C267974cY r3 = r11[i3];
                int i5 = i4 + 1;
                0qQ.A0A(r3);
                Object BaX = r3.BaX();
                if (BaX instanceof C289085cz) {
                    r1 = (C289085cz) BaX;
                } else {
                    r1 = null;
                }
                AnonymousClass5Q8 layoutDirection = r7.getLayoutDirection();
                if (r1 == null || (r12 = r1.A01) == null) {
                    AB2 = r10.A00.AB2(layoutDirection, 0, i - r3.A01);
                } else {
                    AB2 = r12.A00(r3, layoutDirection, i - r3.A01, i2);
                }
                r15.A05(r3, 0.0f, AB2, iArr[i4]);
                i3++;
                i4 = i5;
            }
        } else {
            AnonymousClass5Q8 layoutDirection2 = ((C268014cc) this.A05).getLayoutDirection();
            int i6 = this.A02;
            int i7 = this.A01;
            C287675aa.A03(((C287685ab) this.A06).A00, (C268074ci) this.A03, r15, (C267974cY) this.A04, layoutDirection2, i6, i7);
        }
        return C60340gF.A00;
    }
}
