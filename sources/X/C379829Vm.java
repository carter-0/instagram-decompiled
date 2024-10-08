package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.9Vm  reason: invalid class name and case insensitive filesystem */
public abstract class C379829Vm {
    public static final String[] A00 = {Location.LATITUDE, "longitude"};

    public static double A00(String str) {
        String[] split = str.split(",", 3);
        String[] split2 = split[0].split("/", 2);
        double parseDouble = Double.parseDouble(split2[0]);
        boolean z = false;
        if (parseDouble < 0.0d) {
            z = true;
            parseDouble = -parseDouble;
        }
        double parseDouble2 = parseDouble / Double.parseDouble(split2[1]);
        String[] split3 = split[1].split("/", 2);
        double parseDouble3 = Double.parseDouble(split3[0]) / Double.parseDouble(split3[1]);
        String[] split4 = split[2].split("/", 2);
        double parseDouble4 = parseDouble2 + (parseDouble3 / 60.0d) + ((Double.parseDouble(split4[0]) / Double.parseDouble(split4[1])) / 3600.0d);
        if (z) {
            return -parseDouble4;
        }
        return parseDouble4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.location.Location} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.location.Location} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.location.Location A01(android.content.Context r10, android.net.Uri r11, java.lang.String r12) {
        /*
            java.lang.String r2 = "ExifLocationUtil"
            r7 = r11
            android.content.ContentProviderClient r6 = X.C61990qh.A00(r10, r11)
            r11 = 0
            if (r6 == 0) goto L_0x0072
            java.lang.String[] r8 = A00     // Catch:{ SecurityException -> 0x0055, RemoteException -> 0x004d, all -> 0x004b }
            java.lang.String r9 = "_data=?"
            java.lang.String[] r10 = new java.lang.String[]{r12}     // Catch:{ SecurityException -> 0x0055, RemoteException -> 0x004d, all -> 0x004b }
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x0055, RemoteException -> 0x004d, all -> 0x004b }
            if (r5 == 0) goto L_0x005e
            boolean r0 = r5.moveToFirst()     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            if (r0 == 0) goto L_0x005e
            int r1 = r5.getColumnCount()     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            r0 = 2
            if (r1 != r0) goto L_0x005e
            java.lang.String r0 = "latitude"
            int r1 = r5.getColumnIndex(r0)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            java.lang.String r0 = "longitude"
            int r4 = r5.getColumnIndex(r0)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            java.lang.String r0 = "mediastore"
            android.location.Location r3 = new android.location.Location     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            r3.<init>(r0)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            double r0 = r5.getDouble(r1)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            r3.setLatitude(r0)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            double r0 = r5.getDouble(r4)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            r3.setLongitude(r0)     // Catch:{ SecurityException -> 0x0049, RemoteException -> 0x0047 }
            goto L_0x005d
        L_0x0047:
            r1 = move-exception
            goto L_0x004f
        L_0x0049:
            r1 = move-exception
            goto L_0x0057
        L_0x004b:
            r0 = move-exception
            goto L_0x0069
        L_0x004d:
            r1 = move-exception
            r5 = r11
        L_0x004f:
            java.lang.String r0 = "getVideoLocation failed with RemoteException"
            X.0kD.A07(r2, r0, r1)     // Catch:{ all -> 0x0067 }
            goto L_0x005e
        L_0x0055:
            r1 = move-exception
            r5 = r11
        L_0x0057:
            java.lang.String r0 = "getVideoLocation failed with SecurityException"
            X.0kD.A07(r2, r0, r1)     // Catch:{ all -> 0x0067 }
            goto L_0x005e
        L_0x005d:
            r11 = r3
        L_0x005e:
            r6.release()
            if (r5 == 0) goto L_0x0072
            r5.close()
            return r11
        L_0x0067:
            r0 = move-exception
            r11 = r5
        L_0x0069:
            r6.release()
            if (r11 == 0) goto L_0x0071
            r11.close()
        L_0x0071:
            throw r0
        L_0x0072:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379829Vm.A01(android.content.Context, android.net.Uri, java.lang.String):android.location.Location");
    }

    public static void A03(android.location.Location location, String str) {
        String str2;
        String str3;
        try {
            C227922kK r6 = new C227922kK(str);
            r6.A0P("GPSLatitude", A02(location.getLatitude()));
            r6.A0P("GPSLongitude", A02(location.getLongitude()));
            if (location.getLatitude() < 0.0d) {
                str2 = "S";
            } else {
                str2 = "N";
            }
            r6.A0P("GPSLatitudeRef", str2);
            if (location.getLongitude() < 0.0d) {
                str3 = "W";
            } else {
                str3 = "E";
            }
            r6.A0P("GPSLongitudeRef", str3);
            r6.A0O();
        } catch (IOException e) {
            0kD.A07("Exif Writing Error", "IO Exeption while trying to write exifInterface for photo's location", e);
        }
    }

    public static double[] A04(C227922kK r10) {
        double A002;
        double A003;
        String A0N = r10.A0N("GPSLatitude");
        String A0N2 = r10.A0N("GPSLatitudeRef");
        String A0N3 = r10.A0N("GPSLongitude");
        String A0N4 = r10.A0N("GPSLongitudeRef");
        if (!(A0N == null || A0N2 == null || A0N3 == null || A0N4 == null)) {
            try {
                double[] dArr = new double[2];
                if (A0N2.equals("N")) {
                    A002 = A00(A0N);
                } else {
                    A002 = A00(A0N);
                    if (A002 > 0.0d) {
                        A002 = -A002;
                    }
                }
                dArr[0] = A002;
                if (A0N4.equals("E")) {
                    A003 = A00(A0N3);
                } else {
                    A003 = A00(A0N3);
                    if (A003 > 0.0d) {
                        A003 = -A003;
                    }
                }
                dArr[1] = A003;
                return dArr;
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public static String A02(double d) {
        double abs = Math.abs(d);
        int floor = (int) Math.floor(abs);
        double d2 = abs - ((double) floor);
        int floor2 = (int) Math.floor(d2 * 60.0d);
        return String.format(Locale.US, "%d/1,%d/1,%d/1", new Object[]{Integer.valueOf(floor), Integer.valueOf(floor2), Integer.valueOf((int) Math.floor((d2 - (((double) floor2) / 60.0d)) * 3600.0d))});
    }
}
