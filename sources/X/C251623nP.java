package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.3nP  reason: invalid class name and case insensitive filesystem */
public final class C251623nP implements Iterator {
    public int A00;
    public 1uY A01;
    public C251893nq A02;
    public File A03;
    public boolean A04;
    public final int A05;
    public final long A06 = ((AnonymousClass1v8.A00() / AnonymousClass1v8.A00) - 7);
    public final long A07 = ((AnonymousClass1v8.A00() / AnonymousClass1v8.A01) - 168);
    public final DefaultFalcoAcsProvider A08;
    public final C251633nQ A09;
    public final C251593nM A0A;
    public final C251583nL A0B;
    public final String A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f3, code lost:
        if (r13 >= r2) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r15 = this;
            boolean r0 = r15.A04
            r5 = 1
            if (r0 != 0) goto L_0x0147
            r15.A04 = r5
            r1 = 0
            X.3ne r6 = new X.3ne
            r6.<init>()
            r0 = 4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r8 = 0
            r10 = r1
            r9 = 0
        L_0x0016:
            X.3nQ r2 = r15.A09
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0129
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0123
            X.3ng r0 = r2.A00
            r2.A00 = r1
            r2.A01 = r8
            X.3nW r7 = r0.A01
            int r2 = r0.A00
            if (r2 == r5) goto L_0x00b5
            r0 = 2
            if (r2 == r0) goto L_0x0087
            if (r10 == 0) goto L_0x005c
            java.io.File r3 = r7.A00
            X.1uY r0 = r15.A01
            X.1vB r2 = r0.A02(r3)
            boolean r0 = r2.A0B(r15)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0057
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x0054
            r2.A07(r15)     // Catch:{ all -> 0x0102 }
            r2.A05()     // Catch:{ all -> 0x0102 }
            r2.A08(r15)     // Catch:{ all -> 0x0107 }
            goto L_0x00f7
        L_0x0054:
            r2.A08(r15)     // Catch:{ all -> 0x0107 }
        L_0x0057:
            r2.A03()
            goto L_0x00fa
        L_0x005c:
            java.io.File r7 = r7.A00
            long r11 = r7.length()
            r2 = 0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            r7.getName()
            goto L_0x00fa
        L_0x006d:
            X.3nM r11 = r15.A0A
            X.1uY r3 = r15.A01
            com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider r2 = r15.A08
            X.3no r0 = new X.3no
            r0.<init>(r2, r11, r3, r7)
            r4.add(r0)
            long r2 = (long) r9
            java.io.File r0 = r0.A01
            long r11 = r0.length()
            long r2 = r2 + r11
            int r9 = (int) r2
            r15.A03 = r7
            goto L_0x00fa
        L_0x0087:
            if (r10 == 0) goto L_0x00af
            java.io.File r2 = r7.A00
            A00(r2)
            java.io.File r0 = r10.A00
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0097
            r10 = r1
        L_0x0097:
            boolean r0 = r7 instanceof X.C251723nZ
            if (r0 == 0) goto L_0x00fa
            X.3nL r11 = r15.A0B
            java.io.File r0 = r7.A00
            java.io.File r3 = r15.A03
            java.lang.String r2 = r0.getName()
            X.3nJ r0 = r11.A00
            X.01r r0 = r0.A07
            r0.put(r2, r3)
            r15.A03 = r1
            goto L_0x00fa
        L_0x00af:
            java.util.ArrayList r0 = r6.A00
            r0.add(r7)
            goto L_0x0097
        L_0x00b5:
            boolean r0 = r7 instanceof X.C251723nZ
            if (r0 == 0) goto L_0x00d0
            java.io.File r0 = r7.A00
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = X.AnonymousClass1Uu.A00()
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            X.1uY r0 = X.1uY.A00(r0)
            r15.A01 = r0
            goto L_0x00fa
        L_0x00d0:
            boolean r0 = r7 instanceof X.C251813ni
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r7 instanceof X.C251803nh
            if (r0 == 0) goto L_0x00db
            long r2 = r15.A06
            goto L_0x00e1
        L_0x00db:
            boolean r0 = r7 instanceof X.C251823nj
            if (r0 == 0) goto L_0x010c
            long r2 = r15.A07
        L_0x00e1:
            java.io.File r0 = r7.A00     // Catch:{ NumberFormatException -> 0x00f5 }
            java.lang.String r0 = r0.getName()     // Catch:{ NumberFormatException -> 0x00f5 }
            long r13 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00f5 }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00f5
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fa
        L_0x00f5:
            r10 = r7
            goto L_0x00fa
        L_0x00f7:
            r2.A03()
        L_0x00fa:
            if (r9 == 0) goto L_0x0016
            int r0 = r15.A05
            if (r9 >= r0) goto L_0x0129
            goto L_0x0016
        L_0x0102:
            r0 = move-exception
            r2.A08(r15)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            r2.A03()
            throw r0
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "directoryNode="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0123:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0129:
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x0145
            int r0 = r15.A00
            int r0 = r0 + r2
            r15.A00 = r0
            if (r2 <= r5) goto L_0x014d
            r4.size()
            X.3nM r1 = r15.A0A
            X.3nu r0 = new X.3nu
            r0.<init>(r1, r4)
        L_0x0140:
            X.3nv r1 = new X.3nv
            r1.<init>(r0, r6)
        L_0x0145:
            r15.A02 = r1
        L_0x0147:
            X.3nq r0 = r15.A02
            if (r0 != 0) goto L_0x014c
            r5 = 0
        L_0x014c:
            return r5
        L_0x014d:
            java.lang.Object r0 = r4.get(r8)
            X.3nq r0 = (X.C251893nq) r0
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251623nP.hasNext():boolean");
    }

    public final void remove() {
        throw new UnsupportedOperationException("File removal should be accomplished via markSuccessful");
    }

    public C251623nP(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C251593nM r6, C251583nL r7, File file, String str, int i, boolean z, boolean z2) {
        this.A09 = new C251633nQ(file, z2);
        this.A0A = r6;
        this.A0B = r7;
        this.A05 = i;
        this.A08 = defaultFalcoAcsProvider;
        this.A0C = str;
        this.A0D = z;
    }

    public static void A00(File file) {
        if (!file.isDirectory()) {
            0KC.A0P("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", new Object[]{file});
        }
        file.delete();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C251893nq r1 = this.A02;
            this.A04 = false;
            this.A02 = null;
            return r1;
        }
        throw new IllegalStateException();
    }
}
