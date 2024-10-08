package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2jH  reason: invalid class name */
public final class AnonymousClass2jH implements 1JI, 1JK {
    public final C227392jB A00;
    public final FileStash A01;
    public final AnonymousClass1LE A02;
    public final Set A03 = new HashSet();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.2ic] */
    public final C227082ic AR2(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        A01(str);
        try {
            C227392jB r3 = this.A00;
            FileStash fileStash = this.A01;
            0qQ.A0B(r3, 3);
            C241143Ob r1 = new C241143Ob(fileStash, r3, this, (C2813457a) null, str2, false);
            ? obj = new Object();
            obj.A00 = r1;
            return obj;
        } catch (IOException unused) {
            A00(this, str);
            return new C227082ic();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.2ic] */
    public final C227082ic AR8(C2813457a r5, String str, boolean z) {
        0qQ.A0B(str, 0);
        A01(str);
        try {
            C241143Ob r1 = new C241143Ob(this.A01, this.A00, this, r5, str, true);
            ? obj = new Object();
            obj.A00 = r1;
            return obj;
        } catch (IOException unused) {
            A00(this, str);
            return new C227082ic();
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.2ic] */
    public final C227082ic AX8(String str) {
        0qQ.A0B(str, 0);
        C227392jB r1 = this.A00;
        if (!r1.getFilePath(str).canExecute()) {
            InputStream read = r1.read(str);
            if (read == null) {
                return new C227082ic();
            }
            File filePath = r1.getFilePath(str);
            0qQ.A07(filePath);
            C227592ja r12 = new C227592ja(filePath, read);
            ? obj = new Object();
            obj.A00 = r12;
            return obj;
        }
        throw new IllegalStateException("IgDiskCache.getWithMetadata() must be used for items that have crucial metadata");
    }

    public final long B22(String str) {
        0qQ.A0B(str, 0);
        return this.A00.getFilePath(str).length();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.2jc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.2ic] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.57a, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r4.getFilePath(r6).canExecute() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C227082ic CGe(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.2jB r4 = r5.A00
            X.2ij r0 = r4.A00
            X.1FL r1 = r0.A00
            java.lang.String r0 = "metadata"
            java.lang.Object r0 = r1.A02(r6, r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L_0x0025
            r3 = 0
            java.io.File r0 = r4.getFilePath(r6)
            boolean r0 = r0.canExecute()
            if (r0 == 0) goto L_0x002c
        L_0x001f:
            X.2ic r0 = new X.2ic
            r0.<init>()
            return r0
        L_0x0025:
            X.57a r3 = new X.57a
            r3.<init>()
            r3.A00 = r0
        L_0x002c:
            java.io.InputStream r2 = r4.read(r6)
            if (r2 == 0) goto L_0x001f
            java.io.File r1 = r4.getFilePath(r6)
            X.0qQ.A07(r1)
            X.2ja r0 = new X.2ja
            r0.<init>(r1, r2)
            X.2jc r1 = new X.2jc
            r1.<init>()
            r1.A01 = r0
            X.2ic r0 = new X.2ic
            if (r3 == 0) goto L_0x0058
            r0.<init>()
            r0.A00 = r3
        L_0x004e:
            r1.A00 = r0
            X.2ic r0 = new X.2ic
            r0.<init>()
            r0.A00 = r1
            return r0
        L_0x0058:
            r0.<init>()
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2jH.CGe(java.lang.String):X.2ic");
    }

    public final boolean CZs(String str) {
        0qQ.A0B(str, 0);
        return this.A00.hasKey(str);
    }

    public final void ED4(String str) {
        0qQ.A0B(str, 0);
        this.A00.remove(str);
        this.A01.remove(str);
    }

    public final void Ecp(long j) {
    }

    public final void close() {
    }

    public static final void A00(AnonymousClass2jH r1, String str) {
        Set set = r1.A03;
        synchronized (set) {
            set.remove(str);
        }
    }

    private final void A01(String str) {
        Set set = this.A03;
        synchronized (set) {
            if (!set.contains(str)) {
                set.add(str);
            } else {
                throw new IllegalStateException("Two editors trying to write to the same cached file");
            }
        }
    }

    public final HashSet BKB() {
        return new HashSet();
    }

    public final long BPN() {
        1Ff r0 = this.A02.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return -1;
    }

    public final void EHT(String str) {
        1FL r4 = this.A00.A00.A00;
        r4.A04(str, Long.MAX_VALUE, "eviction_priority");
        r4.A04(str, Long.valueOf(System.currentTimeMillis() + 604800000), "eviction_timestamps");
    }

    public final void clear() {
        this.A00.removeAll();
        this.A01.removeAll();
    }

    public final long size() {
        return this.A00.getSizeBytes() + this.A01.getSizeBytes();
    }

    public AnonymousClass2jH(FileStash fileStash, C227392jB r3, AnonymousClass1LE r4) {
        this.A02 = r4;
        this.A00 = r3;
        this.A01 = fileStash;
    }

    public final boolean CJV(String str) {
        throw AnonymousClass00P.createAndThrow();
    }
}
