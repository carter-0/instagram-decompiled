package com.meta.compose.component.swipeable;

import X.00k;
import X.0Yt;
import X.0qQ;
import X.0sK;
import X.0sP;
import X.1Hj;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass5b9;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C3025664b;
import X.C51967G9n;
import X.C51969G9p;
import X.C51970G9q;
import X.C54609HKs;
import X.C56836IEh;
import X.C58027IkK;
import X.C58095ImH;
import X.C58686Ivv;
import X.C59098J6g;
import X.C59324JFc;
import X.C60340gF;
import X.C62130rc;
import X.DbW;
import X.GQV;
import X.JNP;
import java.util.Map;

public final class SwipeableState {
    public float A00;
    public float A01;
    public final AnonymousClass5b9 A02;
    public final JNP A03;
    public final C284945Oz A04;
    public final C284945Oz A05;
    public final C284945Oz A06;
    public final C284945Oz A07;
    public final C284945Oz A08 = C51969G9p.A0S(AnonymousClass7TE.A0u());
    public final C284945Oz A09;
    public final C284945Oz A0A;
    public final C284945Oz A0B;
    public final C284945Oz A0C;
    public final C284945Oz A0D;
    public final 0sP A0E;
    public final AnonymousClass0r6 A0F;

    public SwipeableState(AnonymousClass5b9 r6, Object obj, 0sP r8) {
        int A032 = DbW.A03(2, r6, r8);
        this.A02 = r6;
        this.A0E = r8;
        this.A07 = C51970G9q.A0S(obj);
        Float A0g = C51967G9n.A0g();
        this.A09 = C51969G9p.A0S(A0g);
        this.A0A = C51969G9p.A0S(A0g);
        this.A04 = C51969G9p.A0S(A0g);
        this.A06 = C51969G9p.A0S((Object) null);
        this.A05 = C51969G9p.A0S(0Yt.A0E());
        this.A0F = new C62130rc(new C58027IkK(C3025664b.A02(C58686Ivv.A00(this, 28)), A032));
        this.A01 = Float.NEGATIVE_INFINITY;
        this.A00 = Float.POSITIVE_INFINITY;
        this.A0C = C51969G9p.A0S(C59324JFc.A00);
        this.A0D = C51969G9p.A0S(A0g);
        this.A0B = C51969G9p.A0S((Object) null);
        C59098J6g A012 = C59098J6g.A01(this, 23);
        0sK r0 = GQV.A00;
        this.A03 = new C56836IEh(A012);
    }

