package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.5L4  reason: invalid class name */
public abstract class AnonymousClass5L4 {
    public static final AnonymousClass5L5 A00;
    public static final AnonymousClass5L5 A01;
    public static final AnonymousClass5L5 A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.5L5, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[Catch:{ all -> 0x0052 }] */
    static {
        /*
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x002d }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x002d }
            X.5L5 r0 = (X.AnonymousClass5L5) r0     // Catch:{ all -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            A00 = r0
            r2 = 1
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0052
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0052 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0052 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0052 }
            X.5L5 r0 = (X.AnonymousClass5L5) r0     // Catch:{ all -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            A01 = r0
            X.5L5 r0 = new X.5L5
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5L4.<clinit>():void");
    }

    public static void A0A(C13831Ti3 ti3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                pyc.A0D((AnonymousClass5L9) list.get(i2));
            }
        }
    }

    public static void A0B(C13831Ti3 ti3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (list instanceof C13977TnT) {
                C13977TnT tnT = (C13977TnT) list;
                while (i2 < list.size()) {
                    Object Bjc = tnT.Bjc(i2);
                    boolean z = Bjc instanceof String;
                    C7189Pyc pyc = pyh.A00;
                    if (z) {
                        pyc.A07((i << 3) | 2);
                        pyc.A0E((String) Bjc);
                    } else {
                        pyc.A07((i << 3) | 2);
                        pyc.A0D((AnonymousClass5L9) Bjc);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C7189Pyc pyc2 = pyh.A00;
                pyc2.A07((i << 3) | 2);
                pyc2.A0E((String) list.get(i2));
                i2++;
            }
        }
    }

    public static void A0C(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    pyc.A0F(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C7189Pyc pyc2 = pyh.A00;
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                C7193Pyg pyg = (C7193Pyg) pyc2;
                C7193Pyg.A06(pyg, 11);
                pyg.A0H(i << 3);
                byte b = booleanValue ? (byte) 1 : 0;
                byte[] bArr = pyg.A03;
                int i5 = pyg.A00;
                pyg.A00 = i5 + 1;
                bArr[i5] = b;
                pyg.A01++;
                i2++;
            }
        }
    }

    public static void A0D(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    long doubleToRawLongBits = Double.doubleToRawLongBits(((Number) list.get(i2)).doubleValue());
                    C7193Pyg.A06(pyg, 8);
                    pyg.A0I(doubleToRawLongBits);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A0A(i, Double.doubleToRawLongBits(((Number) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void A0E(C13831Ti3 ti3, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i3 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int intValue = ((Number) list.get(i5)).intValue();
                    if (intValue >= 0) {
                        i2 = C7189Pyc.A00(intValue);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                pyc.A07(i4);
                while (i3 < list.size()) {
                    int intValue2 = ((Number) list.get(i3)).intValue();
                    if (intValue2 >= 0) {
                        pyc.A07(intValue2);
                    } else {
                        pyc.A0C((long) intValue2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                pyh.A00.A09(i, ((Number) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void A0F(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    int intValue = ((Number) list.get(i2)).intValue();
                    C7193Pyg.A06(pyg, 4);
                    pyg.A0G(intValue);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A08(i, ((Number) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void A0G(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    long longValue = ((Number) list.get(i2)).longValue();
                    C7193Pyg.A06(pyg, 8);
                    pyg.A0I(longValue);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A0A(i, ((Number) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void A0H(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    int floatToRawIntBits = Float.floatToRawIntBits(((Number) list.get(i2)).floatValue());
                    C7193Pyg.A06(pyg, 4);
                    pyg.A0G(floatToRawIntBits);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A08(i, Float.floatToRawIntBits(((Number) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void A0I(C13831Ti3 ti3, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i3 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int intValue = ((Number) list.get(i5)).intValue();
                    if (intValue >= 0) {
                        i2 = C7189Pyc.A00(intValue);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                pyc.A07(i4);
                while (i3 < list.size()) {
                    int intValue2 = ((Number) list.get(i3)).intValue();
                    if (intValue2 >= 0) {
                        pyc.A07(intValue2);
                    } else {
                        pyc.A0C((long) intValue2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                pyh.A00.A09(i, ((Number) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void A0J(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C7189Pyc.A01(((Number) list.get(i4)).longValue());
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    pyc.A0C(((Number) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A0B(i, ((Number) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void A0K(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    int intValue = ((Number) list.get(i2)).intValue();
                    C7193Pyg.A06(pyg, 4);
                    pyg.A0G(intValue);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A08(i, ((Number) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void A0L(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                C7193Pyg pyg = (C7193Pyg) pyc;
                pyg.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    long longValue = ((Number) list.get(i2)).longValue();
                    C7193Pyg.A06(pyg, 8);
                    pyg.A0I(longValue);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A0A(i, ((Number) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void A0M(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Number) list.get(i4)).intValue();
                    i3 += C7189Pyc.A00((intValue >> 31) ^ (intValue << 1));
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Number) list.get(i2)).intValue();
                    pyc.A07((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C7189Pyc pyc2 = pyh.A00;
                int intValue3 = ((Number) list.get(i2)).intValue();
                C7193Pyg pyg = (C7193Pyg) pyc2;
                C7193Pyg.A06(pyg, 20);
                pyg.A0H(i << 3);
                pyg.A0H((intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void A0N(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Number) list.get(i4)).longValue();
                    i3 += C7189Pyc.A01((longValue >> 63) ^ (longValue << 1));
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Number) list.get(i2)).longValue();
                    pyc.A0C((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C7189Pyc pyc2 = pyh.A00;
                long longValue3 = ((Number) list.get(i2)).longValue();
                pyc2.A0B(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void A0O(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C7189Pyc.A00(((Number) list.get(i4)).intValue());
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    pyc.A07(((Number) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C7189Pyc pyc2 = pyh.A00;
                int intValue = ((Number) list.get(i2)).intValue();
                C7193Pyg pyg = (C7193Pyg) pyc2;
                C7193Pyg.A06(pyg, 20);
                pyg.A0H(i << 3);
                pyg.A0H(intValue);
                i2++;
            }
        }
    }

    public static void A0P(C13831Ti3 ti3, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C7194Pyh pyh = (C7194Pyh) ti3;
            int i2 = 0;
            if (z) {
                C7189Pyc pyc = pyh.A00;
                pyc.A07((i << 3) | 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C7189Pyc.A01(((Number) list.get(i4)).longValue());
                }
                pyc.A07(i3);
                while (i2 < list.size()) {
                    pyc.A0C(((Number) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                pyh.A00.A0B(i, ((Number) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.5Ko] */
    public static void A0Q(Object obj, Object obj2) {
        C283985Kk r9 = (C283985Kk) obj;
        C284015Ko r7 = r9.unknownFields;
        C284015Ko r8 = ((C283985Kk) obj2).unknownFields;
        C284015Ko r72 = r7;
        if (!r8.equals(C284015Ko.A05)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            ? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            r72 = obj3;
        }
        r9.unknownFields = r72;
    }

    public static int A00(AnonymousClass5L3 r7, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A002 = C7189Pyc.A00(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            C283995Kl r3 = (C283995Kl) ((C284005Km) list.get(i2));
            C283985Kk r2 = (C283985Kk) r3;
            int i3 = r2.memoizedSerializedSize;
            if (i3 == -1) {
                i3 = r7.Bsa(r3);
                r2.memoizedSerializedSize = i3;
            }
            A002 += C7189Pyc.A00(i3) + i3;
        }
        return A002;
    }

    public static int A01(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Number) list.get(i3)).intValue();
            boolean z = C7189Pyc.A02;
            if (intValue >= 0) {
                i = C7189Pyc.A00(intValue);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A02(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Number) list.get(i3)).intValue();
            boolean z = C7189Pyc.A02;
            if (intValue >= 0) {
                i = C7189Pyc.A00(intValue);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C7189Pyc.A01(((Number) list.get(i2)).longValue());
        }
        return i;
    }

    public static int A04(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Number) list.get(i2)).intValue();
            i += C7189Pyc.A00((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Number) list.get(i2)).longValue();
            i += C7189Pyc.A01((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int A06(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C7189Pyc.A00(((Number) list.get(i2)).intValue());
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C7189Pyc.A01(((Number) list.get(i2)).longValue());
        }
        return i;
    }

    public static int A08(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A002 = size * C7189Pyc.A00(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A032 = ((AnonymousClass5L9) list.get(i2)).A03();
            A002 += C7189Pyc.A00(A032) + A032;
        }
        return A002;
    }

    public static int A09(List list, int i) {
        int A04;
        int A042;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A002 = C7189Pyc.A00(i << 3) * size;
        if (list instanceof C13977TnT) {
            C13977TnT tnT = (C13977TnT) list;
            while (i2 < size) {
                Object Bjc = tnT.Bjc(i2);
                if (Bjc instanceof AnonymousClass5L9) {
                    int A032 = ((AnonymousClass5L9) Bjc).A03();
                    A042 = C7189Pyc.A00(A032) + A032;
                } else {
                    A042 = C7189Pyc.A04((String) Bjc);
                }
                A002 += A042;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AnonymousClass5L9) {
                    int A033 = ((AnonymousClass5L9) obj).A03();
                    A04 = C7189Pyc.A00(A033) + A033;
                } else {
                    A04 = C7189Pyc.A04((String) obj);
                }
                A002 += A04;
                i2++;
            }
        }
        return A002;
    }
}
