package X;

import android.os.Parcelable;
import java.lang.reflect.Array;

public final class SWY implements Parcelable.Creator {
    public final int A00;
    public final Object A01;

    public static SWY A00(Class cls) {
        return new SWY(cls, 1);
    }

    public SWY(Class cls, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = cls;
        } else {
            this.A01 = cls;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0208, code lost:
        if (r1.getClassLoader() == null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020a, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020f, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0217, code lost:
        if (r11 != 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0219, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021b, code lost:
        r0 = r7.dataPosition();
        r1 = r7.readBundle(r1);
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0227, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022c, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0230, code lost:
        if (r11 != 0) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0232, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0234, code lost:
        r0 = r7.dataPosition();
        r1 = r7.createStringArray();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0240, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0245, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0249, code lost:
        if (r11 != 0) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x024b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024d, code lost:
        r0 = r7.dataPosition();
        r1 = r7.createByteArray();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0259, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x025e, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0262, code lost:
        if (r11 != 0) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0264, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0266, code lost:
        r0 = r7.dataPosition();
        r1 = r7.createIntArray();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0272, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0277, code lost:
        X.C11110SAl.A01(r7, r9, 4);
        r13 = r7.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0281, code lost:
        if (r16 == -1) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0286, code lost:
        if (((long) r13) <= r16) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0288, code lost:
        java.lang.String.format("Version code of %s (%d) is older than object read (%d).", new java.lang.Object[]{r8.getDeclaringClass().getName(), java.lang.Long.valueOf(r16), java.lang.Integer.valueOf(r13)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x029f, code lost:
        r8.set(r3, java.lang.Integer.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a8, code lost:
        X.C11110SAl.A01(r7, r9, 8);
        r14 = r7.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b3, code lost:
        if (r16 == -1) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b7, code lost:
        if (r14 <= r16) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b9, code lost:
        java.lang.String.format("Version code of %s (%d) is older than object read (%d).", new java.lang.Object[]{r8.getDeclaringClass().getName(), java.lang.Long.valueOf(r16), java.lang.Long.valueOf(r14)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d0, code lost:
        r8.set(r3, java.lang.Long.valueOf(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d9, code lost:
        X.C11110SAl.A01(r7, r9, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r8.set(r3, java.lang.Boolean.valueOf(X.AnonymousClass7TF.A1P(r7.readInt())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ee, code lost:
        X.C11110SAl.A01(r7, r9, 4);
        r8.set(r3, java.lang.Float.valueOf(r7.readFloat()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ff, code lost:
        X.C11110SAl.A01(r7, r9, 8);
        r8.set(r3, java.lang.Double.valueOf(r7.readDouble()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0311, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0315, code lost:
        if (r11 != 0) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0317, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0319, code lost:
        r0 = r7.dataPosition();
        r1 = r7.readString();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0325, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032a, code lost:
        r14 = r8.getType().getDeclaredClasses();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036b, code lost:
        r16 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x037e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        android.util.Log.w("SafeParcel", java.lang.String.format("Error reading field: %d in %s, skipping.", new java.lang.Object[]{java.lang.Integer.valueOf(r20), r23.getName()}), r8);
        r7.setDataPosition(r7.dataPosition() + X.C11110SAl.A00(r7, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a6, code lost:
        if (r7.dataPosition() > r2) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a8, code lost:
        r5.setAccessible(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ad, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ae, code lost:
        r1 = X.AnonymousClass7TE.A15(X.002.A0O("Overread allowed size end=", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b9, code lost:
        r1 = new java.lang.RuntimeException(X.002.A02(r8, r2, X.C273654mx.A00(1384), " end="));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03cb, code lost:
        r1 = new java.lang.RuntimeException(X.002.A0R(X.C273654mx.A00(1258), java.lang.Integer.toHexString(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r7 = r25;
        r9 = r7.readInt();
        r2 = X.C11110SAl.A00(r7, r9);
        r8 = r7.dataPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if ((r9 & 65535) != 20293) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r2 = r2 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r2 < r8) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r2 > r7.dataSize()) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r7.dataPosition() >= r2) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        r9 = r7.readInt();
        r20 = r9 & 65535;
        r8 = (java.lang.reflect.Field) r4.get(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (r8 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        java.lang.String.format("Unknown field id %d in %s, skipping.", new java.lang.Object[]{java.lang.Integer.valueOf(r20), r23.getName()});
        r7.setDataPosition(r7.dataPosition() + X.C11110SAl.A00(r7, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r12 = r8.isAccessible();
        r8.setAccessible(true);
        r1 = org.microg.safeparcel.SafeParcelable.Field.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r8.isAnnotationPresent(r1) == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r16 = ((org.microg.safeparcel.SafeParcelable.Field) r8.getAnnotation(r1)).versionCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        switch(X.C9884Rix.A00(r8).intValue()) {
            case 0: goto L_0x00e7;
            case 1: goto L_0x0172;
            case 2: goto L_0x018b;
            case 3: goto L_0x0105;
            case 4: goto L_0x01de;
            case 5: goto L_0x0153;
            case 6: goto L_0x022c;
            case 7: goto L_0x0245;
            case 8: goto L_0x032a;
            case 9: goto L_0x025e;
            case 10: goto L_0x0277;
            case 11: goto L_0x02a8;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x02d9;
            case 13: goto L_0x02ee;
            case 14: goto L_0x02ff;
            case 15: goto L_0x0311;
            case 16: goto L_0x01a4;
            default: goto L_0x00e3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        r0 = X.SQJ.A01(r8);
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        if (r11 != 0) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        r1 = r7.dataPosition();
        r0 = (android.os.Parcelable) r0.createFromParcel(r7);
        r7.setDataPosition(r1 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        r8.set(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r1 = X.SQJ.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r1 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        if (X.SQJ.A03(r8) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0119, code lost:
        r1 = X.SQJ.A00(r1);
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        if (r11 == 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0123, code lost:
        r0 = r7.dataPosition();
        r1 = r7.createTypedArrayList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012b, code lost:
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012f, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        if (r1.getClassLoader() == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
        if (r11 == 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0148, code lost:
        r0 = r7.dataPosition();
        r1 = r7.readArrayList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0151, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        r0 = X.SQJ.A01(r8);
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015b, code lost:
        if (r11 != 0) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        r1 = r7.dataPosition();
        r0 = (android.os.Parcelable[]) r7.createTypedArray(r0);
        r7.setDataPosition(r1 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016d, code lost:
        r8.set(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0176, code lost:
        if (r11 != 0) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017a, code lost:
        r0 = r7.dataPosition();
        r1 = r7.readStrongBinder();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018b, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018f, code lost:
        if (r11 != 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0191, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0193, code lost:
        r0 = r7.dataPosition();
        r1 = r7.createStringArrayList();
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019f, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a4, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r8.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01aa, code lost:
        if (r0 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ac, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b2, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        if (r1 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ba, code lost:
        if (r1.getClassLoader() == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bc, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c5, code lost:
        r11 = X.C11110SAl.A00(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (r11 != 0) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cd, code lost:
        r0 = r7.dataPosition();
        r1 = r7.readHashMap(r1);
        r7.setDataPosition(r0 + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d9, code lost:
        r8.set(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01de, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r8.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e4, code lost:
        if (r0 == null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e6, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ec, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ee, code lost:
        if (r1 == null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        if (X.SQJ.A03(r8) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fe, code lost:
        r1 = r8.getDeclaringClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0202, code lost:
        if (r1 == null) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0413
            java.lang.Object r2 = r1.A01
            java.lang.Class r2 = (java.lang.Class) r2
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.reflect.Constructor r5 = r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            boolean r22 = r5.isAccessible()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r6 = 1
            r5.setAccessible(r6)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object r3 = r5.newInstance(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            org.microg.safeparcel.SafeParcelable r3 = (org.microg.safeparcel.SafeParcelable) r3     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r3.getClass()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Class r11 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r23 = r11
            android.util.SparseArray r4 = X.Pxe.A0L()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
        L_0x002e:
            if (r11 == 0) goto L_0x0065
            java.lang.reflect.Field[] r10 = r11.getDeclaredFields()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r9 = r10.length     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r2 = 0
        L_0x0036:
            if (r2 >= r9) goto L_0x005a
            r8 = r10[r2]     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r8.isAnnotationPresent(r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r0 == 0) goto L_0x0057
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r0 == 0) goto L_0x005f
            int r7 = r0.value()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object r0 = r4.get(r7)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r0 != 0) goto L_0x03df
            r4.put(r7, r8)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x005a:
            java.lang.Class r11 = r11.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x002e
        L_0x005f:
            java.lang.IllegalStateException r1 = X.Pxe.A0i()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0403
        L_0x0065:
            r7 = r25
            int r9 = r7.readInt()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r2 = X.C11110SAl.A00(r7, r9)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r8 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r21 = 65535(0xffff, float:9.1834E-41)
            r1 = r9 & r21
            r0 = 20293(0x4f45, float:2.8437E-41)
            if (r1 != r0) goto L_0x03cb
            int r2 = r2 + r8
            if (r2 < r8) goto L_0x03b9
            int r0 = r7.dataSize()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r2 > r0) goto L_0x03b9
        L_0x0085:
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r0 >= r2) goto L_0x03a2
            int r9 = r7.readInt()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r20 = r9 & r21
            r0 = r20
            java.lang.Object r8 = r4.get(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r10 = "SafeParcel"
            if (r8 != 0) goto L_0x00bb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = r23.getName()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = "Unknown field id %d in %s, skipping."
            java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r1 = X.C11110SAl.A00(r7, r9)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r0 = r0 + r1
            r7.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0085
        L_0x00bb:
            boolean r12 = r8.isAccessible()     // Catch:{ Exception -> 0x037e }
            r8.setAccessible(r6)     // Catch:{ Exception -> 0x037e }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r8.isAnnotationPresent(r1)     // Catch:{ Exception -> 0x037e }
            r18 = -1
            if (r0 == 0) goto L_0x036b
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r1)     // Catch:{ Exception -> 0x037e }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x037e }
            long r16 = r0.versionCode()     // Catch:{ Exception -> 0x037e }
        L_0x00d6:
            java.lang.Integer r0 = X.C9884Rix.A00(r8)     // Catch:{ Exception -> 0x037e }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x037e }
            java.lang.String r11 = "Version code of %s (%d) is older than object read (%d)."
            switch(r0) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x0172;
                case 2: goto L_0x018b;
                case 3: goto L_0x0105;
                case 4: goto L_0x01de;
                case 5: goto L_0x0153;
                case 6: goto L_0x022c;
                case 7: goto L_0x0245;
                case 8: goto L_0x032a;
                case 9: goto L_0x025e;
                case 10: goto L_0x0277;
                case 11: goto L_0x02a8;
                case 12: goto L_0x02d9;
                case 13: goto L_0x02ee;
                case 14: goto L_0x02ff;
                case 15: goto L_0x0311;
                case 16: goto L_0x01a4;
                default: goto L_0x00e3;
            }     // Catch:{ Exception -> 0x037e }
        L_0x00e3:
            r8.setAccessible(r12)     // Catch:{ Exception -> 0x037e }
            goto L_0x0085
        L_0x00e7:
            android.os.Parcelable$Creator r0 = X.SQJ.A01(r8)     // Catch:{ Exception -> 0x037e }
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x00f3
            r0 = 0
            goto L_0x0101
        L_0x00f3:
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ Exception -> 0x037e }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x037e }
            int r1 = r1 + r11
            r7.setDataPosition(r1)     // Catch:{ Exception -> 0x037e }
        L_0x0101:
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0105:
            java.lang.Class r1 = X.SQJ.A02(r8)     // Catch:{ Exception -> 0x037e }
            if (r1 == 0) goto L_0x013e
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x0133
            boolean r0 = X.SQJ.A03(r8)     // Catch:{ Exception -> 0x037e }
            if (r0 != 0) goto L_0x0133
            android.os.Parcelable$Creator r1 = X.SQJ.A00(r1)     // Catch:{ Exception -> 0x037e }
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 == 0) goto L_0x0151
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.util.ArrayList r1 = r7.createTypedArrayList(r1)     // Catch:{ Exception -> 0x037e }
        L_0x012b:
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x012f:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0133:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x013e
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            goto L_0x0142
        L_0x013e:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x037e }
        L_0x0142:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 == 0) goto L_0x0151
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.util.ArrayList r1 = r7.readArrayList(r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x012b
        L_0x0151:
            r1 = 0
            goto L_0x012f
        L_0x0153:
            android.os.Parcelable$Creator r0 = X.SQJ.A01(r8)     // Catch:{ Exception -> 0x037e }
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x015f
            r0 = 0
            goto L_0x016d
        L_0x015f:
            int r1 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.lang.Object[] r0 = r7.createTypedArray(r0)     // Catch:{ Exception -> 0x037e }
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0     // Catch:{ Exception -> 0x037e }
            int r1 = r1 + r11
            r7.setDataPosition(r1)     // Catch:{ Exception -> 0x037e }
        L_0x016d:
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0172:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x017a
            r1 = 0
            goto L_0x0186
        L_0x017a:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            android.os.IBinder r1 = r7.readStrongBinder()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0186:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x018b:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x0193
            r1 = 0
            goto L_0x019f
        L_0x0193:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.util.ArrayList r1 = r7.createStringArrayList()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x019f:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x01a4:
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r1)     // Catch:{ Exception -> 0x037e }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x01c1
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x037e }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c1
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x01c1
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            goto L_0x01c5
        L_0x01c1:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x037e }
        L_0x01c5:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x01cd
            r1 = 0
            goto L_0x01d9
        L_0x01cd:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.util.HashMap r1 = r7.readHashMap(r1)     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x01d9:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x01de:
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r1)     // Catch:{ Exception -> 0x037e }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x01fe
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x037e }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x01fe
            if (r1 == 0) goto L_0x01fe
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x01fe
            boolean r0 = X.SQJ.A03(r8)     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x0202
        L_0x01fe:
            java.lang.Class r1 = r8.getDeclaringClass()     // Catch:{ Exception -> 0x037e }
        L_0x0202:
            if (r1 == 0) goto L_0x020f
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            if (r0 == 0) goto L_0x020f
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x037e }
            goto L_0x0213
        L_0x020f:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x037e }
        L_0x0213:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x021b
            r1 = 0
            goto L_0x0227
        L_0x021b:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            android.os.Bundle r1 = r7.readBundle(r1)     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0227:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x022c:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x0234
            r1 = 0
            goto L_0x0240
        L_0x0234:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.lang.String[] r1 = r7.createStringArray()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0240:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0245:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x024d
            r1 = 0
            goto L_0x0259
        L_0x024d:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            byte[] r1 = r7.createByteArray()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0259:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x025e:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x0266
            r1 = 0
            goto L_0x0272
        L_0x0266:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            int[] r1 = r7.createIntArray()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0272:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0277:
            r0 = 4
            X.C11110SAl.A01(r7, r9, r0)     // Catch:{ Exception -> 0x037e }
            int r13 = r7.readInt()     // Catch:{ Exception -> 0x037e }
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x029f
            long r0 = (long) r13     // Catch:{ Exception -> 0x037e }
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x029f
            java.lang.Class r0 = r8.getDeclaringClass()     // Catch:{ Exception -> 0x037e }
            java.lang.String r14 = r0.getName()     // Catch:{ Exception -> 0x037e }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x037e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x037e }
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r1, r0}     // Catch:{ Exception -> 0x037e }
            java.lang.String.format(r11, r0)     // Catch:{ Exception -> 0x037e }
        L_0x029f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x037e }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x02a8:
            r0 = 8
            X.C11110SAl.A01(r7, r9, r0)     // Catch:{ Exception -> 0x037e }
            long r14 = r7.readLong()     // Catch:{ Exception -> 0x037e }
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x02d0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d0
            java.lang.Class r0 = r8.getDeclaringClass()     // Catch:{ Exception -> 0x037e }
            java.lang.String r13 = r0.getName()     // Catch:{ Exception -> 0x037e }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x037e }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x037e }
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r1, r0}     // Catch:{ Exception -> 0x037e }
            java.lang.String.format(r11, r0)     // Catch:{ Exception -> 0x037e }
        L_0x02d0:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x037e }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x02d9:
            r0 = 4
            X.C11110SAl.A01(r7, r9, r0)     // Catch:{ Exception -> 0x037e }
            int r0 = r7.readInt()     // Catch:{ Exception -> 0x037e }
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x037e }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x02ee:
            r0 = 4
            X.C11110SAl.A01(r7, r9, r0)     // Catch:{ Exception -> 0x037e }
            float r0 = r7.readFloat()     // Catch:{ Exception -> 0x037e }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x037e }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x02ff:
            r0 = 8
            X.C11110SAl.A01(r7, r9, r0)     // Catch:{ Exception -> 0x037e }
            double r0 = r7.readDouble()     // Catch:{ Exception -> 0x037e }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x037e }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x0311:
            int r11 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x037e }
            if (r11 != 0) goto L_0x0319
            r1 = 0
            goto L_0x0325
        L_0x0319:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r7.readString()     // Catch:{ Exception -> 0x037e }
            int r0 = r0 + r11
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x037e }
        L_0x0325:
            r8.set(r3, r1)     // Catch:{ Exception -> 0x037e }
            goto L_0x00e3
        L_0x032a:
            java.lang.Class r0 = r8.getType()     // Catch:{ Exception -> 0x037e }
            java.lang.Class[] r14 = r0.getDeclaredClasses()     // Catch:{ Exception -> 0x037e }
            int r13 = r14.length     // Catch:{ Exception -> 0x037e }
            r11 = 0
        L_0x0334:
            if (r11 >= r13) goto L_0x036f
            r15 = r14[r11]     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = "asInterface"
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ Exception -> 0x0368 }
            java.lang.reflect.Method r15 = r15.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x0368 }
            r1 = 0
            int r17 = X.C11110SAl.A00(r7, r9)     // Catch:{ Exception -> 0x0368 }
            if (r17 != 0) goto L_0x034e
            r16 = 0
            goto L_0x035b
        L_0x034e:
            int r0 = r7.dataPosition()     // Catch:{ Exception -> 0x0368 }
            android.os.IBinder r16 = r7.readStrongBinder()     // Catch:{ Exception -> 0x0368 }
            int r0 = r0 + r17
            r7.setDataPosition(r0)     // Catch:{ Exception -> 0x0368 }
        L_0x035b:
            java.lang.Object[] r0 = new java.lang.Object[]{r16}     // Catch:{ Exception -> 0x0368 }
            java.lang.Object r0 = r15.invoke(r1, r0)     // Catch:{ Exception -> 0x0368 }
            r8.set(r3, r0)     // Catch:{ Exception -> 0x0368 }
            goto L_0x00e3
        L_0x0368:
            int r11 = r11 + 1
            goto L_0x0334
        L_0x036b:
            r16 = -1
            goto L_0x00d6
        L_0x036f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x037e }
            java.lang.String r0 = "Field has broken interface: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r8, r0, r1)     // Catch:{ Exception -> 0x037e }
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ Exception -> 0x037e }
            throw r0     // Catch:{ Exception -> 0x037e }
        L_0x037e:
            r8 = move-exception
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = r23.getName()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = "Error reading field: %d in %s, skipping."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            android.util.Log.w(r10, r0, r8)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r1 = X.C11110SAl.A00(r7, r9)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            int r0 = r0 + r1
            r7.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0085
        L_0x03a2:
            int r0 = r7.dataPosition()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            if (r0 > r2) goto L_0x03ae
            r0 = r22
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            return r3
        L_0x03ae:
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.002.A0O(r0, r2)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0403
        L_0x03b9:
            r0 = 1384(0x568, float:1.94E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r1 = " end="
            java.lang.String r0 = X.002.A02(r8, r2, r0, r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            X.TQL r1 = new X.TQL     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0403
        L_0x03cb:
            r0 = 1258(0x4ea, float:1.763E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r1 = java.lang.Integer.toHexString(r9)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            X.TQL r1 = new X.TQL     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            goto L_0x0403
        L_0x03df:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r2 = r11.getName()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r1 = r8.getName()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object r0 = r4.get(r7)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = r0.getName()     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.String r0 = "Field number %d is used twice in %s for fields %s and %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
        L_0x0403:
            throw r1     // Catch:{ NoSuchMethodException -> 0x040c, Exception -> 0x0404 }
        L_0x0404:
            r1 = move-exception
            java.lang.String r0 = "Can't construct object"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)
            throw r0
        L_0x040c:
            java.lang.String r0 = "createObject() requires a default constructor"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0413:
            java.lang.Object r0 = r1.A01     // Catch:{ Exception -> 0x041c }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x041c }
            java.lang.Object r3 = X.Pxg.A0i(r0)     // Catch:{ Exception -> 0x041c }
            return r3
        L_0x041c:
            java.lang.Object r0 = r1.A01
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto L_0x0427
            r0 = 0
        L_0x0427:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWY.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        if (this.A00 != 0) {
            return (Object[]) Array.newInstance((Class) this.A01, i);
        }
        return new Object[i];
    }
}
