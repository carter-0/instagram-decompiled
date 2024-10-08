package com.google.android.gms.common.server.response;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = SWX.A00(48);
    public int A00;
    public int A01;
    public final Parcel A02;
    public final zan A03;
    public final String A04;
    public final int A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = android.util.Base64.encodeToString(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.lang.Object r2, java.lang.StringBuilder r3, int r4) {
        /*
            java.lang.String r1 = "\""
            switch(r4) {
                case 0: goto L_0x004a;
                case 1: goto L_0x004a;
                case 2: goto L_0x004a;
                case 3: goto L_0x004a;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x0035;
                case 8: goto L_0x0026;
                case 9: goto L_0x001c;
                case 10: goto L_0x0013;
                case 11: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "Unknown type = "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r4)
            throw r0
        L_0x000c:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0013:
            X.AnonymousClass3Qk.A02(r2)
            java.util.HashMap r2 = (java.util.HashMap) r2
            X.C9699RfI.A00(r3, r2)
            return
        L_0x001c:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0033
            r0 = 10
            goto L_0x002e
        L_0x0026:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0033
            r0 = 0
        L_0x002e:
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            goto L_0x0043
        L_0x0033:
            r0 = 0
            goto L_0x0043
        L_0x0035:
            r3.append(r1)
            X.AnonymousClass3Qk.A02(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.C11150SCf.A00(r0)
        L_0x0043:
            r3.append(r0)
            r3.append(r1)
            return
        L_0x004a:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.A01(java.lang.Object, java.lang.StringBuilder, int):void");
    }

    public final String toString() {
        Parcel parcel;
        int A032;
        zan zan = this.A03;
        AnonymousClass3Qk.A03(zan, "Cannot convert to JSON on client side.");
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                parcel = this.A02;
                A032 = this.A01;
            }
            Parcel parcel2 = this.A02;
            parcel2.setDataPosition(0);
            StringBuilder A14 = Pxe.A14(100);
            String str = this.A04;
            AnonymousClass3Qk.A02(str);
            Map map = (Map) zan.A02.get(str);
            AnonymousClass3Qk.A02(map);
            A00(parcel2, A14, map);
            return A14.toString();
        }
        parcel = this.A02;
        A032 = Pxf.A03(parcel);
        this.A01 = A032;
        C301145yd.A06(parcel, A032);
        this.A00 = 2;
        Parcel parcel22 = this.A02;
        parcel22.setDataPosition(0);
        StringBuilder A142 = Pxe.A14(100);
        String str2 = this.A04;
        AnonymousClass3Qk.A02(str2);
        Map map2 = (Map) zan.A02.get(str2);
        AnonymousClass3Qk.A02(map2);
        A00(parcel22, A142, map2);
        return A142.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A05
            r2 = 20293(0x4f45, float:2.8437E-41)
            int r5 = X.C301145yd.A01(r7, r2)
            r1 = 1
            X.C301145yd.A07(r7, r1, r0)
            int r0 = r6.A00
            r4 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 != r1) goto L_0x001c
            android.os.Parcel r1 = r6.A02
            int r0 = r6.A01
        L_0x0017:
            X.C301145yd.A06(r1, r0)
            r6.A00 = r4
        L_0x001c:
            android.os.Parcel r3 = r6.A02
            r2 = 0
            if (r3 == 0) goto L_0x002f
            int r1 = X.C301145yd.A01(r7, r4)
            int r0 = r3.dataSize()
            r7.appendFrom(r3, r2, r0)
            X.C301145yd.A06(r7, r1)
        L_0x002f:
            com.google.android.gms.common.server.response.zan r1 = r6.A03
            r0 = 3
            X.C301145yd.A0A(r7, r1, r0, r8, r2)
            X.C301145yd.A06(r7, r5)
            return
        L_0x0039:
            android.os.Parcel r1 = r6.A02
            int r0 = X.C301145yd.A01(r1, r2)
            r6.A01 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.writeToParcel(android.os.Parcel, int):void");
    }

    public SafeParcelResponse(Parcel parcel, zan zan, int i) {
        String str;
        this.A05 = i;
        AnonymousClass3Qk.A02(parcel);
        this.A02 = parcel;
        this.A03 = zan;
        if (zan == null) {
            str = null;
        } else {
            str = zan.A01;
        }
        this.A04 = str;
        this.A00 = 2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0375, code lost:
        r4.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03f4, code lost:
        r4.append(r0);
        r4.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0403, code lost:
        A01(r11, r4, r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c3, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        r11 = X.SJO.A02(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (r10.A08 == false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        r11 = (java.util.AbstractList) r11;
        X.Pxh.A1P(r4);
        r9 = r11.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r7 >= r9) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0119, code lost:
        if (r7 == 0) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        r4.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        A01(r11.get(r7), r4, r10.A01);
        r7 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r6 = X.Pxe.A0L()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r20)
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r0
            int r0 = r0.A03
            r6.put(r0, r1)
            goto L_0x0008
        L_0x001e:
            r0 = 123(0x7b, float:1.72E-43)
            r4 = r19
            r4.append(r0)
            r3 = r18
            int r2 = X.C295505oK.A00(r3)
            r5 = 0
            r7 = 0
        L_0x002d:
            int r0 = r3.dataPosition()
            if (r0 >= r2) goto L_0x0419
            int r11 = r3.readInt()
            char r0 = (char) r11
            java.lang.Object r1 = r6.get(r0)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x002d
            java.lang.String r8 = ","
            if (r7 == 0) goto L_0x0047
            r4.append(r8)
        L_0x0047:
            java.lang.String r0 = X.DbT.A13(r1)
            java.lang.Object r10 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r10 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r10
            java.lang.String r7 = "\""
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = "\":"
            r4.append(r0)
            X.Taz r0 = r10.A04
            if (r0 == 0) goto L_0x012a
            int r1 = r10.A02
            switch(r1) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00ab;
                case 2: goto L_0x006e;
                case 3: goto L_0x00a2;
                case 4: goto L_0x0099;
                case 5: goto L_0x0078;
                case 6: goto L_0x00fd;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00f3;
                case 9: goto L_0x00f3;
                case 10: goto L_0x00cd;
                case 11: goto L_0x040b;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.String r0 = "Unknown field out type = "
            java.lang.IllegalArgumentException r1 = X.DbW.A0a(r0, r1)
            throw r1
        L_0x006e:
            long r0 = X.Pxi.A08(r3, r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0105
        L_0x0078:
            int r9 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r9 == 0) goto L_0x00c3
            byte[] r1 = r3.createByteArray()
            int r7 = r3.readInt()
            int r0 = r0 + r9
            r3.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0, r7)
            goto L_0x0105
        L_0x0099:
            double r0 = X.Pxi.A00(r3, r11)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            goto L_0x0105
        L_0x00a2:
            float r0 = X.Pxh.A01(r3, r11)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            goto L_0x0105
        L_0x00ab:
            int r7 = X.C295505oK.A01(r3, r11)
            int r1 = r3.dataPosition()
            if (r7 == 0) goto L_0x00c3
            byte[] r0 = r3.createByteArray()
            int r1 = r1 + r7
            r3.setDataPosition(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            goto L_0x0105
        L_0x00c3:
            r1 = 0
            goto L_0x0105
        L_0x00c5:
            X.C295505oK.A0D(r3, r11)
            java.lang.Integer r1 = X.C41847B3o.A12(r3)
            goto L_0x0105
        L_0x00cd:
            android.os.Bundle r11 = X.C295505oK.A02(r3, r11)
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r7 = X.Pxf.A0t(r11)
        L_0x00d9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = X.AnonymousClass7TE.A18(r7)
            java.lang.String r0 = r11.getString(r1)
            X.AnonymousClass3Qk.A02(r0)
            r9.put(r1, r0)
            goto L_0x00d9
        L_0x00ee:
            java.lang.Object r11 = X.SJO.A02(r10, r9)
            goto L_0x0109
        L_0x00f3:
            byte[] r1 = X.C295505oK.A0H(r3, r11)
            goto L_0x0105
        L_0x00f8:
            java.lang.String r1 = X.C295505oK.A08(r3, r11)
            goto L_0x0105
        L_0x00fd:
            boolean r0 = X.C295505oK.A0G(r3, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0105:
            java.lang.Object r11 = X.SJO.A02(r10, r1)
        L_0x0109:
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0403
            java.util.AbstractList r11 = (java.util.AbstractList) r11
            X.Pxh.A1P(r4)
            int r9 = r11.size()
            r7 = 0
        L_0x0117:
            if (r7 >= r9) goto L_0x02de
            if (r7 == 0) goto L_0x011e
            r4.append(r8)
        L_0x011e:
            int r1 = r10.A01
            java.lang.Object r0 = r11.get(r7)
            A01(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x0117
        L_0x012a:
            boolean r0 = r10.A09
            r9 = r17
            if (r0 == 0) goto L_0x02e2
            X.Pxh.A1P(r4)
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x02c9;
                case 1: goto L_0x0276;
                case 2: goto L_0x0251;
                case 3: goto L_0x022c;
                case 4: goto L_0x0207;
                case 5: goto L_0x01c6;
                case 6: goto L_0x01a1;
                case 7: goto L_0x02ae;
                case 8: goto L_0x0412;
                case 9: goto L_0x0412;
                case 10: goto L_0x0412;
                case 11: goto L_0x013f;
                default: goto L_0x0138;
            }
        L_0x0138:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        L_0x013f:
            int r16 = X.C295505oK.A01(r3, r11)
            int r15 = r3.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x0176
            int r13 = r3.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r11 = 0
        L_0x0151:
            if (r11 >= r13) goto L_0x0170
            int r7 = r3.readInt()
            if (r7 == 0) goto L_0x016d
            int r1 = r3.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r3, r1, r7)
            r12[r11] = r0
            int r1 = r1 + r7
            r3.setDataPosition(r1)
        L_0x016a:
            int r11 = r11 + 1
            goto L_0x0151
        L_0x016d:
            r12[r11] = r14
            goto L_0x016a
        L_0x0170:
            int r15 = r15 + r16
            r3.setDataPosition(r15)
            r14 = r12
        L_0x0176:
            int r11 = r14.length
            r7 = 0
        L_0x0178:
            if (r7 >= r11) goto L_0x02de
            if (r7 <= 0) goto L_0x017f
            r4.append(r8)
        L_0x017f:
            r0 = r14[r7]
            r0.setDataPosition(r5)
            java.lang.String r1 = r10.A07
            X.AnonymousClass3Qk.A02(r1)
            com.google.android.gms.common.server.response.zan r0 = r10.A00
            X.AnonymousClass3Qk.A02(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.AnonymousClass3Qk.A02(r1)
            r0 = r14[r7]
            r9.A00(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x0178
        L_0x01a1:
            int r1 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x01bd
            r9 = 0
        L_0x01ac:
            int r7 = r9.length
            r1 = 0
        L_0x01ae:
            if (r1 >= r7) goto L_0x02de
            if (r1 == 0) goto L_0x01b5
            r4.append(r8)
        L_0x01b5:
            boolean r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x01ae
        L_0x01bd:
            boolean[] r9 = r3.createBooleanArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x01ac
        L_0x01c6:
            int r13 = X.C295505oK.A01(r3, r11)
            int r12 = r3.dataPosition()
            if (r13 != 0) goto L_0x01e2
            r11 = 0
        L_0x01d1:
            int r7 = r11.length
            r1 = 0
        L_0x01d3:
            if (r1 >= r7) goto L_0x02de
            if (r1 == 0) goto L_0x01da
            r4.append(r8)
        L_0x01da:
            r0 = r11[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x01d3
        L_0x01e2:
            int r10 = r3.readInt()
            java.math.BigDecimal[] r11 = new java.math.BigDecimal[r10]
            r9 = 0
        L_0x01e9:
            if (r9 >= r10) goto L_0x0202
            byte[] r0 = r3.createByteArray()
            int r7 = r3.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r7)
            r11[r9] = r0
            int r9 = r9 + 1
            goto L_0x01e9
        L_0x0202:
            int r12 = r12 + r13
            r3.setDataPosition(r12)
            goto L_0x01d1
        L_0x0207:
            int r1 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x0223
            r10 = 0
        L_0x0212:
            int r9 = r10.length
            r7 = 0
        L_0x0214:
            if (r7 >= r9) goto L_0x02de
            if (r7 == 0) goto L_0x021b
            r4.append(r8)
        L_0x021b:
            r0 = r10[r7]
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x0214
        L_0x0223:
            double[] r10 = r3.createDoubleArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x0212
        L_0x022c:
            int r1 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x0248
            r9 = 0
        L_0x0237:
            int r7 = r9.length
            r1 = 0
        L_0x0239:
            if (r1 >= r7) goto L_0x02de
            if (r1 == 0) goto L_0x0240
            r4.append(r8)
        L_0x0240:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0239
        L_0x0248:
            float[] r9 = r3.createFloatArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x0237
        L_0x0251:
            int r1 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x026d
            r10 = 0
        L_0x025c:
            int r9 = r10.length
            r7 = 0
        L_0x025e:
            if (r7 >= r9) goto L_0x02de
            if (r7 == 0) goto L_0x0265
            r4.append(r8)
        L_0x0265:
            r0 = r10[r7]
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x025e
        L_0x026d:
            long[] r10 = r3.createLongArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x025c
        L_0x0276:
            int r12 = X.C295505oK.A01(r3, r11)
            int r11 = r3.dataPosition()
            if (r12 != 0) goto L_0x0292
            r10 = 0
        L_0x0281:
            int r7 = r10.length
            r1 = 0
        L_0x0283:
            if (r1 >= r7) goto L_0x02de
            if (r1 == 0) goto L_0x028a
            r4.append(r8)
        L_0x028a:
            r0 = r10[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0283
        L_0x0292:
            int r9 = r3.readInt()
            java.math.BigInteger[] r10 = new java.math.BigInteger[r9]
            r7 = 0
        L_0x0299:
            if (r7 >= r9) goto L_0x02a9
            byte[] r1 = r3.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r10[r7] = r0
            int r7 = r7 + 1
            goto L_0x0299
        L_0x02a9:
            int r11 = r11 + r12
            r3.setDataPosition(r11)
            goto L_0x0281
        L_0x02ae:
            java.lang.String[] r10 = X.C295505oK.A0K(r3, r11)
            int r9 = r10.length
            r1 = 0
        L_0x02b4:
            if (r1 >= r9) goto L_0x02de
            if (r1 == 0) goto L_0x02bb
            r4.append(r8)
        L_0x02bb:
            r4.append(r7)
            r0 = r10[r1]
            r4.append(r0)
            r4.append(r7)
            int r1 = r1 + 1
            goto L_0x02b4
        L_0x02c9:
            int[] r9 = X.C295505oK.A0I(r3, r11)
            int r7 = r9.length
            r1 = 0
        L_0x02cf:
            if (r1 >= r7) goto L_0x02de
            if (r1 == 0) goto L_0x02d6
            r4.append(r8)
        L_0x02d6:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x02cf
        L_0x02de:
            java.lang.String r0 = "]"
            goto L_0x03c5
        L_0x02e2:
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x037c;
                case 1: goto L_0x035e;
                case 2: goto L_0x02ee;
                case 3: goto L_0x0355;
                case 4: goto L_0x034c;
                case 5: goto L_0x032b;
                case 6: goto L_0x03fb;
                case 7: goto L_0x03e9;
                case 8: goto L_0x03d9;
                case 9: goto L_0x03c9;
                case 10: goto L_0x0385;
                case 11: goto L_0x02f7;
                default: goto L_0x02e7;
            }
        L_0x02e7:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        L_0x02ee:
            long r0 = X.Pxi.A08(r3, r11)
            r4.append(r0)
            goto L_0x0408
        L_0x02f7:
            int r1 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x031f
            r7 = 0
        L_0x0302:
            r7.setDataPosition(r5)
            java.lang.String r1 = r10.A07
            X.AnonymousClass3Qk.A02(r1)
            com.google.android.gms.common.server.response.zan r0 = r10.A00
            X.AnonymousClass3Qk.A02(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.AnonymousClass3Qk.A02(r0)
            r9.A00(r7, r4, r0)
            goto L_0x0408
        L_0x031f:
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r3, r0, r1)
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x0302
        L_0x032b:
            int r8 = X.C295505oK.A01(r3, r11)
            int r0 = r3.dataPosition()
            if (r8 == 0) goto L_0x037a
            byte[] r1 = r3.createByteArray()
            int r7 = r3.readInt()
            int r0 = r0 + r8
            r3.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0, r7)
            goto L_0x0375
        L_0x034c:
            double r0 = X.Pxi.A00(r3, r11)
            r4.append(r0)
            goto L_0x0408
        L_0x0355:
            float r0 = X.Pxh.A01(r3, r11)
            r4.append(r0)
            goto L_0x0408
        L_0x035e:
            int r7 = X.C295505oK.A01(r3, r11)
            int r1 = r3.dataPosition()
            if (r7 == 0) goto L_0x037a
            byte[] r0 = r3.createByteArray()
            int r1 = r1 + r7
            r3.setDataPosition(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
        L_0x0375:
            r4.append(r1)
            goto L_0x0408
        L_0x037a:
            r1 = 0
            goto L_0x0375
        L_0x037c:
            int r0 = X.Pxh.A08(r3, r11)
            r4.append(r0)
            goto L_0x0408
        L_0x0385:
            android.os.Bundle r11 = X.C295505oK.A02(r3, r11)
            java.util.Set r1 = r11.keySet()
            java.lang.String r0 = "{"
            r4.append(r0)
            java.util.Iterator r10 = r1.iterator()
            r9 = 1
        L_0x0398:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03c2
            java.lang.String r1 = X.AnonymousClass7TE.A18(r10)
            if (r9 != 0) goto L_0x03a7
            r4.append(r8)
        L_0x03a7:
            r4.append(r7)
            r4.append(r1)
            java.lang.String r0 = "\":\""
            r4.append(r0)
            java.lang.String r0 = r11.getString(r1)
            java.lang.String r0 = X.C11150SCf.A00(r0)
            r4.append(r0)
            r4.append(r7)
            r9 = 0
            goto L_0x0398
        L_0x03c2:
            java.lang.String r0 = "}"
        L_0x03c5:
            r4.append(r0)
            goto L_0x0408
        L_0x03c9:
            byte[] r1 = X.C295505oK.A0H(r3, r11)
            r4.append(r7)
            if (r1 == 0) goto L_0x03e7
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x03f4
        L_0x03d9:
            byte[] r0 = X.C295505oK.A0H(r3, r11)
            r4.append(r7)
            if (r0 == 0) goto L_0x03e7
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x03f4
        L_0x03e7:
            r0 = 0
            goto L_0x03f4
        L_0x03e9:
            java.lang.String r0 = X.C295505oK.A08(r3, r11)
            r4.append(r7)
            java.lang.String r0 = X.C11150SCf.A00(r0)
        L_0x03f4:
            r4.append(r0)
            r4.append(r7)
            goto L_0x0408
        L_0x03fb:
            boolean r0 = X.C295505oK.A0G(r3, r11)
            r4.append(r0)
            goto L_0x0408
        L_0x0403:
            int r0 = r10.A01
            A01(r11, r4, r0)
        L_0x0408:
            r7 = 1
            goto L_0x002d
        L_0x040b:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        L_0x0412:
            java.lang.String r0 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)
            throw r1
        L_0x0419:
            int r0 = r3.dataPosition()
            if (r0 != r2) goto L_0x0425
            r0 = 125(0x7d, float:1.75E-43)
            r4.append(r0)
            return
        L_0x0425:
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.002.A0O(r0, r2)
            X.TQZ r1 = new X.TQZ
            r1.<init>(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.A00(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }
}
