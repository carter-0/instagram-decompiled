package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.regex.Matcher;

/* renamed from: X.3np  reason: invalid class name and case insensitive filesystem */
public abstract class C251883np implements C251893nq {
    public static final ThreadLocal A03 = new C251913ns();
    public static final ThreadLocal A04 = new C251923nt();
    public final C251593nM A00;
    public final Object A01;
    public volatile 1vB A02;

    public int A00() {
        return Math.round((float) ((C251873no) this).A01.length());
    }

    public 1vB A01() {
        C251873no r0 = (C251873no) this;
        return r0.A00.A02(r0.A01);
    }

    public void A02() {
        File file = ((C251873no) this).A01;
        if (!file.delete()) {
            0KC.A0P("FileBatchPayloadIterator", "Failed to remove %s", new Object[]{file});
        }
    }

    public void A05(Writer writer) {
        C251873no r7 = (C251873no) this;
        C251973ny r6 = new C251973ny(new FileInputStream(r7.A01), ByteBuffer.wrap((byte[]) A03.get()));
        try {
            char[] cArr = (char[]) A04.get();
            boolean z = false;
            while (true) {
                int read = r6.read(cArr);
                if (read == -1) {
                    return;
                }
                if (!z) {
                    Matcher matcher = r7.A02.matcher(CharBuffer.wrap(cArr));
                    int i = 0;
                    while (matcher.find()) {
                        int start = matcher.start();
                        i = matcher.end();
                        writer.write(cArr, 0, start);
                    }
                    writer.write(cArr, i, read - i);
                    z = true;
                } else {
                    writer.write(cArr, 0, read);
                }
            }
        } finally {
            r6.close();
        }
    }

    public final boolean CXo() {
        return false;
    }

    public void A03() {
    }

    public final boolean CK4() {
        boolean z;
        1vB r2 = this.A02;
        if (r2 != null) {
            synchronized (r2) {
                z = false;
                if (r2.A01 == this) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Cm1() {
        if (this.A02 != null) {
            this.A02.A07(this);
            A02();
            1vB r0 = this.A02;
            r0.A07(this);
            r0.A05();
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{lockKey=");
        sb.append(this.A01);
        sb.append(";hasLock=");
        sb.append(CK4());
        sb.append("}");
        return sb.toString();
    }

    public final void unlock() {
        if (this.A02 != null) {
            this.A02.A07(this);
            this.A02.A08(this);
            A03();
            this.A02.A03();
            this.A02 = null;
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public C251883np(C251593nM r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025 A[SYNTHETIC, Splitter:B:10:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r4 = this;
            X.1vB r0 = r4.A01()
            r4.A02 = r0
            X.1vB r3 = r4.A02
            monitor-enter(r3)
            boolean r0 = r3.A09()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r3.A02     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "BatchLockState"
            java.lang.String r0 = "Attempting to lock a deleted entry: %s (owned by %s)"
            X.0KC.A0P(r1, r0, r2)     // Catch:{ all -> 0x0032 }
        L_0x001e:
            X.1vB.A00(r3, r4)     // Catch:{ all -> 0x0032 }
        L_0x0021:
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            r3.wait()     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0021
        L_0x0029:
            r3.A04()     // Catch:{ all -> 0x0032 }
            r3.A01 = r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)
            return
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251883np.A04():void");
    }

    public final int B2C() {
        return A00() + 256;
    }

    /* JADX INFO: finally extract failed */
    public final void FO1(Writer writer) {
        if (!CK4()) {
            A04();
        }
        A05(writer);
        C251593nM r2 = this.A00;
        writer.write(93);
        writer.write(44);
        0Df A022 = r2.A02.A02();
        try {
            r2.A01.A00(A022);
            C251613nO r0 = r2.A00;
            if (r0 != null) {
                r0.A00.E4m(A022);
            }
            0Dd.A00().A05(A022, writer);
            A022.A02();
            writer.write(125);
            writer.flush();
        } catch (Throwable th) {
            A022.A02();
            throw th;
        }
    }
}
