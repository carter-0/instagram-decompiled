package X;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: X.Y5z  reason: case insensitive filesystem */
public final class C22480Y5z extends 0sy {
    public final ArrayDeque A00;
    public final /* synthetic */ C22444Y4b A01;

    public C22480Y5z(C22444Y4b y4b) {
        Object y6g;
        this.A01 = y4b;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A00 = arrayDeque;
        File file = y4b.A00;
        if (file.isDirectory()) {
            if (this.A01.A01.intValue() != 0) {
                y6g = new Y6E(file, this);
            } else {
                y6g = new Y6D(file, this);
            }
        } else if (file.isFile()) {
            y6g = new Y6G(file, this);
        } else {
            this.A00 = 2;
            return;
        }
        arrayDeque.push(y6g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.Y6G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.Y6E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.Y6G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.Y6G} */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        if (r1.length != 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r4.A00 < r1.length) goto L_0x00b1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r7 = this;
        L_0x0000:
            java.util.ArrayDeque r3 = r7.A00
            java.lang.Object r6 = r3.peek()
            X.XZT r6 = (X.XZT) r6
            if (r6 != 0) goto L_0x000e
            r0 = 2
        L_0x000b:
            r7.A00 = r0
            return
        L_0x000e:
            boolean r0 = r6 instanceof X.Y6D
            if (r0 == 0) goto L_0x0051
            r4 = r6
            X.Y6D r4 = (X.Y6D) r4
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00a8
            r0 = 1
            r4.A01 = r0
            java.io.File r4 = r4.A00
        L_0x001e:
            if (r4 == 0) goto L_0x00a3
            java.io.File r0 = r6.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00be
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x00be
            int r2 = r3.size()
            X.Y4b r1 = r7.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x00be
            java.lang.Integer r0 = r1.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x004b
            X.Y6E r0 = new X.Y6E
            r0.<init>(r4, r7)
        L_0x0047:
            r3.push(r0)
            goto L_0x0000
        L_0x004b:
            X.Y6D r0 = new X.Y6D
            r0.<init>(r4, r7)
            goto L_0x0047
        L_0x0051:
            boolean r0 = r6 instanceof X.Y6E
            if (r0 == 0) goto L_0x0089
            r5 = r6
            X.Y6E r5 = (X.Y6E) r5
            boolean r0 = r5.A01
            r4 = 1
            if (r0 != 0) goto L_0x006d
            java.io.File[] r0 = r5.A03
            if (r0 != 0) goto L_0x006d
            java.io.File r0 = r5.A00
            java.io.File[] r0 = r0.listFiles()
            r5.A03 = r0
            if (r0 != 0) goto L_0x006d
            r5.A01 = r4
        L_0x006d:
            java.io.File[] r2 = r5.A03
            if (r2 == 0) goto L_0x0082
            int r1 = r5.A00
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0082
            X.0qQ.A0A(r2)
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            r4 = r2[r1]
            goto L_0x001e
        L_0x0082:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00a3
            r5.A02 = r4
            goto L_0x0093
        L_0x0089:
            r5 = r6
            X.Y6G r5 = (X.Y6G) r5
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00a3
            r0 = 1
            r5.A00 = r0
        L_0x0093:
            java.io.File r4 = r5.A00
            goto L_0x001e
        L_0x0096:
            java.io.File r0 = r4.A00
            java.io.File[] r1 = r0.listFiles()
            r4.A02 = r1
            if (r1 == 0) goto L_0x00a3
            int r0 = r1.length
            if (r0 != 0) goto L_0x00b1
        L_0x00a3:
            r3.pop()
            goto L_0x0000
        L_0x00a8:
            java.io.File[] r1 = r4.A02
            if (r1 == 0) goto L_0x0096
            int r2 = r4.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x00a3
        L_0x00b1:
            X.0qQ.A0A(r1)
            int r2 = r4.A00
            int r0 = r2 + 1
            r4.A00 = r0
            r4 = r1[r2]
            goto L_0x001e
        L_0x00be:
            r7.A01 = r4
            r0 = 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22480Y5z.A00():void");
    }
}
