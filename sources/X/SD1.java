package X;

import java.util.Arrays;

public abstract class SD1 {
    public static final C9755RgD A00;
    public static final C9755RgD A01;
    public static final C9755RgD A02 = new Object();
    public static final Class A03;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.RgD, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[Catch:{ all -> 0x0052 }] */
    static {
        /*
            java.lang.String r0 = "com.google.repack.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "com.google.repack.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x002d }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x002d }
            X.RgD r0 = (X.C9755RgD) r0     // Catch:{ all -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            A00 = r0
            r2 = 1
            java.lang.String r0 = "com.google.repack.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0052
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0052 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0052 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0052 }
            X.RgD r0 = (X.C9755RgD) r0     // Catch:{ all -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            A01 = r0
            X.RgD r0 = new X.RgD
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SD1.<clinit>():void");
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.SIT, java.lang.Object] */
    public static void A00(Object obj, Object obj2) {
        R5n r5n = (R5n) obj;
        SIT sit = r5n.unknownFields;
        SIT sit2 = ((R5n) obj2).unknownFields;
        SIT sit3 = sit;
        if (!sit2.equals(SIT.A03)) {
            int i = sit.A00;
            int i2 = sit2.A00;
            int i3 = i + i2;
            int[] copyOf = Arrays.copyOf(sit.A01, i3);
            System.arraycopy(sit2.A01, 0, copyOf, i, i2);
            Object[] copyOf2 = Arrays.copyOf(sit.A02, i3);
            System.arraycopy(sit2.A02, 0, copyOf2, i, i2);
            ? obj3 = new Object();
            obj3.A00 = i3;
            obj3.A01 = copyOf;
            obj3.A02 = copyOf2;
            sit3 = obj3;
        }
        r5n.unknownFields = sit3;
    }
}
