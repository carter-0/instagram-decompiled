package org.microg.safeparcel;

public abstract class AutoSafeParcelable implements SafeParcelable {
    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        r9.setAccessible(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        r4.writeInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e6, code lost:
        if (r0 == null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e8, code lost:
        r16 = X.C9885Riy.A00(r4, r1);
        r4.writeStrongBinder(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ff, code lost:
        r2 = r4.dataPosition();
        r4.setDataPosition(r16 - 4);
        r4.writeInt(r2 - r16);
        r4.setDataPosition(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0212, code lost:
        if (r14 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0214, code lost:
        r4.writeInt(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            java.lang.Class r18 = r7.getClass()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = -45243(0xffffffffffff4f45, float:NaN)
            r4 = r20
            r4.writeInt(r0)
            r4.writeInt(r1)
            int r17 = r4.dataPosition()
        L_0x0018:
            if (r18 == 0) goto L_0x023d
            java.lang.reflect.Field[] r6 = r18.getDeclaredFields()
            int r5 = r6.length
            r3 = 0
        L_0x0020:
            if (r3 >= r5) goto L_0x0237
            r9 = r6[r3]
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r2 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r9.isAnnotationPresent(r2)
            if (r0 == 0) goto L_0x0233
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r2)     // Catch:{ Exception -> 0x0223 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0219
            int r1 = r0.value()     // Catch:{ Exception -> 0x0223 }
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r2)     // Catch:{ Exception -> 0x0223 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x021e
            boolean r14 = r0.mayNull()     // Catch:{ Exception -> 0x0223 }
            boolean r8 = r9.isAccessible()     // Catch:{ Exception -> 0x0223 }
            r12 = 1
            r9.setAccessible(r12)     // Catch:{ Exception -> 0x0223 }
            java.lang.Integer r0 = X.C9884Rix.A00(r9)     // Catch:{ Exception -> 0x0223 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0223 }
            r11 = r21
            switch(r0) {
                case 0: goto L_0x01f0;
                case 1: goto L_0x01e0;
                case 2: goto L_0x01c5;
                case 3: goto L_0x0160;
                case 4: goto L_0x013e;
                case 5: goto L_0x0102;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e0;
                case 8: goto L_0x01d5;
                case 9: goto L_0x00cf;
                case 10: goto L_0x00b9;
                case 11: goto L_0x00a7;
                case 12: goto L_0x0094;
                case 13: goto L_0x007e;
                case 14: goto L_0x006f;
                case 15: goto L_0x005e;
                case 16: goto L_0x014f;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x0223 }
        L_0x0059:
            r9.setAccessible(r8)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0233
        L_0x005e:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeString(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x006f:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            X.Pxg.A1H(r4, r2, r1)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x007e:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            float r0 = r2.floatValue()     // Catch:{ Exception -> 0x0223 }
            r4.writeFloat(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x0094:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x0223 }
            goto L_0x00cb
        L_0x00a7:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            X.Pxf.A18(r4, r2)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x00b9:
            java.lang.Object r2 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x0059
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            int r0 = r2.intValue()     // Catch:{ Exception -> 0x0223 }
        L_0x00cb:
            r4.writeInt(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x00cf:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeIntArray(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x00e0:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeByteArray(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x00f1:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeStringArray(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x0102:
            java.lang.Object r13 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ Exception -> 0x0223 }
            r10 = 0
            if (r13 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            int r14 = r13.length     // Catch:{ Exception -> 0x0223 }
            r4.writeInt(r14)     // Catch:{ Exception -> 0x0223 }
            r2 = 0
        L_0x0114:
            if (r2 >= r14) goto L_0x01ff
            r1 = r13[r2]     // Catch:{ Exception -> 0x0223 }
            if (r1 != 0) goto L_0x011e
            r4.writeInt(r10)     // Catch:{ Exception -> 0x0223 }
            goto L_0x013b
        L_0x011e:
            int r15 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r4.writeInt(r12)     // Catch:{ Exception -> 0x0223 }
            int r0 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r1.writeToParcel(r4, r11)     // Catch:{ Exception -> 0x0223 }
            int r1 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r4.setDataPosition(r15)     // Catch:{ Exception -> 0x0223 }
            int r0 = r1 - r0
            r4.writeInt(r0)     // Catch:{ Exception -> 0x0223 }
            r4.setDataPosition(r1)     // Catch:{ Exception -> 0x0223 }
        L_0x013b:
            int r2 = r2 + 1
            goto L_0x0114
        L_0x013e:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeBundle(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x014f:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeMap(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x0160:
            java.lang.Class r2 = X.SQJ.A02(r9)     // Catch:{ Exception -> 0x0223 }
            if (r2 == 0) goto L_0x01b5
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x01b5
            boolean r0 = X.SQJ.A03(r9)     // Catch:{ Exception -> 0x0223 }
            if (r0 != 0) goto L_0x01b5
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0223 }
            r10 = 0
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            java.util.Iterator r13 = X.C41848B3p.A1F(r4, r0)     // Catch:{ Exception -> 0x0223 }
        L_0x0185:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x0223 }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ Exception -> 0x0223 }
            if (r1 != 0) goto L_0x0197
            r4.writeInt(r10)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0185
        L_0x0197:
            int r2 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r4.writeInt(r12)     // Catch:{ Exception -> 0x0223 }
            int r0 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r1.writeToParcel(r4, r11)     // Catch:{ Exception -> 0x0223 }
            int r1 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            r4.setDataPosition(r2)     // Catch:{ Exception -> 0x0223 }
            int r0 = r1 - r0
            r4.writeInt(r0)     // Catch:{ Exception -> 0x0223 }
            r4.setDataPosition(r1)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0185
        L_0x01b5:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeList(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x01c5:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeStringList(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x01d5:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            android.os.IInterface r0 = (android.os.IInterface) r0     // Catch:{ Exception -> 0x0223 }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x0223 }
            goto L_0x01e6
        L_0x01e0:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x0223 }
        L_0x01e6:
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r4.writeStrongBinder(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x01ff
        L_0x01f0:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x0223 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x0212
            int r16 = X.C9885Riy.A00(r4, r1)     // Catch:{ Exception -> 0x0223 }
            r0.writeToParcel(r4, r11)     // Catch:{ Exception -> 0x0223 }
        L_0x01ff:
            int r2 = r4.dataPosition()     // Catch:{ Exception -> 0x0223 }
            int r1 = r2 - r16
            int r0 = r16 + -4
            r4.setDataPosition(r0)     // Catch:{ Exception -> 0x0223 }
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            r4.setDataPosition(r2)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x0212:
            if (r14 == 0) goto L_0x0059
            r4.writeInt(r1)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0059
        L_0x0219:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ Exception -> 0x0223 }
            goto L_0x0222
        L_0x021e:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ Exception -> 0x0223 }
        L_0x0222:
            throw r0     // Catch:{ Exception -> 0x0223 }
        L_0x0223:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Error writing field: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r0 = "SafeParcel"
            android.util.Log.w(r0, r1)
        L_0x0233:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0237:
            java.lang.Class r18 = r18.getSuperclass()
            goto L_0x0018
        L_0x023d:
            int r2 = r4.dataPosition()
            int r1 = r2 - r17
            int r0 = r17 + -4
            r4.setDataPosition(r0)
            r4.writeInt(r1)
            r4.setDataPosition(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.microg.safeparcel.AutoSafeParcelable.writeToParcel(android.os.Parcel, int):void");
    }
}
