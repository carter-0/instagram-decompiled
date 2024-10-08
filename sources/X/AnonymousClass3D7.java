package X;

import android.os.Build;

/* renamed from: X.3D7  reason: invalid class name */
public abstract class AnonymousClass3D7 {
    public static final int A00(C2379139t r1) {
        0qQ.A0B(r1, 0);
        switch (r1.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw new RuntimeException();
        }
    }

    public static final int A01(Integer num) {
        0qQ.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            return 3;
        }
        if (intValue == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && num == AnonymousClass05K.A0j) {
            return 5;
        }
        throw new IllegalArgumentException(002.A0g("Could not convert ", AnonymousClass52X.A00(num), " to int"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet A06(byte[] r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            int r1 = r8.length
            r6 = 0
            if (r1 != 0) goto L_0x000e
            r0 = 1
        L_0x000e:
            if (r0 != 0) goto L_0x0054
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r8)
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0045 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0045 }
            int r3 = r4.readInt()     // Catch:{ all -> 0x003e }
        L_0x001e:
            if (r6 >= r3) goto L_0x003a
            java.lang.String r0 = r4.readUTF()     // Catch:{ all -> 0x003e }
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x003e }
            boolean r1 = r4.readBoolean()     // Catch:{ all -> 0x003e }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x003e }
            X.S47 r0 = new X.S47     // Catch:{ all -> 0x003e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x003e }
            r7.add(r0)     // Catch:{ all -> 0x003e }
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            r4.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ IOException -> 0x0045 }
            throw r0     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x004d }
        L_0x0049:
            r5.close()
            return r7
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.1zE.A00(r5, r1)
            throw r0
        L_0x0054:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3D7.A06(byte[]):java.util.LinkedHashSet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A07(java.util.Set r5) {
        /*
            r1 = 0
            X.0qQ.A0B(r5, r1)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x000d
            byte[] r0 = new byte[r1]
            return r0
        L_0x000d:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0052 }
            r3.<init>(r4)     // Catch:{ all -> 0x0052 }
            int r0 = r5.size()     // Catch:{ all -> 0x004b }
            r3.writeInt(r0)     // Catch:{ all -> 0x004b }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x004b }
        L_0x0022:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x004b }
            X.S47 r1 = (X.S47) r1     // Catch:{ all -> 0x004b }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            r3.writeUTF(r0)     // Catch:{ all -> 0x004b }
            boolean r0 = r1.A01     // Catch:{ all -> 0x004b }
            r3.writeBoolean(r0)     // Catch:{ all -> 0x004b }
            goto L_0x0022
        L_0x003d:
            r3.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            byte[] r0 = r4.toByteArray()
            X.0qQ.A07(r0)
            return r0
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3D7.A07(java.util.Set):byte[]");
    }

    public static final C2379139t A02(int i) {
        if (i == 0) {
            return C2379139t.ENQUEUED;
        }
        if (i == 1) {
            return C2379139t.RUNNING;
        }
        if (i == 2) {
            return C2379139t.SUCCEEDED;
        }
        if (i == 3) {
            return C2379139t.FAILED;
        }
        if (i == 4) {
            return C2379139t.BLOCKED;
        }
        if (i == 5) {
            return C2379139t.CANCELLED;
        }
        throw new IllegalArgumentException(002.A0c("Could not convert ", " to State", i));
    }

    public static final Integer A03(int i) {
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        throw new IllegalArgumentException(002.A0c("Could not convert ", " to BackoffPolicy", i));
    }

    public static final Integer A04(int i) {
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        if (i == 2) {
            return AnonymousClass05K.A0C;
        }
        if (i == 3) {
            return AnonymousClass05K.A0N;
        }
        if (i == 4) {
            return AnonymousClass05K.A0Y;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return AnonymousClass05K.A0j;
        }
        throw new IllegalArgumentException(002.A0c("Could not convert ", " to NetworkType", i));
    }

    public static final Integer A05(int i) {
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        throw new IllegalArgumentException(002.A0c("Could not convert ", " to OutOfQuotaPolicy", i));
    }
}