    public static final Object A00(AnonymousClass5b9 r3, SwipeableState swipeableState, AnonymousClass4D7 r5, float f) {
        Object AQC = swipeableState.A03.AQC(C54609HKs.A01, r5, new C58095ImH(r3, swipeableState, (AnonymousClass4D7) null, f));
        if (AQC != 1Hj.A02) {
            return C60340gF.A00;
        }
        return AQC;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Ikq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|(1:(1:(1:(6:10|12|13|78|84|87)(2:14|15))(3:16|17|18))(3:19|84|87))(4:20|(2:22|(3:24|(1:26)|(1:28))(2:29|30))(2:31|(6:33|(6:35|(2:37|(2:39|(3:41|(3:42|(1:44)|45)|85)))|63|64|65|(3:67|82|83)(1:88))(8:48|(1:50)|51|(2:53|(2:55|(3:57|(3:58|(1:60)|61)|86)))|63|64|65|(0)(0))|47|64|65|(0)(0)))|84|87)|72|73|(1:75)|(1:77)|78|84|87) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0165 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[Catch:{ CancellationException -> 0x0164, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017d A[Catch:{ all -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0181 A[Catch:{ all -> 0x0193 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.Map r12, java.util.Map r13, X.AnonymousClass4D7 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C58058Ikq
            if (r0 == 0) goto L_0x002e
            r5 = r14
            X.Ikq r5 = (X.C58058Ikq) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r5.A01 = r2
        L_0x0012:
            java.lang.Object r3 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A01
            r6 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r1) goto L_0x004d
            if (r0 == r7) goto L_0x003e
            if (r0 != r6) goto L_0x0039
            float r8 = r5.A00
            java.lang.Object r13 = r5.A03
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r2 = r5.A02
            com.meta.compose.component.swipeable.SwipeableState r2 = (com.meta.compose.component.swipeable.SwipeableState) r2
            goto L_0x0034
        L_0x002e:
            X.Ikq r5 = new X.Ikq
            r5.<init>(r11, r14)
            goto L_0x0012
        L_0x0034:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0193 }
            goto L_0x0182
        L_0x0039:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x003e:
            float r8 = r5.A00
            java.lang.Object r13 = r5.A03
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r2 = r5.A02
            com.meta.compose.component.swipeable.SwipeableState r2 = (com.meta.compose.component.swipeable.SwipeableState) r2
            X.0eS.A00(r3)     // Catch:{ CancellationException -> 0x0165 }
            goto L_0x01a6
        L_0x004d:
            X.0eS.A00(r3)
            goto L_0x01b6
        L_0x0052:
            X.0eS.A00(r3)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x008c
            A01(r11, r13)
            X.5Oz r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = X.C55213He4.A00(r0, r13)
            if (r0 == 0) goto L_0x0085
            float r3 = r0.floatValue()
            r5.A01 = r1
            X.JNP r2 = r11.A03
            r0 = 0
            X.AwB r1 = new X.AwB
            r1.<init>(r11, r0, r3)
            X.HKs r0 = X.C54609HKs.A01
            java.lang.Object r0 = r2.AQC(r0, r5, r1)
            if (r0 == r4) goto L_0x0082
            X.0gF r0 = X.C60340gF.A00
        L_0x0082:
            if (r0 != r4) goto L_0x01b6
            return r4
        L_0x0085:
            java.lang.String r0 = "The initial value must have an associated anchor."
            java.lang.IllegalArgumentException r3 = X.AnonymousClass7TE.A0w(r0)
            throw r3
        L_0x008c:
            boolean r0 = X.0qQ.A0K(r13, r12)
            if (r0 != 0) goto L_0x01b6
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            r11.A01 = r0
            r0 = 2139095040(0x7f800000, float:Infinity)
            r11.A00 = r0
            X.5Oz r0 = r11.A06
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            r10 = 0
            if (r1 == 0) goto L_0x00f1
            java.lang.Object r0 = r12.get(r1)
            java.lang.Float r0 = X.C55213He4.A00(r0, r13)
            if (r0 != 0) goto L_0x014c
            java.util.Iterator r9 = X.DbV.A16(r13)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r10 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            float r0 = X.AnonymousClass7TE.A04(r10)
            float r8 = r1.floatValue()
            float r3 = X.AnonymousClass7TE.A00(r0, r8)
        L_0x00cf:
            java.lang.Object r2 = r9.next()
            float r0 = X.AnonymousClass7TE.A04(r2)
            float r1 = X.AnonymousClass7TE.A00(r0, r8)
            int r0 = java.lang.Float.compare(r3, r1)
            if (r0 <= 0) goto L_0x00e3
            r10 = r2
            r3 = r1
        L_0x00e3:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x00cf
        L_0x00e9:
            X.0qQ.A0A(r10)
            float r8 = X.AnonymousClass7TE.A04(r10)
            goto L_0x0150
        L_0x00f1:
            X.5Oz r8 = r11.A09
            java.lang.Object r0 = r8.getValue()
            java.lang.Object r0 = r12.get(r0)
            X.5Oz r2 = r11.A07
            boolean r1 = X.C51969G9p.A1U(r2, r0)
            if (r1 == 0) goto L_0x0107
            java.lang.Object r0 = r2.getValue()
        L_0x0107:
            java.lang.Float r0 = X.C55213He4.A00(r0, r13)
            if (r0 != 0) goto L_0x014c
            java.util.Iterator r9 = X.DbV.A16(r13)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r10 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e9
            float r1 = X.AnonymousClass7TE.A04(r10)
            float r0 = X.C51971G9r.A02(r8)
            float r3 = X.AnonymousClass7TE.A00(r1, r0)
        L_0x012d:
            java.lang.Object r2 = r9.next()
            float r1 = X.AnonymousClass7TE.A04(r2)
            float r0 = X.C51971G9r.A02(r8)
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            int r0 = java.lang.Float.compare(r3, r1)
            if (r0 <= 0) goto L_0x0145
            r10 = r2
            r3 = r1
        L_0x0145:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x012d
            goto L_0x00e9
        L_0x014c:
            float r8 = r0.floatValue()
        L_0x0150:
            X.5b9 r0 = r11.A02     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            r5.A02 = r11     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            r5.A03 = r13     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            r5.A00 = r8     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            r5.A01 = r7     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            java.lang.Object r0 = A00(r0, r11, r5, r8)     // Catch:{ CancellationException -> 0x0164, all -> 0x0161 }
            if (r0 == r4) goto L_0x01b8
            goto L_0x01a5
        L_0x0161:
            r3 = move-exception
            r2 = r11
            goto L_0x0194
        L_0x0164:
            r2 = r11
        L_0x0165:
            r5.A02 = r2     // Catch:{ all -> 0x0193 }
            r5.A03 = r13     // Catch:{ all -> 0x0193 }
            r5.A00 = r8     // Catch:{ all -> 0x0193 }
            r5.A01 = r6     // Catch:{ all -> 0x0193 }
            X.JNP r3 = r2.A03     // Catch:{ all -> 0x0193 }
            r0 = 0
            X.AwB r1 = new X.AwB     // Catch:{ all -> 0x0193 }
            r1.<init>(r2, r0, r8)     // Catch:{ all -> 0x0193 }
            X.HKs r0 = X.C54609HKs.A01     // Catch:{ all -> 0x0193 }
            java.lang.Object r0 = r3.AQC(r0, r5, r1)     // Catch:{ all -> 0x0193 }
            if (r0 == r4) goto L_0x017f
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x0193 }
        L_0x017f:
            if (r0 != r4) goto L_0x0182
            return r4
        L_0x0182:
            java.lang.Float r0 = X.C51965G9l.A0q(r8)
            java.lang.Object r1 = X.0Yt.A01(r0, r13)
            X.5Oz r0 = r2.A07
            r0.Epw(r1)
            A01(r2, r13)
            goto L_0x01b6
        L_0x0193:
            r3 = move-exception
        L_0x0194:
            java.lang.Float r0 = X.C51965G9l.A0q(r8)
            java.lang.Object r1 = X.0Yt.A01(r0, r13)
            X.5Oz r0 = r2.A07
            r0.Epw(r1)
            A01(r2, r13)
            throw r3
        L_0x01a5:
            r2 = r11
        L_0x01a6:
            java.lang.Float r0 = X.C51965G9l.A0q(r8)
            java.lang.Object r1 = X.0Yt.A01(r0, r13)
            X.5Oz r0 = r2.A07
            r0.Epw(r1)
            A01(r2, r13)
        L_0x01b6:
            X.0gF r4 = X.C60340gF.A00
        L_0x01b8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.component.swipeable.SwipeableState.A02(java.util.Map, java.util.Map, X.4D7):java.lang.Object");
    }

    public static void A01(SwipeableState swipeableState, Map map) {
        Float A082 = 00k.A08(map.keySet());
        0qQ.A0A(A082);
        swipeableState.A01 = A082.floatValue();
        Float A072 = 00k.A07(map.keySet());
        0qQ.A0A(A072);
        swipeableState.A00 = A072.floatValue();
    }
}
