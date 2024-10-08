package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

public final class I85 implements TimePickerDialog.OnTimeSetListener {
    public final int A00;
    public final Object A01;

    public I85(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        if (this.A00 != 0) {
            ((C59557JOd) this.A01).Drf((((long) i) * 3600) + (((long) i2) * 60));
        } else {
            ((0sP) this.A01).invoke(new AnonymousClass30M(AnonymousClass30M.A05(AnonymousClass30K.A03(AnonymousClass30J.HOURS, i), AnonymousClass30K.A03(AnonymousClass30J.MINUTES, i2))));
        }
    }
}
