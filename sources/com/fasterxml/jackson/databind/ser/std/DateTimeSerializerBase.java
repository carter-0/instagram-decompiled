package com.fasterxml.jackson.databind.ser.std;

import X.002;
import X.17Z;
import X.1FH;
import X.C269294et;
import X.C269424f6;
import X.C269504fE;
import X.C269714fZ;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DateTimeSerializerBase extends StdScalarSerializer implements C269714fZ {
    public final DateFormat A00;
    public final Boolean A01;
    public final AtomicReference A02;

    public DateTimeSerializerBase A0E(Boolean bool, DateFormat dateFormat) {
        if (this instanceof DateSerializer) {
            return new DateTimeSerializerBase(bool, Date.class, dateFormat);
        }
        return new DateTimeSerializerBase(bool, Calendar.class, dateFormat);
    }

    public final void A0F(17Z r5, C269504fE r6, Date date) {
        DateFormat dateFormat = this.A00;
        if (dateFormat == null) {
            C269424f6 r0 = C269424f6.WRITE_DATES_AS_TIMESTAMPS;
            C269294et r1 = r6.A05;
            if (r1.A0D(r0)) {
                r5.A0h(date.getTime());
                return;
            }
            DateFormat dateFormat2 = r6.A03;
            if (dateFormat2 == null) {
                dateFormat2 = (DateFormat) r1.A01.A08.clone();
                r6.A03 = dateFormat2;
            }
            r5.A0t(dateFormat2.format(date));
            return;
        }
        AtomicReference atomicReference = this.A02;
        DateFormat dateFormat3 = (DateFormat) atomicReference.getAndSet((Object) null);
        if (dateFormat3 == null) {
            dateFormat3 = (DateFormat) dateFormat.clone();
        }
        r5.A0t(dateFormat3.format(date));
        1FH.A00((Object) null, dateFormat3, atomicReference);
    }

    public final boolean A0G(C269504fE r3) {
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.A00 != null) {
            return false;
        }
        if (r3 != null) {
            return r3.A05.A0D(C269424f6.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException(002.A0R("Null SerializerProvider passed for ", this.A00.getName()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a7, code lost:
        if (r0.isEmpty() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0101, code lost:
        if (r0 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r9, X.C269504fE r10) {
        /*
            r8 = this;
            java.lang.Class r2 = r8.A00
            X.4ev r3 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r9, r10, r2)
            if (r3 == 0) goto L_0x010c
            X.4ew r7 = r3.A00
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x0018
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 0
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase r0 = r8.A0E(r1, r0)
            return r0
        L_0x0018:
            java.lang.String r1 = r3.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0056
            java.util.Locale r0 = r3.A04
            if (r0 != 0) goto L_0x002a
            X.4et r0 = r10.A05
            X.4eS r0 = r0.A01
            java.util.Locale r0 = r0.A09
        L_0x002a:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            r4.<init>(r1, r0)
            java.util.TimeZone r0 = r3.A06
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004b
        L_0x003d:
            java.util.TimeZone r1 = r3.A02()
        L_0x0041:
            r4.setTimeZone(r1)
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase r0 = r8.A0E(r0, r4)
            return r0
        L_0x004b:
            X.4et r0 = r10.A05
            X.4eS r0 = r0.A01
            java.util.TimeZone r1 = r0.A0A
            if (r1 != 0) goto L_0x0041
            java.util.TimeZone r1 = X.C269024eS.A0B
            goto L_0x0041
        L_0x0056:
            java.util.Locale r5 = r3.A04
            r6 = 0
            if (r5 == 0) goto L_0x005c
            r6 = 1
        L_0x005c:
            java.util.TimeZone r0 = r3.A06
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0078
        L_0x006a:
            r4 = 1
        L_0x006b:
            X.4ew r1 = X.C269324ew.STRING
            r0 = 0
            if (r7 != r1) goto L_0x0071
            r0 = 1
        L_0x0071:
            if (r6 != 0) goto L_0x007a
            if (r4 != 0) goto L_0x007a
            if (r0 != 0) goto L_0x007a
            return r8
        L_0x0078:
            r4 = 0
            goto L_0x006b
        L_0x007a:
            X.4et r0 = r10.A05
            X.4eS r0 = r0.A01
            java.text.DateFormat r4 = r0.A08
            boolean r0 = r4 instanceof X.C268954eL
            if (r0 == 0) goto L_0x00c8
            X.4eL r4 = (X.C268954eL) r4
            if (r6 == 0) goto L_0x009b
            java.util.Locale r0 = r4.A02
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.util.TimeZone r2 = r4.A05
            java.lang.Boolean r1 = r4.A00
            boolean r0 = r4.A01
            X.4eL r4 = new X.4eL
            r4.<init>(r1, r5, r2, r0)
        L_0x009b:
            java.util.TimeZone r0 = r3.A06
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0044
        L_0x00a9:
            java.util.TimeZone r3 = r3.A02()
            if (r3 != 0) goto L_0x00b1
            java.util.TimeZone r3 = X.C268954eL.A0A
        L_0x00b1:
            java.util.TimeZone r0 = r4.A05
            if (r3 == r0) goto L_0x0044
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0044
            java.util.Locale r2 = r4.A02
            java.lang.Boolean r1 = r4.A00
            boolean r0 = r4.A01
            X.4eL r4 = new X.4eL
            r4.<init>(r1, r2, r3, r0)
            goto L_0x0044
        L_0x00c8:
            boolean r0 = r4 instanceof java.text.SimpleDateFormat
            if (r0 != 0) goto L_0x00e6
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r10.A09(r0, r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e6:
            java.text.SimpleDateFormat r4 = (java.text.SimpleDateFormat) r4
            if (r6 == 0) goto L_0x0105
            java.lang.String r0 = r4.toPattern()
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            r4.<init>(r0, r5)
        L_0x00f3:
            java.util.TimeZone r1 = r3.A02()
            if (r1 == 0) goto L_0x0044
            java.util.TimeZone r0 = r4.getTimeZone()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x0041
        L_0x0105:
            java.lang.Object r4 = r4.clone()
            java.text.DateFormat r4 = (java.text.DateFormat) r4
            goto L_0x00f3
        L_0x010c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public DateTimeSerializerBase(Boolean bool, Class cls, DateFormat dateFormat) {
        super(cls);
        AtomicReference atomicReference;
        this.A01 = bool;
        this.A00 = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference();
        }
        this.A02 = atomicReference;
    }
}
