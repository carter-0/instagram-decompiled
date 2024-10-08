package X;

import android.widget.NumberPicker;

public final class WD1 implements NumberPicker.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NumberPicker A02;
    public final /* synthetic */ NumberPicker A03;
    public final /* synthetic */ 0rk A04;
    public final /* synthetic */ 0rk A05;
    public final /* synthetic */ Integer[] A06;

    public WD1(NumberPicker numberPicker, NumberPicker numberPicker2, 0rk r3, 0rk r4, Integer[] numArr, int i, int i2) {
        this.A05 = r3;
        this.A06 = numArr;
        this.A03 = numberPicker;
        this.A04 = r4;
        this.A01 = i;
        this.A02 = numberPicker2;
        this.A00 = i2;
    }

    public final void onScrollStateChange(NumberPicker numberPicker, int i) {
        0rk r6 = this.A05;
        r6.A00 = i;
        Integer[] numArr = this.A06;
        NumberPicker numberPicker2 = this.A03;
        0rk r5 = this.A04;
        int i2 = this.A01;
        NumberPicker numberPicker3 = this.A02;
        int i3 = this.A00;
        int intValue = numArr[numberPicker2.getValue()].intValue();
        if (r6.A00 == 0 && r5.A00 == 0 && intValue <= i2 && numberPicker3.getValue() < i3) {
            numberPicker3.setValue(i3);
        }
    }
}
