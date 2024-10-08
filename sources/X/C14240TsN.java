package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.TsN  reason: case insensitive filesystem */
public final class C14240TsN {
    public static final C14240TsN A00 = new Object();
    public static final Calendar A01 = Calendar.getInstance();
    public static final Calendar A02 = Calendar.getInstance();
    public static final TimeZone A03 = TimeZone.getTimeZone("UTC");

    public static final String A00(Context context, long j) {
        int i;
        Object[] objArr;
        0qQ.A0B(context, 0);
        int intValue = VB1.A00(new Date(), j).intValue();
        if (intValue == 0) {
            return A04("MMM d, yyyy", j);
        }
        if (intValue == 1) {
            i = 2131976950;
        } else if (intValue == 2) {
            i = 2131975440;
        } else if (intValue == 4 || intValue == 5) {
            i = 2131957421;
            objArr = new Object[]{A04("MMM d", j), A01(context, j)};
            String string = context.getString(i, objArr);
            0qQ.A07(string);
            return string;
        } else {
            throw new IllegalStateException(C66579MXk.A00(632));
        }
        objArr = new Object[]{A01(context, j)};
        String string2 = context.getString(i, objArr);
        0qQ.A07(string2);
        return string2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return "AKT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        return "PT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        return "MT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        return "HT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
        return "ET";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r1.equals(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        return "CT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r3.inDaylightTime(r6) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(com.instagram.common.session.UserSession r5, java.util.Date r6) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327593598794277(0x810fc100003a25, double:3.03705469913116E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.useDaylightTime()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.inDaylightTime(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.String r0 = "Europe/London"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "BST"
            return r1
        L_0x0034:
            java.lang.String r1 = r3.getDisplayName(r1, r4)
            if (r1 == 0) goto L_0x0041
            int r0 = r1.hashCode()
            switch(r0) {
                case 66579: goto L_0x008e;
                case 67044: goto L_0x008b;
                case 68501: goto L_0x0080;
                case 68966: goto L_0x007d;
                case 71384: goto L_0x0072;
                case 71849: goto L_0x006f;
                case 76189: goto L_0x0064;
                case 76654: goto L_0x0061;
                case 79072: goto L_0x0056;
                case 79537: goto L_0x0053;
                case 2010682: goto L_0x0048;
                case 2011147: goto L_0x0045;
                default: goto L_0x0041;
            }
        L_0x0041:
            X.0qQ.A0A(r1)
            return r1
        L_0x0045:
            java.lang.String r0 = "AKST"
            goto L_0x004a
        L_0x0048:
            java.lang.String r0 = "AKDT"
        L_0x004a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "AKT"
            return r1
        L_0x0053:
            java.lang.String r0 = "PST"
            goto L_0x0058
        L_0x0056:
            java.lang.String r0 = "PDT"
        L_0x0058:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "PT"
            return r1
        L_0x0061:
            java.lang.String r0 = "MST"
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "MDT"
        L_0x0066:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "MT"
            return r1
        L_0x006f:
            java.lang.String r0 = "HST"
            goto L_0x0074
        L_0x0072:
            java.lang.String r0 = "HDT"
        L_0x0074:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "HT"
            return r1
        L_0x007d:
            java.lang.String r0 = "EST"
            goto L_0x0082
        L_0x0080:
            java.lang.String r0 = "EDT"
        L_0x0082:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "ET"
            return r1
        L_0x008b:
            java.lang.String r0 = "CST"
            goto L_0x0090
        L_0x008e:
            java.lang.String r0 = "CDT"
        L_0x0090:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = "CT"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14240TsN.A03(com.instagram.common.session.UserSession, java.util.Date):java.lang.String");
    }

    public static final String A01(Context context, long j) {
        String str;
        Calendar calendar = A02;
        calendar.setTime(new Date(j));
        if (DateFormat.is24HourFormat(context)) {
            str = "H:mm";
        } else if (calendar.get(12) == 0) {
            str = "h a";
        } else {
            str = "h:mm a";
        }
        String format = new SimpleDateFormat(str, A05()).format(Long.valueOf(j));
        0qQ.A07(format);
        return format;
    }

    public static final String A02(Context context, UserSession userSession, long j) {
        AnonymousClass7TG.A1N(context, userSession);
        String string = context.getString(2131957453, new Object[]{A04("EE", j), A04("MMM d", j), A01(context, j), A03(userSession, new Date(j))});
        0qQ.A07(string);
        return string;
    }

    public static final String A04(String str, long j) {
        Locale A05 = A05();
        String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(A05, str), A05).format(Long.valueOf(j));
        0qQ.A07(format);
        return format;
    }

    public static final Locale A05() {
        Locale locale = AnonymousClass11c.A00().A01().A00.getConfiguration().locale;
        0qQ.A07(locale);
        return locale;
    }
}
