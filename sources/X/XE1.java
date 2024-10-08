package X;

import com.facebook.react.modules.intent.IntentModule;

public final class XE1 extends C286545Wv {
    public static final XE1 A00 = new XE1();

    public XE1() {
        super(1, 2);
    }

    public final String A00(int i) {
        if (i == 0) {
            return C273654mx.A00(2418);
        }
        return super.A00(i);
    }

    public final String A01(int i) {
        if (i == 0) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        if (i == 1) {
            return "anchor";
        }
        return super.A01(i);
    }

    public final void A02(C286475Wm r8, C288455bw r9, AnonymousClass5X4 r10, C288475by r11) {
        int i;
        C288465bx r112 = (C288465bx) r11;
        C286535Wu r3 = r112.A03;
        Object[] objArr = r3.A07;
        int i2 = r112.A01;
        Object obj = objArr[i2];
        AnonymousClass5X7 r2 = (AnonymousClass5X7) objArr[i2 + 1];
        int i3 = r3.A05[r112.A00];
        if (obj instanceof C286695Xk) {
            ((C288445bv) r9).A05.add(((C286695Xk) obj).A01);
        }
        int A0H = r10.A0H(r2);
        int A0G = r10.A0G(A0H, i3);
        if (A0G >= r10.A0B) {
            A0G += r10.A09;
        }
        Object[] objArr2 = r10.A0J;
        Object obj2 = objArr2[A0G];
        objArr2[A0G] = obj;
        if (obj2 instanceof C286695Xk) {
            int length = objArr2.length - r10.A09;
            int A0G2 = length - r10.A0G(A0H, i3);
            C286695Xk r5 = (C286695Xk) obj2;
            AnonymousClass5X7 r6 = r5.A00;
            int i4 = -1;
            if (r6 == null || r6.A00 == Integer.MIN_VALUE) {
                i = -1;
            } else {
                i4 = r10.A0H(r6);
                int[] iArr = r10.A0I;
                i = length - AnonymousClass5X4.A01(r10, iArr, AnonymousClass5X4.A00(r10, iArr[(AnonymousClass5X4.A00(r10, i4) * 5) + 3] + i4));
            }
            r9.AWN(r5.A01, A0G2, i4, i);
        } else if (obj2 instanceof C286625Xd) {
            ((C286625Xd) obj2).A00();
        }
    }
}
