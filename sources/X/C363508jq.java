package X;

/* renamed from: X.8jq  reason: invalid class name and case insensitive filesystem */
public abstract class C363508jq {
    public static final Object A00 = new Object();

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|(2:34|35)|36|37) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x005e */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[Catch:{ FileNotFoundException -> 0x005f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x004d=Splitter:B:26:0x004d, B:36:0x005e=Splitter:B:36:0x005e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r9) {
        /*
            java.lang.Object r8 = A00
            monitor-enter(r8)
            java.lang.String r7 = ""
            java.lang.String r4 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r3 = r9.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x005f }
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r0 = "UTF-8"
            r6.setInput(r3, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            int r5 = r6.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0018:
            int r2 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r0 = 1
            if (r2 == r0) goto L_0x0048
            r1 = 3
            if (r2 != r1) goto L_0x0028
            int r0 = r6.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            if (r0 <= r5) goto L_0x0048
        L_0x0028:
            if (r2 == r1) goto L_0x0018
            r0 = 4
            if (r2 == r0) goto L_0x0018
            java.lang.String r1 = r6.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r0 = "locales"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            if (r0 == 0) goto L_0x0018
            r1 = 0
            java.lang.String r0 = "application_locales"
            java.lang.String r7 = r6.getAttributeValue(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r0 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0058 }
        L_0x0048:
            if (r3 == 0) goto L_0x004d
            r3.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0056
            r9.deleteFile(r4)     // Catch:{ all -> 0x0061 }
        L_0x0056:
            monitor-exit(r8)     // Catch:{ all -> 0x0061 }
            return r7
        L_0x0058:
            r0 = move-exception
            if (r3 == 0) goto L_0x005e
            r3.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r8)     // Catch:{ all -> 0x0061 }
            return r7
        L_0x0061:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363508jq.A00(android.content.Context):java.lang.String");
    }
}
