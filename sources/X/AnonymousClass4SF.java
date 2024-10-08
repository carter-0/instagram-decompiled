package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.4SF  reason: invalid class name */
public final class AnonymousClass4SF implements AnonymousClass4RS {
    public int A00 = 0;
    public long A01;
    public long A02;
    public C256633w6 A03;
    public List A04 = null;
    public final AnonymousClass4RE A05 = new AnonymousClass4RE();
    public final /* synthetic */ AnonymousClass4P4 A06;

    public final void DXp(boolean z, int i) {
        if (i == 3) {
            AnonymousClass4P4 r1 = this.A06;
            if (r1.A02 != null) {
                AnonymousClass4P4.A03(r1);
            }
        }
        for (AnonymousClass4SE A002 : this.A06.A0R) {
            A002.A00(i, z);
        }
    }

    public AnonymousClass4SF(AnonymousClass4P4 r2) {
        this.A06 = r2;
    }

    public final void DXa(AnonymousClass4P7 r4) {
        AnonymousClass4P4 r2 = this.A06;
        float f = r2.A00;
        float f2 = r4.A01;
        if (f != f2) {
            r2.A00 = f2;
            r2.A0O.A0v.DXf(f2);
        }
    }

    public final void DXm(C2612448v r5) {
        AnonymousClass4P4 r3 = this.A06;
        AnonymousClass5OZ r2 = null;
        if (r5 instanceof C2612348u) {
            int i = ((C2612348u) r5).A02;
            if (i == 0) {
                r2 = AnonymousClass5OZ.EXOPLAYER2_SOURCE;
            } else if (i == 1) {
                r2 = AnonymousClass5OZ.EXOPLAYER2_RENDERER;
            } else if (i == 2) {
                r2 = AnonymousClass5OZ.EXOPLAYER2_UNEXPECTED;
            }
        }
        r5.getCause();
        for (AnonymousClass4SE r0 : r3.A0R) {
            r0.A00.A0P(r2, r5);
        }
    }

