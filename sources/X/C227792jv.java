package X;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2jv  reason: invalid class name and case insensitive filesystem */
public abstract class C227792jv {
    public static final String[] A00 = {"Copyright"};

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C376649Iu A00(android.content.Context r6, byte[] r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r3 = 0
            java.io.File r4 = X.0mb.A04(r6)     // Catch:{ IOException -> 0x008a, all -> 0x0088 }
            if (r4 == 0) goto L_0x0098
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0086 }
            if (r0 == 0) goto L_0x0095
            r0 = 0
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]     // Catch:{ IOException -> 0x0086 }
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.A04(r0)     // Catch:{ IOException -> 0x0086 }
            X.2kF r6 = X.C227852k8.A00     // Catch:{ IOException -> 0x0086 }
            r0 = 4
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch:{ IOException -> 0x0086 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0086 }
            com.google.common.io.FileWriteMode r0 = com.google.common.io.FileWriteMode.A01     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0060 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0060 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0060 }
            r5.addFirst(r0)     // Catch:{ all -> 0x0060 }
            r0.write(r7)     // Catch:{ all -> 0x0060 }
            r0.flush()     // Catch:{ all -> 0x0060 }
            X.C227852k8.A00(r6, r3, r5)     // Catch:{ IOException -> 0x0086 }
            boolean r0 = X.C227922kK.A0N     // Catch:{ IOException -> 0x004b }
            java.lang.String r1 = r4.getPath()     // Catch:{ IOException -> 0x004b }
            X.2kK r0 = new X.2kK     // Catch:{ IOException -> 0x004b }
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x004b }
            X.9Iu r1 = A01(r0)     // Catch:{ IOException -> 0x004b }
            goto L_0x005c
        L_0x004b:
            r2 = move-exception
            java.lang.String r1 = "ImageMetadataUtil"
            java.lang.String r0 = "Failed to get image metadata"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ IOException -> 0x0086 }
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ IOException -> 0x0086 }
            X.9Iu r1 = new X.9Iu     // Catch:{ IOException -> 0x0086 }
            r1.<init>((java.lang.String) r3, (java.util.Map) r0)     // Catch:{ IOException -> 0x0086 }
        L_0x005c:
            r4.delete()
            return r1
        L_0x0060:
            r2 = move-exception
            java.lang.Class<java.io.IOException> r1 = java.io.IOException.class
            java.lang.Object r0 = X.SS5.A00     // Catch:{ all -> 0x0081 }
            boolean r0 = r1.isInstance(r2)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0079
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0080
            boolean r0 = r2 instanceof java.lang.Error     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0080
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0081 }
            r0.<init>(r2)     // Catch:{ all -> 0x0081 }
        L_0x0078:
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0079:
            java.lang.Object r0 = r1.cast(r2)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0081 }
            goto L_0x0078
        L_0x0080:
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.C227852k8.A00(r6, r2, r5)     // Catch:{ IOException -> 0x0086 }
            throw r0     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            r2 = move-exception
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            throw r0
        L_0x008a:
            r2 = move-exception
            r4 = r3
        L_0x008c:
            java.lang.String r1 = "ImageMetadataUtil"
            java.lang.String r0 = "Failed to get image metadata"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x00a2 }
            if (r4 == 0) goto L_0x0098
        L_0x0095:
            r4.delete()
        L_0x0098:
            X.0sm r0 = X.0Yt.A0E()
            X.9Iu r1 = new X.9Iu
            r1.<init>((java.lang.String) r3, (java.util.Map) r0)
            return r1
        L_0x00a2:
            r0 = move-exception
            if (r4 == 0) goto L_0x00a8
            r4.delete()
        L_0x00a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227792jv.A00(android.content.Context, byte[]):X.9Iu");
    }

    public static final C376649Iu A01(C227922kK r6) {
        String str;
        byte[] bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = null;
        try {
            String str3 = A00[0];
            String A0N = r6.A0N(str3);
            if (A0N != null) {
                linkedHashMap.put(str3, A0N);
            }
            C227982kb A02 = C227922kK.A02(r6, "Xmp");
            if (!(A02 == null || (bArr = A02.A03) == null)) {
                str2 = new String(bArr, AnonymousClass15Q.A05);
            }
        } catch (XmlPullParserException e) {
            e = e;
            str = "Failed to parse image XMP data";
            0KC.A0F("ImageMetadataUtil", str, e);
            return new C376649Iu(str2, (Map) linkedHashMap);
        } catch (IOException e2) {
            e = e2;
            str = "Failed to extract image metadata";
            0KC.A0F("ImageMetadataUtil", str, e);
            return new C376649Iu(str2, (Map) linkedHashMap);
        }
        return new C376649Iu(str2, (Map) linkedHashMap);
    }

    public static final void A02(C376649Iu r4, File file) {
        try {
            boolean z = C227922kK.A0N;
            C227922kK r3 = new C227922kK(file.getPath());
            for (Map.Entry entry : ((Map) r4.A00).entrySet()) {
                r3.A0P((String) entry.getKey(), (String) entry.getValue());
            }
            r3.A0P("Xmp", r4.A01);
            r3.A0O();
        } catch (IOException e) {
            0KC.A0F("ImageMetadataUtil", "Failed to add image metadata", e);
        }
    }
}
