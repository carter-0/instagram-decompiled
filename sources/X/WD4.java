package X;

import android.widget.NumberPicker;

public final class WD4 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public WD4(NumberPicker numberPicker, NumberPicker numberPicker2, 0rk r3, 0rk r4, Integer[] numArr, int i, int i2, int i3) {
        this.A00 = i3;
        this.A07 = numArr;
        this.A05 = numberPicker;
        this.A06 = r3;
        this.A04 = r4;
        this.A02 = i;
        this.A03 = numberPicker2;
        this.A01 = i2;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        0rk r5 = (0rk) this.A04;
        int i3 = this.A02;
        NumberPicker numberPicker2 = (NumberPicker) this.A03;
        int i4 = this.A01;
        int intValue = ((Integer[]) this.A07)[((NumberPicker) this.A05).getValue()].intValue();
        if (((0rk) this.A06).A00 == 0 && r5.A00 == 0 && intValue <= i3 && numberPicker2.getValue() < i4) {
            numberPicker2.setValue(i4);
        }
    }
}
