package X;

import android.app.DatePickerDialog;
import android.content.DialogInterface;

public final class QC5 extends 0SM {
    public DatePickerDialog.OnDateSetListener A00;
    public DialogInterface.OnDismissListener A01;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        if (r4 != null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A0F(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            android.os.Bundle r4 = r0.mArguments
            androidx.fragment.app.FragmentActivity r11 = r0.getActivity()
            android.app.DatePickerDialog$OnDateSetListener r13 = r0.A00
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            if (r4 == 0) goto L_0x001f
            java.lang.String r1 = "date"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x001f
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
        L_0x001f:
            r1 = 1
            r8 = 0
            int r14 = r2.get(r1)
            r0 = 2
            int r15 = r2.get(r0)
            r0 = 5
            int r16 = r2.get(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r4 == 0) goto L_0x0051
            java.lang.String r5 = "mode"
            java.lang.String r0 = r4.getString(r5, r0)
            if (r0 == 0) goto L_0x0051
            java.lang.String r5 = r4.getString(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r0 = "CALENDAR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x0051:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x00e4
            java.lang.String r5 = "CalendarDatePickerDialog"
        L_0x0057:
            int r0 = r3.intValue()
            if (r0 == r8) goto L_0x00cf
            if (r0 == r1) goto L_0x00cf
            X.Q5G r10 = new X.Q5G
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0069:
            android.widget.DatePicker r7 = r10.getDatePicker()
            r9 = 14
            r6 = 13
            r5 = 12
            r3 = 11
            if (r4 == 0) goto L_0x00c4
            java.lang.String r1 = "minDate"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00c4
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
            r2.set(r3, r8)
            r2.set(r5, r8)
            r2.set(r6, r8)
            r2.set(r9, r8)
            long r0 = r2.getTimeInMillis()
            r7.setMinDate(r0)
        L_0x009a:
            java.lang.String r1 = "maxDate"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00c3
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
            r0 = 23
            r2.set(r3, r0)
            r0 = 59
            r2.set(r5, r0)
            r2.set(r6, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            r2.set(r9, r0)
            long r0 = r2.getTimeInMillis()
            r7.setMaxDate(r0)
        L_0x00c3:
            return r10
        L_0x00c4:
            r0 = -2208988800001(0xfffffdfdae01dbff, double:NaN)
            r7.setMinDate(r0)
            if (r4 == 0) goto L_0x00c3
            goto L_0x009a
        L_0x00cf:
            android.content.res.Resources r3 = r11.getResources()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "style"
            int r12 = r3.getIdentifier(r5, r0, r1)
            X.Q5G r10 = new X.Q5G
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0069
        L_0x00e4:
            java.lang.String r5 = "SpinnerDatePickerDialog"
            goto L_0x0057
        L_0x00e8:
            java.lang.String r0 = "SPINNER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00f4
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0051
        L_0x00f4:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0051
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QC5.A0F(android.os.Bundle):android.app.Dialog");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        QC5.super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
