package X;

/* renamed from: X.6TC  reason: invalid class name */
public final class AnonymousClass6TC implements AnonymousClass6TD {
    public final /* synthetic */ AnonymousClass6T6 A00;
    public final /* synthetic */ C276544tV A01;

    public AnonymousClass6TC(AnonymousClass6T6 r1, C276544tV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean FN6(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 35
            if (r7 == r0) goto L_0x0185
            r1 = 36
            if (r7 == r1) goto L_0x0125
            r0 = 41
            if (r7 == r0) goto L_0x00db
            r0 = 42
            if (r7 == r0) goto L_0x0077
            r0 = 44
            if (r7 != r0) goto L_0x003e
            X.6T6 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x0040;
                case -932331738: goto L_0x004b;
                case -814425728: goto L_0x0056;
                case 1682480591: goto L_0x0061;
                case 1744442261: goto L_0x006c;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.6T8 r3 = X.AnonymousClass6T8.FLEX_START
        L_0x0021:
            X.6T8 r0 = X.AnonymousClass6T6.A05
            if (r3 == r0) goto L_0x003e
            r0 = 2
            X.AnonymousClass6T6.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1073741824(0x40000000, float:2.0)
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.A00
        L_0x003b:
            float r0 = (float) r0
            r5[r4] = r0
        L_0x003e:
            r0 = 0
            return r0
        L_0x0040:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6T8 r3 = X.AnonymousClass6T8.CENTER
            goto L_0x0021
        L_0x004b:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6T8 r3 = X.AnonymousClass6T8.SPACE_AROUND
            goto L_0x0021
        L_0x0056:
            java.lang.String r0 = "space_evenly"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6T8 r3 = X.AnonymousClass6T8.SPACE_EVENLY
            goto L_0x0021
        L_0x0061:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6T8 r3 = X.AnonymousClass6T8.SPACE_BETWEEN
            goto L_0x0021
        L_0x006c:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6T8 r3 = X.AnonymousClass6T8.FLEX_END
            goto L_0x0021
        L_0x0077:
            X.6T6 r3 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            X.4tV r0 = r6.A01
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "auto"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "space_between"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "space_around"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d9
        L_0x009b:
            r1 = 1
        L_0x009c:
            int r0 = r8.hashCode()
            switch(r0) {
                case 3657802: goto L_0x00c1;
                case 491642861: goto L_0x00ce;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            X.6TB r2 = X.AnonymousClass6TB.NO_WRAP
        L_0x00a5:
            X.6TB r0 = X.AnonymousClass6T6.A06
            if (r2 == r0) goto L_0x003e
            r0 = 2
            X.AnonymousClass6T6.A00(r3, r0)
            float[] r5 = r3.A01
            int r1 = r3.A00
            int r4 = r1 + 1
            r3.A00 = r4
            r0 = 1084227584(0x40a00000, float:5.0)
            r5[r1] = r0
            int r0 = r4 + 1
            r3.A00 = r0
            int r0 = r2.A00
            goto L_0x003b
        L_0x00c1:
            java.lang.String r0 = "wrap"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a3
            if (r1 != 0) goto L_0x00a3
            X.6TB r2 = X.AnonymousClass6TB.WRAP
            goto L_0x00a5
        L_0x00ce:
            java.lang.String r0 = "wrap_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a3
            X.6TB r2 = X.AnonymousClass6TB.WRAP_REVERSE
            goto L_0x00a5
        L_0x00d9:
            r1 = 0
            goto L_0x009c
        L_0x00db:
            X.6T6 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1781065991: goto L_0x0104;
                case -1354837162: goto L_0x010f;
                case -207799939: goto L_0x011a;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            X.6T7 r3 = X.AnonymousClass6T7.ROW
        L_0x00e8:
            X.6T7 r0 = X.AnonymousClass6T6.A04
            if (r3 == r0) goto L_0x003e
            r0 = 2
            X.AnonymousClass6T6.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.A00
            goto L_0x003b
        L_0x0104:
            java.lang.String r0 = "column_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e6
            X.6T7 r3 = X.AnonymousClass6T7.COLUMN_REVERSE
            goto L_0x00e8
        L_0x010f:
            java.lang.String r0 = "column"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e6
            X.6T7 r3 = X.AnonymousClass6T7.COLUMN
            goto L_0x00e8
        L_0x011a:
            java.lang.String r0 = "row_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e6
            X.6T7 r3 = X.AnonymousClass6T7.ROW_REVERSE
            goto L_0x00e8
        L_0x0125:
            X.6T6 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1720785339: goto L_0x0150;
                case -1364013995: goto L_0x015b;
                case -932331738: goto L_0x0166;
                case 3005871: goto L_0x0169;
                case 1384876188: goto L_0x016c;
                case 1682480591: goto L_0x0177;
                case 1744442261: goto L_0x017a;
                default: goto L_0x0130;
            }
        L_0x0130:
            X.6TA r3 = X.AnonymousClass6TA.STRETCH
        L_0x0132:
            X.6TA r0 = X.AnonymousClass6T6.A03
            if (r3 == r0) goto L_0x003e
            r0 = 2
            X.AnonymousClass6T6.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1082130432(0x40800000, float:4.0)
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003b
        L_0x0150:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0130
            X.6TA r3 = X.AnonymousClass6TA.BASELINE
            goto L_0x0132
        L_0x015b:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0130
            X.6TA r3 = X.AnonymousClass6TA.CENTER
            goto L_0x0132
        L_0x0166:
            java.lang.String r0 = "space_around"
            goto L_0x017c
        L_0x0169:
            java.lang.String r0 = "auto"
            goto L_0x017c
        L_0x016c:
            java.lang.String r0 = "flex_start"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0130
            X.6TA r3 = X.AnonymousClass6TA.FLEX_START
            goto L_0x0132
        L_0x0177:
            java.lang.String r0 = "space_between"
            goto L_0x017c
        L_0x017a:
            java.lang.String r0 = "flex_end"
        L_0x017c:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0130
            X.6TA r3 = X.AnonymousClass6TA.FLEX_END
            goto L_0x0132
        L_0x0185:
            X.6T6 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x01b0;
                case -1720785339: goto L_0x01bb;
                case -1364013995: goto L_0x01c6;
                case -932331738: goto L_0x01d1;
                case 1682480591: goto L_0x01dc;
                case 1744442261: goto L_0x01e7;
                default: goto L_0x0190;
            }
        L_0x0190:
            X.6T9 r3 = X.AnonymousClass6T9.FLEX_START
        L_0x0192:
            X.6T9 r0 = X.AnonymousClass6T6.A02
            if (r3 == r0) goto L_0x003e
            r0 = 2
            X.AnonymousClass6T6.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1077936128(0x40400000, float:3.0)
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003b
        L_0x01b0:
            java.lang.String r0 = "stretch"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.STRETCH
            goto L_0x0192
        L_0x01bb:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.BASELINE
            goto L_0x0192
        L_0x01c6:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.CENTER
            goto L_0x0192
        L_0x01d1:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.SPACE_AROUND
            goto L_0x0192
        L_0x01dc:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.SPACE_BETWEEN
            goto L_0x0192
        L_0x01e7:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0190
            X.6T9 r3 = X.AnonymousClass6T9.FLEX_END
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TC.FN6(int, java.lang.Object):boolean");
    }
}
