package androidx.work.multiprocess.parcelable;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255323tw;
import X.C7216Pzk;
import X.DbT;
import X.JTO;
import X.Pxf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class ParcelableData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(69);
    public final C255323tw A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A0M;
        byte byteValue;
        Map unmodifiableMap = Collections.unmodifiableMap(this.A00.A00);
        parcel.writeInt(unmodifiableMap.size());
        Iterator A0u = AnonymousClass7TF.A0u(unmodifiableMap);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            if (value == null) {
                byteValue = 0;
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class) {
                    parcel.writeByte((byte) 1);
                    A0M = AnonymousClass7TE.A1a(value);
                } else if (cls == Byte.class) {
                    parcel.writeByte((byte) 2);
                    byteValue = ((Number) value).byteValue();
                } else if (cls == Integer.class) {
                    parcel.writeByte((byte) 3);
                    A0M = AnonymousClass7TE.A0M(value);
                } else {
                    if (cls == Long.class) {
                        parcel.writeByte((byte) 4);
                        Pxf.A18(parcel, (Number) value);
                    } else if (cls == Float.class) {
                        parcel.writeByte((byte) 5);
                        parcel.writeFloat(AnonymousClass7TE.A04(value));
                    } else if (cls == Double.class) {
                        parcel.writeByte((byte) 6);
                        parcel.writeDouble(JTO.A00(value));
                    } else if (cls == String.class) {
                        parcel.writeByte((byte) 7);
                        parcel.writeString((String) value);
                    } else if (cls == Boolean[].class) {
                        parcel.writeByte((byte) 8);
                        Boolean[] boolArr = (Boolean[]) value;
                        int length = boolArr.length;
                        boolean[] zArr = new boolean[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            zArr[i2] = boolArr[i2].booleanValue();
                        }
                        parcel.writeBooleanArray(zArr);
                    } else if (cls == Byte[].class) {
                        parcel.writeByte((byte) 9);
                        Byte[] bArr = (Byte[]) value;
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            bArr2[i3] = bArr[i3].byteValue();
                        }
                        parcel.writeByteArray(bArr2);
                    } else if (cls == Integer[].class) {
                        parcel.writeByte((byte) 10);
                        Integer[] numArr = (Integer[]) value;
                        int length3 = numArr.length;
                        int[] iArr = new int[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            iArr[i4] = JTO.A0A(numArr, i4);
                        }
                        parcel.writeIntArray(iArr);
                    } else if (cls == Long[].class) {
                        parcel.writeByte((byte) 11);
                        Long[] lArr = (Long[]) value;
                        int length4 = lArr.length;
                        long[] jArr = new long[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            jArr[i5] = lArr[i5].longValue();
                        }
                        parcel.writeLongArray(jArr);
                    } else if (cls == Float[].class) {
                        parcel.writeByte((byte) 12);
                        Float[] fArr = (Float[]) value;
                        int length5 = fArr.length;
                        float[] fArr2 = new float[length5];
                        for (int i6 = 0; i6 < length5; i6++) {
                            fArr2[i6] = fArr[i6].floatValue();
                        }
                        parcel.writeFloatArray(fArr2);
                    } else if (cls == Double[].class) {
                        parcel.writeByte((byte) 13);
                        Double[] dArr = (Double[]) value;
                        int length6 = dArr.length;
                        double[] dArr2 = new double[length6];
                        for (int i7 = 0; i7 < length6; i7++) {
                            dArr2[i7] = dArr[i7].doubleValue();
                        }
                        parcel.writeDoubleArray(dArr2);
                    } else if (cls == String[].class) {
                        parcel.writeByte((byte) 14);
                        parcel.writeStringArray((String[]) value);
                    } else {
                        throw AnonymousClass7TF.A0W("Unsupported value type ", cls.getName());
                    }
                    parcel.writeString(A13);
                }
                parcel.writeInt(A0M);
                parcel.writeString(A13);
            }
            parcel.writeByte(byteValue);
            parcel.writeString(A13);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.Double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.Byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.Byte} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3tw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParcelableData(android.os.Parcel r10) {
        /*
            r9 = this;
            r9.<init>()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            int r7 = r10.readInt()
            r5 = 0
        L_0x000c:
            if (r5 >= r7) goto L_0x00f5
            byte r1 = r10.readByte()
            switch(r1) {
                case 0: goto L_0x0020;
                case 1: goto L_0x00e2;
                case 2: goto L_0x0023;
                case 3: goto L_0x002d;
                case 4: goto L_0x0033;
                case 5: goto L_0x0039;
                case 6: goto L_0x0043;
                case 7: goto L_0x004d;
                case 8: goto L_0x0053;
                case 9: goto L_0x006a;
                case 10: goto L_0x0081;
                case 11: goto L_0x0098;
                case 12: goto L_0x00af;
                case 13: goto L_0x00c6;
                case 14: goto L_0x00dd;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 2532(0x9e4, float:3.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            throw r0
        L_0x0020:
            r8 = 0
            goto L_0x00ea
        L_0x0023:
            byte r0 = r10.readByte()
            java.lang.Byte r8 = java.lang.Byte.valueOf(r0)
            goto L_0x00ea
        L_0x002d:
            java.lang.Integer r8 = X.C41847B3o.A12(r10)
            goto L_0x00ea
        L_0x0033:
            java.lang.Long r8 = X.Pxi.A0T(r10)
            goto L_0x00ea
        L_0x0039:
            float r0 = r10.readFloat()
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            goto L_0x00ea
        L_0x0043:
            double r0 = r10.readDouble()
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            goto L_0x00ea
        L_0x004d:
            java.lang.String r8 = r10.readString()
            goto L_0x00ea
        L_0x0053:
            boolean[] r3 = r10.createBooleanArray()
            X.3tw r0 = X.C255323tw.A01
            int r2 = r3.length
            java.lang.Boolean[] r8 = new java.lang.Boolean[r2]
            r1 = 0
        L_0x005d:
            if (r1 >= r2) goto L_0x00ea
            boolean r0 = r3[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x005d
        L_0x006a:
            byte[] r3 = r10.createByteArray()
            X.3tw r0 = X.C255323tw.A01
            int r2 = r3.length
            java.lang.Byte[] r8 = new java.lang.Byte[r2]
            r1 = 0
        L_0x0074:
            if (r1 >= r2) goto L_0x00ea
            byte r0 = r3[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x0074
        L_0x0081:
            int[] r3 = r10.createIntArray()
            X.3tw r0 = X.C255323tw.A01
            int r2 = r3.length
            java.lang.Integer[] r8 = new java.lang.Integer[r2]
            r1 = 0
        L_0x008b:
            if (r1 >= r2) goto L_0x00ea
            r0 = r3[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x008b
        L_0x0098:
            long[] r4 = r10.createLongArray()
            X.3tw r0 = X.C255323tw.A01
            int r3 = r4.length
            java.lang.Long[] r8 = new java.lang.Long[r3]
            r2 = 0
        L_0x00a2:
            if (r2 >= r3) goto L_0x00ea
            r0 = r4[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8[r2] = r0
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00af:
            float[] r3 = r10.createFloatArray()
            X.3tw r0 = X.C255323tw.A01
            int r2 = r3.length
            java.lang.Float[] r8 = new java.lang.Float[r2]
            r1 = 0
        L_0x00b9:
            if (r1 >= r2) goto L_0x00ea
            r0 = r3[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c6:
            double[] r4 = r10.createDoubleArray()
            X.3tw r0 = X.C255323tw.A01
            int r3 = r4.length
            java.lang.Double[] r8 = new java.lang.Double[r3]
            r2 = 0
        L_0x00d0:
            if (r2 >= r3) goto L_0x00ea
            r0 = r4[r2]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r8[r2] = r0
            int r2 = r2 + 1
            goto L_0x00d0
        L_0x00dd:
            java.lang.String[] r8 = r10.createStringArray()
            goto L_0x00ea
        L_0x00e2:
            boolean r0 = X.Pxg.A1U(r10)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x00ea:
            java.lang.String r0 = r10.readString()
            r6.put(r0, r8)
            int r5 = r5 + 1
            goto L_0x000c
        L_0x00f5:
            X.3tw r1 = new X.3tw
            r1.<init>()
            java.util.HashMap r0 = X.Pxe.A19(r6)
            r1.A00 = r0
            r9.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableData.<init>(android.os.Parcel):void");
    }

    public ParcelableData(C255323tw r1) {
        this.A00 = r1;
    }
}
