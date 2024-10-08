package okhttp3.internal.publicsuffix;

import X.002;
import X.AnonymousClass7TE;
import X.JTQ;
import X.Pxe;
import X.Pxf;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    public static final String[] EMPTY_RULE = new String[0];
    public static final byte EXCEPTION_MARKER = 33;
    public static final String[] PREVAILING_RULE = {"*"};
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    public static final byte[] WILDCARD_LABEL = {42};
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    public final AtomicBoolean listRead = JTQ.A0k();
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public final CountDownLatch readCompleteLatch = Pxf.A0y();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1 < 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String binarySearchBytes(byte[] r11, byte[][] r12, int r13) {
        /*
            int r3 = r11.length
            r7 = 0
        L_0x0002:
            if (r7 >= r3) goto L_0x006c
            int r0 = r7 + r3
            int r1 = r0 / 2
        L_0x0008:
            r2 = 10
            r0 = -1
            if (r1 <= r0) goto L_0x0014
            byte r0 = r11[r1]
            if (r0 == r2) goto L_0x0014
            int r1 = r1 + -1
            goto L_0x0008
        L_0x0014:
            int r6 = r1 + 1
            r10 = 1
            r1 = 1
        L_0x0018:
            int r9 = r6 + r1
            byte r0 = r11[r9]
            int r1 = r1 + 1
            if (r0 != r2) goto L_0x0018
            int r5 = r9 - r6
            r4 = r13
            r8 = 0
            r2 = 0
        L_0x0025:
            r0 = r12[r4]
            byte r0 = r0[r8]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L_0x002b:
            int r0 = r6 + r2
            byte r0 = r11[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x0039
            if (r1 >= 0) goto L_0x0069
        L_0x0036:
            int r3 = r6 + -1
            goto L_0x0002
        L_0x0039:
            int r2 = r2 + 1
            int r8 = r8 + 1
            if (r2 == r5) goto L_0x004e
            r0 = r12[r4]
            int r0 = r0.length
            if (r0 != r8) goto L_0x0025
            int r0 = r12.length
            int r0 = r0 - r10
            if (r4 == r0) goto L_0x004e
            int r4 = r4 + 1
            r8 = -1
            r1 = 46
            goto L_0x002b
        L_0x004e:
            int r2 = r5 - r2
            r0 = r12[r4]
            int r1 = r0.length
            int r1 = r1 - r8
        L_0x0054:
            int r4 = r4 + 1
            int r0 = r12.length
            if (r4 >= r0) goto L_0x005e
            r0 = r12[r4]
            int r0 = r0.length
            int r1 = r1 + r0
            goto L_0x0054
        L_0x005e:
            if (r1 < r2) goto L_0x0036
            if (r1 > r2) goto L_0x0069
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = X.Pxe.A11(r0, r11, r6, r5)
            return r0
        L_0x0069:
            int r7 = r9 + 1
            goto L_0x0002
        L_0x006c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.binarySearchBytes(byte[], byte[][], int):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readTheListUninterruptibly() {
        /*
            r5 = this;
            r4 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{ InterruptedIOException -> 0x0005, IOException -> 0x000a }
            goto L_0x0013
        L_0x0005:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0019 }
            r4 = 1
            goto L_0x0001
        L_0x000a:
            r3 = move-exception
            X.SPU r2 = X.SPU.A00     // Catch:{ all -> 0x0019 }
            r1 = 5
            java.lang.String r0 = "Failed to read public suffix list"
            r2.A05(r0, r3, r1)     // Catch:{ all -> 0x0019 }
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            X.Pxe.A1F()
        L_0x0018:
            return
        L_0x0019:
            r0 = move-exception
            if (r4 == 0) goto L_0x001f
            X.Pxe.A1F()
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Pxe.A1F();
            }
        } else {
            readTheListUninterruptibly();
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw AnonymousClass7TE.A0z("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = WILDCARD_LABEL;
                str3 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (str3 != null) {
                    break;
                }
                i4++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String binarySearchBytes = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (binarySearchBytes != null) {
                    str = binarySearchBytes;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return 002.A0R("!", str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = EMPTY_RULE;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = EMPTY_RULE;
        }
        if (strArr2.length <= strArr3.length) {
            return strArr3;
        }
        return strArr2;
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.SJy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        X.C9153RRe.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readTheList() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r0 = "publicsuffixes.gz"
            java.io.InputStream r2 = r1.getResourceAsStream(r0)
            if (r2 == 0) goto L_0x004f
            X.SJy r0 = new X.SJy
            r0.<init>()
            X.TPl r1 = new X.TPl
            r1.<init>(r2, r0)
            X.TPm r0 = new X.TPm
            r0.<init>(r1)
            X.TPd r3 = new X.TPd
            r3.<init>(r0)
            int r0 = r3.readInt()     // Catch:{ all -> 0x0043 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0043 }
            r3.readFully(r1)     // Catch:{ all -> 0x0043 }
            int r0 = r3.readInt()     // Catch:{ all -> 0x0043 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0043 }
            r3.readFully(r0)     // Catch:{ all -> 0x0043 }
            r3.close()
            monitor-enter(r4)
            r4.publicSuffixListBytes = r1     // Catch:{ all -> 0x0040 }
            r4.publicSuffixExceptionListBytes = r0     // Catch:{ all -> 0x0040 }
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            java.util.concurrent.CountDownLatch r0 = r4.readCompleteLatch
            r0.countDown()
            return
        L_0x0040:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            throw r2
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
            throw r2
        L_0x004a:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r2
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    public String getEffectiveTldPlusOne(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] findMatchingRule = findMatchingRule(split);
            int length = split.length;
            int length2 = findMatchingRule.length;
            if (length == length2 && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            int i = length2 + 1;
            if (findMatchingRule[0].charAt(0) == '!') {
                i = length2;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            String[] split2 = str.split("\\.");
            for (int i2 = length - i; i2 < split2.length; i2++) {
                A1A.append(split2[i2]);
                A1A.append('.');
            }
            A1A.deleteCharAt(A1A.length() - 1);
            return A1A.toString();
        }
        throw AnonymousClass7TE.A11("domain == null");
    }

    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
