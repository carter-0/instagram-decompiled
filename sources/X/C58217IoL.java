package X;

import android.animation.ValueAnimator;

/* renamed from: X.IoL  reason: case insensitive filesystem */
public final class C58217IoL extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58217IoL(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i3;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = obj2;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C56033Hrg hrg = (C56033Hrg) this.A04;
                int A07 = DbX.A07((AnonymousClass0eM) this.A03);
                int i = this.A01;
                int i2 = this.A02;
                JNW jnw = (JNW) this.A05;
                boolean z = ((C56861IFi) jnw).A02;
                boolean A1W = AnonymousClass7TF.A1W(jnw.Asz(), AnonymousClass05K.A00);
                int i3 = A07;
                C3022462f r1 = hrg.A03;
                long A042 = r1.A04(i);
                int A043 = C51965G9l.A04(A042);
                C3022262d r2 = r1.A03;
                if (r2.A06(A043) != A07) {
                    int i4 = r2.A02;
                    if (A07 >= i4) {
                        A043 = r1.A03(i4 - 1);
                    } else {
                        A043 = r1.A03(A07);
                    }
                }
                int A022 = C51968G9o.A02(A042);
                if (r2.A06(A022) != A07) {
                    int i5 = r2.A02;
                    if (A07 >= i5) {
                        i3 = i5 - 1;
                    }
                    A022 = r2.A07(i3, false);
                }
                if (A043 == i2) {
                    return hrg.A00(A022);
                }
                if (A022 != i2 && (!(z ^ A1W) ? i >= A043 : i > A022)) {
                    A043 = A022;
                }
                return hrg.A00(A043);
            case 1:
                int i6 = this.A02;
                int i7 = this.A01;
                ((C231402rc) this.A04).onItemRangeChanged(i6, i7);
                C3254772o r0 = (C3254772o) this.A05;
                C3254772o.A03(r0, i6, i7);
                C3254772o.A01(r0);
                return C60340gF.A00;
            default:
                C53927GwX gwX = (C53927GwX) this.A05;
                if (!gwX.A06) {
                    return null;
                }
                if (182.A06(0Tu.A06, gwX.A03, 36315133900229647L)) {
                    return null;
                }
                C243673Zt r6 = (C243673Zt) this.A04;
                C51973G9u.A18(r6);
                float[] A1b = C51965G9l.A1b();
                // fill-array-data instruction
                A1b[0] = 0;
                A1b[1] = 1065353216;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                Object obj = this.A03;
                int i8 = this.A02;
                int i9 = this.A01;
                ofFloat.setDuration(300);
                C51970G9q.A11(new C64202LTp(obj, i8, i9, 1), ofFloat, r6);
                return null;
        }
    }
}
