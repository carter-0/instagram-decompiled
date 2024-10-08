package X;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.4eL  reason: invalid class name and case insensitive filesystem */
public final class C268954eL extends DateFormat {
    public static final C268954eL A06 = new C268954eL();
    public static final DateFormat A07;
    public static final Calendar A08;
    public static final Locale A09;
    public static final TimeZone A0A;
    public static final Pattern A0B = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
    public static final Pattern A0C = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final String[] A0D = {"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    public Boolean A00;
    public boolean A01;
    public final Locale A02;
    public transient DateFormat A03;
    public transient Calendar A04;
    public transient TimeZone A05;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    static {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            A0A = timeZone;
            Locale locale = Locale.US;
            A09 = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            A07 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            A08 = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void A01(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024a, code lost:
        if (r1 < 0) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024c, code lost:
        if (r4 != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0227, code lost:
        if (r6 != null) goto L_0x020e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Date A02(java.lang.String r23, java.text.ParsePosition r24) {
        /*
            r22 = this;
            r7 = r23
            int r1 = r7.length()
            r4 = 0
            r0 = 7
            if (r1 < r0) goto L_0x0034
            char r0 = r7.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 4
            char r2 = r7.charAt(r0)
            r0 = 45
            if (r2 != r0) goto L_0x0034
            r0 = 5
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r4 = 1
        L_0x0034:
            r8 = r22
            r3 = r24
            if (r4 == 0) goto L_0x01d8
            java.util.TimeZone r4 = A0A     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.util.TimeZone r0 = r8.A05     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r0 == 0) goto L_0x004c
            r2 = 90
            int r0 = r1 + -1
            char r0 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r2 == r0) goto L_0x004c
            java.util.TimeZone r4 = r8.A05     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x004c:
            java.util.Calendar r15 = r8.A04     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r15 != 0) goto L_0x005a
            java.util.Calendar r0 = A08     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.Object r15 = r0.clone()     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.util.Calendar r15 = (java.util.Calendar) r15     // Catch:{ IllegalArgumentException -> 0x01bf }
            r8.A04 = r15     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x005a:
            java.util.TimeZone r0 = r15.getTimeZone()     // Catch:{ IllegalArgumentException -> 0x01bf }
            boolean r0 = r0.equals(r4)     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r0 != 0) goto L_0x0067
            r15.setTimeZone(r4)     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x0067:
            boolean r0 = r8.isLenient()     // Catch:{ IllegalArgumentException -> 0x01bf }
            r15.setLenient(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r15.clear()     // Catch:{ IllegalArgumentException -> 0x01bf }
            r11 = 8
            r5 = 10
            r13 = 5
            r4 = 14
            r0 = 2
            r2 = 0
            r6 = 1
            if (r1 > r5) goto L_0x00c2
            java.util.regex.Pattern r1 = A0C     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.util.regex.Matcher r1 = r1.matcher(r7)     // Catch:{ IllegalArgumentException -> 0x01bf }
            boolean r1 = r1.matches()     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r1 == 0) goto L_0x0193
            char r1 = r7.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r1 = r1 + -48
            int r1 = r1 * 1000
            char r5 = r7.charAt(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r5 = r5 + -48
            int r5 = r5 * 100
            int r1 = r1 + r5
            char r0 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r0 = r0 + -48
            int r0 = r0 * 10
            int r1 = r1 + r0
            r0 = 3
            char r0 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r0 = r0 + -48
            int r1 = r1 + r0
            int r0 = A00(r7, r13)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r17 = r0 + -1
            int r18 = A00(r7, r11)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r19 = r2
            r20 = r2
            r21 = r2
            r16 = r1
            r15.set(r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalArgumentException -> 0x01bf }
            goto L_0x0188
        L_0x00c2:
            java.util.regex.Pattern r5 = A0B     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.util.regex.Matcher r9 = r5.matcher(r7)     // Catch:{ IllegalArgumentException -> 0x01bf }
            boolean r5 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r5 == 0) goto L_0x0190
            int r8 = r9.start(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r12 = r9.end(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r5 = r12 - r8
            r10 = 16
            if (r5 <= r6) goto L_0x0102
            int r14 = r8 + 1
            int r14 = A00(r7, r14)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r14 = r14 * 3600
            if (r5 < r13) goto L_0x00ee
            int r12 = r12 - r0
            int r5 = A00(r7, r12)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r5 = r5 * 60
            int r14 = r14 + r5
        L_0x00ee:
            char r12 = r7.charAt(r8)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r5 = 45
            int r8 = r14 * 1000
            if (r12 != r5) goto L_0x00fa
            int r8 = r14 * -1000
        L_0x00fa:
            r5 = 15
            r15.set(r5, r8)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r15.set(r10, r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x0102:
            char r5 = r7.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r5 = r5 + -48
            int r5 = r5 * 1000
            char r8 = r7.charAt(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r8 = r8 + -48
            int r8 = r8 * 100
            int r5 = r5 + r8
            char r8 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r8 = r8 + -48
            int r8 = r8 * 10
            int r5 = r5 + r8
            r8 = 3
            char r12 = r7.charAt(r8)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r12 = r12 + -48
            int r5 = r5 + r12
            int r12 = A00(r7, r13)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r17 = r12 + -1
            int r18 = A00(r7, r11)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r11 = 11
            int r19 = A00(r7, r11)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r20 = A00(r7, r4)     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r1 <= r10) goto L_0x015a
            char r10 = r7.charAt(r10)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1 = 58
            if (r10 != r1) goto L_0x015a
            r1 = 17
            int r21 = A00(r7, r1)     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x0148:
            r16 = r5
            r15.set(r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r1 = r9.start(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r5 = r1 + 1
            int r1 = r9.end(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            if (r5 >= r1) goto L_0x0188
            goto L_0x015d
        L_0x015a:
            r21 = 0
            goto L_0x0148
        L_0x015d:
            int r1 = r1 - r5
            if (r1 == 0) goto L_0x0188
            if (r1 == r6) goto L_0x017f
            if (r1 == r0) goto L_0x0174
            if (r1 == r8) goto L_0x016b
            r0 = 9
            if (r1 <= r0) goto L_0x016b
            goto L_0x01a7
        L_0x016b:
            int r0 = r5 + 2
            char r0 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r0 = r0 + -48
            int r2 = r2 + r0
        L_0x0174:
            int r0 = r5 + 1
            char r0 = r7.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r0 = r0 + -48
            int r0 = r0 * 10
            int r2 = r2 + r0
        L_0x017f:
            char r0 = r7.charAt(r5)     // Catch:{ IllegalArgumentException -> 0x01bf }
            int r0 = r0 + -48
            int r0 = r0 * 100
            int r2 = r2 + r0
        L_0x0188:
            r15.set(r4, r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.util.Date r2 = r15.getTime()     // Catch:{ IllegalArgumentException -> 0x01bf }
            return r2
        L_0x0190:
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSSX"
            goto L_0x0195
        L_0x0193:
            java.lang.String r1 = "yyyy-MM-dd"
        L_0x0195:
            java.lang.Boolean r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r0}     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.String r0 = "Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.text.ParseException r1 = new java.text.ParseException     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1.<init>(r0, r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
            goto L_0x01be
        L_0x01a7:
            java.lang.String r0 = r9.group(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.String r0 = r0.substring(r6)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r0}     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.String r0 = "Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.text.ParseException r1 = new java.text.ParseException     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1.<init>(r0, r5)     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x01be:
            throw r1     // Catch:{ IllegalArgumentException -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r0}
            java.lang.String r0 = "Cannot parse date \"%s\", problem: %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            int r1 = r3.getErrorIndex()
            java.text.ParseException r0 = new java.text.ParseException
            r0.<init>(r2, r1)
            throw r0
        L_0x01d8:
            r5 = r1
        L_0x01d9:
            int r5 = r5 + -1
            r4 = 45
            if (r5 < 0) goto L_0x022a
            char r2 = r7.charAt(r5)
            r0 = 48
            if (r2 < r0) goto L_0x01eb
            r0 = 57
            if (r2 <= r0) goto L_0x01d9
        L_0x01eb:
            if (r5 > 0) goto L_0x01ef
            if (r2 == r4) goto L_0x01d9
        L_0x01ef:
            java.text.DateFormat r1 = r8.A03
            if (r1 != 0) goto L_0x021c
            java.text.DateFormat r1 = A07
            java.util.TimeZone r6 = r8.A05
            java.util.Locale r5 = r8.A02
            java.lang.Boolean r4 = r8.A00
            java.lang.String r2 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.util.Locale r0 = A09
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0221
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r5)
            if (r6 != 0) goto L_0x020e
            java.util.TimeZone r6 = A0A
        L_0x020e:
            r1.setTimeZone(r6)
        L_0x0211:
            if (r4 == 0) goto L_0x021a
            boolean r0 = r4.booleanValue()
            r1.setLenient(r0)
        L_0x021a:
            r8.A03 = r1
        L_0x021c:
            java.util.Date r2 = r1.parse(r7, r3)
            return r2
        L_0x0221:
            java.lang.Object r1 = r1.clone()
            java.text.DateFormat r1 = (java.text.DateFormat) r1
            if (r6 == 0) goto L_0x0211
            goto L_0x020e
        L_0x022a:
            r0 = 0
            char r0 = r7.charAt(r0)
            if (r0 == r4) goto L_0x0254
            java.lang.String r6 = X.16T.A00
            int r5 = r6.length()
            r4 = 1
            if (r1 < r5) goto L_0x024c
            if (r1 > r5) goto L_0x0252
            r2 = 0
        L_0x023d:
            if (r2 >= r5) goto L_0x024c
            char r1 = r7.charAt(r2)
            char r0 = r6.charAt(r2)
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x024f
            if (r1 >= 0) goto L_0x0252
        L_0x024c:
            if (r4 == 0) goto L_0x01ef
            goto L_0x0254
        L_0x024f:
            int r2 = r2 + 1
            goto L_0x023d
        L_0x0252:
            r4 = 0
            goto L_0x024c
        L_0x0254:
            long r0 = X.16T.A04(r7)     // Catch:{ NumberFormatException -> 0x025e }
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
        L_0x025e:
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "Timestamp value %s out of 64-bit value range"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            int r1 = r3.getErrorIndex()
            java.text.ParseException r0 = new java.text.ParseException
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268954eL.A02(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        TimeZone timeZone = this.A05;
        return new C268954eL(this.A00, this.A02, timeZone, this.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.StringBuffer format(java.util.Date r8, java.lang.StringBuffer r9, java.text.FieldPosition r10) {
        /*
            r7 = this;
            java.util.TimeZone r2 = r7.A05
            if (r2 != 0) goto L_0x0006
            java.util.TimeZone r2 = A0A
        L_0x0006:
            java.util.Calendar r5 = r7.A04
            if (r5 != 0) goto L_0x0014
            java.util.Calendar r0 = A08
            java.lang.Object r5 = r0.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r7.A04 = r5
        L_0x0014:
            java.util.TimeZone r0 = r5.getTimeZone()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0021
            r5.setTimeZone(r2)
        L_0x0021:
            boolean r0 = r7.isLenient()
            r5.setLenient(r0)
            r5.setTime(r8)
            r0 = 1
            int r4 = r5.get(r0)
            r0 = 0
            int r0 = r5.get(r0)
            r3 = 43
            if (r0 != 0) goto L_0x00d4
            r0 = 1
            if (r4 != r0) goto L_0x00dc
            java.lang.String r0 = "+0000"
            r9.append(r0)
        L_0x0041:
            r1 = 45
            r9.append(r1)
            r0 = 2
            int r0 = r5.get(r0)
            int r0 = r0 + 1
            A01(r9, r0)
            r9.append(r1)
            r0 = 5
            int r0 = r5.get(r0)
            A01(r9, r0)
            r0 = 84
            r9.append(r0)
            r0 = 11
            int r0 = r5.get(r0)
            A01(r9, r0)
            r4 = 58
            r9.append(r4)
            r0 = 12
            int r0 = r5.get(r0)
            A01(r9, r0)
            r9.append(r4)
            r0 = 13
            int r0 = r5.get(r0)
            A01(r9, r0)
            r0 = 46
            r9.append(r0)
            r0 = 14
            int r6 = r5.get(r0)
            int r1 = r6 / 100
            if (r1 != 0) goto L_0x00ca
            r0 = 48
            r9.append(r0)
        L_0x0097:
            A01(r9, r6)
            long r0 = r5.getTimeInMillis()
            int r5 = r2.getOffset(r0)
            if (r5 == 0) goto L_0x0102
            r0 = 60000(0xea60, float:8.4078E-41)
            int r1 = r5 / r0
            int r0 = r1 / 60
            int r2 = java.lang.Math.abs(r0)
            int r0 = r1 % 60
            int r1 = java.lang.Math.abs(r0)
            if (r5 >= 0) goto L_0x00b9
            r3 = 45
        L_0x00b9:
            r9.append(r3)
            A01(r9, r2)
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00c6
            r9.append(r4)
        L_0x00c6:
            A01(r9, r1)
            return r9
        L_0x00ca:
            int r0 = r1 + 48
            char r0 = (char) r0
            r9.append(r0)
            int r0 = r1 * 100
            int r6 = r6 - r0
            goto L_0x0097
        L_0x00d4:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r4 <= r0) goto L_0x00e2
            r9.append(r3)
            goto L_0x00e2
        L_0x00dc:
            int r4 = r4 - r0
            r0 = 45
            r9.append(r0)
        L_0x00e2:
            int r1 = r4 / 100
            if (r1 != 0) goto L_0x00f3
            r0 = 48
            r9.append(r0)
            r9.append(r0)
        L_0x00ee:
            A01(r9, r4)
            goto L_0x0041
        L_0x00f3:
            r0 = 99
            if (r1 <= r0) goto L_0x00fe
            r9.append(r1)
        L_0x00fa:
            int r0 = r1 * 100
            int r4 = r4 - r0
            goto L_0x00ee
        L_0x00fe:
            A01(r9, r1)
            goto L_0x00fa
        L_0x0102:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = "+00:00"
        L_0x0108:
            r9.append(r0)
            return r9
        L_0x010c:
            java.lang.String r0 = "+0000"
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268954eL.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition):java.lang.StringBuffer");
    }

    public final TimeZone getTimeZone() {
        return this.A05;
    }

    public final boolean isLenient() {
        Boolean bool = this.A00;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.A05)) {
            this.A03 = null;
            this.A05 = timeZone;
        }
    }

    public C268954eL(Boolean bool, Locale locale, TimeZone timeZone, boolean z) {
        this.A05 = timeZone;
        this.A02 = locale;
        this.A00 = bool;
        this.A01 = z;
    }

    public static int A00(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date A022 = A02(trim, parsePosition);
        if (A022 != null) {
            return A022;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : A0D) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb.toString()}), parsePosition.getErrorIndex());
    }

    public final void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this.A00;
        if (valueOf == bool) {
            return;
        }
        if (valueOf == null || !valueOf.equals(bool)) {
            this.A00 = valueOf;
            this.A03 = null;
        }
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{getClass().getName(), this.A05, this.A02, this.A00});
    }

    public C268954eL() {
        this.A01 = true;
        this.A02 = A09;
    }

    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return A02(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
