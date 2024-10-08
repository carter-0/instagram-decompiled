package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.EfP  reason: case insensitive filesystem */
public abstract class C48492EfP {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        String str;
        Date parse;
        List list = r15.A00;
        C277014uI A0R = DbV.A0R(list, 0);
        C276544tV r1 = (C276544tV) list.get(1);
        Object A00 = r15.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C307786Rm r6 = (C307786Rm) A00;
        if (r1 != null) {
            str = r1.A0D();
        } else {
            str = null;
        }
        Calendar instance = Calendar.getInstance();
        Context context = r6.A00;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && (parse = new SimpleDateFormat("HH:mm", Locale.US).parse(str)) != null) {
                    instance.setTime(parse);
                }
            } catch (ParseException e) {
                1Kn.A03("got wrong time format from server", e);
            }
        }
        AnonymousClass0fN.A00(new TimePickerDialog(context, new FHU(r6, r14, A0R, instance, 0), instance.get(11), instance.get(12), DateFormat.is24HourFormat(context)));
        return null;
    }
}
