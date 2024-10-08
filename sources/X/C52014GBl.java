package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.GBl  reason: case insensitive filesystem */
public final class C52014GBl extends C14072TpM {
    public int A00 = -1;
    public int A01 = -1;
    public float A02 = -1.0f;
    public final Set A03 = DbS.A0y();

    public final void A00(int i) {
        Integer num;
        if (i == 1) {
            num = AnonymousClass05K.A01;
        } else if (i != 2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        for (AnonymousClass32U DhU : this.A03) {
            DhU.DhU(num);
        }
    }

    public final void A01(int i) {
        if (i == -1) {
            0f9 AEf = 0wj.A01.AEf("ClipsViewPagerImpl", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "onPageSelected called with position = -1");
            AEf.report();
        } else if (this.A00 != -1) {
            for (AnonymousClass32U DW8 : this.A03) {
                DW8.DW8(i, this.A00);
            }
        }
        for (AnonymousClass32U DWA : this.A03) {
            DWA.DWA(i, this.A00);
        }
        this.A01 = Math.max(this.A01, i);
        this.A00 = i;
    }

    public final void A02(int i, float f, int i2) {
        float f2 = ((float) i) + f;
        if (f2 != -1.0f && this.A02 != -1.0f) {
            Set<AnonymousClass32U> set = this.A03;
            for (AnonymousClass32U DhG : set) {
                DhG.DhG(f2, this.A02);
            }
            float f3 = this.A02;
            LinkedHashSet<Number> linkedHashSet = new LinkedHashSet<>();
            int i3 = (int) f3;
            linkedHashSet.add(Integer.valueOf(i3));
            if (f3 % 1.0f != 0.0f) {
                linkedHashSet.add(Integer.valueOf(i3 + 1));
            }
            LinkedHashSet<Number> linkedHashSet2 = new LinkedHashSet<>();
            int i4 = (int) f2;
            linkedHashSet2.add(Integer.valueOf(i4));
            if (f2 % 1.0f != 0.0f) {
                linkedHashSet2.add(Integer.valueOf(i4 + 1));
            }
            if (!linkedHashSet.equals(linkedHashSet2)) {
                for (Number intValue : linkedHashSet) {
                    int intValue2 = intValue.intValue();
                    if (!linkedHashSet2.contains(Integer.valueOf(intValue2))) {
                        for (AnonymousClass32U DW0 : set) {
                            DW0.DW0(intValue2);
                        }
                    }
                }
                for (Number intValue3 : linkedHashSet2) {
                    int intValue4 = intValue3.intValue();
                    if (!linkedHashSet.contains(Integer.valueOf(intValue4))) {
                        for (AnonymousClass32U DVz : set) {
                            DVz.DVz(intValue4);
                        }
                    }
                }
            }
        } else if (f2 == -1.0f) {
            0f9 AEf = 0wj.A01.AEf("ClipsViewPagerImpl", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "onPageScrolled called with positionOffset = -1");
            AEf.report();
        }
        this.A02 = f2;
    }
}
