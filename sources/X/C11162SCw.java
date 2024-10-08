package X;

import java.util.Arrays;

/* renamed from: X.SCw  reason: case insensitive filesystem */
public abstract class C11162SCw {
    public static final C9704RfN A00;
    public static final C9704RfN A01 = new Object();
    public static final Class A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.RfN] */
    static {
        Class<?> cls;
        C9704RfN rfN = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                rfN = (C9704RfN) Pxh.A0e(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = rfN;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.SRM, java.lang.Object] */
    public static void A00(Object obj, Object obj2) {
        C8424QuF quF = (C8424QuF) obj;
        SRM srm = quF.zzc;
        SRM srm2 = ((C8424QuF) obj2).zzc;
        SRM srm3 = SRM.A04;
        SRM srm4 = srm;
        if (!srm3.equals(srm2)) {
            if (srm3.equals(srm)) {
                int i = srm.A00 + srm2.A00;
                int[] copyOf = Arrays.copyOf(srm.A02, i);
                System.arraycopy(srm2.A02, 0, copyOf, srm.A00, srm2.A00);
                Object[] copyOf2 = Arrays.copyOf(srm.A03, i);
                System.arraycopy(srm2.A03, 0, copyOf2, srm.A00, srm2.A00);
                ? obj3 = new Object();
                obj3.A00 = i;
                obj3.A02 = copyOf;
                obj3.A03 = copyOf2;
                obj3.A01 = true;
                srm4 = obj3;
            } else {
                srm4 = srm;
                if (!srm2.equals(srm3)) {
                    if (srm.A01) {
                        int i2 = srm.A00 + srm2.A00;
                        SRM.A01(srm, i2);
                        System.arraycopy(srm2.A02, 0, srm.A02, srm.A00, srm2.A00);
                        System.arraycopy(srm2.A03, 0, srm.A03, srm.A00, srm2.A00);
                        srm.A00 = i2;
                        srm4 = srm;
                    } else {
                        throw C66580MXl.A11();
                    }
                }
            }
        }
        quF.zzc = srm4;
    }
}
