package X;

import java.io.File;

public final class WF7 implements C13696TfE {
    public C19867Wgu A00;
    public final C17789Vg1 A01 = new C17789Vg1();
    public final S11 A02;
    public final File A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:74|75|(1:77)(1:78)|(2:79|80)|81|82|(1:83)|123) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        r0 = X.Pxg.A0Z("unexpected journal line: ", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r2 = r6.A0A;
        r6.A00 = r1 - r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        if (r3.A00 == -1) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0150, code lost:
        X.C19867Wgu.A03(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0154, code lost:
        r6.A02 = X.C13989Tnp.A0f(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        X.C19867Wgu.A05(r6.A09);
        r8 = X.AnonymousClass7TF.A0t(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016a, code lost:
        if (r8.hasNext() != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016c, code lost:
        r7 = (X.C17608Vb0) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0175, code lost:
        if (r7.A00 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0177, code lost:
        r6.A01 += r7.A05[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0181, code lost:
        r7.A00 = null;
        X.C19867Wgu.A05(r7.A02[0]);
        X.C19867Wgu.A05(r7.A03[0]);
        r8.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0142 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x015d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01b1 */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016c A[Catch:{ RuntimeException -> 0x01b2, Exception -> 0x01b1, all -> 0x01ad, IOException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b2 A[ExcHandler: RuntimeException (r0v11 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:79:0x015a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x01b1=Splitter:B:96:0x01b1, B:81:0x015d=Splitter:B:81:0x015d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized X.C19867Wgu A00() {
        /*
            r20 = this;
            r4 = r20
            monitor-enter(r4)
            X.Wgu r6 = r4.A00     // Catch:{ all -> 0x01f0 }
            if (r6 != 0) goto L_0x01ee
            java.io.File r5 = r4.A03     // Catch:{ all -> 0x01f0 }
            r16 = 1
            java.lang.String r0 = "journal.bkp"
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01f0 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x01f0 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "journal"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01f0 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x01f0 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x0036
            r2.delete()     // Catch:{ all -> 0x01f0 }
        L_0x0028:
            X.Wgu r6 = new X.Wgu     // Catch:{ all -> 0x01f0 }
            r6.<init>(r5)     // Catch:{ all -> 0x01f0 }
            java.io.File r8 = r6.A08     // Catch:{ all -> 0x01f0 }
            boolean r0 = r8.exists()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01e1
            goto L_0x0042
        L_0x0036:
            boolean r0 = r2.renameTo(r1)     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x0028
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01f0 }
            r0.<init>()     // Catch:{ all -> 0x01f0 }
            throw r0     // Catch:{ all -> 0x01f0 }
        L_0x0042:
            java.lang.String r13 = ", "
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01b4 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x01b4 }
            java.nio.charset.Charset r7 = X.C18397Vqx.A00     // Catch:{ IOException -> 0x01b4 }
            X.Wgq r3 = new X.Wgq     // Catch:{ IOException -> 0x01b4 }
            r3.<init>(r0, r7)     // Catch:{ IOException -> 0x01b4 }
            java.lang.String r10 = r3.A00()     // Catch:{ all -> 0x01ad }
            java.lang.String r9 = r3.A00()     // Catch:{ all -> 0x01ad }
            java.lang.String r12 = r3.A00()     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = r3.A00()     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = r3.A00()     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0196
            java.lang.String r11 = java.lang.Integer.toString(r16)     // Catch:{ all -> 0x01ad }
            boolean r0 = r11.equals(r12)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0196
            boolean r0 = r11.equals(r2)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0196
            r1 = 0
        L_0x008d:
            java.lang.String r9 = r3.A00()     // Catch:{ EOFException -> 0x0142 }
            r10 = 32
            int r13 = r9.indexOf(r10)     // Catch:{ EOFException -> 0x0142 }
            java.lang.String r2 = "unexpected journal line: "
            r14 = -1
            if (r13 == r14) goto L_0x0134
            int r0 = r13 + 1
            int r12 = r9.indexOf(r10, r0)     // Catch:{ EOFException -> 0x0142 }
            if (r12 != r14) goto L_0x00b9
            java.lang.String r15 = r9.substring(r0)     // Catch:{ EOFException -> 0x0142 }
            r0 = 6
            if (r13 != r0) goto L_0x00bd
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0142 }
            if (r0 == 0) goto L_0x00bd
            java.util.LinkedHashMap r0 = r6.A0A     // Catch:{ EOFException -> 0x0142 }
            r0.remove(r15)     // Catch:{ EOFException -> 0x0142 }
            goto L_0x0122
        L_0x00b9:
            java.lang.String r15 = r9.substring(r0, r12)     // Catch:{ EOFException -> 0x0142 }
        L_0x00bd:
            java.util.LinkedHashMap r0 = r6.A0A     // Catch:{ EOFException -> 0x0142 }
            java.lang.Object r11 = r0.get(r15)     // Catch:{ EOFException -> 0x0142 }
            X.Vb0 r11 = (X.C17608Vb0) r11     // Catch:{ EOFException -> 0x0142 }
            r10 = 0
            if (r11 != 0) goto L_0x00d0
            X.Vb0 r11 = new X.Vb0     // Catch:{ EOFException -> 0x0142 }
            r11.<init>(r6, r15)     // Catch:{ EOFException -> 0x0142 }
            r0.put(r15, r11)     // Catch:{ EOFException -> 0x0142 }
        L_0x00d0:
            r0 = 5
            if (r12 == r14) goto L_0x0105
            if (r13 != r0) goto L_0x012f
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0142 }
            if (r0 == 0) goto L_0x012f
            int r0 = r12 + 1
            java.lang.String r9 = r9.substring(r0)     // Catch:{ EOFException -> 0x0142 }
            java.lang.String r0 = " "
            java.lang.String[] r14 = r9.split(r0)     // Catch:{ EOFException -> 0x0142 }
            r0 = r16
            r11.A01 = r0     // Catch:{ EOFException -> 0x0142 }
            r11.A00 = r10     // Catch:{ EOFException -> 0x0142 }
            int r15 = r14.length     // Catch:{ EOFException -> 0x0142 }
            X.Wgu r0 = r11.A06     // Catch:{ EOFException -> 0x0142 }
            int r0 = r0.A06     // Catch:{ EOFException -> 0x0142 }
            if (r15 != r0) goto L_0x0139
            r13 = 0
        L_0x00f7:
            if (r13 >= r15) goto L_0x0122
            long[] r12 = r11.A05     // Catch:{ NumberFormatException -> 0x0126 }
            r0 = r14[r13]     // Catch:{ NumberFormatException -> 0x0126 }
            long r9 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0126 }
            r12[r13] = r9     // Catch:{ NumberFormatException -> 0x0126 }
            r13 = 1
            goto L_0x00f7
        L_0x0105:
            if (r13 != r0) goto L_0x0117
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0142 }
            if (r0 == 0) goto L_0x012f
            X.Vgy r0 = new X.Vgy     // Catch:{ EOFException -> 0x0142 }
            r0.<init>(r11, r6)     // Catch:{ EOFException -> 0x0142 }
            r11.A00 = r0     // Catch:{ EOFException -> 0x0142 }
            goto L_0x0122
        L_0x0117:
            r0 = 4
            if (r13 != r0) goto L_0x012f
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0142 }
            if (r0 == 0) goto L_0x012f
        L_0x0122:
            int r1 = r1 + 1
            goto L_0x008d
        L_0x0126:
            java.lang.String r0 = java.util.Arrays.toString(r14)     // Catch:{ EOFException -> 0x0142 }
            java.io.IOException r0 = X.Pxg.A0Z(r2, r0)     // Catch:{ EOFException -> 0x0142 }
            goto L_0x0141
        L_0x012f:
            java.io.IOException r0 = X.Pxg.A0Z(r2, r9)     // Catch:{ EOFException -> 0x0142 }
            goto L_0x0141
        L_0x0134:
            java.io.IOException r0 = X.Pxg.A0Z(r2, r9)     // Catch:{ EOFException -> 0x0142 }
            goto L_0x0141
        L_0x0139:
            java.lang.String r0 = java.util.Arrays.toString(r14)     // Catch:{ EOFException -> 0x0142 }
            java.io.IOException r0 = X.Pxg.A0Z(r2, r0)     // Catch:{ EOFException -> 0x0142 }
        L_0x0141:
            throw r0     // Catch:{ EOFException -> 0x0142 }
        L_0x0142:
            java.util.LinkedHashMap r2 = r6.A0A     // Catch:{ all -> 0x01ad }
            int r0 = r2.size()     // Catch:{ all -> 0x01ad }
            int r1 = r1 - r0
            r6.A00 = r1     // Catch:{ all -> 0x01ad }
            int r1 = r3.A00     // Catch:{ all -> 0x01ad }
            r0 = -1
            if (r1 != r0) goto L_0x0154
            X.C19867Wgu.A03(r6)     // Catch:{ all -> 0x01ad }
            goto L_0x015a
        L_0x0154:
            java.io.BufferedWriter r0 = X.C13989Tnp.A0f(r8, r7)     // Catch:{ all -> 0x01ad }
            r6.A02 = r0     // Catch:{ all -> 0x01ad }
        L_0x015a:
            r3.close()     // Catch:{ RuntimeException -> 0x01b2, Exception -> 0x015d }
        L_0x015d:
            java.io.File r0 = r6.A09     // Catch:{ IOException -> 0x01b4 }
            X.C19867Wgu.A05(r0)     // Catch:{ IOException -> 0x01b4 }
            java.util.Iterator r8 = X.AnonymousClass7TF.A0t(r2)     // Catch:{ IOException -> 0x01b4 }
        L_0x0166:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x01b4 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r7 = r8.next()     // Catch:{ IOException -> 0x01b4 }
            X.Vb0 r7 = (X.C17608Vb0) r7     // Catch:{ IOException -> 0x01b4 }
            X.Vgy r0 = r7.A00     // Catch:{ IOException -> 0x01b4 }
            r1 = 0
            if (r0 != 0) goto L_0x0181
            long r2 = r6.A01     // Catch:{ IOException -> 0x01b4 }
            long[] r0 = r7.A05     // Catch:{ IOException -> 0x01b4 }
            r0 = r0[r1]     // Catch:{ IOException -> 0x01b4 }
            long r2 = r2 + r0
            r6.A01 = r2     // Catch:{ IOException -> 0x01b4 }
            goto L_0x0166
        L_0x0181:
            r0 = 0
            r7.A00 = r0     // Catch:{ IOException -> 0x01b4 }
            java.io.File[] r0 = r7.A02     // Catch:{ IOException -> 0x01b4 }
            r0 = r0[r1]     // Catch:{ IOException -> 0x01b4 }
            X.C19867Wgu.A05(r0)     // Catch:{ IOException -> 0x01b4 }
            java.io.File[] r0 = r7.A03     // Catch:{ IOException -> 0x01b4 }
            r0 = r0[r1]     // Catch:{ IOException -> 0x01b4 }
            X.C19867Wgu.A05(r0)     // Catch:{ IOException -> 0x01b4 }
            r8.remove()     // Catch:{ IOException -> 0x01b4 }
            goto L_0x0166
        L_0x0196:
            java.lang.String r11 = "unexpected journal header: ["
            java.lang.String r19 = "]"
            r12 = r10
            r14 = r9
            r15 = r13
            r16 = r2
            r17 = r13
            r18 = r1
            java.lang.String r1 = X.002.A18(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01ad }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ad }
            r0.<init>(r1)     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r0 = move-exception
            r3.close()     // Catch:{ RuntimeException -> 0x01b2, Exception -> 0x01b1 }
        L_0x01b1:
            throw r0     // Catch:{ IOException -> 0x01b4 }
        L_0x01b2:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x01b4 }
        L_0x01b4:
            r3 = move-exception
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ all -> 0x01f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f0 }
            r1.<init>()     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = "DiskLruCache "
            r1.append(r0)     // Catch:{ all -> 0x01f0 }
            r1.append(r5)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = " is corrupt: "
            r1.append(r0)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x01f0 }
            r1.append(r0)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x01f0 }
            r2.println(r0)     // Catch:{ all -> 0x01f0 }
            r6.close()     // Catch:{ all -> 0x01f0 }
            java.io.File r0 = r6.A07     // Catch:{ all -> 0x01f0 }
            X.C18397Vqx.A00(r0)     // Catch:{ all -> 0x01f0 }
        L_0x01e1:
            r5.mkdirs()     // Catch:{ all -> 0x01f0 }
            X.Wgu r6 = new X.Wgu     // Catch:{ all -> 0x01f0 }
            r6.<init>(r5)     // Catch:{ all -> 0x01f0 }
            X.C19867Wgu.A03(r6)     // Catch:{ all -> 0x01f0 }
        L_0x01ec:
            r4.A00 = r6     // Catch:{ all -> 0x01f0 }
        L_0x01ee:
            monitor-exit(r4)
            return r6
        L_0x01f0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF7.A00():X.Wgu");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File AXD(X.C13892TjF r8) {
        /*
            r7 = this;
            X.S11 r0 = r7.A02
            java.lang.String r6 = r0.A00(r8)
            java.lang.String r3 = "DiskLruCacheWrapper"
            r0 = 2
            android.util.Log.isLoggable(r3, r0)
            r2 = 0
            X.Wgu r5 = r7.A00()     // Catch:{ IOException -> 0x0057 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0057 }
            X.C19867Wgu.A01(r5)     // Catch:{ all -> 0x0054 }
            java.util.LinkedHashMap r0 = r5.A0A     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0054 }
            X.Vb0 r1 = (X.C17608Vb0) r1     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1.A01     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0052
            java.io.File[] r4 = r1.A02     // Catch:{ all -> 0x0054 }
            int r1 = r4.length     // Catch:{ all -> 0x0054 }
            r0 = 0
        L_0x0027:
            if (r0 >= r1) goto L_0x0033
            r0 = r4[r0]     // Catch:{ all -> 0x0054 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0027
        L_0x0033:
            int r0 = r5.A00     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0054 }
            java.io.Writer r1 = r5.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "READ"
            X.C19867Wgu.A04(r5, r1, r0, r6)     // Catch:{ all -> 0x0054 }
            boolean r0 = X.C19867Wgu.A08(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.ThreadPoolExecutor r1 = r5.A0C     // Catch:{ all -> 0x0054 }
            java.util.concurrent.Callable r0 = r5.A0B     // Catch:{ all -> 0x0054 }
            r1.submit(r0)     // Catch:{ all -> 0x0054 }
        L_0x004d:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0057 }
            r0 = 0
            r2 = r4[r0]     // Catch:{ IOException -> 0x0057 }
            return r2
        L_0x0052:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0057 }
            return r2
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0057 }
            throw r0     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "Unable to get from disk cache"
            android.util.Log.w(r3, r0, r1)
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF7.AXD(X.TjF):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r1.A00 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00b0=Splitter:B:52:0x00b0, B:71:0x00e2=Splitter:B:71:0x00e2, B:40:0x007f=Splitter:B:40:0x007f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E5J(X.C13892TjF r10, X.VUR r11) {
        /*
            r9 = this;
            java.lang.String r4 = "DiskLruCacheWrapper"
            X.S11 r0 = r9.A02
            java.lang.String r3 = r0.A00(r10)
            X.Vg1 r2 = r9.A01
            monitor-enter(r2)
            java.util.Map r6 = r2.A01     // Catch:{ all -> 0x011f }
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x011f }
            X.VQV r1 = (X.VQV) r1     // Catch:{ all -> 0x011f }
            if (r1 != 0) goto L_0x002f
            X.VL6 r0 = r2.A00     // Catch:{ all -> 0x011f }
            java.util.Queue r5 = r0.A00     // Catch:{ all -> 0x011f }
            monitor-enter(r5)     // Catch:{ all -> 0x011f }
            java.lang.Object r1 = r5.poll()     // Catch:{ all -> 0x0024 }
            X.VQV r1 = (X.VQV) r1     // Catch:{ all -> 0x0024 }
            monitor-exit(r5)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x002c
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x011f }
        L_0x0027:
            X.VQV r1 = new X.VQV     // Catch:{ all -> 0x011f }
            r1.<init>()     // Catch:{ all -> 0x011f }
        L_0x002c:
            r6.put(r3, r1)     // Catch:{ all -> 0x011f }
        L_0x002f:
            int r0 = r1.A00     // Catch:{ all -> 0x011f }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x011f }
            monitor-exit(r2)     // Catch:{ all -> 0x011f }
            java.util.concurrent.locks.Lock r0 = r1.A01
            r0.lock()
            r0 = 2
            android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x011a }
            X.Wgu r5 = r9.A00()     // Catch:{ IOException -> 0x0109 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0109 }
            X.C19867Wgu.A01(r5)     // Catch:{ all -> 0x00ff }
            java.util.LinkedHashMap r7 = r5.A0A     // Catch:{ all -> 0x00ff }
            java.lang.Object r1 = r7.get(r3)     // Catch:{ all -> 0x00ff }
            X.Vb0 r1 = (X.C17608Vb0) r1     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.A01     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x0082
            java.io.File[] r6 = r1.A02     // Catch:{ all -> 0x00ff }
            int r1 = r6.length     // Catch:{ all -> 0x00ff }
            r0 = 0
        L_0x0059:
            if (r0 >= r1) goto L_0x0065
            r0 = r6[r0]     // Catch:{ all -> 0x00ff }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x0082
            r0 = 1
            goto L_0x0059
        L_0x0065:
            int r0 = r5.A00     // Catch:{ all -> 0x00ff }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x00ff }
            java.io.Writer r1 = r5.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "READ"
            X.C19867Wgu.A04(r5, r1, r0, r3)     // Catch:{ all -> 0x00ff }
            boolean r0 = X.C19867Wgu.A08(r5)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x007f
            java.util.concurrent.ThreadPoolExecutor r1 = r5.A0C     // Catch:{ all -> 0x00ff }
            java.util.concurrent.Callable r0 = r5.A0B     // Catch:{ all -> 0x00ff }
            r1.submit(r0)     // Catch:{ all -> 0x00ff }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0109 }
            goto L_0x0116
        L_0x0082:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0109 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0109 }
            X.C19867Wgu.A01(r5)     // Catch:{ all -> 0x00fc }
            java.lang.Object r1 = r7.get(r3)     // Catch:{ all -> 0x00fc }
            X.Vb0 r1 = (X.C17608Vb0) r1     // Catch:{ all -> 0x00fc }
            r6 = 0
            if (r1 != 0) goto L_0x00ac
            X.Vb0 r1 = new X.Vb0     // Catch:{ all -> 0x00fc }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x00fc }
            r7.put(r3, r1)     // Catch:{ all -> 0x00fc }
        L_0x0098:
            X.Vgy r6 = new X.Vgy     // Catch:{ all -> 0x00fc }
            r6.<init>(r1, r5)     // Catch:{ all -> 0x00fc }
            r1.A00 = r6     // Catch:{ all -> 0x00fc }
            java.io.Writer r1 = r5.A02     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "DIRTY"
            X.C19867Wgu.A04(r5, r1, r0, r3)     // Catch:{ all -> 0x00fc }
            java.io.Writer r0 = r5.A02     // Catch:{ all -> 0x00fc }
            X.C19867Wgu.A06(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x00b0
        L_0x00ac:
            X.Vgy r0 = r1.A00     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0098
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0109 }
            if (r6 == 0) goto L_0x0102
            r7 = 0
            X.Wgu r8 = r6.A03     // Catch:{ all -> 0x00f3 }
            monitor-enter(r8)     // Catch:{ all -> 0x00f3 }
            X.Vb0 r5 = r6.A01     // Catch:{ all -> 0x00f0 }
            X.Vgy r0 = r5.A00     // Catch:{ all -> 0x00f0 }
            if (r0 != r6) goto L_0x00ea
            boolean r0 = r5.A01     // Catch:{ all -> 0x00f0 }
            if (r0 != 0) goto L_0x00c6
            boolean[] r1 = r6.A02     // Catch:{ all -> 0x00f0 }
            r0 = 1
            r1[r7] = r0     // Catch:{ all -> 0x00f0 }
        L_0x00c6:
            java.io.File[] r0 = r5.A03     // Catch:{ all -> 0x00f0 }
            r7 = r0[r7]     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r8.A07     // Catch:{ all -> 0x00f0 }
            r0.mkdirs()     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)     // Catch:{ all -> 0x00f0 }
            X.Tc1 r5 = r11.A00     // Catch:{ all -> 0x00f3 }
            java.lang.Object r1 = r11.A02     // Catch:{ all -> 0x00f3 }
            X.Shi r0 = r11.A01     // Catch:{ all -> 0x00f3 }
            boolean r0 = r5.ARr(r0, r7, r1)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00e2
            r0 = 1
            X.C19867Wgu.A00(r6, r8, r0)     // Catch:{ all -> 0x00f3 }
            r6.A00 = r0     // Catch:{ all -> 0x00f3 }
        L_0x00e2:
            boolean r0 = r6.A00     // Catch:{ IOException -> 0x0109 }
            if (r0 != 0) goto L_0x0116
            r6.A00()     // Catch:{ IOException -> 0x0116 }
            goto L_0x0116
        L_0x00ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f0 }
            r0.<init>()     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            boolean r0 = r6.A00     // Catch:{ IOException -> 0x0109 }
            if (r0 != 0) goto L_0x0108
            r6.A00()     // Catch:{ IOException -> 0x0108 }
            goto L_0x0108
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0109 }
            throw r0     // Catch:{ IOException -> 0x0109 }
        L_0x00ff:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0109 }
            goto L_0x0108
        L_0x0102:
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.IllegalStateException r1 = X.DbW.A0c(r0, r3)     // Catch:{ IOException -> 0x0109 }
        L_0x0108:
            throw r1     // Catch:{ IOException -> 0x0109 }
        L_0x0109:
            r1 = move-exception
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x011a }
        L_0x0116:
            r2.A00(r3)
            return
        L_0x011a:
            r0 = move-exception
            r2.A00(r3)
            throw r0
        L_0x011f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF7.E5J(X.TjF, X.VUR):void");
    }

    @Deprecated
    public WF7(File file) {
        this.A03 = file;
        this.A02 = new S11();
    }
}
