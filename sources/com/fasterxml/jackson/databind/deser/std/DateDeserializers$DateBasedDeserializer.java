package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269674fV;
import X.C269784fg;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public abstract class DateDeserializers$DateBasedDeserializer extends StdScalarDeserializer implements C269784fg {
    public final String A00;
    public final DateFormat A01;

    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$DateBasedDeserializer.A00);
        this.A01 = dateFormat;
        this.A00 = str;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A03;
    }

    public final Date A0m(16F r6, C269674fV r7) {
        Date parse;
        DateFormat dateFormat = this.A01;
        if (dateFormat == null || !r6.A19(16L.A0J)) {
            return super.A0m(r6, r7);
        }
        String trim = r6.A1P().trim();
        if (!trim.isEmpty()) {
            synchronized (dateFormat) {
                try {
                    parse = dateFormat.parse(trim);
                } catch (ParseException unused) {
                    r7.A0e(A0H(), trim, "expected format \"%s\"", this.A00);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            return parse;
        } else if (A0f(r7, trim).intValue() != 3) {
            return null;
        } else {
            return new Date(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.text.DateFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: X.4eL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.text.SimpleDateFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.text.SimpleDateFormat} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r9, X.C269674fV r10) {
        /*
            r8 = this;
            java.lang.Class r0 = r8.A0H()
            X.4f9 r5 = r10.A02
            if (r9 == 0) goto L_0x0131
            X.4ev r0 = r9.AVO(r5, r0)
        L_0x000c:
            java.util.TimeZone r7 = r0.A02()
            java.lang.Boolean r4 = r0.A01
            java.lang.String r2 = r0.A02
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0048
            java.util.Locale r0 = r0.A04
            if (r0 != 0) goto L_0x0022
            X.4eS r0 = r5.A01
            java.util.Locale r0 = r0.A09
        L_0x0022:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r2, r0)
            if (r7 != 0) goto L_0x0031
            X.4eS r0 = r5.A01
            java.util.TimeZone r7 = r0.A0A
            if (r7 != 0) goto L_0x0031
            java.util.TimeZone r7 = X.C269024eS.A0B
        L_0x0031:
            r3.setTimeZone(r7)
            if (r4 == 0) goto L_0x003d
            boolean r0 = r4.booleanValue()
            r3.setLenient(r0)
        L_0x003d:
            r1 = r8
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer
            if (r0 == 0) goto L_0x0137
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer
            r0.<init>(r8, r2, r3)
            return r0
        L_0x0048:
            if (r7 == 0) goto L_0x00b3
            X.4eS r6 = r5.A01
            java.text.DateFormat r3 = r6.A08
            java.lang.Class r2 = r3.getClass()
            java.lang.Class<X.4eL> r1 = X.C268954eL.class
            if (r2 != r1) goto L_0x00a0
            java.util.Locale r5 = r0.A04
            if (r5 != 0) goto L_0x005c
            java.util.Locale r5 = r6.A09
        L_0x005c:
            X.4eL r3 = (X.C268954eL) r3
            java.util.TimeZone r0 = r3.A05
            if (r7 == r0) goto L_0x0073
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0073
            java.util.Locale r2 = r3.A02
            java.lang.Boolean r1 = r3.A00
            boolean r0 = r3.A01
            X.4eL r3 = new X.4eL
            r3.<init>(r1, r2, r7, r0)
        L_0x0073:
            java.util.Locale r0 = r3.A02
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0086
            java.util.TimeZone r2 = r3.A05
            java.lang.Boolean r1 = r3.A00
            boolean r0 = r3.A01
            X.4eL r3 = new X.4eL
            r3.<init>(r1, r5, r2, r0)
        L_0x0086:
            if (r4 == 0) goto L_0x009d
            java.lang.Boolean r0 = r3.A00
            if (r4 == r0) goto L_0x009d
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009d
            java.util.TimeZone r2 = r3.A05
            java.util.Locale r1 = r3.A02
            boolean r0 = r3.A01
            X.4eL r3 = new X.4eL
            r3.<init>(r4, r1, r2, r0)
        L_0x009d:
            java.lang.String r2 = r8.A00
            goto L_0x003d
        L_0x00a0:
            java.lang.Object r3 = r3.clone()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            r3.setTimeZone(r7)
            if (r4 == 0) goto L_0x009d
            boolean r0 = r4.booleanValue()
            r3.setLenient(r0)
            goto L_0x009d
        L_0x00b3:
            if (r4 == 0) goto L_0x0153
            X.4eS r0 = r5.A01
            java.text.DateFormat r3 = r0.A08
            java.lang.String r2 = r8.A00
            java.lang.Class r1 = r3.getClass()
            java.lang.Class<X.4eL> r0 = X.C268954eL.class
            if (r1 != r0) goto L_0x0119
            X.4eL r3 = (X.C268954eL) r3
            java.lang.Boolean r0 = r3.A00
            if (r4 == r0) goto L_0x00da
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00da
            java.util.TimeZone r2 = r3.A05
            java.util.Locale r1 = r3.A02
            boolean r0 = r3.A01
            X.4eL r3 = new X.4eL
            r3.<init>(r4, r1, r2, r0)
        L_0x00da:
            r0 = 100
            java.lang.StringBuilder r2 = X.Pxe.A14(r0)
            java.lang.String r0 = "[one of: '"
            r2.append(r0)
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSSX"
            r2.append(r0)
            java.lang.String r0 = "', '"
            r2.append(r0)
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r2.append(r0)
            java.lang.String r0 = "' ("
            r2.append(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "strict"
        L_0x0107:
            r2.append(r0)
            java.lang.String r0 = ")]"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r2)
        L_0x0110:
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = "[unknown]"
            goto L_0x003d
        L_0x0116:
            java.lang.String r0 = "lenient"
            goto L_0x0107
        L_0x0119:
            java.lang.Object r3 = r3.clone()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            boolean r0 = r4.booleanValue()
            r3.setLenient(r0)
            boolean r0 = r3 instanceof java.text.SimpleDateFormat
            if (r0 == 0) goto L_0x0110
            r0 = r3
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            r0.toPattern()
            goto L_0x0110
        L_0x0131:
            X.4ev r0 = r5.A00()
            goto L_0x000c
        L_0x0137:
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer
            if (r0 == 0) goto L_0x0141
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer
            r0.<init>(r8, r2, r3)
            return r0
        L_0x0141:
            boolean r0 = r8 instanceof com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer
            if (r0 == 0) goto L_0x014b
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer
            r0.<init>(r8, r2, r3)
            return r0
        L_0x014b:
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer) r1
            com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0153:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public DateDeserializers$DateBasedDeserializer(Class cls) {
        super(cls);
        this.A01 = null;
        this.A00 = null;
    }
}
