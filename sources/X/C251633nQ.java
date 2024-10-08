package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.3nQ  reason: invalid class name and case insensitive filesystem */
public final class C251633nQ implements Iterator {
    public static final FileFilter A03 = new C251643nR();
    public static final Comparator A04 = new C251663nT();
    public static final Comparator A05 = new C251653nS();
    public C251793ng A00;
    public boolean A01;
    public final ArrayDeque A02 = new ArrayDeque();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r0 = new X.C251793ng(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r6 = this;
            boolean r0 = r6.A01
            r4 = 1
            if (r0 != 0) goto L_0x0052
            r6.A01 = r4
        L_0x0007:
            java.util.ArrayDeque r5 = r6.A02
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0050
            java.lang.Object r3 = r5.getFirst()
            X.3na r3 = (X.C251733na) r3
            X.3nW r2 = r3.A02
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L_0x0022
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L_0x0022:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0058
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L_0x0038
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L_0x0038:
            java.lang.Object r1 = r0.next()
            X.3nW r1 = (X.C251693nW) r1
            X.3na r0 = new X.3na
            r0.<init>(r1)
            r5.addFirst(r0)
            int r0 = r3.A00
            if (r0 != r4) goto L_0x0007
            r1 = 1
        L_0x004b:
            X.3ng r0 = new X.3ng
            r0.<init>(r2, r1)
        L_0x0050:
            r6.A00 = r0
        L_0x0052:
            X.3ng r0 = r6.A00
            if (r0 != 0) goto L_0x0057
            r4 = 0
        L_0x0057:
            return r4
        L_0x0058:
            r5.removeFirst()
            boolean r0 = r2 instanceof X.C251683nV
            r1 = 3
            if (r0 == 0) goto L_0x004b
            r1 = 2
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251633nQ.hasNext():boolean");
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C251633nQ(File file, boolean z) {
        C251683nV r1 = new C251683nV(file, z);
        r1.A00 = A03;
        Iterator A002 = r1.A00();
        while (A002.hasNext()) {
            this.A02.addLast(new C251733na((C251693nW) A002.next()));
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C251793ng r1 = this.A00;
            this.A00 = null;
            this.A01 = false;
            return r1;
        }
        throw new IllegalStateException();
    }
}
