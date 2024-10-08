package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.454  reason: invalid class name */
public final class AnonymousClass454 {
    public static AnonymousClass454 A08;
    public List A00;
    public List A01;
    public boolean A02;
    public boolean A03 = false;
    public final Context A04;
    public final AnonymousClass0vF A05;
    public final AnonymousClass456 A06;
    public final HashMap A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|(2:13|(1:15))(1:12)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(X.AnonymousClass5JO r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto L_0x003e
            java.lang.String r0 = r4.trim()     // Catch:{ all -> 0x003b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x003e
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0016 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0016 }
            java.lang.String r4 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0016 }
        L_0x0016:
            java.util.HashMap r1 = r2.A07     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x003b }
            X.5JO r0 = (X.AnonymousClass5JO) r0     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0027
            goto L_0x003e
        L_0x0027:
            boolean r0 = r2.A03(r4)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003e
            r1.put(r4, r3)     // Catch:{ all -> 0x003b }
            X.0vF r1 = r2.A05     // Catch:{ all -> 0x003b }
            X.9lK r0 = new X.9lK     // Catch:{ all -> 0x003b }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x003b }
            r1.ATE(r0)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x003e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass454.A02(X.5JO, java.lang.String):void");
    }

    public final boolean A03(String str) {
        String A0R;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath == null) {
                A0R = "invalid file path in registry";
            } else {
                for (String startsWith : this.A00) {
                    if (canonicalPath.startsWith(startsWith)) {
                        for (String startsWith2 : this.A01) {
                            if (canonicalPath.startsWith(startsWith2)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                A0R = 002.A0R("filepath outside of app scoped directories. parent folder: ", new File(canonicalPath).getParent());
            }
            0wb.A03("FileRegistry#isWithinAppScopedDirectory", A0R);
            return false;
        } catch (IOException unused) {
        }
    }

    public static synchronized AnonymousClass454 A00(Context context) {
        AnonymousClass454 r0;
        synchronized (AnonymousClass454.class) {
            if (A08 == null) {
                C61620nx A002 = C61610nw.A00();
                A002.A01 = "PendingMediaStoreSerializer";
                AnonymousClass454 r2 = new AnonymousClass454(context, new AnonymousClass0vF(A002));
                A08 = r2;
                List asList = Arrays.asList(new File[]{AnonymousClass457.A03(), (File) AnonymousClass45D.A01.getValue(), AnonymousClass1F2.A00().CGg((1LJ) null, 1475200931), AnonymousClass45F.A01(), AnonymousClass457.A02(), AnonymousClass457.A05(), AnonymousClass457.A04(), AnonymousClass1F2.A00().CGg((1LJ) null, 761593505), new File(context.getFilesDir(), "pending_media_")});
                List asList2 = Arrays.asList(new File[]{context.getFilesDir(), context.getExternalFilesDir((String) null)});
                synchronized (r2) {
                    r2.A00 = A01(asList2);
                    r2.A01 = A01(asList);
                    if (!r2.A02) {
                        r2.A02 = true;
                        r2.A05.ATE(new AnonymousClass45H(r2));
                    }
                }
            }
            r0 = A08;
        }
        return r0;
    }

    public static List A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                try {
                    arrayList.add(file.getCanonicalPath());
                } catch (IOException unused) {
                    0wb.A03(AnonymousClass000.A00(1158), AnonymousClass000.A00(950));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1VH, java.lang.Object] */
    public AnonymousClass454(Context context, AnonymousClass0vF r7) {
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        this.A05 = r7;
        this.A07 = new HashMap();
        this.A01 = Collections.emptyList();
        this.A00 = Collections.emptyList();
        0qQ.A0B(applicationContext, 0);
        this.A06 = new AnonymousClass456(applicationContext, 1VU.A00(applicationContext, new 1VS(2), "fileregistry.db", false, false), new Object());
    }
}
