package com.fasterxml.jackson.databind.ser.std;

public class StdKeySerializers$Default extends StdSerializer {
    public final int A00;

    public StdKeySerializers$Default(Class cls, int i) {
        super(cls, false);
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.17Z r5, X.C269504fE r6, java.lang.Object r7) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x001a;
                case 2: goto L_0x0044;
                case 3: goto L_0x0073;
                case 4: goto L_0x007a;
                case 5: goto L_0x009e;
                case 6: goto L_0x009e;
                case 7: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r7.toString()
        L_0x0009:
            r5.A0q(r0)
            return
        L_0x000d:
            X.4et r0 = r6.A05
            X.4eS r0 = r0.A01
            X.4eN r0 = r0.A00
            byte[] r7 = (byte[]) r7
            java.lang.String r0 = r0.A05(r7)
            goto L_0x0009
        L_0x001a:
            java.util.Date r7 = (java.util.Date) r7
            X.4f6 r0 = X.C269424f6.WRITE_DATE_KEYS_AS_TIMESTAMPS
            X.4et r1 = r6.A05
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x002f
            long r0 = r7.getTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0009
        L_0x002f:
            java.text.DateFormat r0 = r6.A03
            if (r0 != 0) goto L_0x003f
            X.4eS r0 = r1.A01
            java.text.DateFormat r0 = r0.A08
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            r6.A03 = r0
        L_0x003f:
            java.lang.String r0 = r0.format(r7)
            goto L_0x0009
        L_0x0044:
            java.util.Calendar r7 = (java.util.Calendar) r7
            long r1 = r7.getTimeInMillis()
            X.4f6 r0 = X.C269424f6.WRITE_DATE_KEYS_AS_TIMESTAMPS
            X.4et r3 = r6.A05
            boolean r0 = r3.A0D(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x0009
        L_0x0059:
            java.text.DateFormat r0 = r6.A03
            if (r0 != 0) goto L_0x0069
            X.4eS r0 = r3.A01
            java.text.DateFormat r0 = r0.A08
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            r6.A03 = r0
        L_0x0069:
            java.util.Date r3 = new java.util.Date
            r3.<init>(r1)
            java.lang.String r0 = r0.format(r3)
            goto L_0x0009
        L_0x0073:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r0 = r7.getName()
            goto L_0x0009
        L_0x007a:
            X.4f6 r0 = X.C269424f6.WRITE_ENUMS_USING_TO_STRING
            X.4et r1 = r6.A05
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x0005
            java.lang.Enum r7 = (java.lang.Enum) r7
            X.4f6 r0 = X.C269424f6.WRITE_ENUM_KEYS_USING_INDEX
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0098
            int r0 = r7.ordinal()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0009
        L_0x0098:
            java.lang.String r0 = r7.name()
            goto L_0x0009
        L_0x009e:
            long r0 = X.AnonymousClass7TE.A0R(r7)
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default.A0A(X.17Z, X.4fE, java.lang.Object):void");
    }
}
