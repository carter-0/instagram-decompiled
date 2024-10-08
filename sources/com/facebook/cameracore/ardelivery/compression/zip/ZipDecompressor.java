package com.facebook.cameracore.ardelivery.compression.zip;

import X.SKJ;
import java.io.InputStream;

public final class ZipDecompressor {
    public static final SKJ Companion = new Object();
    public static final int UNZIP_BUFFER_SIZE = 4096;

    public static final int unZipToFolderBuffered(InputStream inputStream, String str) {
        return SKJ.A00(inputStream, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.9uD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.9uD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.9uD} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9uD] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.9uD] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C392109uD decompress(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            X.AnonymousClass7TG.A1N(r4, r5)
            X.1FF r0 = new X.1FF     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            r0.<init>(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            r2.<init>(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x002b }
            int r0 = X.SKJ.A00(r2, r5)     // Catch:{ all -> 0x002b }
            if (r0 <= 0) goto L_0x0022
            java.io.File r1 = X.AnonymousClass7TE.A0t(r5)     // Catch:{ all -> 0x002b }
            X.9uD r0 = new X.9uD     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r0.A00 = r1     // Catch:{ all -> 0x002b }
            goto L_0x0027
        L_0x0022:
            X.9uD r0 = new X.9uD     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
        L_0x0027:
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            return r0
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r0.getMessage()
            X.9uD r0 = new X.9uD
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.decompress(java.lang.String, java.lang.String):X.9uD");
    }

    public static final void createDirIfNotExist(String str, String str2) {
        SKJ.A01(str, str2);
    }
}
