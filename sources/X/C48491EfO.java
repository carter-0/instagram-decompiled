package X;

import android.app.DatePickerDialog;
import android.content.Context;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.EfO  reason: case insensitive filesystem */
public abstract class C48491EfO {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        Number number;
        List list = r16.A00;
        C277014uI A0R = DbV.A0R(list, 0);
        Object obj = list.get(1);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        long A04 = ((C276544tV) obj).A04(35, 0);
        Object obj2 = list.get(2);
        if (obj2 == null) {
            number = null;
        } else {
            number = (Number) obj2;
        }
        C307786Rm r7 = r15.A03;
        if (r7 != null) {
            Context context = r7.A00;
            Calendar instance = Calendar.getInstance();
            if (number != null) {
                instance.setTimeInMillis(number.longValue() * 1000);
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(context, new FHQ(r7, r15, A0R, instance), instance.get(1), instance.get(2), DbU.A03(instance));
            datePickerDialog.getDatePicker().setMinDate(A04 * 1000);
            AnonymousClass0fN.A00(datePickerDialog);
        }
        return null;
    }
}
