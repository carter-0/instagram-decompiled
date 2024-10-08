package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SJa  reason: case insensitive filesystem */
public final class C11282SJa {
    public C13464Tar A00;
    public final SparseArray A01 = Pxe.A0L();
    public final SparseBooleanArray A02 = new SparseBooleanArray();
    public final HashMap A03 = AnonymousClass7TE.A1E();
    public final SparseBooleanArray A04 = new SparseBooleanArray();

    public static S7Y A00(C11282SJa sJa, Object obj) {
        return (S7Y) sJa.A03.get(obj);
    }

    public final S7Y A01(String str) {
        int keyAt;
        HashMap hashMap = this.A03;
        S7Y s7y = (S7Y) hashMap.get(str);
        if (s7y != null) {
            return s7y;
        }
        SparseArray sparseArray = this.A01;
        int size = sparseArray.size();
        int i = 0;
        if (size == 0) {
            keyAt = 0;
        } else {
            keyAt = sparseArray.keyAt(size - 1) + 1;
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
        }
        S7Y s7y2 = new S7Y(C12540Swq.A02, str, keyAt);
        hashMap.put(str, s7y2);
        sparseArray.put(keyAt, str);
        this.A02.put(keyAt, true);
        ((C12539Swp) this.A00).A01 = true;
        return s7y2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x012f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r23 = this;
            r2 = r23
            X.Tar r1 = r2.A00
            X.Swp r1 = (X.C12539Swp) r1
            X.Rse r4 = r1.A02
            java.io.File r3 = r4.A01
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0015
            java.io.File r0 = r4.A00
            r0.exists()
        L_0x0015:
            java.util.HashMap r0 = r2.A03
            r22 = r0
            android.util.SparseArray r0 = r2.A01
            r21 = r0
            boolean r0 = r1.A01
            r0 = r0 ^ 1
            X.C256703wD.A04(r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0032
            java.io.File r0 = r4.A00
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0148
        L_0x0032:
            r20 = 1
            java.io.File r1 = r4.A00     // Catch:{ all -> 0x0138 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0042
            r3.delete()     // Catch:{ all -> 0x0138 }
            r1.renameTo(r3)     // Catch:{ all -> 0x0138 }
        L_0x0042:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0138 }
            r1.<init>(r3)     // Catch:{ all -> 0x0138 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0138 }
            r0.<init>(r1)     // Catch:{ all -> 0x0138 }
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0138 }
            r5.<init>(r0)     // Catch:{ all -> 0x0138 }
            int r8 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            if (r8 < 0) goto L_0x012f
            r7 = 2
            if (r8 > r7) goto L_0x012f
            int r0 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x012f
            int r19 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r2 = 0
            r6 = 0
        L_0x0068:
            r0 = r19
            if (r2 >= r0) goto L_0x011a
            int r18 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.lang.String r17 = r5.readUTF()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            if (r8 >= r7) goto L_0x00b3
            long r0 = r5.readLong()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            X.Rsd r10 = new X.Rsd     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r10.<init>()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.lang.String r9 = "exo_len"
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.util.Map r0 = r10.A01     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0.put(r9, r1)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.util.List r0 = r10.A00     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0.remove(r9)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            X.Swq r0 = X.C12540Swq.A02     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            X.Swq r9 = r0.A01(r10)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
        L_0x0095:
            X.S7Y r10 = new X.S7Y     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r1 = r17
            r0 = r18
            r10.<init>(r9, r1, r0)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.lang.String r9 = r10.A02     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = r22
            r0.put(r9, r10)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r1 = r10.A01     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = r21
            r0.put(r1, r9)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r0 = r1 * 31
            int r1 = X.C41845B3m.A01(r9, r0)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            goto L_0x00f2
        L_0x00b3:
            int r16 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r13 = 0
        L_0x00bc:
            r0 = r16
            if (r13 >= r0) goto L_0x00ec
            java.lang.String r14 = r5.readUTF()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r11 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            if (r11 < 0) goto L_0x010f
            r10 = 10485760(0xa00000, float:1.469368E-38)
            int r15 = java.lang.Math.min(r11, r10)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            byte[] r9 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = 0
        L_0x00d3:
            if (r0 == r11) goto L_0x00e6
            int r1 = r0 + r15
            byte[] r9 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r5.readFully(r9, r0, r15)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r0 = r11 - r1
            int r15 = java.lang.Math.min(r0, r10)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = r1
            goto L_0x00d3
        L_0x00e6:
            r12.put(r14, r9)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00ec:
            X.Swq r9 = new X.Swq     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r9.<init>(r12)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            goto L_0x0095
        L_0x00f2:
            if (r8 >= r7) goto L_0x0101
            X.Swq r0 = r10.A00     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            long r9 = X.C9692RfA.A00(r0)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r1 = r1 * 31
            int r0 = X.C51968G9o.A03(r9)
            goto L_0x0109
        L_0x0101:
            int r1 = r1 * 31
            X.Swq r0 = r10.A00     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r0 = r0.hashCode()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
        L_0x0109:
            int r1 = r1 + r0
            int r6 = r6 + r1
            int r2 = r2 + 1
            goto L_0x0068
        L_0x010f:
            java.lang.String r0 = "Invalid value size: "
            java.lang.String r0 = X.002.A0O(r0, r11)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            throw r0     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
        L_0x011a:
            int r2 = r5.readInt()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            int r1 = r5.read()     // Catch:{ IOException -> 0x012f, all -> 0x0133 }
            r0 = -1
            if (r1 == r0) goto L_0x0127
            r20 = 0
        L_0x0127:
            if (r2 != r6) goto L_0x012f
            if (r20 == 0) goto L_0x012f
            r5.close()     // Catch:{ IOException -> 0x0148 }
            return
        L_0x012f:
            r5.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x013a
        L_0x0133:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0139 }
            throw r0
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            throw r0
        L_0x013a:
            r22.clear()
            r21.clear()
            r3.delete()
            java.io.File r0 = r4.A00
            r0.delete()
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11282SJa.A02():void");
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.RC0, java.io.BufferedOutputStream] */
    public final void A03() {
        C10463Rse rse;
        File file;
        C8858RCz rCz;
        RC0 rc0;
        IOException iOException;
        C13464Tar tar = this.A00;
        HashMap hashMap = this.A03;
        C12539Swp swp = (C12539Swp) tar;
        if (swp.A01) {
            try {
                rse = swp.A02;
                file = rse.A01;
                if (file.exists()) {
                    File file2 = rse.A00;
                    if (file2.exists()) {
                        file.delete();
                    } else if (!file.renameTo(file2)) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Couldn't rename file ");
                        A1A.append(file);
                        2AG.A04("AtomicFile", AnonymousClass7TG.A0m(file2, " to backup file ", A1A));
                    }
                }
                rCz = new C8858RCz(file);
            } catch (FileNotFoundException e) {
                File parentFile = file.getParentFile();
                if (parentFile == null || !parentFile.mkdirs()) {
                    iOException = Pxe.A0c(AnonymousClass7TG.A0m(file, "Couldn't create ", AnonymousClass7TE.A1A()), e);
                } else {
                    try {
                        rCz = new C8858RCz(file);
                    } catch (FileNotFoundException e2) {
                        iOException = Pxe.A0c(AnonymousClass7TG.A0m(file, "Couldn't create ", AnonymousClass7TE.A1A()), e2);
                        throw iOException;
                    }
                }
                throw iOException;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
            RC0 rc02 = swp.A00;
            if (rc02 == null) {
                ? bufferedOutputStream = new BufferedOutputStream(rCz);
                swp.A00 = bufferedOutputStream;
                rc0 = bufferedOutputStream;
            } else {
                rc02.A00(rCz);
                rc0 = rc02;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(rc0);
            try {
                dataOutputStream.writeInt(2);
                int i = 0;
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(hashMap.size());
                Iterator A0t = AnonymousClass7TF.A0t(hashMap);
                while (A0t.hasNext()) {
                    S7Y s7y = (S7Y) A0t.next();
                    int i2 = s7y.A01;
                    dataOutputStream.writeInt(i2);
                    String str = s7y.A02;
                    dataOutputStream.writeUTF(str);
                    Set entrySet = s7y.A00.A01.entrySet();
                    dataOutputStream.writeInt(entrySet.size());
                    Iterator it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(it);
                        dataOutputStream.writeUTF(DbT.A13(A1J));
                        byte[] bArr = (byte[]) A1J.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    i += AnonymousClass7TE.A0N(s7y.A00, AnonymousClass7TF.A08(str, i2 * 31));
                }
                dataOutputStream.writeInt(i);
                dataOutputStream.close();
                rse.A00.delete();
                swp.A01 = false;
            } catch (Throwable th2) {
                th = th2;
                try {
                    dataOutputStream.close();
                    throw th;
                } catch (IOException unused) {
                    throw th;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = this.A04;
        int size = sparseBooleanArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.A01.remove(sparseBooleanArray.keyAt(i3));
        }
        sparseBooleanArray.clear();
        this.A02.clear();
    }

    public final void A04(String str) {
        HashMap hashMap = this.A03;
        S7Y s7y = (S7Y) hashMap.get(str);
        if (s7y != null && s7y.A04.isEmpty() && s7y.A03.isEmpty()) {
            hashMap.remove(str);
            int i = s7y.A01;
            SparseBooleanArray sparseBooleanArray = this.A02;
            boolean z = sparseBooleanArray.get(i);
            ((C12539Swp) this.A00).A01 = true;
            SparseArray sparseArray = this.A01;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            this.A04.put(i, true);
        }
    }

    public C11282SJa(File file) {
        this.A00 = new C12539Swp(JTO.A0s(file, "cached_content_index.exi"));
    }
}
