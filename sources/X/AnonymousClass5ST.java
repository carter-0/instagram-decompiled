package X;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.5ST  reason: invalid class name */
public final class AnonymousClass5ST extends 057 {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public AnonymousClass5ST(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final AccessibilityNodeInfoCompat A00(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        return createAccessibilityNodeInfo(androidComposeViewAccessibilityDelegateCompat.A01);
    }

    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        AndroidComposeViewAccessibilityDelegateCompat.A0C(bundle, this.A00, accessibilityNodeInfoCompat, str, i);
    }

    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        AccessibilityNodeInfoCompat A07 = AndroidComposeViewAccessibilityDelegateCompat.A07(androidComposeViewAccessibilityDelegateCompat, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0H && i == androidComposeViewAccessibilityDelegateCompat.A01) {
            androidComposeViewAccessibilityDelegateCompat.A0C = A07;
        }
        return A07;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: X.U6f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: X.U6g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: X.Gft} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: X.Gfs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: X.Gfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v98, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v99, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r2v21, types: [X.U6f, X.IGd] */
    /* JADX WARNING: type inference failed for: r2v24, types: [X.IGd, X.U6g] */
    /* JADX WARNING: type inference failed for: r2v31, types: [X.Gfs, X.IGd] */
    /* JADX WARNING: type inference failed for: r2v34, types: [X.Gfr, X.IGd] */
    /* JADX WARNING: type inference failed for: r2v77, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020c, code lost:
        r3 = false;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0211, code lost:
        if (r7 == 8192) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0215, code lost:
        r16 = false;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021b, code lost:
        if (r7 == 16908345) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x021d, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0222, code lost:
        if (r7 == 16908347) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0224, code lost:
        r14 = false;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0229, code lost:
        if (r7 == 16908344) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022b, code lost:
        r13 = false;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0230, code lost:
        if (r7 == 16908346) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0232, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0233, code lost:
        if (r15 != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0235, code lost:
        if (r14 != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0237, code lost:
        if (r3 != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0239, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x023a, code lost:
        if (r16 == false) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x023c, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x023d, code lost:
        if (r13 != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023f, code lost:
        if (r1 != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0241, code lost:
        if (r3 != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0243, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0244, code lost:
        if (r16 == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0246, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0247, code lost:
        if (r3 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0249, code lost:
        if (r16 == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x024b, code lost:
        r2 = r6.A05;
        r7 = (X.AnonymousClass6JX) X.C285765So.A00(r2, X.AnonymousClass5SZ.A0L);
        r8 = (X.C290145ep) X.C285765So.A00(r2, X.C290125en.A0M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025d, code lost:
        if (r7 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025f, code lost:
        if (r8 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0261, code lost:
        r1 = r7.A02;
        r5 = (java.lang.Number) r1.B1S();
        r4 = r5.floatValue();
        r3 = (java.lang.Number) r1.Byc();
        r2 = r3.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0279, code lost:
        if (r4 >= r2) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x027b, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027c, code lost:
        r3 = r3.floatValue();
        r2 = r5.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0286, code lost:
        if (r3 <= r2) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0288, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0289, code lost:
        r2 = r7.A01;
        r4 = r4 - r3;
        r1 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x028e, code lost:
        if (r2 <= 0) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0290, code lost:
        r1 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0292, code lost:
        r4 = r4 / ((float) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0294, code lost:
        if (r16 == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0296, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0297, code lost:
        r1 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x029b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x029d, code lost:
        r0 = r7.A00 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a0, code lost:
        r0 = r1.invoke(java.lang.Float.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02aa, code lost:
        r2 = r6.A04;
        r9 = X.C289425dZ.A00(r2.A0W.A06).A01();
        r4 = r6.A05;
        r3 = new java.util.ArrayList();
        r1 = (X.C290145ep) X.C285765So.A00(r4, X.C290125en.A07);
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c8, code lost:
        if (r1 == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02ca, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ce, code lost:
        if (r1 == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02da, code lost:
        if (((java.lang.Boolean) r1.invoke(r3)).booleanValue() == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02dc, code lost:
        r8 = (java.lang.Number) r3.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e2, code lost:
        r5 = (X.C290145ep) X.C285765So.A00(r4, X.C290125en.A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ea, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02ec, code lost:
        r6 = (X.AnonymousClass6IQ) X.C285765So.A00(r4, X.AnonymousClass5SZ.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02f5, code lost:
        if (r6 == null) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02f7, code lost:
        if (r12 == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02f9, code lost:
        if (r8 == null) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02fb, code lost:
        r3 = r8.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02ff, code lost:
        if (r15 != false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0301, code lost:
        if (r16 == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0303, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0306, code lost:
        if (r6.A02 == false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0308, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x030d, code lost:
        if (r2.A0D != X.AnonymousClass5Q8.Rtl) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x030f, code lost:
        if (r15 != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0311, code lost:
        if (r14 == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0313, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0318, code lost:
        if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r6, r3) == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x031a, code lost:
        r6 = X.C290125en.A0E;
        r2 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0322, code lost:
        if (r2.containsKey(r6) != false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x032a, code lost:
        if (r2.containsKey(X.C290125en.A0F) != false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x032c, code lost:
        r2 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0330, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0332, code lost:
        r1 = java.lang.Float.valueOf(r3);
        r0 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x033a, code lost:
        r0 = r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0340, code lost:
        r3 = X.C288025bF.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0345, code lost:
        r2 = (X.AnonymousClass6IQ) X.C285765So.A00(r4, X.AnonymousClass5SZ.A0W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x034d, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x034f, code lost:
        if (r11 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0351, code lost:
        if (r8 == null) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0353, code lost:
        r3 = r8.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0357, code lost:
        if (r13 != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0359, code lost:
        if (r16 == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x035b, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x035e, code lost:
        if (r2.A02 == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0360, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0365, code lost:
        if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0367, code lost:
        r6 = X.C290125en.A0G;
        r2 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x036f, code lost:
        if (r2.containsKey(r6) != false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0377, code lost:
        if (r2.containsKey(X.C290125en.A0D) != false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0379, code lost:
        r2 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x037d, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x037f, code lost:
        r1 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0383, code lost:
        r0 = java.lang.Float.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0388, code lost:
        r3 = X.C288025bF.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x038f, code lost:
        if (r3 <= 0.0f) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0391, code lost:
        r6 = X.C290125en.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0396, code lost:
        if (r3 <= 0.0f) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0398, code lost:
        r6 = X.C290125en.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x040a, code lost:
        if (r0 == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x057d, code lost:
        if (r0 != false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0585, code lost:
        if (r0 != false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x058c, code lost:
        if (r0 != false) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performAction(int r18, int r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r0.A00
            X.01O r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r4)
            r3 = r18
            java.lang.Object r1 = r0.A03(r3)
            X.5ex r1 = (X.C290215ex) r1
            r0 = 0
            if (r1 == 0) goto L_0x0084
            X.5SX r6 = r1.A01
            r1 = 64
            r7 = r19
            if (r7 == r1) goto L_0x03fd
            r1 = 128(0x80, float:1.794E-43)
            if (r7 == r1) goto L_0x042d
            r2 = 256(0x100, float:3.59E-43)
            r5 = 1
            r8 = r20
            if (r7 == r2) goto L_0x0444
            r1 = 512(0x200, float:7.175E-43)
            if (r7 == r1) goto L_0x0444
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r7 == r1) goto L_0x03e0
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r7 == r1) goto L_0x03bd
            boolean r1 = X.C54743HRb.A00(r6)
            if (r1 == 0) goto L_0x0084
            if (r7 == r5) goto L_0x03b8
            r1 = 2
            if (r7 == r1) goto L_0x039b
            r2 = 0
            switch(r19) {
                case 16: goto L_0x01bf;
                case 32: goto L_0x01e2;
                case 4096: goto L_0x0214;
                case 8192: goto L_0x020c;
                case 32768: goto L_0x01e8;
                case 65536: goto L_0x01ee;
                case 262144: goto L_0x01f4;
                case 524288: goto L_0x01fa;
                case 1048576: goto L_0x0200;
                case 2097152: goto L_0x009a;
                case 16908342: goto L_0x00c4;
                case 16908349: goto L_0x019d;
                case 16908372: goto L_0x0206;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r19) {
                case 16908344: goto L_0x020c;
                case 16908345: goto L_0x020c;
                case 16908346: goto L_0x020c;
                case 16908347: goto L_0x020c;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r19) {
                case 16908358: goto L_0x0088;
                case 16908359: goto L_0x008e;
                case 16908360: goto L_0x0094;
                case 16908361: goto L_0x03e5;
                default: goto L_0x0047;
            }
        L_0x0047:
            X.01s r1 = r4.A08
            java.lang.Object r1 = X.AnonymousClass01t.A00(r1, r3)
            X.01s r1 = (X.01s) r1
            if (r1 == 0) goto L_0x0084
            java.lang.Object r7 = X.AnonymousClass01t.A00(r1, r7)
            if (r7 == 0) goto L_0x0084
            X.5SV r2 = r6.A05
            X.5Sb r1 = X.C290125en.A03
            java.lang.Object r5 = X.C285765So.A00(r2, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0084
            int r4 = r5.size()
            r3 = 0
        L_0x0068:
            if (r3 >= r4) goto L_0x0084
            java.lang.Object r2 = r5.get(r3)
            X.6Eq r2 = (X.C304646Eq) r2
            java.lang.String r1 = r2.A00
            boolean r1 = X.0qQ.A0K(r1, r7)
            if (r1 == 0) goto L_0x0085
            X.0sa r0 = r2.A01
            java.lang.Object r0 = r0.invoke()
        L_0x007e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x0084:
            return r0
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x0088:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0G
            goto L_0x03e9
        L_0x008e:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0D
            goto L_0x03e9
        L_0x0094:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0E
            goto L_0x03e9
        L_0x009a:
            if (r20 == 0) goto L_0x00a2
            java.lang.String r1 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r2 = r8.getString(r1)
        L_0x00a2:
            X.5SV r3 = r6.A05
            X.5Sb r1 = X.C290125en.A0O
            java.lang.Object r1 = X.C285765So.A00(r3, r1)
            X.5ep r1 = (X.C290145ep) r1
            if (r1 == 0) goto L_0x0084
            X.0eL r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            if (r3 == 0) goto L_0x0084
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = ""
        L_0x00b8:
            X.0sn r1 = X.0sn.A00
            X.5Tq r0 = new X.5Tq
            r0.<init>(r1, r1, r2)
            java.lang.Object r0 = r3.invoke(r0)
            goto L_0x007e
        L_0x00c4:
            X.5SX r7 = r6.A07()
        L_0x00c8:
            if (r7 == 0) goto L_0x0084
            X.5SV r2 = r7.A05
            if (r2 == 0) goto L_0x0197
            X.5Sb r1 = X.C290125en.A0J
            java.lang.Object r8 = X.C285765So.A00(r2, r1)
            X.5ep r8 = (X.C290145ep) r8
            if (r8 == 0) goto L_0x0197
            X.5R6 r1 = r7.A04
            X.5RP r1 = r1.A0W
            X.4e4 r1 = r1.A06
            X.5VN r10 = X.C289425dZ.A00(r1)
            X.4ch r9 = r1.Bab()
            r1 = 0
            r3 = 0
            if (r9 == 0) goto L_0x00f0
            long r1 = r9.CgY(r1)
        L_0x00f0:
            X.5VN r9 = r10.A03(r1)
            X.4cg r2 = r6.A05()
            if (r2 == 0) goto L_0x0104
            boolean r1 = r2.COx()
            if (r1 == 0) goto L_0x0104
            long r3 = r2.CgY(r3)
        L_0x0104:
            X.4cg r1 = r6.A05()
            if (r1 == 0) goto L_0x0193
            long r1 = r1.A03
        L_0x010c:
            long r1 = X.C289155d7.A01(r1)
            X.5VN r10 = X.C289285dL.A01(r3, r1)
            X.5SV r2 = r7.A05
            X.5Sb r1 = X.AnonymousClass5SZ.A08
            java.lang.Object r11 = X.C285765So.A00(r2, r1)
            X.6IQ r11 = (X.AnonymousClass6IQ) r11
            X.5Sb r1 = X.AnonymousClass5SZ.A0W
            java.lang.Object r7 = X.C285765So.A00(r2, r1)
            X.6IQ r7 = (X.AnonymousClass6IQ) r7
            float r4 = r10.A01
            float r1 = r9.A01
            float r4 = r4 - r1
            float r3 = r10.A02
            float r1 = r9.A02
            float r3 = r3 - r1
            float r2 = java.lang.Math.signum(r4)
            float r1 = java.lang.Math.signum(r3)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0191
            float r2 = java.lang.Math.abs(r4)
            float r1 = java.lang.Math.abs(r3)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0149
            r4 = r3
        L_0x0149:
            if (r11 == 0) goto L_0x0150
            boolean r1 = r11.A02
            if (r1 != r5) goto L_0x0150
            float r4 = -r4
        L_0x0150:
            X.5R6 r1 = r6.A04
            X.5Q8 r2 = r1.A0D
            X.5Q8 r1 = X.AnonymousClass5Q8.Rtl
            if (r2 != r1) goto L_0x0159
            float r4 = -r4
        L_0x0159:
            float r3 = r10.A03
            float r1 = r9.A03
            float r3 = r3 - r1
            float r6 = r10.A00
            float r1 = r9.A00
            float r6 = r6 - r1
            float r2 = java.lang.Math.signum(r3)
            float r1 = java.lang.Math.signum(r6)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x018f
            float r2 = java.lang.Math.abs(r3)
            float r1 = java.lang.Math.abs(r6)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x017c
            r3 = r6
        L_0x017c:
            if (r7 == 0) goto L_0x0183
            boolean r1 = r7.A02
            if (r1 != r5) goto L_0x0183
            float r3 = -r3
        L_0x0183:
            X.0eL r2 = r8.A01
            X.0sL r2 = (X.0sL) r2
            if (r2 == 0) goto L_0x0084
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            goto L_0x0383
        L_0x018f:
            r3 = 0
            goto L_0x017c
        L_0x0191:
            r4 = 0
            goto L_0x0149
        L_0x0193:
            r1 = 0
            goto L_0x010c
        L_0x0197:
            X.5SX r7 = r7.A07()
            goto L_0x00c8
        L_0x019d:
            if (r20 == 0) goto L_0x0084
            java.lang.String r3 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r8.containsKey(r3)
            if (r1 == 0) goto L_0x0084
            X.5SV r2 = r6.A05
            X.5Sb r1 = X.C290125en.A0M
            java.lang.Object r1 = X.C285765So.A00(r2, r1)
            X.5ep r1 = (X.C290145ep) r1
            if (r1 == 0) goto L_0x0084
            X.0eL r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0084
            float r0 = r8.getFloat(r3)
            goto L_0x02a0
        L_0x01bf:
            X.5SV r6 = r6.A05
            X.5Sb r1 = X.C290125en.A0A
            java.lang.Object r1 = X.C285765So.A00(r6, r1)
            X.5ep r1 = (X.C290145ep) r1
            if (r1 == 0) goto L_0x01d7
            X.0eL r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r2 = r1.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x01d7:
            r1 = 0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r4, r1, r1, r3, r5)
            if (r2 == 0) goto L_0x0084
            boolean r0 = r2.booleanValue()
            return r0
        L_0x01e2:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0C
            goto L_0x03e9
        L_0x01e8:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0H
            goto L_0x03e9
        L_0x01ee:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A04
            goto L_0x03e9
        L_0x01f4:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A06
            goto L_0x03e9
        L_0x01fa:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A01
            goto L_0x03e9
        L_0x0200:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A05
            goto L_0x03e9
        L_0x0206:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0B
            goto L_0x03e9
        L_0x020c:
            r3 = 0
            r1 = 8192(0x2000, float:1.14794E-41)
            r16 = 1
            if (r7 == r1) goto L_0x021d
            goto L_0x0215
        L_0x0214:
            r3 = 1
        L_0x0215:
            r16 = 0
            r1 = 16908345(0x1020039, float:2.387739E-38)
            r15 = 1
            if (r7 == r1) goto L_0x0224
        L_0x021d:
            r15 = 0
            r1 = 16908347(0x102003b, float:2.3877394E-38)
            r14 = 1
            if (r7 == r1) goto L_0x022b
        L_0x0224:
            r14 = 0
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            r13 = 1
            if (r7 == r1) goto L_0x0232
        L_0x022b:
            r13 = 0
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            r1 = 1
            if (r7 == r2) goto L_0x0233
        L_0x0232:
            r1 = 0
        L_0x0233:
            if (r15 != 0) goto L_0x023c
            if (r14 != 0) goto L_0x023c
            if (r3 != 0) goto L_0x023c
            r12 = 0
            if (r16 == 0) goto L_0x023d
        L_0x023c:
            r12 = 1
        L_0x023d:
            if (r13 != 0) goto L_0x0246
            if (r1 != 0) goto L_0x0246
            if (r3 != 0) goto L_0x0246
            r11 = 0
            if (r16 == 0) goto L_0x02aa
        L_0x0246:
            r11 = 1
            if (r3 != 0) goto L_0x024b
            if (r16 == 0) goto L_0x02aa
        L_0x024b:
            X.5SV r2 = r6.A05
            X.5Sb r1 = X.AnonymousClass5SZ.A0L
            java.lang.Object r7 = X.C285765So.A00(r2, r1)
            X.6JX r7 = (X.AnonymousClass6JX) r7
            X.5Sb r1 = X.C290125en.A0M
            java.lang.Object r8 = X.C285765So.A00(r2, r1)
            X.5ep r8 = (X.C290145ep) r8
            if (r7 == 0) goto L_0x02aa
            if (r8 == 0) goto L_0x02aa
            X.Pxc r1 = r7.A02
            java.lang.Comparable r5 = r1.B1S()
            java.lang.Number r5 = (java.lang.Number) r5
            float r4 = r5.floatValue()
            java.lang.Comparable r3 = r1.Byc()
            java.lang.Number r3 = (java.lang.Number) r3
            float r2 = r3.floatValue()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x027c
            r4 = r2
        L_0x027c:
            float r3 = r3.floatValue()
            float r2 = r5.floatValue()
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0289
            r3 = r2
        L_0x0289:
            int r2 = r7.A01
            float r4 = r4 - r3
            r1 = 20
            if (r2 <= 0) goto L_0x0292
            int r1 = r2 + 1
        L_0x0292:
            float r1 = (float) r1
            float r4 = r4 / r1
            if (r16 == 0) goto L_0x0297
            float r4 = -r4
        L_0x0297:
            X.0eL r1 = r8.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0084
            float r0 = r7.A00
            float r0 = r0 + r4
        L_0x02a0:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            goto L_0x007e
        L_0x02aa:
            X.5R6 r2 = r6.A04
            X.5RP r1 = r2.A0W
            X.4e4 r1 = r1.A06
            X.5VN r1 = X.C289425dZ.A00(r1)
            long r9 = r1.A01()
            X.5SV r4 = r6.A05
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.5Sb r1 = X.C290125en.A07
            java.lang.Object r1 = X.C285765So.A00(r4, r1)
            X.5ep r1 = (X.C290145ep) r1
            r8 = 0
            if (r1 == 0) goto L_0x02e2
            X.0eL r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x02e2
            java.lang.Object r1 = r1.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02e2
            java.lang.Object r8 = r3.get(r0)
            java.lang.Number r8 = (java.lang.Number) r8
        L_0x02e2:
            X.5Sb r1 = X.C290125en.A0J
            java.lang.Object r5 = X.C285765So.A00(r4, r1)
            X.5ep r5 = (X.C290145ep) r5
            if (r5 == 0) goto L_0x0084
            X.5Sb r1 = X.AnonymousClass5SZ.A08
            java.lang.Object r6 = X.C285765So.A00(r4, r1)
            X.6IQ r6 = (X.AnonymousClass6IQ) r6
            r7 = 0
            if (r6 == 0) goto L_0x0345
            if (r12 == 0) goto L_0x0345
            if (r8 == 0) goto L_0x0340
            float r3 = r8.floatValue()
        L_0x02ff:
            if (r15 != 0) goto L_0x0303
            if (r16 == 0) goto L_0x0304
        L_0x0303:
            float r3 = -r3
        L_0x0304:
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0309
            float r3 = -r3
        L_0x0309:
            X.5Q8 r2 = r2.A0D
            X.5Q8 r1 = X.AnonymousClass5Q8.Rtl
            if (r2 != r1) goto L_0x0314
            if (r15 != 0) goto L_0x0313
            if (r14 == 0) goto L_0x0314
        L_0x0313:
            float r3 = -r3
        L_0x0314:
            boolean r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r6, r3)
            if (r1 == 0) goto L_0x0345
            X.5Sb r6 = X.C290125en.A0E
            java.util.Map r2 = r4.A02
            boolean r1 = r2.containsKey(r6)
            if (r1 != 0) goto L_0x038d
            X.5Sb r1 = X.C290125en.A0F
            boolean r1 = r2.containsKey(r1)
            if (r1 != 0) goto L_0x038d
            X.0eL r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            if (r2 == 0) goto L_0x0084
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
        L_0x033a:
            java.lang.Object r0 = r2.invoke(r1, r0)
            goto L_0x007e
        L_0x0340:
            float r3 = X.C288025bF.A02(r9)
            goto L_0x02ff
        L_0x0345:
            X.5Sb r1 = X.AnonymousClass5SZ.A0W
            java.lang.Object r2 = X.C285765So.A00(r4, r1)
            X.6IQ r2 = (X.AnonymousClass6IQ) r2
            if (r2 == 0) goto L_0x0084
            if (r11 == 0) goto L_0x0084
            if (r8 == 0) goto L_0x0388
            float r3 = r8.floatValue()
        L_0x0357:
            if (r13 != 0) goto L_0x035b
            if (r16 == 0) goto L_0x035c
        L_0x035b:
            float r3 = -r3
        L_0x035c:
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0361
            float r3 = -r3
        L_0x0361:
            boolean r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r2, r3)
            if (r1 == 0) goto L_0x0084
            X.5Sb r6 = X.C290125en.A0G
            java.util.Map r2 = r4.A02
            boolean r1 = r2.containsKey(r6)
            if (r1 != 0) goto L_0x0394
            X.5Sb r1 = X.C290125en.A0D
            boolean r1 = r2.containsKey(r1)
            if (r1 != 0) goto L_0x0394
            X.0eL r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            if (r2 == 0) goto L_0x0084
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
        L_0x0383:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            goto L_0x033a
        L_0x0388:
            float r3 = X.C288025bF.A00(r9)
            goto L_0x0357
        L_0x038d:
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x03e9
            X.5Sb r6 = X.C290125en.A0F
            goto L_0x03e9
        L_0x0394:
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x03e9
            X.5Sb r6 = X.C290125en.A0D
            goto L_0x03e9
        L_0x039b:
            X.5SV r2 = r6.A05
            X.5Sb r1 = X.AnonymousClass5SZ.A06
            java.lang.Object r2 = X.C285765So.A00(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0084
            androidx.compose.ui.platform.AndroidComposeView r1 = r4.A0R
            X.5QZ r2 = r1.A0S
            r1 = 8
            r2.AHe(r1, r0, r5, r5)
            goto L_0x0442
        L_0x03b8:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0I
            goto L_0x03e9
        L_0x03bd:
            r3 = -1
            if (r20 == 0) goto L_0x03de
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r2 = r8.getInt(r1, r3)
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r3 = r8.getInt(r1, r3)
        L_0x03cc:
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0L(r4, r6, r2, r3, r0)
            if (r0 == 0) goto L_0x0084
            int r1 = r6.A02
            int r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r4, r1)
            r2 = 0
            r1 = 0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r4, r2, r2, r3, r1)
            return r0
        L_0x03de:
            r2 = -1
            goto L_0x03cc
        L_0x03e0:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A02
            goto L_0x03e9
        L_0x03e5:
            X.5SV r4 = r6.A05
            X.5Sb r6 = X.C290125en.A0F
        L_0x03e9:
            java.lang.Object r1 = X.C285765So.A00(r4, r6)
            X.5ep r1 = (X.C290145ep) r1
            if (r1 == 0) goto L_0x0084
            X.0eL r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x0084
            java.lang.Object r0 = r1.invoke()
            goto L_0x007e
        L_0x03fd:
            android.view.accessibility.AccessibilityManager r1 = r4.A0O
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x040c
            boolean r0 = r1.isTouchExplorationEnabled()
            r1 = 1
            if (r0 != 0) goto L_0x040d
        L_0x040c:
            r1 = 0
        L_0x040d:
            r0 = 0
            if (r1 == 0) goto L_0x0084
            int r2 = r4.A01
            if (r2 == r3) goto L_0x0084
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x041e
            r1 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r4, r1, r1, r2, r0)
        L_0x041e:
            r4.A01 = r3
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.A0R
            r0.invalidate()
            r1 = 0
            r0 = 32768(0x8000, float:4.5918E-41)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r4, r1, r1, r3, r0)
            goto L_0x0442
        L_0x042d:
            int r0 = r4.A01
            if (r0 != r3) goto L_0x0493
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.A01 = r0
            r1 = 0
            r4.A0C = r1
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.A0R
            r0.invalidate()
            r0 = 65536(0x10000, float:9.18355E-41)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0J(r4, r1, r1, r3, r0)
        L_0x0442:
            r0 = 1
            return r0
        L_0x0444:
            if (r20 == 0) goto L_0x0084
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r3 = r8.getInt(r1)
            java.lang.String r1 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r13 = r8.getBoolean(r1)
            if (r7 != r2) goto L_0x0455
            r0 = 1
        L_0x0455:
            int r2 = r6.A02
            java.lang.Integer r1 = r4.A0D
            r7 = -1
            if (r1 == 0) goto L_0x0462
            int r1 = r1.intValue()
            if (r2 == r1) goto L_0x046a
        L_0x0462:
            r4.A00 = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.A0D = r1
        L_0x046a:
            java.lang.String r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0A(r6)
            r12 = 0
            if (r1 == 0) goto L_0x0493
            int r11 = r1.length()
            if (r11 == 0) goto L_0x0493
            java.lang.String r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0A(r6)
            if (r8 == 0) goto L_0x0493
            int r1 = r8.length()
            if (r1 == 0) goto L_0x0493
            if (r3 == r5) goto L_0x04a3
            r1 = 2
            if (r3 == r1) goto L_0x04c7
            r10 = 4
            if (r3 == r10) goto L_0x04f1
            r1 = 8
            if (r3 == r1) goto L_0x0495
            r1 = 16
            if (r3 == r1) goto L_0x04f1
        L_0x0493:
            r0 = 0
            return r0
        L_0x0495:
            X.Gfr r2 = X.C52940Gfr.A00
            if (r2 != 0) goto L_0x04a0
            X.Gfr r2 = new X.Gfr
            r2.<init>()
            X.C52940Gfr.A00 = r2
        L_0x04a0:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"
            goto L_0x04ea
        L_0x04a3:
            androidx.compose.ui.platform.AndroidComposeView r1 = r4.A0R
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            X.U6f r2 = X.C14741U6f.A01
            if (r2 != 0) goto L_0x04c4
            X.U6f r2 = new X.U6f
            r2.<init>()
            java.text.BreakIterator r1 = java.text.BreakIterator.getCharacterInstance(r1)
            r2.A00 = r1
            X.C14741U6f.A01 = r2
        L_0x04c4:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"
            goto L_0x04ea
        L_0x04c7:
            androidx.compose.ui.platform.AndroidComposeView r1 = r4.A0R
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            X.U6g r2 = X.C14742U6g.A01
            if (r2 != 0) goto L_0x04e8
            X.U6g r2 = new X.U6g
            r2.<init>()
            java.text.BreakIterator r1 = java.text.BreakIterator.getWordInstance(r1)
            r2.A00 = r1
            X.C14742U6g.A01 = r2
        L_0x04e8:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"
        L_0x04ea:
            X.0qQ.A0C(r2, r1)
            r2.A03(r8)
            goto L_0x0519
        L_0x04f1:
            X.5SV r9 = r6.A05
            X.5Sb r2 = X.C290125en.A08
            java.util.Map r1 = r9.A02
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0493
            X.62f r9 = X.C290115em.A01(r9)
            if (r9 == 0) goto L_0x0493
            if (r3 != r10) goto L_0x051d
            X.Gfs r2 = X.C52941Gfs.A01
            if (r2 != 0) goto L_0x0510
            X.Gfs r2 = new X.Gfs
            r2.<init>()
            X.C52941Gfs.A01 = r2
        L_0x0510:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"
            X.0qQ.A0C(r2, r1)
            r2.A00 = r8
            r2.A00 = r9
        L_0x0519:
            if (r2 != 0) goto L_0x0533
            goto L_0x0493
        L_0x051d:
            X.Gft r2 = X.C52942Gft.A03
            if (r2 != 0) goto L_0x0528
            X.Gft r2 = new X.Gft
            r2.<init>()
            X.C52942Gft.A03 = r2
        L_0x0528:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"
            X.0qQ.A0C(r2, r1)
            r2.A00 = r8
            r2.A01 = r9
            r2.A00 = r6
        L_0x0533:
            int r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A01(r4, r6)
            if (r1 != r7) goto L_0x058c
            r1 = r11
            if (r0 == 0) goto L_0x058f
            r1 = 0
        L_0x053d:
            int[] r1 = r2.AWA(r1)
        L_0x0541:
            if (r1 == 0) goto L_0x0493
            r11 = r1[r12]
            r12 = r1[r5]
            if (r13 == 0) goto L_0x0580
            X.5SV r2 = r6.A05
            X.5Sb r1 = X.AnonymousClass5SZ.A02
            java.util.Map r2 = r2.A02
            boolean r1 = r2.containsKey(r1)
            if (r1 != 0) goto L_0x0580
            X.5Sb r1 = X.AnonymousClass5SZ.A04
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x0580
            int r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r4, r6)
            if (r2 != r7) goto L_0x057d
            r2 = r12
            if (r0 == 0) goto L_0x0588
            r2 = r11
        L_0x0567:
            r1 = r12
        L_0x0568:
            r9 = 256(0x100, float:3.59E-43)
        L_0x056a:
            long r13 = android.os.SystemClock.uptimeMillis()
            X.Ho6 r0 = new X.Ho6
            r7 = r0
            r8 = r6
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.A0A = r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0L(r4, r6, r2, r1, r5)
            goto L_0x0442
        L_0x057d:
            if (r0 == 0) goto L_0x0588
            goto L_0x0567
        L_0x0580:
            r2 = r11
            if (r0 == 0) goto L_0x0584
            r2 = r12
        L_0x0584:
            r1 = r2
            if (r0 == 0) goto L_0x0589
            goto L_0x0568
        L_0x0588:
            r1 = r11
        L_0x0589:
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x056a
        L_0x058c:
            if (r0 == 0) goto L_0x058f
            goto L_0x053d
        L_0x058f:
            int[] r1 = r2.E3T(r1)
            goto L_0x0541
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ST.performAction(int, int, android.os.Bundle):boolean");
    }
}
