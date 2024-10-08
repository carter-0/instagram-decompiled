package X;

import android.content.Context;
import android.content.res.Resources;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.7F5  reason: invalid class name */
public abstract class AnonymousClass7F5 {
    public static Boolean A00;
    public static final DateFormat A01 = new SimpleDateFormat("EEE HH:mm", AnonymousClass1Q2.A02());
    public static final DateFormat A02 = new SimpleDateFormat("EEE h:mm a", AnonymousClass1Q2.A02());
    public static final DateFormat A03 = new SimpleDateFormat("HH:mm", AnonymousClass1Q2.A02());
    public static final DateFormat A04 = new SimpleDateFormat("h:mm a", AnonymousClass1Q2.A02());
    public static final Calendar A05 = Calendar.getInstance();
    public static final Calendar A06 = Calendar.getInstance();
    public static final AnonymousClass0eM A07 = AnonymousClass0eN.A01(AnonymousClass7F7.A00);
    public static final AnonymousClass0eM A08 = AnonymousClass0eN.A01(AnonymousClass7F6.A00);
    public static final AnonymousClass0eM A09 = AnonymousClass0eN.A01(AnonymousClass7F8.A00);

    public static final String A00(Context context, long j) {
        boolean is24HourFormat;
        DateFormat dateFormat;
        StringBuilder sb;
        Resources resources;
        int i;
        AnonymousClass0eM r0;
        0qQ.A0B(C61410nE.A00, 1);
        long j2 = j / 1000;
        Calendar calendar = A06;
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = A05;
        calendar2.setTimeInMillis(j2);
        int i2 = calendar.get(2);
        int i3 = calendar2.get(2);
        int i4 = calendar.get(1) - calendar2.get(1);
        if (((Boolean) C62000qj.A02.A08.invoke()).booleanValue()) {
            is24HourFormat = true;
        } else if (((Boolean) C62000qj.A02.A06.invoke()).booleanValue()) {
            Boolean bool = A00;
            if (bool == null) {
                bool = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                A00 = bool;
            }
            is24HourFormat = 0qQ.A0K(bool, true);
        } else {
            is24HourFormat = android.text.format.DateFormat.is24HourFormat(context);
        }
        String str = "";
        if (calendar.get(1) == calendar2.get(1)) {
            int abs = Math.abs(calendar.get(6) - calendar2.get(6));
            if (abs == 0) {
                sb = new StringBuilder();
                resources = context.getResources();
                i = 2131960608;
            } else if (abs == 1) {
                sb = new StringBuilder();
                resources = context.getResources();
                i = 2131960609;
            } else if (abs < 6) {
                if (is24HourFormat) {
                    dateFormat = A01;
                } else {
                    dateFormat = A02;
                }
                return 002.A0R(str, dateFormat.format(new Date(j2)));
            }
            String string = resources.getString(i);
            0qQ.A07(string);
            sb.append(string);
            sb.append(' ');
            str = sb.toString();
            if (is24HourFormat) {
                dateFormat = A03;
            } else {
                dateFormat = A04;
            }
            return 002.A0R(str, dateFormat.format(new Date(j2)));
        } else if (i4 != 1 || i3 <= i2) {
            r0 = A09;
            dateFormat = (DateFormat) r0.getValue();
            return 002.A0R(str, dateFormat.format(new Date(j2)));
        }
        if (is24HourFormat) {
            r0 = A07;
        } else {
            r0 = A08;
        }
        dateFormat = (DateFormat) r0.getValue();
        return 002.A0R(str, dateFormat.format(new Date(j2)));
    }

    public static final String A01(Context context, long j) {
        DateFormat dateFormat;
        if (android.text.format.DateFormat.is24HourFormat(context)) {
            dateFormat = A03;
        } else {
            dateFormat = A04;
        }
        String format = dateFormat.format(new Date(j / 1000));
        0qQ.A07(format);
        return format;
    }
}
