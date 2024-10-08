package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.List;

/* renamed from: X.3c1  reason: invalid class name and case insensitive filesystem */
public final class C244953c1 {
    public static final C244953c1 A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        if (r15 == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022e, code lost:
        if (r13 == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3 A[Catch:{ all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105 A[Catch:{ all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d A[Catch:{ all -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C245183cS A08(X.AnonymousClass2TY r25, X.C244943c0 r26, int r27, int r28) {
        /*
            r24 = this;
            r9 = 0
            r8 = r26
            X.0qQ.A0B(r8, r9)
            r12 = 1
            r5 = r25
            X.0qQ.A0B(r5, r12)
            java.lang.Object r10 = r8.A05
            if (r10 == 0) goto L_0x0257
            X.2VF r10 = (X.2VF) r10
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r16 = r0.isTracing()
            X.3cC r2 = r5.A02
            r2.A0G = r12
            boolean r0 = r10.CU9()
            r4 = r27
            r3 = r28
            if (r0 == 0) goto L_0x0062
            X.3cS r8 = new X.3cS
            r8.<init>()
        L_0x002b:
            r2.A01 = r4
            r2.A00 = r3
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x004e
            int r1 = r5.A02()
            int r0 = r8.A01
            if (r1 != r0) goto L_0x0047
            long r3 = r2.A02
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = (int) r0
            int r0 = r8.A00
            if (r1 == r0) goto L_0x004e
        L_0x0047:
            r0 = 0
            r2.A05 = r0
            r2.A08 = r0
            r2.A06 = r0
        L_0x004e:
            int r1 = r8.A01
            int r0 = r8.A00
            long r0 = X.C245193cT.A00(r1, r0)
            r2.A02 = r0
            if (r16 == 0) goto L_0x005d
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x005d:
            boolean r0 = r8.A02
            r2.A0F = r0
            return r8
        L_0x0062:
            X.2TR r0 = r5.A04()
            X.3mp r7 = r0.A03()
            if (r16 == 0) goto L_0x009c
            java.lang.String r1 = "measure:"
            java.lang.String r0 = r7.A0J()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.1Kb r6 = com.facebook.litho.ComponentsSystrace.A00(r0)
            java.lang.String r1 = android.view.View.MeasureSpec.toString(r4)
            X.0qQ.A07(r1)
            java.lang.String r0 = "widthSpec"
            r6.ACP(r1, r0)
            java.lang.String r1 = android.view.View.MeasureSpec.toString(r3)
            X.0qQ.A07(r1)
            java.lang.String r0 = "heightSpec"
            r6.ACP(r1, r0)
            int r1 = r7.A00
            java.lang.String r0 = "componentId"
            r6.ACO(r0, r1)
            r6.flush()
        L_0x009c:
            boolean r0 = r5 instanceof X.C245113cL     // Catch:{ Exception -> 0x0244 }
            if (r0 == 0) goto L_0x0125
            r8 = r5
            X.3cL r8 = (X.C245113cL) r8     // Catch:{ Exception -> 0x0244 }
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00     // Catch:{ Exception -> 0x0244 }
            boolean r15 = r0.isTracing()     // Catch:{ Exception -> 0x0244 }
            X.2TR r13 = r8.A01     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = "null cannot be cast to non-null type com.facebook.litho.NestedTreeHolder"
            X.0qQ.A0C(r13, r11)     // Catch:{ Exception -> 0x0244 }
            r6 = r13
            X.3bk r6 = (X.C244783bk) r6     // Catch:{ Exception -> 0x0244 }
            X.3mp r14 = r6.A03()     // Catch:{ Exception -> 0x0244 }
            boolean r0 = r10.A07     // Catch:{ Exception -> 0x0244 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0114
            X.0qQ.A0C(r13, r11)     // Catch:{ Exception -> 0x0244 }
            java.util.List r1 = r6.A0s     // Catch:{ Exception -> 0x0244 }
            int r0 = r1.size()     // Catch:{ Exception -> 0x0244 }
            X.0qQ.A0C(r13, r11)     // Catch:{ Exception -> 0x0244 }
            if (r0 != r12) goto L_0x00d2
            X.2V1 r6 = r6.A00     // Catch:{ Exception -> 0x0244 }
            if (r6 != 0) goto L_0x00de
            X.2V1 r6 = r10.A01     // Catch:{ Exception -> 0x0244 }
            goto L_0x00da
        L_0x00d2:
            java.lang.Object r0 = r1.get(r12)     // Catch:{ Exception -> 0x0244 }
            X.2Vz r0 = (X.2Vz) r0     // Catch:{ Exception -> 0x0244 }
            X.2V1 r6 = r0.A04     // Catch:{ Exception -> 0x0244 }
        L_0x00da:
            if (r6 != 0) goto L_0x00de
            goto L_0x0234
        L_0x00de:
            if (r15 == 0) goto L_0x00ed
            java.lang.String r1 = "resolveNestedTree:"
            java.lang.String r0 = r14.A0J()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0244 }
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x00ed:
            X.2TY r0 = X.AnonymousClass2VI.A01(r6, r10, r8, r4, r3)     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0105
            int r6 = r0.getWidth()     // Catch:{ all -> 0x010f }
            int r1 = r0.getHeight()     // Catch:{ all -> 0x010f }
            X.3cC r0 = r0.A02     // Catch:{ all -> 0x010f }
            java.lang.Object r0 = r0.A0B     // Catch:{ all -> 0x010f }
            X.3cS r8 = new X.3cS     // Catch:{ all -> 0x010f }
            r8.<init>(r6, r1, r0)     // Catch:{ all -> 0x010f }
            goto L_0x010b
        L_0x0105:
            r0 = 0
            X.3cS r8 = new X.3cS     // Catch:{ all -> 0x010f }
            r8.<init>(r9, r9, r0)     // Catch:{ all -> 0x010f }
        L_0x010b:
            if (r15 == 0) goto L_0x01e2
            goto L_0x01df
        L_0x010f:
            r1 = move-exception
            if (r15 == 0) goto L_0x0243
            goto L_0x0230
        L_0x0114:
            java.lang.String r1 = r14.A0J()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = ": To measure a component outside of a layout calculation use Component#measureMightNotCacheInternalNode."
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0244 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0243
        L_0x0125:
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00     // Catch:{ Exception -> 0x0244 }
            boolean r13 = r0.isTracing()     // Catch:{ Exception -> 0x0244 }
            X.2TR r6 = r5.A04()     // Catch:{ Exception -> 0x0244 }
            X.3mp r11 = r6.A03()     // Catch:{ Exception -> 0x0244 }
            X.2V1 r18 = r6.A05()     // Catch:{ Exception -> 0x0244 }
            boolean r0 = r2.A0C     // Catch:{ Exception -> 0x0244 }
            r10 = 0
            if (r0 == 0) goto L_0x015f
            X.2Tf r1 = r2.A03     // Catch:{ Exception -> 0x0244 }
            if (r1 == 0) goto L_0x015f
            X.2Te r1 = (X.C70632Te) r1     // Catch:{ Exception -> 0x0244 }
            int r0 = r1.A03     // Catch:{ Exception -> 0x0244 }
            if (r0 != r4) goto L_0x015f
            int r0 = r1.A00     // Catch:{ Exception -> 0x0244 }
            if (r0 != r3) goto L_0x015f
            int r11 = r1.A02     // Catch:{ Exception -> 0x0244 }
            int r6 = r1.A01     // Catch:{ Exception -> 0x0244 }
            java.lang.Object r9 = r1.A0C     // Catch:{ Exception -> 0x0244 }
            X.2Ta r1 = r1.A09     // Catch:{ Exception -> 0x0244 }
            r2.A0E = r12     // Catch:{ Exception -> 0x0244 }
        L_0x0154:
            r2.A0A = r1     // Catch:{ Exception -> 0x0244 }
            r2.A0B = r9     // Catch:{ Exception -> 0x0244 }
            X.3cS r8 = new X.3cS     // Catch:{ Exception -> 0x0244 }
            r8.<init>(r11, r6, r9)     // Catch:{ Exception -> 0x0244 }
            goto L_0x01e2
        L_0x015f:
            if (r13 == 0) goto L_0x016e
            java.lang.String r1 = "onMeasure:"
            java.lang.String r0 = r11.A0J()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0244 }
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x016e:
            X.2WD r6 = r6.A0R     // Catch:{ all -> 0x022d }
            if (r6 == 0) goto L_0x019a
            java.lang.Object r0 = r2.A0B     // Catch:{ all -> 0x022d }
            r8.A02 = r0     // Catch:{ all -> 0x022d }
            X.3c8 r1 = r2.A0K     // Catch:{ all -> 0x022d }
            X.3cM r0 = new X.3cM     // Catch:{ all -> 0x022d }
            r0.<init>(r1)     // Catch:{ all -> 0x022d }
            r8.A00 = r0     // Catch:{ all -> 0x022d }
            X.2Ta r1 = r6.AEy(r8, r4, r3)     // Catch:{ all -> 0x022d }
            int r11 = r1.getWidth()     // Catch:{ all -> 0x022d }
            int r6 = r1.getHeight()     // Catch:{ all -> 0x022d }
            java.lang.Object r9 = r1.BLp()     // Catch:{ all -> 0x022d }
        L_0x018f:
            java.lang.Object r0 = r2.A0B     // Catch:{ all -> 0x022d }
            boolean r0 = X.C245173cR.A03(r0, r9)     // Catch:{ all -> 0x022d }
            if (r0 != 0) goto L_0x01d6
            r2.A07 = r10     // Catch:{ all -> 0x022d }
            goto L_0x01d8
        L_0x019a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.2T3 r8 = new X.2T3     // Catch:{ all -> 0x022d }
            r8.<init>()     // Catch:{ all -> 0x022d }
            r8.A01 = r0     // Catch:{ all -> 0x022d }
            r8.A00 = r0     // Catch:{ all -> 0x022d }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x022d }
            X.3mo r11 = (X.C251253mo) r11     // Catch:{ all -> 0x022d }
            X.2Tq r9 = r11.A0d()     // Catch:{ all -> 0x022d }
            X.2TR r0 = r5.A04()     // Catch:{ all -> 0x022d }
            boolean r6 = r0.A0n     // Catch:{ all -> 0x022d }
            X.2TR r0 = r5.A04()     // Catch:{ all -> 0x022d }
            android.graphics.drawable.Drawable r1 = r0.A0B     // Catch:{ all -> 0x022d }
            X.2Tc r0 = new X.2Tc     // Catch:{ all -> 0x022d }
            r0.<init>(r1, r2, r6)     // Catch:{ all -> 0x022d }
            r19 = r9
            r20 = r8
            r21 = r0
            r22 = r4
            r23 = r3
            r17 = r11
            r17.A0q(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x022d }
            int r11 = r8.A01     // Catch:{ all -> 0x022d }
            int r6 = r8.A00     // Catch:{ all -> 0x022d }
            r1 = r10
            goto L_0x018f
        L_0x01d6:
            java.lang.Object r9 = r2.A0B     // Catch:{ all -> 0x022d }
        L_0x01d8:
            if (r13 == 0) goto L_0x0154
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0244 }
            goto L_0x0154
        L_0x01df:
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0244 }
        L_0x01e2:
            int r6 = r8.A01     // Catch:{ Exception -> 0x0244 }
            if (r6 < 0) goto L_0x01ec
            int r0 = r8.A00     // Catch:{ Exception -> 0x0244 }
            if (r0 < 0) goto L_0x01ec
            goto L_0x002b
        L_0x01ec:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
            r1.<init>()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = "MeasureOutput not set, Component is: "
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            r1.append(r7)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = " WidthSpec: "
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = X.AnonymousClass3XX.A00(r4)     // Catch:{ Exception -> 0x0244 }
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = " HeightSpec: "
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = X.AnonymousClass3XX.A00(r3)     // Catch:{ Exception -> 0x0244 }
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = " Measured width : "
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            r1.append(r6)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = " Measured Height: "
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            int r0 = r8.A00     // Catch:{ Exception -> 0x0244 }
            r1.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0244 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0244 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0243
        L_0x022d:
            r1 = move-exception
            if (r13 == 0) goto L_0x0243
        L_0x0230:
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0244 }
            goto L_0x0243
        L_0x0234:
            java.lang.String r1 = r14.A0J()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r0 = ": Null component context during measure"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0244 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x0243:
            throw r1     // Catch:{ Exception -> 0x0244 }
        L_0x0244:
            r1 = move-exception
            X.2TR r0 = r5.A04()
            X.2V1 r0 = r0.A05()
            X.2Vb.A03(r0, r1)
            X.3cS r8 = new X.3cS
            r8.<init>()
            goto L_0x002b
        L_0x0257:
            java.lang.String r1 = "render context should not be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244953c1.A08(X.2TY, X.3c0, int, int):X.3cS");
    }

    public static final AnonymousClass2TY A00(AnonymousClass2TY r32, 2TR r33, C245003c8 r34) {
        C245043cC r0 = r32.A02;
        Rect rect = new Rect(r0.A0J);
        float f = r0.A0I;
        float f2 = r0.A0H;
        int i = r0.A01;
        int i2 = r0.A00;
        long j = r0.A02;
        Object obj = r0.A0B;
        2Tg r10 = r0.A07;
        2Tg r9 = r0.A09;
        2Tg r8 = r0.A05;
        2Tg r7 = r0.A08;
        2Tg r6 = r0.A06;
        2Tf r3 = r0.A03;
        float f3 = f;
        float f4 = f2;
        int i3 = i;
        AnonymousClass2Ta r22 = r0.A0A;
        Object obj2 = obj;
        2Tg r20 = r7;
        2Tg r21 = r6;
        2Tg r18 = r9;
        2Tg r19 = r8;
        return r33.A06(new C245043cC(rect, r3, r0.A04, r10, r18, r19, r20, r21, r22, r34, obj2, f3, f4, i3, i2, j, true, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d5, code lost:
        if (r13 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass2TY A02(X.2TR r23, X.C244953c1 r24, X.C244943c0 r25, X.C245003c8 r26) {
        /*
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r8 = r0.isTracing()
            r4 = r25
            X.0eM r0 = r4.A06
            java.lang.Object r7 = r0.getValue()
            X.3bz r7 = (X.C244933bz) r7
            r6 = r23
            java.lang.Object r0 = r7.A00(r6)
            X.3c2 r0 = (X.C244963c2) r0
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.litho.LithoLayoutResult"
            r5 = r24
            r3 = r26
            if (r0 == 0) goto L_0x0055
            X.2Ta r7 = r0.A02
            if (r8 == 0) goto L_0x0035
            java.lang.String r1 = "buildYogaTreeFromCache:"
            X.3mp r0 = r6.A02()
            java.lang.String r0 = r0.A0J()
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0035:
            X.0qQ.A0C(r7, r2)
            X.2TY r7 = (X.AnonymousClass2TY) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.3cC r0 = r7.A02
            X.3c8 r0 = r0.A0K
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0
            com.facebook.yoga.YogaNodeJNIBase r0 = r0.cloneWithChildren()
            X.2TY r10 = r5.A01(r7, r4, r0, r8)
            A06(r10, r3)
            if (r8 == 0) goto L_0x0054
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0054:
            return r10
        L_0x0055:
            int r0 = r6.A02
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.A00(r0)
            X.3c2 r0 = (X.C244963c2) r0
            r18 = 0
            if (r0 == 0) goto L_0x01dc
            X.2Ta r1 = r0.A02
            X.0qQ.A0C(r1, r2)
            X.2TY r1 = (X.AnonymousClass2TY) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.3cC r0 = r1.A02
            X.3c8 r0 = r0.A0K
            X.3c8 r2 = r0.cloneWithoutChildren()
            X.2TY r10 = A00(r1, r6, r2)
            A06(r10, r3)
        L_0x0080:
            java.lang.Object r1 = r4.A05
            X.2VF r1 = (X.2VF) r1
            if (r1 == 0) goto L_0x0272
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r4, r10)
            r9 = r2
            com.facebook.yoga.YogaNodeJNIBase r9 = (com.facebook.yoga.YogaNodeJNIBase) r9
            r9.mData = r0
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x00d4
            r8 = 0
            if (r3 == 0) goto L_0x01d9
            X.2TY r11 = A03(r3)
        L_0x009b:
            X.2TY r0 = A03(r2)
            X.3cC r7 = r0.A02
            if (r11 != 0) goto L_0x01a1
            X.3mp r0 = r6.A02()
            boolean r0 = X.C251263mp.A03(r0)
            if (r0 == 0) goto L_0x01d3
            X.2Tf r13 = r1.A03
            if (r13 == 0) goto L_0x01d3
            r1.A03 = r8
        L_0x00b3:
            X.3mp r12 = r6.A03()
            r3 = r13
            X.2Te r3 = (X.C70632Te) r3
            X.3mp r1 = r3.A0D
            if (r12 == r1) goto L_0x0109
            java.lang.Class r14 = r12.getClass()
            java.lang.Class r0 = r1.getClass()
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 != 0) goto L_0x0109
            if (r11 == 0) goto L_0x00d4
            boolean r0 = X.C251263mp.A03(r12)
            if (r0 != 0) goto L_0x0109
        L_0x00d4:
            A05(r10, r6, r4)
            r8 = 0
            java.util.List r0 = r6.A0f
            int r7 = r0.size()
        L_0x00de:
            if (r8 >= r7) goto L_0x0054
            java.util.List r0 = r6.A0f
            java.lang.Object r0 = r0.get(r8)
            X.2TR r0 = (X.2TR) r0
            X.2TY r3 = A02(r0, r5, r4, r2)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.3cC r0 = r3.A02
            X.3c8 r1 = r0.A0K
            java.util.List r0 = r9.mChildren
            if (r0 != 0) goto L_0x0104
            r0 = 0
        L_0x00f9:
            r2.addChildAt(r1, r0)
            java.util.List r0 = r10.A03
            r0.add(r3)
            int r8 = r8 + 1
            goto L_0x00de
        L_0x0104:
            int r0 = r0.size()
            goto L_0x00f9
        L_0x0109:
            r7.A03 = r13
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r15 = r0.isTracing()
            if (r15 == 0) goto L_0x0124
            java.lang.String r11 = "shouldRemeasure:"
            X.3mp r0 = r6.A02()
            java.lang.String r0 = r0.A0J()
            java.lang.String r0 = X.002.A0R(r11, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0124:
            X.2WD r0 = r6.A0R
            if (r0 == 0) goto L_0x019f
            X.2WK r11 = r0.A00
        L_0x012a:
            X.2WD r0 = r3.A0A
            if (r0 == 0) goto L_0x019d
            X.2WK r0 = r0.A00
        L_0x0130:
            if (r11 == 0) goto L_0x013c
            if (r0 == 0) goto L_0x013c
            boolean r0 = X.C245173cR.A03(r11, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x013c:
            r11 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r3.A0C
            r7.A0B = r0
        L_0x014b:
            r7.A0C = r11
        L_0x014d:
            if (r15 == 0) goto L_0x00d4
            com.facebook.litho.ComponentsSystrace.A01()
            goto L_0x00d4
        L_0x0153:
            X.2WD r0 = r6.A0R
            if (r0 == 0) goto L_0x015c
            java.lang.Object r0 = r3.A0C
            r7.A0B = r0
            goto L_0x014d
        L_0x015c:
            X.3mp r14 = r6.A03()
            X.2V1 r13 = r6.A05()
            java.lang.Integer r8 = r14.A0G()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 == r0) goto L_0x014d
            X.2Vz r8 = r3.A0E     // Catch:{ Exception -> 0x0198 }
            X.2V1 r0 = r8.A04     // Catch:{ Exception -> 0x0198 }
            boolean r0 = r14.A0S(r1, r14, r0, r13)     // Catch:{ Exception -> 0x0198 }
            if (r0 != 0) goto L_0x014d
            java.util.List r1 = r6.A0s
            r0 = 0
            java.lang.Object r13 = r1.get(r0)
            X.2Vz r13 = (X.2Vz) r13
            boolean r0 = r12 instanceof X.C251253mo
            if (r0 == 0) goto L_0x014b
            X.3mo r12 = (X.C251253mo) r12
            java.lang.Object r1 = r7.A0B
            X.2Tq r1 = (X.C70672Tq) r1
            java.lang.Object r0 = r3.A0C
            X.2Tq r0 = (X.C70672Tq) r0
            r12.A0x(r1, r0)
            X.57n r1 = r13.A05
            X.57n r0 = r8.A05
            r12.A0y(r1, r0)
            goto L_0x014b
        L_0x0198:
            r0 = move-exception
            X.2Vb.A01(r14, r13, r0)
            goto L_0x014d
        L_0x019d:
            r0 = r8
            goto L_0x0130
        L_0x019f:
            r11 = r8
            goto L_0x012a
        L_0x01a1:
            X.3cC r0 = r11.A02
            X.2Tf r12 = r0.A03
            if (r12 == 0) goto L_0x00d4
            X.2TR r13 = r11.A04()
            java.util.List r0 = r13.A0f
            int r1 = r0.size()
            r3 = 0
        L_0x01b2:
            if (r3 >= r1) goto L_0x00d4
            java.util.List r0 = r13.A0f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != r6) goto L_0x01d0
            r0 = -1
            if (r3 == r0) goto L_0x00d4
            X.2Te r12 = (X.C70632Te) r12
            java.util.List r1 = r12.A0F
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x00d4
            java.lang.Object r13 = r1.get(r3)
            X.2Tf r13 = (X.2Tf) r13
            goto L_0x01d5
        L_0x01d0:
            int r3 = r3 + 1
            goto L_0x01b2
        L_0x01d3:
            X.2Tf r13 = r1.A02
        L_0x01d5:
            if (r13 != 0) goto L_0x00b3
            goto L_0x00d4
        L_0x01d9:
            r11 = r8
            goto L_0x009b
        L_0x01dc:
            boolean r8 = r6 instanceof X.C244783bk
            if (r8 == 0) goto L_0x0253
            X.3c6 r0 = X.C70622Td.A00()
            X.9dB r7 = new X.9dB
            r7.<init>(r0)
        L_0x01e9:
            if (r8 == 0) goto L_0x024b
            r2 = r6
            X.3bk r2 = (X.C244783bk) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.NestedTreeYogaLayoutProps"
            X.0qQ.A0C(r7, r0)
            r1 = r7
            X.9dB r1 = (X.C382119dB) r1
            A07(r2, r1)
            int[] r0 = r1.A01
            r2.A02 = r0
            X.2Tn r0 = r1.A00
            r2.A01 = r0
            boolean[] r0 = r1.A02
            r2.A03 = r0
        L_0x0205:
            X.3c8 r2 = r7.A03
            X.3mp r0 = r6.A03()
            boolean r0 = r0 instanceof X.C251253mo
            if (r0 == 0) goto L_0x021e
            X.3mp r1 = r6.A03()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
            X.0qQ.A0C(r1, r0)
            X.3mo r1 = (X.C251253mo) r1
            X.2Tq r18 = r1.A0d()
        L_0x021e:
            float r1 = r7.A01
            float r0 = r7.A00
            r9 = 0
            r21 = -1
            r23 = -9223372036854775808
            r25 = 0
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            X.3cC r7 = new X.3cC
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r22 = r21
            r26 = r25
            r17 = r2
            r19 = r1
            r20 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            X.2TY r10 = r6.A06(r7)
            goto L_0x0080
        L_0x024b:
            boolean r0 = r6 instanceof X.C244543bM
            if (r0 != 0) goto L_0x0205
            A07(r6, r7)
            goto L_0x0205
        L_0x0253:
            boolean r0 = r6 instanceof X.C244543bM
            if (r0 == 0) goto L_0x0267
            X.3gL r7 = new X.3gL
            r7.<init>()
            X.3c8 r0 = r7.A03
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0
            long r1 = r0.mNativePointer
            r0 = 1
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetDisplayJNI(r1, r0)
            goto L_0x01e9
        L_0x0267:
            X.3c6 r0 = X.C70622Td.A00()
            X.3c9 r7 = new X.3c9
            r7.<init>(r0)
            goto L_0x01e9
        L_0x0272:
            java.lang.String r1 = "RenderContext cannot be null when building YogaTree."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244953c1.A02(X.2TR, X.3c1, X.3c0, X.3c8):X.2TY");
    }

    public static final AnonymousClass2TY A03(C245003c8 r1) {
        Object obj = ((YogaNodeJNIBase) r1).mData;
        0qQ.A0C(obj, "null cannot be cast to non-null type android.util.Pair<*, *>");
        Object obj2 = ((Pair) obj).second;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.litho.LithoLayoutResult");
        return (AnonymousClass2TY) obj2;
    }

    public static final void A04(Rect rect, AnonymousClass2TE r3) {
        int i = rect.left;
        if (i > 0) {
            r3.E1a(C244143ai.LEFT, i);
        }
        int i2 = rect.top;
        if (i2 > 0) {
            r3.E1a(C244143ai.TOP, i2);
        }
        int i3 = rect.right;
        if (i3 > 0) {
            r3.E1a(C244143ai.RIGHT, i3);
        }
        int i4 = rect.bottom;
        if (i4 > 0) {
            r3.E1a(C244143ai.BOTTOM, i4);
        }
    }

    public static final void A05(AnonymousClass2TY r4, 2TR r5, C244943c0 r6) {
        C244933bz r3 = (C244933bz) r6.A06.getValue();
        C244963c2 r2 = new C244963c2(r4, -1, -1);
        r3.A01(r5, r2);
        r3.A01(Long.valueOf((long) r5.A02), r2);
    }

    public static final void A06(AnonymousClass2TY r3, C245003c8 r4) {
        if (r4 == null) {
            C245043cC r42 = r3.A02;
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r42.A0K;
            if (Float.compare(r42.A0I, YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer)).A00) != 0) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
            if (Float.compare(r42.A0H, YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer)).A00) != 0) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v14, types: [android.util.AttributeSet, android.content.res.TypedArray] */
    public static final void A07(2TR r15, C245013c9 r16) {
        IllegalArgumentException th;
        List<C244143ai> list;
        2Tn r11;
        2Tn r112;
        2Tn r9;
        2Tn r10;
        2Tn r113;
        2Tn r114;
        C244143ai r2;
        C244143ai r22;
        C245013c9 r4 = r16;
        2TR r5 = r15;
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r4.A03;
        YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, C245023cA.A01(r15.A01()).A00);
        C243603Zl r0 = r15.A0U;
        if (r0 != null) {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(yogaNodeJNIBase.mNativePointer, r0.A00);
        }
        C243583Zi r02 = r15.A0V;
        if (r02 != null) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(yogaNodeJNIBase.mNativePointer, r02.A00);
        }
        C243573Zh r03 = r15.A0S;
        if (r03 != null) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(yogaNodeJNIBase.mNativePointer, r03.A00);
        }
        C243573Zh r04 = r15.A0T;
        if (r04 != null) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(yogaNodeJNIBase.mNativePointer, r04.A00);
        }
        C244343b2 r05 = r15.A0X;
        if (r05 != null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.mNativePointer, r05.A00);
        }
        AnonymousClass2T1 r06 = r15.A0W;
        if (r06 != null) {
            yogaNodeJNIBase.mMeasureFunction = r06;
            YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.mNativePointer, true);
        }
        boolean z = false;
        for (2Vz r23 : r15.A0s) {
            C251263mp r1 = r23.A03;
            if (r5.A0L == null || !C251263mp.A03(r1)) {
                2TC r102 = r23.A00;
                if (r102 != null) {
                    Context context = r5.A05().A0C;
                    0qQ.A07(context);
                    int i = r102.A00;
                    if (i != 0) {
                        ? r92 = 0;
                        try {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r92, C55417HhN.A00, 0, i);
                            int indexCount = obtainStyledAttributes.getIndexCount();
                            for (int i2 = 0; i2 < indexCount; i2++) {
                                int index = obtainStyledAttributes.getIndex(i2);
                                if (index == 7) {
                                    int layoutDimension = obtainStyledAttributes.getLayoutDimension(index, -1);
                                    if (layoutDimension >= 0) {
                                        r4.A06(layoutDimension);
                                    }
                                } else if (index == 8) {
                                    int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(index, -1);
                                    if (layoutDimension2 >= 0) {
                                        r4.A04(layoutDimension2);
                                    }
                                } else if (index == 16) {
                                    r4.A05(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                } else if (index == 15) {
                                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                    if (!(r4 instanceof C247443gL)) {
                                        float f = (float) dimensionPixelSize;
                                        r4.A01 = f;
                                        YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.mNativePointer, f);
                                    }
                                } else {
                                    if (index == 2) {
                                        r2 = C244143ai.LEFT;
                                    } else if (index == 3) {
                                        r2 = C244143ai.TOP;
                                    } else if (index == 4) {
                                        r2 = C244143ai.RIGHT;
                                    } else if (index == 5) {
                                        r2 = C244143ai.BOTTOM;
                                    } else if (index == 19) {
                                        r2 = C244143ai.START;
                                    } else if (index == 20) {
                                        r2 = C244143ai.END;
                                    } else if (index == 1) {
                                        r2 = C244143ai.ALL;
                                    } else {
                                        if (index == 10) {
                                            r22 = C244143ai.LEFT;
                                        } else if (index == 11) {
                                            r22 = C244143ai.TOP;
                                        } else if (index == 12) {
                                            r22 = C244143ai.RIGHT;
                                        } else if (index == 13) {
                                            r22 = C244143ai.BOTTOM;
                                        } else if (index == 21) {
                                            r22 = C244143ai.START;
                                        } else if (index == 22) {
                                            r22 = C244143ai.END;
                                        } else if (index == 9) {
                                            r22 = C244143ai.ALL;
                                        }
                                        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(index, 0);
                                        if (!(r4 instanceof C247443gL)) {
                                            YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, r22.A00, (float) dimensionPixelOffset);
                                        }
                                    }
                                    r4.E1a(r2, obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                                }
                            }
                            obtainStyledAttributes.recycle();
                        } catch (Throwable th2) {
                            th = th2;
                            if (r92 != 0) {
                                r92.recycle();
                                throw th;
                            }
                        }
                    }
                    Rect rect = r102.A02;
                    if (rect != null) {
                        A04(rect, r4);
                    }
                    C244133ah r24 = r102.A04;
                    if (r24 != null) {
                        if (((long) (r24.A0I & 1)) != 0) {
                            r4.A06(r24.A0J);
                        }
                        if (((long) (r24.A0I & 2)) != 0) {
                            r4.A03(r24.A0A);
                        }
                        if (((long) (r24.A0I & 4)) != 0) {
                            int i3 = r24.A0H;
                            if (!(r4 instanceof C247443gL)) {
                                float f2 = (float) i3;
                                r4.A01 = f2;
                                YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.mNativePointer, f2);
                            }
                        }
                        if (((long) (r24.A0I & 8)) != 0) {
                            float f3 = r24.A09;
                            if (!(r4 instanceof C247443gL)) {
                                r4.A01 = f3;
                                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f3);
                            }
                        }
                        if (((long) (r24.A0I & 16)) != 0) {
                            int i4 = r24.A0F;
                            if (!(r4 instanceof C247443gL)) {
                                float f4 = (float) i4;
                                r4.A01 = f4;
                                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.mNativePointer, f4);
                            }
                        }
                        if (((long) (r24.A0I & 32)) != 0) {
                            float f5 = r24.A07;
                            if (!(r4 instanceof C247443gL)) {
                                r4.A01 = f5;
                                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f5);
                            }
                        }
                        if (((long) (r24.A0I & 64)) != 0) {
                            r4.A04(r24.A0D);
                        }
                        if (((long) (r24.A0I & 128)) != 0) {
                            r4.A02(r24.A05);
                        }
                        if (((long) (r24.A0I & 256)) != 0) {
                            r4.A05(r24.A0G);
                        }
                        if (((long) (r24.A0I & 512)) != 0) {
                            float f6 = r24.A08;
                            if (!(r4 instanceof C247443gL)) {
                                r4.A00 = f6;
                                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f6);
                            }
                        }
                        if (((long) (r24.A0I & 1024)) != 0) {
                            int i5 = r24.A0E;
                            if (!(r4 instanceof C247443gL)) {
                                float f7 = (float) i5;
                                r4.A00 = f7;
                                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.mNativePointer, f7);
                            }
                        }
                        if (((long) (r24.A0I & C249703kE.FLAG_MOVED)) != 0) {
                            float f8 = r24.A06;
                            if (!(r4 instanceof C247443gL)) {
                                r4.A00 = f8;
                                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f8);
                            }
                        }
                        if (((long) (r24.A0I & 4096)) != 0) {
                            C244703bc r07 = r24.A0Q;
                            r07.getClass();
                            int i6 = r07.A00;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, C245023cA.A01(i6).A00);
                            }
                        }
                        if (((long) (r24.A0I & 8192)) != 0) {
                            C243573Zh r08 = r24.A0R;
                            r08.getClass();
                            r4.A07(r08);
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET)) != 0) {
                            float f9 = r24.A01;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetFlexJNI(yogaNodeJNIBase.mNativePointer, f9);
                            }
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_PGO)) != 0) {
                            r4.A00(r24.A03);
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_PGO_ATTEMPTED)) != 0) {
                            r4.A01(r24.A04);
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP)) != 0) {
                            int i7 = r24.A0B;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisJNI(yogaNodeJNIBase.mNativePointer, (float) i7);
                            }
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED)) != 0) {
                            float f10 = r24.A02;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(yogaNodeJNIBase.mNativePointer, f10);
                            }
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_WITH_VDEX_ODEX)) != 0) {
                            float f11 = r24.A00;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetAspectRatioJNI(yogaNodeJNIBase.mNativePointer, f11);
                            }
                        }
                        if (((long) (r24.A0I & Constants.LOAD_RESULT_NEED_REOPTIMIZATION)) != 0) {
                            C244413b9 r09 = r24.A0T;
                            r09.getClass();
                            r4.A0B(r09);
                        }
                        if (!(((long) (r24.A0I & 2097152)) == 0 || (r114 = r24.A0P) == null)) {
                            int i8 = 2Tn.A03;
                            for (int i9 = 0; i9 < i8; i9++) {
                                float A01 = r114.A01(i9);
                                if (!C244163ak.A00(A01)) {
                                    C244143ai A002 = C244143ai.A00(i9);
                                    0qQ.A07(A002);
                                    int i10 = (int) A01;
                                    if (!(r4 instanceof C247443gL)) {
                                        YogaNative.jni_YGNodeStyleSetPositionJNI(yogaNodeJNIBase.mNativePointer, A002.A00, (float) i10);
                                    }
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & 4194304)) == 0 || (r113 = r24.A0O) == null)) {
                            int i11 = 2Tn.A03;
                            for (int i12 = 0; i12 < i11; i12++) {
                                float A012 = r113.A01(i12);
                                if (!C244163ak.A00(A012)) {
                                    C244143ai A003 = C244143ai.A00(i12);
                                    0qQ.A07(A003);
                                    if (!(r4 instanceof C247443gL)) {
                                        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(yogaNodeJNIBase.mNativePointer, A003.A00, A012);
                                    }
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE)) == 0 || (r10 = r24.A0N) == null)) {
                            int i13 = 2Tn.A03;
                            for (int i14 = 0; i14 < i13; i14++) {
                                float A013 = r10.A01(i14);
                                if (!C244163ak.A00(A013)) {
                                    C244143ai A004 = C244143ai.A00(i14);
                                    0qQ.A07(A004);
                                    r4.E1a(A004, (int) A013);
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & 16777216)) == 0 || (r9 = r24.A0M) == null)) {
                            int i15 = 2Tn.A03;
                            for (int i16 = 0; i16 < i15; i16++) {
                                float A014 = r9.A01(i16);
                                if (!C244163ak.A00(A014)) {
                                    C244143ai A005 = C244143ai.A00(i16);
                                    0qQ.A07(A005);
                                    r4.A09(A005, A014);
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & 33554432)) == 0 || (r112 = r24.A0L) == null)) {
                            int i17 = 2Tn.A03;
                            for (int i18 = 0; i18 < i17; i18++) {
                                float A015 = r112.A01(i18);
                                if (!C244163ak.A00(A015)) {
                                    C244143ai A006 = C244143ai.A00(i18);
                                    0qQ.A07(A006);
                                    int i19 = (int) A015;
                                    if (!(r4 instanceof C247443gL)) {
                                        YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, A006.A00, (float) i19);
                                    }
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & 67108864)) == 0 || (r11 = r24.A0K) == null)) {
                            int i20 = 2Tn.A03;
                            for (int i21 = 0; i21 < i20; i21++) {
                                float A016 = r11.A01(i21);
                                if (!C244163ak.A00(A016)) {
                                    C244143ai A007 = C244143ai.A00(i21);
                                    0qQ.A07(A007);
                                    if (!(r4 instanceof C247443gL)) {
                                        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(yogaNodeJNIBase.mNativePointer, A007.A00, A016);
                                    }
                                }
                            }
                        }
                        if (!(((long) (r24.A0I & 134217728)) == 0 || (list = r24.A0U) == null)) {
                            for (C244143ai A08 : list) {
                                r4.A08(A08);
                            }
                        }
                        if (((long) (r24.A0I & 268435456)) != 0) {
                            boolean z2 = r24.A0V;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(yogaNodeJNIBase.mNativePointer, z2);
                            }
                        }
                        if (r24.A0W && !(r4 instanceof C247443gL)) {
                            yogaNodeJNIBase.mBaselineFunction = WL1.A00;
                            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.mNativePointer, true);
                        }
                        C390999sB r8 = r24.A0S;
                        if (r8 != null) {
                            int i22 = r24.A0C;
                            if (!(r4 instanceof C247443gL)) {
                                YogaNative.jni_YGNodeStyleSetGapJNI(yogaNodeJNIBase.mNativePointer, r8.A00, (float) i22);
                            }
                        }
                    }
                }
            } else if (!z) {
                C244783bk r25 = r5.A0L;
                if (r25 != null) {
                    2TG r12 = r25.A0M;
                    if (r12 != null) {
                        if (r5.A0o || r5.A0M != null) {
                            r12.A00(r5.A09());
                        } else {
                            r5.A0M = r12;
                        }
                    }
                    long j = r5.A06;
                    if ((j & 128) == 0 || r5.A03 == 0) {
                        int i23 = r25.A03;
                        j |= 128;
                        r5.A06 = j;
                        r5.A03 = i23;
                    }
                    r5.A0k = r25.A0k;
                    if ((r25.A06 & 8589934592L) != 0) {
                        boolean z3 = r25.A0j;
                        j |= 8589934592L;
                        r5.A06 = j;
                        r5.A0j = z3;
                    }
                    if ((r25.A06 & 262144) != 0) {
                        Drawable drawable = r25.A0B;
                        j |= 262144;
                        r5.A06 = j;
                        r5.A0B = drawable;
                        r5.A0A = r25.A0A;
                    }
                    if ((r25.A06 & 524288) != 0) {
                        Drawable drawable2 = r25.A0C;
                        j |= 524288;
                        r5.A06 = j;
                        r5.A0C = drawable2;
                    }
                    if (r25.A0l) {
                        r5.A0l = true;
                    }
                    if ((r25.A06 & 1048576) != 0) {
                        2Sg r13 = r25.A0K;
                        r5.A06 = j | 1048576;
                        r5.A0K = AnonymousClass3Zk.A01(r5.A0K, r13);
                    }
                    if ((r25.A06 & 2097152) != 0) {
                        2Sg r7 = r25.A0F;
                        r5.A06 |= 2097152;
                        r5.A0F = AnonymousClass3Zk.A01(r5.A0F, r7);
                    }
                    if ((r25.A06 & 4194304) != 0) {
                        2Sg r72 = r25.A0G;
                        r5.A06 |= 4194304;
                        r5.A0G = AnonymousClass3Zk.A01(r5.A0G, r72);
                    }
                    if ((r25.A06 & 8388608) != 0) {
                        2Sg r73 = r25.A0H;
                        r5.A06 |= 8388608;
                        r5.A0H = AnonymousClass3Zk.A01(r5.A0H, r73);
                    }
                    if ((r25.A06 & 16777216) != 0) {
                        2Sg r74 = r25.A0I;
                        r5.A06 |= 16777216;
                        r5.A0I = AnonymousClass3Zk.A01(r5.A0I, r74);
                    }
                    if ((r25.A06 & 2147483648L) != 0) {
                        2Sg r75 = r25.A0J;
                        r5.A06 |= 2147483648L;
                        r5.A0J = AnonymousClass3Zk.A01(r5.A0J, r75);
                    }
                    String str = r25.A0Y;
                    if (str != null) {
                        r5.A0Y = str;
                    }
                    int[] iArr = r25.A02;
                    if (iArr != null) {
                        r5.A0C(r25.A09, r25.A0t, iArr, r25.A0u);
                    }
                    if ((r25.A06 & 134217728) != 0) {
                        String str2 = r25.A0Z;
                        String str3 = r25.A0a;
                        if (!(str2 == null || str2.length() == 0)) {
                            r5.A06 |= 134217728;
                            r5.A0Z = str2;
                            r5.A0a = str3;
                        }
                    }
                    if ((r25.A06 & 4294967296L) != 0) {
                        C243533Zd r76 = r25.A0N;
                        r5.A06 |= 4294967296L;
                        r5.A0N = r76;
                    }
                    float f12 = r25.A00;
                    if (f12 != 0.0f) {
                        r5.A00 = f12;
                    }
                    float f13 = r25.A01;
                    if (f13 != 0.0f) {
                        r5.A01 = f13;
                    }
                    if ((r25.A06 & 536870912) != 0) {
                        StateListAnimator stateListAnimator = r25.A07;
                        r5.A06 |= 536870912;
                        r5.A07 = stateListAnimator;
                        r5.A0l = true;
                    }
                    if ((r25.A06 & 1073741824) != 0) {
                        int i24 = r25.A05;
                        r5.A06 |= 1073741824;
                        r5.A05 = i24;
                        r5.A0l = true;
                    }
                    int i25 = r25.A04;
                    if (i25 != -1) {
                        Paint paint = r25.A08;
                        r5.A04 = i25;
                        r5.A08 = paint;
                    }
                    2Tn r14 = r25.A01;
                    boolean[] zArr = r25.A03;
                    r5.A0D = r14;
                    r5.A0q = zArr;
                }
                r5.A0i = 2TR.A0w.A03(r5);
                Rect rect2 = r5.A0A;
                if (rect2 != null) {
                    A04(rect2, r4);
                }
                z = true;
            }
        }
        if ((r5.A06 & 268435456) != 0) {
            int[] iArr2 = r5.A0v;
            int i26 = 0;
            loop9:
            while (true) {
                C244143ai r17 = C244143ai.LEFT;
                while (true) {
                    r4.A0A(r17, (float) iArr2[i26]);
                    i26++;
                    if (i26 < 4) {
                        if (i26 < 0) {
                            th = new IllegalArgumentException(002.A0O("Given index out of range of acceptable edges: ", i26));
                            break loop9;
                        } else if (i26 != 0) {
                            if (i26 == 1) {
                                r17 = C244143ai.TOP;
                            } else if (i26 != 2) {
                                r17 = C244143ai.BOTTOM;
                            } else {
                                r17 = C244143ai.RIGHT;
                            }
                        }
                    } else {
                        break loop9;
                    }
                }
            }
            throw th;
        }
        2Tn r82 = r5.A0D;
        if (r82 != null) {
            int i27 = 2Tn.A03;
            for (int i28 = 0; i28 < i27; i28++) {
                float A017 = r82.A01(i28);
                if (!C244163ak.A00(A017)) {
                    C244143ai A008 = C244143ai.A00(i28);
                    0qQ.A07(A008);
                    boolean[] zArr2 = r5.A0q;
                    if (zArr2 == null || Boolean.valueOf(zArr2[A008.A00]) == null) {
                        r4.E1a(A008, (int) A017);
                    } else {
                        r4.A09(A008, A017);
                    }
                }
            }
        }
        r5.A0n = r4.A02;
    }

    private final AnonymousClass2TY A01(AnonymousClass2TY r7, C244943c0 r8, C245003c8 r9, boolean z) {
        2TR A04 = r7.A04();
        AnonymousClass2TY A002 = A00(r7, A04, r9);
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r9;
        yogaNodeJNIBase.mData = new Pair(r8, A002);
        A05(A002, A04, r8);
        List list = r7.A03;
        int size = list.size();
        int i = 0;
        while (i < size) {
            AnonymousClass2TY r1 = (AnonymousClass2TY) list.get(i);
            List list2 = yogaNodeJNIBase.mChildren;
            if (list2 != null) {
                C245003c8 r0 = (C245003c8) list2.get(i);
                0qQ.A07(r0);
                A002.A03.add(A01(r1, r8, r0, z));
                i++;
            } else {
                throw new IllegalStateException("YogaNode does not have children");
            }
        }
        return A002;
    }
}
