package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.S2y  reason: case insensitive filesystem */
public final class C10966S2y {
    public Context A00;
    public C10741RxK A01;
    public 1TT A02;
    public String A03;
    public HashMap A04 = AnonymousClass7TE.A1E();
    public HashMap A05 = AnonymousClass7TE.A1E();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (r1 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r1.A00 < r8) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(int r8) {
        /*
            r7 = this;
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L_0x004e
            X.1TT r0 = r7.A02
            X.1Sx r1 = r0.A00
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0013
            int r1 = r1.A00
            r0 = 1
            if (r1 >= r8) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
            if (r0 == 0) goto L_0x004e
            android.content.Context r0 = r7.A00
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = X.C10114Rmq.A01     // Catch:{ SecurityException -> 0x0048, all -> 0x0040 }
            r6 = 1273245501(0x4be42f3d, float:2.9908602E7)
            r3 = r2
            r4 = r2
            r5 = r2
            android.database.Cursor r1 = X.0fM.A01(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0048, all -> 0x0040 }
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0049, all -> 0x003e }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "attribution_json"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ SecurityException -> 0x0049, all -> 0x003e }
            if (r0 < 0) goto L_0x004b
            java.lang.String r2 = r1.getString(r0)     // Catch:{ SecurityException -> 0x0049, all -> 0x003e }
            goto L_0x004b
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r0
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
        L_0x004b:
            r1.close()
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10966S2y.A00(int):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.String, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(4:2|(2:5|3)|156|6)|7|(4:9|(2:12|10)|157|13)|14|(2:16|(1:18))|19|(1:21)(11:67|(1:69)(1:90)|70|(1:72)(1:89)|73|74|76|(1:78)(1:85)|79|80|82)|22|(1:24)(7:54|(1:56)(1:66)|57|(1:59)(1:65)|60|(1:62)(1:64)|63)|25|(1:27)(8:35|(1:37)(1:52)|38|(1:40)(1:51)|41|(1:43)(1:50)|44|(4:46|(2:49|47)|158|53))|28|(4:34|91|92|(3:94|(6:96|(1:98)|99|(1:101)|102|(1:104))|111))|112|(5:114|115|116|117|(3:123|(1:134)(1:127)|129))|130|(2:135|136)|137|(3:140|(2:142|143)(1:144)|(1:146))|147|148|(3:150|151|152)|153|154|159|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c4, code lost:
        if (r7 == 0) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fe, code lost:
        if (r0 != null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x035d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0383 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x037b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10966S2y(android.content.Context r13) {
        /*
            r12 = this;
            r12.<init>()
            r12.A00 = r13
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r12.A05 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r12.A04 = r0
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            X.1SF r1 = new X.1SF
            r1.<init>(r13, r0)
            X.1TT r0 = r1.A00()
            r12.A02 = r0
            X.1SO r0 = r1.A02
            X.RxK r0 = r0.A00()
            r12.A01 = r0
            java.util.HashMap r2 = r12.A05
            X.1TT r3 = r12.A02
            boolean r0 = r3.A06
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_available"
            r2.put(r0, r1)
            boolean r0 = r3.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_operational"
            r2.put(r0, r1)
            java.lang.Integer r0 = r3.A02
            java.lang.String r0 = X.RW5.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fpp_sdk_type"
            r2.put(r0, r1)
            r0 = 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fpp_sdk_algorithm"
            r2.put(r0, r1)
            java.util.Set r1 = r3.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0086
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r1.next()
            X.4kL r0 = (X.C272224kL) r0
            java.lang.String r0 = r0.name()
            r2.add(r0)
            goto L_0x006b
        L_0x007f:
            java.util.HashMap r1 = r12.A04
            java.lang.String r0 = "fpp_issues"
            r1.put(r0, r2)
        L_0x0086:
            java.util.List r1 = r3.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b3
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            X.1TT r0 = (X.1TT) r0
            java.lang.Integer r0 = r0.A02
            java.lang.String r0 = X.RW5.A00(r0)
            r2.add(r0)
            goto L_0x0096
        L_0x00ac:
            java.util.HashMap r1 = r12.A04
            java.lang.String r0 = "fpp_alternative_sdk_types"
            r1.put(r0, r2)
        L_0x00b3:
            android.os.UserHandle r2 = android.os.Process.myUserHandle()
            android.content.Context r1 = r12.A00
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            if (r0 == 0) goto L_0x00da
            long r3 = r0.getSerialNumberForUser(r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00da
            java.util.HashMap r2 = r12.A05
            java.lang.String r1 = java.lang.Long.toString(r3)
            java.lang.String r0 = "user_id"
            r2.put(r0, r1)
        L_0x00da:
            android.content.Context r0 = r12.A00
            X.S1k r3 = X.C9272RVx.A00(r0)
            java.util.HashMap r2 = r12.A05
            boolean r0 = r3.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "tos_should_accept"
            r2.put(r0, r1)
            boolean r0 = r3.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "tos_should_show_explicit"
            r2.put(r0, r1)
            X.1TT r0 = r12.A02
            X.1Sx r3 = r0.A00
            java.lang.String r4 = "app_manager_state"
            java.util.HashMap r2 = r12.A05
            if (r3 != 0) goto L_0x0203
            java.lang.String r0 = "MISSING"
            r2.put(r4, r0)
        L_0x0109:
            X.1TT r0 = r12.A02
            X.1TK r3 = r0.A01
            java.lang.String r4 = "installer_state"
            java.util.HashMap r2 = r12.A05
            if (r3 != 0) goto L_0x01b5
            java.lang.String r0 = "MISSING"
            r2.put(r4, r0)
        L_0x0118:
            X.RxK r3 = r12.A01
            java.lang.String r1 = "facebook_services_state"
            java.util.HashMap r2 = r12.A05
            if (r3 != 0) goto L_0x0147
            java.lang.String r0 = "MISSING"
            r2.put(r1, r0)
        L_0x0125:
            r0 = 1525(0x5f5, float:2.137E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = "partner_id"
            X.1TT r0 = r12.A02
            r3 = 10
            X.1Sx r1 = r0.A00
            if (r1 == 0) goto L_0x02c9
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x02c9
            int r0 = r1.A00
            if (r0 < r3) goto L_0x02c9
            android.content.Context r0 = r12.A00
            android.content.ContentResolver r5 = r0.getContentResolver()
            r7 = 0
            goto L_0x0275
        L_0x0147:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x01a9
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x014d:
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = "ACTIVE"
        L_0x0157:
            r2.put(r1, r0)
            java.lang.Integer r0 = r3.A01
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x01a3
            java.lang.String r1 = "SIDELOADED"
        L_0x0164:
            java.lang.String r0 = "facebook_services_origin"
            r2.put(r0, r1)
            int r0 = r3.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "facebook_services_version_code"
            r2.put(r0, r1)
            boolean r0 = r3.A03
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "facebook_services_operational"
            r2.put(r0, r1)
            java.util.Set r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0125
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r1.iterator()
        L_0x018f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r0 = r1.next()
            X.4kL r0 = (X.C272224kL) r0
            java.lang.String r0 = r0.name()
            r2.add(r0)
            goto L_0x018f
        L_0x01a3:
            java.lang.String r1 = "PRELOADED"
            goto L_0x0164
        L_0x01a6:
            java.lang.String r0 = "DISABLED"
            goto L_0x0157
        L_0x01a9:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x014d
        L_0x01ac:
            java.util.HashMap r1 = r12.A04
            java.lang.String r0 = "facebook_services_issues"
            r1.put(r0, r2)
            goto L_0x0125
        L_0x01b5:
            int r0 = r3.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "installer_sdk_level"
            r2.put(r0, r1)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0200
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x01c6:
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = "ACTIVE"
        L_0x01d0:
            r2.put(r4, r0)
            X.1T4 r0 = r3.A02
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "installer_type"
            r2.put(r0, r1)
            java.lang.Integer r0 = r3.A03
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x01fa
            java.lang.String r1 = "SIDELOADED"
        L_0x01e8:
            java.lang.String r0 = "installer_origin"
            r2.put(r0, r1)
            int r0 = r3.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "installer_version_code"
            r2.put(r0, r1)
            goto L_0x0118
        L_0x01fa:
            java.lang.String r1 = "PRELOADED"
            goto L_0x01e8
        L_0x01fd:
            java.lang.String r0 = "DISABLED"
            goto L_0x01d0
        L_0x0200:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x01c6
        L_0x0203:
            int r0 = r3.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "app_manager_sdk_level"
            r2.put(r0, r1)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0272
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0214:
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = "ACTIVE"
        L_0x021e:
            r2.put(r4, r0)
            java.lang.Integer r0 = r3.A04
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0266;
                case 1: goto L_0x026c;
                case 2: goto L_0x0269;
                default: goto L_0x022a;
            }
        L_0x022a:
            java.lang.String r1 = "APP_MANAGER_UNKNOWN_SIGN"
        L_0x022c:
            java.lang.String r0 = "app_manager_type"
            r2.put(r0, r1)
            java.lang.Integer r0 = r3.A02
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0263
            java.lang.String r1 = "SIDELOADED"
        L_0x023b:
            java.lang.String r0 = "app_manager_origin"
            r2.put(r0, r1)
            int r0 = r3.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "app_manager_version_code"
            r2.put(r0, r1)
            java.lang.Integer r0 = r3.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x025d;
                case 1: goto L_0x0260;
                default: goto L_0x0254;
            }
        L_0x0254:
            java.lang.String r1 = "UNKNOWN"
        L_0x0256:
            java.lang.String r0 = "app_manager_install_space"
            r2.put(r0, r1)
            goto L_0x0109
        L_0x025d:
            java.lang.String r1 = "STANDARD"
            goto L_0x0256
        L_0x0260:
            java.lang.String r1 = "PRIVATE_SPACE"
            goto L_0x0256
        L_0x0263:
            java.lang.String r1 = "PRELOADED"
            goto L_0x023b
        L_0x0266:
            java.lang.String r1 = "APP_MANAGER_OLD_SIGN"
            goto L_0x022c
        L_0x0269:
            java.lang.String r1 = "APP_MANAGER_UPDATE_ONLY_SIGN"
            goto L_0x022c
        L_0x026c:
            java.lang.String r1 = "APP_MANAGER_NEW_SIGN"
            goto L_0x022c
        L_0x026f:
            java.lang.String r0 = "DISABLED"
            goto L_0x021e
        L_0x0272:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0214
        L_0x0275:
            android.net.Uri r6 = X.C10114Rmq.A00     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            r11 = 1299861163(0x4d7a4eab, float:2.62466224E8)
            r8 = r7
            r9 = r7
            r10 = r7
            android.database.Cursor r7 = X.0fM.A01(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            if (r7 == 0) goto L_0x02c9
            boolean r0 = r7.moveToFirst()     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            if (r0 == 0) goto L_0x02c6
            r3 = 0
            r1 = 9
            r0 = 86
            java.lang.String r0 = X.Q2N.A01(r3, r1, r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            int r0 = r7.getColumnIndex(r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            if (r0 < 0) goto L_0x029e
            java.lang.String r0 = r7.getString(r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            r12.A03 = r0     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
        L_0x029e:
            int r0 = r7.getColumnIndex(r4)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            if (r0 < 0) goto L_0x02ad
            java.util.HashMap r1 = r12.A05     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            r1.put(r4, r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
        L_0x02ad:
            int r0 = r7.getColumnIndex(r2)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            if (r0 < 0) goto L_0x02c6
            java.util.HashMap r1 = r12.A05     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            r1.put(r2, r0)     // Catch:{ SecurityException -> 0x02c4, all -> 0x02bd }
            goto L_0x02c6
        L_0x02bd:
            r0 = move-exception
            if (r7 == 0) goto L_0x02c3
            r7.close()
        L_0x02c3:
            throw r0
        L_0x02c4:
            if (r7 == 0) goto L_0x02c9
        L_0x02c6:
            r7.close()
        L_0x02c9:
            android.content.Context r0 = r12.A00
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            if (r2 == 0) goto L_0x030c
            java.lang.String r1 = "com.meta.testing"
            r0 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x030c }
            android.content.pm.Signature[] r3 = r4.signatures
            if (r3 == 0) goto L_0x030c
            int r1 = r3.length
            r0 = 1
            if (r1 != r0) goto L_0x030c
            android.content.pm.Signature r1 = X.C9943Rjw.A00
            r2 = 0
            r0 = r3[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030c
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L_0x031b
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L_0x031b
            java.lang.String r0 = "com.meta.testing.group"
            int r0 = r1.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x030c
        L_0x0300:
            java.util.HashMap r2 = r12.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "preloads_stub_growth_exp_group"
            r2.put(r0, r1)
        L_0x030c:
            android.content.Context r2 = r12.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L_0x0333
            if (r1 == 0) goto L_0x0333
            goto L_0x0320
        L_0x031b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0300
        L_0x0320:
            java.lang.String r0 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0333 }
            android.content.pm.InstallSourceInfo r0 = r1.getInstallSourceInfo(r0)     // Catch:{ NameNotFoundException -> 0x0333 }
            java.lang.String r2 = r0.getUpdateOwnerPackageName()     // Catch:{ NameNotFoundException -> 0x0333 }
            java.util.HashMap r1 = r12.A05     // Catch:{ NameNotFoundException -> 0x0333 }
            java.lang.String r0 = "app_update_owner"
            r1.put(r0, r2)     // Catch:{ NameNotFoundException -> 0x0333 }
        L_0x0333:
            android.content.Context r2 = r12.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            if (r1 == 0) goto L_0x035d
            r0 = 30
            if (r3 >= r0) goto L_0x0348
            java.lang.String r0 = r2.getPackageName()     // Catch:{ all -> 0x035d }
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ all -> 0x035d }
            goto L_0x0354
        L_0x0348:
            java.lang.String r0 = r2.getPackageName()     // Catch:{ all -> 0x035d }
            android.content.pm.InstallSourceInfo r0 = r1.getInstallSourceInfo(r0)     // Catch:{ all -> 0x035d }
            java.lang.String r2 = r0.getInstallingPackageName()     // Catch:{ all -> 0x035d }
        L_0x0354:
            if (r2 == 0) goto L_0x035d
            java.util.HashMap r1 = r12.A05
            java.lang.String r0 = "last_installer"
            r1.put(r0, r2)
        L_0x035d:
            java.util.HashMap r4 = r12.A05     // Catch:{ all -> 0x038a }
            java.lang.String r2 = "google_play_availability"
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.A00     // Catch:{ all -> 0x038a }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x038a }
            int r0 = X.Pxe.A05(r0, r1)     // Catch:{ all -> 0x038a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x038a }
            r4.put(r2, r0)     // Catch:{ all -> 0x038a }
            java.lang.String r3 = "google_play_enabled"
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x038a }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ all -> 0x038a }
            r1 = 0
            if (r2 == 0) goto L_0x0383
            java.lang.String r0 = "com.android.vending"
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch:{ all -> 0x0383 }
            boolean r1 = r0.enabled     // Catch:{ all -> 0x0383 }
        L_0x0383:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x038a }
            r4.put(r3, r0)     // Catch:{ all -> 0x038a }
        L_0x038a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10966S2y.<init>(android.content.Context):void");
    }
}
