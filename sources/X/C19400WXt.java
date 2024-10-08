package X;

import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;

/* renamed from: X.WXt  reason: case insensitive filesystem */
public final class C19400WXt implements X4D {
    public final /* synthetic */ C15369UbM A00;

    public C19400WXt(C15369UbM ubM) {
        this.A00 = ubM;
    }

    public final void Dwv(IgTimePicker igTimePicker, Calendar calendar) {
        long j;
        C15369UbM ubM = this.A00;
        if (calendar != null) {
            j = calendar.getTimeInMillis();
        } else {
            j = ubM.A00;
        }
        ubM.A00 = j;
    }
}
