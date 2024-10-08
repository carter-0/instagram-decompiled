package X;

import androidx.compose.ui.unit.Constraints;

public final class GR8 implements JP9, AnonymousClass6IB {
    public JQZ A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public C55794Hna A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass6H9 A08;
    public final /* synthetic */ C305566Io A09;

    public final void Cli() {
        this.A03 = true;
    }

    public GR8(C305566Io r1, AnonymousClass6H9 r2, int i, long j) {
        this.A09 = r1;
        this.A06 = i;
        this.A07 = j;
        this.A08 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (r0 < r1) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0276 A[Catch:{ all -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02d3 A[Catch:{ all -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ all -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ATI(X.JLB r19) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            boolean r0 = r10.A01
            r2 = 1
            if (r0 != 0) goto L_0x007c
            X.6Io r0 = r10.A09
            X.6I5 r0 = r0.A00
            X.0sa r0 = r0.A01
            java.lang.Object r0 = r0.invoke()
            X.6J1 r0 = (X.AnonymousClass6J1) r0
            int r1 = r0.getItemCount()
            int r0 = r10.A06
            if (r0 < 0) goto L_0x007c
            if (r0 >= r1) goto L_0x007c
        L_0x001f:
            r12 = 0
            if (r2 == 0) goto L_0x02f7
            X.6Io r13 = r10.A09
            X.6I5 r14 = r13.A00
            X.0sa r15 = r14.A01
            java.lang.Object r0 = r15.invoke()
            X.6J1 r0 = (X.AnonymousClass6J1) r0
            int r7 = r10.A06
            java.lang.Object r9 = r0.Aqn(r7)
            X.JQZ r1 = r10.A00
            r0 = 0
            if (r1 == 0) goto L_0x003a
            r0 = 1
        L_0x003a:
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0104
            if (r9 == 0) goto L_0x0077
            X.6H9 r6 = r10.A08
            X.0vs r1 = r6.A02
            int r0 = r1.A02(r9)
            if (r0 < 0) goto L_0x0077
            long r2 = r1.A03(r9)
        L_0x004f:
            r0 = r11
            X.GR1 r0 = (X.GR1) r0
            long r0 = r0.A00
            long r16 = java.lang.System.nanoTime()
            long r0 = r0 - r16
            long r16 = java.lang.Math.max(r4, r0)
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0066
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x006a
        L_0x0066:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f6
        L_0x006a:
            long r16 = java.lang.System.nanoTime()
            r1 = -1980615759(0xffffffff89f233b1, float:-5.830799E-33)
            java.lang.String r0 = "compose:lazy:prefetch:compose"
            X.0fg.A01(r0, r1)
            goto L_0x007e
        L_0x0077:
            X.6H9 r6 = r10.A08
            long r2 = r6.A00
            goto L_0x004f
        L_0x007c:
            r2 = 0
            goto L_0x001f
        L_0x007e:
            boolean r0 = r10.A01     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00bb
            java.lang.Object r0 = r15.invoke()     // Catch:{ all -> 0x00c3 }
            X.6J1 r0 = (X.AnonymousClass6J1) r0     // Catch:{ all -> 0x00c3 }
            int r0 = r0.getItemCount()     // Catch:{ all -> 0x00c3 }
            if (r7 < 0) goto L_0x00bb
            if (r7 >= r0) goto L_0x00bb
            X.JQZ r0 = r10.A00     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.Object r0 = r15.invoke()     // Catch:{ all -> 0x00c3 }
            X.6J1 r0 = (X.AnonymousClass6J1) r0     // Catch:{ all -> 0x00c3 }
            java.lang.Object r2 = r0.BK0(r7)     // Catch:{ all -> 0x00c3 }
            java.lang.Object r0 = r0.Aqn(r7)     // Catch:{ all -> 0x00c3 }
            X.0sL r1 = r14.A01(r2, r0, r7)     // Catch:{ all -> 0x00c3 }
            X.6I8 r0 = r13.A02     // Catch:{ all -> 0x00c3 }
            X.6IJ r0 = X.AnonymousClass6I8.A00(r0)     // Catch:{ all -> 0x00c3 }
            X.JQZ r0 = r0.A04(r2, r1)     // Catch:{ all -> 0x00c3 }
            r10.A00 = r0     // Catch:{ all -> 0x00c3 }
            goto L_0x00c9
        L_0x00b3:
            java.lang.String r0 = "Request was already composed!"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c2
        L_0x00bb:
            java.lang.String r0 = "Callers should check whether the request is still valid before calling performComposition()"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            r0 = 519196480(0x1ef24f40, float:2.5655524E-20)
            goto L_0x02ec
        L_0x00c9:
            r0 = 2113741757(0x7dfd23bd, float:4.206003E37)
            X.0fg.A00(r0)
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r16
            if (r9 == 0) goto L_0x00f4
            X.0vs r7 = r6.A02
            int r1 = r7.A02(r9)
            if (r1 < 0) goto L_0x0127
            long[] r0 = r7.A03
            r15 = r0[r1]
        L_0x00e3:
            r0 = r2
            int r13 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00f1
            r13 = 4
            long r15 = r15 / r13
            r0 = 3
            long r15 = r15 * r0
            long r0 = r2 / r13
            long r0 = r0 + r15
        L_0x00f1:
            r7.A04(r9, r0)
        L_0x00f4:
            long r0 = r6.A00
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0102
            r15 = 4
            long r0 = r0 / r15
            r13 = 3
            long r0 = r0 * r13
            long r2 = r2 / r15
            long r2 = r2 + r0
        L_0x0102:
            r6.A00 = r2
        L_0x0104:
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x0203
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x015f
            r0 = r11
            X.GR1 r0 = (X.GR1) r0
            long r0 = r0.A00
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            long r1 = java.lang.Math.max(r4, r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f6
            r1 = -1073439028(0xffffffffc0049ecc, float:-2.0721922)
            java.lang.String r0 = "compose:lazy:prefetch:resolve-nested"
            X.0fg.A01(r0, r1)
            goto L_0x012a
        L_0x0127:
            r15 = 0
            goto L_0x00e3
        L_0x012a:
            X.JQZ r3 = r10.A00     // Catch:{ all -> 0x02e8 }
            if (r3 == 0) goto L_0x0151
            X.0rm r2 = new X.0rm     // Catch:{ all -> 0x02e8 }
            r2.<init>()     // Catch:{ all -> 0x02e8 }
            r0 = 42
            X.J6G r1 = new X.J6G     // Catch:{ all -> 0x02e8 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02e8 }
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            r3.FHy(r1, r0)     // Catch:{ all -> 0x02e8 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x02e8 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02e8 }
            if (r1 == 0) goto L_0x014f
            X.Hna r0 = new X.Hna     // Catch:{ all -> 0x02e8 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x02e8 }
        L_0x014a:
            r10.A04 = r0     // Catch:{ all -> 0x02e8 }
            r10.A05 = r8     // Catch:{ all -> 0x02e8 }
            goto L_0x0159
        L_0x014f:
            r0 = 0
            goto L_0x014a
        L_0x0151:
            java.lang.String r1 = "Should precompose before resolving nested prefetch states"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e8 }
            throw r0     // Catch:{ all -> 0x02e8 }
        L_0x0159:
            r0 = -1719687974(0xffffffff997fa4da, float:-1.32164825E-23)
            X.0fg.A00(r0)
        L_0x015f:
            X.Hna r3 = r10.A04
            if (r3 == 0) goto L_0x0203
            int r1 = r3.A01
            java.util.List r2 = r3.A02
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0203
            X.GR8 r0 = r3.A04
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f5
            r1 = -842493018(0xffffffffcdc893a6, float:-4.20639936E8)
            java.lang.String r0 = "compose:lazy:prefetch:nested"
            X.0fg.A01(r0, r1)
        L_0x017d:
            int r1 = r3.A01     // Catch:{ all -> 0x01ed }
            int r0 = r2.size()     // Catch:{ all -> 0x01ed }
            if (r1 >= r0) goto L_0x01fd
            java.util.List[] r6 = r3.A03     // Catch:{ all -> 0x01ed }
            int r7 = r3.A01     // Catch:{ all -> 0x01ed }
            r0 = r6[r7]     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x01ae
            r0 = r11
            X.GR1 r0 = (X.GR1) r0     // Catch:{ all -> 0x01ed }
            long r0 = r0.A00     // Catch:{ all -> 0x01ed }
            long r13 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01ed }
            long r0 = r0 - r13
            long r13 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x01ed }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01a0
            goto L_0x01e8
        L_0x01a0:
            java.lang.Object r13 = r2.get(r7)     // Catch:{ all -> 0x01ed }
            X.6H8 r13 = (X.AnonymousClass6H8) r13     // Catch:{ all -> 0x01ed }
            X.0sP r1 = r13.A02     // Catch:{ all -> 0x01ed }
            if (r1 != 0) goto L_0x01d4
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x01ed }
        L_0x01ac:
            r6[r7] = r0     // Catch:{ all -> 0x01ed }
        L_0x01ae:
            int r0 = r3.A01     // Catch:{ all -> 0x01ed }
            r1 = r6[r0]     // Catch:{ all -> 0x01ed }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x01ed }
        L_0x01b5:
            int r6 = r3.A00     // Catch:{ all -> 0x01ed }
            int r0 = r1.size()     // Catch:{ all -> 0x01ed }
            if (r6 >= r0) goto L_0x01df
            int r0 = r3.A00     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01ed }
            X.6IB r0 = (X.AnonymousClass6IB) r0     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.ATI(r11)     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x01cd
            goto L_0x02f0
        L_0x01cd:
            int r0 = r3.A00     // Catch:{ all -> 0x01ed }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x01ed }
            goto L_0x01b5
        L_0x01d4:
            X.IFN r0 = new X.IFN     // Catch:{ all -> 0x01ed }
            r0.<init>(r13)     // Catch:{ all -> 0x01ed }
            r1.invoke(r0)     // Catch:{ all -> 0x01ed }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x01ed }
            goto L_0x01ac
        L_0x01df:
            r3.A00 = r12     // Catch:{ all -> 0x01ed }
            int r0 = r3.A01     // Catch:{ all -> 0x01ed }
            int r0 = r0 + 1
            r3.A01 = r0     // Catch:{ all -> 0x01ed }
            goto L_0x017d
        L_0x01e8:
            r0 = 2118415085(0x7e4472ed, float:6.5281354E37)
            goto L_0x02f3
        L_0x01ed:
            r1 = move-exception
            r0 = 553506427(0x20fdd67b, float:4.3001798E-19)
            X.0fg.A00(r0)
            throw r1
        L_0x01f5:
            java.lang.String r0 = "Should not execute nested prefetch on canceled request"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x01fd:
            r0 = 250929749(0xef4e255, float:6.0368594E-30)
            X.0fg.A00(r0)
        L_0x0203:
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x02f7
            long r6 = r10.A07
            r16 = 3
            long r0 = r16 & r6
            int r2 = (int) r0
            r3 = r2 & 1
            int r3 = r3 << r8
            r0 = r2 & 2
            int r0 = r0 >> r8
            int r0 = r0 * 3
            int r3 = r3 + r0
            r0 = 33
            long r0 = r6 >> r0
            int r2 = (int) r0
            int r0 = r3 + 13
            int r0 = r8 << r0
            int r0 = r0 - r8
            r2 = r2 & r0
            int r2 = r2 - r8
            if (r2 == 0) goto L_0x02f7
            int r0 = r3 + 15
            int r0 = r0 + 31
            long r0 = r6 >> r0
            int r2 = (int) r0
            int r0 = 18 - r3
            int r0 = r8 << r0
            int r0 = r0 - r8
            r0 = r0 & r2
            int r0 = r0 - r8
            if (r0 == 0) goto L_0x02f7
            if (r9 == 0) goto L_0x026b
            X.6H9 r13 = r10.A08
            X.0vs r1 = r13.A03
            int r0 = r1.A02(r9)
            if (r0 < 0) goto L_0x026b
            long r0 = r1.A03(r9)
        L_0x0245:
            X.GR1 r11 = (X.GR1) r11
            long r2 = r11.A00
            long r14 = java.lang.System.nanoTime()
            long r2 = r2 - r14
            long r14 = java.lang.Math.max(r4, r2)
            boolean r2 = r10.A03
            if (r2 == 0) goto L_0x025a
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x025e
        L_0x025a:
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x02f6
        L_0x025e:
            long r14 = java.lang.System.nanoTime()
            r1 = 2145048312(0x7fdad6f8, float:NaN)
            java.lang.String r0 = "compose:lazy:prefetch:measure"
            X.0fg.A01(r0, r1)
            goto L_0x0270
        L_0x026b:
            X.6H9 r13 = r10.A08
            long r0 = r13.A01
            goto L_0x0245
        L_0x0270:
            boolean r0 = r10.A01     // Catch:{ all -> 0x02e3 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r10.A02     // Catch:{ all -> 0x02e3 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02db
            r10.A02 = r8     // Catch:{ all -> 0x02e3 }
            X.JQZ r2 = r10.A00     // Catch:{ all -> 0x02e3 }
            if (r2 == 0) goto L_0x02cb
            int r1 = r2.Bco()     // Catch:{ all -> 0x02e3 }
            r0 = 0
        L_0x0287:
            if (r0 >= r1) goto L_0x028f
            r2.E3k(r0, r6)     // Catch:{ all -> 0x02e3 }
            int r0 = r0 + 1
            goto L_0x0287
        L_0x028f:
            r0 = 1131365495(0x436f4477, float:239.26744)
            X.0fg.A00(r0)
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r14
            if (r9 == 0) goto L_0x02b8
            X.0vs r10 = r13.A03
            int r1 = r10.A02(r9)
            if (r1 < 0) goto L_0x02c8
            long[] r0 = r10.A03
            r7 = r0[r1]
        L_0x02a8:
            r0 = r2
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x02b5
            r0 = 4
            long r7 = r7 / r0
            long r7 = r7 * r16
            long r0 = r2 / r0
            long r0 = r0 + r7
        L_0x02b5:
            r10.A04(r9, r0)
        L_0x02b8:
            long r6 = r13.A01
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02c5
            r0 = 4
            long r6 = r6 / r0
            long r6 = r6 * r16
            long r2 = r2 / r0
            long r2 = r2 + r6
        L_0x02c5:
            r13.A01 = r2
            return r12
        L_0x02c8:
            r7 = 0
            goto L_0x02a8
        L_0x02cb:
            java.lang.String r0 = "performComposition() must be called before performMeasure()"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02e3 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e3 }
            goto L_0x02e2
        L_0x02d3:
            java.lang.String r0 = "Callers should check whether the request is still valid before calling performMeasure()"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02e3 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e3 }
            goto L_0x02e2
        L_0x02db:
            java.lang.String r0 = "Request was already measured!"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02e3 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e3 }
        L_0x02e2:
            throw r1     // Catch:{ all -> 0x02e3 }
        L_0x02e3:
            r1 = move-exception
            r0 = -220130377(0xfffffffff2e113b7, float:-8.916219E30)
            goto L_0x02ec
        L_0x02e8:
            r1 = move-exception
            r0 = 225413558(0xd6f89b6, float:7.3813325E-31)
        L_0x02ec:
            X.0fg.A00(r0)
            throw r1
        L_0x02f0:
            r0 = 1276079220(0x4c0f6c74, float:3.7597648E7)
        L_0x02f3:
            X.0fg.A00(r0)
        L_0x02f6:
            return r8
        L_0x02f7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GR8.ATI(X.JLB):boolean");
    }

    public final void cancel() {
        if (!this.A01) {
            this.A01 = true;
            JQZ jqz = this.A00;
            if (jqz != null) {
                jqz.dispose();
            }
            this.A00 = null;
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HandleAndRequestImpl { index = ");
        A1A.append(this.A06);
        A1A.append(", constraints = ");
        A1A.append(Constraints.A05(this.A07));
        A1A.append(", isComposed = ");
        A1A.append(AnonymousClass7TF.A1V(this.A00));
        A1A.append(", isMeasured = ");
        A1A.append(this.A02);
        A1A.append(", isCanceled = ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
