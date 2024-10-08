package X;

import android.content.res.Resources;
import android.widget.NumberPicker;
import com.instagram.android.R;
import com.instagram.igds.components.datepicker.IgDatePicker;
import com.instagram.igds.components.datepicker.IgTimePicker;

public final class WD5 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WD5(C17218VMw vMw, IgDatePicker igDatePicker, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = vMw;
            this.A02 = igDatePicker;
        } else {
            this.A02 = igDatePicker;
            this.A01 = vMw;
        }
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        C17218VMw vMw;
        IgDatePicker igDatePicker;
        String str;
        Integer num;
        Object value;
        int i3;
        long j;
        switch (this.A00) {
            case 0:
                igDatePicker = (IgDatePicker) this.A02;
                IgDatePicker.A01(igDatePicker, i2);
                vMw = (C17218VMw) this.A01;
                break;
            case 1:
                vMw = (C17218VMw) this.A01;
                igDatePicker = (IgDatePicker) this.A02;
                break;
            case 2:
                IgTimePicker igTimePicker = (IgTimePicker) this.A02;
                ((X4D) this.A01).Dwv(igTimePicker, igTimePicker.getSelectedTime());
                return;
            case 3:
                UZC uzc = (UZC) this.A02;
                uzc.A00 = i2 + 1;
                NumberPicker numberPicker2 = (NumberPicker) this.A01;
                numberPicker2.setDisplayedValues((String[]) null);
                numberPicker2.setMinValue(0);
                numberPicker2.setMaxValue(1);
                numberPicker2.setDisplayedValues(UZC.A01(uzc));
                UZC.A00(uzc);
                return;
            default:
                K4R k4r = (K4R) this.A02;
                AnonymousClass0eM r6 = k4r.A04;
                C60251Ji8 ji8 = (C60251Ji8) r6.getValue();
                if (i2 == 0) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                05G r8 = ji8.A03;
                do {
                    value = r8.getValue();
                    C60922Jtg jtg = (C60922Jtg) value;
                    i3 = jtg.A00;
                    j = jtg.A01;
                    0qQ.A0B(num, 0);
                } while (!r8.AIY(value, new C60922Jtg(num, i3, j)));
                C60922Jtg jtg2 = (C60922Jtg) this.A01;
                K4R.A00(k4r, jtg2.A02, true);
                int i4 = jtg2.A00;
                NumberPicker numberPicker3 = k4r.A00;
                if (numberPicker3 == null) {
                    str = "durationPicker";
                    break;
                } else {
                    numberPicker3.setDisplayedValues((String[]) null);
                    numberPicker3.setMinValue(0);
                    numberPicker3.setMaxValue(1);
                    Resources A05 = DbV.A05(k4r);
                    Integer valueOf = Integer.valueOf(i4);
                    numberPicker3.setDisplayedValues(new String[]{DbV.A0v(A05, valueOf, R.plurals.limits_plus_reminder_day_unit, i4), DbV.A0v(DbV.A05(k4r), valueOf, R.plurals.limits_plus_reminder_week_unit, i4)});
                    ((C60251Ji8) r6.getValue()).A00();
                    return;
                }
        }
        NumberPicker numberPicker4 = igDatePicker.A01;
        if (numberPicker4 == null) {
            str = "monthPicker";
        } else {
            int value2 = numberPicker4.getValue();
            NumberPicker numberPicker5 = igDatePicker.A00;
            if (numberPicker5 == null) {
                str = "dayPicker";
            } else {
                C15365UbI.A00(vMw.A00, value2, numberPicker5.getValue());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public WD5(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
