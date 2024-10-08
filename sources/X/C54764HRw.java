package X;

/* renamed from: X.HRw  reason: case insensitive filesystem */
public abstract class C54764HRw {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if ((r15 & 2) != 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r10.AGw(r12) == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r10, X.07T r11, X.AnonymousClass07Z r12, X.C62320sa r13, int r14, int r15) {
        /*
            r9 = r12
            r0 = -709389590(0xffffffffd5b792ea, float:-2.52302024E13)
            r10.ExV(r0)
            r5 = r15
            r0 = r15 & 1
            r3 = 4
            r7 = r11
            r4 = r14
            if (r0 == 0) goto L_0x00c8
            r0 = r14 | 6
        L_0x0011:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x0024
            r1 = r15 & 2
            if (r1 != 0) goto L_0x0021
            boolean r2 = r10.AGw(r12)
            r1 = 32
            if (r2 != 0) goto L_0x0023
        L_0x0021:
            r1 = 16
        L_0x0023:
            r0 = r0 | r1
        L_0x0024:
            r1 = r15 & 4
            r8 = r13
            if (r1 == 0) goto L_0x00bd
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x0049
            boolean r1 = r10.Bwn()
            if (r1 == 0) goto L_0x0049
            r10.Evl()
        L_0x003a:
            X.5Xd r0 = r10.ASQ()
            if (r0 == 0) goto L_0x0048
            r6 = 5
            X.JG6 r3 = new X.JG6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A06 = r3
        L_0x0048:
            return
        L_0x0049:
            r10.Ewr()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00b2
            boolean r1 = r10.Aw3()
            if (r1 != 0) goto L_0x00b2
            r10.Evl()
            r1 = r15 & 2
            if (r1 == 0) goto L_0x005f
        L_0x005d:
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x005f:
            boolean r1 = X.C51967G9n.A1S(r10)
            if (r1 == 0) goto L_0x006d
            r2 = 37409350(0x23ad246, float:1.3725467E-37)
            java.lang.String r1 = "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)"
            X.0fL.A01(r2, r1)
        L_0x006d:
            X.07T r1 = X.07T.ON_DESTROY
            if (r11 == r1) goto L_0x00d6
            X.5Oz r2 = X.C287175Zh.A00(r10, r13)
            r1 = 380955345(0x16b4ead1, float:2.9228758E-25)
            r10.ExT(r1)
            r0 = r0 & 14
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r3)
            boolean r0 = r10.AGu(r2)
            boolean r1 = X.C51968G9o.A1T(r10, r9, r1, r0)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x0093
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x009d
        L_0x0093:
            r1 = 15
            X.Iwy r0 = new X.Iwy
            r0.<init>(r1, r2, r9, r11)
            r10.FLL(r0)
        L_0x009d:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1V(r10)
            X.C286645Xf.A03(r10, r9, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003a
            r0 = 871056459(0x33eb444b, float:1.0955463E-7)
            X.0fL.A00(r0)
            goto L_0x003a
        L_0x00b2:
            r1 = r15 & 2
            if (r1 == 0) goto L_0x005f
            X.4bM r1 = X.AnonymousClass5YV.A00
            java.lang.Object r9 = r10.AJO(r1)
            goto L_0x005d
        L_0x00bd:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002b
            int r1 = X.G9t.A0G(r10, r13)
            r0 = r0 | r1
            goto L_0x002b
        L_0x00c8:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x00d3
            int r0 = X.G9t.A0O(r10, r11)
            r0 = r0 | r14
            goto L_0x0011
        L_0x00d3:
            r0 = r14
            goto L_0x0011
        L_0x00d6:
            java.lang.String r0 = "LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54764HRw.A00(X.5Wy, X.07T, X.07Z, X.0sa, int, int):void");
    }
}