    public final void DYJ(int i) {
        AnonymousClass4P4 r1 = this.A06;
        if (r1.A02 != null) {
            AnonymousClass4P4.A03(r1);
        }
        if (r1.A0Q.A2d) {
            for (AnonymousClass4SE r0 : r1.A0R) {
                AnonymousClass4OS r6 = r0.A00;
                if (AnonymousClass4OS.A0J(r6) && (i == 0 || i == 5)) {
                    AnonymousClass4OS.A07(r6.A0G.obtainMessage(38, new Object[]{Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime())}), r6);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r2 = r3.A02(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        if (r11.isEmpty() != false) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dri(com.google.android.exoplayer2.Timeline r31, java.lang.Object r32, int r33) {
        /*
            r30 = this;
            r10 = r30
            r11 = r32
            X.4P4 r8 = r10.A06
            boolean r0 = r11 instanceof X.C256633w6
            if (r0 == 0) goto L_0x01c2
            r1 = r31
            int r0 = r1.A02()
            if (r0 == 0) goto L_0x01c2
            X.4OI r0 = r8.A02
            if (r0 == 0) goto L_0x01c2
            X.3uU r0 = r0.A0K
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01c2
            X.4RE r0 = r10.A05
            r9 = 0
            r2 = 0
            r1.A0E(r0, r9, r2)
            long r4 = r0.A05
            r12 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r12
            long r0 = r0.A03
            long r4 = r4 + r0
            long r4 = r4 / r12
            long r0 = r10.A02
            r13 = 1
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0064
            long r0 = r10.A01
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0064
            int r0 = r10.A00
            int r1 = r0 + 1
            r10.A00 = r1
            X.4Oe r0 = r8.A0N
            X.4OS r6 = r0.A00
            android.os.Handler r12 = r6.A0G
            r7 = 2
            long[] r2 = new long[r7]
            r2[r9] = r4
            long r0 = (long) r1
            r2[r13] = r0
            r0 = 15
            android.os.Message r0 = r12.obtainMessage(r0, r2)
            X.AnonymousClass4OS.A07(r0, r6)
        L_0x005a:
            X.3w6 r11 = (X.C256633w6) r11
            r10.A03 = r11
            X.5fO r1 = r8.A04
            if (r1 == 0) goto L_0x0088
            monitor-enter(r1)
            goto L_0x0081
        L_0x0064:
            r10.A02 = r6
            r10.A01 = r4
            X.4Oe r0 = r8.A0N
            X.4OS r6 = r0.A00
            android.os.Handler r12 = r6.A0G
            r7 = 2
            long[] r1 = new long[r7]
            r1[r9] = r4
            r1[r13] = r2
            r0 = 15
            android.os.Message r0 = r12.obtainMessage(r0, r1)
            X.AnonymousClass4OS.A07(r0, r6)
            r10.A00 = r9
            goto L_0x005a
        L_0x0081:
            r1.A01 = r11     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0087:
            monitor-exit(r1)
        L_0x0088:
            X.3w6 r3 = r10.A03
            if (r3 == 0) goto L_0x01c2
            boolean r0 = r3.A0S
            r11 = 0
            if (r0 == 0) goto L_0x0106
            java.util.List r0 = r3.A0Q
            int r0 = r0.size()
            if (r0 < r13) goto L_0x0106
            X.3wM r2 = r3.A02(r9)
            int r1 = r2.A00(r7)
            r0 = -1
            if (r1 == r0) goto L_0x0106
            java.util.List r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            X.3wK r0 = (X.C256773wK) r0
            java.util.List r1 = r0.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0106
            java.lang.Object r1 = r1.get(r9)
            X.3wG r1 = (X.C256733wG) r1
            long r7 = r3.A0B
            boolean r0 = r1 instanceof X.C256723wF
            if (r0 != 0) goto L_0x0105
            X.4XD r1 = (X.AnonymousClass4XD) r1
            X.3wJ r0 = r1.A00
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r0 = r0.A06
            java.util.Iterator r17 = r0.iterator()
            r15 = r7
        L_0x00d0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r14 = r17.next()
            X.A9s r14 = (X.C39797A9s) r14
            long r4 = r14.A04
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00f6
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r11.add(r0)
        L_0x00f6:
            long r2 = r14.A03
            int r0 = r14.A02
            long r0 = (long) r0
            long r2 = r2 * r0
            long r15 = r4 + r2
            goto L_0x00d0
        L_0x00ff:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0106
        L_0x0105:
            r11 = 0
        L_0x0106:
            java.util.List r0 = r10.A04
            if (r0 != 0) goto L_0x017a
            if (r11 != 0) goto L_0x0186
        L_0x010c:
            r10.A04 = r11
            X.3w6 r0 = r10.A03
            long[] r15 = X.C256373vf.A03(r0)
            X.3w6 r0 = r10.A03
            java.lang.String r1 = X.AnonymousClass4P4.A00(r0)
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            if (r1 == 0) goto L_0x012c
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012c
            r11.add(r1)
        L_0x012c:
            X.3w6 r14 = r10.A03
            long r2 = r14.A07
            long r0 = r14.A0B
            long r4 = r14.A05
            long r7 = r14.A08
            boolean r10 = r14.A0W
            r17 = r15[r9]
            r15 = r15[r13]
            boolean r9 = r14.A0R
            java.lang.String r13 = r14.A0O
            java.lang.Long r19 = java.lang.Long.valueOf(r2)
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
            java.lang.Long r21 = java.lang.Long.valueOf(r4)
            java.lang.Long r22 = java.lang.Long.valueOf(r7)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r10)
            java.lang.Long r25 = java.lang.Long.valueOf(r17)
            java.lang.Long r26 = java.lang.Long.valueOf(r15)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r9)
            r28 = r11
            r29 = r13
            java.lang.Object[] r1 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            r0 = 17
            android.os.Message r0 = r12.obtainMessage(r0, r1)
            X.AnonymousClass4OS.A07(r0, r6)
            return
        L_0x017a:
            if (r11 == 0) goto L_0x010c
            int r1 = r0.size()
            int r0 = r11.size()
            if (r1 == r0) goto L_0x010c
        L_0x0186:
            int r1 = r11.size()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L_0x01b7
            int r2 = r11.size()
            X.4OI r0 = r6.A15
            if (r0 != 0) goto L_0x01b0
            r1 = 0
        L_0x0197:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Too many gaps received for videoId %s. NumGaps: %d"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.4Of r2 = r6.A0v
            java.lang.String r1 = "MANIFEST"
            java.lang.String r0 = "MANIFEST_GAPS_RECEIVED_MORE_THAN_EXPECTED"
            r2.E07(r1, r0, r3)
            goto L_0x010c
        L_0x01b0:
            X.4OI r0 = r6.A15
            X.3uU r0 = r0.A0K
            java.lang.String r1 = r0.A0G
            goto L_0x0197
        L_0x01b7:
            r0 = 21
            android.os.Message r0 = r12.obtainMessage(r0, r11)
            X.AnonymousClass4OS.A07(r0, r6)
            goto L_0x010c
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SF.Dri(com.google.android.exoplayer2.Timeline, java.lang.Object, int):void");
    }

    public final void DtG(AnonymousClass4RZ r10) {
        long j;
        long j2;
        for (AnonymousClass4SE r0 : this.A06.A0R) {
            AnonymousClass4OS r7 = r0.A00;
            AnonymousClass4PK r02 = (AnonymousClass4PK) r7.A19.A0G[0];
            AnonymousClass4TD r1 = r02.A05;
            if (r1 != null) {
                j = r1.C96(r02.A0B);
            } else {
                j = -9223372036854775807L;
            }
            AnonymousClass4PK r03 = (AnonymousClass4PK) r7.A19.A0G[1];
            AnonymousClass4TD r12 = r03.A05;
            if (r12 != null) {
                j2 = r12.C96(r03.A0B);
            } else {
                j2 = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                r7.A0E = j;
            }
            if (j2 != -9223372036854775807L) {
                r7.A07 = j2;
            }
        }
    }

    public final void Dud(String str) {
        AnonymousClass4P4 r2 = this.A06;
        C264474Qa r0 = r2.A09;
        if (r0 != null && (r0.A00 instanceof AnonymousClass4QY)) {
            StringBuilder sb = new StringBuilder("LoadControl debug info: ");
            sb.append((Object) null);
            sb.append(". Player debug info: ");
            sb.append(str);
            str = sb.toString();
        }
        for (AnonymousClass4SE r02 : r2.A0R) {
            r02.A00.A0v.E07("EXOPLAYER2_UNEXPECTED_STOP_LOADING", "UNKNOWN", str);
        }
    }
}
