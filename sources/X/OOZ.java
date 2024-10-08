package X;

import java.util.Iterator;
import java.util.List;

public abstract class OOZ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.GnR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.GnR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.GnR} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        return new X.C53389GnL(r12, r12, java.lang.Float.valueOf(r1), r12, r12, r12, 29, !r20, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        return new X.C53389GnL((X.C53394GnR) null, java.lang.Float.valueOf(r1), (java.lang.Float) null, (java.lang.Float) null, (java.lang.Float) null, (java.lang.Float) null, 30, !r20, r10);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53389GnL A00(X.C68152N2s r17, int r18, int r19, boolean r20) {
        /*
            r0 = r17
            X.ULb r4 = r0.A02
            java.lang.Integer r0 = r0.A03
            int r1 = r0.intValue()
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r10 = r20
            switch(r1) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0048;
                case 2: goto L_0x0074;
                case 3: goto L_0x003a;
                case 4: goto L_0x0067;
                case 5: goto L_0x002a;
                case 6: goto L_0x001b;
                default: goto L_0x0016;
            }
        L_0x0016:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x001b:
            r2 = 0
            r9 = r20 ^ 1
            r8 = 15
            X.GnL r1 = new X.GnL
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x002a:
            r2 = 0
            r9 = r20 ^ 1
            r8 = 19
            X.GnL r1 = new X.GnL
            r3 = r2
            r4 = r2
            r5 = r7
            r6 = r7
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x003a:
            r12 = 0
            int r2 = r4.A00
            int r0 = r4.A03
            int r0 = r2 - r0
            float r1 = (float) r0
            int r5 = r19 - r2
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            goto L_0x0050
        L_0x0048:
            r12 = 0
            int r1 = r4.A03
            int r0 = r4.A00
            int r1 = r1 + r0
            float r0 = (float) r1
            float r1 = -r0
        L_0x0050:
            java.lang.Float r14 = java.lang.Float.valueOf(r1)
            r19 = r20 ^ 1
            r18 = 29
            X.GnL r1 = new X.GnL
            r11 = r1
            r13 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0065:
            r1 = 0
            return r1
        L_0x0067:
            int r2 = r4.A02
            int r0 = r4.A01
            int r0 = r2 - r0
            float r1 = (float) r0
            int r6 = r18 - r2
            float r0 = (float) r6
            float r0 = r0 * r3
            float r1 = r1 + r0
            goto L_0x007b
        L_0x0074:
            int r1 = r4.A02
            int r0 = r4.A01
            int r1 = r1 + r0
            float r0 = (float) r1
            float r1 = -r0
        L_0x007b:
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            r2 = 0
            r9 = r20 ^ 1
            r8 = 30
            X.GnL r1 = new X.GnL
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OOZ.A00(X.N2s, int, int, boolean):X.GnL");
    }

    public static final C68152N2s A01(List list, long j) {
        Object obj;
        0fh.A01("findOutputItem", -589794435);
        try {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C68152N2s) obj).A01 == j) {
                    break;
                }
            }
            return (C68152N2s) obj;
        } finally {
            0fh.A00(654576426);
        }
    }
}
