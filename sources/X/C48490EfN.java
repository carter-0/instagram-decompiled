package X;

import android.app.DatePickerDialog;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.EfN  reason: case insensitive filesystem */
public abstract class C48490EfN {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Date parse;
        List list = r11.A00;
        C277014uI A0R = DbV.A0R(list, 0);
        Object obj = list.get(1);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r3 = (C276544tV) obj;
        C307786Rm r1 = (C307786Rm) Dba.A0V(r11, 2);
        String A0D = r3.A0D();
        String A0F = r3.A0F();
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(r1.A00, new FHP(r1, r10, A0R, instance), instance.get(1), instance.get(2), DbU.A03(instance));
        try {
            if (!TextUtils.isEmpty(A0D)) {
                Date parse2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(A0D);
                if (parse2 != null) {
                    datePickerDialog.getDatePicker().setMinDate(parse2.getTime());
                }
            }
            if (!TextUtils.isEmpty(A0F) && (parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(A0F)) != null) {
                datePickerDialog.getDatePicker().setMaxDate(parse.getTime());
            }
        } catch (ParseException e) {
            1Kn.A03("got wrong date format from server", e);
        }
        AnonymousClass0fN.A00(datePickerDialog);
        return null;
    }
}
