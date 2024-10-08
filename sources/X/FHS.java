package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

public final class FHS implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ G6M A00;
    public final /* synthetic */ ESZ A01;

    public FHS(G6M g6m, ESZ esz) {
        this.A01 = esz;
        this.A00 = g6m;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.A00.Drg(002.A0P(":", i, i2));
    }
}
