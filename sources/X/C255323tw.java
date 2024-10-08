package X;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3tw  reason: invalid class name and case insensitive filesystem */
public final class C255323tw {
    public static final C255323tw A01 = new C255333tx().A00();
    public static final String A02 = AnonymousClass389.A01("Data");
    public Map A00;

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Set keySet = map.keySet();
                Map map2 = ((C255323tw) obj).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object next : keySet) {
                        Object obj2 = map.get(next);
                        Object obj3 = map2.get(next);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                                    equals = obj2.equals(obj3);
                                } else {
                                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                                }
                                if (!equals) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.3tw] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC, Splitter:B:20:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C255323tw A00(byte[] r7) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x007a
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r7)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003a, all -> 0x0038 }
            r4.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x003a, all -> 0x0038 }
            int r2 = r4.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
        L_0x001b:
            if (r2 <= 0) goto L_0x002b
            java.lang.String r1 = r4.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            r5.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            int r2 = r2 + -1
            goto L_0x001b
        L_0x002b:
            r4.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x004b
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            goto L_0x004b
        L_0x0036:
            r0 = move-exception
            goto L_0x003c
        L_0x0038:
            r2 = move-exception
            goto L_0x006f
        L_0x003a:
            r0 = move-exception
            r4 = r1
        L_0x003c:
            java.lang.String r1 = A02     // Catch:{ all -> 0x0062 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x004b
            r4.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x004b:
            r6.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0055:
            X.3tw r1 = new X.3tw
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r5)
            r1.A00 = r0
            return r1
        L_0x0062:
            r2 = move-exception
            if (r4 == 0) goto L_0x006f
            r4.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x006f
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x006f:
            r6.close()     // Catch:{ IOException -> 0x0073 }
            throw r2
        L_0x0073:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L_0x007a:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255323tw.A00(byte[]):X.3tw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078 A[SYNTHETIC, Splitter:B:30:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d A[SYNTHETIC, Splitter:B:42:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C255323tw r7) {
        /*
            java.lang.String r3 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r6 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006c }
            r5.<init>(r4)     // Catch:{ IOException -> 0x006c }
            java.util.Map r0 = r7.A00     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r5.writeInt(r0)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Map r0 = r7.A00     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
        L_0x0020:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r5.writeUTF(r0)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r5.writeObject(r0)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r5.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0047:
            r4.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0051:
            int r1 = r4.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x005e
            byte[] r1 = r4.toByteArray()
            return r1
        L_0x005e:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0066:
            r2 = move-exception
            r6 = r5
            goto L_0x008b
        L_0x0069:
            r0 = move-exception
            r6 = r5
            goto L_0x006d
        L_0x006c:
            r0 = move-exception
        L_0x006d:
            java.lang.String r2 = A02     // Catch:{ all -> 0x008a }
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x008a }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x008a }
            if (r6 == 0) goto L_0x0080
            r6.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
        L_0x0080:
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0089
        L_0x0084:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
            return r1
        L_0x0089:
            return r1
        L_0x008a:
            r2 = move-exception
        L_0x008b:
            if (r6 == 0) goto L_0x0097
            r6.close()     // Catch:{ IOException -> 0x0091 }
            goto L_0x0097
        L_0x0091:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0097:
            r4.close()     // Catch:{ IOException -> 0x009b }
            throw r2
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255323tw.A01(X.3tw):byte[]");
    }

    public final int A02(String str, int i) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    public final String A03(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
