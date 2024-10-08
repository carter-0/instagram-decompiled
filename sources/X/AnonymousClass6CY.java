package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6CY  reason: invalid class name */
public abstract class AnonymousClass6CY {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if ((r19 & 16) != 0) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r11, androidx.compose.ui.Modifier r12, X.AnonymousClass5Z4 r13, X.C299545vN r14, X.C303846Ba r15, double r16, int r18, int r19) {
        /*
            r5 = r13
            r4 = r12
            r0 = 1001744834(0x3bb569c2, float:0.005536289)
            r12 = r11
            r11.ExV(r0)
            r11 = r19
            r0 = r19 & 1
            r10 = r18
            r6 = r14
            if (r0 == 0) goto L_0x0103
            r0 = r18 | 6
        L_0x0014:
            r1 = r19 & 2
            r7 = r15
            if (r1 == 0) goto L_0x00f2
            r0 = r0 | 48
        L_0x001b:
            r1 = r19 & 4
            r8 = r16
            if (r1 == 0) goto L_0x00e1
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0023:
            r3 = r19 & 8
            if (r3 == 0) goto L_0x00d0
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0029:
            r1 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x003c
            r1 = r19 & 16
            if (r1 != 0) goto L_0x0039
            boolean r2 = r12.AGu(r13)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x003b
        L_0x0039:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x003b:
            r0 = r0 | r1
        L_0x003c:
            r2 = r0 & 9363(0x2493, float:1.312E-41)
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r1) goto L_0x0059
            boolean r1 = r12.Bwn()
            if (r1 == 0) goto L_0x0059
            r12.Evl()
        L_0x004b:
            X.5Xd r0 = r12.ASQ()
            if (r0 == 0) goto L_0x0058
            X.J8k r3 = new X.J8k
            r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            r0.A06 = r3
        L_0x0058:
            return
        L_0x0059:
            r12.Ewr()
            r1 = r18 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x00c1
            boolean r1 = r12.Aw3()
            if (r1 != 0) goto L_0x00c1
            r12.Evl()
            r1 = r19 & 16
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = r0 & r2
        L_0x0071:
            r12.ASM()
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0082
            r2 = 127252184(0x795b6d8, float:2.2526494E-34)
            java.lang.String r1 = "com.instagram.barcelona.feed.post.ui.PostTimestamp (PostHeader.kt:700)"
            X.0fL.A01(r2, r1)
        L_0x0082:
            X.5vN r1 = X.C299545vN.NOT_FEDERATED
            r2 = 0
            if (r14 == r1) goto L_0x0088
            r2 = 1
        L_0x0088:
            boolean r1 = r15 instanceof X.AnonymousClass6BZ
            if (r1 == 0) goto L_0x00bf
            r1 = r7
            X.6BZ r1 = (X.AnonymousClass6BZ) r1
            java.lang.String r15 = r1.A01
        L_0x0091:
            if (r2 == 0) goto L_0x00b1
            r13 = r4
        L_0x0094:
            int r1 = r0 >> 6
            r18 = r1 & 14
            int r0 = r0 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r18 = r18 | r0
            r19 = 0
            r14 = r5
            X.C304136Ch.A00(r12, r13, r14, r15, r16, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004b
            r0 = 1370937439(0x51b6d85f, float:9.8164269E10)
            X.0fL.A00(r0)
            goto L_0x004b
        L_0x00b1:
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r2 = 1082130432(0x40800000, float:4.0)
            r1 = 0
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r3, r2, r1, r1, r1)
            androidx.compose.ui.Modifier r13 = r4.Ezh(r1)
            goto L_0x0094
        L_0x00bf:
            r15 = 0
            goto L_0x0091
        L_0x00c1:
            if (r3 == 0) goto L_0x00c5
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x00c5:
            r1 = r19 & 16
            if (r1 == 0) goto L_0x0071
            X.5ZE r1 = X.AnonymousClass5aQ.A01(r12)
            X.5Z4 r5 = r1.A00
            goto L_0x0070
        L_0x00d0:
            r1 = r10 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0029
            boolean r2 = r12.AGu(r4)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x00de
            r1 = 2048(0x800, float:2.87E-42)
        L_0x00de:
            r0 = r0 | r1
            goto L_0x0029
        L_0x00e1:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0023
            boolean r2 = r12.AGq(r8)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00ef
            r1 = 256(0x100, float:3.59E-43)
        L_0x00ef:
            r0 = r0 | r1
            goto L_0x0023
        L_0x00f2:
            r1 = r18 & 48
            if (r1 != 0) goto L_0x001b
            boolean r2 = r12.AGu(r15)
            r1 = 16
            if (r2 == 0) goto L_0x0100
            r1 = 32
        L_0x0100:
            r0 = r0 | r1
            goto L_0x001b
        L_0x0103:
            r0 = r18 & 6
            if (r0 != 0) goto L_0x0113
            boolean r1 = r12.AGu(r14)
            r0 = 2
            if (r1 == 0) goto L_0x010f
            r0 = 4
        L_0x010f:
            r0 = r0 | r18
            goto L_0x0014
        L_0x0113:
            r0 = r10
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CY.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, X.5vN, X.6Ba, double, int, int):void");
    }

    public static final void A04(C286575Wy r15, Modifier modifier, C62320sa r17, int i, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r5 = r15;
        r15.ExV(-602301108);
        int i5 = i3;
        int i6 = i2;
        C62320sa r8 = r17;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i7 = 2;
            if (r15.AGw(r8)) {
                i7 = 4;
            }
            i4 = i7 | i2;
        } else {
            i4 = i6;
        }
        int i8 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i9 = 16;
            if (r15.AGs(i8)) {
                i9 = 32;
            }
            i4 |= i9;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i6 & 384) == 0) {
            int i11 = 128;
            if (r15.AGu(modifier2)) {
                i11 = 256;
            }
            i4 |= i11;
        }
        if ((i4 & 147) != 146 || !r15.Bwn()) {
            if (i10 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1316928166, "com.instagram.barcelona.feed.post.ui.ActionMenuButton (PostHeader.kt:454)");
            }
            C304156Cj.A00(r5, modifier2, C288035bG.A00(r15, 2131953692), r8, i8, (i4 & 14) | (i4 & 112) | ((i4 << 3) & 7168), 48, AnonymousClass5aQ.A00(r15).A0s, false, false);
            if (0fL.A02()) {
                0fL.A00(1109965861);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Q(r8, modifier2, i8, i6, i5, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (X.182.A06(X.0Tu.A05, (X.0lg) X.C286615Xc.A01(X.C286955Yl.A00, X.C286565Wx.A04((X.C286565Wx) r8)), 2342166191881399273L) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r10, X.C62320sa r11, float r12, boolean r13) {
        /*
            r0 = -1362929837(0xffffffffaec35753, float:-8.883085E-11)
            r8 = r10
            r10.ExS(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0015
            r1 = -802941743(0xffffffffd02414d1, float:-1.10113106E10)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.FediverseMark (PostHeader.kt:737)"
            X.0fL.A01(r1, r0)
        L_0x0015:
            r5 = 1082130432(0x40800000, float:4.0)
            r0 = -1817232367(0xffffffff93af3c11, float:-4.423544E-27)
            r10.ExS(r0)
            r3 = 0
            if (r13 == 0) goto L_0x003d
            X.4bM r1 = X.C286955Yl.A00
            r0 = r8
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r0 = X.C286565Wx.A04(r0)
            java.lang.Object r4 = X.C286615Xc.A01(r1, r0)
            X.0lg r4 = (X.0lg) r4
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342166191881399273(0x20810bbe00052be9, double:4.068284512473369E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            r6 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            r4 = r8
            X.5Wx r4 = (X.C286565Wx) r4
            X.C286565Wx.A0L(r4, r3)
            r0 = -1817218997(0xffffffff93af704b, float:-4.428694E-27)
            r10.ExS(r0)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r0 = r0 + r12
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r2, r0)
            r9 = 0
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A09(r0, r5, r9)
            X.5aV r0 = new X.5aV
            r0.<init>(r3)
            androidx.compose.ui.Modifier r5 = X.C288235ba.A02(r10, r1, r0, r11)
            if (r6 == 0) goto L_0x00af
            X.GRI r7 = X.GRH.A02(r10)
            r10 = 1135869952(0x43b40000, float:360.0)
            X.JNL r6 = X.C52518GVv.A02
            r0 = 10000(0x2710, float:1.4013E-41)
            X.GQC r1 = new X.GQC
            r1.<init>(r6, r0, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.GRJ r6 = new X.GRJ
            r6.<init>(r1, r0)
            r11 = 29112(0x71b8, float:4.0795E-41)
            X.GRG r6 = X.GRH.A01(r6, r7, r8, r9, r10, r11)
            r0 = -1972081269(0xffffffff8a746d8b, float:-1.17687754E-32)
            r8.ExS(r0)
            boolean r0 = r8.AGu(r6)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x0094
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x009d
        L_0x0094:
            r0 = 2
            X.Iwb r1 = new X.Iwb
            r1.<init>(r6, r0)
            r8.FLL(r1)
        L_0x009d:
            X.0sP r1 = (X.0sP) r1
            X.C286565Wx.A0L(r4, r3)
            androidx.compose.ui.graphics.BlockGraphicsLayerElement r0 = new androidx.compose.ui.graphics.BlockGraphicsLayerElement
            r0.<init>(r1)
            androidx.compose.ui.Modifier r0 = r2.Ezh(r0)
            androidx.compose.ui.Modifier r5 = r5.Ezh(r0)
        L_0x00af:
            X.C286565Wx.A0L(r4, r3)
            r0 = 1094713344(0x41400000, float:12.0)
            int r1 = java.lang.Float.compare(r12, r0)
            r0 = 2131231048(0x7f080148, float:1.8078166E38)
            if (r1 > 0) goto L_0x00c0
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
        L_0x00c0:
            X.2DO r2 = X.C287975bA.A00(r8, r0, r3)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r8)
            long r0 = r0.A0s
            X.C288165bT.A05(r8, r5, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00d9
            r0 = -910406542(0xffffffffc9bc4c72, float:-1542542.2)
            X.0fL.A00(r0)
        L_0x00d9:
            X.C286565Wx.A0L(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CY.A05(X.5Wy, X.0sa, float, boolean):void");
    }

    public static final void A06(C62320sa r5, C286575Wy r6, int i) {
        int i2;
        r6.ExV(1668443583);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r6.AGw(r5)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1309550459, "com.instagram.barcelona.feed.post.ui.InternalMark (PostHeader.kt:775)");
            }
            C288165bT.A05(r6, C288235ba.A02(r6, C287195Zj.A09(C287205Zk.A04(Modifier.A00), 4.0f, 0.0f), new C287625aV(0), r5), C287975bA.A00(r6, R.drawable.instagram_meta_logo_pano_outline_24, 0), AnonymousClass5aQ.A00(r6).A0s);
            if (0fL.A02()) {
                0fL.A00(734922902);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGC(r5, i, 20);
        }
    }

    public static final void A07(C62320sa r5, C286575Wy r6, int i) {
        int i2;
        r6.ExV(1633112853);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r6.AGw(r5)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1832966324, "com.instagram.barcelona.feed.post.ui.PrivateReplyMark (PostHeader.kt:716)");
            }
            C288165bT.A05(r6, C288235ba.A02(r6, C287195Zj.A09(C287205Zk.A04(Modifier.A00), 4.0f, 0.0f), new C287625aV(0), r5), C287975bA.A00(r6, R.drawable.instagram_lock_pano_outline_24, 0), AnonymousClass5aQ.A00(r6).A0s);
            if (0fL.A02()) {
                0fL.A00(-871814922);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGC(r5, i, 21);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v142, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v155, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v162, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v168, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v174, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v180, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v186, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v192, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v198, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v201, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v204, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v205, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v207, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v209, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v211, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v213, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v215, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v217, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v219, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v221, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v223, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v225, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v326, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v10, resolved type: androidx.compose.runtime.ParcelableSnapshotMutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v11, resolved type: androidx.compose.runtime.ParcelableSnapshotMutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v9, resolved type: X.6CZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v14, resolved type: X.6CZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v258, resolved type: androidx.compose.runtime.ParcelableSnapshotMutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v259, resolved type: androidx.compose.runtime.ParcelableSnapshotMutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: int} */
    /* JADX WARNING: type inference failed for: r51v5 */
    /* JADX WARNING: type inference failed for: r55v3 */
    /* JADX WARNING: type inference failed for: r65v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0467, code lost:
        if (r139 != com.instagram.user.model.FollowStatus.A05) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04a7, code lost:
        if (((java.lang.Boolean) ((X.GZX) X.C286615Xc.A01(X.GZW.A00, X.C286565Wx.A04(r9))).A00.getValue()).booleanValue() != false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0504, code lost:
        if (r2 == r52) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06a5, code lost:
        if (r18 != false) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06c2, code lost:
        if (r142 == com.instagram.api.schemas.LineType.A05) goto L_0x06c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0828  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0921  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0935  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0949  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x096f  */
    /* JADX WARNING: Removed duplicated region for block: B:732:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r140, androidx.compose.ui.Modifier r141, com.instagram.api.schemas.LineType r142, com.instagram.api.schemas.TextPostAppHeaderFollowVariant r143, X.C299545vN r144, X.C303846Ba r145, com.instagram.common.typedurl.ImageUrl r146, com.instagram.user.model.FollowStatus r147, java.lang.Double r148, java.lang.Long r149, java.lang.String r150, java.lang.String r151, java.lang.String r152, java.lang.String r153, java.lang.String r154, java.lang.String r155, java.lang.String r156, X.C62320sa r157, X.C62320sa r158, X.C62320sa r159, X.C62320sa r160, X.C62320sa r161, X.C62320sa r162, X.C62320sa r163, X.C62320sa r164, X.C62320sa r165, X.C62320sa r166, X.C62320sa r167, X.C62320sa r168, X.C62320sa r169, X.0sP r170, int r171, int r172, int r173, int r174, int r175, int r176, int r177, int r178, boolean r179, boolean r180, boolean r181, boolean r182, boolean r183, boolean r184, boolean r185, boolean r186, boolean r187, boolean r188, boolean r189, boolean r190, boolean r191, boolean r192, boolean r193, boolean r194, boolean r195, boolean r196, boolean r197, boolean r198, boolean r199, boolean r200, boolean r201, boolean r202, boolean r203) {
        /*
            r44 = r200
            r138 = r149
            r134 = r153
            r38 = r141
            r45 = r199
            r139 = r147
            r22 = r197
            r23 = r196
            r24 = r195
            r25 = r194
            r47 = r193
            r26 = r192
            r48 = r191
            r133 = r154
            r32 = r183
            r43 = r201
            r37 = r160
            r31 = r185
            r39 = r167
            r46 = r198
            r40 = r143
            r30 = r187
            r41 = r144
            r132 = r155
            r28 = r189
            r49 = r184
            r21 = r186
            r29 = r188
            r27 = r190
            r86 = r156
            r19 = r202
            r42 = r166
            r18 = r203
            r11 = 0
            r137 = r150
            r0 = r137
            X.0qQ.A0B(r0, r11)
            r1 = 6
            r0 = r142
            X.0qQ.A0B(r0, r1)
            r1 = 9
            r131 = r158
            r0 = r131
            X.0qQ.A0B(r0, r1)
            r1 = 14
            r94 = r162
            r0 = r94
            X.0qQ.A0B(r0, r1)
            r1 = 15
            r98 = r170
            r0 = r98
            X.0qQ.A0B(r0, r1)
            r50 = 16
            r96 = r163
            r1 = r96
            r0 = r50
            X.0qQ.A0B(r1, r0)
            r1 = 17
            r95 = r164
            r0 = r95
            X.0qQ.A0B(r0, r1)
            r33 = 18
            r88 = r165
            r1 = r33
            r0 = r88
            X.0qQ.A0B(r0, r1)
            r1 = 50
            r92 = r168
            r0 = r92
            X.0qQ.A0B(r0, r1)
            r1 = 1820009567(0x6c7b245f, float:1.21444855E27)
            r0 = r140
            r0.ExV(r1)
            r8 = r177
            r1 = r177 & 1
            r17 = r171
            if (r1 == 0) goto L_0x0cf4
            r6 = r171 | 6
        L_0x00a5:
            r1 = r177 & 2
            r136 = r151
            if (r1 == 0) goto L_0x0ce1
            r6 = r6 | 48
        L_0x00ad:
            r1 = r177 & 4
            r12 = 128(0x80, float:1.794E-43)
            r135 = r152
            if (r1 == 0) goto L_0x0ccc
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x00b7:
            r1 = r177 & 8
            r51 = 2048(0x800, float:2.87E-42)
            r140 = r146
            if (r1 == 0) goto L_0x0cb7
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x00c1:
            r1 = r177 & 16
            r52 = 8192(0x2000, float:1.14794E-41)
            r141 = r145
            if (r1 == 0) goto L_0x0ca2
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x00cb:
            r1 = r177 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            r36 = r148
            if (r1 == 0) goto L_0x0c8f
            r6 = r6 | r9
        L_0x00d4:
            r1 = r177 & 64
            r57 = 1572864(0x180000, float:2.204052E-39)
            if (r1 == 0) goto L_0x0c7c
            r6 = r6 | r57
        L_0x00dc:
            r1 = r8 & 128(0x80, float:1.794E-43)
            r55 = 12582912(0xc00000, float:1.7632415E-38)
            r35 = r179
            if (r1 == 0) goto L_0x0c69
            r6 = r6 | r55
        L_0x00e6:
            r1 = r8 & 256(0x100, float:3.59E-43)
            r53 = 100663296(0x6000000, float:2.4074124E-35)
            r34 = r157
            if (r1 == 0) goto L_0x0c56
            r6 = r6 | r53
        L_0x00f0:
            r1 = r8 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0c43
            r6 = r6 | r20
        L_0x00f8:
            r1 = r8 & 1024(0x400, float:1.435E-42)
            r54 = r1
            r16 = r172
            if (r1 == 0) goto L_0x0c2d
            r7 = r172 | 6
        L_0x0102:
            r1 = r8 & 2048(0x800, float:2.87E-42)
            r125 = r159
            if (r1 == 0) goto L_0x0c1a
            r7 = r7 | 48
        L_0x010a:
            r1 = r8 & 4096(0x1000, float:5.74E-42)
            r56 = r1
            if (r1 == 0) goto L_0x0c05
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0112:
            r1 = r8 & 8192(0x2000, float:1.14794E-41)
            r126 = r161
            if (r1 == 0) goto L_0x0bf0
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x011a:
            r1 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0bdb
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0120:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r177
            if (r1 == 0) goto L_0x0bc8
            r7 = r7 | r9
        L_0x0128:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r177
            if (r1 == 0) goto L_0x0bb5
            r7 = r7 | r57
        L_0x0130:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r177
            if (r1 == 0) goto L_0x0ba2
            r7 = r7 | r55
        L_0x0138:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r177
            if (r1 == 0) goto L_0x0b8f
            r7 = r7 | r53
        L_0x0140:
            r1 = 524288(0x80000, float:7.34684E-40)
            r79 = r177 & r1
            if (r79 == 0) goto L_0x0b7c
            r7 = r7 | r20
        L_0x0148:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r177 & r1
            r114 = r180
            r15 = r173
            if (r1 == 0) goto L_0x0b67
            r5 = r173 | 6
        L_0x0154:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r177 & r1
            r116 = r181
            if (r1 == 0) goto L_0x0b54
            r5 = r5 | 48
        L_0x015e:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r84 = r177 & r1
            if (r84 == 0) goto L_0x0b41
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0166:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r177 & r1
            r107 = r182
            if (r1 == 0) goto L_0x0b2e
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0170:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r83 = r177 & r1
            if (r83 == 0) goto L_0x0b1b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0178:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r82 = r177 & r1
            if (r82 == 0) goto L_0x0b08
            r5 = r5 | r9
        L_0x017f:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r81 = r177 & r1
            if (r81 == 0) goto L_0x0af5
            r5 = r5 | r57
        L_0x0187:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r80 = r177 & r1
            if (r80 == 0) goto L_0x0ae2
            r5 = r5 | r55
        L_0x018f:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r78 = r177 & r1
            if (r78 == 0) goto L_0x0acf
            r5 = r5 | r53
        L_0x0197:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r77 = r177 & r1
            if (r77 == 0) goto L_0x0abc
            r5 = r5 | r20
        L_0x019f:
            r76 = 1073741824(0x40000000, float:2.0)
            r76 = r76 & r177
            r14 = r174
            if (r76 == 0) goto L_0x0aa7
            r1 = r174 | 6
        L_0x01a9:
            r10 = r178
            r75 = r178 & 1
            if (r75 == 0) goto L_0x0a94
            r1 = r1 | 48
        L_0x01b1:
            r74 = r178 & 2
            if (r74 == 0) goto L_0x0a81
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x01b7:
            r73 = r178 & 4
            if (r73 == 0) goto L_0x0a6e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x01bd:
            r72 = r178 & 8
            if (r72 == 0) goto L_0x0a5b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x01c3:
            r71 = r178 & 16
            if (r71 == 0) goto L_0x0a48
            r1 = r1 | r9
        L_0x01c8:
            r70 = r178 & 32
            if (r70 == 0) goto L_0x0a35
            r1 = r1 | r57
        L_0x01ce:
            r69 = r178 & 64
            if (r69 == 0) goto L_0x0a22
            r1 = r1 | r55
        L_0x01d4:
            r2 = r10 & 128(0x80, float:1.794E-43)
            r68 = r2
            if (r2 == 0) goto L_0x0a0f
            r1 = r1 | r53
        L_0x01dc:
            r2 = r10 & 256(0x100, float:3.59E-43)
            r67 = r2
            if (r2 == 0) goto L_0x09fc
            r1 = r1 | r20
        L_0x01e4:
            r2 = r10 & 512(0x200, float:7.175E-43)
            r66 = r2
            r13 = r175
            if (r2 == 0) goto L_0x09e7
            r3 = r175 | 6
        L_0x01ee:
            r2 = r10 & 1024(0x400, float:1.435E-42)
            r65 = r2
            if (r2 == 0) goto L_0x09d4
            r3 = r3 | 48
        L_0x01f6:
            r2 = r10 & 2048(0x800, float:2.87E-42)
            r64 = r2
            if (r2 == 0) goto L_0x09c1
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x01fe:
            r2 = r10 & 4096(0x1000, float:5.74E-42)
            r63 = r2
            if (r2 == 0) goto L_0x09ae
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0206:
            r2 = r10 & 8192(0x2000, float:1.14794E-41)
            r62 = r2
            if (r2 == 0) goto L_0x0999
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x020e:
            r4 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0985
            r3 = r3 | r9
        L_0x0213:
            r2 = 32768(0x8000, float:4.5918E-41)
            r61 = r178 & r2
            if (r61 != 0) goto L_0x022a
            r2 = r175 & r57
            if (r2 != 0) goto L_0x022c
            r2 = r138
            boolean r2 = r0.AGu(r2)
            r57 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x022a
            r57 = 1048576(0x100000, float:1.469368E-39)
        L_0x022a:
            r3 = r3 | r57
        L_0x022c:
            r2 = 65536(0x10000, float:9.18355E-41)
            r60 = r178 & r2
            if (r60 != 0) goto L_0x0242
            r2 = r175 & r55
            if (r2 != 0) goto L_0x0244
            r2 = r44
            boolean r2 = r0.AGv(r2)
            r55 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0242
            r55 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0242:
            r3 = r3 | r55
        L_0x0244:
            r2 = 131072(0x20000, float:1.83671E-40)
            r59 = r178 & r2
            if (r59 != 0) goto L_0x025a
            r2 = r175 & r53
            if (r2 != 0) goto L_0x025c
            r2 = r43
            boolean r2 = r0.AGv(r2)
            r53 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x025a
            r53 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x025a:
            r3 = r3 | r53
        L_0x025c:
            r2 = 262144(0x40000, float:3.67342E-40)
            r58 = r178 & r2
            if (r58 != 0) goto L_0x0272
            r2 = r175 & r20
            if (r2 != 0) goto L_0x0274
            r2 = r39
            boolean r2 = r0.AGw(r2)
            r20 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x0272
            r20 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0272:
            r3 = r3 | r20
        L_0x0274:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r178 & r2
            r20 = r176
            if (r2 == 0) goto L_0x096f
            r9 = r176 | 6
        L_0x027e:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r57 = r178 & r2
            if (r57 == 0) goto L_0x095c
            r9 = r9 | 48
        L_0x0286:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r178 & r2
            r93 = r169
            if (r2 == 0) goto L_0x0949
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0290:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r55 = r178 & r2
            if (r55 == 0) goto L_0x0935
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0298:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r53 = r178 & r2
            if (r53 == 0) goto L_0x0921
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x02a0:
            r51 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r6 & r51
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r12) goto L_0x0357
            r2 = r51 & r7
            if (r2 != r12) goto L_0x0357
            r2 = r5 & r51
            if (r2 != r12) goto L_0x0357
            r2 = r1 & r51
            if (r2 != r12) goto L_0x0357
            r3 = r3 & r51
            if (r3 != r12) goto L_0x0357
            r3 = r9 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r2) goto L_0x0357
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0357
            r0.Evl()
        L_0x02c9:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0356
            X.6Ck r0 = new X.6Ck
            r50 = r0
            r51 = r38
            r52 = r142
            r53 = r40
            r54 = r41
            r55 = r141
            r56 = r140
            r57 = r139
            r58 = r36
            r59 = r138
            r60 = r137
            r61 = r136
            r62 = r135
            r63 = r134
            r64 = r133
            r65 = r132
            r66 = r86
            r67 = r34
            r68 = r131
            r69 = r125
            r70 = r37
            r71 = r126
            r72 = r94
            r73 = r96
            r74 = r95
            r75 = r88
            r76 = r42
            r77 = r39
            r78 = r92
            r79 = r93
            r80 = r98
            r81 = r17
            r82 = r16
            r83 = r15
            r84 = r14
            r85 = r13
            r86 = r20
            r87 = r8
            r88 = r10
            r89 = r35
            r90 = r114
            r91 = r116
            r92 = r107
            r93 = r32
            r94 = r49
            r95 = r31
            r96 = r21
            r97 = r30
            r98 = r29
            r99 = r28
            r100 = r27
            r101 = r48
            r102 = r26
            r103 = r47
            r104 = r25
            r105 = r24
            r106 = r23
            r107 = r22
            r108 = r46
            r109 = r45
            r110 = r44
            r111 = r43
            r112 = r19
            r113 = r18
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113)
            r1.A06 = r0
        L_0x0356:
            return
        L_0x0357:
            if (r54 == 0) goto L_0x035b
            X.5Qk r38 = androidx.compose.ui.Modifier.A00
        L_0x035b:
            if (r56 == 0) goto L_0x035f
            X.Ax1 r37 = X.C41587Ax1.A00
        L_0x035f:
            if (r79 == 0) goto L_0x0363
            X.Ax2 r42 = X.C41588Ax2.A00
        L_0x0363:
            if (r84 == 0) goto L_0x0367
            X.5vN r41 = X.C299545vN.NOT_FEDERATED
        L_0x0367:
            if (r83 == 0) goto L_0x036b
            r32 = 0
        L_0x036b:
            if (r82 == 0) goto L_0x036f
            r49 = 0
        L_0x036f:
            r56 = 1
            if (r81 == 0) goto L_0x0375
            r31 = 1
        L_0x0375:
            if (r80 == 0) goto L_0x0379
            r21 = 0
        L_0x0379:
            if (r78 == 0) goto L_0x037d
            r30 = 0
        L_0x037d:
            if (r77 == 0) goto L_0x0381
            r29 = 0
        L_0x0381:
            if (r76 == 0) goto L_0x0385
            r28 = 0
        L_0x0385:
            if (r75 == 0) goto L_0x0389
            r27 = 0
        L_0x0389:
            if (r74 == 0) goto L_0x038d
            com.instagram.api.schemas.TextPostAppHeaderFollowVariant r40 = com.instagram.api.schemas.TextPostAppHeaderFollowVariant.PRIMARY
        L_0x038d:
            if (r73 == 0) goto L_0x0391
            r48 = 0
        L_0x0391:
            if (r72 == 0) goto L_0x0395
            r26 = 0
        L_0x0395:
            if (r71 == 0) goto L_0x0399
            r47 = 0
        L_0x0399:
            if (r70 == 0) goto L_0x039d
            r25 = 0
        L_0x039d:
            if (r69 == 0) goto L_0x03a1
            r24 = 1
        L_0x03a1:
            if (r68 == 0) goto L_0x03a5
            r23 = 0
        L_0x03a5:
            if (r67 == 0) goto L_0x03a9
            r22 = 0
        L_0x03a9:
            r124 = 0
            if (r66 == 0) goto L_0x03af
            r139 = r124
        L_0x03af:
            if (r65 == 0) goto L_0x03b3
            r46 = 0
        L_0x03b3:
            if (r64 == 0) goto L_0x03b7
            r45 = 1
        L_0x03b7:
            if (r63 == 0) goto L_0x03bb
            r134 = r124
        L_0x03bb:
            if (r62 == 0) goto L_0x03bf
            r133 = r124
        L_0x03bf:
            if (r4 == 0) goto L_0x03c3
            r132 = r124
        L_0x03c3:
            if (r61 == 0) goto L_0x03c7
            r138 = r124
        L_0x03c7:
            if (r60 == 0) goto L_0x03cb
            r44 = 0
        L_0x03cb:
            if (r59 == 0) goto L_0x03cf
            r43 = 0
        L_0x03cf:
            if (r58 == 0) goto L_0x03d3
            X.Ax3 r39 = X.C41589Ax3.A00
        L_0x03d3:
            if (r57 == 0) goto L_0x03d7
            r86 = r124
        L_0x03d7:
            if (r55 == 0) goto L_0x03db
            r19 = 0
        L_0x03db:
            if (r53 == 0) goto L_0x03df
            r18 = 0
        L_0x03df:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x03ed
            r3 = -155151700(0xfffffffff6c092ac, float:-1.9529216E33)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostHeader (PostHeader.kt:151)"
            X.0fL.A01(r3, r2)
        L_0x03ed:
            r2 = 900527071(0x35acf3df, float:1.2885974E-6)
            r0.ExS(r2)
            java.lang.Object r51 = r0.ECw()
            java.lang.Object r52 = X.AnonymousClass5XT.A00
            r3 = r51
            r2 = r52
            if (r3 != r2) goto L_0x0419
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            X.5Or r3 = X.C284885Or.A00
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r3, r2)
            X.0eM r2 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r51 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r2 = r51
            r2.<init>(r3, r4)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            r3.A0Q(r2)
        L_0x0419:
            r2 = r51
            X.5Oz r2 = (X.C284945Oz) r2
            r51 = r2
            r9 = r0
            X.5Wx r9 = (X.C286565Wx) r9
            X.C286565Wx.A0L(r9, r11)
            r2 = 900529215(0x35acfc3f, float:1.2888412E-6)
            r0.ExS(r2)
            java.lang.Object r55 = r0.ECw()
            r3 = r55
            r2 = r52
            if (r3 != r2) goto L_0x044c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            X.5Or r3 = X.C284885Or.A00
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r3, r2)
            X.0eM r2 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r55 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r2 = r55
            r2.<init>(r3, r4)
            r9.A0Q(r2)
        L_0x044c:
            r2 = r55
            X.5Oz r2 = (X.C284945Oz) r2
            r55 = r2
            X.C286565Wx.A0L(r9, r11)
            java.lang.Object r2 = r55.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0469
            com.instagram.user.model.FollowStatus r3 = com.instagram.user.model.FollowStatus.A05
            r70 = 1
            r2 = r139
            if (r2 == r3) goto L_0x046b
        L_0x0469:
            r70 = 0
        L_0x046b:
            if (r24 == 0) goto L_0x091d
            if (r23 != 0) goto L_0x091d
            r69 = 1091567616(0x41100000, float:9.0)
            if (r25 == 0) goto L_0x0475
            r69 = 1082130432(0x40800000, float:4.0)
        L_0x0475:
            X.4bM r3 = X.C286955Yl.A00
            X.5RM r2 = X.C286565Wx.A04(r9)
            java.lang.Object r68 = X.C286615Xc.A01(r3, r2)
            r2 = r68
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r68 = r2
            r2 = 900568303(0x35ad94ef, float:1.293285E-6)
            r0.ExS(r2)
            if (r22 != 0) goto L_0x04a9
            X.4bM r3 = X.GZW.A00
            X.5RM r2 = X.C286565Wx.A04(r9)
            java.lang.Object r2 = X.C286615Xc.A01(r3, r2)
            X.GZX r2 = (X.GZX) r2
            X.5Oz r2 = r2.A00
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r101 = 1
            if (r2 == 0) goto L_0x04ab
        L_0x04a9:
            r101 = 0
        L_0x04ab:
            X.C286565Wx.A0L(r9, r11)
            if (r19 == 0) goto L_0x0913
            r2 = 26
        L_0x04b2:
            float r2 = (float) r2
            r67 = r2
        L_0x04b5:
            X.0Tu r12 = X.0Tu.A05
            r3 = 36329376010223691(0x8111600000404b, double:3.038181903296316E-306)
            r2 = r68
            boolean r66 = X.182.A06(r12, r2, r3)
            r2 = 900580454(0x35adc466, float:1.2946664E-6)
            r0.ExS(r2)
            if (r26 != 0) goto L_0x090f
            if (r157 == 0) goto L_0x090f
            r2 = 900582048(0x35adcaa0, float:1.2948476E-6)
            r0.ExS(r2)
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = 32
            r12 = 0
            if (r3 != r2) goto L_0x04da
            r12 = 1
        L_0x04da:
            r2 = r66
            boolean r2 = r0.AGv(r2)
            r12 = r12 | r2
            r3 = r1 & 14
            r2 = 4
            r4 = 0
            if (r3 != r2) goto L_0x04e8
            r4 = 1
        L_0x04e8:
            r12 = r12 | r4
            r2 = r70
            boolean r2 = r0.AGv(r2)
            r12 = r12 | r2
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = 0
            if (r3 != r2) goto L_0x04f9
            r4 = 1
        L_0x04f9:
            r12 = r12 | r4
            java.lang.Object r65 = r0.ECw()
            if (r12 != 0) goto L_0x0506
            r3 = r52
            r2 = r65
            if (r2 != r3) goto L_0x051e
        L_0x0506:
            X.6CZ r65 = new X.6CZ
            r57 = r65
            r58 = r51
            r59 = r34
            r60 = r27
            r61 = r66
            r62 = r28
            r63 = r70
            r57.<init>(r58, r59, r60, r61, r62, r63)
            r2 = r65
            r0.FLL(r2)
        L_0x051e:
            r2 = r65
            X.0sa r2 = (X.C62320sa) r2
            r65 = r2
            X.C286565Wx.A0L(r9, r11)
        L_0x0527:
            X.C286565Wx.A0L(r9, r11)
            com.instagram.user.model.FollowStatus r64 = com.instagram.user.model.FollowStatus.A06
            r102 = 0
            r3 = r64
            r2 = r139
            if (r2 != r3) goto L_0x0536
            r102 = 1
        L_0x0536:
            r2 = 900595438(0x35adfeee, float:1.2963699E-6)
            r0.ExS(r2)
            if (r32 == 0) goto L_0x0902
            java.lang.String r80 = ""
        L_0x0540:
            X.C286565Wx.A0L(r9, r11)
            if (r101 == 0) goto L_0x08fe
            r2 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.ZIndexElement r3 = new androidx.compose.ui.ZIndexElement
            r3.<init>(r2)
            r2 = r38
            androidx.compose.ui.Modifier r3 = r2.Ezh(r3)
        L_0x0552:
            androidx.compose.ui.Alignment r57 = X.C287215Zl.A0E
            r2 = r57
            X.5RD r4 = X.C287675aa.A00(r2, r11)
            int r54 = X.C287425a7.A00(r0)
            X.5RM r12 = X.C286565Wx.A04(r9)
            androidx.compose.ui.Modifier r53 = X.C287435a8.A01(r0, r3)
            X.0sa r63 = X.C287485aD.A00
            r0.ExX()
            boolean r2 = r9.A0K
            if (r2 == 0) goto L_0x08f9
            r2 = r63
            r0.AMT(r2)
        L_0x0574:
            X.0sL r62 = X.C287485aD.A03
            r2 = r62
            X.C287595aO.A00(r0, r4, r2)
            X.0sL r61 = X.C287485aD.A05
            r2 = r61
            X.C287595aO.A00(r0, r12, r2)
            X.0sL r60 = X.C287485aD.A02
            boolean r2 = r9.A0K
            if (r2 != 0) goto L_0x0596
            java.lang.Object r3 = r0.ECw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r54)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x05a2
        L_0x0596:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r54)
            r0.FLL(r3)
            r2 = r60
            r0.ABr(r3, r2)
        L_0x05a2:
            X.0sL r59 = X.C287485aD.A04
            r3 = r53
            r2 = r59
            X.C287595aO.A00(r0, r3, r2)
            X.5dj r53 = X.C289515dj.A00
            X.5Qk r58 = androidx.compose.ui.Modifier.A00
            androidx.compose.foundation.layout.FillElement r123 = X.C287205Zk.A02
            X.6Ca r3 = new X.6Ca
            r71 = r3
            r72 = r40
            r73 = r41
            r74 = r141
            r75 = r68
            r76 = r140
            r77 = r139
            r78 = r36
            r79 = r138
            r81 = r134
            r82 = r136
            r83 = r137
            r84 = r133
            r85 = r132
            r87 = r65
            r89 = r34
            r90 = r42
            r91 = r39
            r97 = r37
            r99 = r69
            r100 = r67
            r103 = r27
            r104 = r66
            r105 = r28
            r106 = r70
            r108 = r18
            r109 = r49
            r110 = r44
            r111 = r29
            r112 = r30
            r113 = r19
            r115 = r43
            r117 = r46
            r118 = r45
            r119 = r48
            r120 = r47
            r121 = r31
            r122 = r21
            r71.<init>(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122)
            r2 = -614676009(0xffffffffdb5cc9d7, float:-6.214642E16)
            X.5PJ r127 = X.AnonymousClass5PI.A01(r0, r3, r2)
            r128 = 199680(0x30c00, float:2.79811E-40)
            int r1 = r1 >> 12
            r1 = r1 & 14
            r128 = r128 | r1
            r1 = r7 & 112(0x70, float:1.57E-43)
            r128 = r128 | r1
            int r1 = r7 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r128 = r128 | r1
            r122 = r0
            r129 = r50
            r130 = r26
            X.C304076Cb.A00(r122, r123, r124, r125, r126, r127, r128, r129, r130)
            r1 = -1980590522(0xffffffff89f29646, float:-5.8400697E-33)
            r0.ExS(r1)
            if (r101 == 0) goto L_0x0717
            r3 = r53
            r2 = r57
            r1 = r58
            androidx.compose.ui.Modifier r2 = r3.AAz(r2, r1)
            r1 = 1114636288(0x42700000, float:60.0)
            androidx.compose.ui.Modifier r2 = X.C287205Zk.A0D(r2, r1)
            X.JIC r1 = X.JIC.A00
            androidx.compose.ui.Modifier r4 = X.HRW.A00(r2, r1)
            r1 = 1086324736(0x40c00000, float:6.0)
            float r3 = r69 + r1
            r2 = 0
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r4, r2, r3, r2, r2)
            androidx.compose.ui.Alignment r3 = X.C287215Zl.A0C
            androidx.compose.ui.Modifier r12 = X.C287205Zk.A02(r3, r1)
            r1 = r57
            X.5RD r4 = X.C287675aa.A00(r1, r11)
            int r50 = X.C287425a7.A00(r0)
            X.5RM r3 = X.C286565Wx.A04(r9)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r12)
            r0.ExX()
            boolean r1 = r9.A0K
            if (r1 == 0) goto L_0x08f4
            r1 = r63
            r0.AMT(r1)
        L_0x0670:
            r1 = r62
            X.C287595aO.A00(r0, r4, r1)
            r1 = r61
            X.C287595aO.A00(r0, r3, r1)
            boolean r1 = r9.A0K
            if (r1 != 0) goto L_0x068c
            java.lang.Object r3 = r0.ECw()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r50)
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 != 0) goto L_0x0698
        L_0x068c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r50)
            r0.FLL(r3)
            r1 = r60
            r0.ABr(r3, r1)
        L_0x0698:
            r1 = r59
            X.C287595aO.A00(r0, r12, r1)
            if (r27 != 0) goto L_0x06a7
            if (r66 != 0) goto L_0x06a7
            if (r28 == 0) goto L_0x06a7
            r83 = 1
            if (r18 == 0) goto L_0x06a9
        L_0x06a7:
            r83 = 0
        L_0x06a9:
            r3 = 1093664768(0x41300000, float:11.0)
            r1 = r58
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A0B(r1, r2, r2, r2, r3)
            r1 = 1108344832(0x42100000, float:36.0)
            if (r18 == 0) goto L_0x06b7
            r1 = 1101004800(0x41a00000, float:20.0)
        L_0x06b7:
            androidx.compose.ui.Modifier r2 = X.C287205Zk.A0C(r2, r1)
            if (r179 == 0) goto L_0x06c4
            com.instagram.api.schemas.LineType r3 = com.instagram.api.schemas.LineType.NONE
            r4 = 1
            r1 = r142
            if (r1 != r3) goto L_0x06c5
        L_0x06c4:
            r4 = 0
        L_0x06c5:
            r3 = 1096810496(0x41600000, float:14.0)
            X.0qQ.A0B(r2, r11)
            if (r4 == 0) goto L_0x06d5
            com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationStartOverrideModifierElement r1 = new com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationStartOverrideModifierElement
            r1.<init>(r3)
            androidx.compose.ui.Modifier r2 = r2.Ezh(r1)
        L_0x06d5:
            r79 = r6 & 112(0x70, float:1.57E-43)
            int r1 = r6 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r79 = r79 | r1
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            r79 = r79 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r6
            r79 = r79 | r1
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r1 = r5 << 15
            r3 = r3 & r1
            r79 = r79 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            int r1 = r7 << 3
            r3 = r3 & r1
            r79 = r79 | r3
            r71 = r0
            r72 = r2
            r73 = r141
            r74 = r140
            r75 = r136
            r76 = r137
            r77 = r65
            r78 = r88
            r80 = r11
            r81 = r11
            r82 = r102
            r84 = r70
            r85 = r107
            A03(r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            r1 = r56
            X.C286565Wx.A0L(r9, r1)
        L_0x0717:
            X.C286565Wx.A0L(r9, r11)
            r1 = -1980531823(0xffffffff89f37b91, float:-5.8616323E-33)
            r0.ExS(r1)
            if (r31 == 0) goto L_0x0814
            if (r30 != 0) goto L_0x08ba
            if (r29 == 0) goto L_0x08ba
            if (r21 == 0) goto L_0x08ba
            r1 = -1266853754(0xffffffffb47d5886, float:-2.3594666E-7)
            r0.ExS(r1)
            X.5Zp r12 = X.C287215Zl.A04
            androidx.compose.ui.Alignment r3 = X.C287215Zl.A0D
            r2 = r53
            r1 = r58
            androidx.compose.ui.Modifier r4 = r2.AAz(r3, r1)
            r57 = 1098907648(0x41800000, float:16.0)
            float r69 = r69 + r57
            r54 = 1090519040(0x41000000, float:8.0)
            r3 = 0
            r2 = r69
            r1 = r54
            androidx.compose.ui.Modifier r53 = X.C287195Zj.A0B(r4, r3, r2, r1, r3)
            X.5Zu r2 = X.C287275Zs.A01
            r1 = 48
            r4 = r2
            X.5RD r2 = X.C287395a4.A02(r4, r0, r12, r1)
            int r50 = X.C287425a7.A00(r0)
            X.5RM r12 = X.C286565Wx.A04(r9)
            r1 = r53
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r1)
            r0.ExX()
            boolean r1 = r9.A0K
            if (r1 == 0) goto L_0x08b5
            r1 = r63
            r0.AMT(r1)
        L_0x076c:
            r1 = r62
            X.C287595aO.A00(r0, r2, r1)
            r1 = r61
            X.C287595aO.A00(r0, r12, r1)
            boolean r1 = r9.A0K
            if (r1 != 0) goto L_0x0788
            java.lang.Object r2 = r0.ECw()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r50)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0794
        L_0x0788:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r50)
            r0.FLL(r2)
            r1 = r60
            r0.ABr(r2, r1)
        L_0x0794:
            r1 = r59
            X.C287595aO.A00(r0, r4, r1)
            r1 = -199739314(0xfffffffff418384e, float:-4.8240425E31)
            r0.ExS(r1)
            if (r148 == 0) goto L_0x07ed
            double r70 = r36.doubleValue()
            r2 = r54
            r1 = r58
            androidx.compose.ui.Modifier r66 = X.C287195Zj.A09(r1, r2, r3)
            if (r19 == 0) goto L_0x08a7
            r1 = -199727208(0xfffffffff4186798, float:-4.8298966E31)
            r0.ExS(r1)
            X.5ZE r1 = X.AnonymousClass5aQ.A01(r0)
            X.5Z4 r1 = r1.A02
            r12 = r1
            r1 = 13
            long r1 = X.AnonymousClass5Z7.A01(r1)
            long r53 = X.AnonymousClass5Z7.A01(r33)
            r3 = r1
            r1 = r53
            X.5Z4 r1 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r12, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, 0, 0, 0, 16646141, 0, r3, 0, r1)
        L_0x07cd:
            X.C286565Wx.A0L(r9, r11)
            int r2 = r5 >> 6
            r2 = r2 & 14
            r3 = r2 | 3072(0xc00, float:4.305E-42)
            int r2 = r6 >> 9
            r4 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r2
            r65 = r0
            r67 = r1
            r68 = r41
            r69 = r141
            r72 = r3
            r73 = r11
            A00(r65, r66, r67, r68, r69, r70, r72, r73)
        L_0x07ed:
            X.C286565Wx.A0L(r9, r11)
            r60 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r2 = r57
            r1 = r58
            androidx.compose.ui.Modifier r58 = X.C287205Zk.A0C(r1, r2)
            int r1 = r6 >> 27
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r57 = r0
            r59 = r131
            r61 = r1
            r62 = r11
            A04(r57, r58, r59, r60, r61, r62)
            r1 = r56
            X.C286565Wx.A0L(r9, r1)
        L_0x0811:
            X.C286565Wx.A0L(r9, r11)
        L_0x0814:
            X.C286565Wx.A0L(r9, r11)
            r1 = r56
            X.C286565Wx.A0L(r9, r1)
            java.lang.Object r1 = r51.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0899
            r57 = 0
            r2 = r64
            r1 = r139
            if (r1 != r2) goto L_0x0832
            r57 = 1
        L_0x0832:
            r1 = 900930053(0x35b31a05, float:1.3344112E-6)
            r0.ExS(r1)
            java.lang.Object r4 = r0.ECw()
            r1 = r52
            if (r4 != r1) goto L_0x084c
            r2 = 29
            X.IwM r4 = new X.IwM
            r1 = r51
            r4.<init>(r1, r2)
            r0.FLL(r4)
        L_0x084c:
            X.0sa r4 = (X.C62320sa) r4
            X.C286565Wx.A0L(r9, r11)
            r1 = 900925024(0x35b30660, float:1.3338395E-6)
            r0.ExS(r1)
            r2 = r7 & 896(0x380, float:1.256E-42)
            r1 = 256(0x100, float:3.59E-43)
            r3 = 0
            if (r2 != r1) goto L_0x085f
            r3 = 1
        L_0x085f:
            java.lang.Object r5 = r0.ECw()
            if (r3 != 0) goto L_0x0869
            r1 = r52
            if (r5 != r1) goto L_0x0879
        L_0x0869:
            r7 = 41
            X.Iw5 r5 = new X.Iw5
            r3 = r55
            r2 = r37
            r1 = r51
            r5.<init>(r7, r3, r2, r1)
            r0.FLL(r5)
        L_0x0879:
            X.0sa r5 = (X.C62320sa) r5
            X.C286565Wx.A0L(r9, r11)
            r1 = r6 & 14
            r2 = r1 | 24576(0x6000, float:3.4438E-41)
            r1 = r6 & 112(0x70, float:1.57E-43)
            r2 = r2 | r1
            r1 = r6 & 896(0x380, float:1.256E-42)
            r2 = r2 | r1
            r50 = r0
            r51 = r137
            r52 = r136
            r53 = r135
            r54 = r4
            r55 = r5
            r56 = r2
            X.HV5.A00(r50, r51, r52, r53, r54, r55, r56, r57)
        L_0x0899:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x02c9
            r1 = 783216840(0x2eaef0c8, float:7.955375E-11)
            X.0fL.A00(r1)
            goto L_0x02c9
        L_0x08a7:
            r1 = -199721888(0xfffffffff4187c60, float:-4.832469E31)
            r0.ExS(r1)
            X.5ZE r1 = X.AnonymousClass5aQ.A01(r0)
            X.5Z4 r1 = r1.A00
            goto L_0x07cd
        L_0x08b5:
            r0.FMk()
            goto L_0x076c
        L_0x08ba:
            r1 = -1265848052(0xffffffffb48cb10c, float:-2.620585E-7)
            r0.ExS(r1)
            r3 = 1111490560(0x42400000, float:48.0)
            r2 = r67
            r1 = r58
            androidx.compose.ui.Modifier r3 = X.C287205Zk.A0G(r1, r3, r2)
            r60 = 2131238564(0x7f081ea4, float:1.809341E38)
            if (r21 == 0) goto L_0x08d2
            r60 = 2131238568(0x7f081ea8, float:1.8093418E38)
        L_0x08d2:
            androidx.compose.ui.Alignment r4 = X.C287215Zl.A0D
            r2 = r53
            androidx.compose.ui.Modifier r4 = r2.AAz(r4, r1)
            r2 = 0
            r1 = r69
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r4, r2, r1, r2, r2)
            androidx.compose.ui.Modifier r58 = r1.Ezh(r3)
            int r1 = r6 >> 27
            r61 = r1 & 14
            r57 = r0
            r59 = r131
            r62 = r11
            A04(r57, r58, r59, r60, r61, r62)
            goto L_0x0811
        L_0x08f4:
            r0.FMk()
            goto L_0x0670
        L_0x08f9:
            r0.FMk()
            goto L_0x0574
        L_0x08fe:
            r3 = r38
            goto L_0x0552
        L_0x0902:
            r3 = 2131953682(0x7f130812, float:1.9543842E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r137}
            java.lang.String r80 = X.C288035bG.A01(r0, r2, r3)
            goto L_0x0540
        L_0x090f:
            r65 = 0
            goto L_0x0527
        L_0x0913:
            if (r101 == 0) goto L_0x0919
            r2 = 30
            goto L_0x04b2
        L_0x0919:
            r67 = 1111490560(0x42400000, float:48.0)
            goto L_0x04b5
        L_0x091d:
            r69 = 0
            goto L_0x0475
        L_0x0921:
            r2 = r20
            r2 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x02a0
            r2 = r18
            boolean r2 = r0.AGv(r2)
            if (r2 == 0) goto L_0x0931
            r52 = 16384(0x4000, float:2.2959E-41)
        L_0x0931:
            r9 = r9 | r52
            goto L_0x02a0
        L_0x0935:
            r2 = r20
            r2 = r2 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0298
            r2 = r19
            boolean r2 = r0.AGv(r2)
            if (r2 != 0) goto L_0x0945
            r51 = 1024(0x400, float:1.435E-42)
        L_0x0945:
            r9 = r9 | r51
            goto L_0x0298
        L_0x0949:
            r2 = r20
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0290
            r2 = r93
            boolean r2 = r0.AGw(r2)
            if (r2 == 0) goto L_0x0959
            r12 = 256(0x100, float:3.59E-43)
        L_0x0959:
            r9 = r9 | r12
            goto L_0x0290
        L_0x095c:
            r2 = r176 & 48
            if (r2 != 0) goto L_0x0286
            r2 = r86
            boolean r53 = r0.AGu(r2)
            r2 = 16
            if (r53 == 0) goto L_0x096c
            r2 = 32
        L_0x096c:
            r9 = r9 | r2
            goto L_0x0286
        L_0x096f:
            r2 = r176 & 6
            if (r2 != 0) goto L_0x0981
            r2 = r92
            boolean r9 = r0.AGw(r2)
            r2 = 2
            if (r9 == 0) goto L_0x097d
            r2 = 4
        L_0x097d:
            r9 = r176 | r2
            goto L_0x027e
        L_0x0981:
            r9 = r20
            goto L_0x027e
        L_0x0985:
            r2 = r175 & r9
            if (r2 != 0) goto L_0x0213
            r4 = 0
            r2 = r132
            boolean r9 = r0.AGu(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r9 == 0) goto L_0x0996
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x0996:
            r3 = r3 | r2
            goto L_0x0213
        L_0x0999:
            r62 = 0
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x020e
            r2 = r133
            boolean r4 = r0.AGu(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x09ab
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x09ab:
            r3 = r3 | r2
            goto L_0x020e
        L_0x09ae:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0206
            r2 = r134
            boolean r4 = r0.AGu(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x09be
            r2 = 2048(0x800, float:2.87E-42)
        L_0x09be:
            r3 = r3 | r2
            goto L_0x0206
        L_0x09c1:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x01fe
            r2 = r45
            boolean r4 = r0.AGv(r2)
            r2 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x09d1
            r2 = 256(0x100, float:3.59E-43)
        L_0x09d1:
            r3 = r3 | r2
            goto L_0x01fe
        L_0x09d4:
            r2 = r175 & 48
            if (r2 != 0) goto L_0x01f6
            r2 = r46
            boolean r4 = r0.AGv(r2)
            r2 = 16
            if (r4 == 0) goto L_0x09e4
            r2 = 32
        L_0x09e4:
            r3 = r3 | r2
            goto L_0x01f6
        L_0x09e7:
            r2 = r175 & 6
            if (r2 != 0) goto L_0x09f9
            r2 = r139
            boolean r3 = r0.AGu(r2)
            r2 = 2
            if (r3 == 0) goto L_0x09f5
            r2 = 4
        L_0x09f5:
            r3 = r175 | r2
            goto L_0x01ee
        L_0x09f9:
            r3 = r13
            goto L_0x01ee
        L_0x09fc:
            r2 = r174 & r20
            if (r2 != 0) goto L_0x01e4
            r2 = r22
            boolean r3 = r0.AGv(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == 0) goto L_0x0a0c
            r2 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0a0c:
            r1 = r1 | r2
            goto L_0x01e4
        L_0x0a0f:
            r2 = r174 & r53
            if (r2 != 0) goto L_0x01dc
            r2 = r23
            boolean r3 = r0.AGv(r2)
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r3 == 0) goto L_0x0a1f
            r2 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0a1f:
            r1 = r1 | r2
            goto L_0x01dc
        L_0x0a22:
            r2 = r174 & r55
            if (r2 != 0) goto L_0x01d4
            r2 = r24
            boolean r3 = r0.AGv(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0a32
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0a32:
            r1 = r1 | r2
            goto L_0x01d4
        L_0x0a35:
            r2 = r174 & r57
            if (r2 != 0) goto L_0x01ce
            r2 = r25
            boolean r3 = r0.AGv(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0a45
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x0a45:
            r1 = r1 | r2
            goto L_0x01ce
        L_0x0a48:
            r2 = r174 & r9
            if (r2 != 0) goto L_0x01c8
            r2 = r47
            boolean r3 = r0.AGv(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x0a58
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x0a58:
            r1 = r1 | r2
            goto L_0x01c8
        L_0x0a5b:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x01c3
            r2 = r26
            boolean r3 = r0.AGv(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0a6b
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x0a6b:
            r1 = r1 | r2
            goto L_0x01c3
        L_0x0a6e:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x01bd
            r2 = r48
            boolean r3 = r0.AGv(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0a7e
            r2 = 2048(0x800, float:2.87E-42)
        L_0x0a7e:
            r1 = r1 | r2
            goto L_0x01bd
        L_0x0a81:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x01b7
            r2 = r40
            boolean r3 = r0.AGu(r2)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0a91
            r2 = 256(0x100, float:3.59E-43)
        L_0x0a91:
            r1 = r1 | r2
            goto L_0x01b7
        L_0x0a94:
            r2 = r174 & 48
            if (r2 != 0) goto L_0x01b1
            r2 = r27
            boolean r3 = r0.AGv(r2)
            r2 = 16
            if (r3 == 0) goto L_0x0aa4
            r2 = 32
        L_0x0aa4:
            r1 = r1 | r2
            goto L_0x01b1
        L_0x0aa7:
            r1 = r174 & 6
            if (r1 != 0) goto L_0x0ab9
            r1 = r28
            boolean r2 = r0.AGv(r1)
            r1 = 2
            if (r2 == 0) goto L_0x0ab5
            r1 = 4
        L_0x0ab5:
            r1 = r174 | r1
            goto L_0x01a9
        L_0x0ab9:
            r1 = r14
            goto L_0x01a9
        L_0x0abc:
            r1 = r173 & r20
            if (r1 != 0) goto L_0x019f
            r1 = r29
            boolean r2 = r0.AGv(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x0acc
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0acc:
            r5 = r5 | r1
            goto L_0x019f
        L_0x0acf:
            r1 = r173 & r53
            if (r1 != 0) goto L_0x0197
            r1 = r30
            boolean r2 = r0.AGv(r1)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x0adf
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0adf:
            r5 = r5 | r1
            goto L_0x0197
        L_0x0ae2:
            r1 = r173 & r55
            if (r1 != 0) goto L_0x018f
            r1 = r21
            boolean r2 = r0.AGv(r1)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0af2
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0af2:
            r5 = r5 | r1
            goto L_0x018f
        L_0x0af5:
            r1 = r173 & r57
            if (r1 != 0) goto L_0x0187
            r1 = r31
            boolean r2 = r0.AGv(r1)
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x0b05
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x0b05:
            r5 = r5 | r1
            goto L_0x0187
        L_0x0b08:
            r1 = r173 & r9
            if (r1 != 0) goto L_0x017f
            r1 = r49
            boolean r2 = r0.AGv(r1)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x0b18
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0b18:
            r5 = r5 | r1
            goto L_0x017f
        L_0x0b1b:
            r1 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0178
            r1 = r32
            boolean r2 = r0.AGv(r1)
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0b2b
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0b2b:
            r5 = r5 | r1
            goto L_0x0178
        L_0x0b2e:
            r1 = r15 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0170
            r1 = r107
            boolean r2 = r0.AGv(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0b3e
            r1 = 2048(0x800, float:2.87E-42)
        L_0x0b3e:
            r5 = r5 | r1
            goto L_0x0170
        L_0x0b41:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0166
            r1 = r41
            boolean r2 = r0.AGu(r1)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0b51
            r1 = 256(0x100, float:3.59E-43)
        L_0x0b51:
            r5 = r5 | r1
            goto L_0x0166
        L_0x0b54:
            r1 = r173 & 48
            if (r1 != 0) goto L_0x015e
            r1 = r116
            boolean r2 = r0.AGv(r1)
            r1 = 16
            if (r2 == 0) goto L_0x0b64
            r1 = 32
        L_0x0b64:
            r5 = r5 | r1
            goto L_0x015e
        L_0x0b67:
            r1 = r173 & 6
            if (r1 != 0) goto L_0x0b79
            r1 = r114
            boolean r2 = r0.AGv(r1)
            r1 = 2
            if (r2 == 0) goto L_0x0b75
            r1 = 4
        L_0x0b75:
            r5 = r173 | r1
            goto L_0x0154
        L_0x0b79:
            r5 = r15
            goto L_0x0154
        L_0x0b7c:
            r1 = r172 & r20
            if (r1 != 0) goto L_0x0148
            r1 = r42
            boolean r2 = r0.AGw(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x0b8c
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0b8c:
            r7 = r7 | r1
            goto L_0x0148
        L_0x0b8f:
            r1 = r172 & r53
            if (r1 != 0) goto L_0x0140
            r1 = r88
            boolean r2 = r0.AGw(r1)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x0b9f
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0b9f:
            r7 = r7 | r1
            goto L_0x0140
        L_0x0ba2:
            r1 = r172 & r55
            if (r1 != 0) goto L_0x0138
            r1 = r95
            boolean r2 = r0.AGw(r1)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0bb2
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0bb2:
            r7 = r7 | r1
            goto L_0x0138
        L_0x0bb5:
            r1 = r172 & r57
            if (r1 != 0) goto L_0x0130
            r1 = r96
            boolean r2 = r0.AGw(r1)
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x0bc5
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x0bc5:
            r7 = r7 | r1
            goto L_0x0130
        L_0x0bc8:
            r1 = r172 & r9
            if (r1 != 0) goto L_0x0128
            r1 = r98
            boolean r2 = r0.AGw(r1)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x0bd8
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0bd8:
            r7 = r7 | r1
            goto L_0x0128
        L_0x0bdb:
            r1 = r16
            r1 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0120
            r1 = r94
            boolean r2 = r0.AGw(r1)
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0bed
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0bed:
            r7 = r7 | r1
            goto L_0x0120
        L_0x0bf0:
            r1 = r16
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x011a
            r1 = r126
            boolean r2 = r0.AGw(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0c02
            r1 = 2048(0x800, float:2.87E-42)
        L_0x0c02:
            r7 = r7 | r1
            goto L_0x011a
        L_0x0c05:
            r1 = r16
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0112
            r1 = r37
            boolean r2 = r0.AGw(r1)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0c17
            r1 = 256(0x100, float:3.59E-43)
        L_0x0c17:
            r7 = r7 | r1
            goto L_0x0112
        L_0x0c1a:
            r1 = r172 & 48
            if (r1 != 0) goto L_0x010a
            r1 = r125
            boolean r2 = r0.AGw(r1)
            r1 = 16
            if (r2 == 0) goto L_0x0c2a
            r1 = 32
        L_0x0c2a:
            r7 = r7 | r1
            goto L_0x010a
        L_0x0c2d:
            r1 = r172 & 6
            if (r1 != 0) goto L_0x0c3f
            r1 = r38
            boolean r2 = r0.AGu(r1)
            r1 = 2
            if (r2 == 0) goto L_0x0c3b
            r1 = 4
        L_0x0c3b:
            r7 = r172 | r1
            goto L_0x0102
        L_0x0c3f:
            r7 = r16
            goto L_0x0102
        L_0x0c43:
            r1 = r171 & r20
            if (r1 != 0) goto L_0x00f8
            r1 = r131
            boolean r2 = r0.AGw(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x0c53
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0c53:
            r6 = r6 | r1
            goto L_0x00f8
        L_0x0c56:
            r1 = r171 & r53
            if (r1 != 0) goto L_0x00f0
            r1 = r34
            boolean r2 = r0.AGw(r1)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x0c66
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0c66:
            r6 = r6 | r1
            goto L_0x00f0
        L_0x0c69:
            r1 = r171 & r55
            if (r1 != 0) goto L_0x00e6
            r1 = r35
            boolean r2 = r0.AGv(r1)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0c79
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0c79:
            r6 = r6 | r1
            goto L_0x00e6
        L_0x0c7c:
            r1 = r171 & r57
            if (r1 != 0) goto L_0x00dc
            r1 = r142
            boolean r2 = r0.AGu(r1)
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x0c8c
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x0c8c:
            r6 = r6 | r1
            goto L_0x00dc
        L_0x0c8f:
            r1 = r171 & r9
            if (r1 != 0) goto L_0x00d4
            r1 = r36
            boolean r2 = r0.AGu(r1)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x0c9f
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0c9f:
            r6 = r6 | r1
            goto L_0x00d4
        L_0x0ca2:
            r1 = r17
            r1 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x00cb
            r1 = r141
            boolean r2 = r0.AGu(r1)
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0cb4
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0cb4:
            r6 = r6 | r1
            goto L_0x00cb
        L_0x0cb7:
            r1 = r17
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x00c1
            r1 = r140
            boolean r2 = r0.AGu(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0cc9
            r1 = 2048(0x800, float:2.87E-42)
        L_0x0cc9:
            r6 = r6 | r1
            goto L_0x00c1
        L_0x0ccc:
            r1 = r17
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x00b7
            r1 = r135
            boolean r2 = r0.AGu(r1)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0cde
            r1 = 256(0x100, float:3.59E-43)
        L_0x0cde:
            r6 = r6 | r1
            goto L_0x00b7
        L_0x0ce1:
            r1 = r171 & 48
            if (r1 != 0) goto L_0x00ad
            r1 = r136
            boolean r2 = r0.AGu(r1)
            r1 = 16
            if (r2 == 0) goto L_0x0cf1
            r1 = 32
        L_0x0cf1:
            r6 = r6 | r1
            goto L_0x00ad
        L_0x0cf4:
            r1 = r171 & 6
            if (r1 != 0) goto L_0x0d06
            r1 = r137
            boolean r1 = r0.AGu(r1)
            r6 = 2
            if (r1 == 0) goto L_0x0d02
            r6 = 4
        L_0x0d02:
            r6 = r6 | r171
            goto L_0x00a5
        L_0x0d06:
            r6 = r17
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CY.A01(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, com.instagram.api.schemas.TextPostAppHeaderFollowVariant, X.5vN, X.6Ba, com.instagram.common.typedurl.ImageUrl, com.instagram.user.model.FollowStatus, java.lang.Double, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A02(C286575Wy r58, Modifier modifier, C299545vN r60, C303846Ba r61, Double d, Long l, String str, String str2, String str3, String str4, C62320sa r68, C62320sa r69, C62320sa r70, C62320sa r71, C62320sa r72, 0sP r73, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i4;
        int i5;
        AnonymousClass5Z4 r8;
        AnonymousClass5Z4 r82;
        Modifier A0B;
        Modifier A0B2;
        Modifier modifier2 = modifier;
        C62320sa r17 = r69;
        C62320sa r16 = r70;
        boolean z6 = z5;
        C286575Wy r0 = r58;
        r0.ExV(633886860);
        int i6 = i3;
        C62320sa r19 = r68;
        int i7 = i;
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            int i8 = 2;
            if (r0.AGw(r19)) {
                i8 = 4;
            }
            i4 = i8 | i;
        } else {
            i4 = i7;
        }
        int i9 = i3 & 2;
        int i10 = 32;
        String str5 = str;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            int i11 = 16;
            if (r0.AGu(str5)) {
                i11 = 32;
            }
            i4 |= i11;
        }
        int i12 = 128;
        boolean z7 = z;
        if ((i6 & 4) != 0) {
            i4 |= 384;
        } else if ((i7 & 384) == 0) {
            int i13 = 128;
            if (r0.AGv(z7)) {
                i13 = 256;
            }
            i4 |= i13;
        }
        int i14 = i6 & 8;
        int i15 = C249703kE.FLAG_MOVED;
        C303846Ba r77 = r61;
        if (i14 != 0) {
            i4 |= 3072;
        } else if ((i7 & 3072) == 0) {
            int i16 = 1024;
            if (r0.AGu(r77)) {
                i16 = C249703kE.FLAG_MOVED;
            }
            i4 |= i16;
        }
        int i17 = 8192;
        Double d2 = d;
        if ((i6 & 16) != 0) {
            i4 |= 24576;
        } else if ((i7 & 24576) == 0) {
            int i18 = 8192;
            if (r0.AGu(d2)) {
                i18 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i18;
        }
        Long l2 = l;
        if ((i6 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            boolean AGu = r0.AGu(l2);
            int i19 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AGu) {
                i19 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i4 |= i19;
        }
        boolean z8 = z2;
        if ((i6 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            boolean AGv = r0.AGv(z8);
            int i20 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AGv) {
                i20 = Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
            }
            i4 |= i20;
        }
        boolean z9 = z3;
        if ((i6 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            int i21 = 4194304;
            if (r0.AGv(z9)) {
                i21 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i4 |= i21;
        }
        boolean z10 = z4;
        if ((i6 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            int i22 = 33554432;
            if (r0.AGv(z10)) {
                i22 = 67108864;
            }
            i4 |= i22;
        }
        String str6 = str2;
        if ((i6 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            int i23 = 268435456;
            if (r0.AGu(str6)) {
                i23 = 536870912;
            }
            i4 |= i23;
        }
        String str7 = str3;
        int i24 = i2;
        if ((i6 & 1024) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i25 = 2;
            if (r0.AGu(str7)) {
                i25 = 4;
            }
            i5 = i25 | i2;
        } else {
            i5 = i24;
        }
        C299545vN r78 = r60;
        if ((i6 & C249703kE.FLAG_MOVED) != 0) {
            i5 |= 48;
        } else if (i2 == false || !true) {
            if (!r0.AGu(r78)) {
                i10 = 16;
            }
            i5 |= i10;
        }
        0sP r74 = r73;
        if ((i6 & 4096) != 0) {
            i5 |= 384;
        } else if (i24 == false || !true) {
            if (r0.AGw(r74)) {
                i12 = 256;
            }
            i5 |= i12;
        }
        int i26 = i6 & 8192;
        if (i26 != 0) {
            i5 |= 3072;
        } else if (i24 == false || !true) {
            if (!r0.AGu(modifier2)) {
                i15 = 1024;
            }
            i5 |= i15;
        }
        int i27 = i6 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        if (i27 != 0) {
            i5 |= 24576;
        } else if (i24 == false || !true) {
            if (r0.AGw(r17)) {
                i17 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i5 |= i17;
        }
        int i28 = i6 & Constants.LOAD_RESULT_PGO;
        if (i28 != 0) {
            i5 |= 196608;
        } else if (i2 == false || !true) {
            boolean AGw = r0.AGw(r16);
            int i29 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AGw) {
                i29 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i5 |= i29;
        }
        String str8 = str4;
        if ((65536 & i6) != 0) {
            i5 |= 1572864;
        } else if (i2 == false || !true) {
            boolean AGu2 = r0.AGu(str8);
            int i30 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AGu2) {
                i30 = Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
            }
            i5 |= i30;
        }
        C62320sa r75 = r71;
        if ((131072 & i6) != 0) {
            i5 |= 12582912;
        } else if (i24 == false || !true) {
            int i31 = 4194304;
            if (r0.AGw(r75)) {
                i31 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i5 |= i31;
        }
        C62320sa r34 = r72;
        if ((262144 & i6) != 0) {
            i5 |= 100663296;
        } else if (i24 == false || !true) {
            int i32 = 33554432;
            if (r0.AGw(r34)) {
                i32 = 67108864;
            }
            i5 |= i32;
        }
        int i33 = i6 & Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        if (i33 != 0) {
            i5 |= 805306368;
        } else if (i24 == false || !true) {
            int i34 = 268435456;
            if (r0.AGv(z6)) {
                i34 = 536870912;
            }
            i5 |= i34;
        }
        if ((i4 & 306783379) == 306783378 && (306783379 & i5) == 306783378 && r0.Bwn()) {
            r0.Evl();
        } else {
            if (i26 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i27 != 0) {
                r17 = C41590Ax4.A00;
            }
            if (i28 != 0) {
                r16 = C41591Ax5.A00;
            }
            if (i33 != 0) {
                z6 = false;
            }
            if (0fL.A02()) {
                0fL.A01(1448573621, "com.instagram.barcelona.feed.post.ui.PostHeaderUsername (PostHeader.kt:593)");
            }
            C286565Wx r4 = (C286565Wx) r0;
            UserSession userSession = (UserSession) C286615Xc.A01(C286955Yl.A00, C286565Wx.A04(r4));
            int i35 = ((i5 >> 9) & 14) >> 3;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r0, C287215Zl.A02, (i35 & 14) | (i35 & 112));
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r0, modifier2);
            C62320sa r15 = C287485aD.A00;
            r0.ExX();
            if (r4.A0K) {
                r0.AMT(r15);
            } else {
                r0.FMk();
            }
            0sL r14 = C287485aD.A03;
            C287595aO.A00(r0, A02, r14);
            0sL r13 = C287485aD.A05;
            C287595aO.A00(r0, A04, r13);
            0sL r11 = C287485aD.A02;
            if (r4.A0K || !0qQ.A0K(r0.ECw(), Integer.valueOf(A00))) {
                Integer valueOf = Integer.valueOf(A00);
                r0.FLL(valueOf);
                r0.ABr(valueOf, r11);
            }
            0sL r10 = C287485aD.A04;
            C287595aO.A00(r0, A01, r10);
            C287245Zp r12 = C287215Zl.A04;
            C285245Qk r31 = Modifier.A00;
            AnonymousClass5RD A022 = C287395a4.A02(C287275Zs.A01, r0, r12, 48);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r0, r31);
            r0.ExX();
            if (r4.A0K) {
                r0.AMT(r15);
            } else {
                r0.FMk();
            }
            C287595aO.A00(r0, A022, r14);
            C287595aO.A00(r0, A042, r13);
            if (r4.A0K || !0qQ.A0K(r0.ECw(), Integer.valueOf(A002))) {
                Integer valueOf2 = Integer.valueOf(A002);
                r0.FLL(valueOf2);
                r0.ABr(valueOf2, r11);
            }
            C287595aO.A00(r0, A012, r10);
            AnonymousClass6FX r102 = AnonymousClass6FX.A00;
            r0.ExS(-620847729);
            Modifier FNR = r102.FNR(r31, 1.0f, false);
            if (r68 != null) {
                FNR = FNR.Ezh(C288235ba.A01(r0, r31, new C287625aV(0), (String) null, r19, 3, false));
            }
            C286565Wx.A0L(r4, false);
            if (z6) {
                r0.ExS(-620837860);
                r8 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, AnonymousClass5aQ.A01(r0).A03, (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646141, 0, AnonymousClass5Z7.A01(13), 0, AnonymousClass5Z7.A01(18));
            } else {
                r0.ExS(-620833280);
                r8 = AnonymousClass5aQ.A01(r0).A01;
            }
            C286565Wx.A0L(r4, false);
            C286575Wy r35 = r0;
            AnonymousClass5ZZ.A03(r35, FNR, r8, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, str5, (0sP) null, 0, 0, 1, 2, (i4 >> 3) & 14, 390, 11260, 0, 0, 0, false);
            r0.ExS(-620832135);
            if (z7) {
                Modifier A0B3 = C287195Zj.A0B(r31, 4.0f, 0.0f, 0.0f, 0.0f);
                int i36 = 12;
                if (z6) {
                    i36 = 10;
                }
                AnonymousClass6FU.A00(r0, A0B3, (float) i36, 6, 0);
            }
            C286565Wx.A0L(r4, false);
            boolean z11 = false;
            if (r78 != C299545vN.NOT_FEDERATED) {
                z11 = true;
            }
            r0.ExS(-620823768);
            if (z11) {
                boolean z12 = false;
                if (r78 == C299545vN.WILL_BE_FEDERATED) {
                    z12 = true;
                }
                int i37 = 12;
                if (z6) {
                    i37 = 10;
                }
                float f = (float) i37;
                r0.ExS(-620815138);
                boolean z13 = false;
                if ((i5 & 896) == 256) {
                    z13 = true;
                }
                boolean AGv2 = z13 | r0.AGv(z12);
                Object ECw = r0.ECw();
                if (AGv2 || ECw == AnonymousClass5XT.A00) {
                    ECw = new GA1(13, r74, z12);
                    r0.FLL(ECw);
                }
                C286565Wx.A0L(r4, false);
                A05(r0, (C62320sa) ECw, f, z12);
            }
            C286565Wx.A0L(r4, false);
            if (str3 != null) {
                r0.ExS(-2065301295);
                C54845HVc.A00(r0, (Modifier) null, str7, i5 & 14, 2);
            } else if (l != null) {
                r0.ExS(-2065182689);
                long longValue = l2.longValue();
                if (z11) {
                    A0B2 = r31;
                } else {
                    A0B2 = C287195Zj.A0B(r31, 4.0f, 0.0f, 0.0f, 0.0f);
                }
                int i38 = i5 >> 6;
                C62320sa r38 = r17;
                C62320sa r39 = r16;
                C56233Hv0.A00(r35, A0B2, (AnonymousClass5Z4) null, r38, r39, ((i4 >> 15) & 14) | (i38 & 896) | (i38 & 7168), 112, longValue, 0, false);
            } else if (z8) {
                r0.ExS(-2064843580);
                if (z11) {
                    A0B = r31;
                } else {
                    A0B = C287195Zj.A0B(r31, 4.0f, 0.0f, 0.0f, 0.0f);
                }
                C56231Huy.A00(r35, A0B, (AnonymousClass5Z4) null, 0, 6, 0);
            } else if (d == null || z4 || z3) {
                r0.ExS(-2064071215);
            } else {
                r0.ExS(-2064613219);
                double doubleValue = d2.doubleValue();
                if (z6) {
                    r0.ExS(-620777854);
                    r82 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, AnonymousClass5aQ.A01(r0).A02, (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646141, 0, AnonymousClass5Z7.A01(13), 0, AnonymousClass5Z7.A01(18));
                } else {
                    r0.ExS(-620773034);
                    r82 = AnonymousClass5aQ.A01(r0).A00;
                }
                C286565Wx.A0L(r4, false);
                int i39 = i4 >> 6;
                AnonymousClass5Z4 r37 = r82;
                C299545vN r382 = r78;
                C303846Ba r392 = r77;
                A00(r35, (Modifier) null, r37, r382, r392, doubleValue, ((i5 >> 3) & 14) | (i39 & 112) | (i39 & 896), 8);
            }
            C286565Wx.A0L(r4, false);
            r0.ExS(-620771586);
            if ((l != null || z8) && 1CI.A00(userSession) && 182.A06(0Tu.A05, userSession, 36328650160946686L)) {
                AnonymousClass5ZZ.A0j(r35, AnonymousClass5aQ.A01(r0).A00, " [Internal-Only]", 1, 2, 6, 11258, AnonymousClass5aQ.A00(r0).A0t);
            }
            C286565Wx.A0L(r4, false);
            C286565Wx.A0L(r4, true);
            if (str2 == null || str6.length() == 0) {
                if (!(str4 == null || r72 == null)) {
                    UserSession userSession2 = userSession;
                    0qQ.A0B(userSession2, 0);
                    long A013 = 182.A01(0Tu.A05, userSession2, 36609480892487535L);
                    if (Long.valueOf(A013) != null && A013 == 0) {
                        r0.ExS(-1026617662);
                        r0.ExS(-1280040214);
                        boolean z14 = false;
                        if ((234881024 & i5) == 67108864) {
                            z14 = true;
                        }
                        Object ECw2 = r0.ECw();
                        if (z14 || ECw2 == AnonymousClass5XT.A00) {
                            ECw2 = new C58713IwM(r34, 30);
                            r0.FLL(ECw2);
                        }
                        C62320sa r9 = (C62320sa) ECw2;
                        C286565Wx.A0L(r4, false);
                        Modifier A0A = C287195Zj.A0A(r31, 0.0f, 4.0f, 16.0f);
                        r0.ExS(-1280035790);
                        boolean z15 = false;
                        if ((29360128 & i5) == 8388608) {
                            z15 = true;
                        }
                        Object ECw3 = r0.ECw();
                        if (z15 || ECw3 == AnonymousClass5XT.A00) {
                            ECw3 = new C58713IwM(r75, 31);
                            r0.FLL(ECw3);
                        }
                        C286565Wx.A0L(r4, false);
                        C56236Hv3.A01(r35, C288305bh.A00(A0A, (C62320sa) ECw3), str8, r9, (i5 >> 18) & 14, 0);
                    }
                }
                r0.ExS(-1026327440);
            } else {
                r0.ExS(-1026957484);
                AnonymousClass5ZZ.A03(r0, (Modifier) null, AnonymousClass5aQ.A01(r0).A00, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, str6, (0sP) null, 0, 0, 1, 2, (i4 >> 27) & 14, 390, 11258, AnonymousClass5aQ.A00(r0).A0t, 0, 0, false);
            }
            C286565Wx.A0L(r4, false);
            C286565Wx.A0L(r4, true);
            if (0fL.A02()) {
                0fL.A00(-774190142);
            }
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59282JDi(modifier2, r78, r77, d2, l2, str5, str6, str7, str8, r19, r17, r16, r75, r34, r74, i7, i24, i6, z7, z8, z9, z10, z6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: X.JaI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: X.Iy4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v3, resolved type: X.Iy4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v6, resolved type: X.JaI} */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05a3, code lost:
        if ((r5 & 48) == 32) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05ba, code lost:
        if (r1 == X.AnonymousClass5XT.A00) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05ef, code lost:
        if ((r5 & 48) == 32) goto L_0x05f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x060d, code lost:
        if ((r5 & 3072) == 2048) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0624, code lost:
        if ((r5 & 384) == 256) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0642, code lost:
        if ((r5 & 24576) == 16384) goto L_0x0644;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0653, code lost:
        if (r1 == X.AnonymousClass5XT.A00) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06fe, code lost:
        if ((r9 & 24576) == 16384) goto L_0x0700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0845, code lost:
        if (r2 == 16384) goto L_0x0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r71 != false) goto L_0x012c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x08bf  */
    /* JADX WARNING: Removed duplicated region for block: B:383:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r58, androidx.compose.ui.Modifier r59, X.C303846Ba r60, com.instagram.common.typedurl.ImageUrl r61, java.lang.String r62, java.lang.String r63, X.C62320sa r64, X.C62320sa r65, int r66, int r67, int r68, boolean r69, boolean r70, boolean r71, boolean r72) {
        /*
            r16 = r59
            r1 = 1417392927(0x547bb31f, float:4.32416778E12)
            r0 = r58
            r0.ExV(r1)
            r18 = r68
            r1 = r68 & 1
            r19 = r64
            r14 = r66
            if (r1 == 0) goto L_0x0921
            r1 = r66 | 6
        L_0x0016:
            r2 = r68 & 2
            r20 = r62
            if (r2 == 0) goto L_0x090e
            r1 = r1 | 48
        L_0x001e:
            r2 = r68 & 4
            if (r2 == 0) goto L_0x08fb
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r2 = r68 & 8
            r64 = r61
            if (r2 == 0) goto L_0x08e8
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r2 = r68 & 16
            r21 = r60
            if (r2 == 0) goto L_0x08d5
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r3 = r68 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            r17 = r69
            if (r3 != 0) goto L_0x004c
            r2 = r66 & r2
            if (r2 != 0) goto L_0x004d
            r2 = r17
            boolean r3 = r0.AGv(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x004c
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r3 = r68 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            r24 = r70
            if (r3 != 0) goto L_0x0065
            r2 = r66 & r2
            if (r2 != 0) goto L_0x0066
            r2 = r24
            boolean r3 = r0.AGv(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0065
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r71
            if (r3 != 0) goto L_0x0080
            r2 = r66 & r2
            if (r2 != 0) goto L_0x0081
            r2 = r23
            boolean r3 = r0.AGv(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0080
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0080:
            r1 = r1 | r2
        L_0x0081:
            r2 = r18
            r3 = r2 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r72
            if (r3 != 0) goto L_0x009b
            r2 = r66 & r2
            if (r2 != 0) goto L_0x009c
            r2 = r22
            boolean r3 = r0.AGv(r2)
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r3 == 0) goto L_0x009b
            r2 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009b:
            r1 = r1 | r2
        L_0x009c:
            r2 = r18
            r2 = r2 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r62 = r65
            if (r2 != 0) goto L_0x00b6
            r2 = r66 & r3
            if (r2 != 0) goto L_0x00b7
            r2 = r62
            boolean r2 = r0.AGw(r2)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x00b6
            r3 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b6:
            r1 = r1 | r3
        L_0x00b7:
            r2 = r18
            r3 = r2 & 1024(0x400, float:1.435E-42)
            r48 = r67
            if (r3 == 0) goto L_0x08bf
            r5 = r67 | 6
        L_0x00c1:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r1 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r2) goto L_0x0103
            r4 = r5 & 3
            r2 = 2
            if (r4 != r2) goto L_0x0103
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0103
            r0.Evl()
        L_0x00d9:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0102
            X.JCX r0 = new X.JCX
            r39 = r0
            r40 = r16
            r41 = r21
            r42 = r64
            r43 = r20
            r44 = r63
            r45 = r19
            r46 = r62
            r47 = r14
            r49 = r18
            r50 = r17
            r51 = r24
            r52 = r23
            r53 = r22
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r1.A06 = r0
        L_0x0102:
            return
        L_0x0103:
            if (r3 == 0) goto L_0x0107
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
        L_0x0107:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0115
            r3 = 178224917(0xa9f7f15, float:1.5358946E-32)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostProfilePicture (PostHeader.kt:477)"
            X.0fL.A01(r3, r2)
        L_0x0115:
            X.4bM r25 = X.C286955Yl.A00
            r4 = r0
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r3 = X.C286565Wx.A04(r4)
            r2 = r25
            java.lang.Object r2 = X.C286615Xc.A01(r2, r3)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            if (r70 != 0) goto L_0x012c
            r29 = 0
            if (r71 == 0) goto L_0x012e
        L_0x012c:
            r29 = 1
        L_0x012e:
            java.lang.Integer r26 = X.C304086Cc.A00(r2)
            r3 = 0
            X.0qQ.A0B(r2, r3)
            if (r20 == 0) goto L_0x08bb
            X.17i r5 = X.17h.A00(r2)
            r6 = r20
            com.instagram.user.model.User r8 = r5.A02(r6)
            if (r8 == 0) goto L_0x08bb
            long r27 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r27 = r27 / r5
            X.0Tu r7 = X.0Tu.A05
            r5 = 36608243941906082(0x820f01000216a2, double:3.2145391062032895E-306)
            long r11 = X.182.A01(r7, r2, r5)
            r5 = 36608243941971619(0x820f01000316a3, double:3.2145391062447354E-306)
            long r9 = X.182.A01(r7, r2, r5)
            r5 = 1
            long r11 = r11 + r5
            int r5 = (r11 > r27 ? 1 : (r11 == r27 ? 0 : -1))
            if (r5 > 0) goto L_0x08bb
            int r5 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x08bb
            X.4Cl r5 = r8.A03
            java.lang.Boolean r5 = r5.B0h()
            if (r5 == 0) goto L_0x08bb
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x08bb
            X.4Cl r5 = r8.A03
            java.lang.Boolean r5 = r5.BDJ()
            if (r5 == 0) goto L_0x0187
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x08bb
        L_0x0187:
            if (r29 == 0) goto L_0x018f
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r5 = r26
            if (r5 != r6) goto L_0x08bb
        L_0x018f:
            r28 = 1
        L_0x0191:
            if (r72 == 0) goto L_0x08b8
            if (r20 == 0) goto L_0x08b8
            r5 = 36327567829056009(0x810fbb00013a09, double:3.037038402244913E-306)
            X.0tM r5 = X.AnonymousClass0yP.A00(r5)
            boolean r5 = X.0yU.A07(r5)
            if (r5 == 0) goto L_0x08b8
            r5 = r20
            boolean r5 = X.2R8.A05(r2, r5)
            if (r5 != 0) goto L_0x08b8
            X.17i r5 = X.17h.A00(r2)
            r6 = r20
            com.instagram.user.model.User r5 = r5.A02(r6)
            if (r5 == 0) goto L_0x08b8
            X.4Cl r5 = r5.A03
            java.lang.Integer r5 = r5.C4w()
            if (r5 == 0) goto L_0x08b8
            int r8 = r5.intValue()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = java.lang.System.currentTimeMillis()
            long r9 = r7.toSeconds(r5)
            long r5 = (long) r8
            long r9 = r9 - r5
            X.0Tu r7 = X.0Tu.A05
            r5 = 36609042805888789(0x820fbb00031715, double:3.2150443110027205E-306)
            long r6 = X.182.A01(r7, r2, r5)
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x08b8
            if (r28 == 0) goto L_0x01e7
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r5 = r26
            if (r5 != r6) goto L_0x08b8
        L_0x01e7:
            r8 = 1
        L_0x01e8:
            X.0Tu r27 = X.0Tu.A05
            r5 = 36327567828990472(0x810fbb00003a08, double:3.037038402203467E-306)
            r7 = r27
            boolean r5 = X.182.A06(r7, r2, r5)
            if (r8 == 0) goto L_0x0867
            r2 = 875115952(0x342935b0, float:1.5758883E-7)
            r0.ExS(r2)
            if (r5 == 0) goto L_0x0720
            r2 = 875139419(0x3429915b, float:1.5792232E-7)
            r0.ExS(r2)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            int r2 = r1 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r9 = r2 | 390(0x186, float:5.47E-43)
            r8 = 57344(0xe000, float:8.0356E-41)
            int r2 = r1 >> 15
            r2 = r2 & r8
            r9 = r9 | r2
            r41 = 1
            r2 = 2023997660(0x78a3c0dc, float:2.6570501E34)
            r0.ExS(r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x022a
            r5 = -1174324220(0xffffffffba013c04, float:-4.9299025E-4)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.animateFollowAndPresenceBadge (PostHeader.kt:823)"
            X.0fL.A01(r5, r2)
        L_0x022a:
            r2 = -671771033(0xffffffffd7f59667, float:-5.40052644E14)
            r0.ExS(r2)
            java.lang.Object r11 = r0.ECw()
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            r33 = 0
            if (r11 != r7) goto L_0x024f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r41)
            X.5Or r5 = X.C284885Or.A00
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r5, r2)
            X.0eM r2 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r11 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r11.<init>(r5, r6)
            r4.A0Q(r11)
        L_0x024f:
            X.5Oz r11 = (X.C284945Oz) r11
            X.C286565Wx.A0L(r4, r3)
            java.lang.Object r6 = r11.getValue()
            r5 = 48
            java.lang.String r2 = "badge transition"
            X.I4f r32 = X.I67.A03(r0, r6, r2, r5)
            X.JIA r12 = X.JIA.A00
            X.5an r36 = X.C287765aj.A01
            java.lang.Object r2 = r32.A04()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            r6 = 782457460(0x2ea35a74, float:7.4284495E-11)
            r0.ExS(r6)
            boolean r2 = X.0fL.A02()
            java.lang.String r5 = "com.instagram.barcelona.feed.post.ui.animateFollowAndPresenceBadge.<anonymous> (PostHeader.kt:828)"
            if (r2 == 0) goto L_0x0282
            r2 = 1309408480(0x4e0bfce0, float:5.8715136E8)
            X.0fL.A01(r2, r5)
        L_0x0282:
            r2 = 1098907648(0x41800000, float:16.0)
            if (r10 == 0) goto L_0x0287
            r2 = 0
        L_0x0287:
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x0293
            r10 = -2000297078(0xffffffff88c5e38a, float:-1.191E-33)
            X.0fL.A00(r10)
        L_0x0293:
            X.C286565Wx.A0L(r4, r3)
            X.5d0 r15 = new X.5d0
            r15.<init>(r2)
            r2 = r32
            X.5Oz r2 = r2.A07
            r30 = r2
            java.lang.Object r2 = r30.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            r0.ExS(r6)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x02ba
            r2 = -35780733(0xfffffffffdde0783, float:-3.6890952E37)
            X.0fL.A01(r2, r5)
        L_0x02ba:
            r2 = 1098907648(0x41800000, float:16.0)
            if (r10 == 0) goto L_0x02bf
            r2 = 0
        L_0x02bf:
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x02cb
            r5 = 1545845830(0x5c23bc46, float:1.8434972E17)
            X.0fL.A00(r5)
        L_0x02cb:
            X.C286565Wx.A0L(r4, r3)
            X.5d0 r5 = new X.5d0
            r5.<init>(r2)
            X.JQ8 r2 = r32.A03()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r12.invoke(r2, r0, r10)
            X.5b8 r2 = (X.AnonymousClass5b8) r2
            r40 = 196608(0x30000, float:2.75506E-40)
            r34 = r2
            r35 = r32
            r37 = r0
            r38 = r15
            r39 = r5
            X.IFp r31 = X.I67.A01(r34, r35, r36, r37, r38, r39, r40)
            X.JIB r15 = X.JIB.A00
            java.lang.Object r2 = r32.A04()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r12 = r2.booleanValue()
            r6 = 856268003(0x33099ce3, float:3.2040486E-8)
            r0.ExS(r6)
            boolean r2 = X.0fL.A02()
            java.lang.String r5 = "com.instagram.barcelona.feed.post.ui.animateFollowAndPresenceBadge.<anonymous> (PostHeader.kt:832)"
            if (r2 == 0) goto L_0x0311
            r2 = 318629316(0x12fde5c4, float:1.6023186E-27)
            X.0fL.A01(r2, r5)
        L_0x0311:
            r2 = 0
            if (r12 == 0) goto L_0x0316
            r2 = 1092616192(0x41200000, float:10.0)
        L_0x0316:
            boolean r12 = X.0fL.A02()
            if (r12 == 0) goto L_0x0322
            r12 = 1535645717(0x5b881815, float:7.6614151E16)
            X.0fL.A00(r12)
        L_0x0322:
            X.C286565Wx.A0L(r4, r3)
            X.5d0 r12 = new X.5d0
            r12.<init>(r2)
            java.lang.Object r2 = r30.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r30 = r2.booleanValue()
            r0.ExS(r6)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0343
            r2 = -1625423849(0xffffffff9f1e0017, float:-3.3457876E-20)
            X.0fL.A01(r2, r5)
        L_0x0343:
            r2 = 0
            if (r30 == 0) goto L_0x0348
            r2 = 1092616192(0x41200000, float:10.0)
        L_0x0348:
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x0354
            r5 = -516023954(0xffffffffe13e196e, float:-2.1916961E20)
            X.0fL.A00(r5)
        L_0x0354:
            X.C286565Wx.A0L(r4, r3)
            X.5d0 r5 = new X.5d0
            r5.<init>(r2)
            X.JQ8 r2 = r32.A03()
            java.lang.Object r2 = r15.invoke(r2, r0, r10)
            X.5b8 r2 = (X.AnonymousClass5b8) r2
            r34 = r2
            r38 = r12
            r39 = r5
            X.IFp r12 = X.I67.A01(r34, r35, r36, r37, r38, r39, r40)
            r2 = -671755349(0xffffffffd7f5d3ab, float:-5.40578912E14)
            r0.ExS(r2)
            if (r29 == 0) goto L_0x039a
            X.0gF r10 = X.C60340gF.A00
            r2 = -671752842(0xffffffffd7f5dd76, float:-5.40663033E14)
            r0.ExS(r2)
            java.lang.Object r6 = r0.ECw()
            if (r6 != r7) goto L_0x0392
            r5 = 44
            X.MFS r6 = new X.MFS
            r2 = r33
            r6.<init>(r11, r2, r5)
            r0.FLL(r6)
        L_0x0392:
            X.0sL r6 = (X.0sL) r6
            X.C286565Wx.A0L(r4, r3)
            X.C286645Xf.A04(r0, r10, r6)
        L_0x039a:
            X.C286565Wx.A0L(r4, r3)
            if (r29 == 0) goto L_0x06af
            java.lang.Object r2 = r31.getValue()
            X.5d0 r2 = (X.C289095d0) r2
            float r5 = r2.A00
            r2 = 0
            boolean r2 = X.C289095d0.A01(r5, r2)
            if (r2 != 0) goto L_0x06af
            r2 = 650645475(0x26c80fe3, float:1.3882094E-15)
            r0.ExS(r2)
            r2 = 2131238108(0x7f081cdc, float:1.8092485E38)
            if (r69 == 0) goto L_0x03bc
            r2 = 2131238099(0x7f081cd3, float:1.8092467E38)
        L_0x03bc:
            X.2DO r6 = X.C287975bA.A00(r0, r2, r3)
            X.4bM r5 = X.C52601GZa.A00
            X.5RM r2 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.C286615Xc.A01(r5, r2)
            X.5RW r2 = (X.AnonymousClass5RW) r2
            long r10 = r2.A00
            java.lang.Object r2 = r31.getValue()
            X.5d0 r2 = (X.C289095d0) r2
            float r7 = r2.A00
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r0)
            long r8 = r2.A0n
            X.Iwo r5 = new X.Iwo
            r5.<init>(r6, r7, r8, r10)
            androidx.compose.ui.draw.DrawWithCacheElement r2 = new androidx.compose.ui.draw.DrawWithCacheElement
            r2.<init>(r5)
            androidx.compose.ui.Modifier r2 = r13.Ezh(r2)
        L_0x03ea:
            X.C286565Wx.A0L(r4, r3)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x03f9
            r5 = -1531773476(0xffffffffa4b2fddc, float:-7.762525E-17)
        L_0x03f6:
            X.0fL.A00(r5)
        L_0x03f9:
            X.C286565Wx.A0L(r4, r3)
            X.C286565Wx.A0L(r4, r3)
            X.C286565Wx.A0L(r4, r3)
            r55 = 1
        L_0x0404:
            if (r19 == 0) goto L_0x069e
            r5 = 876364663(0x343c4377, float:1.7533408E-7)
            r0.ExS(r5)
            r5 = -803011196(0xffffffffd0230584, float:-1.09401907E10)
            r0.ExS(r5)
            if (r29 == 0) goto L_0x069a
            r5 = 2131953724(0x7f13083c, float:1.9543927E38)
            if (r69 == 0) goto L_0x041c
            r5 = 2131953626(0x7f1307da, float:1.9543728E38)
        L_0x041c:
            java.lang.String r32 = X.C288035bG.A00(r0, r5)
        L_0x0420:
            X.C286565Wx.A0L(r4, r3)
            r31 = 0
            r5 = -803002876(0xffffffffd0232604, float:-1.09487104E10)
            r0.ExS(r5)
            r6 = r1 & 14
            r5 = 4
            r8 = 0
            if (r6 != r5) goto L_0x0432
            r8 = 1
        L_0x0432:
            java.lang.Object r7 = r0.ECw()
            if (r8 != 0) goto L_0x043c
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r7 != r5) goto L_0x0448
        L_0x043c:
            r6 = 45
            X.9Kx r7 = new X.9Kx
            r5 = r19
            r7.<init>(r5, r6)
            r0.FLL(r7)
        L_0x0448:
            X.0sa r7 = (X.C62320sa) r7
            X.C286565Wx.A0L(r4, r3)
            r34 = 5
            r29 = r0
            r30 = r13
            r33 = r7
            r35 = r3
            androidx.compose.ui.Modifier r32 = X.C288235ba.A01(r29, r30, r31, r32, r33, r34, r35)
            r6 = 2131953706(0x7f13082a, float:1.954389E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r63}
            java.lang.String r38 = X.C288035bG.A01(r0, r5, r6)
        L_0x0466:
            X.C286565Wx.A0L(r4, r3)
            r5 = r21
            boolean r5 = r5 instanceof X.AnonymousClass6BZ
            if (r5 == 0) goto L_0x068f
            r5 = r21
            X.6BZ r5 = (X.AnonymousClass6BZ) r5
            X.6BY r5 = r5.A00
            r31 = r5
        L_0x0477:
            r5 = -802979646(0xffffffffd02380c2, float:-1.09724979E10)
            r0.ExS(r5)
            r5 = r16
            androidx.compose.ui.Modifier r30 = r5.Ezh(r2)
            if (r28 == 0) goto L_0x04ee
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r29 = 1098907648(0x41800000, float:16.0)
            r2 = r26
            if (r2 != r5) goto L_0x048f
            r29 = 1101004800(0x41a00000, float:20.0)
        L_0x048f:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r5 = r1 | 6
            X.0qQ.A0B(r13, r3)
            r1 = -1408120791(0xffffffffac11c829, float:-2.071685E-12)
            r0.ExS(r1)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r0)
            long r1 = r1.A0k
            r33 = r1
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x04b2
            r2 = 141658405(0x8718925, float:7.268451E-34)
            java.lang.String r1 = "com.instagram.barcelona.activationbadge.ui.activationBadge (ActivationBadge.kt:36)"
            X.0fL.A01(r2, r1)
        L_0x04b2:
            X.5RM r2 = X.C286565Wx.A04(r4)
            r1 = r25
            java.lang.Object r6 = X.C286615Xc.A01(r1, r2)
            X.0lg r6 = (X.0lg) r6
            boolean r9 = X.C287025Ys.A00(r0)
            r7 = 0
            X.0qQ.A0B(r6, r3)
            if (r9 == 0) goto L_0x0688
            r1 = 36889718919398241(0x830f01000e0361, double:3.392545015378091E-306)
        L_0x04cd:
            r8 = r27
            java.lang.String r15 = X.182.A04(r8, r6, r1)
            int r1 = r15.length()
            if (r1 != 0) goto L_0x052a
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x04e5
            r1 = 2086444290(0x7c5c9d02, float:4.5819592E36)
        L_0x04e2:
            X.0fL.A00(r1)
        L_0x04e5:
            X.C286565Wx.A0L(r4, r3)
            r1 = r30
            androidx.compose.ui.Modifier r30 = r1.Ezh(r13)
        L_0x04ee:
            X.C286565Wx.A0L(r4, r3)
            r2 = r30
            r1 = r32
            androidx.compose.ui.Modifier r2 = r2.Ezh(r1)
            X.5ZQ r1 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r34 = X.AnonymousClass6FZ.A01(r2, r1)
            r33 = 0
            r42 = 0
            r46 = 0
            r45 = 2040(0x7f8, float:2.859E-42)
            r32 = r0
            r35 = r33
            r36 = r33
            r37 = r31
            r39 = r33
            r40 = r33
            r41 = r33
            r43 = r3
            r44 = r3
            X.C304096Cd.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00d9
            r1 = 304601757(0x1227da9d, float:5.296537E-28)
            X.0fL.A00(r1)
            goto L_0x00d9
        L_0x052a:
            X.4bM r2 = X.C286915Yh.A00
            X.5RM r1 = X.C286565Wx.A04(r4)
            java.lang.Object r28 = X.C286615Xc.A01(r2, r1)
            if (r9 == 0) goto L_0x0543
            r1 = 36889718918939484(0x830f010007035c, double:3.3925450150879715E-306)
        L_0x053b:
            java.lang.String r1 = X.182.A04(r8, r6, r1)
            X.0qQ.A0A(r1)
            goto L_0x0549
        L_0x0543:
            r1 = 36889718919005021(0x830f010008035d, double:3.3925450151294174E-306)
            goto L_0x053b
        L_0x0549:
            int r7 = android.graphics.Color.parseColor(r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x054d }
        L_0x054d:
            long r10 = (long) r7
            r7 = 32
            long r10 = r10 << r7
            long r1 = X.AnonymousClass5RW.A01
            if (r9 == 0) goto L_0x0563
            r1 = 36889718918873947(0x830f010006035b, double:3.3925450150465257E-306)
        L_0x055a:
            java.lang.String r2 = X.182.A04(r8, r6, r1)
            X.0qQ.A0A(r2)
            r1 = 0
            goto L_0x0569
        L_0x0563:
            r1 = 36889718919070558(0x830f010009035e, double:3.392545015170863E-306)
            goto L_0x055a
        L_0x0569:
            int r1 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x056d }
        L_0x056d:
            long r8 = (long) r1
            long r8 = r8 << r7
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r15)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r0)
            long r1 = r1.A17
            r43 = 0
            r52 = 28
            r49 = r0
            r50 = r12
            r51 = r3
            r53 = r1
            X.2DO r26 = X.C304106Ce.A00(r49, r50, r51, r52, r53)
            X.0gF r25 = X.C60340gF.A00
            r1 = -697173504(0xffffffffd671fa00, float:-6.6514011E13)
            r0.ExS(r1)
            r1 = r5 & 112(0x70, float:1.57E-43)
            r2 = r1 ^ 48
            if (r2 <= r7) goto L_0x05a0
            r1 = r20
            boolean r1 = r0.AGu(r1)
            if (r1 != 0) goto L_0x05a5
        L_0x05a0:
            r1 = r5 & 48
            r15 = 0
            if (r1 != r7) goto L_0x05a6
        L_0x05a5:
            r15 = 1
        L_0x05a6:
            boolean r12 = r0.AGw(r6)
            r12 = r12 | r15
            r1 = r28
            boolean r1 = r0.AGw(r1)
            r12 = r12 | r1
            java.lang.Object r1 = r0.ECw()
            if (r12 != 0) goto L_0x05bc
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r1 != r12) goto L_0x05ce
        L_0x05bc:
            r44 = 5
            X.JaI r1 = new X.JaI
            r39 = r1
            r40 = r28
            r41 = r6
            r42 = r20
            r39.<init>(r40, r41, r42, r43, r44)
            r0.FLL(r1)
        L_0x05ce:
            X.0sL r1 = (X.0sL) r1
            X.C286565Wx.A0L(r4, r3)
            r12 = r25
            X.C286645Xf.A04(r0, r12, r1)
            r1 = -697157074(0xffffffffd6723a2e, float:-6.6582923E13)
            r0.ExS(r1)
            boolean r12 = r0.AGw(r6)
            if (r2 <= r7) goto L_0x05ec
            r1 = r20
            boolean r1 = r0.AGu(r1)
            if (r1 != 0) goto L_0x05f1
        L_0x05ec:
            r1 = r5 & 48
            r2 = 0
            if (r1 != r7) goto L_0x05f2
        L_0x05f1:
            r2 = 1
        L_0x05f2:
            r12 = r12 | r2
            r1 = r26
            boolean r1 = r0.AGw(r1)
            r12 = r12 | r1
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 <= r2) goto L_0x060a
            r1 = r29
            boolean r1 = r0.AGr(r1)
            if (r1 != 0) goto L_0x060f
        L_0x060a:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            r7 = 0
            if (r1 != r2) goto L_0x0610
        L_0x060f:
            r7 = 1
        L_0x0610:
            r12 = r12 | r7
            r1 = r5 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L_0x0621
            r1 = r29
            boolean r1 = r0.AGr(r1)
            if (r1 != 0) goto L_0x0626
        L_0x0621:
            r1 = r5 & 384(0x180, float:5.38E-43)
            r7 = 0
            if (r1 != r2) goto L_0x0627
        L_0x0626:
            r7 = 1
        L_0x0627:
            r12 = r12 | r7
            boolean r1 = r0.AGt(r10)
            r12 = r12 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r1 = r1 ^ 24576(0x6000, float:3.4438E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r1 <= r7) goto L_0x063f
            r1 = r33
            boolean r1 = r0.AGt(r1)
            if (r1 != 0) goto L_0x0644
        L_0x063f:
            r1 = r5 & 24576(0x6000, float:3.4438E-41)
            r2 = 0
            if (r1 != r7) goto L_0x0645
        L_0x0644:
            r2 = 1
        L_0x0645:
            r12 = r12 | r2
            boolean r1 = r0.AGt(r8)
            r12 = r12 | r1
            java.lang.Object r1 = r0.ECw()
            if (r12 != 0) goto L_0x0655
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x066f
        L_0x0655:
            X.Iy4 r1 = new X.Iy4
            r49 = r1
            r50 = r6
            r51 = r26
            r52 = r20
            r53 = r29
            r54 = r29
            r56 = r10
            r58 = r33
            r60 = r8
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r58, r60)
            r0.FLL(r1)
        L_0x066f:
            X.0sP r1 = (X.0sP) r1
            X.C286565Wx.A0L(r4, r3)
            androidx.compose.ui.draw.DrawWithCacheElement r2 = new androidx.compose.ui.draw.DrawWithCacheElement
            r2.<init>(r1)
            androidx.compose.ui.Modifier r13 = r13.Ezh(r2)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x04e5
            r1 = -114603095(0xfffffffff92b4ba9, float:-5.5588583E34)
            goto L_0x04e2
        L_0x0688:
            r1 = 36889718918546265(0x830f0100010359, double:3.392545014839298E-306)
            goto L_0x04cd
        L_0x068f:
            X.6BY r31 = new X.6BY
            r6 = r31
            r5 = r64
            r6.<init>(r5)
            goto L_0x0477
        L_0x069a:
            r32 = 0
            goto L_0x0420
        L_0x069e:
            r5 = 876903350(0x34447bb6, float:1.8298928E-7)
            r0.ExS(r5)
            r32 = r13
            r5 = 2131953705(0x7f130829, float:1.9543889E38)
            java.lang.String r38 = X.C288035bG.A00(r0, r5)
            goto L_0x0466
        L_0x06af:
            r2 = 651117977(0x26cf4599, float:1.4382375E-15)
            r0.ExS(r2)
            java.lang.Object r2 = r12.getValue()
            X.5d0 r2 = (X.C289095d0) r2
            float r10 = r2.A00
            X.4bM r5 = X.C52601GZa.A00
            X.5RM r2 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.C286615Xc.A01(r5, r2)
            X.5RW r2 = (X.AnonymousClass5RW) r2
            long r5 = r2.A00
            r40 = 1073741824(0x40000000, float:2.0)
            r38 = 1065353216(0x3f800000, float:1.0)
            X.0qQ.A0B(r13, r3)
            X.J6X r2 = new X.J6X
            r37 = r2
            r39 = r10
            r42 = r5
            r37.<init>((float) r38, (float) r39, (float) r40, (int) r41, (long) r42)
            androidx.compose.ui.draw.DrawWithCacheElement r5 = new androidx.compose.ui.draw.DrawWithCacheElement
            r5.<init>(r2)
            androidx.compose.ui.Modifier r10 = r13.Ezh(r5)
            r2 = 1827699153(0x6cf079d1, float:2.3257397E27)
            r0.ExS(r2)
            r8 = r8 & r9
            r2 = r8 ^ 24576(0x6000, float:3.4438E-41)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r2 <= r5) goto L_0x06fb
            r2 = r62
            boolean r2 = r0.AGu(r2)
            if (r2 != 0) goto L_0x0700
        L_0x06fb:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            r6 = 0
            if (r2 != r5) goto L_0x0701
        L_0x0700:
            r6 = 1
        L_0x0701:
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x0709
            if (r5 != r7) goto L_0x0715
        L_0x0709:
            r6 = 32
            X.IwM r5 = new X.IwM
            r2 = r62
            r5.<init>(r2, r6)
            r0.FLL(r5)
        L_0x0715:
            X.0sa r5 = (X.C62320sa) r5
            X.C286565Wx.A0L(r4, r3)
            androidx.compose.ui.Modifier r2 = X.C288305bh.A00(r10, r5)
            goto L_0x03ea
        L_0x0720:
            r2 = 875432834(0x342e0b82, float:1.62092E-7)
            r0.ExS(r2)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            int r2 = r1 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r2 | 390(0x186, float:5.47E-43)
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r1 >> 15
            r2 = r2 & r6
            r7 = r7 | r2
            r34 = 1
            r2 = -463761717(0xffffffffe45b8ecb, float:-1.6200505E22)
            r0.ExS(r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x074b
            r5 = 1100767769(0x419c6219, float:19.5479)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.followAndPresenceBadge (PostHeader.kt:871)"
            X.0fL.A01(r5, r2)
        L_0x074b:
            r2 = -1224457850(0xffffffffb7044186, float:-7.883069E-6)
            r0.ExS(r2)
            java.lang.Object r8 = r0.ECw()
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            r11 = 0
            if (r8 != r5) goto L_0x076f
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r34)
            X.5Or r9 = X.C284885Or.A00
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r9, r2)
            X.0eM r2 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r8.<init>(r9, r10)
            r4.A0Q(r8)
        L_0x076f:
            X.5Oz r8 = (X.C284945Oz) r8
            X.C286565Wx.A0L(r4, r3)
            r2 = -1224455990(0xffffffffb70448ca, float:-7.884761E-6)
            r0.ExS(r2)
            if (r29 == 0) goto L_0x079c
            X.0gF r10 = X.C60340gF.A00
            r2 = -1224453483(0xffffffffb7045295, float:-7.887041E-6)
            r0.ExS(r2)
            java.lang.Object r9 = r0.ECw()
            if (r9 != r5) goto L_0x0794
            r2 = 45
            X.MFS r9 = new X.MFS
            r9.<init>(r8, r11, r2)
            r0.FLL(r9)
        L_0x0794:
            X.0sL r9 = (X.0sL) r9
            X.C286565Wx.A0L(r4, r3)
            X.C286645Xf.A04(r0, r10, r9)
        L_0x079c:
            X.C286565Wx.A0L(r4, r3)
            if (r29 == 0) goto L_0x07f1
            java.lang.Object r2 = r8.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x07f1
            r2 = -1224448168(0xffffffffb7046758, float:-7.891875E-6)
            r0.ExS(r2)
            r2 = 2131238108(0x7f081cdc, float:1.8092485E38)
            if (r69 == 0) goto L_0x07bb
            r2 = 2131238099(0x7f081cd3, float:1.8092467E38)
        L_0x07bb:
            X.2DO r6 = X.C287975bA.A00(r0, r2, r3)
            X.4bM r5 = X.C52601GZa.A00
            X.5RM r2 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.C286615Xc.A01(r5, r2)
            X.5RW r2 = (X.AnonymousClass5RW) r2
            long r10 = r2.A00
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r0)
            long r8 = r2.A0n
            r7 = 1098907648(0x41800000, float:16.0)
            X.Iwo r5 = new X.Iwo
            r5.<init>(r6, r7, r8, r10)
            androidx.compose.ui.draw.DrawWithCacheElement r2 = new androidx.compose.ui.draw.DrawWithCacheElement
            r2.<init>(r5)
            androidx.compose.ui.Modifier r2 = r13.Ezh(r2)
        L_0x07e3:
            X.C286565Wx.A0L(r4, r3)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x03f9
            r5 = 428058234(0x1983a67a, float:1.3612322E-23)
            goto L_0x03f6
        L_0x07f1:
            r2 = 697281674(0x298fac8a, float:6.3804065E-14)
            r0.ExS(r2)
            r2 = r13
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x07e3
            X.4bM r8 = X.C52601GZa.A00
            X.5RM r2 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.C286615Xc.A01(r8, r2)
            X.5RW r2 = (X.AnonymousClass5RW) r2
            long r8 = r2.A00
            r32 = 1092616192(0x41200000, float:10.0)
            r33 = 1073741824(0x40000000, float:2.0)
            r31 = 1065353216(0x3f800000, float:1.0)
            X.0qQ.A0B(r13, r3)
            X.J6X r2 = new X.J6X
            r30 = r2
            r35 = r8
            r30.<init>((float) r31, (float) r32, (float) r33, (int) r34, (long) r35)
            androidx.compose.ui.draw.DrawWithCacheElement r8 = new androidx.compose.ui.draw.DrawWithCacheElement
            r8.<init>(r2)
            androidx.compose.ui.Modifier r8 = r13.Ezh(r8)
            r2 = -1687364560(0xffffffff9b6cdc30, float:-1.9592609E-22)
            r0.ExS(r2)
            r6 = r6 & r7
            r2 = r6 ^ 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r2 <= r6) goto L_0x0842
            r2 = r62
            boolean r2 = r0.AGu(r2)
            if (r2 != 0) goto L_0x0847
        L_0x0842:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            r7 = 0
            if (r2 != r6) goto L_0x0848
        L_0x0847:
            r7 = 1
        L_0x0848:
            java.lang.Object r6 = r0.ECw()
            if (r7 != 0) goto L_0x0850
            if (r6 != r5) goto L_0x085c
        L_0x0850:
            r5 = 33
            X.IwM r6 = new X.IwM
            r2 = r62
            r6.<init>(r2, r5)
            r0.FLL(r6)
        L_0x085c:
            X.0sa r6 = (X.C62320sa) r6
            X.C286565Wx.A0L(r4, r3)
            androidx.compose.ui.Modifier r2 = X.C288305bh.A00(r8, r6)
            goto L_0x07e3
        L_0x0867:
            if (r29 == 0) goto L_0x08a8
            r2 = 875761124(0x34330de4, float:1.6675727E-7)
            r0.ExS(r2)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            r2 = 2131238108(0x7f081cdc, float:1.8092485E38)
            if (r69 == 0) goto L_0x0879
            r2 = 2131238099(0x7f081cd3, float:1.8092467E38)
        L_0x0879:
            X.2DO r6 = X.C287975bA.A00(r0, r2, r3)
            X.4bM r5 = X.C52601GZa.A00
            X.5RM r2 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.C286615Xc.A01(r5, r2)
            X.5RW r2 = (X.AnonymousClass5RW) r2
            long r10 = r2.A00
            r55 = 1
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r0)
            long r8 = r2.A0n
            r7 = 1098907648(0x41800000, float:16.0)
            X.Iwo r5 = new X.Iwo
            r5.<init>(r6, r7, r8, r10)
            androidx.compose.ui.draw.DrawWithCacheElement r2 = new androidx.compose.ui.draw.DrawWithCacheElement
            r2.<init>(r5)
            androidx.compose.ui.Modifier r2 = r13.Ezh(r2)
            X.C286565Wx.A0L(r4, r3)
            goto L_0x0404
        L_0x08a8:
            r55 = 1
            r2 = -803017779(0xffffffffd022ebcd, float:-1.09334497E10)
            r0.ExS(r2)
            X.C286565Wx.A0L(r4, r3)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r13 = r2
            goto L_0x0404
        L_0x08b8:
            r8 = 0
            goto L_0x01e8
        L_0x08bb:
            r28 = 0
            goto L_0x0191
        L_0x08bf:
            r2 = r67 & 6
            if (r2 != 0) goto L_0x08d1
            r2 = r16
            boolean r4 = r0.AGu(r2)
            r2 = 2
            if (r4 == 0) goto L_0x08cd
            r2 = 4
        L_0x08cd:
            r5 = r67 | r2
            goto L_0x00c1
        L_0x08d1:
            r5 = r48
            goto L_0x00c1
        L_0x08d5:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0034
            r2 = r21
            boolean r3 = r0.AGu(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x08e5
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x08e5:
            r1 = r1 | r2
            goto L_0x0034
        L_0x08e8:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x002c
            r2 = r64
            boolean r3 = r0.AGu(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x08f8
            r2 = 2048(0x800, float:2.87E-42)
        L_0x08f8:
            r1 = r1 | r2
            goto L_0x002c
        L_0x08fb:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0024
            r2 = r63
            boolean r3 = r0.AGu(r2)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x090b
            r2 = 256(0x100, float:3.59E-43)
        L_0x090b:
            r1 = r1 | r2
            goto L_0x0024
        L_0x090e:
            r2 = r66 & 48
            if (r2 != 0) goto L_0x001e
            r2 = r20
            boolean r3 = r0.AGu(r2)
            r2 = 16
            if (r3 == 0) goto L_0x091e
            r2 = 32
        L_0x091e:
            r1 = r1 | r2
            goto L_0x001e
        L_0x0921:
            r1 = r66 & 6
            if (r1 != 0) goto L_0x0933
            r1 = r19
            boolean r2 = r0.AGw(r1)
            r1 = 2
            if (r2 == 0) goto L_0x092f
            r1 = 4
        L_0x092f:
            r1 = r1 | r66
            goto L_0x0016
        L_0x0933:
            r1 = r14
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CY.A03(X.5Wy, androidx.compose.ui.Modifier, X.6Ba, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, X.0sa, X.0sa, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
