package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.F3y  reason: case insensitive filesystem */
public abstract class C49733F3y {
    public static long A00(Long l, String str) {
        Calendar instance;
        if (str != null) {
            instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        } else {
            instance = Calendar.getInstance();
        }
        instance.setTimeInMillis(l.longValue() * 1000);
        int i = instance.get(1);
        int A06 = DbZ.A06(instance);
        int A03 = DbU.A03(instance);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(i, A06, A03);
        return instance2.getTimeInMillis();
    }

    public static void A01(Context context, C307786Rm r9, C307896Rx r10, C277014uI r11, C277014uI r12, Calendar calendar, boolean z) {
        int i = R.style.CdsSpinnerTimePickerDialogLight;
        if (z) {
            i = R.style.CdsSpinnerTimePickerDialogDark;
        }
        Context context2 = context;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context2, i, new FHT(r10, r11, calendar), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(AnonymousClass7TE.A16(context2, 2131975385));
        timePickerDialog.setButton(-1, AnonymousClass7TE.A16(context2, 2131957433), timePickerDialog);
        if (r12 != null) {
            timePickerDialog.setOnCancelListener(new FHY(1, r9, r10, r12));
        }
        AnonymousClass0fN.A00(timePickerDialog);
    }
}
