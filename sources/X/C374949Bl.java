package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9Bl  reason: invalid class name and case insensitive filesystem */
public abstract class C374949Bl {
    public static final AnonymousClass9C0 A00;
    public static final AnonymousClass9C0 A01 = new Object();
    public static final Class A02;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.9C0] */
    static {
        Class<?> cls;
        AnonymousClass9C0 r0;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                r0 = (AnonymousClass9C0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                A00 = r0;
            }
        } catch (Throwable unused2) {
        }
        r0 = null;
        A00 = r0;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.975] */
    public static void A03(Object obj, Object obj2) {
        AnonymousClass972 r9 = (AnonymousClass972) obj;
        AnonymousClass975 r6 = r9.unknownFields;
        AnonymousClass975 r7 = ((AnonymousClass972) obj2).unknownFields;
        AnonymousClass975 r1 = AnonymousClass975.A05;
        AnonymousClass975 r62 = r6;
        if (!r1.equals(r7)) {
            if (r1.equals(r6)) {
                int i = r6.A00 + r7.A00;
                int[] copyOf = Arrays.copyOf(r6.A03, i);
                System.arraycopy(r7.A03, 0, copyOf, r6.A00, r7.A00);
                Object[] copyOf2 = Arrays.copyOf(r6.A04, i);
                System.arraycopy(r7.A04, 0, copyOf2, r6.A00, r7.A00);
                ? obj3 = new Object();
                obj3.A01 = -1;
                obj3.A00 = i;
                obj3.A03 = copyOf;
                obj3.A04 = copyOf2;
                obj3.A02 = true;
                r62 = obj3;
            } else {
                r62 = r6;
                if (!r7.equals(r1)) {
                    if (r6.A02) {
                        int i2 = r6.A00 + r7.A00;
                        AnonymousClass975.A00(r6, i2);
                        System.arraycopy(r7.A03, 0, r6.A03, r6.A00, r7.A00);
                        System.arraycopy(r7.A04, 0, r6.A04, r6.A00, r7.A00);
                        r6.A00 = i2;
                        r62 = r6;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        r9.unknownFields = r62;
    }

    public static int A00(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Number) list.get(i3)).intValue();
            boolean z = C384019gd.A05;
            if (intValue >= 0) {
                i = C384019gd.A00(intValue);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
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
            boolean z = C384019gd.A05;
            if (intValue >= 0) {
                i = C384019gd.A00(intValue);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A02(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Number) list.get(i2)).longValue();
            i += C384019gd.A01((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }
}
