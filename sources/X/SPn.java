package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class SPn {
    public static final Integer A01(String str) {
        0qQ.A0B(str, 0);
        String A12 = DbV.A12(str);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int length = A12.length();
        for (int i = 0; i < length; i++) {
            char charAt = A12.charAt(i);
            if (!Character.isDigit(charAt)) {
                break;
            }
            A1A.append(charAt);
        }
        try {
            return Pxf.A0Z(DbT.A10(A1A));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r2 = A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r2 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r1 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 < 1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 <= 12) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r5.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = 1
            X.0qQ.A0B(r6, r4)
            int r0 = r5.hashCode()
            r3 = 0
            switch(r0) {
                case -1604886767: goto L_0x0027;
                case -1502393158: goto L_0x0014;
                case -882707060: goto L_0x0010;
                case 659680675: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r6
        L_0x000d:
            java.lang.String r0 = "cc-exp-month"
            goto L_0x002a
        L_0x0010:
            java.lang.String r0 = "ml-cc-exp-year"
            goto L_0x0016
        L_0x0014:
            java.lang.String r0 = "cc-exp-year"
        L_0x0016:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000c
            java.lang.Integer r2 = A01(r6)
            if (r2 == 0) goto L_0x0040
        L_0x0022:
            java.lang.String r6 = r2.toString()
            return r6
        L_0x0027:
            java.lang.String r0 = "ml-cc-exp-month"
        L_0x002a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000c
            java.lang.Integer r2 = A01(r6)
            if (r2 == 0) goto L_0x0040
            int r1 = r2.intValue()
            if (r1 < r4) goto L_0x0040
            r0 = 12
            if (r1 <= r0) goto L_0x0022
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPn.A02(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final 0eP A03(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("MM/yyyy", AnonymousClass1Q2.A02()).parse(Pxj.A0s(str));
            if (parse != null) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                return AnonymousClass7TE.A1L(Integer.valueOf(instance.get(2) + 1), A00(Integer.valueOf(instance.get(1))));
            }
        } catch (ParseException unused) {
        }
        return null;
    }

    public static final Integer A00(Integer num) {
        if (num == null || num.intValue() >= 1000) {
            return num;
        }
        String obj = num.toString();
        int length = obj.length();
        if (!AnonymousClass7TF.A1Q(length) && length <= 2) {
            if (length == 1) {
                obj = 002.A0D(obj, '0');
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy", AnonymousClass1Q2.A02());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", AnonymousClass1Q2.A02());
            try {
                Date parse = simpleDateFormat.parse(obj);
                if (parse != null) {
                    String format = simpleDateFormat2.format(parse);
                    0qQ.A07(format);
                    return Pxf.A0Z(format);
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
