package X;

import com.facebook.react.modules.intent.IntentModule;

public final class XG6 extends C286545Wv {
    public static final XG6 A00 = new XG6();

    public XG6() {
        super(0, 2);
    }

    public final String A01(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        return super.A01(i);
    }

    public final void A02(C286475Wm r8, C288455bw r9, AnonymousClass5X4 r10, C288475by r11) {
        C288465bx r112 = (C288465bx) r11;
        Object[] objArr = r112.A03.A07;
        int i = r112.A01;
        AnonymousClass5X7 r2 = (AnonymousClass5X7) objArr[i];
        Object obj = objArr[i + 1];
        if (obj instanceof C286695Xk) {
            ((C288445bv) r9).A05.add(((C286695Xk) obj).A01);
        }
        if (r10.A06 == 0) {
            int i2 = r10.A02;
            int i3 = r10.A03;
            int A0H = r10.A0H(r2);
            int A01 = AnonymousClass5X4.A01(r10, r10.A0I, AnonymousClass5X4.A00(r10, A0H + 1));
            r10.A02 = A01;
            r10.A03 = A01;
            AnonymousClass5X4.A09(r10, 1, A0H);
            if (i2 >= A01) {
                i2++;
                i3++;
            }
            r10.A0J[A01] = obj;
            r10.A02 = i2;
            r10.A03 = i3;
            return;
        }
        AnonymousClass5XN.A03("Can only append a slot if not current inserting");
        throw AnonymousClass00P.createAndThrow();
    }
}
