package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class FFE {
    public static String A01(Boolean bool, Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                F0B f0b = (F0B) A0v.next();
                A0A.A0c();
                List list = f0b.A04;
                16P.A03(A0A, Pxd.A00(257));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C41846B3n.A18(A0A, it);
                }
                A0A.A0Y();
                if (f0b.A05 != null) {
                    16P.A03(A0A, "phone_numbers_normalized");
                    Iterator it2 = f0b.A05.iterator();
                    while (it2.hasNext()) {
                        C41846B3n.A18(A0A, it2);
                    }
                    A0A.A0Y();
                }
                List list2 = f0b.A03;
                16P.A03(A0A, AnonymousClass000.A00(3048));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C41846B3n.A18(A0A, it3);
                }
                A0A.A0Y();
                String str = f0b.A01;
                if (str != null) {
                    A0A.A0R("first_name", str);
                }
                String str2 = f0b.A02;
                if (str2 != null) {
                    A0A.A0R("last_name", str2);
                }
                String str3 = f0b.A00;
                if (str3 != null) {
                    A0A.A0R("display_name", str3);
                }
                A0A.A0Z();
            }
            A0A.A0Y();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            if (bool.booleanValue()) {
                A03(1001131023);
            }
            throw new RuntimeException("Error creating json string", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r2.Ah0(X.0Tu.A04, 36327524879317489L) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        if (r1 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r2.Ah0(X.0Tu.A04, 36327524879383026L) == false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap A02(android.content.Context r15, com.instagram.common.session.UserSession r16, boolean r17, boolean r18) {
        /*
            if (r17 == 0) goto L_0x0008
            r0 = 1001136624(0x3bac21f0, float:0.005253069)
            A03(r0)
        L_0x0008:
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            r0 = 0
            r2 = r16
            X.1AA r2 = X.182.A02(r2, r0)
            r5 = 1
            r4 = 0
            if (r17 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            X.0Tu r6 = X.0Tu.A04
            r0 = 36327524879383026(0x810fb1000139f2, double:3.037011240698774E-306)
            boolean r0 = r2.Ah0(r6, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            android.net.Uri r9 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            if (r9 != 0) goto L_0x0163
            if (r17 == 0) goto L_0x0035
            r0 = 1001143059(0x3bac3b13, float:0.0052560656)
        L_0x0032:
            A03(r0)
        L_0x0035:
            r8 = 0
        L_0x0036:
            if (r18 != 0) goto L_0x007c
            android.net.Uri r10 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI
            if (r10 != 0) goto L_0x00fe
            if (r17 == 0) goto L_0x0044
            r0 = 1001135210(0x3bac1c6a, float:0.0052524107)
        L_0x0041:
            A03(r0)
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r17 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            X.0Tu r6 = X.0Tu.A04
            r0 = 36327524879317489(0x810fb1000039f1, double:3.037011240657328E-306)
            boolean r0 = r2.Ah0(r6, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            android.net.Uri r10 = android.provider.ContactsContract.Data.CONTENT_URI
            if (r10 != 0) goto L_0x007d
            if (r17 == 0) goto L_0x0064
            r0 = 1001134850(0x3bac1b02, float:0.005252243)
        L_0x0061:
            A03(r0)
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r17 == 0) goto L_0x007c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x007c
            if (r8 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x0076
            r0 = 1001131950(0x3bac0fae, float:0.0052508926)
            if (r1 != 0) goto L_0x0079
        L_0x0076:
            r0 = 1001136407(0x3bac2117, float:0.005252968)
        L_0x0079:
            A03(r0)
        L_0x007c:
            return r3
        L_0x007d:
            android.content.ContentProviderClient r9 = X.C61990qh.A00(r15, r10)
            if (r9 != 0) goto L_0x0089
            if (r17 == 0) goto L_0x0064
            r0 = 1001134213(0x3bac1885, float:0.0052519464)
            goto L_0x0061
        L_0x0089:
            r1 = 0
            if (r6 == 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            java.lang.String[] r11 = X.C49305Eso.A00     // Catch:{ RemoteException -> 0x00ec }
            goto L_0x0092
        L_0x0090:
            java.lang.String[] r11 = X.C49305Eso.A01     // Catch:{ RemoteException -> 0x00ec }
        L_0x0092:
            java.lang.String r12 = "mimetype = ? AND data1 IS NOT NULL"
            r0 = 1930(0x78a, float:2.705E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RemoteException -> 0x00ec }
            java.lang.String[] r13 = new java.lang.String[]{r0}     // Catch:{ RemoteException -> 0x00ec }
            java.lang.String r14 = "contact_id"
            android.database.Cursor r1 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ RemoteException -> 0x00ec }
            if (r1 != 0) goto L_0x00b2
            if (r17 == 0) goto L_0x00ae
            r0 = 1001137390(0x3bac24ee, float:0.005253426)
            A03(r0)     // Catch:{ RemoteException -> 0x00ec }
        L_0x00ae:
            r9.release()
            goto L_0x0064
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            boolean r0 = r1.moveToNext()     // Catch:{ RemoteException -> 0x00ec }
            if (r0 == 0) goto L_0x00d9
            int r0 = r1.getInt(r4)     // Catch:{ RemoteException -> 0x00ec }
            X.F0B r2 = A00(r3, r0)     // Catch:{ RemoteException -> 0x00ec }
            java.lang.String r0 = r1.getString(r5)     // Catch:{ RemoteException -> 0x00ec }
            r2.A01 = r0     // Catch:{ RemoteException -> 0x00ec }
            r0 = 2
            java.lang.String r0 = r1.getString(r0)     // Catch:{ RemoteException -> 0x00ec }
            r2.A02 = r0     // Catch:{ RemoteException -> 0x00ec }
            if (r6 != 0) goto L_0x00d7
            r0 = 3
            java.lang.String r0 = r1.getString(r0)     // Catch:{ RemoteException -> 0x00ec }
            r2.A00 = r0     // Catch:{ RemoteException -> 0x00ec }
        L_0x00d7:
            r2 = 1
            goto L_0x00b3
        L_0x00d9:
            if (r17 == 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00e3
            r0 = 1001134765(0x3bac1aad, float:0.0052522034)
            A03(r0)     // Catch:{ RemoteException -> 0x00ec }
        L_0x00e3:
            r9.release()
            r1.close()
            r1 = 1
            goto L_0x0065
        L_0x00ec:
            if (r17 == 0) goto L_0x00f4
            r0 = 1001133261(0x3bac14cd, float:0.005251503)
            A03(r0)     // Catch:{ all -> 0x01f6 }
        L_0x00f4:
            r9.release()
            if (r1 == 0) goto L_0x0064
            r1.close()
            goto L_0x0064
        L_0x00fe:
            r12 = 0
            android.content.ContentProviderClient r9 = X.C61990qh.A00(r15, r10)
            if (r9 != 0) goto L_0x010c
            if (r17 == 0) goto L_0x0044
            r0 = 1001140263(0x3bac3027, float:0.0052547636)
            goto L_0x0041
        L_0x010c:
            java.lang.String[] r11 = X.C49276EsJ.A00     // Catch:{ RemoteException -> 0x0151 }
            java.lang.String r14 = "contact_id"
            r13 = r12
            android.database.Cursor r12 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ RemoteException -> 0x0151 }
            if (r12 != 0) goto L_0x0124
            if (r17 == 0) goto L_0x011f
            r0 = 1001129659(0x3bac06bb, float:0.005249826)
            A03(r0)     // Catch:{ RemoteException -> 0x0151 }
        L_0x011f:
            r9.release()
            goto L_0x0044
        L_0x0124:
            r1 = 0
        L_0x0125:
            boolean r0 = r12.moveToNext()     // Catch:{ RemoteException -> 0x0151 }
            if (r0 == 0) goto L_0x013e
            int r0 = r12.getInt(r4)     // Catch:{ RemoteException -> 0x0151 }
            java.lang.String r1 = r12.getString(r5)     // Catch:{ RemoteException -> 0x0151 }
            X.F0B r0 = A00(r3, r0)     // Catch:{ RemoteException -> 0x0151 }
            java.util.List r0 = r0.A03     // Catch:{ RemoteException -> 0x0151 }
            r0.add(r1)     // Catch:{ RemoteException -> 0x0151 }
            r1 = 1
            goto L_0x0125
        L_0x013e:
            if (r17 == 0) goto L_0x0148
            if (r1 == 0) goto L_0x0148
            r0 = 1001132508(0x3bac11dc, float:0.0052511524)
            A03(r0)     // Catch:{ RemoteException -> 0x0151 }
        L_0x0148:
            r9.release()
            r12.close()
            r7 = 1
            goto L_0x0045
        L_0x0151:
            if (r17 == 0) goto L_0x0159
            r0 = 1001131313(0x3bac0d31, float:0.005250596)
            A03(r0)     // Catch:{ all -> 0x01e2 }
        L_0x0159:
            r9.release()
            if (r12 == 0) goto L_0x0044
            r12.close()
            goto L_0x0044
        L_0x0163:
            android.content.ContentProviderClient r8 = X.C61990qh.A00(r15, r9)
            if (r8 != 0) goto L_0x0170
            if (r17 == 0) goto L_0x0035
            r0 = 1001136081(0x3bac1fd1, float:0.0052528162)
            goto L_0x0032
        L_0x0170:
            r11 = 0
            if (r7 == 0) goto L_0x0174
            goto L_0x0177
        L_0x0174:
            java.lang.String[] r10 = X.C49306Esp.A00     // Catch:{ RemoteException -> 0x01d0 }
            goto L_0x0179
        L_0x0177:
            java.lang.String[] r10 = X.C49306Esp.A01     // Catch:{ RemoteException -> 0x01d0 }
        L_0x0179:
            java.lang.String r13 = "contact_id"
            r12 = r11
            android.database.Cursor r11 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ RemoteException -> 0x01d0 }
            if (r11 != 0) goto L_0x018f
            if (r17 == 0) goto L_0x018a
            r0 = 1001134679(0x3bac1a57, float:0.0052521634)
            A03(r0)     // Catch:{ RemoteException -> 0x01d0 }
        L_0x018a:
            r8.release()
            goto L_0x0035
        L_0x018f:
            r1 = 0
        L_0x0190:
            boolean r0 = r11.moveToNext()     // Catch:{ RemoteException -> 0x01d0 }
            if (r0 == 0) goto L_0x01bd
            int r0 = r11.getInt(r4)     // Catch:{ RemoteException -> 0x01d0 }
            java.lang.String r1 = r11.getString(r5)     // Catch:{ RemoteException -> 0x01d0 }
            X.F0B r6 = A00(r3, r0)     // Catch:{ RemoteException -> 0x01d0 }
            java.util.List r0 = r6.A04     // Catch:{ RemoteException -> 0x01d0 }
            r0.add(r1)     // Catch:{ RemoteException -> 0x01d0 }
            if (r7 != 0) goto L_0x01bb
            r0 = 2
            java.lang.String r1 = r11.getString(r0)     // Catch:{ RemoteException -> 0x01d0 }
            java.util.List r0 = r6.A05     // Catch:{ RemoteException -> 0x01d0 }
            if (r0 != 0) goto L_0x01b8
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x01d0 }
            r6.A05 = r0     // Catch:{ RemoteException -> 0x01d0 }
        L_0x01b8:
            r0.add(r1)     // Catch:{ RemoteException -> 0x01d0 }
        L_0x01bb:
            r1 = 1
            goto L_0x0190
        L_0x01bd:
            if (r17 == 0) goto L_0x01c7
            if (r1 == 0) goto L_0x01c7
            r0 = 1001139609(0x3bac2d99, float:0.005254459)
            A03(r0)     // Catch:{ RemoteException -> 0x01d0 }
        L_0x01c7:
            r8.release()
            r11.close()
            r8 = 1
            goto L_0x0036
        L_0x01d0:
            if (r17 == 0) goto L_0x01d8
            r0 = 1001133076(0x3bac1414, float:0.005251417)
            A03(r0)     // Catch:{ all -> 0x01ec }
        L_0x01d8:
            r8.release()
            if (r11 == 0) goto L_0x0035
            r11.close()
            goto L_0x0035
        L_0x01e2:
            r0 = move-exception
            r9.release()
            if (r12 == 0) goto L_0x01ff
            r12.close()
            throw r0
        L_0x01ec:
            r0 = move-exception
            r8.release()
            if (r11 == 0) goto L_0x01ff
            r11.close()
            throw r0
        L_0x01f6:
            r0 = move-exception
            r9.release()
            if (r1 == 0) goto L_0x01ff
            r1.close()
        L_0x01ff:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFE.A02(android.content.Context, com.instagram.common.session.UserSession, boolean, boolean):java.util.LinkedHashMap");
    }

    public static void A03(int i) {
        0wj.A00("ContactHelper", i, true).report();
    }

    public static F0B A00(Map map, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (F0B) map.get(valueOf);
        }
        F0B f0b = new F0B();
        map.put(valueOf, f0b);
        return f0b;
    }
}
