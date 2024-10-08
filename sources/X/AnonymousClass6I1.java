package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6I1  reason: invalid class name */
public final class AnonymousClass6I1 implements AnonymousClass6I0 {
    public static final C286015Tp A03 = new C286005To(AnonymousClass6I3.A00, AnonymousClass6I2.A00);
    public AnonymousClass5Y2 A00;
    public final Map A01;
    public final Map A02;

    public final void EEf(Object obj) {
        AnonymousClass6JC r1 = (AnonymousClass6JC) this.A01.get(obj);
        if (r1 != null) {
            r1.A00 = false;
        } else {
            this.A02.remove(obj);
        }
    }

    public AnonymousClass6I1(Map map) {
        this.A02 = map;
        this.A01 = new LinkedHashMap();
    }

    public final void A6s(C286575Wy r11, Object obj, 0sL r13, int i) {
        int i2;
        r11.ExV(-1198538093);
        int i3 = i;
        Object obj2 = obj;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r11.AGw(obj)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        0sL r8 = r13;
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r11.AGw(r13)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if (r11.AGw(this)) {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1240152150, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            r11.ExW(207, obj);
            Object ECw = r11.ECw();
            Object obj3 = AnonymousClass5XT.A00;
            if (ECw == obj3) {
                AnonymousClass5Y2 r0 = this.A00;
                if (r0 == null || r0.AFI(obj)) {
                    ECw = new AnonymousClass6JC(this, obj);
                    ((C286565Wx) r11).A0Q(ECw);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type of the key ");
                    sb.append(obj);
                    sb.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            AnonymousClass6JC r3 = (AnonymousClass6JC) ECw;
            C286715Xm.A00(r11, AnonymousClass5YX.A00.A02(r3.A01), r13, (i2 & 112) | 8);
            C60340gF r2 = C60340gF.A00;
            boolean AGw = r11.AGw(this) | r11.AGw(obj) | r11.AGw(r3);
            Object ECw2 = r11.ECw();
            if (AGw || ECw2 == obj3) {
                ECw2 = new AnonymousClass9MC(3, this, obj, r3);
                r11.FLL(ECw2);
            }
            C286645Xf.A03(r11, r2, (0sP) ECw2);
            r11.ASR();
            if (0fL.A02()) {
                0fL.A00(-1803572240);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGN(i3, 3, (Object) this, (Object) r8, obj2);
        }
    }

    public AnonymousClass6I1() {
        this(new LinkedHashMap());
    }
}
