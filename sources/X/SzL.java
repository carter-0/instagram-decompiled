package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

public final class SzL implements C13744TgG {
    public final int BEU() {
        return 1;
    }

    public final boolean CeD(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.CeC(j)) {
                return true;
            }
        }
        return false;
    }
}
