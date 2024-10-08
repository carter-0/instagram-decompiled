package X;

import android.widget.DatePicker;
import java.util.GregorianCalendar;

public final class FQQ implements DatePicker.OnDateChangedListener {
    public final int A00;
    public final Object A01;

    public FQQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.A00;
        Object obj = this.A01;
        switch (i4) {
            case 0:
                C47937ENo eNo = (C47937ENo) obj;
                eNo.A00 = i3;
                eNo.A01 = i2;
                eNo.A02 = i;
                if (eNo.A03 != null) {
                    C47937ENo.A01(eNo);
                    return;
                }
                return;
            case 1:
                C47451E2x e2x = (C47451E2x) obj;
                e2x.A02.set(i, i2, i3);
                C47451E2x.A01(e2x);
                return;
            default:
                C47441E2n e2n = (C47441E2n) obj;
                GregorianCalendar gregorianCalendar = e2n.A00;
                if (gregorianCalendar == null) {
                    0qQ.A0F("selectedDate");
                    throw AnonymousClass00P.createAndThrow();
                }
                gregorianCalendar.set(i, i2, i3);
                C47441E2n.A00(e2n);
                return;
        }
    }
}
