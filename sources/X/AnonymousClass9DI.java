package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* renamed from: X.9DI  reason: invalid class name */
public final class AnonymousClass9DI {
    public static final C258483z9 A02 = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(2));
    public static final 1QU A03;
    public static final 1QU A04;
    public final AnonymousClass9DG A00;
    public volatile AnonymousClass9DH A01;

    static {
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        1CE r2 = 1CE.A08;
        r1.A04 = r2;
        r1.A03 = 1Fe.A03;
        A03 = r1.A00();
        AnonymousClass1QT r12 = new AnonymousClass1QT();
        r12.A04 = r2;
        r12.A03 = 1Fe.A02;
        A04 = r12.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r2 = r1.A03();
        r11 = X.002.A0R(r2, ".tmp");
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:87:0x0132=Splitter:B:87:0x0132, B:59:0x00cf=Splitter:B:59:0x00cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9DP A00(X.AnonymousClass3JY r16, X.AnonymousClass9DI r17) {
        /*
            r2 = r16
            java.lang.String r1 = r2.A02     // Catch:{ IOException -> 0x01bb }
            r6 = 0
            X.0cp.A03(r1)     // Catch:{ IOException -> 0x01bb }
            X.16e r0 = X.AnonymousClass2hY.A09     // Catch:{ IOException -> 0x01bb }
            X.2hY r5 = r0.E1h(r1)     // Catch:{ IOException -> 0x01bb }
            java.util.concurrent.atomic.AtomicInteger r0 = X.C293755lI.A01     // Catch:{ IOException -> 0x01bb }
            int r4 = r0.getAndIncrement()     // Catch:{ IOException -> 0x01bb }
            java.lang.String r7 = r2.A01     // Catch:{ IOException -> 0x01bb }
            X.02m r3 = X.C293755lI.A00     // Catch:{ IOException -> 0x01bb }
            if (r3 == 0) goto L_0x0025
            r1 = 38797316(0x2500004, float:1.5281431E-37)
            r3.markerStart(r1, r4)     // Catch:{ IOException -> 0x01bb }
            java.lang.String r0 = "File Downloaded"
            r3.markerAnnotate(r1, r0, r7)     // Catch:{ IOException -> 0x01bb }
        L_0x0025:
            r16 = 0
            X.14G r1 = X.14G.A03()     // Catch:{ Exception -> 0x01a9 }
            X.1QU r0 = A03     // Catch:{ Exception -> 0x01a9 }
            X.47Y r5 = r1.A08(r0, r5, r6)     // Catch:{ Exception -> 0x01a9 }
            if (r3 == 0) goto L_0x003a
            r1 = 38797316(0x2500004, float:1.5281431E-37)
            r0 = 2
            r3.markerEnd(r1, r4, r0)     // Catch:{ all -> 0x019f }
        L_0x003a:
            X.1Qb r0 = r5.A02     // Catch:{ all -> 0x019f }
            java.io.InputStream r15 = r0.AjD()     // Catch:{ all -> 0x019f }
            r0.AJg()     // Catch:{ all -> 0x019f }
            r0 = r17
            X.9DG r1 = r0.A00     // Catch:{ all -> 0x019f }
            java.lang.String r8 = r2.A00     // Catch:{ all -> 0x019f }
            boolean r14 = r2.A03     // Catch:{ all -> 0x019f }
            X.9DF r1 = (X.AnonymousClass9DF) r1     // Catch:{ all -> 0x019f }
            X.9DN r12 = r1.A01()     // Catch:{ all -> 0x019f }
            if (r12 == 0) goto L_0x0198
            java.lang.String r2 = r1.A03()     // Catch:{ all -> 0x019f }
            java.lang.String r0 = ".tmp"
            java.lang.String r11 = X.002.A0R(r2, r0)     // Catch:{ all -> 0x019f }
            java.io.File r10 = r12.CNS(r11)     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x0198
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0130 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0130 }
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0126 }
            r13.<init>(r9)     // Catch:{ all -> 0x0126 }
            X.1W7.A00(r15, r13)     // Catch:{ all -> 0x011c }
            r13.flush()     // Catch:{ all -> 0x011c }
            java.io.FileDescriptor r0 = r9.getFD()     // Catch:{ all -> 0x011c }
            r0.sync()     // Catch:{ all -> 0x011c }
            r13.close()     // Catch:{ all -> 0x0126 }
            r9.close()     // Catch:{ IOException -> 0x0130 }
            java.io.File r6 = r12.CNS(r2)     // Catch:{ all -> 0x019f }
            if (r6 != 0) goto L_0x0089
            r6 = 0
            goto L_0x0152
        L_0x0089:
            if (r14 == 0) goto L_0x00cf
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0111 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r15 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
        L_0x009a:
            int r13 = r9.read(r14)     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
            if (r13 <= 0) goto L_0x00a5
            r0 = 0
            r15.update(r14, r0, r13)     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
            goto L_0x009a
        L_0x00a5:
            byte[] r0 = r15.digest()     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
            java.lang.String r0 = X.0JX.A01(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00b7, UnsupportedEncodingException -> 0x00be }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00c5 }
            r9.close()     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0111
            goto L_0x00cf
        L_0x00b7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c5 }
        L_0x00c4:
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0111 }
        L_0x00ce:
            throw r1     // Catch:{ IOException -> 0x0111 }
        L_0x00cf:
            boolean r0 = r10.renameTo(r6)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0111
            X.9DJ r9 = r1.A02()     // Catch:{ all -> 0x019f }
            android.content.SharedPreferences r0 = r9.A01     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x00e8
            android.content.Context r2 = r9.A00     // Catch:{ all -> 0x019f }
            r1 = 0
            java.lang.String r0 = "asset_preferences"
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)     // Catch:{ all -> 0x019f }
            r9.A01 = r0     // Catch:{ all -> 0x019f }
        L_0x00e8:
            android.content.SharedPreferences$Editor r10 = r0.edit()     // Catch:{ all -> 0x019f }
            X.95S r0 = r9.A03     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x0102
            java.lang.String r2 = "md5"
            X.95S r1 = X.AnonymousClass95R.A04     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r9.A04     // Catch:{ all -> 0x019f }
            X.95T r0 = r1.A00(r0)     // Catch:{ all -> 0x019f }
            X.95T r0 = r0.A00(r2)     // Catch:{ all -> 0x019f }
            X.95S r0 = (X.AnonymousClass95S) r0     // Catch:{ all -> 0x019f }
            r9.A03 = r0     // Catch:{ all -> 0x019f }
        L_0x0102:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019f }
            android.content.SharedPreferences$Editor r0 = r10.putString(r0, r8)     // Catch:{ all -> 0x019f }
            r0.apply()     // Catch:{ all -> 0x019f }
            r9.A00(r6)     // Catch:{ all -> 0x019f }
            goto L_0x0152
        L_0x0111:
            java.lang.Class<X.9DF> r1 = X.AnonymousClass9DF.class
            java.lang.String r0 = "Unable to copy temp file to new location"
            X.0KC.A04(r1, r0)     // Catch:{ all -> 0x019f }
            r12.remove(r2)     // Catch:{ all -> 0x019f }
            goto L_0x0152
        L_0x011c:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x0126 }
        L_0x0125:
            throw r1     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x012b }
            goto L_0x012f
        L_0x012b:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0130 }
        L_0x012f:
            throw r1     // Catch:{ IOException -> 0x0130 }
        L_0x0130:
            r10 = move-exception
            r1 = r10
        L_0x0132:
            boolean r0 = r1 instanceof com.facebook.tigon.TigonErrorException     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x0152
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x019f }
            if (r1 != 0) goto L_0x0132
            java.lang.Class<X.9DF> r9 = X.AnonymousClass9DF.class
            java.lang.String r2 = "Unable to copy stream to temp file"
            X.0I2 r1 = X.0KC.A01     // Catch:{ all -> 0x019f }
            r0 = 6
            boolean r0 = r1.isLoggable(r0)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0152
            X.0I2 r1 = X.0KC.A01     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r9.getSimpleName()     // Catch:{ all -> 0x019f }
            r1.wtf(r0, r2, r10)     // Catch:{ all -> 0x019f }
        L_0x0152:
            r12.remove(r11)     // Catch:{ all -> 0x019f }
            if (r6 == 0) goto L_0x0198
            boolean r0 = r6.isFile()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0198
            r0 = r17
            X.9DH r9 = r0.A01     // Catch:{ all -> 0x019f }
            if (r9 == 0) goto L_0x0191
            X.9DF r1 = r9.A01     // Catch:{ all -> 0x019f }
            boolean r0 = r1 instanceof X.AnonymousClass9DE     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0175
            X.9DE r1 = (X.AnonymousClass9DE) r1     // Catch:{ all -> 0x019f }
            X.2h0 r0 = r1.A03     // Catch:{ all -> 0x019f }
        L_0x016d:
            java.lang.Object r2 = r0.AJs(r6)     // Catch:{ all -> 0x019f }
            java.util.concurrent.atomic.AtomicReference r1 = r9.A03     // Catch:{ all -> 0x019f }
            monitor-enter(r1)     // Catch:{ all -> 0x019f }
            goto L_0x017a
        L_0x0175:
            X.9b5 r1 = (X.C381049b5) r1     // Catch:{ all -> 0x019f }
            X.2h0 r0 = r1.A03     // Catch:{ all -> 0x019f }
            goto L_0x016d
        L_0x017a:
            r1.set(r2)     // Catch:{ all -> 0x0187 }
            r0 = 2
            r9.A05 = r0     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            X.C61940qJ.A00(r9)     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x0191
            goto L_0x018a
        L_0x0187:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r0     // Catch:{ all -> 0x019f }
        L_0x018a:
            X.B14 r0 = r9.A00     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0191
            r0.DFT(r2)     // Catch:{ all -> 0x019f }
        L_0x0191:
            r1 = 0
            X.9DP r0 = new X.9DP     // Catch:{ all -> 0x019f }
            r0.<init>(r6, r7, r8, r1)     // Catch:{ all -> 0x019f }
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            r16 = r0
            r5.close()     // Catch:{ Exception -> 0x01a9 }
            return r16
        L_0x019f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ Exception -> 0x01a9 }
        L_0x01a8:
            throw r1     // Catch:{ Exception -> 0x01a9 }
        L_0x01a9:
            r2 = move-exception
            java.lang.String r1 = "RasDownloader"
            java.lang.String r0 = "Download failed."
            X.0wb.A06(r1, r0, r2)     // Catch:{ IOException -> 0x01bb }
            if (r3 == 0) goto L_0x01ba
            r1 = 38797316(0x2500004, float:1.5281431E-37)
            r0 = 3
            r3.markerEnd(r1, r4, r0)     // Catch:{ IOException -> 0x01bb }
        L_0x01ba:
            return r16
        L_0x01bb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DI.A00(X.3JY, X.9DI):X.9DP");
    }

    public AnonymousClass9DI(AnonymousClass9DF r1) {
        this.A00 = r1;
    }
}
