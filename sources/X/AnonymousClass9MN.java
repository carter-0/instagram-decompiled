package X;

import android.content.Context;

/* renamed from: X.9MN  reason: invalid class name */
public final class AnonymousClass9MN extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MN(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i3;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A01 = i2;
        this.A04 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int AAy;
        C289085cz r1;
        C291605ha r2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C268104cl r13 = (C268104cl) obj2;
                C267974cY[] r9 = (C267974cY[]) this.A04;
                C287405a5 r8 = (C287405a5) this.A05;
                int i = this.A02;
                int i2 = this.A01;
                int[] iArr = (int[]) this.A03;
                int length = r9.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    C267974cY r3 = r9[i3];
                    int i5 = i4 + 1;
                    0qQ.A0A(r3);
                    Object BaX = r3.BaX();
                    if (!(BaX instanceof C289085cz) || (r1 = (C289085cz) BaX) == null || (r2 = r1.A01) == null) {
                        AAy = r8.A00.AAy(0, i - r3.A00);
                    } else {
                        AAy = r2.A00(r3, AnonymousClass5Q8.Ltr, i - r3.A00, i2);
                    }
                    r13.A05(r3, 0.0f, iArr[i4], AAy);
                    i3++;
                    i4 = i5;
                }
                break;
            case 1:
                0sL r6 = ((C288635cE) this.A05).A01;
                int i6 = this.A02;
                C267974cY r5 = (C267974cY) this.A03;
                ((C268104cl) obj2).A06(r5, 0.0f, ((C289165d8) r6.invoke(new C289005cr(C289155d7.A00(i6 - r5.A01, this.A01 - r5.A00)), ((C268014cc) this.A04).getLayoutDirection())).A00);
                break;
            case 4:
                C279064y1 r132 = (C279064y1) obj2;
                0qQ.A0B(r132, 0);
                Context context = r132.A0J.getContext();
                0qQ.A07(context);
                C279094y4 r12 = (C279094y4) this.A05;
                C279134y8 AmB = r12.A01.AmB();
                int i7 = this.A02;
                int i8 = this.A01;
                return new C279154yA(context, AmB, r132, (1Xj) this.A03, (AnonymousClass3W1) this.A04, i7, i8, 182.A06(0Tu.A05, r12.A00, 36330625845773002L));
            default:
                C279064y1 r133 = (C279064y1) obj2;
                0qQ.A0B(r133, 0);
                ((C279094y4) this.A05).A01.AmB().Dl8((1Xj) this.A03, (GQ0) null, r133, (AnonymousClass3W1) this.A04, this.A02, this.A01);
                break;
        }
        return C60340gF.A00;
    }
}
