package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.6Tw  reason: invalid class name and case insensitive filesystem */
public final class C308336Tw {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = 1;
    public static final Object A0B = "true";
    public static final Object A0C = 0;
    public int A00;
    public int A01;
    public int A02;
    public C308346Tx A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Random A06 = new Random();
    public final Object A07 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r4 > 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r4 < 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r9 != 1) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L_0x003b
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x003b
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0024:
            if (r9 == 0) goto L_0x006e
            if (r9 == r5) goto L_0x0069
        L_0x0028:
            if (r9 == r6) goto L_0x0038
            if (r4 > 0) goto L_0x002d
        L_0x002c:
            r7 = 1
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A05(r5, r0)
            A0C(r8)
            return
        L_0x0038:
            if (r4 >= 0) goto L_0x002d
            goto L_0x002c
        L_0x003b:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L_0x0024
        L_0x004c:
            java.lang.Number r1 = A03(r2)
            java.lang.Number r0 = A03(r4)
            if (r1 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0071
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L_0x006c
            if (r9 == r5) goto L_0x0067
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0028
        L_0x0067:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0069:
            if (r4 <= 0) goto L_0x002d
            goto L_0x002c
        L_0x006c:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x006e:
            if (r4 < 0) goto L_0x002d
            goto L_0x002c
        L_0x0071:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.002.A0R(r0, r10)
            A0G(r2, r4, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308336Tw.A08(int, java.lang.String):void");
    }

    public static int A01(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (C308356Ty.A01(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (obj instanceof C280064zw) {
            return 8;
        }
        return 5;
    }

    public static Long A02(Object obj) {
        long doubleValue;
        Long l;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return l;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                doubleValue = 1;
            } else {
                doubleValue = 0;
            }
        } else if (!C308356Ty.A01(obj)) {
            return null;
        } else {
            doubleValue = (long) ((Number) obj).doubleValue();
        }
        return Long.valueOf(doubleValue);
    }

    public static Number A04(Object obj) {
        int doubleValue;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            doubleValue = number.intValue();
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return Q0A.A00(d);
        } else if (!C308356Ty.A01(obj)) {
            return null;
        } else {
            doubleValue = (int) ((long) ((Number) obj).doubleValue());
        }
        d = (double) doubleValue;
        return Q0A.A00(d);
    }

    private void A05(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    private void A06(int i, String str) {
        double doubleValue;
        int i2;
        int i3 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i3];
        Object obj2 = objArr[i3 - 1];
        Number A032 = A03(obj2);
        Number A033 = A03(obj);
        if (A032 == null || A033 == null) {
            A0G(obj2, obj, 002.A0R("Incompatible operand types of ", str));
            throw AnonymousClass00P.createAndThrow();
        }
        switch (i) {
            case 0:
                doubleValue = A032.doubleValue() * A033.doubleValue();
                break;
            case 1:
                i2 = (int) ((A032.longValue() & 4294967295L) * (A033.longValue() & 4294967295L));
                break;
            case 2:
                doubleValue = A032.doubleValue() / A033.doubleValue();
                break;
            case 3:
                doubleValue = A032.doubleValue() % A033.doubleValue();
                break;
            case 4:
                doubleValue = A032.doubleValue() - A033.doubleValue();
                break;
            case 5:
                doubleValue = A032.doubleValue() + A033.doubleValue();
                break;
            case 6:
                i2 = ((int) ((long) A032.doubleValue())) & ((int) ((long) A033.doubleValue()));
                break;
            case 7:
                i2 = ((int) ((long) A032.doubleValue())) | ((int) ((long) A033.doubleValue()));
                break;
            case 8:
                i2 = ((int) ((long) A032.doubleValue())) ^ ((int) ((long) A033.doubleValue()));
                break;
            case 9:
                i2 = ((int) ((long) A032.doubleValue())) << (((int) ((long) A033.doubleValue())) & 31);
                break;
            case 10:
                i2 = ((int) ((long) A032.doubleValue())) >> (((int) ((long) A033.doubleValue())) & 31);
                break;
            default:
                doubleValue = (double) (((long) (((int) ((long) A032.doubleValue())) >>> (((int) ((long) A033.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        doubleValue = (double) i2;
        A05(1, Q0A.A00(doubleValue));
        A0C(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        throw new java.lang.RuntimeException(X.002.A0R("TypeError: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        A05(1, java.lang.Long.valueOf(r5));
        A0C(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(int r10, java.lang.String r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r9.A05
            r3 = r0[r1]
            r2 = 1
            int r1 = r1 - r2
            r1 = r0[r1]
            java.lang.Long r8 = A02(r1)
            java.lang.Long r7 = A02(r3)
            if (r8 == 0) goto L_0x00c0
            if (r7 == 0) goto L_0x00c0
            r5 = 0
            r0 = 63
            switch(r10) {
                case 12: goto L_0x00b5;
                case 13: goto L_0x004a;
                case 14: goto L_0x0035;
                case 15: goto L_0x00aa;
                case 16: goto L_0x00a0;
                case 17: goto L_0x0096;
                case 18: goto L_0x008c;
                case 19: goto L_0x0082;
                case 20: goto L_0x0076;
                case 21: goto L_0x006a;
                default: goto L_0x001f;
            }
        L_0x001f:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 >>> r0
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r9.A05(r2, r0)
            A0C(r9)
            return
        L_0x0035:
            long r3 = r7.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "INT64_MOD division by zero"
            goto L_0x0054
        L_0x0040:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 % r0
            goto L_0x002a
        L_0x004a:
            long r3 = r7.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            java.lang.String r1 = "INT64_DIV division by zero"
        L_0x0054:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.6U1 r1 = new X.6U1
            r1.<init>(r0)
            throw r1
        L_0x0060:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 / r0
            goto L_0x002a
        L_0x006a:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 >> r0
            goto L_0x002a
        L_0x0076:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 << r0
            goto L_0x002a
        L_0x0082:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 ^ r0
            goto L_0x002a
        L_0x008c:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 | r0
            goto L_0x002a
        L_0x0096:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 & r0
            goto L_0x002a
        L_0x00a0:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 + r0
            goto L_0x002a
        L_0x00aa:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 - r0
            goto L_0x002a
        L_0x00b5:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 * r0
            goto L_0x002a
        L_0x00c0:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.002.A0R(r0, r11)
            A0G(r1, r3, r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308336Tw.A07(int, java.lang.String):void");
    }

    public static void A09(C308306Tt r5, StringBuilder sb, int i) {
        C308296Ts r3 = r5.A00;
        AnonymousClass6Tr r2 = r3.A03;
        ByteBuffer byteBuffer = r2.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i2 = r3.A02;
        duplicate.position(i2);
        duplicate.limit(r3.A00 + i2);
        if ((duplicate.get(i) & 255) == 4) {
            sb.append("  at extension function ");
            sb.append((String) r2.A01(duplicate.getShort(i + 1) & 65535));
            sb.append(10);
        }
        sb.append("  at offset ");
        sb.append(i - r2.A03[2].A02);
        sb.append("  (offset ");
        sb.append(i - i2);
        sb.append(" in function ");
        sb.append((String) r2.A01(r3.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(r2.A00);
        sb.append('\"');
        sb.append("\n");
    }

    public static void A0A(C308306Tt r3, StringBuilder sb, int i, boolean z) {
        Object obj;
        S5V AgN;
        if (z) {
            sb.append("\n");
        }
        AnonymousClass6Tr r2 = r3.A00.A03;
        int i2 = i - r2.A03[2].A02;
        Map map = r2.A02;
        if (map == null) {
            obj = null;
        } else {
            obj = map.get(Integer.valueOf(i2));
        }
        C276634te Bxl = r3.Bxl();
        if (Bxl == null) {
            AgN = null;
        } else {
            AgN = Bxl.AgN();
        }
        if (AgN != null) {
            sb.append(AgN.A01);
            sb.append(":");
            if (obj == null) {
                obj = "(unsymbolicated)";
            }
            sb.append(obj);
            return;
        }
        sb.append("(unsymbolicated)");
    }

    public static void A0C(C308336Tw r3) {
        int i = r3.A01 - 1;
        r3.A01 = i;
        r3.A05[i] = null;
    }

    public static void A0D(C308336Tw r5, int i) {
        Object[] objArr = r5.A05;
        int length = objArr.length;
        int i2 = r5.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw new IllegalStateException("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            r5.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(r5.A04, 0, iArr, 0, r5.A01);
            r5.A04 = iArr;
        }
    }

    public static void A0E(C308336Tw r2, Object obj) {
        Object[] objArr = r2.A05;
        int i = r2.A01;
        objArr[i] = obj;
        r2.A01 = i + 1;
    }

    public static void A0G(Object obj, Object obj2, String str) {
        String name;
        String name2;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        if (obj2 == null) {
            name2 = "null";
        } else {
            name2 = obj2.getClass().getName();
        }
        throw new RuntimeException(002.A13("TypeError: ", str, ". Got ", name, " and ", name2));
    }

    public static final void A0H(String str, Object obj) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw new RuntimeException(002.A0u("TypeError: ", str, ". Got ", name));
    }

    public static boolean A0I(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        boolean z = false;
        if (obj == null) {
            z = true;
        }
        if (!z) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (C308356Ty.A01(obj)) {
                double doubleValue = ((Number) obj).doubleValue();
                if (doubleValue == 0.0d || Double.isNaN(doubleValue)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Long) || ((Number) obj).longValue() != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A0J(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            i2 = (int) longValue;
            i3 = (((long) i2) > longValue ? 1 : (((long) i2) == longValue ? 0 : -1));
        } else {
            if (C308356Ty.A01(obj)) {
                double doubleValue = ((Number) obj).doubleValue();
                i2 = (int) doubleValue;
                i3 = (((double) i2) > doubleValue ? 1 : (((double) i2) == doubleValue ? 0 : -1));
            }
            throw new RuntimeException(002.A0R("TypeError: ", str));
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        throw new RuntimeException(002.A0R("TypeError: ", str));
    }

    public final Object A0K(Object obj) {
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Long) {
            return Long.toString(((Number) obj).longValue());
        } else {
            if (C308356Ty.A01(obj)) {
                double doubleValue = ((Number) obj).doubleValue();
                int i = (int) doubleValue;
                if (((double) i) == doubleValue) {
                    return Integer.toString(i);
                }
                String d = Double.toString(doubleValue);
                int indexOf = d.indexOf(69);
                if (indexOf < 0) {
                    return d;
                }
                int length = d.length();
                int i2 = length + 1;
                char[] cArr = new char[i2];
                d.getChars(0, indexOf, cArr, 0);
                cArr[indexOf] = 'e';
                int i3 = indexOf + 1;
                if (d.charAt(i3) == '-') {
                    d.getChars(i3, length, cArr, i3);
                } else {
                    cArr[i3] = '+';
                    d.getChars(i3, length, cArr, indexOf + 2);
                    length = i2;
                }
                return new String(cArr, 0, length);
            } else if (obj instanceof String) {
                return obj;
            } else {
                A0H("Value cannot be converted to string", obj);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void A0L(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    public static double A00(Object obj) {
        Number number;
        if (C308356Ty.A01(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        } else if (obj instanceof Long) {
            return (double) ((Number) obj).longValue();
        } else {
            return Double.NaN;
        }
    }

    public static Number A03(Object obj) {
        Object obj2;
        Number number;
        if (C308356Ty.A01(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (C308356Ty.A01(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return Q0A.A00((double) ((Number) obj).longValue());
        } else {
            return null;
        }
    }

    public static void A0F(C308336Tw r3, Object obj, Object obj2, int i, int i2) {
        A0E(r3, obj);
        int[] iArr = r3.A04;
        int i3 = r3.A01;
        iArr[i3] = i;
        r3.A01 = i3 + 1;
        A0E(r3, obj2);
        int i4 = r3.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        r3.A01 = i5;
        iArr[i5] = r3.A00;
        int i6 = i5 + 1;
        r3.A01 = i6;
        r3.A00 = i6 - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v76, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v77, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v817, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v818, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v819, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v820, resolved type: java.lang.Number} */
    /* JADX WARNING: type inference failed for: r2v93, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c8, code lost:
        r10.A05(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03eb, code lost:
        r10.A05(0, r10.A0K(r10.A05[r10.A01 - 1]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x045e, code lost:
        r0 = X.AnonymousClass000.A00(844);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0466, code lost:
        if (r4 != null) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0468, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x046a, code lost:
        r1 = X.002.A05(r2, "Type assertion failed. Expected ", r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0470, code lost:
        r1 = r4.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0676, code lost:
        if (r1 == null) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x013c, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06e7, code lost:
        A0H(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016c, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x078c, code lost:
        X.C308366Tz.A01(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0176, code lost:
        r19.position(r2 + r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0826, code lost:
        if (r1 == null) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0186, code lost:
        r19.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b6d, code lost:
        X.C308366Tz.A01(r6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c17, code lost:
        r1 = new java.lang.RuntimeException(X.002.A0R("TypeError: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c75, code lost:
        X.C308366Tz.A01(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0f11, code lost:
        r10.A05(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x10d6, code lost:
        r1 = new java.lang.RuntimeException(X.002.A0R("RangeError: ", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0228, code lost:
        if (r0 == 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x131e, code lost:
        r1 = X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:908:0x13c4, code lost:
        r10.A05(r12, r1);
        r10.A0L(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x13f7, code lost:
        r1 = "Substring offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x13fd, code lost:
        r1 = "SubstringCompare offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x1403, code lost:
        r1 = "StringSearch offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:920:0x1418, code lost:
        r1 = "ArrayCopy dst index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x141b, code lost:
        r1 = "ArrayCopy src index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x1424, code lost:
        r3 = new java.lang.RuntimeException(X.002.A0R("RangeError: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:0x143a, code lost:
        r3 = new X.AnonymousClass6U0(X.002.A0R("InvalidBytecode: ", r4));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:969:0x1451 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C308336Tw r28) {
        /*
            r18 = 4
            r10 = r28
            int r1 = r10.A00
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6Tt r17 = X.C308356Ty.A00(r0)
            r0 = r17
            X.6Ts r2 = r0.A00
            X.6Tr r0 = r2.A03
            r28 = r0
            java.nio.ByteBuffer r0 = r0.A01
            java.nio.ByteBuffer r19 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r19
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r19
            r0.limit(r1)
            int r1 = r19.position()
            byte r0 = r0.get(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 2
            r8 = 1
            r7 = 0
            if (r0 != r9) goto L_0x14ce
            r16 = 0
            r20 = 0
        L_0x0047:
            int r16 = r19.position()     // Catch:{ 6U1 -> 0x145d }
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r4 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r5 = "vector index out of range"
            java.lang.String r1 = "key %s not in map"
            r25 = 0
            java.lang.String r2 = "invalid get_by_val vector index"
            java.lang.String r3 = "modifying immutable container"
            r11 = 3
            switch(r4) {
                case 0: goto L_0x008a;
                case 1: goto L_0x1323;
                case 2: goto L_0x0dc8;
                case 3: goto L_0x0d9e;
                case 4: goto L_0x122c;
                case 5: goto L_0x0607;
                case 6: goto L_0x05c3;
                case 7: goto L_0x1207;
                case 8: goto L_0x0594;
                case 9: goto L_0x11c1;
                case 10: goto L_0x04f5;
                case 11: goto L_0x13cc;
                case 12: goto L_0x0061;
                case 13: goto L_0x0d97;
                case 14: goto L_0x0ca7;
                case 15: goto L_0x03b0;
                case 16: goto L_0x1196;
                case 17: goto L_0x1151;
                case 18: goto L_0x12e1;
                case 19: goto L_0x1064;
                case 20: goto L_0x1010;
                case 21: goto L_0x0fbe;
                case 22: goto L_0x0fbe;
                case 23: goto L_0x0fa7;
                case 24: goto L_0x0f7f;
                case 25: goto L_0x0f7f;
                case 26: goto L_0x0f42;
                case 27: goto L_0x0ec4;
                case 28: goto L_0x0e8a;
                case 29: goto L_0x0e8a;
                case 30: goto L_0x0efa;
                case 31: goto L_0x10f2;
                case 32: goto L_0x10f2;
                case 33: goto L_0x04e8;
                case 34: goto L_0x12fe;
                case 35: goto L_0x04bd;
                case 36: goto L_0x048f;
                case 37: goto L_0x0479;
                case 38: goto L_0x043f;
                case 39: goto L_0x0439;
                case 40: goto L_0x0d90;
                case 41: goto L_0x0d89;
                case 42: goto L_0x042c;
                case 43: goto L_0x041f;
                case 44: goto L_0x0411;
                case 45: goto L_0x0403;
                case 46: goto L_0x0e45;
                case 47: goto L_0x0e77;
                case 48: goto L_0x03cd;
                case 49: goto L_0x03eb;
                case 50: goto L_0x039b;
                case 51: goto L_0x0386;
                case 52: goto L_0x0371;
                case 53: goto L_0x0348;
                case 54: goto L_0x0333;
                case 55: goto L_0x0315;
                case 56: goto L_0x02fc;
                case 57: goto L_0x02cd;
                case 58: goto L_0x02aa;
                case 59: goto L_0x0d82;
                case 60: goto L_0x0d7b;
                case 61: goto L_0x0d74;
                case 62: goto L_0x0d6d;
                case 63: goto L_0x0d64;
                case 64: goto L_0x0e4e;
                case 65: goto L_0x0283;
                case 66: goto L_0x0d5c;
                case 67: goto L_0x0d54;
                case 68: goto L_0x0d4b;
                case 69: goto L_0x0d42;
                case 70: goto L_0x0d39;
                case 71: goto L_0x0d30;
                case 72: goto L_0x0260;
                case 73: goto L_0x0d27;
                case 74: goto L_0x0d1e;
                case 75: goto L_0x0d15;
                case 76: goto L_0x0d0c;
                case 77: goto L_0x0d03;
                case 78: goto L_0x023b;
                case 79: goto L_0x0cfa;
                case 80: goto L_0x0cf1;
                case 81: goto L_0x0ce8;
                case 82: goto L_0x0cdf;
                case 83: goto L_0x0cd6;
                case 84: goto L_0x0ccd;
                case 85: goto L_0x018b;
                case 86: goto L_0x018b;
                case 87: goto L_0x0cc6;
                case 88: goto L_0x0cbf;
                case 89: goto L_0x0cb8;
                case 90: goto L_0x0cb1;
                case 91: goto L_0x0183;
                case 92: goto L_0x017f;
                case 93: goto L_0x0156;
                case 94: goto L_0x013f;
                case 95: goto L_0x0126;
                case 96: goto L_0x010f;
                case 97: goto L_0x016f;
                case 98: goto L_0x0107;
                case 99: goto L_0x00c7;
                case 100: goto L_0x0c96;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x1430
        L_0x0061:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r3 = 12
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r3 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x145c
        L_0x007e:
            java.lang.String r1 = "Expected stack value of string type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x06e7
        L_0x008a:
            short r1 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            java.lang.Object[] r4 = r0.A03     // Catch:{ 6U1 -> 0x145d }
            X.4uL r3 = r0.A01     // Catch:{ 6U1 -> 0x145d }
            if (r5 != 0) goto L_0x00a2
            r2 = 0
            goto L_0x00b3
        L_0x00a2:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ 6U1 -> 0x145d }
            int r11 = r5 + -1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r6 = r0 + -1
            int r6 = r6 - r11
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r6, r2, r7, r5)     // Catch:{ 6U1 -> 0x145d }
            r10.A0L(r5)     // Catch:{ 6U1 -> 0x145d }
        L_0x00b3:
            r0 = r28
            X.6Ts r0 = r0.A00(r1)     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r1 = new X.6Tt     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0, r3, r2, r4)     // Catch:{ 6U1 -> 0x145d }
            X.4zw r0 = new X.4zw     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x00c7:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r3 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ 6U1 -> 0x145d }
            int r2 = r3 + -1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r1, r4, r7, r3)     // Catch:{ 6U1 -> 0x145d }
            r10.A0L(r3)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "target is not a closure"
            goto L_0x06e7
        L_0x00ee:
            X.6Tt r0 = X.C308356Ty.A00(r2)     // Catch:{ 6U1 -> 0x145d }
            X.6Ts r3 = r0.A00     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r2 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            X.4uL r0 = r0.A01     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r1 = new X.6Tt     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r3, r0, r2, r4)     // Catch:{ 6U1 -> 0x145d }
            X.4zw r0 = new X.4zw     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0107:
            int r2 = r19.getInt()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0176
        L_0x010f:
            int r2 = r19.getInt()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x013c
        L_0x0126:
            short r2 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
        L_0x013c:
            if (r0 != 0) goto L_0x0047
            goto L_0x0176
        L_0x013f:
            int r2 = r19.getInt()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x016c
        L_0x0156:
            short r2 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
        L_0x016c:
            if (r0 == 0) goto L_0x0047
            goto L_0x0176
        L_0x016f:
            short r2 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
        L_0x0176:
            int r2 = r2 + r16
            r0 = r19
            r0.position(r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x017f:
            r19.getInt()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0186
        L_0x0183:
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
        L_0x0186:
            r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x018b:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r3 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r8
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            if (r1 != 0) goto L_0x019e
            r2 = 0
            if (r3 != 0) goto L_0x022b
            r2 = 1
            goto L_0x022b
        L_0x019e:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            r11 = 1
            r2 = 0
            if (r0 == 0) goto L_0x01b8
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 6U1 -> 0x145d }
            boolean r5 = r0.booleanValue()     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r3 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x01ea
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r3.booleanValue()     // Catch:{ 6U1 -> 0x145d }
            if (r5 != r0) goto L_0x0224
            goto L_0x022a
        L_0x01b8:
            boolean r0 = X.C308356Ty.A01(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x01d2
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 6U1 -> 0x145d }
            double r5 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308356Ty.A01(r3)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x01ea
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 6U1 -> 0x145d }
            double r1 = r3.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0226
        L_0x01d2:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x01ff
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 6U1 -> 0x145d }
            long r5 = r0.longValue()     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r3 instanceof java.lang.Long     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x01ea
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 6U1 -> 0x145d }
            long r1 = r3.longValue()     // Catch:{ 6U1 -> 0x145d }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            goto L_0x0228
        L_0x01ea:
            java.lang.Number r1 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x022b
            java.lang.Number r0 = A03(r3)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x022b
            double r5 = r1.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            double r1 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0226
        L_0x01ff:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0210
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0224
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1.equals(r3)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0224
            goto L_0x022a
        L_0x0210:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0221
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0221
            boolean r0 = r1 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0221
            boolean r2 = r1.equals(r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x022b
        L_0x0221:
            if (r1 != r3) goto L_0x0224
            goto L_0x022a
        L_0x0224:
            r11 = 0
            goto L_0x022a
        L_0x0226:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
        L_0x0228:
            if (r0 != 0) goto L_0x0224
        L_0x022a:
            r2 = r11
        L_0x022b:
            r1 = 86
            r0 = 0
            if (r4 != r1) goto L_0x0231
            r0 = 1
        L_0x0231:
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r8, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x12fe
        L_0x023b:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Long r0 = A02(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0259
            long r2 = r0.longValue()     // Catch:{ 6U1 -> 0x145d }
            r0 = -1
            long r2 = r2 ^ r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0259:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0260:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Long r0 = A02(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x027c
            long r2 = r0.longValue()     // Catch:{ 6U1 -> 0x145d }
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x027c:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0283:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x02a3
            double r2 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            long r0 = (long) r2     // Catch:{ 6U1 -> 0x145d }
            int r2 = (int) r0     // Catch:{ 6U1 -> 0x145d }
            r0 = r2 ^ -1
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x02a3:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x02aa:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x02c6
            double r2 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            double r0 = -r2
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x02c6:
            java.lang.String r0 = "NEG operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x02cd:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x02f5
            double r1 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f0
            double r0 = java.lang.Math.floor(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x02e7:
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x02f0:
            double r0 = java.lang.Math.ceil(r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x02e7
        L_0x02f5:
            java.lang.String r0 = "TRUNC operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x02fc:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r1 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            if (r1 != 0) goto L_0x030c
            r0 = 1
        L_0x030c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0315:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1.booleanValue()     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0330
            java.lang.Object r0 = A0A     // Catch:{ 6U1 -> 0x145d }
        L_0x032b:
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0330:
            java.lang.Object r0 = A0C     // Catch:{ 6U1 -> 0x145d }
            goto L_0x032b
        L_0x0333:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0348:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A04(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x036a
            long r2 = r0.longValue()     // Catch:{ 6U1 -> 0x145d }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            double r0 = (double) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x036a:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0371:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A04(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x03c8
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0386:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Long r0 = A02(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x03c8
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x039b:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x03c8
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x03b0:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r10.A0J(r2, r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r0.<init>()     // Catch:{ 6U1 -> 0x145d }
            r0.ensureCapacity(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x03c8:
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x03cd:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A04(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x03fc
            int r1 = r0.intValue()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x03eb:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = r10.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x03fc:
            java.lang.String r0 = "CHR16 operand must be numeric"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0403:
            int r0 = r19.getInt()     // Catch:{ 6U1 -> 0x145d }
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0411:
            short r0 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x041f:
            double r0 = r19.getDouble()     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x042c:
            long r0 = r19.getLong()     // Catch:{ 6U1 -> 0x145d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0439:
            r0 = 0
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x043f:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r4 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r1 = A01(r4)     // Catch:{ 6U1 -> 0x145d }
            r0 = 100
            if (r2 != r0) goto L_0x045c
            r0 = r18
            if (r1 == r0) goto L_0x0047
            if (r1 == r11) goto L_0x0047
            goto L_0x045e
        L_0x045c:
            if (r1 == r2) goto L_0x0047
        L_0x045e:
            java.lang.String r3 = "Type assertion failed. Expected "
            r0 = 844(0x34c, float:1.183E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x0470
            java.lang.String r1 = "null"
        L_0x046a:
            java.lang.String r1 = X.002.A05(r2, r3, r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0c17
        L_0x0470:
            java.lang.Class r1 = r4.getClass()     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = r1.getName()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x046a
        L_0x0479:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r0 = A01(r0)     // Catch:{ 6U1 -> 0x145d }
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x048f:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            r0 = r20
            if (r3 >= r0) goto L_0x049b
            r2 = 1
        L_0x049b:
            java.lang.String r1 = "invalid local store index"
            if (r2 != 0) goto L_0x04ac
            java.lang.String r0 = "InvalidBytecode: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U0 r1 = new X.6U0     // Catch:{ 6U1 -> 0x145d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x04ac:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r2[r0]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ 6U1 -> 0x145d }
            goto L_0x12fe
        L_0x04bd:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            r0 = r20
            if (r3 >= r0) goto L_0x04c9
            r2 = 1
        L_0x04c9:
            java.lang.String r1 = "invalid local load index"
            if (r2 != 0) goto L_0x04da
            java.lang.String r0 = "InvalidBytecode: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U0 r1 = new X.6U0     // Catch:{ 6U1 -> 0x145d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x04da:
            int r0 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0 + r3
            int r1 = r0 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x04e8:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x04f5:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            int r1 = r1 - r14
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r3 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r2 = 10
            boolean r0 = r3 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0585
            X.C308356Ty.A00(r3)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r11 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r11 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0522
            java.util.List r11 = (java.util.List) r11     // Catch:{ 6U1 -> 0x145d }
            int r6 = r11.size()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0526
        L_0x0522:
            if (r11 != 0) goto L_0x057e
            r11 = 0
            r6 = 0
        L_0x0526:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r12
            if (r0 >= r6) goto L_0x0530
            java.lang.String r1 = "too many arguments to apply"
            goto L_0x0c17
        L_0x0530:
            int r5 = r12 + r6
            int r13 = r5 + 1
            A0D(r10, r13)     // Catch:{ 6U1 -> 0x145d }
            int r4 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r2 = r4 + -1
            int r2 = r2 - r12
            int r13 = r13 + r4
            r10.A01 = r13     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r1 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            java.util.Arrays.fill(r1, r4, r13, r0)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r4 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0[r4] = r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r2, r0, r1, r12)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 + r12
            if (r11 == 0) goto L_0x0562
            r2 = 0
        L_0x0552:
            if (r2 >= r6) goto L_0x0562
            int r12 = r1 + 1
            java.lang.Object r4 = r11.get(r2)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0[r1] = r4     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 + 1
            r1 = r12
            goto L_0x0552
        L_0x0562:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r0 = r16
            A0F(r10, r3, r1, r5, r0)     // Catch:{ 6U1 -> 0x145d }
            A0B(r10)     // Catch:{ 6U1 -> 0x145d }
            int r12 = r14 + 1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            goto L_0x13c4
        L_0x057e:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            A0H(r0, r11)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0585:
            java.lang.String r1 = "Expected stack value of closure type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0594:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = X.C308356Ty.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x05b4
            int r2 = r0.length     // Catch:{ 6U1 -> 0x145d }
        L_0x05ab:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r11
            int[] r0 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 + r0
            goto L_0x05b6
        L_0x05b4:
            r2 = 0
            goto L_0x05ab
        L_0x05b6:
            r0 = 0
            if (r2 != r3) goto L_0x05ba
            r0 = 1
        L_0x05ba:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x05c3:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = X.C308356Ty.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r5 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r5 == 0) goto L_0x05eb
            int r3 = r5.length     // Catch:{ 6U1 -> 0x145d }
        L_0x05da:
            int r2 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r2 - r11
            int[] r0 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            if (r4 >= r3) goto L_0x05ed
            r0 = r5[r4]     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x05eb:
            r3 = 0
            goto L_0x05da
        L_0x05ed:
            int r0 = r3 + r1
            if (r4 >= r0) goto L_0x0601
            int r4 = r4 - r3
            int r1 = r1 - r4
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r2 = r2 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0601:
            r0 = 0
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0607:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            X.6Tz r6 = new X.6Tz     // Catch:{ 6U1 -> 0x145d }
            r6.<init>(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            switch(r1) {
                case 0: goto L_0x061d;
                case 1: goto L_0x0c7a;
                case 2: goto L_0x0638;
                case 3: goto L_0x067e;
                case 4: goto L_0x06c3;
                case 5: goto L_0x0707;
                case 6: goto L_0x071d;
                case 7: goto L_0x0741;
                case 8: goto L_0x0791;
                case 9: goto L_0x082e;
                case 10: goto L_0x0863;
                case 11: goto L_0x08e7;
                case 12: goto L_0x09a3;
                case 13: goto L_0x0a84;
                case 14: goto L_0x0b73;
                case 15: goto L_0x0b8c;
                case 16: goto L_0x0be2;
                case 17: goto L_0x0c0f;
                case 18: goto L_0x0c40;
                default: goto L_0x061b;
            }     // Catch:{ 6U1 -> 0x145d }
        L_0x061b:
            goto L_0x141e
        L_0x061d:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r9) goto L_0x0623
            r1 = 1
        L_0x0623:
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r2 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r4 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0b57
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
            goto L_0x06e7
        L_0x0638:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 1
            if (r0 == r8) goto L_0x063e
            r1 = 0
        L_0x063e:
            java.lang.String r0 = "ParseNumber requires one argument"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308356Ty.A01(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0676
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x065d
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 6U1 -> 0x145d }
            long r0 = r1.longValue()     // Catch:{ 6U1 -> 0x145d }
            double r2 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r1 = X.Q0A.A00(r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0676
        L_0x065d:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0672
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C46650DiV.A00(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0678
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0678 }
            java.lang.Number r1 = X.Q0A.A00(r0)     // Catch:{ NumberFormatException -> 0x0678 }
            goto L_0x0676
        L_0x0672:
            java.lang.Number r1 = A03(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x0676:
            if (r1 != 0) goto L_0x0679
        L_0x0678:
            r1 = 0
        L_0x0679:
            X.C308366Tz.A01(r6, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x067e:
            int r2 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            r0 = r18
            if (r2 != r0) goto L_0x0686
            r1 = 1
        L_0x0686:
            java.lang.String r0 = "StringReplace requires 4 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            X.6Tw r1 = r6.A02     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r3 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r2 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x06be
            java.lang.String r0 = r3.replaceAll(r2, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x06b9:
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x06be:
            java.lang.String r0 = r3.replaceFirst(r2, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x06b9
        L_0x06c3:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r11) goto L_0x06c9
            r1 = 1
        L_0x06c9:
            java.lang.String r0 = "MapPutAll requires 3 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r2 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x06e1
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x06e1:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x06ec
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
        L_0x06e7:
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x06ec:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 6U1 -> 0x145d }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r2 == r1) goto L_0x0701
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x06fe }
            goto L_0x0701
        L_0x06fe:
            r1 = move-exception
            if (r0 != 0) goto L_0x1362
        L_0x0701:
            r0 = 0
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0707:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r2.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
        L_0x070f:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            if (r1 >= r0) goto L_0x078c
            java.lang.Object r0 = X.C308366Tz.A00(r6, r1)     // Catch:{ 6U1 -> 0x145d }
            r2.add(r0)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 + 1
            goto L_0x070f
        L_0x071d:
            int r1 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0727
            java.lang.String r1 = "MakeSmallMap requires an even number of arguments"
            goto L_0x0c17
        L_0x0727:
            int r4 = r1 / 2
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r4)     // Catch:{ 6U1 -> 0x145d }
            r2 = 0
        L_0x072f:
            if (r2 >= r4) goto L_0x0c75
            java.lang.Object r1 = X.C308366Tz.A00(r6, r2)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r4 + r2
            java.lang.Object r0 = X.C308366Tz.A00(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            r3.put(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 + 1
            goto L_0x072f
        L_0x0741:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r11 = 0
            r1 = 0
            if (r0 != r9) goto L_0x0748
            r1 = 1
        L_0x0748:
            java.lang.String r0 = "MakeMap expects 2 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r5 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r4 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x075d
            java.lang.String r1 = "MakeMap arg 0 must be a list"
            goto L_0x0c17
        L_0x075d:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0765
            java.lang.String r1 = "MakeMap arg 1 must be a list"
            goto L_0x0c17
        L_0x0765:
            java.util.List r5 = (java.util.List) r5     // Catch:{ 6U1 -> 0x145d }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 6U1 -> 0x145d }
            int r3 = r5.size()     // Catch:{ 6U1 -> 0x145d }
            int r0 = r4.size()     // Catch:{ 6U1 -> 0x145d }
            if (r3 == r0) goto L_0x0777
            java.lang.String r1 = "MakeMap different number keys/values"
            goto L_0x0c17
        L_0x0777:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r2.<init>(r3)     // Catch:{ 6U1 -> 0x145d }
        L_0x077c:
            if (r11 >= r3) goto L_0x078c
            java.lang.Object r1 = r5.get(r11)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ 6U1 -> 0x145d }
            r2.put(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            int r11 = r11 + 1
            goto L_0x077c
        L_0x078c:
            X.C308366Tz.A01(r6, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0791:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r9) goto L_0x0797
            r1 = 1
        L_0x0797:
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r27 = A0I(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308356Ty.A01(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x07ba
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 6U1 -> 0x145d }
            double r0 = r1.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            long r2 = (long) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0826
        L_0x07ba:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0826
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0822
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C46650DiV.A00(r1)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0828
            java.lang.String r11 = r1.trim()     // Catch:{ 6U1 -> 0x145d }
            int r5 = r11.length()     // Catch:{ NumberFormatException -> 0x0828 }
            if (r5 == 0) goto L_0x0828
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            char r1 = r11.charAt(r7)     // Catch:{ NumberFormatException -> 0x0828 }
            r0 = 45
            r15 = 1
            if (r1 != r0) goto L_0x07e4
            goto L_0x07eb
        L_0x07e4:
            r0 = 43
            if (r1 != r0) goto L_0x07e9
            r4 = 1
        L_0x07e9:
            r15 = 0
            goto L_0x07ee
        L_0x07eb:
            r25 = -9223372036854775808
            r4 = 1
        L_0x07ee:
            if (r4 == r5) goto L_0x0828
            r23 = 10
            long r21 = r25 / r23
            r0 = 0
        L_0x07f6:
            if (r4 >= r5) goto L_0x081a
            char r2 = r11.charAt(r4)     // Catch:{ NumberFormatException -> 0x0828 }
            int r3 = r2 + -48
            if (r3 < 0) goto L_0x0828
            r2 = 9
            if (r3 > r2) goto L_0x0828
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 < 0) goto L_0x0815
            long r0 = r0 * r23
            long r2 = (long) r3     // Catch:{ NumberFormatException -> 0x0828 }
            long r13 = r25 + r2
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x0815
            long r0 = r0 - r2
        L_0x0812:
            int r4 = r4 + 1
            goto L_0x07f6
        L_0x0815:
            if (r27 == 0) goto L_0x0828
            r0 = r25
            goto L_0x0812
        L_0x081a:
            if (r15 != 0) goto L_0x081d
            long r0 = -r0
        L_0x081d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0828 }
            goto L_0x0826
        L_0x0822:
            java.lang.Long r1 = A02(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x0826:
            if (r1 != 0) goto L_0x0829
        L_0x0828:
            r1 = 0
        L_0x0829:
            X.C308366Tz.A01(r6, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x082e:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 1
            if (r0 == r8) goto L_0x0834
            r1 = 0
        L_0x0834:
            java.lang.String r0 = "IsFinite expects 1 argument"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = A03(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0847
            java.lang.String r1 = "IsFinite argument must be numeric"
            goto L_0x0c17
        L_0x0847:
            double r0 = r0.doubleValue()     // Catch:{ 6U1 -> 0x145d }
            double r4 = java.lang.Math.abs(r0)     // Catch:{ 6U1 -> 0x145d }
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x085a
            r0 = 1
        L_0x085a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0863:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r11) goto L_0x0869
            r1 = 1
        L_0x0869:
            java.lang.String r0 = "Substring expects 3 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x087a
            java.lang.String r1 = "Substring 1st arg must be a string"
            goto L_0x0c17
        L_0x087a:
            java.lang.Object r12 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            double r0 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r2 = X.C308366Tz.A02(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r2 != 0) goto L_0x0892
            java.lang.String r1 = "Substring 2nd arg must be an integer"
            goto L_0x0c17
        L_0x0892:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Object r4 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            if (r4 == 0) goto L_0x08ac
            java.lang.Object r2 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            double r2 = A00(r2)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = X.C308366Tz.A02(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x08ac
            java.lang.String r1 = "Substring 3rd arg must be an integer or null"
            goto L_0x0c17
        L_0x08ac:
            int r11 = r12.length()     // Catch:{ 6U1 -> 0x145d }
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 >= 0) goto L_0x08b6
            double r4 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r4
        L_0x08b6:
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 < 0) goto L_0x13f7
            double r4 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x13f7
            int r13 = (int) r0     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x08d2
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x13f4
            double r0 = (double) r13     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r2
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x13f4
            int r0 = (int) r2     // Catch:{ 6U1 -> 0x145d }
            goto L_0x08d4
        L_0x08d2:
            int r0 = r11 - r13
        L_0x08d4:
            if (r13 != 0) goto L_0x08dd
            if (r0 != r11) goto L_0x08dd
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x08e2
        L_0x08dd:
            int r0 = r0 + r13
            java.lang.String r0 = r12.substring(r13, r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x08e2:
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x08e7:
            int r2 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            r0 = r18
            if (r2 != r0) goto L_0x08ef
            r1 = 1
        L_0x08ef:
            java.lang.String r0 = "SubstringCompare expects 4 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0900
            java.lang.String r1 = "SubstringCompare 1st arg must be a string"
            goto L_0x0c17
        L_0x0900:
            java.lang.Object r12 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0912
            java.lang.String r1 = "SubstringCompare 2nd arg must be a string"
            goto L_0x0c17
        L_0x0912:
            java.lang.Object r14 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            if (r1 != 0) goto L_0x0920
            r0 = 1
        L_0x0920:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0936
            java.lang.Object r0 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            double r0 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = X.C308366Tz.A02(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x0938
            java.lang.String r1 = "SubstringCompare 3rd arg must be an integer or null"
            goto L_0x0c17
        L_0x0936:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0938:
            java.lang.Object r4 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            if (r4 == 0) goto L_0x0950
            java.lang.Object r2 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            double r2 = A00(r2)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = X.C308366Tz.A02(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x0950
            java.lang.String r1 = "SubstringCompare 4th arg must be an integer or null"
            goto L_0x0c17
        L_0x0950:
            int r13 = r12.length()     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 6U1 -> 0x145d }
            r21 = 0
            if (r4 == 0) goto L_0x095f
            r0 = 0
            goto L_0x0969
        L_0x095f:
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 >= 0) goto L_0x0965
            double r4 = (double) r13     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r4
        L_0x0965:
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 < 0) goto L_0x13fd
        L_0x0969:
            double r4 = (double) r13     // Catch:{ 6U1 -> 0x145d }
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x13fd
            int r11 = (int) r0     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0981
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x13fa
            double r0 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r2
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 > 0) goto L_0x13fa
            int r0 = (int) r2     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0983
        L_0x0981:
            int r0 = r13 - r11
        L_0x0983:
            if (r11 != 0) goto L_0x0988
            if (r0 != r13) goto L_0x0988
            goto L_0x098d
        L_0x0988:
            int r0 = r0 + r11
            java.lang.String r12 = r12.substring(r11, r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x098d:
            int r0 = r12.compareTo(r14)     // Catch:{ 6U1 -> 0x145d }
            if (r0 >= 0) goto L_0x0996
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x099a
        L_0x0996:
            if (r0 == 0) goto L_0x099a
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x099a:
            java.lang.Number r0 = X.Q0A.A00(r21)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x09a3:
            int r2 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = 5
            r1 = 0
            if (r2 != r0) goto L_0x09aa
            r1 = 1
        L_0x09aa:
            java.lang.String r0 = "StringSearch expects 5 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x09bb
            java.lang.String r1 = "StringSearch 1st arg must be a string"
            goto L_0x0c17
        L_0x09bb:
            java.lang.Object r13 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x09cd
            java.lang.String r1 = "StringSearch 2nd arg must be a string"
            goto L_0x0c17
        L_0x09cd:
            java.lang.Object r12 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            if (r1 != 0) goto L_0x09db
            r0 = 1
        L_0x09db:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x09f1
            java.lang.Object r0 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            double r0 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = X.C308366Tz.A02(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x09f3
            java.lang.String r1 = "StringSearch 3rd arg must be an integer or null"
            goto L_0x0c17
        L_0x09f1:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x09f3:
            java.lang.Object r4 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            if (r4 == 0) goto L_0x0a0b
            java.lang.Object r2 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            double r2 = A00(r2)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = X.C308366Tz.A02(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x0a0b
            java.lang.String r1 = "StringSearch 4th arg must be an integer or null"
            goto L_0x0c17
        L_0x0a0b:
            r4 = r18
            java.lang.Object r4 = X.C308366Tz.A00(r6, r4)     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = r4 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            if (r4 != 0) goto L_0x0a19
            java.lang.String r1 = "StringSearch 5th arg must be a boolean"
            goto L_0x0c17
        L_0x0a19:
            r4 = r18
            java.lang.Object r4 = X.C308366Tz.A00(r6, r4)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ 6U1 -> 0x145d }
            boolean r21 = r4.booleanValue()     // Catch:{ 6U1 -> 0x145d }
            int r5 = r13.length()     // Catch:{ 6U1 -> 0x145d }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 6U1 -> 0x145d }
            if (r4 == 0) goto L_0x0a32
            r0 = 0
            goto L_0x0a3c
        L_0x0a32:
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a38
            double r14 = (double) r5     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r14
        L_0x0a38:
            int r4 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r4 < 0) goto L_0x1403
        L_0x0a3c:
            double r14 = (double) r5     // Catch:{ 6U1 -> 0x145d }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x1403
            int r4 = (int) r0     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0a54
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x1400
            double r0 = (double) r4     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r2
            int r11 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x1400
            int r0 = (int) r2     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0a56
        L_0x0a54:
            int r0 = r5 - r4
        L_0x0a56:
            int r1 = r12.length()     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x0a77
            if (r1 > r0) goto L_0x0a77
            if (r4 != 0) goto L_0x0a65
            if (r0 != r5) goto L_0x0a65
        L_0x0a62:
            if (r21 == 0) goto L_0x0a70
            goto L_0x0a6b
        L_0x0a65:
            int r0 = r0 + r4
            java.lang.String r13 = r13.substring(r4, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0a62
        L_0x0a6b:
            int r0 = r13.lastIndexOf(r12)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0a74
        L_0x0a70:
            int r0 = r13.indexOf(r12)     // Catch:{ 6U1 -> 0x145d }
        L_0x0a74:
            if (r0 < 0) goto L_0x0a77
            goto L_0x0a79
        L_0x0a77:
            r0 = 0
            goto L_0x0a7f
        L_0x0a79:
            int r0 = r0 + r4
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x0a7f:
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0a84:
            int r2 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = 5
            r1 = 0
            if (r2 != r0) goto L_0x0a8b
            r1 = 1
        L_0x0a8b:
            java.lang.String r0 = "ArrayCopy expects 5 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0a9c
            java.lang.String r1 = "ArrayCopy 1st argument must be an array"
            goto L_0x0c17
        L_0x0a9c:
            java.lang.Object r15 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.util.List r15 = (java.util.List) r15     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            double r4 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308366Tz.A02(r4)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0ab4
            java.lang.String r1 = "ArrayCopy 2nd argument must be an integer"
            goto L_0x0c17
        L_0x0ab4:
            java.lang.Object r0 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0ac0
            java.lang.String r1 = "ArrayCopy 3rd argument must be an array"
            goto L_0x0c17
        L_0x0ac0:
            java.lang.Object r14 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            java.util.List r14 = (java.util.List) r14     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r11)     // Catch:{ 6U1 -> 0x145d }
            double r2 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308366Tz.A02(r2)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0ad8
            java.lang.String r1 = "ArrayCopy 4th argument must be an integer"
            goto L_0x0c17
        L_0x0ad8:
            r0 = r18
            java.lang.Object r0 = X.C308366Tz.A00(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            double r12 = A00(r0)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = X.C308366Tz.A02(r12)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0aec
            java.lang.String r1 = "ArrayCopy 5th argument must be an integer"
            goto L_0x0c17
        L_0x0aec:
            int r11 = r15.size()     // Catch:{ 6U1 -> 0x145d }
            int r21 = r14.size()     // Catch:{ 6U1 -> 0x145d }
            int r0 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x0afa
            double r0 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            double r4 = r4 + r0
        L_0x0afa:
            int r0 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x141b
            double r0 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            r23 = r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x141b
            int r11 = (int) r4     // Catch:{ 6U1 -> 0x145d }
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b0e
            r0 = r21
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            double r2 = r2 + r0
        L_0x0b0e:
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x1418
            r0 = r21
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            r21 = r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x1418
            int r4 = (int) r2     // Catch:{ 6U1 -> 0x145d }
            int r0 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x1415
            double r0 = (double) r11     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r12
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 > 0) goto L_0x1415
            double r0 = (double) r4     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0 + r12
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 > 0) goto L_0x1415
            int r0 = (int) r12     // Catch:{ 6U1 -> 0x145d }
            if (r15 != r14) goto L_0x0b44
            if (r4 <= r11) goto L_0x0b44
            int r11 = r11 + r0
            int r4 = r4 + r0
        L_0x0b33:
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x0b6d
            int r4 = r4 + -1
            int r11 = r11 + -1
            java.lang.Object r0 = r15.get(r11)     // Catch:{ UnsupportedOperationException -> 0x1406 }
            r14.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x1406 }
            r0 = r1
            goto L_0x0b33
        L_0x0b44:
            int r3 = r0 + -1
            if (r0 == 0) goto L_0x0b6d
            int r2 = r4 + 1
            int r1 = r11 + 1
            java.lang.Object r0 = r15.get(r11)     // Catch:{ UnsupportedOperationException -> 0x1406 }
            r14.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x1406 }
            r4 = r2
            r0 = r3
            r11 = r1
            goto L_0x0b44
        L_0x0b57:
            java.util.List r2 = (java.util.List) r2     // Catch:{ 6U1 -> 0x145d }
            X.6Tw r3 = r6.A02     // Catch:{ 6U1 -> 0x145d }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r3.A0J(r4, r0, r1)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r2.size()     // Catch:{ 6U1 -> 0x145d }
            if (r1 >= r0) goto L_0x0b6d
            r2.remove(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x0b6d:
            r0 = 0
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0b73:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != 0) goto L_0x0b79
            r1 = 1
        L_0x0b79:
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ 6U1 -> 0x145d }
            double r2 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r2)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0b8c:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r9) goto L_0x0b92
            r1 = 1
        L_0x0b92:
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0ba2
            java.lang.String r1 = "MapKeysValues 1st arg must be a map"
            goto L_0x0c17
        L_0x0ba2:
            java.lang.Object r1 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0bb3
            java.lang.String r1 = "MapKeysValues 2nd arg must be a boolean"
            goto L_0x0c17
        L_0x0bb3:
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0.booleanValue()     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0bd9
            java.util.Set r0 = r1.keySet()     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 6U1 -> 0x145d }
        L_0x0bc7:
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0bd9:
            java.util.Collection r0 = r1.values()     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0bc7
        L_0x0be2:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r9) goto L_0x0be8
            r1 = 1
        L_0x0be8:
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0bf8
            java.lang.String r1 = "MapHasValue 1st arg must be a map"
            goto L_0x0c17
        L_0x0bf8:
            java.lang.Object r1 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1.containsValue(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0c0f:
            int r1 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0c24
            java.lang.String r1 = "MakeSmallMapKV requires an even number of arguments"
        L_0x0c17:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r1 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x0c24:
            int r0 = r1 / 2
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            r2 = 0
        L_0x0c2c:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            if (r2 >= r0) goto L_0x0c75
            java.lang.Object r1 = X.C308366Tz.A00(r6, r2)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r2 + 1
            java.lang.Object r0 = X.C308366Tz.A00(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            r3.put(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 + 2
            goto L_0x0c2c
        L_0x0c40:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != r11) goto L_0x0c46
            r1 = 1
        L_0x0c46:
            java.lang.String r0 = "StringReplaceAll requires 3 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            X.6Tw r1 = r6.A02     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r7)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r3 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r8)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r2 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = X.C308366Tz.A00(r6, r9)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = r1.A0K(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2.isEmpty()     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0c75
            java.lang.String r3 = r3.replace(r2, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x0c75:
            X.C308366Tz.A01(r6, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0c7a:
            int r0 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            r1 = 0
            if (r0 != 0) goto L_0x0c80
            r1 = 1
        L_0x0c80:
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.C308316Tu.A00(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            X.6Tw r0 = r6.A02     // Catch:{ 6U1 -> 0x145d }
            java.util.Random r0 = r0.A06     // Catch:{ 6U1 -> 0x145d }
            double r0 = r0.nextDouble()     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            X.C308366Tz.A01(r6, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0c96:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            java.lang.Object[] r0 = r0.A03     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0ca7:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r0.<init>()     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cb1:
            java.lang.String r0 = "<="
            r10.A08(r11, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cb8:
            java.lang.String r0 = "<"
            r10.A08(r9, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cbf:
            java.lang.String r0 = ">"
            r10.A08(r8, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cc6:
            java.lang.String r0 = ">="
            r10.A08(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0ccd:
            java.lang.String r1 = "INT64_SHR"
            r0 = 22
            r10.A07(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cd6:
            r1 = 21
            java.lang.String r0 = "INT64_ASR"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cdf:
            r1 = 20
            java.lang.String r0 = "INT64_SHL"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0ce8:
            r1 = 19
            java.lang.String r0 = "INT64_XOR"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cf1:
            r1 = 18
            java.lang.String r0 = "INT64_OR"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0cfa:
            r1 = 17
            java.lang.String r0 = "INT64_AND"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d03:
            r1 = 16
            java.lang.String r0 = "INT64_ADD"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d0c:
            r1 = 15
            java.lang.String r0 = "INT64_SUB"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d15:
            r1 = 14
            java.lang.String r0 = "INT64_MOD"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d1e:
            r1 = 13
            java.lang.String r0 = "INT64_DIV"
            r10.A07(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d27:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r10.A07(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d30:
            r1 = 11
            java.lang.String r0 = ">>>"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d39:
            r1 = 10
            java.lang.String r0 = ">>"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d42:
            r1 = 9
            java.lang.String r0 = "<<"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d4b:
            r1 = 8
            java.lang.String r0 = "^"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d54:
            r1 = 7
            java.lang.String r0 = "|"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d5c:
            r1 = 6
            java.lang.String r0 = "&"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d64:
            java.lang.String r1 = "-"
            r0 = r18
            r10.A06(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d6d:
            java.lang.String r0 = "%"
            r10.A06(r11, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d74:
            java.lang.String r0 = "/"
            r10.A06(r9, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d7b:
            java.lang.String r0 = "imul"
            r10.A06(r8, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d82:
            java.lang.String r0 = "*"
            r10.A06(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d89:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d90:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d97:
            java.lang.Object r0 = r10.A07     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0d9e:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0 + -1
            int r0 = r0 - r3
            java.lang.Object[] r1 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0db8
            java.lang.String r0 = "op_call target is not a closure"
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0db8:
            int r0 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0 - r18
            r1 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            r0 = r16
            A0F(r10, r2, r1, r3, r0)     // Catch:{ 6U1 -> 0x145d }
            A0B(r10)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0dc8:
            r1 = 0
            if (r20 != 0) goto L_0x0dcc
            r1 = 1
        L_0x0dcc:
            java.lang.String r0 = "enter executed more than once"
            if (r1 == 0) goto L_0x0e3e
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r2 = r0 & 255(0xff, float:3.57E-43)
            short r3 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            r1 = 0
            r0 = r20
            if (r2 > r0) goto L_0x0dec
            r1 = 1
        L_0x0dec:
            java.lang.String r4 = "op_enter too many params to copy"
            if (r1 == 0) goto L_0x143a
            int r3 = r3 + r20
            int r0 = r3 + 5
            A0D(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            int r4 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r3 = r20 + r4
            r10.A01 = r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r1 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            java.util.Arrays.fill(r1, r4, r3, r0)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r3 = r1 - r11
            int[] r0 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r5 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = X.C308356Ty.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r3 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r3 == 0) goto L_0x0e26
            int r0 = r3.length     // Catch:{ 6U1 -> 0x145d }
        L_0x0e1a:
            int r1 = java.lang.Math.min(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x0e29
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r3, r7, r0, r4, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0e28
        L_0x0e26:
            r0 = 0
            goto L_0x0e1a
        L_0x0e28:
            int r4 = r4 + r1
        L_0x0e29:
            int r2 = r2 - r1
            int r3 = java.lang.Math.min(r5, r2)     // Catch:{ 6U1 -> 0x145d }
            if (r3 <= 0) goto L_0x0047
            java.lang.Object[] r2 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0e3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x0e45:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0e4e:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r3 = r0 + -1
            int r1 = r3 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0e6f
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0e6f
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r2, r1)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r8, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x12fe
        L_0x0e6f:
            r1 = 5
            java.lang.String r0 = "+"
            r10.A06(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0e77:
            short r1 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r28
            java.lang.Object r0 = r0.A01(r1)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0e8a:
            short r5 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r2 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 - r8
            r2 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            r6 = 28
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0eb5
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 6U1 -> 0x145d }
            r0 = r28
            java.lang.Object r0 = r0.A01(r5)     // Catch:{ UnsupportedOperationException -> 0x0eb0 }
            r2.put(r0, r1)     // Catch:{ UnsupportedOperationException -> 0x0eb0 }
            goto L_0x104d
        L_0x0eb0:
            r1 = move-exception
            r0 = 29
            goto L_0x0fa3
        L_0x0eb5:
            java.lang.String r1 = "Expected stack value of map type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r6]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0ec4:
            short r4 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r2 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            r3 = 26
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0f33
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 6U1 -> 0x145d }
            r0 = r28
            java.lang.Object r3 = r0.A01(r4)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x0f11
            boolean r0 = r2.containsKey(r3)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0ef0
            r0 = 0
            goto L_0x0f11
        L_0x0ef0:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r5 = java.lang.String.format(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x10d6
        L_0x0efa:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0f16
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            int r0 = r1.size()     // Catch:{ 6U1 -> 0x145d }
        L_0x0f0c:
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x0f11:
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0f16:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0f21
            java.util.List r1 = (java.util.List) r1     // Catch:{ 6U1 -> 0x145d }
            int r0 = r1.size()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0f0c
        L_0x0f21:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0f2c
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6U1 -> 0x145d }
            int r0 = r1.length()     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0f0c
        L_0x0f2c:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0f33:
            java.lang.String r1 = "Expected stack value of map type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0f42:
            short r4 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r3 = 26
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x0f70
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 6U1 -> 0x145d }
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
            r0 = r28
            java.lang.Object r0 = r0.A01(r4)     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2.containsKey(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x0f70:
            java.lang.String r1 = "Expected stack value of map type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x0f7f:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r5 = r0 + -1
            int r1 = r5 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r5]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
            if (r0 == 0) goto L_0x0f96
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
            r2.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
            goto L_0x104d
        L_0x0f96:
            java.lang.String r0 = "del_by_val 1st argument must be a map"
            A0H(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0fa0 }
        L_0x0fa0:
            r1 = move-exception
            r0 = 25
        L_0x0fa3:
            if (r4 == r0) goto L_0x104d
            goto L_0x1451
        L_0x0fa7:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r4 = r0 + -1
            int r1 = r4 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r4]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x1450 }
            if (r0 == 0) goto L_0x1446
            java.util.List r2 = (java.util.List) r2     // Catch:{ UnsupportedOperationException -> 0x1450 }
            r2.add(r1)     // Catch:{ UnsupportedOperationException -> 0x1450 }
            goto L_0x104d
        L_0x0fbe:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r2 = r0 + -1
            int r1 = r2 - r9
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r6 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r1 = r2 - r8
            r12 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r2]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r6 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x1145 }
            if (r0 == 0) goto L_0x0fd9
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ UnsupportedOperationException -> 0x1145 }
            r6.put(r12, r2)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            goto L_0x114c
        L_0x0fd9:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x1145 }
            if (r0 == 0) goto L_0x0ffa
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x1145 }
            java.lang.String r1 = "invalid put_by_val vector index"
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0J(r12, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            int r0 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x1145 }
            if (r1 <= r0) goto L_0x1004
            java.lang.String r0 = "RangeError: "
            java.lang.String r1 = X.002.A0R(r0, r5)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            X.6U1 r0 = new X.6U1     // Catch:{ UnsupportedOperationException -> 0x1145 }
            r0.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x1145 }
        L_0x0ff9:
            throw r0     // Catch:{ UnsupportedOperationException -> 0x1145 }
        L_0x0ffa:
            java.lang.String r0 = "put_by_val 1st argument must be a container"
            A0H(r0, r6)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0ff9
        L_0x1004:
            if (r1 != r0) goto L_0x100b
            r6.add(r2)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            goto L_0x114c
        L_0x100b:
            r6.set(r1, r2)     // Catch:{ UnsupportedOperationException -> 0x1145 }
            goto L_0x114c
        L_0x1010:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r5 = r0 + -1
            int r0 = r5 - r9
            java.lang.Object[] r1 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r3 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r5 - r8
            r4 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            r0 = r1[r5]     // Catch:{ 6U1 -> 0x145d }
            boolean r1 = r3 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x1033
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r1 = r3.get(r4)     // Catch:{ 6U1 -> 0x145d }
            if (r1 != 0) goto L_0x104a
            boolean r1 = r3.containsKey(r4)     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x1053
            goto L_0x1052
        L_0x1033:
            boolean r1 = r3 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x1055
            java.util.List r3 = (java.util.List) r3     // Catch:{ 6U1 -> 0x145d }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r10.A0J(r4, r2, r1)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r3.size()     // Catch:{ 6U1 -> 0x145d }
            if (r2 >= r1) goto L_0x1053
            java.lang.Object r1 = r3.get(r2)     // Catch:{ 6U1 -> 0x145d }
        L_0x104a:
            r10.A05(r9, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x104d:
            r10.A0L(r9)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x1052:
            r0 = 0
        L_0x1053:
            r1 = r0
            goto L_0x104a
        L_0x1055:
            java.lang.String r1 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x1064:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r4 = r0 + -1
            int r3 = r4 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r3 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            r4 = r0[r4]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1099
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x10b0
            boolean r0 = r3.containsKey(r4)     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1084
            r0 = 0
            goto L_0x10b0
        L_0x1084:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = "RangeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r1 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x1099:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x10b5
            java.util.List r3 = (java.util.List) r3     // Catch:{ 6U1 -> 0x145d }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0J(r4, r2, r0)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r3.size()     // Catch:{ 6U1 -> 0x145d }
            if (r1 >= r0) goto L_0x10d6
            java.lang.Object r0 = r3.get(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x10b0:
            r10.A05(r8, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x12fe
        L_0x10b5:
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x10e3
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 6U1 -> 0x145d }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "invalid get_by_val string index"
            int r1 = r10.A0J(r4, r0, r1)     // Catch:{ 6U1 -> 0x145d }
            int r0 = r3.length()     // Catch:{ 6U1 -> 0x145d }
            if (r1 >= r0) goto L_0x10d4
            char r0 = r3.charAt(r1)     // Catch:{ 6U1 -> 0x145d }
            double r0 = (double) r0     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x10b0
        L_0x10d4:
            java.lang.String r5 = "string index out of range"
        L_0x10d6:
            java.lang.String r0 = "RangeError: "
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r1 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x10e3:
            java.lang.String r1 = "get_by_val 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x10f2:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r2 = r0 + -1
            int r0 = r2 - r9
            java.lang.Object[] r1 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r6 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            r5 = r1[r2]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x1109
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            A0H(r0, r6)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x1109:
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x1141 }
            int r2 = r2 - r8
            r2 = r1[r2]     // Catch:{ UnsupportedOperationException -> 0x1141 }
            java.lang.String r1 = "invalid vector_resize_length"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r2 = r10.A0J(r2, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x1141 }
            int r1 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x1141 }
            if (r2 <= r1) goto L_0x112e
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x1141 }
            if (r0 == 0) goto L_0x1126
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UnsupportedOperationException -> 0x1141 }
            r0.ensureCapacity(r2)     // Catch:{ UnsupportedOperationException -> 0x1141 }
        L_0x1126:
            r6.add(r5)     // Catch:{ UnsupportedOperationException -> 0x1141 }
            int r1 = r1 + 1
            if (r2 > r1) goto L_0x1126
            goto L_0x114c
        L_0x112e:
            if (r2 >= r1) goto L_0x114c
        L_0x1130:
            int r1 = r1 + -1
            r6.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x1141 }
            if (r2 < r1) goto L_0x1130
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x1141 }
            if (r0 == 0) goto L_0x114c
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ UnsupportedOperationException -> 0x1141 }
            r6.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x1141 }
            goto L_0x114c
        L_0x1141:
            r1 = move-exception
            r0 = 32
            goto L_0x1148
        L_0x1145:
            r1 = move-exception
            r0 = 22
        L_0x1148:
            if (r4 == r0) goto L_0x114c
            goto L_0x1451
        L_0x114c:
            r10.A0L(r11)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x1151:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x116d
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x1168:
            r10.A05(r7, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x116d:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x117d
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1168
        L_0x117d:
            if (r1 == 0) goto L_0x1168
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x1168
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x1168
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x1168
            boolean r0 = r1 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 != 0) goto L_0x1168
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x1196:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x11ae
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x11a9:
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x11ae:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x11ba
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x11a9
        L_0x11ba:
            java.lang.String r0 = "argument of container_clone must be a container"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x11c1:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = X.C308356Ty.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r1 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x11f5
            int r2 = r1.length     // Catch:{ 6U1 -> 0x145d }
        L_0x11d2:
            int r3 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r3 = r3 - r11
            int[] r0 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r3 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r2 + r3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x11e2
            java.lang.System.arraycopy(r1, r7, r4, r7, r2)     // Catch:{ 6U1 -> 0x145d }
        L_0x11e2:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r3 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r1, r4, r2, r3)     // Catch:{ 6U1 -> 0x145d }
            int r3 = r4.length     // Catch:{ 6U1 -> 0x145d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ 6U1 -> 0x145d }
            r2.<init>(r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x11f7
        L_0x11f5:
            r2 = 0
            goto L_0x11d2
        L_0x11f7:
            r1 = 0
        L_0x11f8:
            if (r1 >= r3) goto L_0x1202
            r0 = r4[r1]     // Catch:{ 6U1 -> 0x145d }
            r2.add(r0)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 + 1
            goto L_0x11f8
        L_0x1202:
            A0E(r10, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x1207:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r18
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = X.C308356Ty.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x122a
            int r2 = r0.length     // Catch:{ 6U1 -> 0x145d }
        L_0x1218:
            int r1 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 - r11
            int[] r0 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            int r2 = r2 + r0
            double r0 = (double) r2     // Catch:{ 6U1 -> 0x145d }
            java.lang.Number r0 = X.Q0A.A00(r0)     // Catch:{ 6U1 -> 0x145d }
            A0E(r10, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x122a:
            r2 = 0
            goto L_0x1218
        L_0x122c:
            short r1 = r19.getShort()     // Catch:{ 6U1 -> 0x145d }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            X.4uL r5 = r0.A01     // Catch:{ 6U1 -> 0x145d }
            r0 = r28
            java.lang.Object r4 = r0.A01(r1)     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ 6U1 -> 0x145d }
            int r3 = r2 + -1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            int r1 = r1 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r1, r11, r7, r2)     // Catch:{ 6U1 -> 0x145d }
            int r3 = r10.A02     // Catch:{ 6U1 -> 0x145d }
            r0 = r16
            r10.A02 = r0     // Catch:{ 6U1 -> 0x145d }
            r0 = r28
            X.6Tq[] r0 = r0.A03     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r9]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            int r6 = r16 - r0
            r0 = r28
            java.util.Map r1 = r0.A02     // Catch:{ 6U1 -> 0x145d }
            if (r1 == 0) goto L_0x126f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 6U1 -> 0x145d }
            r1.get(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x126f:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 6U1 -> 0x145d }
            X.6Tx r0 = r10.A03     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            X.6Rx r1 = r0.A00     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r5 == 0) goto L_0x1295
            java.util.List r6 = r5.A01     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            X.4te r5 = r5.A00     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r6 == 0) goto L_0x128f
            java.util.List r0 = r1.A0D     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            boolean r0 = r6.equals(r0)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r0 != 0) goto L_0x128f
            boolean r0 = r6.isEmpty()     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r0 == 0) goto L_0x12af
        L_0x128f:
            if (r5 == 0) goto L_0x1295
            X.4te r0 = r1.A02     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r5 != r0) goto L_0x12af
        L_0x1295:
            X.6Tm r5 = new X.6Tm     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            r5.<init>(r11)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            java.lang.String r0 = "#"
            boolean r0 = r4.startsWith(r0)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            if (r0 == 0) goto L_0x12b4
            java.lang.String r0 = r4.substring(r8)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            com.instagram.common.lispy.lang.BloksScript r0 = X.Q05.A02(r1, r0)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            java.lang.Object r0 = X.AnonymousClass6Tn.A00(r1, r5, r0)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            goto L_0x12ba
        L_0x12af:
            X.6Rx r1 = X.C307896Rx.A00(r5, r1, r6)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            goto L_0x1295
        L_0x12b4:
            X.4tp r0 = r1.A01     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
            java.lang.Object r0 = r0.ASw(r1, r5, r4)     // Catch:{ 6U0 -> 0x12de, Exception -> 0x12c4 }
        L_0x12ba:
            r10.A02 = r3     // Catch:{ 6U1 -> 0x145d }
            r10.A0L(r2)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r7, r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x12c4:
            r3 = move-exception
            java.lang.String r2 = "extension '"
            java.lang.String r1 = "' threw an exception: "
            java.lang.String r0 = r3.getMessage()     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r1 = X.002.A0u(r2, r4, r1, r0)     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r1 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1362
        L_0x12de:
            r1 = move-exception
            goto L_0x1362
        L_0x12e1:
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r3 = r0 + -1
            int r1 = r3 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r1 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            r3 = r0[r3]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1303
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r1.containsKey(r3)     // Catch:{ 6U1 -> 0x145d }
        L_0x12f7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6U1 -> 0x145d }
            r10.A05(r8, r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x12fe:
            A0C(r10)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x1303:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1319
            java.util.List r1 = (java.util.List) r1     // Catch:{ 6U1 -> 0x145d }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r10.A0J(r3, r2, r0)     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1.size()     // Catch:{ 6U1 -> 0x145d }
            r0 = 0
            if (r2 >= r1) goto L_0x12f7
            r0 = 1
            goto L_0x12f7
        L_0x1319:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            A0H(r0, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x131e:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x1362
        L_0x1323:
            byte r0 = r19.get()     // Catch:{ 6U1 -> 0x145d }
            r11 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r11 + 1
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            int r1 = r1 - r12
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r2 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r2 instanceof X.C280064zw     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1376
            X.6Tt r6 = X.C308356Ty.A00(r2)     // Catch:{ 6U1 -> 0x145d }
            r5 = 0
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r4 = r0[r1]     // Catch:{ 6U1 -> 0x145d }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1369
            java.util.List r4 = (java.util.List) r4     // Catch:{ 6U1 -> 0x145d }
            r1 = 32768(0x8000, float:4.5918E-41)
            int r1 = r1 - r11
            int r0 = r4.size()     // Catch:{ 6U1 -> 0x145d }
            if (r1 >= r0) goto L_0x1363
            java.lang.String r1 = "too many arguments to bind"
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r1 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x1362:
            throw r1     // Catch:{ 6U1 -> 0x145d }
        L_0x1363:
            int r1 = r4.size()     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 + r11
            goto L_0x136d
        L_0x1369:
            if (r4 != 0) goto L_0x1370
            r4 = 0
            r1 = r11
        L_0x136d:
            if (r1 == 0) goto L_0x12fe
            goto L_0x1384
        L_0x1370:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            A0H(r0, r4)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x1376:
            java.lang.String r1 = "Expected stack value of closure type for opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r8]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
            A0H(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x131e
        L_0x1384:
            java.lang.Object[] r0 = r6.A02     // Catch:{ 6U1 -> 0x145d }
            if (r0 == 0) goto L_0x1390
            int r3 = r0.length     // Catch:{ 6U1 -> 0x145d }
            int r1 = r1 + r3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r7, r2, r7, r3)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x1393
        L_0x1390:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ 6U1 -> 0x145d }
            r3 = 0
        L_0x1393:
            if (r11 == 0) goto L_0x13a0
            int r0 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r1 = r0 + -1
            int r1 = r1 - r11
            java.lang.Object[] r0 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            java.lang.System.arraycopy(r0, r1, r2, r3, r11)     // Catch:{ 6U1 -> 0x145d }
            int r3 = r3 + r11
        L_0x13a0:
            if (r4 == 0) goto L_0x13b4
            int r0 = r4.size()     // Catch:{ 6U1 -> 0x145d }
        L_0x13a6:
            if (r5 >= r0) goto L_0x13b4
            int r11 = r3 + 1
            java.lang.Object r1 = r4.get(r5)     // Catch:{ 6U1 -> 0x145d }
            r2[r3] = r1     // Catch:{ 6U1 -> 0x145d }
            int r5 = r5 + 1
            r3 = r11
            goto L_0x13a6
        L_0x13b4:
            X.6Ts r4 = r6.A00     // Catch:{ 6U1 -> 0x145d }
            java.lang.Object[] r3 = r6.A03     // Catch:{ 6U1 -> 0x145d }
            X.4uL r1 = r6.A01     // Catch:{ 6U1 -> 0x145d }
            X.6Tt r0 = new X.6Tt     // Catch:{ 6U1 -> 0x145d }
            r0.<init>(r4, r1, r2, r3)     // Catch:{ 6U1 -> 0x145d }
            X.4zw r1 = new X.4zw     // Catch:{ 6U1 -> 0x145d }
            r1.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x13c4:
            r10.A05(r12, r1)     // Catch:{ 6U1 -> 0x145d }
            r10.A0L(r12)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x0047
        L_0x13cc:
            int r4 = r10.A01     // Catch:{ 6U1 -> 0x145d }
            int r0 = r4 + -1
            java.lang.Object[] r6 = r10.A05     // Catch:{ 6U1 -> 0x145d }
            r5 = r6[r0]     // Catch:{ 6U1 -> 0x145d }
            int r3 = r10.A00     // Catch:{ 6U1 -> 0x145d }
            int r0 = r3 - r11
            int[] r1 = r10.A04     // Catch:{ 6U1 -> 0x145d }
            r2 = r1[r0]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r6[r0] = r5     // Catch:{ 6U1 -> 0x145d }
            r1 = r1[r3]     // Catch:{ 6U1 -> 0x145d }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r4 = r4 - r0
            r10.A0L(r4)     // Catch:{ 6U1 -> 0x145d }
            r10.A00 = r1     // Catch:{ 6U1 -> 0x145d }
            return
        L_0x13f4:
            java.lang.String r1 = "Substring length out of range"
            goto L_0x1424
        L_0x13f7:
            java.lang.String r1 = "Substring offset out of range"
            goto L_0x1424
        L_0x13fa:
            java.lang.String r1 = "SubstringCompare length out of range"
            goto L_0x1424
        L_0x13fd:
            java.lang.String r1 = "SubstringCompare offset out of range"
            goto L_0x1424
        L_0x1400:
            java.lang.String r1 = "StringSearch length out of range"
            goto L_0x1424
        L_0x1403:
            java.lang.String r1 = "StringSearch offset out of range"
            goto L_0x1424
        L_0x1406:
            r2 = move-exception
            java.lang.String r1 = "ArrayCopy dst must be mutable"
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r3 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r0, r2)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x145c
        L_0x1415:
            java.lang.String r1 = "ArrayCopy length out of range"
            goto L_0x1424
        L_0x1418:
            java.lang.String r1 = "ArrayCopy dst index out of range"
            goto L_0x1424
        L_0x141b:
            java.lang.String r1 = "ArrayCopy src index out of range"
            goto L_0x1424
        L_0x141e:
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r1 = X.002.A0O(r0, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x1424:
            java.lang.String r0 = "RangeError: "
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r3 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x145c
        L_0x1430:
            java.lang.String r1 = "Unsupported opcode "
            java.lang.String[] r0 = X.C10028RlN.A00     // Catch:{ 6U1 -> 0x145d }
            r0 = r0[r4]     // Catch:{ 6U1 -> 0x145d }
            java.lang.String r4 = X.002.A0R(r1, r0)     // Catch:{ 6U1 -> 0x145d }
        L_0x143a:
            java.lang.String r0 = "InvalidBytecode: "
            java.lang.String r0 = X.002.A0R(r0, r4)     // Catch:{ 6U1 -> 0x145d }
            X.6U0 r3 = new X.6U0     // Catch:{ 6U1 -> 0x145d }
            r3.<init>((java.lang.String) r0)     // Catch:{ 6U1 -> 0x145d }
            goto L_0x145c
        L_0x1446:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            A0H(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x1450 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ UnsupportedOperationException -> 0x1450 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x1450 }
        L_0x1450:
            r1 = move-exception
        L_0x1451:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ 6U1 -> 0x145d }
            X.6U1 r3 = new X.6U1     // Catch:{ 6U1 -> 0x145d }
            r3.<init>(r0, r1)     // Catch:{ 6U1 -> 0x145d }
        L_0x145c:
            throw r3     // Catch:{ 6U1 -> 0x145d }
        L_0x145d:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r2 = r10.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6Tt r1 = X.C308356Ty.A00(r0)
            r0 = r16
            A0A(r1, r5, r0, r7)
        L_0x1474:
            int[] r1 = r10.A04
            r4 = r1[r2]
            if (r4 != 0) goto L_0x14bb
            java.lang.String r6 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "mins stack trace:\n"
            r5.append(r0)
            int r2 = r10.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6Tt r1 = X.C308356Ty.A00(r0)
            r0 = r16
            A09(r1, r5, r0)
        L_0x1499:
            int[] r1 = r10.A04
            r4 = r1[r2]
            if (r4 != 0) goto L_0x14a8
            r5.toString()
            X.6U0 r0 = new X.6U0
            r0.<init>(r6, r3)
            throw r0
        L_0x14a8:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r4 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6Tt r0 = X.C308356Ty.A00(r0)
            A09(r0, r5, r2)
            r2 = r4
            goto L_0x1499
        L_0x14bb:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r4 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6Tt r0 = X.C308356Ty.A00(r0)
            A0A(r0, r5, r2, r8)
            r2 = r4
            goto L_0x1474
        L_0x14ce:
            r1 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308336Tw.A0B(X.6Tw):void");
    }
}
