package X;

public final class XG9 extends C286545Wv {
    public static final XG9 A00 = new XG9();

    public XG9() {
        super(1, 0);
    }

    public final String A00(int i) {
        if (i == 0) {
            return "count";
        }
        return super.A00(i);
    }

    public final void A02(C286475Wm r8, C288455bw r9, AnonymousClass5X4 r10, C288475by r11) {
        C288465bx r112 = (C288465bx) r11;
        int i = r112.A03.A05[r112.A00];
        int length = r10.A0J.length - r10.A09;
        int i2 = r10.A08;
        int[] iArr = r10.A0I;
        int A03 = AnonymousClass5X4.A03(r10, iArr, AnonymousClass5X4.A00(r10, i2));
        int A01 = AnonymousClass5X4.A01(r10, iArr, AnonymousClass5X4.A00(r10, i2 + 1));
        for (int max = Math.max(A03, A01 - i); max < A01; max++) {
            Object[] objArr = r10.A0J;
            int i3 = max;
            if (max >= r10.A0B) {
                i3 = max + r10.A09;
            }
            Object obj = objArr[i3];
            if (obj instanceof C286695Xk) {
                r9.AWN(((C286695Xk) obj).A01, length - max, -1, -1);
            } else if (obj instanceof C286625Xd) {
                ((C286625Xd) obj).A00();
            }
        }
        boolean z = false;
        AnonymousClass5XN.A06(AnonymousClass7TF.A1R(i));
        int i4 = r10.A08;
        int[] iArr2 = r10.A0I;
        int A032 = AnonymousClass5X4.A03(r10, iArr2, AnonymousClass5X4.A00(r10, i4));
        int A012 = AnonymousClass5X4.A01(r10, iArr2, AnonymousClass5X4.A00(r10, i4 + 1)) - i;
        if (A012 >= A032) {
            z = true;
        }
        AnonymousClass5XN.A06(z);
        AnonymousClass5X4.A0C(r10, A012, i, i4);
        int i5 = r10.A02;
        if (i5 >= A032) {
            r10.A02 = i5 - i;
        }
    }
}
