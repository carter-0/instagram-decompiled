package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pyw  reason: case insensitive filesystem */
public final class C7204Pyw {
    public RandomAccessFile A00;
    public int A01;
    public long A02;
    public List A03;
    public boolean A04;
    public final int A05;
    public final File A06;
    public final Integer A07;
    public final byte[] A08;

    public final synchronized ArrayList A01(String str) {
        ArrayList A1C;
        long j;
        A03();
        A1C = AnonymousClass7TE.A1C();
        int i = this.A01;
        List list = this.A03;
        list.getClass();
        if (i >= list.size()) {
            this.A03.add(str);
        } else {
            A1C.add(AnonymousClass7TE.A19(this.A03, this.A01));
            this.A03.set(this.A01, str);
        }
        this.A01++;
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append(',');
        A0n.append("##");
        byte[] bytes = C51967G9n.A0r(A0n, ',').getBytes(StandardCharsets.UTF_8);
        long length = this.A02 + ((long) bytes.length);
        this.A02 = length;
        long intValue = (long) this.A07.intValue();
        if (length <= intValue) {
            this.A02 = length - ((long) this.A08.length);
        } else {
            List list2 = this.A03;
            List subList = list2.subList(this.A01, list2.size());
            A1C.addAll(subList);
            subList.clear();
            this.A02 = (long) this.A05;
            this.A01 = 0;
        }
        RandomAccessFile randomAccessFile = this.A00;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.write(bytes);
                long filePointer = randomAccessFile.getFilePointer();
                if (filePointer <= intValue) {
                    j = filePointer - ((long) this.A08.length);
                } else {
                    byte[] bArr = this.A08;
                    randomAccessFile.setLength(filePointer - ((long) bArr.length));
                    j = (long) this.A05;
                    randomAccessFile.seek(j);
                    randomAccessFile.write(bArr);
                }
                randomAccessFile.seek(j);
            } catch (IOException e) {
                0wb.A07("enqueue_to_disk_failure", e);
                RandomAccessFile randomAccessFile2 = this.A00;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused) {
                    }
                }
                this.A00 = null;
            }
        }
        return A1C;
    }

    public final synchronized List A02() {
        List list;
        A03();
        list = this.A03;
        list.getClass();
        return Collections.unmodifiableList(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f A[SYNTHETIC, Splitter:B:67:0x015f] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03() {
        /*
            r19 = this;
            r5 = r19
            monitor-enter(r5)
            boolean r0 = r5.A04     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0198
            r16 = 0
            java.io.File r2 = r5.A06     // Catch:{ IOException -> 0x0157 }
            boolean r1 = r2.exists()     // Catch:{ IOException -> 0x0157 }
            r17 = -1
            java.lang.String r0 = "rwd"
            if (r1 != 0) goto L_0x0020
            r2.createNewFile()     // Catch:{ IOException -> 0x0157 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0157 }
            r9.<init>(r2, r0)     // Catch:{ IOException -> 0x0157 }
            goto L_0x0133
        L_0x0020:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0157 }
            r9.<init>(r2, r0)     // Catch:{ IOException -> 0x0157 }
            r16 = r9
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0157 }
            r3 = 0
            r2 = 0
        L_0x002d:
            int r0 = r4.length     // Catch:{ IOException -> 0x0157 }
            int r0 = r0 - r2
            int r1 = r9.read(r4, r2, r0)     // Catch:{ IOException -> 0x0157 }
            r0 = -1
            if (r1 == r0) goto L_0x0044
            int r2 = r2 + r1
            int r0 = r4.length     // Catch:{ IOException -> 0x0157 }
            if (r2 < r0) goto L_0x002d
            int r0 = r4.length     // Catch:{ IOException -> 0x0157 }
            int r0 = r0 << 1
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0157 }
            java.lang.System.arraycopy(r4, r3, r0, r3, r2)     // Catch:{ IOException -> 0x0157 }
            r4 = r0
            goto L_0x002d
        L_0x0044:
            android.util.Pair r0 = X.Pxf.A0K(r4, r2)     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r6 = r0.first     // Catch:{ IOException -> 0x0157 }
            byte[] r6 = (byte[]) r6     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r0 = r0.second     // Catch:{ IOException -> 0x0157 }
            int r4 = X.Pxe.A09(r0)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r13 = "##"
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0157 }
            byte[] r10 = r13.getBytes(r3)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r0 = "array"
            X.17k.A07(r6, r0)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r0 = "target"
            X.17k.A07(r10, r0)     // Catch:{ IOException -> 0x0157 }
            int r8 = r10.length     // Catch:{ IOException -> 0x0157 }
            r7 = 0
            if (r8 != 0) goto L_0x00af
        L_0x0069:
            long r1 = (long) r7     // Catch:{ IOException -> 0x0157 }
            r12 = 0
            java.lang.String r11 = X.Pxe.A11(r3, r6, r12, r4)     // Catch:{ IOException -> 0x0157 }
            r10 = 44
            android.text.TextUtils$SimpleStringSplitter r8 = new android.text.TextUtils$SimpleStringSplitter     // Catch:{ IOException -> 0x0157 }
            r8.<init>(r10)     // Catch:{ IOException -> 0x0157 }
            r8.setString(r11)     // Catch:{ IOException -> 0x0157 }
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0157 }
            r7 = 0
            if (r0 == 0) goto L_0x0118
            java.lang.String r3 = r8.next()     // Catch:{ IOException -> 0x0157 }
            r0 = 3
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x0157 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0118
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r3 = r8.next()     // Catch:{ IOException -> 0x0157 }
            java.lang.Integer r0 = r5.A07     // Catch:{ IOException -> 0x0157 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0157 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x0157 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0118
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0157 }
            r15 = -1
            goto L_0x00c9
        L_0x00af:
            int r0 = r6.length     // Catch:{ IOException -> 0x0157 }
            int r0 = r0 - r8
            int r0 = r0 + 1
            if (r7 >= r0) goto L_0x00c7
            r2 = 0
        L_0x00b6:
            int r0 = r7 + r2
            byte r1 = r6[r0]     // Catch:{ IOException -> 0x0157 }
            byte r0 = r10[r2]     // Catch:{ IOException -> 0x0157 }
            if (r1 == r0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            int r2 = r2 + 1
            if (r2 >= r8) goto L_0x0069
            goto L_0x00b6
        L_0x00c4:
            int r7 = r7 + 1
            goto L_0x00af
        L_0x00c7:
            r7 = -1
            goto L_0x0069
        L_0x00c9:
            r3 = -1
        L_0x00ca:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r8.next()     // Catch:{ IOException -> 0x0157 }
            boolean r4 = r13.equals(r0)     // Catch:{ IOException -> 0x0157 }
            if (r4 == 0) goto L_0x010e
            int r3 = r6.size()     // Catch:{ IOException -> 0x0157 }
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0157 }
            if (r0 == 0) goto L_0x00e8
            r8.next()     // Catch:{ IOException -> 0x0157 }
            goto L_0x00ca
        L_0x00e8:
            int r4 = r11.length()     // Catch:{ IOException -> 0x0157 }
            int r0 = r4 + -1
            char r0 = r11.charAt(r0)     // Catch:{ IOException -> 0x0157 }
            if (r0 == r10) goto L_0x00ca
            java.lang.String r14 = "length: "
            java.lang.String r3 = ", data: "
            int r0 = r4 + -20
            int r0 = java.lang.Math.max(r12, r0)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r0 = r11.substring(r0)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r4 = X.002.A05(r4, r14, r3, r0)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r3 = "persistent_ring_buffer_malformed_data"
            r0 = 1
            X.0wb.A04(r3, r4, r0)     // Catch:{ IOException -> 0x0157 }
            goto L_0x00c9
        L_0x010e:
            r6.add(r0)     // Catch:{ IOException -> 0x0157 }
            goto L_0x00ca
        L_0x0112:
            if (r3 == r15) goto L_0x0118
            android.util.Pair r7 = X.Pxf.A0K(r6, r3)     // Catch:{ IOException -> 0x0157 }
        L_0x0118:
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            if (r7 == 0) goto L_0x0133
            r9.seek(r1)     // Catch:{ IOException -> 0x0153 }
            java.lang.Object r3 = r7.first     // Catch:{ IOException -> 0x0153 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ IOException -> 0x0153 }
            java.lang.Object r0 = r7.second     // Catch:{ IOException -> 0x0153 }
            int r11 = X.Pxe.A09(r0)     // Catch:{ IOException -> 0x0153 }
            X.Pyz r8 = new X.Pyz     // Catch:{ IOException -> 0x0153 }
            r12 = r1
            r10 = r3
            r8.<init>(r9, r10, r11, r12)     // Catch:{ IOException -> 0x0153 }
            goto L_0x016c
        L_0x0133:
            r0 = 0
            r9.setLength(r0)     // Catch:{ IOException -> 0x0153 }
            r9.seek(r0)     // Catch:{ IOException -> 0x0153 }
            byte[] r0 = r5.A00()     // Catch:{ IOException -> 0x0153 }
            r9.write(r0)     // Catch:{ IOException -> 0x0153 }
            int r0 = r5.A05     // Catch:{ IOException -> 0x0153 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0153 }
            r9.seek(r0)     // Catch:{ IOException -> 0x0153 }
            r15 = 0
            r16 = -1
            X.Pyz r8 = new X.Pyz     // Catch:{ IOException -> 0x0153 }
            r14 = r9
            r13 = r8
            r13.<init>(r14, r15, r16, r17)     // Catch:{ IOException -> 0x0153 }
            goto L_0x016c
        L_0x0153:
            r1 = move-exception
            r16 = r9
            goto L_0x0158
        L_0x0157:
            r1 = move-exception
        L_0x0158:
            java.lang.String r0 = "init_disk_file_failure"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x019a }
            if (r16 == 0) goto L_0x0162
            r16.close()     // Catch:{ IOException -> 0x0162 }
        L_0x0162:
            r9 = 0
            r11 = -1
            r12 = -1
            X.Pyz r8 = new X.Pyz     // Catch:{ all -> 0x019a }
            r10 = r9
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x019a }
        L_0x016c:
            java.io.RandomAccessFile r0 = r8.A02     // Catch:{ all -> 0x019a }
            r5.A00 = r0     // Catch:{ all -> 0x019a }
            java.util.List r7 = r8.A03     // Catch:{ all -> 0x019a }
            if (r7 == 0) goto L_0x018b
            int r6 = r8.A00     // Catch:{ all -> 0x019a }
            r0 = -1
            if (r6 == r0) goto L_0x018b
            long r3 = r8.A01     // Catch:{ all -> 0x019a }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x018b
            r5.A03 = r7     // Catch:{ all -> 0x019a }
            r5.A01 = r6     // Catch:{ all -> 0x019a }
        L_0x0185:
            r5.A02 = r3     // Catch:{ all -> 0x019a }
            r0 = 1
            r5.A04 = r0     // Catch:{ all -> 0x019a }
            goto L_0x0198
        L_0x018b:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x019a }
            r5.A03 = r0     // Catch:{ all -> 0x019a }
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x019a }
            int r0 = r5.A05     // Catch:{ all -> 0x019a }
            long r3 = (long) r0     // Catch:{ all -> 0x019a }
            goto L_0x0185
        L_0x0198:
            monitor-exit(r5)
            return
        L_0x019a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7204Pyw.A03():void");
    }

    public C7204Pyw(File file, Integer num) {
        this.A06 = file;
        this.A07 = num;
        byte[] bytes = 002.A0C("##", ',').getBytes(StandardCharsets.UTF_8);
        this.A08 = bytes;
        this.A05 = A00().length - bytes.length;
    }

    private byte[] A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(Integer.toString(3));
        A1A.append(',');
        A1A.append(Integer.toString(this.A07.intValue()));
        A1A.append(',');
        A1A.append("##");
        return C51967G9n.A0r(A1A, ',').getBytes(StandardCharsets.UTF_8);
    }
}
