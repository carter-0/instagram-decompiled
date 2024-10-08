package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3tx  reason: invalid class name and case insensitive filesystem */
public final class C255333tx {
    public Map A00 = new HashMap();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3tw] */
    public final C255323tw A00() {
        Map map = this.A00;
        ? obj = new Object();
        obj.A00 = new HashMap(map);
        C255323tw.A01(obj);
        return obj;
    }

    public final void A01(Object obj, String str) {
        if (obj == null) {
            this.A00.put(str, (Object) null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            this.A00.put(str, obj);
        } else if (cls == boolean[].class) {
            Map map = this.A00;
            boolean[] zArr = (boolean[]) obj;
            C255323tw r0 = C255323tw.A01;
            int length = zArr.length;
            Boolean[] boolArr = new Boolean[length];
            for (int i = 0; i < length; i++) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
            }
            map.put(str, boolArr);
        } else if (cls == byte[].class) {
            Map map2 = this.A00;
            byte[] bArr = (byte[]) obj;
            C255323tw r02 = C255323tw.A01;
            int length2 = bArr.length;
            Byte[] bArr2 = new Byte[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bArr2[i2] = Byte.valueOf(bArr[i2]);
            }
            map2.put(str, bArr2);
        } else if (cls == int[].class) {
            Map map3 = this.A00;
            int[] iArr = (int[]) obj;
            C255323tw r03 = C255323tw.A01;
            int length3 = iArr.length;
            Integer[] numArr = new Integer[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                numArr[i3] = Integer.valueOf(iArr[i3]);
            }
            map3.put(str, numArr);
        } else if (cls == long[].class) {
            Map map4 = this.A00;
            long[] jArr = (long[]) obj;
            C255323tw r04 = C255323tw.A01;
            int length4 = jArr.length;
            Long[] lArr = new Long[length4];
            for (int i4 = 0; i4 < length4; i4++) {
                lArr[i4] = Long.valueOf(jArr[i4]);
            }
            map4.put(str, lArr);
        } else if (cls == float[].class) {
            Map map5 = this.A00;
            float[] fArr = (float[]) obj;
            C255323tw r05 = C255323tw.A01;
            int length5 = fArr.length;
            Float[] fArr2 = new Float[length5];
            for (int i5 = 0; i5 < length5; i5++) {
                fArr2[i5] = Float.valueOf(fArr[i5]);
            }
            map5.put(str, fArr2);
        } else if (cls == double[].class) {
            Map map6 = this.A00;
            double[] dArr = (double[]) obj;
            C255323tw r06 = C255323tw.A01;
            int length6 = dArr.length;
            Double[] dArr2 = new Double[length6];
            for (int i6 = 0; i6 < length6; i6++) {
                dArr2[i6] = Double.valueOf(dArr[i6]);
            }
            map6.put(str, dArr2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Key ");
            sb.append(str);
            sb.append(" has invalid type ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void A02(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A01(entry.getValue(), (String) entry.getKey());
        }
    }
}
