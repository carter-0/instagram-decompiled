package X;

/* renamed from: X.RTg  reason: case insensitive filesystem */
public abstract class C9203RTg {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.Tc9] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Tc1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, X.Tc9] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.Tf9] */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.TlH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.TfB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v45, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.lang.Object, X.Tf9] */
    /* JADX WARNING: type inference failed for: r0v60, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v61, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v69, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v70, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.Object, X.Tc7] */
    /* JADX WARNING: type inference failed for: r0v75, types: [java.lang.Object, X.Tf9] */
    /* JADX WARNING: type inference failed for: r0v78, types: [X.TcA] */
    /* JADX WARNING: type inference failed for: r3v10, types: [X.TcA] */
    /* JADX WARNING: type inference failed for: r0v80, types: [java.lang.Object, X.Tc9] */
    /* JADX WARNING: type inference failed for: r0v89, types: [X.TfB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r29v2, types: [X.Shu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11044S7e A00(X.SUv r33, java.util.List r34) {
        /*
            r0 = r33
            X.Thg r14 = r0.A01
            X.ST0 r15 = r0.A02
            X.Q6I r0 = r0.A00
            android.content.Context r13 = r0.getApplicationContext()
            X.Rnj r2 = r0.A02
            X.S7e r12 = new X.S7e
            r12.<init>()
            java.lang.Class<byte[]> r33 = byte[].class
            X.She r0 = new X.She
            r0.<init>()
            X.Rns r3 = r12.A04
            monitor-enter(r3)
            java.util.List r1 = r3.A00     // Catch:{ all -> 0x035a }
            r1.add(r0)     // Catch:{ all -> 0x035a }
            monitor-exit(r3)
            X.Shd r0 = new X.Shd
            r0.<init>()
            monitor-enter(r3)
            r1.add(r0)     // Catch:{ all -> 0x035a }
            monitor-exit(r3)
            android.content.res.Resources r11 = r13.getResources()
            java.util.List r32 = r12.A01()
            X.Si4 r31 = new X.Si4
            r1 = r31
            r0 = r32
            r1.<init>(r13, r14, r15, r0)
            X.RTo r0 = X.Si6.A06
            X.Sjp r1 = new X.Sjp
            r1.<init>()
            X.Si6 r30 = new X.Si6
            r0 = r30
            r0.<init>(r14, r1)
            X.SJ8 r0 = X.C11416SSr.A05
            java.util.List r1 = r12.A01()
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()
            X.SSr r3 = new X.SSr
            r3.<init>(r0, r14, r15, r1)
            java.lang.Class<X.RTc> r1 = X.C9199RTc.class
            java.util.Map r0 = r2.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00da
            X.Shu r29 = new X.Shu
            r29.<init>()
            X.Sht r1 = new X.Sht
            r1.<init>()
        L_0x006f:
            java.lang.String r28 = "Animation"
            java.lang.Class<java.io.InputStream> r10 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.Drawable> r9 = android.graphics.drawable.Drawable.class
            X.Rr3 r4 = new X.Rr3
            r0 = r32
            r4.<init>(r15, r0)
            X.Shx r2 = new X.Shx
            r2.<init>(r4)
            r0 = r28
            r12.A03(r2, r10, r9, r0)
            java.lang.Class<java.nio.ByteBuffer> r8 = java.nio.ByteBuffer.class
            X.Rr3 r4 = new X.Rr3
            r0 = r32
            r4.<init>(r15, r0)
            X.Shw r2 = new X.Shw
            r2.<init>(r4)
            r0 = r28
            r12.A03(r2, r8, r9, r0)
            X.Si5 r27 = new X.Si5
            r0 = r27
            r0.<init>(r13)
            X.SjU r26 = new X.SjU
            r0 = r26
            r0.<init>(r11)
            X.SjV r25 = new X.SjV
            r0 = r25
            r0.<init>(r11)
            X.SjT r24 = new X.SjT
            r0 = r24
            r0.<init>(r11)
            X.SjS r23 = new X.SjS
            r0 = r23
            r0.<init>(r11)
            X.Si9 r18 = new X.Si9
            r0 = r18
            r0.<init>(r15)
            X.Sjr r22 = new X.Sjr
            r22.<init>()
            X.Sjq r21 = new X.Sjq
            r21.<init>()
            android.content.ContentResolver r20 = r13.getContentResolver()
            X.Shb r2 = new X.Shb
            r2.<init>()
            X.Rnr r5 = r12.A03
            monitor-enter(r5)
            goto L_0x00e7
        L_0x00da:
            X.Shs r1 = new X.Shs
            r1.<init>(r3)
            X.Si1 r29 = new X.Si1
            r0 = r29
            r0.<init>(r15, r3)
            goto L_0x006f
        L_0x00e7:
            java.util.List r4 = r5.A00     // Catch:{ all -> 0x0357 }
            X.Rr6 r0 = new X.Rr6     // Catch:{ all -> 0x0357 }
            r0.<init>(r2, r8)     // Catch:{ all -> 0x0357 }
            r4.add(r0)     // Catch:{ all -> 0x0357 }
            monitor-exit(r5)
            X.Shc r2 = new X.Shc
            r2.<init>(r15)
            monitor-enter(r5)
            X.Rr6 r0 = new X.Rr6     // Catch:{ all -> 0x0357 }
            r0.<init>(r2, r10)     // Catch:{ all -> 0x0357 }
            r4.add(r0)     // Catch:{ all -> 0x0357 }
            monitor-exit(r5)
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            java.lang.String r2 = "Bitmap"
            r12.A03(r1, r8, r7, r2)
            r0 = r29
            r12.A03(r0, r10, r7, r2)
            java.lang.String r17 = android.os.Build.FINGERPRINT
            java.lang.String r16 = "robolectric"
            r4 = r16
            r0 = r17
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0126
            java.lang.Class<android.os.ParcelFileDescriptor> r4 = android.os.ParcelFileDescriptor.class
            X.Shv r0 = new X.Shv
            r0.<init>(r3)
            r12.A03(r0, r4, r7, r2)
        L_0x0126:
            java.lang.Class<android.os.ParcelFileDescriptor> r6 = android.os.ParcelFileDescriptor.class
            r0 = r30
            r12.A03(r0, r6, r7, r2)
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            X.Sjn r0 = new X.Sjn
            r0.<init>()
            X.Si6 r3 = new X.Si6
            r3.<init>(r14, r0)
            r12.A03(r3, r5, r7, r2)
            X.Sja r19 = X.C11959Sja.A00
            r0 = r19
            r12.A06(r0, r7, r7)
            X.Shp r0 = new X.Shp
            r0.<init>()
            r12.A03(r0, r7, r7, r2)
            r0 = r18
            r12.A04(r0, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r4 = android.graphics.drawable.BitmapDrawable.class
            X.Shz r0 = new X.Shz
            r0.<init>(r11, r1)
            java.lang.String r1 = "BitmapDrawable"
            r12.A03(r0, r8, r4, r1)
            X.Shz r3 = new X.Shz
            r0 = r29
            r3.<init>(r11, r0)
            r12.A03(r3, r10, r4, r1)
            X.Shz r0 = new X.Shz
            r3 = r30
            r0.<init>(r11, r3)
            r12.A03(r0, r6, r4, r1)
            X.Si8 r1 = new X.Si8
            r0 = r18
            r1.<init>(r0, r14)
            r12.A04(r1, r4)
            java.lang.Class<X.Q6Z> r18 = X.Q6Z.class
            X.Si2 r0 = new X.Si2
            r3 = r31
            r1 = r32
            r0.<init>(r3, r15, r1)
            r3 = r18
            r1 = r0
            r0 = r28
            r12.A03(r1, r10, r3, r0)
            r3 = r31
            r1 = r18
            r12.A03(r3, r8, r1, r0)
            X.Si7 r1 = new X.Si7
            r1.<init>()
            r0 = r18
            r12.A04(r1, r0)
            java.lang.Class<X.SHy> r1 = X.C11264SHy.class
            r0 = r19
            r12.A06(r0, r1, r1)
            X.Shy r0 = new X.Shy
            r0.<init>(r14)
            r12.A03(r0, r1, r7, r2)
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            java.lang.String r2 = "legacy_append"
            r0 = r27
            r12.A03(r0, r3, r9, r2)
            X.Si0 r1 = new X.Si0
            r1.<init>(r14, r0)
            r12.A03(r1, r3, r7, r2)
            X.SiV r0 = new X.SiV
            r0.<init>()
            r12.A05(r0)
            java.lang.Class<java.io.File> r1 = java.io.File.class
            X.SjJ r0 = new X.SjJ
            r0.<init>()
            r12.A06(r0, r1, r8)
            X.QH8 r0 = new X.QH8
            r0.<init>()
            r12.A06(r0, r1, r10)
            X.Shr r0 = new X.Shr
            r0.<init>()
            r12.A03(r0, r1, r1, r2)
            X.QH7 r0 = new X.QH7
            r0.<init>()
            r12.A06(r0, r1, r6)
            r0 = r19
            r12.A06(r0, r1, r1)
            X.SiW r0 = new X.SiW
            r0.<init>(r15)
            r12.A05(r0)
            r15 = r16
            r0 = r17
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0207
            X.SiU r0 = new X.SiU
            r0.<init>()
            r12.A05(r0)
        L_0x0207:
            java.lang.Class r17 = java.lang.Integer.TYPE
            r15 = r26
            r0 = r17
            r12.A06(r15, r0, r10)
            r15 = r24
            r12.A06(r15, r0, r6)
            java.lang.Class<java.lang.Integer> r16 = java.lang.Integer.class
            r15 = r26
            r0 = r16
            r12.A06(r15, r0, r10)
            r15 = r24
            r12.A06(r15, r0, r6)
            r15 = r25
            r12.A06(r15, r0, r3)
            r15 = r23
            r0 = r17
            r12.A06(r15, r0, r5)
            r0 = r16
            r12.A06(r15, r0, r5)
            r15 = r25
            r0 = r17
            r12.A06(r15, r0, r3)
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            X.SjP r0 = new X.SjP
            r0.<init>()
            r12.A06(r0, r15, r10)
            X.SjP r0 = new X.SjP
            r0.<init>()
            r12.A06(r0, r3, r10)
            X.SjM r0 = new X.SjM
            r0.<init>()
            r12.A06(r0, r15, r10)
            X.SjL r0 = new X.SjL
            r0.<init>()
            r12.A06(r0, r15, r6)
            X.SjK r0 = new X.SjK
            r0.<init>()
            r12.A06(r0, r15, r5)
            android.content.res.AssetManager r15 = r13.getAssets()
            X.Sjc r0 = new X.Sjc
            r0.<init>(r15)
            r12.A06(r0, r3, r10)
            android.content.res.AssetManager r15 = r13.getAssets()
            X.Sjb r0 = new X.Sjb
            r0.<init>(r15)
            r12.A06(r0, r3, r5)
            X.SjX r0 = new X.SjX
            r0.<init>(r13)
            r12.A06(r0, r3, r10)
            X.SjY r0 = new X.SjY
            r0.<init>(r13)
            r12.A06(r0, r3, r10)
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r15 < r0) goto L_0x02a3
            X.QHA r0 = new X.QHA
            r0.<init>(r13)
            r12.A06(r0, r3, r10)
            X.QH9 r0 = new X.QH9
            r0.<init>(r13)
            r12.A06(r0, r3, r6)
        L_0x02a3:
            X.Sjf r15 = new X.Sjf
            r0 = r20
            r15.<init>(r0)
            r12.A06(r15, r3, r10)
            X.Sje r15 = new X.Sje
            r15.<init>(r0)
            r12.A06(r15, r3, r6)
            X.Sjd r6 = new X.Sjd
            r6.<init>(r0)
            r12.A06(r6, r3, r5)
            X.SjN r0 = new X.SjN
            r0.<init>()
            r12.A06(r0, r3, r10)
            java.lang.Class<java.net.URL> r5 = java.net.URL.class
            X.SjO r0 = new X.SjO
            r0.<init>()
            r12.A06(r0, r5, r10)
            X.SjR r0 = new X.SjR
            r0.<init>(r13)
            r12.A06(r0, r3, r1)
            java.lang.Class<X.Shl> r1 = X.C11859Shl.class
            X.SjW r0 = new X.SjW
            r0.<init>()
            r12.A06(r0, r1, r10)
            X.SjH r1 = new X.SjH
            r1.<init>()
            r0 = r33
            r12.A06(r1, r0, r8)
            X.SjI r1 = new X.SjI
            r1.<init>()
            r12.A06(r1, r0, r10)
            r0 = r19
            r12.A06(r0, r3, r3)
            r12.A06(r0, r9, r9)
            X.Shq r0 = new X.Shq
            r0.<init>()
            r12.A03(r0, r9, r9, r2)
            X.Sjs r0 = new X.Sjs
            r0.<init>(r11)
            r12.A07(r0, r7, r4)
            r1 = r22
            r0 = r33
            r12.A07(r1, r7, r0)
            X.Sjt r3 = new X.Sjt
            r0 = r21
            r3.<init>(r14, r1, r0)
            r0 = r33
            r12.A07(r3, r9, r0)
            r3 = r21
            r1 = r18
            r12.A07(r3, r1, r0)
            X.Sjo r0 = new X.Sjo
            r0.<init>()
            X.Si6 r1 = new X.Si6
            r1.<init>(r14, r0)
            r12.A03(r1, r8, r7, r2)
            X.Shz r0 = new X.Shz
            r0.<init>(r11, r1)
            r12.A03(r0, r8, r4, r2)
            java.util.Iterator r1 = r34.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0356
            r1.next()
            java.lang.String r0 = "registerComponents"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ AbstractMethodError -> 0x034f }
            throw r0     // Catch:{ AbstractMethodError -> 0x034f }
        L_0x034f:
            java.lang.String r0 = "getClass"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0356:
            return r12
        L_0x0357:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x035a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9203RTg.A00(X.SUv, java.util.List):X.S7e");
    }
}
