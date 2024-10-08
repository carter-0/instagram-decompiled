package com.facebook.video.heroplayer.common;

import X.002;
import X.C256673wA;
import X.C256683wB;
import java.util.Map;
import java.util.TreeMap;

public abstract class MosScoreCalculation {
    public static float A00(C256683wB r2, int i, boolean z) {
        C256673wA r0 = r2.A0N;
        String str = r0.A04;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = r0.A05;
        if (str3 != null) {
            str2 = str3;
        }
        if (!z || str.isEmpty()) {
            str = str2;
        }
        return A03(A04(str), i);
    }

    public static float A01(String str, int i) {
        if (str != null) {
            float A03 = A03(A04(str), i);
            if (Float.valueOf(A03) != null) {
                return A03;
            }
        }
        return -1.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A02(java.lang.String r15, int r16, int r17) {
        /*
            r7 = r16
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = r15
            if (r15 == 0) goto L_0x00d6
            java.lang.String r0 = ""
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00d6
            r6 = r17
            r4 = r6
            java.lang.String r10 = "com.facebook.video.heroplayer.common.MosScoreCalculation"
            r5 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r15 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Called getResolutionPLabelExact with width %d, height %d"
            X.27B.A01(r10, r0, r1)
            if (r7 == 0) goto L_0x003d
            if (r17 == 0) goto L_0x003d
            if (r7 >= r6) goto L_0x0030
            r4 = r7
            r7 = r6
        L_0x0030:
            float r2 = (float) r7
            float r0 = (float) r4
            float r0 = r2 / r0
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            float r2 = r2 / r1
            int r2 = (int) r2
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0041:
            int r9 = r0.intValue()
            if (r9 <= 0) goto L_0x00d6
            java.lang.String r0 = ","
            java.lang.String[] r4 = r3.split(r0)
            int r3 = r4.length
            r14 = 0
            r8 = -1
            r2 = 0
            r7 = -1
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0054:
            if (r2 >= r3) goto L_0x0091
            r12 = r4[r2]
            java.lang.String r0 = ":"
            java.lang.String[] r11 = r12.split(r0)
            int r0 = r11.length
            java.lang.String r1 = "Skipped unsupported most score format %s"
            if (r0 == r5) goto L_0x006d
            java.lang.Object[] r0 = new java.lang.Object[]{r12}
            X.27B.A01(r10, r1, r0)
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x006d:
            r0 = r11[r14]     // Catch:{ NumberFormatException -> 0x0084 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0084 }
            if (r6 > r9) goto L_0x007d
            r0 = r11[r15]     // Catch:{ NumberFormatException -> 0x0084 }
            float r13 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0084 }
            r7 = r6
            goto L_0x006a
        L_0x007d:
            r0 = r11[r15]     // Catch:{ NumberFormatException -> 0x0084 }
            float r5 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0094
        L_0x0084:
            java.lang.Object[] r0 = new java.lang.Object[]{r12}
            X.27B.A01(r10, r1, r0)
            goto L_0x006a
        L_0x008c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0041
        L_0x0091:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = -1
        L_0x0094:
            if (r7 != r8) goto L_0x0099
            if (r6 != r8) goto L_0x0099
            return r16
        L_0x0099:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r3, r2, r1, r0}
            java.lang.String r0 = "pLabel %s, lowerQualityLabel %s, lowerMosScore %s, upperQualityLabel %s, upperMosScore %s "
            X.27B.A01(r10, r0, r1)
            r2 = 0
            if (r7 != r8) goto L_0x00be
            r16 = r5
            if (r6 != r8) goto L_0x00d6
        L_0x00bd:
            return r2
        L_0x00be:
            if (r6 == r8) goto L_0x00d5
            if (r7 == r6) goto L_0x00d5
            int r9 = r9 - r7
            float r1 = (float) r9
            float r5 = r5 - r13
            float r1 = r1 * r5
            int r6 = r6 - r7
            float r0 = (float) r6
            float r1 = r1 / r0
            float r13 = r13 + r1
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bd
            r2 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00d5
            return r2
        L_0x00d5:
            return r13
        L_0x00d6:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.common.MosScoreCalculation.A02(java.lang.String, int, int):float");
    }

    public static TreeMap A04(String str) {
        TreeMap treeMap = new TreeMap();
        String[] split = str.split(",");
        try {
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                String[] split2 = str2.split(":");
                if (split2.length == 2) {
                    treeMap.put(Integer.valueOf(Integer.parseInt(split2[0])), Float.valueOf(Float.parseFloat(split2[1])));
                    i++;
                } else {
                    throw new IllegalArgumentException(002.A0R("Ill formatted string:", str2));
                }
            }
        } catch (IllegalArgumentException | NumberFormatException unused) {
            treeMap.clear();
        }
        return treeMap;
    }

    public static float A03(TreeMap treeMap, int i) {
        Object value;
        if (treeMap.isEmpty()) {
            return 0.0f;
        }
        Integer valueOf = Integer.valueOf(i);
        if (treeMap.containsKey(valueOf)) {
            value = treeMap.get(valueOf);
        } else {
            Map.Entry lowerEntry = treeMap.lowerEntry(valueOf);
            Map.Entry higherEntry = treeMap.higherEntry(valueOf);
            if (lowerEntry == null) {
                value = higherEntry.getValue();
            } else if (higherEntry != null) {
                return ((Number) higherEntry.getValue()).floatValue() + ((((float) (((Number) higherEntry.getKey()).intValue() - i)) * (((Number) lowerEntry.getValue()).floatValue() - ((Number) higherEntry.getValue()).floatValue())) / ((float) (((Number) higherEntry.getKey()).intValue() - ((Number) lowerEntry.getKey()).intValue())));
            } else {
                value = lowerEntry.getValue();
            }
        }
        return ((Number) value).floatValue();
    }
}
