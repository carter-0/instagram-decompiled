package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AGz {
    public static final AGz A00 = new Object();
    public static final List A01 = 0sr.A1P(new String[]{"DoF", "blurry", "motionBlur", "light", "colVivid", "balanceElements", "colHarmony", "aesthetics_rating", "RoT"});
    public static final List A02 = 0sr.A1P(new String[]{"dog", "pet", "cat", "animal"});
    public static final List A03 = AnonymousClass7TE.A1I("giraffe");
    public static final List A04 = 0sr.A1P(new String[]{"has_text", "stub", "reading", "study", "document"});
    public static final List A05 = AnonymousClass7TE.A1I("happy special event");
    public static final List A06 = 0sr.A1P(new String[]{"food", "drink"});
    public static final List A07 = AnonymousClass7TE.A1I("landmark");
    public static final List A08;
    public static final List A09 = 0sr.A1P(new String[]{"violence", "nudity"});
    public static final List A0A = AnonymousClass7TE.A1I("foodstuff");
    public static final List A0B;
    public static final List A0C = 0sr.A1P(new String[]{"child", "face", "smiling", "people"});
    public static final List A0D = AnonymousClass7TE.A1I("plant");
    public static final List A0E = AnonymousClass7TE.A1I("sports");
    public static final List A0F = AnonymousClass7TE.A1I("vehicle");
    public static final List A0G;
    public static final List A0H = 0sr.A1P(new String[]{"no_occluded", "occluded"});

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r1 != 3) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r14.length > 5) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(X.C353698Is r18, java.util.List r19, org.pytorch.Tensor[] r20, boolean r21) {
        /*
            r17 = this;
            r13 = 0
            r12 = 1
            r14 = r20
            X.0qQ.A0B(r14, r12)
            r11 = 2
            r15 = r18
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0q(r15, r11)
            java.util.Iterator r16 = r19.iterator()
        L_0x0012:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r9 = r16.next()
            X.8Iv r9 = (X.C353728Iv) r9
            X.8Iv r0 = X.C353728Iv.EMBEDDINGS
            r8 = 0
            if (r9 != r0) goto L_0x0036
            int r0 = r14.length
            r2 = 5
            if (r0 <= r2) goto L_0x0036
        L_0x0027:
            r0 = r20[r2]
            float[] r1 = r0.getDataAsFloatArray()
            X.AHB r0 = new X.AHB
            r0.<init>(r9, r8, r8, r1)
            r10.add(r0)
            goto L_0x0012
        L_0x0036:
            X.8Iv r0 = X.C353728Iv.VISUAL_EMBEDDINGS
            r2 = 3
            if (r9 != r0) goto L_0x003f
            int r0 = r14.length
            if (r0 <= r2) goto L_0x003f
            goto L_0x0027
        L_0x003f:
            int r1 = r9.ordinal()
            if (r1 == r13) goto L_0x00b0
            if (r1 == r11) goto L_0x00ad
            if (r1 == r12) goto L_0x00aa
            if (r1 != r2) goto L_0x0012
            java.util.List r7 = A0H
        L_0x004d:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r5 = 0
            r0 = 4
            if (r1 == r13) goto L_0x0061
            if (r1 == r11) goto L_0x005f
            if (r1 == r12) goto L_0x0063
            if (r1 == r2) goto L_0x0064
        L_0x005b:
            r10.addAll(r6)
            goto L_0x0012
        L_0x005f:
            r0 = 1
            goto L_0x0064
        L_0x0061:
            r0 = 0
            goto L_0x0064
        L_0x0063:
            r0 = 2
        L_0x0064:
            r0 = r20[r0]
            float[] r4 = r0.getDataAsFloatArray()
            int r1 = r7.size()
            int r0 = r4.length
            if (r1 != r0) goto L_0x005b
            int r3 = r7.size()
        L_0x0075:
            if (r5 >= r3) goto L_0x005b
            X.8Iv r0 = X.C353728Iv.CONCEPT_SCORES
            if (r9 != r0) goto L_0x0095
            r1 = r4[r5]
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0090
            java.util.List r1 = A03
            java.lang.Object r0 = r7.get(r5)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0095
        L_0x0090:
            if (r21 != 0) goto L_0x0095
        L_0x0092:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x0095:
            java.lang.Object r2 = r7.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            r0 = r4[r5]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.AHB r0 = new X.AHB
            r0.<init>(r9, r1, r2, r8)
            r6.add(r0)
            goto L_0x0092
        L_0x00aa:
            java.util.List r7 = A01
            goto L_0x004d
        L_0x00ad:
            java.util.List r7 = A09
            goto L_0x004d
        L_0x00b0:
            java.util.List r7 = r15.A00()
            goto L_0x004d
        L_0x00b5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGz.A01(X.8Is, java.util.List, org.pytorch.Tensor[], boolean):java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.AGz, java.lang.Object] */
    static {
        List A1I = AnonymousClass7TE.A1I("waterside");
        A0G = A1I;
        List A1I2 = AnonymousClass7TE.A1I("outdoors");
        A0B = A1I2;
        A08 = 00k.A0S(A1I, 00k.A0S(A1I2, 0sr.A1P(new String[]{"ocean", "river", "castle", "coast", "mountain", "pond", "lake", "snow_mountain"})));
    }

    public static final float A00(List list, List list2) {
        double d;
        double d2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            AHB ahb = (AHB) next;
            if (ahb.A03 == C353728Iv.CONCEPT_SCORES && 00k.A0u(list, ahb.A01)) {
                A1C.add(next);
            }
        }
        Iterator it = A1C.iterator();
        if (!it.hasNext()) {
            return 0.0f;
        }
        Float f = ((AHB) it.next()).A00;
        if (f != null) {
            d = (double) f.floatValue();
        } else {
            d = 0.0d;
        }
        while (it.hasNext()) {
            Float f2 = ((AHB) it.next()).A00;
            if (f2 != null) {
                d2 = (double) f2.floatValue();
            } else {
                d2 = 0.0d;
            }
            d = Math.max(d, d2);
        }
        Double valueOf = Double.valueOf(d);
        if (valueOf != null) {
            return (float) valueOf.doubleValue();
        }
        return 0.0f;
    }
}
