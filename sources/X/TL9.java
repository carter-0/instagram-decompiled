package X;

import java.util.concurrent.ExecutorService;

public final class TL9 implements Runnable {
    public final /* synthetic */ C12304Sr7 A00;
    public final /* synthetic */ C10427Rs3 A01;
    public final /* synthetic */ C7335Q4l A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.RQJ] */
    public static void A01(C7254Q1b q1b, C7335Q4l q4l) {
        C7948Qdp qdp = new C7948Qdp(q1b, q4l.A09);
        new Object().A00 = qdp;
        qdp.A00();
        C7948Qdp qdp2 = new C7948Qdp(q1b, q4l.A04);
        new Object().A00 = qdp2;
        qdp2.A00();
        ExecutorService executorService = q4l.A0B;
        if (executorService != null) {
            executorService.shutdown();
            q4l.A0B = null;
        }
    }

    public TL9(C12304Sr7 sr7, C10427Rs3 rs3, C7335Q4l q4l) {
        this.A01 = rs3;
        this.A02 = q4l;
        this.A00 = sr7;
    }

    public static C12304Sr7 A00(C10427Rs3 rs3, C7335Q4l q4l) {
        C12304Sr7 sr7 = new C12304Sr7(q4l);
        rs3.A01.execute(new TL9(sr7, rs3, q4l));
        return sr7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Q1b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.Q1b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.Q1b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.Q1b} */
    /* JADX WARNING: type inference failed for: r24v1, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.Tia] */
    /* JADX WARNING: type inference failed for: r12v6, types: [X.SsO] */
    /* JADX WARNING: type inference failed for: r25v4, types: [X.Thy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v85, types: [X.Tgv] */
    /* JADX WARNING: type inference failed for: r2v250, types: [X.Q4k] */
    /* JADX WARNING: type inference failed for: r8v9, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r33v11, types: [X.Q4k] */
    /* JADX WARNING: type inference failed for: r3v94, types: [X.Q4k] */
    /* JADX WARNING: type inference failed for: r3v102, types: [X.Tgv] */
    /* JADX WARNING: type inference failed for: r2v319, types: [X.Q4k] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:512|513|514|515|516) */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a7, code lost:
        if (r5.A08.length() <= 0) goto L_0x0d6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x063e, code lost:
        if (r0.A0N.AFy() == false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r1.A07(r3).isEmpty() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0968, code lost:
        if (r3.isEmpty() != false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0986, code lost:
        if (X.AnonymousClass7TE.A1b(r12.A02) == false) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13 = r1.A07(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r13 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r2 = r1.A07(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r2 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        r11 = X.AnonymousClass7TF.A0t(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0100, code lost:
        if (r11.hasNext() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        r8 = X.Pxg.A16(((X.C266794aM) r11.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        if (r8.hasNext() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0126, code lost:
        if (((X.C266754aI) r8.next()).A03.A03(java.util.concurrent.TimeUnit.MICROSECONDS) <= 0) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        r3 = null;
        r8 = X.AnonymousClass7TF.A0t(r13);
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0141, code lost:
        if (r8.hasNext() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0143, code lost:
        r6 = X.Pxg.A16(((X.C266794aM) r8.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0153, code lost:
        if (r6.hasNext() == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2 = ((X.C266754aI) r6.next()).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015d, code lost:
        if (r2 == null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015f, code lost:
        r2 = r2.getCanonicalPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0163, code lost:
        if (r7 == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0165, code lost:
        r3 = X.C7324Q4a.A01(r12, r10, r2);
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016b, code lost:
        r2 = X.C7324Q4a.A01(r12, r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r3 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0175, code lost:
        if (r3.CSl(r2) != false) goto L_0x014f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:515:0x0c4c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:526:0x0c8c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05b9 A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05c4 A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05d7 A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a9e A[Catch:{ all -> 0x0bc9, all -> 0x0cae }] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0aaf A[Catch:{ all -> 0x0bc9, all -> 0x0cae }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ac7 A[Catch:{ all -> 0x0bc9, all -> 0x0cae }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0af4 A[Catch:{ all -> 0x0bc9, all -> 0x0cae }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0bba A[Catch:{ all -> 0x0bc9, all -> 0x0cae }] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0ca5 A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x0d27 A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0d2f A[Catch:{ all -> 0x0290, all -> 0x0d87 }] */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x0ac0 A[EDGE_INSN: B:657:0x0ac0->B:449:0x0ac0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x0be0 A[EDGE_INSN: B:671:0x0be0->B:504:0x0be0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r57 = this;
            r56 = r57
            r0 = r56
            X.Q4l r0 = r0.A02     // Catch:{ Exception -> 0x0df3 }
            java.lang.String r1 = "FbVideoResizeOperation.run()"
            X.C349257zq.A03(r1)     // Catch:{ Exception -> 0x0df3 }
            X.SJL r5 = new X.SJL     // Catch:{ Exception -> 0x0df3 }
            r5.<init>()     // Catch:{ Exception -> 0x0df3 }
            X.Sqz r3 = new X.Sqz     // Catch:{ Exception -> 0x0df3 }
            r3.<init>()     // Catch:{ Exception -> 0x0df3 }
            r5.A0F = r3     // Catch:{ Exception -> 0x0df3 }
            X.RzN r4 = r0.A0Q     // Catch:{ Exception -> 0x0df3 }
            X.SOn r1 = r4.A06     // Catch:{ Exception -> 0x0df3 }
            r22 = r1
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r1.A0J     // Catch:{ Exception -> 0x0df3 }
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0df3 }
            if (r1 != 0) goto L_0x0041
            r1 = r22
            java.util.List r1 = r1.A0J     // Catch:{ Exception -> 0x0df3 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x0df3 }
        L_0x0031:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0df3 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0df3 }
            X.8gx r1 = (X.C361868gx) r1     // Catch:{ Exception -> 0x0df3 }
            r1.EOi(r3)     // Catch:{ Exception -> 0x0df3 }
            goto L_0x0031
        L_0x0041:
            r0.A03 = r5     // Catch:{ Exception -> 0x0df3 }
            X.Q1b r21 = new X.Q1b     // Catch:{ Exception -> 0x0df3 }
            r21.<init>()     // Catch:{ Exception -> 0x0df3 }
            r20 = 0
            boolean r1 = r0.A0D     // Catch:{ all -> 0x0d87 }
            r55 = r1
            X.C7335Q4l.A00(r0, r1)     // Catch:{ all -> 0x0d87 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0d87 }
            java.lang.Thread r2 = r1.getThread()     // Catch:{ all -> 0x0d87 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0d87 }
            r14 = 0
            boolean r2 = X.C51969G9p.A1a(r2, r1)
            r1 = r20
            X.C266784aL.A06(r2, r1)     // Catch:{ all -> 0x0d87 }
            java.lang.System.gc()     // Catch:{ all -> 0x0d87 }
            X.SJL r3 = r0.A03     // Catch:{ all -> 0x0d87 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r4.A08     // Catch:{ all -> 0x0d87 }
            boolean r2 = X.AnonymousClass7TF.A1V(r1)
            r3.A0V = r2     // Catch:{ all -> 0x0d87 }
            boolean r2 = r4.A0H     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x008c
            if (r1 == 0) goto L_0x009b
            X.4aE r3 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            java.util.HashMap r2 = r1.A07(r3)     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x008c
            java.util.HashMap r2 = r1.A07(r3)     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x009b
        L_0x008c:
            long r2 = r4.A03     // Catch:{ all -> 0x0d87 }
            r18 = r2
            X.Tig r2 = r0.A04     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0611
            r2 = r55
            X.C7335Q4l.A00(r0, r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x05e1
        L_0x009b:
            X.STP r5 = r0.A0H     // Catch:{ all -> 0x0d87 }
            r9 = 0
            if (r5 != 0) goto L_0x0128
            if (r1 == 0) goto L_0x0178
            X.4aE r12 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            boolean r2 = X.Q1Z.A04(r12, r1)     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x0128
            boolean r2 = r1.A0B(r12)     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x0128
            X.Tfv r11 = r0.A0J     // Catch:{ all -> 0x0d87 }
            X.Tgv r10 = r0.A0N     // Catch:{ all -> 0x0d87 }
            if (r10 == 0) goto L_0x0128
            java.util.HashMap r2 = r1.A07(r12)     // Catch:{ IOException -> 0x0128 }
            r2.getClass()     // Catch:{ IOException -> 0x0128 }
            java.util.ArrayList r3 = X.Dba.A0e(r2)     // Catch:{ IOException -> 0x0128 }
            r2 = 7
            X.C13113TLw.A00(r2, r3)     // Catch:{ IOException -> 0x0128 }
            java.util.Iterator r17 = r3.iterator()     // Catch:{ IOException -> 0x0128 }
            r15 = -1
            r6 = -1
        L_0x00cd:
            boolean r2 = r17.hasNext()     // Catch:{ IOException -> 0x0128 }
            if (r2 == 0) goto L_0x00ec
            java.lang.Object r8 = r17.next()     // Catch:{ IOException -> 0x0128 }
            X.4aM r8 = (X.C266794aM) r8     // Catch:{ IOException -> 0x0128 }
            int r2 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            long r2 = r8.A00     // Catch:{ IOException -> 0x0128 }
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x00e4
            goto L_0x0128
        L_0x00e4:
            long r6 = r8.A00     // Catch:{ IOException -> 0x0128 }
            long r2 = X.Q1Z.A01(r11, r8)     // Catch:{ IOException -> 0x0128 }
            long r6 = r6 + r2
            goto L_0x00cd
        L_0x00ec:
            java.util.HashMap r13 = r1.A07(r12)     // Catch:{ all -> 0x0d87 }
            if (r13 == 0) goto L_0x0128
            java.util.HashMap r2 = r1.A07(r12)     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0137
            java.util.Iterator r11 = X.AnonymousClass7TF.A0t(r2)     // Catch:{ all -> 0x0d87 }
        L_0x00fc:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0137
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0d87 }
            X.4aM r2 = (X.C266794aM) r2     // Catch:{ all -> 0x0d87 }
            java.util.List r2 = r2.A04     // Catch:{ all -> 0x0d87 }
            java.util.Iterator r8 = X.Pxg.A16(r2)     // Catch:{ all -> 0x0d87 }
        L_0x010e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x0d87 }
            X.4aI r2 = (X.C266754aI) r2     // Catch:{ all -> 0x0d87 }
            X.4aF r3 = r2.A03     // Catch:{ all -> 0x0d87 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0d87 }
            long r15 = r3.A03(r2)     // Catch:{ all -> 0x0d87 }
            r6 = 0
            int r2 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x010e
        L_0x0128:
            r29 = 1
            X.TdH r3 = r0.A0L     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "audio_stream-"
            java.lang.String r15 = ".mp4"
            java.io.File r2 = r3.createTempFile(r2, r15)     // Catch:{ all -> 0x0d87 }
            r0.A0A = r2     // Catch:{ all -> 0x0d87 }
            goto L_0x017f
        L_0x0137:
            r3 = 0
            java.util.Iterator r8 = X.AnonymousClass7TF.A0t(r13)     // Catch:{ all -> 0x0d87 }
            r7 = 1
        L_0x013d:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0178
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x0d87 }
            X.4aM r2 = (X.C266794aM) r2     // Catch:{ all -> 0x0d87 }
            java.util.List r2 = r2.A04     // Catch:{ all -> 0x0d87 }
            java.util.Iterator r6 = X.Pxg.A16(r2)     // Catch:{ all -> 0x0d87 }
        L_0x014f:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0d87 }
            X.4aI r2 = (X.C266754aI) r2     // Catch:{ all -> 0x0d87 }
            java.io.File r2 = r2.A04     // Catch:{ IOException -> 0x0128 }
            if (r2 == 0) goto L_0x014f
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0128 }
            if (r7 == 0) goto L_0x016b
            X.TdJ r3 = X.C7324Q4a.A01(r12, r10, r2)     // Catch:{ IOException -> 0x0128 }
            r7 = 0
            goto L_0x014f
        L_0x016b:
            X.TdJ r2 = X.C7324Q4a.A01(r12, r10, r2)     // Catch:{ IOException -> 0x0128 }
            if (r3 == 0) goto L_0x0128
            boolean r2 = r3.CSl(r2)     // Catch:{ IOException -> 0x0128 }
            if (r2 != 0) goto L_0x014f
            goto L_0x0128
        L_0x0178:
            boolean r2 = r4.A0P     // Catch:{ all -> 0x0d87 }
            r29 = 0
            if (r2 == 0) goto L_0x05a9
            goto L_0x0128
        L_0x017f:
            if (r5 == 0) goto L_0x047a
            X.4aE r9 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x01f2
            X.4aM r2 = r1.A04(r9, r14)     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x01f2
            X.Q4k r2 = r4.A0B     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2.A0H()     // Catch:{ all -> 0x0d87 }
            X.Q1K r7 = new X.Q1K     // Catch:{ all -> 0x0d87 }
            r7.<init>(r1, r2)     // Catch:{ all -> 0x0d87 }
            r7.A01(r9, r14)     // Catch:{ all -> 0x0d87 }
        L_0x0199:
            java.io.File r6 = r4.A0D     // Catch:{ all -> 0x0d87 }
            java.io.File r2 = r0.A0A     // Catch:{ all -> 0x0d87 }
            r23 = r2
            r23.getClass()     // Catch:{ all -> 0x0d87 }
            X.TdI r2 = r0.A0M     // Catch:{ all -> 0x0d87 }
            r19 = r2
            X.Q4U r18 = new X.Q4U     // Catch:{ all -> 0x0d87 }
            r18.<init>()     // Catch:{ all -> 0x0d87 }
            X.Tfv r12 = r0.A0J     // Catch:{ all -> 0x0d87 }
            long r10 = r4.A04     // Catch:{ all -> 0x0d87 }
            long r2 = r4.A00     // Catch:{ all -> 0x0d87 }
            X.SFQ r8 = r4.A0C     // Catch:{ all -> 0x0d87 }
            X.Q4k r13 = r4.A0B     // Catch:{ all -> 0x0d87 }
            r27 = r13
            java.lang.String r13 = "encoder-delay"
            java.lang.String r28 = "transcodeToAdts failed"
            if (r27 != 0) goto L_0x01c3
            X.Q4k r27 = new X.Q4k     // Catch:{ all -> 0x0d87 }
            r27.<init>()     // Catch:{ all -> 0x0d87 }
        L_0x01c3:
            r5.A01 = r10     // Catch:{ all -> 0x0d87 }
            r5.A00 = r2     // Catch:{ all -> 0x0d87 }
            r5.A07 = r8     // Catch:{ all -> 0x0d87 }
            boolean r3 = X.AnonymousClass7TF.A1V(r23)     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "null outputFile provided"
            X.C266784aL.A06(r3, r2)     // Catch:{ all -> 0x0d87 }
            r2 = r23
            r5.A08 = r2     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = r23.getName()     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2.endsWith(r15)     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x01e5
            r2 = r29
            r5.A0A = r2     // Catch:{ all -> 0x0d87 }
        L_0x01e5:
            r8 = r19
            r3 = r18
            r2 = r27
            X.Tig r15 = r8.AL7(r12, r3, r2)     // Catch:{ all -> 0x0d87 }
            r5.A05 = r15     // Catch:{ all -> 0x0d87 }
            goto L_0x01f4
        L_0x01f2:
            r7 = 0
            goto L_0x0199
        L_0x01f4:
            if (r1 == 0) goto L_0x01f7
            goto L_0x020a
        L_0x01f7:
            if (r6 == 0) goto L_0x0d5e
            r15.ETs(r6)     // Catch:{ all -> 0x0d87 }
            long r10 = r5.A01     // Catch:{ all -> 0x0d87 }
            long r2 = r5.A00     // Catch:{ all -> 0x0d87 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0d87 }
            X.4aF r2 = X.Pxe.A0V(r8, r10, r2)     // Catch:{ all -> 0x0d87 }
            r15.EpM(r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x020d
        L_0x020a:
            r15.ETq(r1)     // Catch:{ all -> 0x0d87 }
        L_0x020d:
            X.STP.A02(r5)     // Catch:{ all -> 0x0d87 }
            r16 = 0
            if (r7 == 0) goto L_0x0215
            goto L_0x0218
        L_0x0215:
            r35 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0223
        L_0x0218:
            r7.A01(r9, r14)     // Catch:{ all -> 0x0d87 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0d87 }
            r2 = r16
            float r35 = r7.A00(r8, r2)     // Catch:{ all -> 0x0d87 }
        L_0x0223:
            X.Q1b r8 = new X.Q1b     // Catch:{ all -> 0x0d87 }
            r8.<init>()     // Catch:{ all -> 0x0d87 }
            X.Tig r2 = r5.A05     // Catch:{ Exception -> 0x0461 }
            boolean r2 = r2.CX8(r9)     // Catch:{ Exception -> 0x0461 }
            if (r2 != 0) goto L_0x02ad
            if (r1 == 0) goto L_0x0233
            goto L_0x0266
        L_0x0233:
            r7 = r19
            r3 = r18
            r2 = r27
            X.Tig r9 = r7.AL7(r12, r3, r2)     // Catch:{ all -> 0x02aa }
            if (r6 == 0) goto L_0x029c
            r9.ETs(r6)     // Catch:{ all -> 0x02a4 }
            long r6 = r5.A01     // Catch:{ all -> 0x02a4 }
            long r2 = r5.A00     // Catch:{ all -> 0x02a4 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02a4 }
            X.4aF r2 = X.Pxe.A0V(r10, r6, r2)     // Catch:{ all -> 0x02a4 }
            r9.EpM(r2)     // Catch:{ all -> 0x02a4 }
            X.4aE r2 = X.C266714aE.VIDEO     // Catch:{ all -> 0x02a4 }
            r9.ELE(r2, r14)     // Catch:{ all -> 0x02a4 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x02a4 }
            long r2 = r9.AzU()     // Catch:{ all -> 0x02a4 }
            long r2 = r6.toMillis(r2)     // Catch:{ all -> 0x02a4 }
            float r6 = (float) r2     // Catch:{ all -> 0x02a4 }
            float r6 = r6 / r35
            long r2 = (long) r6     // Catch:{ all -> 0x02a4 }
            r9.release()     // Catch:{ Exception -> 0x0461 }
            goto L_0x0276
        L_0x0266:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Exception -> 0x0461 }
            X.4aE r2 = X.C266714aE.VIDEO     // Catch:{ Exception -> 0x0461 }
            long r2 = X.Q1Z.A00(r12, r2, r1)     // Catch:{ Exception -> 0x0461 }
            long r2 = X.AnonymousClass7TE.A0P(r2)     // Catch:{ Exception -> 0x0461 }
            long r2 = r6.toMillis(r2)     // Catch:{ Exception -> 0x0461 }
        L_0x0276:
            X.SFQ r7 = r5.A07     // Catch:{ Exception -> 0x0461 }
            java.io.File r6 = r5.A08     // Catch:{ Exception -> 0x0461 }
            r5.A06(r7, r6, r2)     // Catch:{ Exception -> 0x0461 }
            java.io.File r2 = r5.A08     // Catch:{ Exception -> 0x0461 }
            r2.length()     // Catch:{ Exception -> 0x0461 }
            long r6 = r23.length()     // Catch:{ Exception -> 0x0461 }
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            boolean r6 = X.AnonymousClass7TF.A1R(r2)
            r5.A05()     // Catch:{ all -> 0x0290 }
            goto L_0x0294
        L_0x0290:
            r2 = move-exception
            X.C7254Q1b.A00(r8, r2)     // Catch:{ all -> 0x0d87 }
        L_0x0294:
            java.lang.Throwable r3 = r8.A01     // Catch:{ all -> 0x0d87 }
            if (r3 != 0) goto L_0x0d07
            if (r6 == 0) goto L_0x0d6f
            goto L_0x05a9
        L_0x029c:
            java.lang.String r3 = "No data source provided"
            X.Qe3 r2 = new X.Qe3     // Catch:{ all -> 0x02a4 }
            r2.<init>(r3)     // Catch:{ all -> 0x02a4 }
            throw r2     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r6 = move-exception
            r9.release()     // Catch:{ Exception -> 0x0461 }
            goto L_0x0460
        L_0x02aa:
            r6 = move-exception
            goto L_0x0460
        L_0x02ad:
            X.Tig r2 = r5.A05     // Catch:{ Exception -> 0x0461 }
            r2.ELE(r9, r14)     // Catch:{ Exception -> 0x0461 }
            if (r1 == 0) goto L_0x02ca
            boolean r2 = X.Q1Z.A05(r1)     // Catch:{ Exception -> 0x0461 }
            if (r2 == 0) goto L_0x02ca
            X.Tig r2 = r5.A05     // Catch:{ all -> 0x02c7 }
            r2.AzU()     // Catch:{ all -> 0x02c7 }
            java.lang.String r3 = "Renderer Factory is not set"
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x02c7 }
            r2.<init>(r3)     // Catch:{ all -> 0x02c7 }
            throw r2     // Catch:{ all -> 0x02c7 }
        L_0x02c7:
            r3 = move-exception
            goto L_0x0459
        L_0x02ca:
            X.Tig r2 = r5.A05     // Catch:{ Exception -> 0x0461 }
            android.media.MediaFormat r6 = r2.BpC()     // Catch:{ Exception -> 0x0461 }
            java.lang.String r2 = "mime"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ Exception -> 0x0461 }
            r2 = 2093116953(0x7cc26e19, float:8.076309E36)
            android.media.MediaCodec r2 = X.0fX.A01(r3, r2)     // Catch:{ Exception -> 0x0461 }
            r5.A02 = r2     // Catch:{ Exception -> 0x0461 }
            if (r2 == 0) goto L_0x044d
            boolean r2 = r6.containsKey(r13)     // Catch:{ Exception -> 0x0461 }
            if (r2 == 0) goto L_0x02f3
            int r3 = r6.getInteger(r13)     // Catch:{ Exception -> 0x0461 }
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r3 <= r2) goto L_0x02f3
            r6.setInteger(r13, r14)     // Catch:{ Exception -> 0x0461 }
        L_0x02f3:
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            r15 = 934289997(0x37b0224d, float:2.0996808E-5)
            r10 = r2
            r11 = r20
            r12 = r6
            r13 = r11
            X.0fX.A07(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0461 }
            android.media.MediaCodec r3 = r5.A02     // Catch:{ Exception -> 0x0461 }
            r2 = -1530418939(0xffffffffa4c7a905, float:-8.658882E-17)
            X.0fX.A05(r3, r2)     // Catch:{ Exception -> 0x0461 }
            X.SFQ r9 = r5.A07     // Catch:{ Exception -> 0x0461 }
            int r2 = r9.A00     // Catch:{ Exception -> 0x0461 }
            r3 = -1
            if (r2 != r3) goto L_0x0317
            java.lang.String r2 = "bitrate"
            int r2 = r6.getInteger(r2)     // Catch:{ Exception -> 0x0461 }
            r9.A00 = r2     // Catch:{ Exception -> 0x0461 }
        L_0x0317:
            X.SFQ r9 = r5.A07     // Catch:{ Exception -> 0x0461 }
            int r2 = r9.A01     // Catch:{ Exception -> 0x0461 }
            if (r2 != r3) goto L_0x0325
            java.lang.String r2 = "channel-count"
            int r2 = r6.getInteger(r2)     // Catch:{ Exception -> 0x0461 }
            r9.A01 = r2     // Catch:{ Exception -> 0x0461 }
        L_0x0325:
            X.SFQ r2 = r5.A07     // Catch:{ Exception -> 0x0461 }
            int r2 = r2.A04     // Catch:{ Exception -> 0x0461 }
            r26 = r2
            if (r2 != r3) goto L_0x0334
            java.lang.String r2 = "sample-rate"
            int r26 = r6.getInteger(r2)     // Catch:{ Exception -> 0x0461 }
        L_0x0334:
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            java.nio.ByteBuffer[] r25 = r2.getInputBuffers()     // Catch:{ Exception -> 0x0461 }
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            java.nio.ByteBuffer[] r18 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x0461 }
            byte[] r2 = r5.A0L     // Catch:{ Exception -> 0x0461 }
            r34 = r2
            X.SFQ r2 = r5.A07     // Catch:{ Exception -> 0x0461 }
            int r9 = r2.A01     // Catch:{ Exception -> 0x0461 }
            r3 = r26
            r2 = r34
            X.STP.A03(r5, r2, r3, r9)     // Catch:{ Exception -> 0x0461 }
            android.media.MediaCodec$BufferInfo r2 = r5.A0K     // Catch:{ Exception -> 0x0461 }
            r43 = r2
            r30 = r2
            r31 = r6
            r32 = r5
            r33 = r27
            r36 = r3
            X.STP.A00(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x0461 }
            r24 = r35
            r23 = 0
            r19 = 0
        L_0x0366:
            android.media.MediaCodec r9 = r5.A02     // Catch:{ Exception -> 0x0461 }
            r2 = r16
            int r37 = r9.dequeueInputBuffer(r2)     // Catch:{ Exception -> 0x0461 }
            if (r37 < 0) goto L_0x03a2
            r3 = r25[r37]     // Catch:{ Exception -> 0x0461 }
            X.Tig r2 = r5.A05     // Catch:{ Exception -> 0x0461 }
            int r39 = r2.E6i(r3)     // Catch:{ Exception -> 0x0461 }
            if (r39 >= 0) goto L_0x038c
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            r42 = 4
            r36 = r2
            r38 = r14
            r39 = r14
            r40 = r16
            r36.queueInputBuffer(r37, r38, r39, r40, r42)     // Catch:{ Exception -> 0x0461 }
            r23 = 1
            goto L_0x03a2
        L_0x038c:
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            X.Tig r3 = r5.A05     // Catch:{ Exception -> 0x0461 }
            long r40 = r3.BpD()     // Catch:{ Exception -> 0x0461 }
            r36 = r2
            r38 = r14
            r42 = r14
            r36.queueInputBuffer(r37, r38, r39, r40, r42)     // Catch:{ Exception -> 0x0461 }
            X.Tig r2 = r5.A05     // Catch:{ Exception -> 0x0461 }
            r2.AAt()     // Catch:{ Exception -> 0x0461 }
        L_0x03a2:
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            android.media.MediaCodec$BufferInfo r11 = r5.A0J     // Catch:{ Exception -> 0x0461 }
            r12 = 5000(0x1388, double:2.4703E-320)
            int r10 = r2.dequeueOutputBuffer(r11, r12)     // Catch:{ Exception -> 0x0461 }
            if (r10 < 0) goto L_0x03e5
            r9 = r18[r10]     // Catch:{ Exception -> 0x0461 }
            X.Pxg.A1D(r11, r9)     // Catch:{ Exception -> 0x0461 }
            int r2 = r11.flags     // Catch:{ Exception -> 0x0461 }
            r2 = r2 & 4
            if (r2 != 0) goto L_0x03dd
            if (r7 == 0) goto L_0x03c3
            long r2 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0461 }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Exception -> 0x0461 }
            float r35 = r7.A00(r15, r2)     // Catch:{ Exception -> 0x0461 }
        L_0x03c3:
            int r2 = (r24 > r35 ? 1 : (r24 == r35 ? 0 : -1))
            if (r2 == 0) goto L_0x03d5
            X.S5q r2 = r5.A06     // Catch:{ Exception -> 0x0461 }
            r2.A01()     // Catch:{ Exception -> 0x0461 }
            r30 = r43
            r31 = r6
            r36 = r26
            X.STP.A00(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x0461 }
        L_0x03d5:
            X.S5q r2 = r5.A06     // Catch:{ Exception -> 0x0461 }
            r2.A02(r9)     // Catch:{ Exception -> 0x0461 }
            r24 = r35
            goto L_0x0402
        L_0x03dd:
            X.S5q r2 = r5.A06     // Catch:{ Exception -> 0x0461 }
            r2.A01()     // Catch:{ Exception -> 0x0461 }
            r19 = 1
            goto L_0x0402
        L_0x03e5:
            r2 = -3
            if (r10 != r2) goto L_0x03ef
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            java.nio.ByteBuffer[] r18 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x0461 }
            goto L_0x040a
        L_0x03ef:
            r2 = -2
            if (r10 != r2) goto L_0x040a
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            android.media.MediaFormat r6 = r2.getOutputFormat()     // Catch:{ Exception -> 0x0461 }
            r30 = r43
            r31 = r6
            r36 = r26
            X.STP.A00(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x0461 }
            goto L_0x040a
        L_0x0402:
            X.Pxg.A1D(r11, r9)     // Catch:{ Exception -> 0x0461 }
            android.media.MediaCodec r2 = r5.A02     // Catch:{ Exception -> 0x0461 }
            r2.releaseOutputBuffer(r10, r14)     // Catch:{ Exception -> 0x0461 }
        L_0x040a:
            r9 = r43
            r3 = r27
            r2 = r34
            X.STP.A01(r9, r5, r3, r2)     // Catch:{ Exception -> 0x0461 }
            if (r19 == 0) goto L_0x042c
            android.media.MediaCodec r2 = r5.A03     // Catch:{ Exception -> 0x0461 }
            int r37 = r2.dequeueInputBuffer(r12)     // Catch:{ Exception -> 0x0461 }
            if (r37 < 0) goto L_0x042c
            android.media.MediaCodec r2 = r5.A03     // Catch:{ Exception -> 0x0461 }
            r42 = 4
            r36 = r2
            r38 = r14
            r39 = r14
            r40 = r16
            r36.queueInputBuffer(r37, r38, r39, r40, r42)     // Catch:{ Exception -> 0x0461 }
        L_0x042c:
            r2 = r34
            boolean r2 = X.STP.A04(r9, r5, r2)     // Catch:{ Exception -> 0x0461 }
            if (r2 != 0) goto L_0x0438
            if (r23 != 0) goto L_0x03a2
            goto L_0x0366
        L_0x0438:
            r5.A05()     // Catch:{ all -> 0x043c }
            goto L_0x0440
        L_0x043c:
            r2 = move-exception
            X.C7254Q1b.A00(r8, r2)     // Catch:{ all -> 0x0d87 }
        L_0x0440:
            java.lang.Throwable r3 = r8.A01     // Catch:{ all -> 0x0d87 }
            if (r3 == 0) goto L_0x059f
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r1 = r28
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d2e
        L_0x044d:
            java.lang.String r2 = "Can't create decoder for "
            java.lang.String r2 = X.002.A0R(r2, r3)     // Catch:{ Exception -> 0x0461 }
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x0461 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0461 }
            goto L_0x0460
        L_0x0459:
            java.lang.String r2 = "Audio Mixing failed"
            X.4ZS r6 = new X.4ZS     // Catch:{ Exception -> 0x0461 }
            r6.<init>(r2, r3)     // Catch:{ Exception -> 0x0461 }
        L_0x0460:
            throw r6     // Catch:{ Exception -> 0x0461 }
        L_0x0461:
            r2 = move-exception
            X.C7254Q1b.A00(r8, r2)     // Catch:{ all -> 0x0d59 }
            r5.A05()     // Catch:{ all -> 0x0469 }
            goto L_0x046d
        L_0x0469:
            r2 = move-exception
            X.C7254Q1b.A00(r8, r2)     // Catch:{ all -> 0x0d87 }
        L_0x046d:
            java.lang.Throwable r2 = r8.A01     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x059f
            X.4ZS r3 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r1 = r28
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d86
        L_0x047a:
            X.TdG r2 = r0.A0G     // Catch:{ all -> 0x0d87 }
            X.TiV r7 = r2.AL5()     // Catch:{ all -> 0x0d87 }
            X.SFQ r2 = r4.A0C     // Catch:{ all -> 0x0d87 }
            int r5 = r2.A04     // Catch:{ all -> 0x0d87 }
            int r3 = r2.A01     // Catch:{ all -> 0x0d87 }
            java.lang.Integer r2 = X.C9956RkB.A00     // Catch:{ all -> 0x0d87 }
            X.SEV r8 = new X.SEV     // Catch:{ all -> 0x0d87 }
            r8.<init>(r5, r3)     // Catch:{ all -> 0x0d87 }
            r1.getClass()     // Catch:{ all -> 0x0d87 }
            X.4aE r2 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            java.util.HashMap r2 = r1.A07(r2)     // Catch:{ all -> 0x0d87 }
            r2.getClass()     // Catch:{ all -> 0x0d87 }
            int r3 = r2.size()     // Catch:{ all -> 0x0d87 }
            if (r3 <= 0) goto L_0x04a0
            r9 = 1
        L_0x04a0:
            java.lang.String r2 = "Must have 1 or more audio tracks to transcode audio."
            X.C266784aL.A06(r9, r2)     // Catch:{ all -> 0x0d87 }
            X.RuN r9 = new X.RuN     // Catch:{ all -> 0x0d87 }
            r9.<init>(r8, r8, r3)     // Catch:{ all -> 0x0d87 }
            X.Q4k r2 = r4.A0B     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2.A02()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0515
            int r2 = r7.getWarmupDurationInSec()     // Catch:{ all -> 0x0d87 }
            if (r2 <= 0) goto L_0x0515
            java.util.HashSet r6 = r4.A0G     // Catch:{ all -> 0x0d87 }
            int r2 = r7.getWarmupDurationInSec()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0515
            boolean r2 = r6.isEmpty()     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x0515
            r7.configure(r9)     // Catch:{ all -> 0x0d87 }
            X.S30 r5 = r0.A0S     // Catch:{ all -> 0x0d87 }
            X.Tfv r3 = r0.A0J     // Catch:{ all -> 0x0d87 }
            X.Q1d r2 = r0.A0F     // Catch:{ all -> 0x0d87 }
            X.SrG r25 = new X.SrG     // Catch:{ all -> 0x0d87 }
            r25.<init>()     // Catch:{ all -> 0x0d87 }
            X.RyG r33 = new X.RyG     // Catch:{ all -> 0x0d87 }
            r23 = r33
            r24 = r7
            r26 = r20
            r27 = r20
            r28 = r4
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0d87 }
            java.lang.Integer r38 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0d87 }
            X.STM r10 = new X.STM     // Catch:{ all -> 0x0d87 }
            r30 = r10
            r31 = r2
            r32 = r20
            r34 = r3
            r35 = r20
            r36 = r4
            r37 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0d87 }
            android.os.Handler r5 = r10.A0D     // Catch:{ all -> 0x0d87 }
            r2 = 3
            X.Pxf.A15(r5, r2)     // Catch:{ all -> 0x0d87 }
            int r2 = r7.getWarmupDurationInSec()     // Catch:{ all -> 0x0d87 }
            android.util.Pair r3 = X.Pxf.A0K(r6, r2)     // Catch:{ all -> 0x0d87 }
            r2 = 9
            X.Pxe.A1N(r5, r3, r2)     // Catch:{ all -> 0x0d87 }
            X.RyG r2 = r10.A0F     // Catch:{ all -> 0x0d87 }
            X.Thy r2 = r2.A02     // Catch:{ all -> 0x0d87 }
            r2.FNG()     // Catch:{ all -> 0x0d87 }
            r10.A05()     // Catch:{ all -> 0x0d87 }
        L_0x0515:
            r7.configure(r9)     // Catch:{ all -> 0x0d87 }
            X.Q1d r10 = r0.A0F     // Catch:{ all -> 0x0d87 }
            java.lang.Integer r9 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0d87 }
            r2 = r20
            java.util.concurrent.ThreadPoolExecutor r40 = r10.A03(r9, r2)     // Catch:{ all -> 0x0d87 }
            X.SJL r11 = r0.A03     // Catch:{ all -> 0x0d87 }
            r11.getClass()     // Catch:{ all -> 0x0d87 }
            X.Tfv r6 = r0.A0J     // Catch:{ all -> 0x0d87 }
            X.ThT r5 = r0.A0O     // Catch:{ all -> 0x0d87 }
            X.RwQ r3 = new X.RwQ     // Catch:{ all -> 0x0d87 }
            r12 = r29
            r13 = r2
            r3.<init>(r12, r2, r2, r14)     // Catch:{ all -> 0x0d87 }
            java.io.File r2 = r0.A0A     // Catch:{ all -> 0x0d87 }
            r2.getClass()     // Catch:{ all -> 0x0d87 }
            java.lang.String r39 = r2.getPath()     // Catch:{ all -> 0x0d87 }
            android.content.Context r2 = r0.A0E     // Catch:{ all -> 0x0d87 }
            X.SrH r30 = new X.SrH     // Catch:{ all -> 0x0d87 }
            r31 = r2
            r32 = r8
            r33 = r6
            r34 = r11
            r35 = r13
            r36 = r5
            r37 = r3
            r38 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0d87 }
            X.SJL r5 = r0.A03     // Catch:{ all -> 0x0d87 }
            r5.getClass()     // Catch:{ all -> 0x0d87 }
            X.S30 r2 = r0.A0S     // Catch:{ all -> 0x0d87 }
            X.SOl r3 = r0.A06     // Catch:{ all -> 0x0d87 }
            X.RyG r33 = new X.RyG     // Catch:{ all -> 0x0d87 }
            r23 = r33
            r24 = r7
            r25 = r30
            r26 = r13
            r27 = r3
            r28 = r4
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0d87 }
            X.STM r3 = new X.STM     // Catch:{ all -> 0x0d87 }
            r30 = r3
            r31 = r10
            r32 = r13
            r34 = r6
            r36 = r4
            r37 = r2
            r38 = r9
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0d87 }
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0d87 }
            android.os.Handler r6 = r3.A0D     // Catch:{ all -> 0x0d87 }
            r2 = 3
            X.Pxf.A15(r6, r2)     // Catch:{ all -> 0x0d87 }
            X.Pxf.A15(r6, r12)     // Catch:{ all -> 0x0d87 }
            X.RyG r2 = r3.A0F     // Catch:{ all -> 0x0d66 }
            X.Thy r2 = r2.A02     // Catch:{ all -> 0x0d66 }
            r2.FNG()     // Catch:{ all -> 0x0d66 }
            r3.A05()     // Catch:{ all -> 0x0d66 }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0d66 }
            long r2 = r2 - r7
            r5.A01 = r2     // Catch:{ all -> 0x0d66 }
            goto L_0x05a9
        L_0x059f:
            java.io.File r2 = r5.A08     // Catch:{ all -> 0x0d87 }
            long r5 = r2.length()     // Catch:{ all -> 0x0d87 }
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0d6f
        L_0x05a9:
            X.TdI r6 = r0.A0M     // Catch:{ all -> 0x0d87 }
            X.Tfv r5 = r0.A0J     // Catch:{ all -> 0x0d87 }
            X.Tgv r3 = r0.A0N     // Catch:{ all -> 0x0d87 }
            X.Q4k r2 = r4.A0B     // Catch:{ all -> 0x0d87 }
            X.Tig r5 = r6.AL7(r5, r3, r2)     // Catch:{ all -> 0x0d87 }
            r0.A04 = r5     // Catch:{ all -> 0x0d87 }
            if (r29 == 0) goto L_0x05c4
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "audioOutputFile can only be null if useTranscodedAudioFile is false"
            X.0JA.A03(r3, r2)     // Catch:{ all -> 0x0d87 }
            r5.ETs(r3)     // Catch:{ all -> 0x0d87 }
            goto L_0x05c7
        L_0x05c4:
            X.S9X.A01(r5, r4)     // Catch:{ all -> 0x0d87 }
        L_0x05c7:
            X.Tig r5 = r0.A04     // Catch:{ all -> 0x0d87 }
            X.4aE r3 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            r2 = -1
            r5.ELE(r3, r2)     // Catch:{ all -> 0x0d87 }
            X.Tig r2 = r0.A04     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2.CX8(r3)     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x008c
            X.Tig r2 = r0.A04     // Catch:{ all -> 0x0d87 }
            android.media.MediaFormat r2 = r2.BpC()     // Catch:{ all -> 0x0d87 }
            r0.A02 = r2     // Catch:{ all -> 0x0d87 }
            goto L_0x008c
        L_0x05e1:
            r5 = 0
            int r2 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x05ee
            X.Tig r5 = r0.A04     // Catch:{ all -> 0x0d87 }
            r2 = r18
            r5.EKz(r2)     // Catch:{ all -> 0x0d87 }
        L_0x05ee:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0d87 }
            X.4aE r5 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            X.Tfv r3 = r0.A0J     // Catch:{ all -> 0x0d87 }
            android.content.Context r2 = r0.A0E     // Catch:{ all -> 0x0d87 }
            long r2 = X.S9X.A00(r2, r3, r5, r4)     // Catch:{ all -> 0x0d87 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0d87 }
            long r2 = r6.convert(r2, r5)     // Catch:{ all -> 0x0d87 }
            r6 = 1215954944(0x487a0000, float:256000.0)
            r5 = 1090519040(0x41000000, float:8.0)
            float r6 = r6 / r5
            float r5 = (float) r2     // Catch:{ all -> 0x0d87 }
            float r6 = r6 * r5
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r2
            int r2 = java.lang.Math.round(r6)     // Catch:{ all -> 0x0d87 }
            long r2 = (long) r2     // Catch:{ all -> 0x0d87 }
            r0.A00 = r2     // Catch:{ all -> 0x0d87 }
        L_0x0611:
            boolean r2 = r4.A0I     // Catch:{ all -> 0x0cfe }
            r27 = r2
            if (r2 != 0) goto L_0x06b8
            X.TdQ r2 = r0.A0R     // Catch:{ all -> 0x0cfe }
            r2.getClass()     // Catch:{ all -> 0x0cfe }
            boolean r5 = X.SRj.A04(r4)     // Catch:{ all -> 0x0cfe }
            X.Tfw r2 = r2.ALN(r1, r5)     // Catch:{ all -> 0x0cfe }
            r0.A08 = r2     // Catch:{ all -> 0x0cfe }
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0cfe }
            r2.A0Y = r5     // Catch:{ all -> 0x0cfe }
            if (r5 == 0) goto L_0x0635
            X.Tgv r2 = r0.A0N     // Catch:{ all -> 0x0cfe }
            boolean r3 = r2.AFw()     // Catch:{ all -> 0x0cfe }
            java.lang.String r2 = "Incompatible MediaExtractor for passthrough"
            goto L_0x0643
        L_0x0635:
            if (r22 == 0) goto L_0x0640
            X.Tgv r2 = r0.A0N     // Catch:{ all -> 0x0cfe }
            boolean r2 = r2.AFy()     // Catch:{ all -> 0x0cfe }
            r3 = 1
            if (r2 != 0) goto L_0x0641
        L_0x0640:
            r3 = 0
        L_0x0641:
            java.lang.String r2 = "Incompatible Parameters for Transcoding"
        L_0x0643:
            X.C266784aL.A06(r3, r2)     // Catch:{ all -> 0x0cfe }
            if (r1 == 0) goto L_0x0661
            if (r22 == 0) goto L_0x0661
            X.4aE r2 = X.C266714aE.VIDEO     // Catch:{ all -> 0x0cfe }
            java.util.List r2 = r1.A08(r2, r14)     // Catch:{ all -> 0x0cfe }
            r2.getClass()     // Catch:{ all -> 0x0cfe }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0cfe }
            X.4aI r2 = (X.C266754aI) r2     // Catch:{ all -> 0x0cfe }
            boolean r3 = r2.A01(r14)     // Catch:{ all -> 0x0cfe }
            r2 = r22
            r2.A0N = r3     // Catch:{ all -> 0x0cfe }
        L_0x0661:
            if (r5 != 0) goto L_0x06b8
            r22.getClass()     // Catch:{ all -> 0x0cfe }
            int r2 = r22.A01()     // Catch:{ all -> 0x0cfe }
            long r5 = (long) r2     // Catch:{ all -> 0x0cfe }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0cfe }
            X.4aE r7 = X.C266714aE.VIDEO     // Catch:{ all -> 0x0cfe }
            X.Tfv r3 = r0.A0J     // Catch:{ all -> 0x0cfe }
            android.content.Context r2 = r0.A0E     // Catch:{ all -> 0x0cfe }
            long r2 = X.S9X.A00(r2, r3, r7, r4)     // Catch:{ all -> 0x0cfe }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0cfe }
            long r2 = r8.convert(r2, r7)     // Catch:{ all -> 0x0cfe }
            float r7 = (float) r5     // Catch:{ all -> 0x0cfe }
            r5 = 1090519040(0x41000000, float:8.0)
            float r7 = r7 / r5
            float r5 = (float) r2     // Catch:{ all -> 0x0cfe }
            float r7 = r7 * r5
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r2
            int r2 = java.lang.Math.round(r7)     // Catch:{ all -> 0x0cfe }
            long r2 = (long) r2     // Catch:{ all -> 0x0cfe }
            r0.A01 = r2     // Catch:{ all -> 0x0cfe }
            X.SJL r5 = r0.A03     // Catch:{ all -> 0x0cfe }
            int r2 = r22.A01()     // Catch:{ all -> 0x0cfe }
            r5.A00 = r2     // Catch:{ all -> 0x0cfe }
            r2 = r22
            X.SJA r2 = r2.A0G     // Catch:{ all -> 0x0cfe }
            if (r2 == 0) goto L_0x06b1
            int r3 = r2.A03     // Catch:{ all -> 0x0cfe }
            r2 = 1
            if (r3 == r2) goto L_0x06ae
            r2 = 2
            if (r3 == r2) goto L_0x06aa
            r2 = 8
            if (r3 == r2) goto L_0x06b4
            java.lang.String r2 = ""
            goto L_0x06b6
        L_0x06aa:
            java.lang.String r2 = "main"
            goto L_0x06b6
        L_0x06ae:
            java.lang.String r2 = "baseline"
            goto L_0x06b6
        L_0x06b1:
            java.lang.String r2 = "baseline"
            goto L_0x06b6
        L_0x06b4:
            java.lang.String r2 = "high"
        L_0x06b6:
            r5.A0K = r2     // Catch:{ all -> 0x0cfe }
        L_0x06b8:
            X.TdH r2 = r0.A0L     // Catch:{ all -> 0x0d87 }
            r16 = r2
            X.ThT r2 = r0.A0O     // Catch:{ all -> 0x0d87 }
            r54 = r2
            X.SJL r15 = r0.A03     // Catch:{ all -> 0x0d87 }
            android.content.Context r13 = r0.A0E     // Catch:{ all -> 0x0d87 }
            int r41 = r0.A01()     // Catch:{ all -> 0x0d87 }
            android.media.MediaFormat r12 = r0.A02     // Catch:{ all -> 0x0d87 }
            X.Tig r11 = r0.A04     // Catch:{ all -> 0x0d87 }
            X.Tia r10 = r0.A09     // Catch:{ all -> 0x0d87 }
            X.Q1d r2 = r0.A0F     // Catch:{ all -> 0x0d87 }
            r53 = r2
            X.Tfw r9 = r0.A08     // Catch:{ all -> 0x0d87 }
            long r5 = r0.A01     // Catch:{ all -> 0x0d87 }
            long r2 = r0.A00     // Catch:{ all -> 0x0d87 }
            X.Q0d r8 = r0.A0I     // Catch:{ all -> 0x0d87 }
            X.Tfv r7 = r0.A0J     // Catch:{ all -> 0x0d87 }
            r52 = r7
            X.Q4f r7 = new X.Q4f     // Catch:{ all -> 0x0d87 }
            r29 = r13
            r30 = r12
            r31 = r53
            r32 = r8
            r33 = r52
            r34 = r15
            r35 = r16
            r36 = r11
            r37 = r54
            r38 = r4
            r39 = r9
            r40 = r10
            r42 = r5
            r44 = r2
            r28 = r7
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44)     // Catch:{ all -> 0x0d87 }
            r0.A05 = r7     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "FbVideoResizeOperation.configureMultiOutputCoordinator"
            X.C349257zq.A03(r2)     // Catch:{ all -> 0x0d87 }
            X.Q4f r8 = r0.A05     // Catch:{ all -> 0x0d87 }
            X.Rdm r2 = r0.A0P     // Catch:{ all -> 0x0d87 }
            r51 = r2
            r8.A00 = r2     // Catch:{ all -> 0x0d87 }
            X.4aE r5 = X.C266714aE.VIDEO     // Catch:{ all -> 0x0d87 }
            X.Tfv r13 = r8.A0B     // Catch:{ all -> 0x0d87 }
            X.RzN r7 = r8.A0G     // Catch:{ all -> 0x0d87 }
            android.content.Context r12 = r8.A07     // Catch:{ all -> 0x0d87 }
            long r41 = X.S9X.A00(r12, r13, r5, r7)     // Catch:{ all -> 0x0d87 }
            r9 = -1
            int r2 = (r41 > r9 ? 1 : (r41 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0728
            X.4aE r2 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            long r41 = X.S9X.A00(r12, r13, r2, r7)     // Catch:{ all -> 0x0d87 }
        L_0x0728:
            r39 = r41
            r6 = 1
            X.Q0d r2 = r8.A0A     // Catch:{ all -> 0x0d87 }
            r50 = r2
            long r9 = r8.A06     // Catch:{ all -> 0x0d87 }
            long r2 = r8.A05     // Catch:{ all -> 0x0d87 }
            X.RwR r34 = new X.RwR     // Catch:{ all -> 0x0d87 }
            r43 = r34
            r44 = r50
            r45 = r8
            r46 = r9
            r48 = r2
            r43.<init>(r44, r45, r46, r48)     // Catch:{ all -> 0x0d87 }
            X.TdH r2 = r8.A0D     // Catch:{ all -> 0x0d87 }
            r25 = r2
            X.ThT r2 = r8.A0F     // Catch:{ all -> 0x0d87 }
            r24 = r2
            boolean r9 = r7.A0H     // Catch:{ all -> 0x0d87 }
            if (r9 != 0) goto L_0x07ff
            boolean r2 = r7.A0I     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x07ff
        L_0x0752:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0d87 }
            r16 = 1
            r2 = r16
            long r10 = r10.toMicros(r2)     // Catch:{ all -> 0x0d87 }
            long r2 = r7.A01     // Catch:{ all -> 0x0d87 }
            long r43 = java.lang.Math.max(r10, r2)     // Catch:{ all -> 0x0d87 }
            if (r9 != 0) goto L_0x07fb
            boolean r2 = r7.A0I     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x07f7
            X.4aE r32 = X.C266714aE.MIXED     // Catch:{ all -> 0x0d87 }
        L_0x076a:
            boolean r15 = r7.A0J     // Catch:{ all -> 0x0d87 }
            X.SJL r2 = r8.A0C     // Catch:{ all -> 0x0d87 }
            r23 = r2
            X.Q4k r11 = r7.A0B     // Catch:{ all -> 0x0d87 }
            java.lang.String r10 = r7.A0F     // Catch:{ all -> 0x0d87 }
            X.SOn r2 = r7.A06     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x07f5
            java.util.Map r3 = r2.A0L     // Catch:{ all -> 0x0d87 }
        L_0x077a:
            java.lang.String r9 = r7.A0E     // Catch:{ all -> 0x0d87 }
            X.Q4j r2 = new X.Q4j     // Catch:{ all -> 0x0d87 }
            r29 = r50
            r30 = r23
            r31 = r25
            r33 = r24
            r35 = r11
            r36 = r10
            r37 = r9
            r38 = r3
            r45 = r15
            r46 = r15
            r28 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)     // Catch:{ all -> 0x0d87 }
            java.util.Map r9 = r8.A02     // Catch:{ all -> 0x0d87 }
            java.lang.Integer r26 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0d87 }
            r3 = r26
            r9.put(r3, r2)     // Catch:{ all -> 0x0d87 }
            boolean r3 = r7.A0I     // Catch:{ all -> 0x0d87 }
            if (r3 != 0) goto L_0x08ee
            X.Q1d r9 = r8.A09     // Catch:{ all -> 0x0d87 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0d87 }
            java.util.concurrent.ThreadPoolExecutor r37 = r9.A02(r3, r6)     // Catch:{ all -> 0x0d87 }
            android.media.MediaFormat r11 = r8.A08     // Catch:{ all -> 0x0d87 }
            X.Tfw r10 = r8.A0H     // Catch:{ all -> 0x0d87 }
            java.lang.String r3 = "mVideoTranscoder can only be null if isSkipVideoTrack is true"
            X.0JA.A03(r10, r3)     // Catch:{ all -> 0x0d87 }
            X.Q4g r9 = new X.Q4g     // Catch:{ all -> 0x0d87 }
            r28 = r9
            r29 = r12
            r30 = r11
            r31 = r50
            r32 = r13
            r33 = r23
            r34 = r2
            r35 = r7
            r36 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0d87 }
            java.util.Map r3 = r8.A01     // Catch:{ all -> 0x0d87 }
            r2 = r26
            r3.put(r2, r9)     // Catch:{ all -> 0x0d87 }
            X.Tfw r2 = r9.A07     // Catch:{ all -> 0x0d87 }
            X.Tie r2 = r2.ALy()     // Catch:{ all -> 0x0d87 }
            r9.A09 = r2     // Catch:{ all -> 0x0d87 }
            X.RzN r12 = r9.A06     // Catch:{ all -> 0x0d87 }
            boolean r2 = X.SRj.A04(r12)     // Catch:{ all -> 0x0d87 }
            if (r2 != 0) goto L_0x08c2
            X.Q4k r11 = r12.A0B     // Catch:{ all -> 0x0d87 }
            boolean r2 = r11 instanceof X.C7964QeC     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x080a
            r2 = r11
            X.QeC r2 = (X.C7964QeC) r2     // Catch:{ all -> 0x0d87 }
            int r2 = r2.A00     // Catch:{ all -> 0x0d87 }
            int r2 = 2 - r2
            if (r2 != 0) goto L_0x0818
            goto L_0x0808
        L_0x07f5:
            r3 = 0
            goto L_0x077a
        L_0x07f7:
            X.4aE r32 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0d87 }
            goto L_0x076a
        L_0x07fb:
            r32 = r5
            goto L_0x076a
        L_0x07ff:
            if (r9 == 0) goto L_0x0752
            int r2 = r8.A04     // Catch:{ all -> 0x0d87 }
            long r2 = (long) r2     // Catch:{ all -> 0x0d87 }
            long r41 = r41 / r2
            goto L_0x0752
        L_0x0808:
            r2 = 2
            goto L_0x0813
        L_0x080a:
            boolean r2 = r11 instanceof X.C7966QeE     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0818
            r2 = r11
            X.QeE r2 = (X.C7966QeE) r2     // Catch:{ all -> 0x0d87 }
            int r2 = r2.A00     // Catch:{ all -> 0x0d87 }
        L_0x0813:
            int r24 = java.lang.Math.max(r6, r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x081a
        L_0x0818:
            r2 = 1
            goto L_0x0813
        L_0x081a:
            int r24 = r24 + -1
            if (r24 < 0) goto L_0x08c2
            X.SJL r7 = r9.A04     // Catch:{ all -> 0x08a3 }
            long r2 = r7.A0A     // Catch:{ all -> 0x08a3 }
            long r2 = r2 + r16
            r7.A0A = r2     // Catch:{ all -> 0x08a3 }
            X.SOn r15 = r12.A06     // Catch:{ all -> 0x08a3 }
            X.SJA r2 = r15.A0G     // Catch:{ all -> 0x08a3 }
            if (r2 != 0) goto L_0x0889
            X.Rdm r2 = r12.A0A     // Catch:{ all -> 0x08a3 }
            r25 = r2
            boolean r2 = r15.A0M     // Catch:{ all -> 0x08a3 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x08a3 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r12.A08     // Catch:{ all -> 0x08a3 }
            X.Q0d r13 = r9.A00     // Catch:{ all -> 0x08a3 }
            java.util.ArrayList r2 = X.SKZ.A00(r13, r2, r11, r3)     // Catch:{ all -> 0x08a3 }
            java.util.Iterator r23 = r2.iterator()     // Catch:{ all -> 0x08a3 }
        L_0x0842:
            boolean r2 = r23.hasNext()     // Catch:{ all -> 0x08a3 }
            if (r2 == 0) goto L_0x08c2
            java.lang.Object r10 = r23.next()     // Catch:{ all -> 0x08a3 }
            X.SJA r10 = (X.SJA) r10     // Catch:{ all -> 0x08a3 }
            r15.A0G = r10     // Catch:{ all -> 0x086e }
            boolean r3 = r10.A01     // Catch:{ all -> 0x086e }
            r2 = 3
            if (r3 == 0) goto L_0x0856
            r2 = 7
        L_0x0856:
            r15.A09 = r2     // Catch:{ all -> 0x086e }
            X.Tie r3 = r9.A09     // Catch:{ all -> 0x086e }
            android.content.Context r2 = r9.A01     // Catch:{ all -> 0x086e }
            r28 = r3
            r29 = r2
            r30 = r13
            r31 = r15
            r32 = r25
            r33 = r11
            r34 = r14
            r28.E42(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x086e }
            goto L_0x08c2
        L_0x086e:
            r8 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x08a3 }
            java.lang.String r3 = "VideoEncodeMuxerWrapper"
            java.lang.String r2 = "error preparing %s"
            X.0KC.A0L(r3, r2, r8, r7)     // Catch:{ all -> 0x08a3 }
            int r2 = r10.A03     // Catch:{ all -> 0x08a3 }
            if (r6 != r2) goto L_0x0842
            X.RFa r2 = X.C8907RFa.CODEC_VIDEO_H264     // Catch:{ all -> 0x08a3 }
            X.RFa r3 = r10.A04     // Catch:{ all -> 0x08a3 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x08a3 }
            if (r2 == 0) goto L_0x0842
            throw r8     // Catch:{ all -> 0x08a3 }
        L_0x0889:
            X.Tie r8 = r9.A09     // Catch:{ all -> 0x08a3 }
            android.content.Context r7 = r9.A01     // Catch:{ all -> 0x08a3 }
            X.Rdm r3 = r12.A0A     // Catch:{ all -> 0x08a3 }
            X.Q0d r2 = r9.A00     // Catch:{ all -> 0x08a3 }
            r28 = r8
            r29 = r7
            r30 = r2
            r31 = r15
            r32 = r3
            r33 = r11
            r34 = r14
            r28.E42(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x08a3 }
            goto L_0x08c2
        L_0x08a3:
            r3 = move-exception
            if (r24 <= 0) goto L_0x0d86
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0d87 }
            boolean r2 = r2 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0d86
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0d87 }
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2     // Catch:{ all -> 0x0d87 }
            boolean r7 = r2.isTransient()     // Catch:{ all -> 0x0d87 }
            if (r7 != 0) goto L_0x081a
            boolean r2 = r2.isRecoverable()     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0d86
            goto L_0x081a
        L_0x08c2:
            X.SJL r2 = r9.A04     // Catch:{ all -> 0x0d87 }
            X.Tie r3 = r9.A09     // Catch:{ all -> 0x0d87 }
            java.lang.String r3 = r3.B1O()     // Catch:{ all -> 0x0d87 }
            r2.A0I = r3     // Catch:{ all -> 0x0d87 }
            X.SOn r3 = r12.A06     // Catch:{ all -> 0x0d87 }
            if (r3 == 0) goto L_0x08ee
            X.SJA r3 = r3.A0G     // Catch:{ all -> 0x0d87 }
            if (r3 == 0) goto L_0x08ee
            int r7 = r3.A03     // Catch:{ all -> 0x0d87 }
            if (r7 == r6) goto L_0x08e7
            r3 = 2
            if (r7 == r3) goto L_0x08e3
            r3 = 8
            if (r7 == r3) goto L_0x08e0
            goto L_0x08ea
        L_0x08e0:
            java.lang.String r3 = "high"
            goto L_0x08ec
        L_0x08e3:
            java.lang.String r3 = "main"
            goto L_0x08ec
        L_0x08e7:
            java.lang.String r3 = "baseline"
            goto L_0x08ec
        L_0x08ea:
            java.lang.String r3 = ""
        L_0x08ec:
            r2.A0K = r3     // Catch:{ all -> 0x0d87 }
        L_0x08ee:
            X.C349257zq.A01()     // Catch:{ all -> 0x0d87 }
            X.Ti9 r2 = r4.A07     // Catch:{ all -> 0x0d87 }
            r25 = r2
            if (r2 == 0) goto L_0x08fa
            r25.onStart()     // Catch:{ all -> 0x0d87 }
        L_0x08fa:
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0d87 }
            r8 = 1
            r2.A0U = r6     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "FbVideoResizeOperation.extractDecodeEncodeMux"
            X.C349257zq.A03(r2)     // Catch:{ all -> 0x0d87 }
            X.Q1b r24 = new X.Q1b     // Catch:{ all -> 0x0d87 }
            r24.<init>()     // Catch:{ all -> 0x0d87 }
            if (r27 != 0) goto L_0x0be2
            X.SJL r11 = r0.A03     // Catch:{ all -> 0x0cae }
            r11.getClass()     // Catch:{ all -> 0x0cae }
            r6 = 0
            r11.A0C = r6     // Catch:{ all -> 0x0cae }
            r11.A0B = r6     // Catch:{ all -> 0x0cae }
            java.util.concurrent.ExecutorService r2 = r0.A0B     // Catch:{ all -> 0x0cae }
            boolean r3 = X.DbW.A1a(r2)
            java.lang.String r2 = "ExecutorService can't be initialized twice"
            X.C266784aL.A06(r3, r2)     // Catch:{ all -> 0x0cae }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0cae }
            r2 = r53
            r9 = r20
            java.util.concurrent.ThreadPoolExecutor r2 = r2.A03(r3, r9)     // Catch:{ all -> 0x0cae }
            r0.A0B = r2     // Catch:{ all -> 0x0cae }
            X.Q4f r10 = r0.A05     // Catch:{ all -> 0x0bc9 }
            r10.getClass()     // Catch:{ all -> 0x0bc9 }
            boolean r9 = r0.A0C     // Catch:{ all -> 0x0bc9 }
            X.C7335Q4l.A00(r0, r9)     // Catch:{ all -> 0x0bc9 }
            if (r1 == 0) goto L_0x0988
            java.util.HashMap r2 = r1.A07(r5)     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0988
            java.util.HashMap r2 = r1.A07(r5)     // Catch:{ all -> 0x0bc9 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0bc9 }
            if (r2 != 0) goto L_0x0988
            X.Q4k r13 = r4.A0B     // Catch:{ all -> 0x0bc9 }
            X.RuT r12 = new X.RuT     // Catch:{ all -> 0x0bc9 }
            r12.<init>(r5, r1, r13)     // Catch:{ all -> 0x0bc9 }
            if (r22 == 0) goto L_0x095b
            r2 = r22
            X.Rp6 r2 = r2.A0F     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x095b
            r23 = 1
            goto L_0x095d
        L_0x095b:
            r23 = 0
        L_0x095d:
            java.util.List r3 = r1.A08(r5, r14)     // Catch:{ all -> 0x0bc9 }
            if (r3 == 0) goto L_0x096a
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0bc9 }
            r15 = 1
            if (r2 == 0) goto L_0x0a44
        L_0x096a:
            r15 = 0
            goto L_0x0a44
        L_0x096d:
            r3.getClass()     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r2 = r3.get(r14)     // Catch:{ all -> 0x0bc9 }
            X.4aI r2 = (X.C266754aI) r2     // Catch:{ all -> 0x0bc9 }
            boolean r2 = r2.A01(r14)     // Catch:{ all -> 0x0bc9 }
            if (r2 != 0) goto L_0x0a59
            boolean r2 = r13 instanceof X.C7967QeF     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0988
            java.util.List r2 = r12.A02     // Catch:{ all -> 0x0bc9 }
            boolean r2 = X.AnonymousClass7TE.A1b(r2)     // Catch:{ all -> 0x0bc9 }
            if (r2 != 0) goto L_0x0a59
        L_0x0988:
            int r2 = android.os.Process.myTid()     // Catch:{ all -> 0x0bc9 }
            int r23 = android.os.Process.getThreadPriority(r2)     // Catch:{ all -> 0x0bc9 }
            X.S30 r12 = r0.A0S     // Catch:{ all -> 0x0bc9 }
            java.util.concurrent.ExecutorService r2 = r0.A0B     // Catch:{ all -> 0x0bc9 }
            r36 = r2
            r36.getClass()     // Catch:{ all -> 0x0bc9 }
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0bc9 }
            r30 = r2
            r30.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Tfw r2 = r0.A08     // Catch:{ all -> 0x0bc9 }
            r34 = r2
            r34.getClass()     // Catch:{ all -> 0x0bc9 }
            java.io.File r2 = r4.A0D     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0a01
            java.lang.String r22 = r2.getPath()     // Catch:{ all -> 0x0bc9 }
            X.Q4k r3 = r4.A0B     // Catch:{ all -> 0x0bc9 }
            boolean r2 = r3 instanceof X.C7967QeF     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x09ff
            X.QeF r3 = (X.C7967QeF) r3     // Catch:{ all -> 0x0bc9 }
            com.instagram.common.session.UserSession r15 = r3.A00     // Catch:{ all -> 0x0bc9 }
            X.0Tu r13 = X.0Tu.A05     // Catch:{ all -> 0x0bc9 }
            r2 = 36316190465265742(0x8105620047104e, double:3.029843311570981E-306)
            boolean r13 = X.182.A06(r13, r15, r2)     // Catch:{ all -> 0x0bc9 }
        L_0x09c4:
            java.lang.String r3 = "video/mp4"
            r2 = r22
            java.lang.String r3 = X.Q1U.A00(r2, r3, r13)     // Catch:{ all -> 0x0bc9 }
            java.lang.String r2 = "image"
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x09ea
            android.content.Context r3 = r12.A00     // Catch:{ all -> 0x0bc9 }
            X.Tfu r5 = r12.A01     // Catch:{ all -> 0x0bc9 }
            r5.getClass()     // Catch:{ all -> 0x0bc9 }
            X.SsO r12 = new X.SsO     // Catch:{ all -> 0x0bc9 }
            r2 = r34
            r12.<init>(r3, r5, r4, r2)     // Catch:{ all -> 0x0bc9 }
        L_0x09e3:
            r0.A09 = r12     // Catch:{ all -> 0x0bc9 }
            r12.AIw(r14)     // Catch:{ all -> 0x0bc9 }
            goto L_0x0a9a
        L_0x09ea:
            java.lang.String r2 = "video"
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x0bc9 }
            if (r2 != 0) goto L_0x0a01
            java.lang.String r1 = "Cannot create DemuxDecodeWrapper. No compatible mimeType : "
            java.lang.String r2 = X.002.A0R(r1, r3)     // Catch:{ all -> 0x0bc9 }
            X.4ZS r1 = new X.4ZS     // Catch:{ all -> 0x0bc9 }
            r1.<init>(r2)     // Catch:{ all -> 0x0bc9 }
            throw r1     // Catch:{ all -> 0x0bc9 }
        L_0x09ff:
            r13 = 0
            goto L_0x09c4
        L_0x0a01:
            if (r1 == 0) goto L_0x0a23
            java.util.List r2 = r1.A08(r5, r14)     // Catch:{ all -> 0x0bc9 }
            r2.getClass()     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0bc9 }
            X.4aI r2 = (X.C266754aI) r2     // Catch:{ all -> 0x0bc9 }
            r27 = r12
            r28 = r30
            r29 = r2
            r30 = r4
            r31 = r34
            r32 = r36
            r33 = r14
            X.Tia r12 = r27.A01(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0bc9 }
            goto L_0x09e3
        L_0x0a23:
            android.content.Context r2 = r12.A00     // Catch:{ all -> 0x0bc9 }
            r15 = r2
            X.TdQ r13 = r12.A05     // Catch:{ all -> 0x0bc9 }
            X.TdI r5 = r12.A03     // Catch:{ all -> 0x0bc9 }
            X.Tfv r3 = r12.A02     // Catch:{ all -> 0x0bc9 }
            X.Tgv r2 = r12.A04     // Catch:{ all -> 0x0bc9 }
            X.Q1S r12 = new X.Q1S     // Catch:{ all -> 0x0bc9 }
            r27 = r12
            r28 = r15
            r29 = r3
            r31 = r5
            r32 = r2
            r33 = r4
            r35 = r13
            r37 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0bc9 }
            goto L_0x09e3
        L_0x0a44:
            java.lang.String r2 = "MediaTrackSegment is empty for first track"
            X.C266784aL.A06(r15, r2)     // Catch:{ all -> 0x0bc9 }
            java.util.HashMap r2 = r1.A07(r5)     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0a6a
            java.util.HashMap r2 = r1.A07(r5)     // Catch:{ all -> 0x0bc9 }
            int r2 = r2.size()     // Catch:{ all -> 0x0bc9 }
            if (r2 <= r8) goto L_0x0a6a
        L_0x0a59:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0bc9 }
            int r5 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0bc9 }
            X.Q4f r3 = r0.A05     // Catch:{ all -> 0x0bc9 }
            r3.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Q1J r2 = r0.A0K     // Catch:{ all -> 0x0bc9 }
            goto L_0x0b6b
        L_0x0a6a:
            boolean r2 = r4.A0Q     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0a96
            java.util.HashMap r2 = r1.A07(r5)     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0a96
            java.util.Iterator r22 = X.AnonymousClass7TF.A0t(r2)     // Catch:{ all -> 0x0bc9 }
        L_0x0a78:
            boolean r2 = r22.hasNext()     // Catch:{ all -> 0x0bc9 }
            if (r2 == 0) goto L_0x0a96
            java.lang.Object r2 = r22.next()     // Catch:{ all -> 0x0bc9 }
            X.4aM r2 = (X.C266794aM) r2     // Catch:{ all -> 0x0bc9 }
            java.util.List r15 = r2.A04     // Catch:{ all -> 0x0bc9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0bc9 }
            r2.<init>(r15)     // Catch:{ all -> 0x0bc9 }
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r15)     // Catch:{ all -> 0x0bc9 }
            int r2 = r2.size()     // Catch:{ all -> 0x0bc9 }
            if (r2 <= r8) goto L_0x0a78
            goto L_0x0a59
        L_0x0a96:
            if (r23 != 0) goto L_0x0a59
            goto L_0x096d
        L_0x0a9a:
            int r2 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0aa5
            X.Tia r5 = r0.A09     // Catch:{ all -> 0x0bc9 }
            r2 = r18
            r5.EKz(r2)     // Catch:{ all -> 0x0bc9 }
        L_0x0aa5:
            X.Q1J r5 = r0.A0K     // Catch:{ all -> 0x0bc9 }
            r3 = 0
        L_0x0aa8:
            X.Rdm r2 = r10.A00     // Catch:{ all -> 0x0bc9 }
            r2.getClass()     // Catch:{ all -> 0x0bc9 }
            if (r3 >= r8) goto L_0x0ac0
            java.util.Map r2 = r10.A01     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r3 = X.C51968G9o.A10(r2, r3)     // Catch:{ all -> 0x0bc9 }
            X.Tib r3 = (X.C13856Tib) r3     // Catch:{ all -> 0x0bc9 }
            if (r3 == 0) goto L_0x0abe
            r2 = r23
            r3.EwY(r5, r2)     // Catch:{ all -> 0x0bc9 }
        L_0x0abe:
            r3 = 1
            goto L_0x0aa8
        L_0x0ac0:
            X.Tia r2 = r0.A09     // Catch:{ all -> 0x0bc9 }
            r2.start()     // Catch:{ all -> 0x0bc9 }
            if (r1 == 0) goto L_0x0af0
            java.util.Map r3 = r10.A01     // Catch:{ all -> 0x0bc9 }
            r2 = r26
            java.lang.Object r2 = X.Pxe.A0r(r2, r3)     // Catch:{ all -> 0x0bc9 }
            X.Tib r2 = (X.C13856Tib) r2     // Catch:{ all -> 0x0bc9 }
            r2.AAZ(r14)     // Catch:{ all -> 0x0bc9 }
            X.Q4f r2 = r0.A05     // Catch:{ all -> 0x0bc9 }
            r2.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Ss6 r5 = new X.Ss6     // Catch:{ all -> 0x0bc9 }
            r5.<init>(r2)     // Catch:{ all -> 0x0bc9 }
            X.Q4f r2 = r0.A05     // Catch:{ all -> 0x0bc9 }
            r2.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Ss4 r3 = new X.Ss4     // Catch:{ all -> 0x0bc9 }
            r3.<init>(r2)     // Catch:{ all -> 0x0bc9 }
            X.Q4k r2 = r4.A0B     // Catch:{ all -> 0x0bc9 }
            X.QeB r1 = X.SPy.A01(r1, r3, r5, r2)     // Catch:{ all -> 0x0bc9 }
            r0.A07 = r1     // Catch:{ all -> 0x0bc9 }
        L_0x0af0:
            boolean r1 = r0.A0T     // Catch:{ all -> 0x0bc9 }
            if (r1 != 0) goto L_0x0baf
            X.C7335Q4l.A00(r0, r9)     // Catch:{ all -> 0x0bc9 }
            java.lang.String r1 = "FbVideoResizeOperation.decoderLoop()"
            X.C349257zq.A03(r1)     // Catch:{ all -> 0x0bc9 }
            java.lang.String r1 = "FbVideoResizeOperation.decodeFrameAndAdvance()"
            X.C349257zq.A03(r1)     // Catch:{ all -> 0x0bc9 }
            X.Tia r1 = r0.A09     // Catch:{ all -> 0x0bc9 }
            long r1 = r1.ANt()     // Catch:{ all -> 0x0bc9 }
            X.Tia r3 = r0.A09     // Catch:{ all -> 0x0bc9 }
            boolean r5 = r3.CRE()     // Catch:{ all -> 0x0bc9 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0bc9 }
            X.Q14 r3 = r0.A07     // Catch:{ all -> 0x0bc9 }
            if (r3 == 0) goto L_0x0b17
            r3.A01(r1)     // Catch:{ all -> 0x0bc9 }
        L_0x0b17:
            java.lang.String r3 = "FbVideoResizeOperation.renderAndDisplayFrame()"
            X.C349257zq.A03(r3)     // Catch:{ all -> 0x0bc9 }
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0b23
            r10.A02(r1)     // Catch:{ all -> 0x0bc9 }
        L_0x0b23:
            X.C349257zq.A01()     // Catch:{ all -> 0x0bc9 }
            java.lang.String r1 = "FbVideoResizeOperation.probablyEncode()"
            X.C349257zq.A03(r1)     // Catch:{ all -> 0x0bc9 }
            if (r5 == 0) goto L_0x0b5c
            r2 = 0
        L_0x0b2e:
            X.Rdm r1 = r10.A00     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            if (r2 >= r8) goto L_0x0b45
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r1 = X.C51968G9o.A10(r1, r2)     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Tib r1 = (X.C13856Tib) r1     // Catch:{ all -> 0x0bc9 }
            r1.flush()     // Catch:{ all -> 0x0bc9 }
            r2 = 1
            goto L_0x0b2e
        L_0x0b45:
            r2 = 0
        L_0x0b46:
            X.Rdm r1 = r10.A00     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            if (r2 >= r8) goto L_0x0b5c
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r1 = X.C51968G9o.A10(r1, r2)     // Catch:{ all -> 0x0bc9 }
            X.Tib r1 = (X.C13856Tib) r1     // Catch:{ all -> 0x0bc9 }
            if (r1 == 0) goto L_0x0b5a
            r1.Evd()     // Catch:{ all -> 0x0bc9 }
        L_0x0b5a:
            r2 = 1
            goto L_0x0b46
        L_0x0b5c:
            boolean r1 = r10.A03()     // Catch:{ all -> 0x0bc9 }
            if (r1 != 0) goto L_0x0baf
            X.C349257zq.A01()     // Catch:{ all -> 0x0bc9 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0bc9 }
            if (r5 != 0) goto L_0x0baf
            goto L_0x0af0
        L_0x0b6b:
            r6 = 0
        L_0x0b6c:
            X.Rdm r1 = r3.A00     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            if (r6 >= r8) goto L_0x0b82
            java.util.Map r1 = r3.A01     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r1 = X.C51968G9o.A10(r1, r6)     // Catch:{ all -> 0x0bc9 }
            X.Tib r1 = (X.C13856Tib) r1     // Catch:{ all -> 0x0bc9 }
            if (r1 == 0) goto L_0x0b80
            r1.EwY(r2, r5)     // Catch:{ all -> 0x0bc9 }
        L_0x0b80:
            r6 = 1
            goto L_0x0b6c
        L_0x0b82:
            X.S30 r6 = r0.A0S     // Catch:{ all -> 0x0bc9 }
            X.SJL r5 = r0.A03     // Catch:{ all -> 0x0bc9 }
            r5.getClass()     // Catch:{ all -> 0x0bc9 }
            X.Q4f r3 = r0.A05     // Catch:{ all -> 0x0bc9 }
            X.Tfw r2 = r0.A08     // Catch:{ all -> 0x0bc9 }
            java.lang.String r1 = "mVideoTranscoder is null only when both isSkipVideoTrack and enableAVSynchronizedTranscoding are true"
            X.0JA.A03(r2, r1)     // Catch:{ all -> 0x0bc9 }
            X.SOl r1 = new X.SOl     // Catch:{ all -> 0x0bc9 }
            r27 = r1
            r28 = r53
            r29 = r52
            r30 = r5
            r31 = r3
            r32 = r4
            r33 = r2
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0bc9 }
            r0.A06 = r1     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            r1.A01()     // Catch:{ all -> 0x0bc9 }
        L_0x0baf:
            X.C7335Q4l.A00(r0, r9)     // Catch:{ all -> 0x0bc9 }
            r2 = 0
        L_0x0bb3:
            X.Rdm r1 = r10.A00     // Catch:{ all -> 0x0bc9 }
            r1.getClass()     // Catch:{ all -> 0x0bc9 }
            if (r2 >= r8) goto L_0x0be0
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0bc9 }
            java.lang.Object r1 = X.C51968G9o.A10(r1, r2)     // Catch:{ all -> 0x0bc9 }
            X.Tib r1 = (X.C13856Tib) r1     // Catch:{ all -> 0x0bc9 }
            if (r1 == 0) goto L_0x0bc7
            r1.FNG()     // Catch:{ all -> 0x0bc9 }
        L_0x0bc7:
            r2 = 1
            goto L_0x0bb3
        L_0x0bc9:
            r2 = move-exception
            X.Tia r1 = r0.A09     // Catch:{ all -> 0x0cae }
            if (r1 == 0) goto L_0x0bd1
            r1.cancel()     // Catch:{ all -> 0x0cae }
        L_0x0bd1:
            boolean r1 = r2 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0cae }
            if (r1 == 0) goto L_0x0bdf
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x0cae }
            if (r1 == 0) goto L_0x0bdf
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0cae }
        L_0x0bdf:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0be0:
            r11.A0T = r8     // Catch:{ all -> 0x0cae }
        L_0x0be2:
            android.media.MediaFormat r1 = r0.A02     // Catch:{ all -> 0x0cae }
            if (r1 == 0) goto L_0x0ca1
            X.SJL r6 = r0.A03     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            X.Q4f r3 = r0.A05     // Catch:{ all -> 0x0cae }
            r3.getClass()     // Catch:{ all -> 0x0cae }
            X.Tig r9 = r0.A04     // Catch:{ all -> 0x0cae }
            r9.getClass()     // Catch:{ all -> 0x0cae }
            r1 = 0
            r6.A08 = r1     // Catch:{ all -> 0x0cae }
            r6.A0S = r8     // Catch:{ all -> 0x0cae }
            X.4aE r2 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0cae }
            r1 = -1
            r9.ELE(r2, r1)     // Catch:{ all -> 0x0cae }
            boolean r7 = r0.A0C     // Catch:{ all -> 0x0cae }
            X.C7335Q4l.A00(r0, r7)     // Catch:{ all -> 0x0cae }
            java.util.Map r5 = r3.A02     // Catch:{ all -> 0x0cae }
            r1 = r26
            java.lang.Object r3 = X.Pxe.A0r(r1, r5)     // Catch:{ all -> 0x0cae }
            X.Q4j r3 = (X.C7333Q4j) r3     // Catch:{ all -> 0x0cae }
            boolean r1 = r3.A06     // Catch:{ all -> 0x0cae }
            if (r1 != 0) goto L_0x0c28
            android.media.MediaFormat r1 = r0.A02     // Catch:{ all -> 0x0cae }
            r1.getClass()     // Catch:{ all -> 0x0cae }
            r3.A03 = r1     // Catch:{ all -> 0x0cae }
            r6.A0O = r8     // Catch:{ all -> 0x0cae }
            r3.start()     // Catch:{ all -> 0x0cae }
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0cae }
            java.lang.String r1 = r3.BVE()     // Catch:{ all -> 0x0cae }
            r2.A0J = r1     // Catch:{ all -> 0x0cae }
        L_0x0c28:
            X.Sri r3 = new X.Sri     // Catch:{ all -> 0x0cae }
            r3.<init>()     // Catch:{ all -> 0x0cae }
            boolean r1 = r54.Erg()     // Catch:{ all -> 0x0cae }
            if (r1 == 0) goto L_0x0c57
            android.media.MediaFormat r1 = r9.BpC()     // Catch:{ all -> 0x0cae }
            r1.getClass()     // Catch:{ all -> 0x0cae }
            X.C9607Rdl.A00(r1, r3)     // Catch:{ all -> 0x0cae }
            X.C7335Q4l.A00(r0, r7)     // Catch:{ all -> 0x0cae }
            r1 = r26
            java.lang.Object r1 = X.Pxe.A0r(r1, r5)     // Catch:{ all -> 0x0cae }
            X.Q4j r1 = (X.C7333Q4j) r1     // Catch:{ all -> 0x0cae }
            r1.FNk(r3)     // Catch:{ Exception -> 0x0c4c }
            goto L_0x0c57
        L_0x0c4c:
            X.SJL r10 = r0.A03     // Catch:{ all -> 0x0cae }
            r10.getClass()     // Catch:{ all -> 0x0cae }
            long r1 = r10.A08     // Catch:{ all -> 0x0cae }
            long r1 = r1 + r16
            r10.A08 = r1     // Catch:{ all -> 0x0cae }
        L_0x0c57:
            r11 = 1
        L_0x0c58:
            X.C7335Q4l.A00(r0, r7)     // Catch:{ all -> 0x0cae }
            java.nio.ByteBuffer r1 = r3.A00     // Catch:{ all -> 0x0cae }
            int r29 = r9.E6i(r1)     // Catch:{ all -> 0x0cae }
            long r1 = r9.BpD()     // Catch:{ all -> 0x0cae }
            if (r29 <= 0) goto L_0x0ca1
            int r32 = r9.BpB()     // Catch:{ all -> 0x0cae }
            r27 = r3
            r28 = r14
            r30 = r1
            r27.EQ8(r28, r29, r30, r32)     // Catch:{ all -> 0x0cae }
            if (r11 == 0) goto L_0x0c7b
            r6.A03 = r1     // Catch:{ all -> 0x0cae }
            r6.A0Q = r8     // Catch:{ all -> 0x0cae }
            r11 = 0
        L_0x0c7b:
            r6.A06 = r1     // Catch:{ all -> 0x0cae }
            r51.getClass()     // Catch:{ all -> 0x0cae }
            r1 = r26
            java.lang.Object r1 = X.Pxe.A0r(r1, r5)     // Catch:{ all -> 0x0cae }
            X.Q4j r1 = (X.C7333Q4j) r1     // Catch:{ all -> 0x0cae }
            r1.FNk(r3)     // Catch:{ Exception -> 0x0c8c }
            goto L_0x0c97
        L_0x0c8c:
            X.SJL r10 = r0.A03     // Catch:{ all -> 0x0cae }
            r10.getClass()     // Catch:{ all -> 0x0cae }
            long r1 = r10.A08     // Catch:{ all -> 0x0cae }
            long r1 = r1 + r16
            r10.A08 = r1     // Catch:{ all -> 0x0cae }
        L_0x0c97:
            long r1 = r6.A09     // Catch:{ all -> 0x0cae }
            long r1 = r1 + r16
            r6.A09 = r1     // Catch:{ all -> 0x0cae }
            r9.AAt()     // Catch:{ all -> 0x0cae }
            goto L_0x0c58
        L_0x0ca1:
            boolean r1 = r0.A0T     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0d0f
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            r1.getClass()     // Catch:{ all -> 0x0d87 }
            r1.A01()     // Catch:{ all -> 0x0d87 }
            goto L_0x0d17
        L_0x0cae:
            r5 = move-exception
            r1 = r24
            X.C7254Q1b.A00(r1, r5)     // Catch:{ all -> 0x0cb5 }
            goto L_0x0cb8
        L_0x0cb5:
            r2 = move-exception
            r3 = 0
            goto L_0x0ce6
        L_0x0cb8:
            r3 = 1
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0ce5 }
            r2.getClass()     // Catch:{ all -> 0x0ce5 }
            java.lang.String r1 = r5.getMessage()     // Catch:{ all -> 0x0ce5 }
            r2.A0L = r1     // Catch:{ all -> 0x0ce5 }
            java.lang.Throwable r1 = r5.getCause()     // Catch:{ all -> 0x0ce5 }
            if (r1 == 0) goto L_0x0cd9
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0ce5 }
            r2.getClass()     // Catch:{ all -> 0x0ce5 }
            java.lang.Throwable r1 = r5.getCause()     // Catch:{ all -> 0x0ce5 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0ce5 }
            r2.A0N = r1     // Catch:{ all -> 0x0ce5 }
        L_0x0cd9:
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0ce5 }
            r2.getClass()     // Catch:{ all -> 0x0ce5 }
            java.lang.String r1 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x0ce5 }
            r2.A0M = r1     // Catch:{ all -> 0x0ce5 }
            goto L_0x0d0f
        L_0x0ce5:
            r2 = move-exception
        L_0x0ce6:
            boolean r1 = r0.A0T     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0cf5
            if (r3 != 0) goto L_0x0cf5
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            r1.getClass()     // Catch:{ all -> 0x0d87 }
            r1.A01()     // Catch:{ all -> 0x0d87 }
            goto L_0x0d2e
        L_0x0cf5:
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            r1.getClass()     // Catch:{ all -> 0x0d87 }
            r1.A00()     // Catch:{ all -> 0x0d87 }
            goto L_0x0d2e
        L_0x0cfe:
            r3 = move-exception
            java.lang.String r1 = "Failed to init codecs to resize video"
            X.Qds r2 = new X.Qds     // Catch:{ all -> 0x0d87 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d2e
        L_0x0d07:
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r1 = r28
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d2e
        L_0x0d0f:
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            r1.getClass()     // Catch:{ all -> 0x0d87 }
            r1.A00()     // Catch:{ all -> 0x0d87 }
        L_0x0d17:
            r24.A01()     // Catch:{ all -> 0x0d87 }
            X.C349257zq.A01()     // Catch:{ all -> 0x0d87 }
            boolean r1 = r0.A0T     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0d2f
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            boolean r1 = r1.A03     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0d2f
            java.lang.String r1 = "Last segment is not produced"
            X.4ZS r2 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r2.<init>(r1)     // Catch:{ all -> 0x0d87 }
        L_0x0d2e:
            throw r2     // Catch:{ all -> 0x0d87 }
        L_0x0d2f:
            r1 = r55
            X.C7335Q4l.A00(r0, r1)     // Catch:{ all -> 0x0d87 }
            if (r25 == 0) goto L_0x0d41
            boolean r1 = r0.A0T     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0d46
            X.SJL r2 = r0.A03     // Catch:{ all -> 0x0d87 }
            r1 = r25
            r1.D0g(r2)     // Catch:{ all -> 0x0d87 }
        L_0x0d41:
            X.C349257zq.A01()     // Catch:{ all -> 0x0d87 }
            goto L_0x0dd8
        L_0x0d46:
            X.Q1J r5 = r0.A0K     // Catch:{ all -> 0x0d87 }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = r20
            r5.A00(r3, r1)     // Catch:{ all -> 0x0d87 }
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0d87 }
            java.util.List r2 = r1.A0J     // Catch:{ all -> 0x0d87 }
            r1 = r25
            r1.D5E(r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d41
        L_0x0d59:
            r3 = move-exception
            r5.A05()     // Catch:{ all -> 0x0d77 }
            goto L_0x0d7b
        L_0x0d5e:
            java.lang.String r1 = "No data source provided"
            X.Qe3 r3 = new X.Qe3     // Catch:{ all -> 0x0d87 }
            r3.<init>(r1)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d86
        L_0x0d66:
            r3 = move-exception
            java.lang.Class<X.Q4l> r2 = X.C7335Q4l.class
            java.lang.String r1 = "audio transcode pipeline err"
            X.0KC.A05(r2, r1, r3)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d86
        L_0x0d6f:
            java.lang.String r1 = "Failed to transcode audio stream."
            X.4ZS r3 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r3.<init>(r1)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d86
        L_0x0d77:
            r1 = move-exception
            X.C7254Q1b.A00(r8, r1)     // Catch:{ all -> 0x0d87 }
        L_0x0d7b:
            java.lang.Throwable r2 = r8.A01     // Catch:{ all -> 0x0d87 }
            if (r2 == 0) goto L_0x0d86
            X.4ZS r3 = new X.4ZS     // Catch:{ all -> 0x0d87 }
            r1 = r28
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0d87 }
        L_0x0d86:
            throw r3     // Catch:{ all -> 0x0d87 }
        L_0x0d87:
            r5 = move-exception
            boolean r1 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0dec }
            if (r1 == 0) goto L_0x0da6
            boolean r1 = r0.A0C     // Catch:{ all -> 0x0dec }
            if (r1 == 0) goto L_0x0d97
            X.Q4f r1 = r0.A05     // Catch:{ all -> 0x0dec }
            if (r1 == 0) goto L_0x0d97
            r1.A00()     // Catch:{ all -> 0x0dec }
        L_0x0d97:
            X.Ti9 r2 = r4.A07     // Catch:{ all -> 0x0dec }
            if (r2 == 0) goto L_0x0da0
            X.SJL r1 = r0.A03     // Catch:{ all -> 0x0dec }
            r2.D0g(r1)     // Catch:{ all -> 0x0dec }
        L_0x0da0:
            r1 = r21
            A01(r1, r0)     // Catch:{ Exception -> 0x0df3 }
            goto L_0x0e05
        L_0x0da6:
            boolean r1 = r5 instanceof X.AnonymousClass4ZS     // Catch:{ all -> 0x0dec }
            if (r1 == 0) goto L_0x0dc5
            X.4ZS r5 = (X.AnonymousClass4ZS) r5     // Catch:{ all -> 0x0dec }
        L_0x0dac:
            X.SJL r3 = r0.A03     // Catch:{ all -> 0x0dec }
            java.lang.Class<X.Q4l> r2 = X.C7335Q4l.class
            java.lang.String r1 = "Exception"
            X.0KC.A05(r2, r1, r5)     // Catch:{ all -> 0x0dec }
            r5.getMessage()     // Catch:{ all -> 0x0dec }
            X.Ti9 r1 = r4.A07     // Catch:{ all -> 0x0dec }
            if (r1 == 0) goto L_0x0dbf
            r1.DDE(r3, r5)     // Catch:{ all -> 0x0dec }
        L_0x0dbf:
            r1 = r21
            X.C7254Q1b.A00(r1, r5)     // Catch:{ all -> 0x0dec }
            goto L_0x0dd8
        L_0x0dc5:
            java.lang.String r3 = "Failed to resize video ("
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x0dec }
            java.lang.String r1 = ")"
            java.lang.String r2 = X.002.A0g(r3, r2, r1)     // Catch:{ all -> 0x0dec }
            X.4ZS r1 = new X.4ZS     // Catch:{ all -> 0x0dec }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0dec }
            r5 = r1
            goto L_0x0dac
        L_0x0dd8:
            r1 = r21
            A01(r1, r0)     // Catch:{ Exception -> 0x0df3 }
            java.lang.Throwable r2 = r1.A01     // Catch:{ Exception -> 0x0df3 }
            if (r2 == 0) goto L_0x0e05
            boolean r0 = r2 instanceof X.AnonymousClass4ZS     // Catch:{ Exception -> 0x0df3 }
            if (r0 != 0) goto L_0x0df2
            X.4ZS r0 = new X.4ZS     // Catch:{ Exception -> 0x0df3 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0df3 }
            r2 = r0
            goto L_0x0df2
        L_0x0dec:
            r2 = move-exception
            r1 = r21
            A01(r1, r0)     // Catch:{ Exception -> 0x0df3 }
        L_0x0df2:
            throw r2     // Catch:{ Exception -> 0x0df3 }
        L_0x0df3:
            r3 = move-exception
            r0 = r56
            X.Rs3 r0 = r0.A01
            X.TdF r2 = r0.A00
            java.lang.String r1 = "videolite-transcoder"
            java.lang.String r0 = "resizeOperation failed"
            if (r2 == 0) goto L_0x0e05
            r2.Chx(r3, r1, r0)
        L_0x0e05:
            r0 = r56
            X.Sr7 r1 = r0.A00
            java.util.concurrent.CountDownLatch r0 = r1.A00
            r0.countDown()
            r0 = 0
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL9.run():void");
    }
}
