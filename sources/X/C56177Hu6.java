package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hu6  reason: case insensitive filesystem */
public abstract class C56177Hu6 {
    public static final C53406Gny A00(C307786Rm r8, C276544tV r9, long j) {
        C53426GoI goI;
        C53418GoA goA;
        if (r9.A04 == 16621) {
            String A0E = r9.A0E();
            float A01 = C51971G9r.A01(j);
            float A012 = C56179Hu8.A01(A0E, A01, A01);
            String A0F = r9.A0F();
            float A00 = C51972G9s.A00(j);
            long A002 = HSV.A00(A012, C56179Hu8.A01(A0F, A00, A00));
            C276544tV A07 = r9.A07(38);
            if (A07 != null) {
                goI = HS4.A00(A07, j);
            } else {
                goI = C53426GoI.A07;
            }
            C276544tV A072 = r9.A07(35);
            if (A072 != null) {
                goA = HS1.A00(A072, A002);
            } else {
                goA = null;
            }
            boolean A0R = r9.A0R(41, false);
            List<C276544tV> A0L = r9.A0L();
            0qQ.A07(A0L);
            ArrayList A0r = AnonymousClass7TG.A0r(A0L);
            for (C276544tV r0 : A0L) {
                0qQ.A0A(r0);
                A0r.add(A01(r8, r0, A002));
            }
            return new C53406Gny(goA, goI, A0r, A002, A0R);
        }
        throw AnonymousClass7TE.A0w("Expected Canvas group command.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.GoA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.GbN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.GbN} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if (r0 == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if (r0 == false) goto L_0x00e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C59538JNk A01(X.C307786Rm r17, X.C276544tV r18, long r19) {
        /*
            r2 = r18
            int r8 = r2.A04
            r0 = 16613(0x40e5, float:2.328E-41)
            boolean r3 = X.AnonymousClass7TF.A1S(r8, r0)
            r7 = 40
            r9 = 38
            r4 = 41
            r6 = 35
            r11 = 0
            r5 = r17
            r0 = r19
            if (r3 == 0) goto L_0x0051
            X.4tV r4 = r2.A07(r4)
            if (r4 == 0) goto L_0x01de
            X.4tV r3 = r2.A07(r9)
            if (r3 == 0) goto L_0x01d7
            X.JLY r9 = X.HS3.A00(r4, r0)
            X.JLX r8 = X.C56178Hu7.A01(r5, r3, r0)
            X.Rza r4 = X.SMJ.A00
            X.4tV r3 = r2.A07(r6)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = r3.A0K(r6)
        L_0x0039:
            int r3 = r4.A00(r3)
            X.4tV r2 = r2.A07(r7)
            if (r2 == 0) goto L_0x0047
            X.GbN r11 = X.HS2.A00(r5, r2, r0)
        L_0x0047:
            X.Gnx r10 = new X.Gnx
            r10.<init>(r11, r8, r9, r3)
        L_0x004c:
            X.JNk r10 = (X.C59538JNk) r10
            return r10
        L_0x004f:
            r3 = r11
            goto L_0x0039
        L_0x0051:
            r3 = 16618(0x40ea, float:2.3287E-41)
            if (r8 != r3) goto L_0x014c
            r3 = 45
            X.4tV r8 = r2.A07(r3)
            if (r8 == 0) goto L_0x01ec
            r3 = 43
            X.4tV r3 = r2.A07(r3)
            if (r3 == 0) goto L_0x01e5
            X.JLY r13 = X.HS3.A00(r8, r0)
            X.JLX r12 = X.C56178Hu7.A01(r5, r3, r0)
            X.Rza r8 = X.SMJ.A00
            X.4tV r3 = r2.A07(r6)
            if (r3 == 0) goto L_0x0149
            java.lang.String r3 = r3.A0K(r6)
        L_0x0079:
            int r18 = r8.A00(r3)
            r3 = 44
            X.4tV r3 = r2.A07(r3)
            if (r3 == 0) goto L_0x0089
            X.GbN r11 = X.HS2.A00(r5, r3, r0)
        L_0x0089:
            java.lang.String r0 = r2.A0K(r4)
            r1 = 0
            float r15 = X.C56179Hu8.A01(r0, r1, r1)
            java.lang.String r0 = r2.A0K(r9)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r4 = X.AnonymousClass7TF.A0j(r0)
            int r3 = r4.hashCode()
            r0 = -894674659(0xffffffffcaac591d, float:-5647502.5)
            if (r3 == r0) goto L_0x013f
            r0 = 3035667(0x2e5213, float:4.253876E-39)
            if (r3 == r0) goto L_0x00b9
            r0 = 108704142(0x67ab18e, float:4.715022E-35)
            if (r3 != r0) goto L_0x00b9
            java.lang.String r0 = "round"
            boolean r0 = r4.equals(r0)
            r19 = 1
        L_0x00b7:
            if (r0 != 0) goto L_0x00bb
        L_0x00b9:
            r19 = 0
        L_0x00bb:
            java.lang.String r0 = r2.A0K(r7)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r4 = X.AnonymousClass7TF.A0j(r0)
            int r3 = r4.hashCode()
            r0 = 93630586(0x594b07a, float:1.398268E-35)
            if (r3 == r0) goto L_0x0136
            r0 = 103906565(0x6317d05, float:3.338185E-35)
            if (r3 == r0) goto L_0x00e2
            r0 = 108704142(0x67ab18e, float:4.715022E-35)
            if (r3 != r0) goto L_0x00e2
            java.lang.String r0 = "round"
            boolean r0 = r4.equals(r0)
            r20 = 1
        L_0x00e0:
            if (r0 != 0) goto L_0x00e4
        L_0x00e2:
            r20 = 0
        L_0x00e4:
            r3 = 1082130432(0x40800000, float:4.0)
            r0 = 42
            float r16 = r2.A02(r0, r3)
            r0 = 36
            java.util.List r3 = r2.A0N(r0)
            X.0qQ.A07(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0113
            r14 = 0
        L_0x00fc:
            r0 = 53
            java.lang.String r3 = r2.A0K(r0)
            r0 = 46
            float r0 = r2.A02(r0, r1)
            float r17 = X.C56179Hu8.A01(r3, r0, r1)
            X.Go0 r10 = new X.Go0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x004c
        L_0x0113:
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x011b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = X.AnonymousClass7TE.A18(r3)
            float r0 = X.AnonymousClass6Su.A01(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.add(r0)
            goto L_0x011b
        L_0x0131:
            float[] r14 = X.00k.A0w(r4)
            goto L_0x00fc
        L_0x0136:
            java.lang.String r0 = "bevel"
            boolean r0 = r4.equals(r0)
            r20 = 2
            goto L_0x00e0
        L_0x013f:
            java.lang.String r0 = "square"
            boolean r0 = r4.equals(r0)
            r19 = 2
            goto L_0x00b7
        L_0x0149:
            r3 = r11
            goto L_0x0079
        L_0x014c:
            r3 = 16623(0x40ef, float:2.3294E-41)
            if (r8 != r3) goto L_0x01cd
            java.lang.String r4 = r2.A0K(r4)
            float r3 = X.C51971G9r.A01(r0)
            float r8 = X.C56179Hu8.A01(r4, r3, r3)
            java.lang.String r4 = r2.A0K(r9)
            float r3 = X.C51972G9s.A00(r0)
            float r3 = X.C56179Hu8.A01(r4, r3, r3)
            long r3 = X.HSV.A00(r8, r3)
            X.4tV r7 = r2.A07(r7)
            if (r7 == 0) goto L_0x01c1
            X.GoI r12 = X.HS4.A00(r7, r0)
        L_0x0176:
            r0 = 36
            X.4tV r0 = r2.A07(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0183
            X.GoA r11 = X.HS1.A00(r0, r3)
        L_0x0183:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 141(0x8d, float:1.98E-43)
            float r14 = r2.A02(r0, r1)
            X.Rza r1 = X.SMJ.A00
            X.4tV r0 = r2.A07(r6)
            if (r0 == 0) goto L_0x0197
            java.lang.String r7 = r0.A0K(r6)
        L_0x0197:
            int r15 = r1.A00(r7)
            java.util.List r0 = r2.A0L()
            X.0qQ.A07(r0)
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r1.next()
            X.4tV r0 = (X.C276544tV) r0
            X.0qQ.A0A(r0)
            X.JNk r0 = A01(r5, r0, r3)
            r13.add(r0)
            goto L_0x01aa
        L_0x01c1:
            X.GoI r12 = X.C53426GoI.A07
            goto L_0x0176
        L_0x01c4:
            X.Gnz r10 = new X.Gnz
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x004c
        L_0x01cd:
            r3 = 16621(0x40ed, float:2.3291E-41)
            if (r8 != r3) goto L_0x01f3
            X.Gny r10 = A00(r5, r2, r0)
            goto L_0x004c
        L_0x01d7:
            java.lang.String r0 = "Canvas fill command must specify the shading which should be used for drawing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01de:
            java.lang.String r0 = "Canvas fill command must specify the shape which should be drawn"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01e5:
            java.lang.String r0 = "Canvas stroke command must specify the shading which should be used for drawing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01ec:
            java.lang.String r0 = "Canvas stroke command must specify the shape which should be drawn"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01f3:
            java.lang.String r0 = "Unknown canvas command."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56177Hu6.A01(X.6Rm, X.4tV, long):X.JNk");
    }
}
