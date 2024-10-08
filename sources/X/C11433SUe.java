package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.SUe  reason: case insensitive filesystem */
public abstract class C11433SUe {
    public static final C10894Rzu A00;
    public static final C10894Rzu A01;
    public static final C10894Rzu A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Rzu, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[Catch:{ all -> 0x0052 }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x002d }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x002d }
            X.Rzu r0 = (X.C10894Rzu) r0     // Catch:{ all -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            A00 = r0
            r2 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0052
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0052 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0052 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0052 }
            X.Rzu r0 = (X.C10894Rzu) r0     // Catch:{ all -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            A01 = r0
            X.Rzu r0 = new X.Rzu
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11433SUe.<clinit>():void");
    }

    public static Object A09(C13661TeS teS, Object obj, List list, int i) {
        if (teS != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int A0I = C51971G9r.A0I(list, i3);
                    if (teS.CVB(A0I)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(A0I));
                        }
                        i2++;
                    } else {
                        if (obj == null) {
                            obj = new C11289SJn();
                        }
                        ((C11289SJn) obj).A01(i << 3, Long.valueOf((long) A0I));
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A0F = AnonymousClass7TG.A0F(it);
                    if (!teS.CVB(A0F)) {
                        if (obj == null) {
                            obj = new C11289SJn();
                        }
                        ((C11289SJn) obj).A01(i << 3, Long.valueOf((long) A0F));
                        it.remove();
                    }
                }
            }
        }
        return obj;
    }

    public static void A0A(C10281Rpf rpf, List list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                codedOutputStream.A0H((TAP) list.get(i2));
            }
        }
    }

    public static void A0B(C10281Rpf rpf, List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof C13979TnV) {
                C13979TnV tnV = (C13979TnV) list;
                while (i2 < list.size()) {
                    Object Bjc = tnV.Bjc(i2);
                    boolean z = Bjc instanceof String;
                    CodedOutputStream codedOutputStream = rpf.A00;
                    if (z) {
                        SQE.A08(codedOutputStream, i);
                        codedOutputStream.A0I((String) Bjc);
                    } else {
                        SQE.A08(codedOutputStream, i);
                        codedOutputStream.A0H((TAP) Bjc);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = rpf.A00;
                String A19 = AnonymousClass7TE.A19(list, i2);
                SQE.A08(codedOutputStream2, i);
                codedOutputStream2.A0I(A19);
                i2++;
            }
        }
    }

    public static void A0C(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A05(AnonymousClass7TE.A1a(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0D(i, AnonymousClass7TE.A1a(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0D(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(Pxg.A0G(list.get(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0B(i, Pxg.A0G(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0E(C10281Rpf rpf, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0I = C51971G9r.A0I(list, i5);
                    if (A0I >= 0) {
                        i2 = CodedOutputStream.A00(A0I);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A0I2 = C51971G9r.A0I(list, i3);
                    if (A0I2 >= 0) {
                        codedOutputStream.A07(A0I2);
                    } else {
                        codedOutputStream.A0F((long) A0I2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                rpf.A00.A09(i, C51971G9r.A0I(list, i3));
                i3++;
            }
        }
    }

    public static void A0F(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(C51971G9r.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A08(i, C51971G9r.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(Pxg.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0B(i, Pxg.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(Float.floatToRawIntBits(AnonymousClass7TG.A00(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A08(i, Float.floatToRawIntBits(AnonymousClass7TG.A00(list, i2)));
                i2++;
            }
        }
    }

    public static void A0I(C10281Rpf rpf, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0I = C51971G9r.A0I(list, i5);
                    if (A0I >= 0) {
                        i2 = CodedOutputStream.A00(A0I);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A0I2 = C51971G9r.A0I(list, i3);
                    if (A0I2 >= 0) {
                        codedOutputStream.A07(A0I2);
                    } else {
                        codedOutputStream.A0F((long) A0I2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                rpf.A00.A09(i, C51971G9r.A0I(list, i3));
                i3++;
            }
        }
    }

    public static void A0J(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(Pxg.A0I(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(Pxg.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0C(i, Pxg.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0K(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(C51971G9r.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A08(i, C51971G9r.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0L(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(Pxg.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0B(i, Pxg.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A00(Pxe.A02(C51971G9r.A0I(list, i4)));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(Pxe.A02(C51971G9r.A0I(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0A(i, Pxe.A02(C51971G9r.A0I(list, i2)));
                i2++;
            }
        }
    }

    public static void A0N(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(Pxh.A0G(list.get(i4)));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(Pxh.A0G(list.get(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0C(i, Pxh.A0G(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0O(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A00(C51971G9r.A0I(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(C51971G9r.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0A(i, C51971G9r.A0I(list, i2));
                i2++;
            }
        }
    }

    public static void A0P(C10281Rpf rpf, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = rpf.A00;
                SQE.A08(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(Pxg.A0I(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(Pxg.A0I(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                rpf.A00.A0C(i, Pxg.A0I(list, i2));
                i2++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.SJn] */
    public static void A0Q(Object obj, Object obj2) {
        R5b r5b = (R5b) obj;
        C11289SJn sJn = r5b.unknownFields;
        C11289SJn sJn2 = ((R5b) obj2).unknownFields;
        C11289SJn sJn3 = sJn;
        if (!sJn2.equals(C11289SJn.A05)) {
            int i = sJn.A00 + sJn2.A00;
            int[] copyOf = Arrays.copyOf(sJn.A03, i);
            System.arraycopy(sJn2.A03, 0, copyOf, sJn.A00, sJn2.A00);
            Object[] copyOf2 = Arrays.copyOf(sJn.A04, i);
            System.arraycopy(sJn2.A04, 0, copyOf2, sJn.A00, sJn2.A00);
            ? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            sJn3 = obj3;
        }
        r5b.unknownFields = sJn3;
    }

    public static int A00(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            i = 0;
            while (i4 < size) {
                R30.A00(r30, i4);
                int i5 = r30.A01[i4];
                boolean z = CodedOutputStream.A02;
                if (i5 >= 0) {
                    i3 = CodedOutputStream.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A0I = C51971G9r.A0I(list, i4);
                boolean z2 = CodedOutputStream.A02;
                if (A0I >= 0) {
                    i2 = CodedOutputStream.A00(A0I);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A01(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            i = 0;
            while (i4 < size) {
                R30.A00(r30, i4);
                int i5 = r30.A01[i4];
                boolean z = CodedOutputStream.A02;
                if (i5 >= 0) {
                    i3 = CodedOutputStream.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A0I = C51971G9r.A0I(list, i4);
                boolean z2 = CodedOutputStream.A02;
                if (A0I >= 0) {
                    i2 = CodedOutputStream.A00(A0I);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A02(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            i = 0;
            while (i2 < size) {
                R31.A00(r31, i2);
                i += CodedOutputStream.A01(r31.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A01(Pxg.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A03(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            i = 0;
            while (i2 < size) {
                R30.A00(r30, i2);
                i += CodedOutputStream.A00(Pxe.A02(r30.A01[i2]));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A00(Pxe.A02(C51971G9r.A0I(list, i2)));
                i2++;
            }
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            i = 0;
            while (i2 < size) {
                R31.A00(r31, i2);
                i = SQE.A06(r31.A01[i2], i);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A01(Pxh.A0G(list.get(i2)));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R30) {
            R30 r30 = (R30) list;
            i = 0;
            while (i2 < size) {
                R30.A00(r30, i2);
                i += CodedOutputStream.A00(r30.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A00(C51971G9r.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof R31) {
            R31 r31 = (R31) list;
            i = 0;
            while (i2 < size) {
                R31.A00(r31, i2);
                i += CodedOutputStream.A01(r31.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.A01(Pxg.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = size * SQE.A05(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A022 = ((TAP) list.get(i2)).A02();
            A05 += CodedOutputStream.A00(A022) + A022;
        }
        return A05;
    }

    public static int A08(List list, int i) {
        int A022;
        int A023;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A05 = SQE.A05(i) * size;
        if (list instanceof C13979TnV) {
            C13979TnV tnV = (C13979TnV) list;
            while (i2 < size) {
                Object Bjc = tnV.Bjc(i2);
                if (Bjc instanceof TAP) {
                    int A024 = ((TAP) Bjc).A02();
                    A023 = CodedOutputStream.A00(A024) + A024;
                } else {
                    A023 = CodedOutputStream.A02((String) Bjc);
                }
                A05 += A023;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof TAP) {
                    int A025 = ((TAP) obj).A02();
                    A022 = CodedOutputStream.A00(A025) + A025;
                } else {
                    A022 = CodedOutputStream.A02((String) obj);
                }
                A05 += A022;
                i2++;
            }
        }
        return A05;
    }
}
