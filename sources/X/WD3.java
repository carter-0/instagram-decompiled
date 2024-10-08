package X;

import android.widget.NumberPicker;

public final class WD3 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WD3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        int i3;
        switch (this.A00) {
            case 0:
                VKU.A00 = i2;
                C308276Tl r1 = new C308276Tl();
                r1.A01(Integer.valueOf(i2 + 1));
                AnonymousClass6Tm A002 = r1.A00();
                C307886Rw.A03((C307786Rm) this.A01, (C276544tV) this.A02, A002, (C277014uI) this.A03);
                return;
            case 1:
                C276544tV r4 = (C276544tV) this.A02;
                C308276Tl A0T = DbU.A0T(r4);
                A0T.A02(Integer.valueOf(i));
                A0T.A03(Integer.valueOf(i2), 2);
                C307786Rm r12 = (C307786Rm) this.A01;
                A0T.A03(r12, 3);
                DbT.A1R(r12, r4, A0T, (C277014uI) this.A03);
                return;
            default:
                UZC uzc = (UZC) this.A03;
                boolean A1Q = AnonymousClass7TF.A1Q(i2);
                uzc.A03 = A1Q;
                NumberPicker numberPicker2 = (NumberPicker) this.A02;
                numberPicker2.setDisplayedValues((String[]) null);
                int i4 = 4;
                if (A1Q) {
                    i4 = 6;
                }
                int i5 = 0;
                numberPicker2.setMinValue(0);
                numberPicker2.setMaxValue(i4 - 1);
                String[] strArr = new String[i4];
                do {
                    i3 = i5 + 1;
                    strArr[i5] = String.valueOf(i3);
                    i5 = i3;
                } while (i3 < i4);
                numberPicker2.setDisplayedValues(strArr);
                uzc.A00 = numberPicker2.getValue() + 1;
                NumberPicker numberPicker3 = (NumberPicker) this.A01;
                numberPicker3.setDisplayedValues((String[]) null);
                numberPicker3.setMinValue(0);
                numberPicker3.setMaxValue(1);
                numberPicker3.setDisplayedValues(UZC.A01(uzc));
                UZC.A00(uzc);
                return;
        }
    }
}
