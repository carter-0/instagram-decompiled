package X;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class SRH {
    public static final AtomicInteger A05 = new AtomicInteger();
    public static final Object A06 = Pxe.A0p();
    public static final AtomicReference A07 = new AtomicReference();
    public static volatile C9019RLu A08;
    public final C10467Rsi A00;
    public final String A01;
    public final Object A02;
    public volatile int A03 = -1;
    public volatile Object A04;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Sxu, java.lang.Object, X.Te7] */
    public static void A00(Context context) {
        if (A08 == null) {
            synchronized (A06) {
                if (A08 == null) {
                    C9019RLu rLu = A08;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (rLu != null) {
                        if (((C8413Qu4) rLu).A00 != context) {
                            synchronized (C11251SHl.class) {
                                try {
                                    Map map = C11251SHl.A07;
                                    Iterator A0v = AnonymousClass7TF.A0v(map);
                                    while (A0v.hasNext()) {
                                        C11251SHl sHl = (C11251SHl) A0v.next();
                                        sHl.A00.unregisterContentObserver(sHl.A01);
                                    }
                                    map.clear();
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            synchronized (C9990Rkk.class) {
                                try {
                                    Map map2 = C9990Rkk.A00;
                                    Iterator A0v2 = AnonymousClass7TF.A0v(map2);
                                    if (!A0v2.hasNext()) {
                                        map2.clear();
                                    } else {
                                        A0v2.next();
                                        throw AnonymousClass7TE.A11("zzb");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            synchronized (C10466Rsh.class) {
                            }
                        }
                    }
                    C12568Sxt sxt = new C12568Sxt(context);
                    ? obj = new Object();
                    obj.A01 = sxt;
                    A08 = new C8413Qu4(context, obj);
                    A05.incrementAndGet();
                }
            }
        }
    }

    public static void A01(String str, Object obj, String str2) {
        Log.e("PhenotypeFlag", 002.A0u(str, str2, ": ", (String) obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.IllegalStateException} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(5:32|33|34|35|36)|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        android.os.StrictMode.setThreadPolicy(r3);
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00a7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:57:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02() {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = A05
            int r8 = r0.get()
            int r0 = r11.A03
            if (r0 >= r8) goto L_0x010f
            monitor-enter(r11)
            int r0 = r11.A03     // Catch:{ all -> 0x010c }
            if (r0 >= r8) goto L_0x010a
            X.RLu r3 = A08     // Catch:{ all -> 0x010c }
            X.QuA r9 = X.C8419QuA.A00     // Catch:{ all -> 0x010c }
            r7 = 0
            if (r3 == 0) goto L_0x002d
            r0 = r3
            X.Qu4 r0 = (X.C8413Qu4) r0     // Catch:{ all -> 0x010c }
            X.Te7 r0 = r0.A01     // Catch:{ all -> 0x010c }
            java.lang.Object r9 = r0.FP1()     // Catch:{ all -> 0x010c }
            X.T99 r9 = (X.T99) r9     // Catch:{ all -> 0x010c }
            boolean r1 = r9 instanceof X.C8418Qu9     // Catch:{ all -> 0x010c }
            if (r1 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x00fd
            goto L_0x002f
        L_0x002d:
            r6 = r7
            goto L_0x0059
        L_0x002f:
            r0 = r9
            X.Qu9 r0 = (X.C8418Qu9) r0     // Catch:{ all -> 0x010c }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x010c }
            X.RpU r1 = (X.C10270RpU) r1     // Catch:{ all -> 0x010c }
            X.Rsi r0 = r11.A00     // Catch:{ all -> 0x010c }
            android.net.Uri r0 = r0.A00     // Catch:{ all -> 0x010c }
            java.lang.String r2 = r11.A01     // Catch:{ all -> 0x010c }
            r6 = 0
            if (r0 == 0) goto L_0x0059
            X.01r r1 = r1.A00     // Catch:{ all -> 0x010c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x010c }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x010c }
            X.01r r1 = (X.01r) r1     // Catch:{ all -> 0x010c }
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = ""
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x010c }
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x010c }
        L_0x0059:
            java.lang.String r0 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            if (r3 == 0) goto L_0x00f8
            X.Rsi r0 = r11.A00     // Catch:{ all -> 0x010c }
            android.net.Uri r5 = r0.A00     // Catch:{ all -> 0x010c }
            if (r5 == 0) goto L_0x0103
            X.Qu4 r3 = (X.C8413Qu4) r3     // Catch:{ all -> 0x010c }
            android.content.Context r1 = r3.A00     // Catch:{ all -> 0x010c }
            boolean r0 = X.C11151SCg.A00(r1, r5)     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x008e
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch:{ all -> 0x010c }
            X.TKw r3 = X.C13089TKw.A00     // Catch:{ all -> 0x010c }
            java.lang.Class<X.SHl> r2 = X.C11251SHl.class
            monitor-enter(r2)     // Catch:{ all -> 0x010c }
            java.util.Map r1 = X.C11251SHl.A07     // Catch:{ all -> 0x008b }
            java.lang.Object r10 = r1.get(r5)     // Catch:{ all -> 0x008b }
            X.SHl r10 = (X.C11251SHl) r10     // Catch:{ all -> 0x008b }
            if (r10 != 0) goto L_0x0089
            X.SHl r0 = new X.SHl     // Catch:{ SecurityException -> 0x0089 }
            r0.<init>(r4, r5, r3)     // Catch:{ SecurityException -> 0x0089 }
            r1.put(r5, r0)     // Catch:{ SecurityException -> 0x0088 }
        L_0x0088:
            r10 = r0
        L_0x0089:
            monitor-exit(r2)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008b }
            goto L_0x0103
        L_0x008e:
            r10 = r7
        L_0x008f:
            if (r10 == 0) goto L_0x00e3
            java.lang.String r5 = r11.A01     // Catch:{ all -> 0x010c }
            java.util.Map r0 = r10.A06     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r4 = r10.A02     // Catch:{ all -> 0x010c }
            monitor-enter(r4)     // Catch:{ all -> 0x010c }
            java.util.Map r0 = r10.A06     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x00ce
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x00d0 }
            java.util.Map r0 = r10.A00()     // Catch:{ SecurityException -> 0x00a7 }
            goto L_0x00c9
        L_0x00a7:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8 }
            java.util.Map r0 = r10.A00()     // Catch:{ all -> 0x00b3 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8 }
            goto L_0x00c9
        L_0x00b3:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8 }
            throw r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8, SQLiteException | IllegalStateException | SecurityException -> 0x00b8 }
        L_0x00b8:
            java.lang.String r1 = "ConfigurationContentLdr"
            java.lang.String r0 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00c4 }
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d0 }
            r0 = 0
            goto L_0x00cc
        L_0x00c4:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00c9:
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d0 }
        L_0x00cc:
            r10.A06 = r0     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00d0:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            goto L_0x0103
        L_0x00d3:
            if (r0 != 0) goto L_0x00d9
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x010c }
        L_0x00d9:
            java.lang.String r0 = X.DbT.A11(r5, r0)     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r7 = r11.A03(r0)     // Catch:{ all -> 0x010c }
        L_0x00e3:
            if (r7 != 0) goto L_0x00e7
            java.lang.Object r7 = r11.A02     // Catch:{ all -> 0x010c }
        L_0x00e7:
            boolean r0 = r9 instanceof X.C8418Qu9     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x00ed
            r0 = 1
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            if (r0 == 0) goto L_0x0106
            if (r6 != 0) goto L_0x00f3
            goto L_0x0104
        L_0x00f3:
            java.lang.Object r7 = r11.A03(r6)     // Catch:{ all -> 0x010c }
            goto L_0x0106
        L_0x00f8:
            java.lang.IllegalStateException r7 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x010c }
            goto L_0x0103
        L_0x00fd:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r7 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x010c }
        L_0x0103:
            throw r7     // Catch:{ all -> 0x010c }
        L_0x0104:
            java.lang.Object r7 = r11.A02     // Catch:{ all -> 0x010c }
        L_0x0106:
            r11.A04 = r7     // Catch:{ all -> 0x010c }
            r11.A03 = r8     // Catch:{ all -> 0x010c }
        L_0x010a:
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            goto L_0x010f
        L_0x010c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            throw r0
        L_0x010f:
            java.lang.Object r0 = r11.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRH.A02():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C8417Qu8
            if (r0 == 0) goto L_0x001a
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            X.QuE r0 = X.C8423QuE.A00(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "Invalid byte[] value for "
            A01(r0, r3, r1)
            r0 = 0
            return r0
        L_0x001a:
            boolean r0 = r2 instanceof X.C8416Qu7
            if (r0 == 0) goto L_0x0033
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x002a }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x002a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x002a }
            return r0
        L_0x002a:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "Invalid double value for "
            A01(r0, r3, r1)
            r0 = 0
            return r0
        L_0x0033:
            boolean r0 = r2 instanceof X.C8415Qu6
            if (r0 == 0) goto L_0x0058
            java.util.regex.Pattern r0 = X.C10124Rn0.A02
            boolean r0 = X.DbV.A1b(r3, r0)
            if (r0 == 0) goto L_0x0045
            r0 = 1
        L_0x0040:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0045:
            java.util.regex.Pattern r0 = X.C10124Rn0.A03
            boolean r0 = X.DbV.A1b(r3, r0)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            goto L_0x0040
        L_0x004f:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "Invalid boolean value for "
            A01(r0, r3, r1)
            r0 = 0
            return r0
        L_0x0058:
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0060 }
            java.lang.Long r0 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x0060 }
            return r0
        L_0x0060:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "Invalid long value for "
            A01(r0, r3, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRH.A03(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ SRH(C10467Rsi rsi, Object obj, String str) {
        if (rsi.A00 != null) {
            this.A00 = rsi;
            this.A01 = str;
            this.A02 = obj;
            return;
        }
        throw AnonymousClass7TE.A0w("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
