package X;

/* renamed from: X.EeD  reason: case insensitive filesystem */
public abstract class C48418EeD {
    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Object, X.Ebt] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Unexpected picker mode: ");
        r1.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
        X.1Kn.A02("CDSDateTimePickerUtils", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        r0 = r4.A05;
        r13 = r11.equals("wheels");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00db, code lost:
        if (r13 != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        if (r11.equals("calendar") != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Unexpected date picker style: ");
        r1.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        r28 = com.instagram.android.R.style.CdsCalendarDatePickerDialogLight;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0104, code lost:
        if (r0 == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        r28 = com.instagram.android.R.style.CdsCalendarDatePickerDialogDark;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        r28 = com.instagram.android.R.style.CdsSpinnerDatePickerDialogLight;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        if (r0 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        r28 = com.instagram.android.R.style.CdsSpinnerDatePickerDialogDark;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        if (r6 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        java.util.TimeZone.getTimeZone(r6).getDisplayName(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        java.util.Locale.getDefault().getLanguage();
        r26 = new android.app.DatePickerDialog(r2, r28, new X.FHR(r2, r20, r4, r15, r10, r3, r7, r26, r0), r7.get(1), r7.get(2), X.DbU.A03(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0151, code lost:
        if (r13 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        if ("com.facebook.stella.app.StellaApplication".equals(r2.getApplicationInfo().name) != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0161, code lost:
        r26.getDatePicker().setDescendantFocusability(393216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016a, code lost:
        if (r8 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016c, code lost:
        r26.getDatePicker().setMinDate(X.C49733F3y.A00(r8, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0177, code lost:
        if (r5 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        r26.getDatePicker().setMaxDate(X.C49733F3y.A00(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        if (r12 == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0186, code lost:
        r26.setTitle(X.AnonymousClass7TE.A16(r2, 2131957429));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0190, code lost:
        r26.setButton(-1, X.AnonymousClass7TE.A16(r2, 2131957433), r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019b, code lost:
        if (r3 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019d, code lost:
        r26.setOnCancelListener(new X.FHY(0, r4, r15, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a6, code lost:
        X.AnonymousClass0fN.A00(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a9, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r31, X.AnonymousClass6Tm r32) {
        /*
            r1 = r32
            java.lang.Object r0 = r1.A01()
            X.4zw r0 = (X.C280064zw) r0
            X.4uI r10 = r0.A00
            java.lang.Object r7 = r1.A02()
            X.4tV r7 = (X.C276544tV) r7
            r9 = 2
            java.lang.Object r4 = X.Dba.A0V(r1, r9)
            X.6Rm r4 = (X.C307786Rm) r4
            r0 = 3
            java.util.List r3 = r1.A00
            java.lang.Object r1 = r3.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 4
            java.lang.String r6 = X.DbU.A0t(r3, r0)
            r0 = 5
            java.lang.Object r5 = r3.get(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            r0 = 6
            java.lang.Object r2 = r3.get(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 7
            X.4uI r3 = X.DbV.A0R(r3, r0)
            X.Ebt r20 = new X.Ebt
            r20.<init>()
            r17 = 0
            if (r1 == 0) goto L_0x00fd
            long r0 = r1.longValue()
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
        L_0x0049:
            if (r5 == 0) goto L_0x00f9
            long r0 = r5.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x0053:
            if (r2 == 0) goto L_0x00f5
            long r0 = r2.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x005d:
            android.content.Context r2 = r4.A00
            java.lang.String r14 = "date"
            r13 = r14
            java.lang.String r0 = r7.A0F()
            if (r0 == 0) goto L_0x0069
            r13 = r0
        L_0x0069:
            java.lang.String r12 = "calendar"
            java.lang.String r11 = X.DbV.A10(r7, r12)
            if (r6 == 0) goto L_0x00f0
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r6)
            java.util.Calendar r7 = java.util.Calendar.getInstance(r0)
        L_0x0079:
            if (r15 == 0) goto L_0x0085
            long r0 = r15.longValue()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r15
            r7.setTimeInMillis(r0)
        L_0x0085:
            int r0 = r13.hashCode()
            r15 = r31
            switch(r0) {
                case -1160567386: goto L_0x00c9;
                case 3076014: goto L_0x00c0;
                case 3560141: goto L_0x00a4;
                default: goto L_0x008e;
            }
        L_0x008e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected picker mode: "
            r1.append(r0)
            r1.append(r13)
        L_0x009a:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CDSDateTimePickerUtils"
            X.1Kn.A02(r0, r1)
            return r17
        L_0x00a4:
            java.lang.String r0 = "time"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x008e
            boolean r0 = r4.A05
            r18 = r2
            r19 = r4
            r20 = r15
            r21 = r10
            r22 = r3
            r23 = r7
            r24 = r0
            X.C49733F3y.A01(r18, r19, r20, r21, r22, r23, r24)
            return r17
        L_0x00c0:
            boolean r0 = r13.equals(r14)
            if (r0 == 0) goto L_0x008e
            r26 = 0
            goto L_0x00d3
        L_0x00c9:
            java.lang.String r0 = "date_and_time"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x008e
            r26 = 1
        L_0x00d3:
            boolean r0 = r4.A05
            java.lang.String r1 = "wheels"
            boolean r13 = r11.equals(r1)
            if (r13 != 0) goto L_0x010b
            boolean r1 = r11.equals(r12)
            if (r1 != 0) goto L_0x0101
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected date picker style: "
            r1.append(r0)
            r1.append(r11)
            goto L_0x009a
        L_0x00f0:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            goto L_0x0079
        L_0x00f5:
            r5 = r17
            goto L_0x005d
        L_0x00f9:
            r8 = r17
            goto L_0x0053
        L_0x00fd:
            r15 = r17
            goto L_0x0049
        L_0x0101:
            r28 = 2132017454(0x7f14012e, float:1.9673187E38)
            if (r0 == 0) goto L_0x0109
            r28 = 2132017453(0x7f14012d, float:1.9673185E38)
        L_0x0109:
            r12 = 0
            goto L_0x0114
        L_0x010b:
            r28 = 2132017461(0x7f140135, float:1.9673201E38)
            if (r0 == 0) goto L_0x0113
            r28 = 2132017460(0x7f140134, float:1.96732E38)
        L_0x0113:
            r12 = 1
        L_0x0114:
            if (r6 == 0) goto L_0x011f
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r6)
            java.util.Locale r1 = java.util.Locale.US
            r11.getDisplayName(r1)
        L_0x011f:
            java.util.Locale r1 = java.util.Locale.getDefault()
            r1.getLanguage()
            r1 = 1
            X.FHR r18 = new X.FHR
            r21 = r4
            r22 = r15
            r23 = r10
            r24 = r3
            r25 = r7
            r27 = r0
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r30 = r7.get(r1)
            int r31 = r7.get(r9)
            int r32 = X.DbU.A03(r7)
            android.app.DatePickerDialog r7 = new android.app.DatePickerDialog
            r27 = r2
            r29 = r18
            r26 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32)
            if (r13 == 0) goto L_0x016a
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            java.lang.String r1 = r0.name
            java.lang.String r0 = "com.facebook.stella.app.StellaApplication"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016a
            android.widget.DatePicker r1 = r7.getDatePicker()
            r0 = 393216(0x60000, float:5.51013E-40)
            r1.setDescendantFocusability(r0)
        L_0x016a:
            if (r8 == 0) goto L_0x0177
            android.widget.DatePicker r9 = r7.getDatePicker()
            long r0 = X.C49733F3y.A00(r8, r6)
            r9.setMinDate(r0)
        L_0x0177:
            if (r5 == 0) goto L_0x0184
            android.widget.DatePicker r8 = r7.getDatePicker()
            long r0 = X.C49733F3y.A00(r5, r6)
            r8.setMaxDate(r0)
        L_0x0184:
            if (r12 == 0) goto L_0x0190
            r0 = 2131957429(0x7f1316b5, float:1.9551442E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            r7.setTitle(r0)
        L_0x0190:
            r1 = -1
            r0 = 2131957433(0x7f1316b9, float:1.955145E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            r7.setButton(r1, r0, r7)
            if (r3 == 0) goto L_0x01a6
            r1 = 0
            X.FHY r0 = new X.FHY
            r0.<init>(r1, r4, r15, r3)
            r7.setOnCancelListener(r0)
        L_0x01a6:
            X.AnonymousClass0fN.A00(r7)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48418EeD.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
