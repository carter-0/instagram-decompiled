package com.instagram.pendingmedia.service.igapi;

import X.1Eo;
import X.AnonymousClass0iw;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.C64569LeB;
import X.C66166MGd;
import X.JTP;
import X.LP8;
import X.MU6;

public final class ConfigureMediaStep implements MU6 {
    public final AnonymousClass0iw A00 = new C64569LeB();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.LP8 r10, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 11
            boolean r0 = X.C66147MDz.A02(r3, r12)
            if (r0 == 0) goto L_0x0029
            r6 = r12
            X.MDz r6 = (X.C66147MDz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A04
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r5) goto L_0x00ee
            if (r0 == r8) goto L_0x00ee
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0029:
            X.MDz r6 = new X.MDz
            r6.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x002f:
            X.0eS.A00(r2)
            X.3Q2 r4 = r10.A0D
            boolean r0 = r4.A4x
            if (r0 == 0) goto L_0x0040
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            r4.A0b(r0)
        L_0x003d:
            X.KVm r7 = X.C62013KVm.A00
            return r7
        L_0x0040:
            com.instagram.common.session.UserSession r9 = r10.A0C
            X.1yr r1 = X.1yr.A00(r9)
            java.lang.String r0 = r4.A2Z
            r1.A04(r0)
            r2 = 0
            X.3QD r1 = r4.A1f
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURING_MULTIPLE_TARGETS
            if (r1 != r0) goto L_0x00ad
            boolean r0 = r4.A0s()
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r4.A5Q
            if (r0 == 0) goto L_0x00ad
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            r4.A0b(r0)
            X.37k r1 = r10.A0E
            r0 = 0
            r1.EFe(r2, r4, r0)
        L_0x0067:
            X.3QD r1 = r4.A1f
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 != r0) goto L_0x00fd
            X.LFD r5 = new X.LFD
            r5.<init>(r10)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.3Q2 r2 = r10.A0D
            java.lang.Class<X.1us> r1 = X.1us.class
            r0 = 0
            java.util.ArrayList r0 = r2.A0K(r0, r1)
            r3.addAll(r0)
            java.util.Map r1 = r10.A0L
            com.instagram.pendingmedia.model.constants.ShareType r0 = r2.A0E()
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0097
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0097
            r3.add(r1)
        L_0x0097:
            java.util.Iterator r2 = r3.iterator()
        L_0x009b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r2.next()
            X.1ut r1 = (X.1ut) r1
            com.instagram.common.session.UserSession r0 = r10.A0C
            r1.E3L(r0, r4, r5)
            goto L_0x009b
        L_0x00ad:
            com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper r3 = com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper.A00
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x00e6
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x00c5
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r4.A15(r0)
            if (r0 != 0) goto L_0x00cd
        L_0x00c5:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            if (r1 != r0) goto L_0x00e6
        L_0x00cd:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322117515552726(0x810ac6000127d6, double:3.0335916020387856E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00e6
            X.0iw r0 = r11.A00
            X.C66147MDz.A00(r11, r10, r4, r6, r5)
            java.lang.Object r2 = r3.A01(r0, r10, r6)
        L_0x00e3:
            if (r2 != r7) goto L_0x00f9
            return r7
        L_0x00e6:
            X.C66147MDz.A00(r11, r10, r4, r6, r8)
            java.lang.Object r2 = A01(r10, r11, r6)
            goto L_0x00e3
        L_0x00ee:
            java.lang.Object r4 = r6.A03
            X.3Q2 r4 = (X.AnonymousClass3Q2) r4
            java.lang.Object r10 = r6.A02
            X.LP8 r10 = (X.LP8) r10
            X.0eS.A00(r2)
        L_0x00f9:
            X.55U r2 = (X.AnonymousClass55U) r2
            goto L_0x0067
        L_0x00fd:
            if (r2 != 0) goto L_0x0108
            X.55S r2 = X.AnonymousClass55S.A0D
            r1 = 0
            java.lang.String r0 = "Configure failed"
            X.55U r2 = X.AnonymousClass55V.A01(r2, r0, r1, r1)
        L_0x0108:
            X.KVk r7 = new X.KVk
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.igapi.ConfigureMediaStep.A00(X.LP8, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.LP8 r6, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 19
            boolean r0 = X.C66138MDq.A02(r3, r8)
            if (r0 == 0) goto L_0x005e
            r5 = r8
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0068
            java.lang.Object r6 = r5.A01
            X.LP8 r6 = (X.LP8) r6
            X.0eS.A00(r4)
        L_0x0028:
            X.3Q2 r1 = r6.A0D
            boolean r0 = r1.A6C
            if (r0 != 0) goto L_0x0067
            boolean r0 = r1.A0u()
            if (r0 == 0) goto L_0x0064
            java.util.Iterator r1 = X.JTQ.A0g(r1)
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0067
            r1.next()
            X.C64064LLi.A00(r6)
            goto L_0x0038
        L_0x0045:
            X.0eS.A00(r4)
            X.3Q2 r0 = r6.A0D
            X.3QD r1 = r0.A6J
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 != r0) goto L_0x005b
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = A00(r6, r7, r5)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x005b:
            X.KVl r4 = X.C62012KVl.A00
            goto L_0x0028
        L_0x005e:
            X.MDq r5 = new X.MDq
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0064:
            X.C64064LLi.A00(r6)
        L_0x0067:
            return r4
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.igapi.ConfigureMediaStep.A02(X.LP8, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep, X.4D7):java.lang.Object");
    }

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r6) {
        return 1Eo.A00(r6, JTP.A0V(AnonymousClass12T.A00, 319), new C66166MGd(this, lp8, (AnonymousClass4D7) null, 1));
    }

    public final String getName() {
        return "ConfigureMedia";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: X.55U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: X.55U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: X.37k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: X.37l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: com.instagram.pendingmedia.model.constants.ShareType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: X.37l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: com.instagram.pendingmedia.model.constants.ShareType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: X.55U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: X.55U} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDb, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v12, types: [X.K1X, X.1XR, X.1XQ, X.1XT, X.1XP] */
    /* JADX WARNING: type inference failed for: r7v29, types: [java.lang.Object, X.L9w] */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:141|(18:143|(3:145|146|(16:150|(4:153|154|155|(8:157|158|159|211|212|(0)|256|257))|161|162|163|164|165|(1:167)|168|(9:170|(1:174)|175|(1:177)|178|(1:180)|181|(1:183)|184)|185|211|212|(0)|256|257))|151|(0)|161|162|163|164|165|(0)|168|(0)|185|211|212|(0)|256|257)|187|188|189|190|(1:192)(1:193)|194|211|212|(0)|256|257) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:143|(3:145|146|(16:150|(4:153|154|155|(8:157|158|159|211|212|(0)|256|257))|161|162|163|164|165|(1:167)|168|(9:170|(1:174)|175|(1:177)|178|(1:180)|181|(1:183)|184)|185|211|212|(0)|256|257))|151|(0)|161|162|163|164|165|(0)|168|(0)|185|211|212|(0)|256|257) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:108|(2:109|110)|111|112|(2:114|266)|115|116|120|121|(0)|138|139|(0)(0)|204|238|(0)(0)|241|(0)|256|257) */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:17|(2:18|19)|85|(1:87)(5:89|90|91|92|(5:94|221|222|223|224))|(2:95|96)(1:99)|100|101|102|103|104|105|106|(21:108|109|110|111|112|(2:114|266)|115|116|120|121|(0)|138|139|(0)(0)|204|238|(0)(0)|241|(0)|256|257)(15:118|119|120|121|(0)|138|139|(0)(0)|204|238|(0)(0)|241|(0)|256|257)|217|229|238|(0)(0)|241|(0)|256|257) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:205|206|207|208|209|210) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:75|76|77|78|(1:80)|271) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:197|198|199|(3:201|202|203)(6:205|206|207|208|209|210)|211|212|(2:243|(4:249|(1:251)|253|(1:255)))|256|257) */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0622, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0623, code lost:
        r28 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0668, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x066a, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0672, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0674, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0676, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0710, code lost:
        if ("feed".equals(r1.A2b) == false) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03a5, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03a6, code lost:
        r2 = r9;
        r4 = null;
        r28 = 0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03ec A[Catch:{ all -> 0x0672 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x042a A[SYNTHETIC, Splitter:B:118:0x042a] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0448 A[Catch:{ all -> 0x066e }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04e5 A[SYNTHETIC, Splitter:B:153:0x04e5] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0524 A[Catch:{ all -> 0x0641 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0549 A[Catch:{ all -> 0x0641 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0744  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03b9 A[SYNTHETIC, Splitter:B:89:0x03b9] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03c9 A[SYNTHETIC, Splitter:B:95:0x03c9] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03d2  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.LP8 r35, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r36, X.AnonymousClass4D7 r37) {
        /*
            r9 = r35
            r11 = r36
            java.lang.String r21 = "Configure handler cannot be null"
            r4 = r37
            boolean r0 = r4 instanceof X.MDb
            if (r0 == 0) goto L_0x0077
            r0 = r4
            X.MDb r0 = (X.MDb) r0
            int r3 = r0.A03
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0077
            int r3 = r3 - r2
            r0.A03 = r3
        L_0x001a:
            java.lang.Object r4 = r0.A0F
            X.1Hj r18 = X.1Hj.A02
            int r2 = r0.A03
            r19 = 2
            r20 = 1
            if (r2 == 0) goto L_0x00c9
            r1 = r20
            if (r2 == r1) goto L_0x0087
            r1 = r19
            if (r2 != r1) goto L_0x0082
            int r1 = r0.A02
            r26 = r1
            int r1 = r0.A01
            r25 = r1
            int r1 = r0.A00
            r28 = r1
            java.lang.Object r1 = r0.A06
            r27 = r1
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r27 = r1
            java.lang.Object r5 = r0.A0E
            X.1ut r5 = (X.1ut) r5
            java.lang.Object r7 = r0.A0D
            java.lang.Object r1 = r0.A0C
            r17 = r1
            r1 = r17
            X.37l r1 = (X.C2373937l) r1
            r17 = r1
            java.lang.Object r1 = r0.A0B
            r16 = r1
            r1 = r16
            com.instagram.pendingmedia.model.constants.ShareType r1 = (com.instagram.pendingmedia.model.constants.ShareType) r1
            r16 = r1
            java.lang.Object r6 = r0.A0A
            X.1us r6 = (X.1us) r6
            java.lang.Object r3 = r0.A09
            X.LDX r3 = (X.LDX) r3
            java.lang.Object r8 = r0.A08
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r1 = r0.A07
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            java.lang.Object r2 = r0.A05
            X.LP8 r2 = (X.LP8) r2
            java.lang.Object r11 = r0.A04
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r11 = (com.instagram.pendingmedia.service.igapi.ConfigureMediaStep) r11
            goto L_0x007d
        L_0x0077:
            X.MDb r0 = new X.MDb
            r0.<init>(r11, r4)
            goto L_0x001a
        L_0x007d:
            X.0eS.A00(r4)     // Catch:{ all -> 0x069e }
            goto L_0x0424
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0087:
            int r1 = r0.A02
            r26 = r1
            int r1 = r0.A01
            r25 = r1
            int r1 = r0.A00
            r28 = r1
            java.lang.Object r7 = r0.A0D
            java.lang.Object r1 = r0.A0C
            r17 = r1
            r1 = r17
            X.37l r1 = (X.C2373937l) r1
            r17 = r1
            java.lang.Object r1 = r0.A0B
            r16 = r1
            r1 = r16
            com.instagram.pendingmedia.model.constants.ShareType r1 = (com.instagram.pendingmedia.model.constants.ShareType) r1
            r16 = r1
            java.lang.Object r6 = r0.A0A
            X.1us r6 = (X.1us) r6
            java.lang.Object r3 = r0.A09
            X.LDX r3 = (X.LDX) r3
            java.lang.Object r8 = r0.A08
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r1 = r0.A07
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            java.lang.Object r2 = r0.A05
            X.LP8 r2 = (X.LP8) r2
            java.lang.Object r11 = r0.A04
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r11 = (com.instagram.pendingmedia.service.igapi.ConfigureMediaStep) r11
            X.0eS.A00(r4)     // Catch:{ all -> 0x00c6 }
            goto L_0x03b1
        L_0x00c6:
            r10 = move-exception
            goto L_0x069f
        L_0x00c9:
            X.0eS.A00(r4)
            X.3Q2 r1 = r9.A0D
            com.instagram.common.session.UserSession r8 = r9.A0C
            X.LDX r3 = new X.LDX
            r3.<init>(r8, r1)
            java.lang.Class<X.1us> r13 = X.1us.class
            X.1us r6 = r1.A0B()
            if (r6 == 0) goto L_0x0750
            com.instagram.pendingmedia.model.constants.ShareType r16 = r6.BtR()
        L_0x00e1:
            X.37k r2 = r9.A0E
            r17 = r2
            boolean r2 = r1.A4w
            if (r2 == 0) goto L_0x014e
            if (r6 != 0) goto L_0x014e
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            java.util.EnumSet r2 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r2)
            X.Lc5 r0 = new X.Lc5
            r0.<init>(r2)
            java.util.ArrayList r0 = r1.A0K(r0, r13)
            int r0 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            java.util.EnumSet r2 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r2)
            X.Lc5 r0 = new X.Lc5
            r0.<init>(r2)
            java.util.ArrayList r0 = r1.A0K(r0, r13)
            int r0 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.A5Q
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            X.3QD r2 = r1.A1f
            X.3QD r0 = r1.A6J
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r5, r4, r2, r0}
            java.lang.String r0 = "total story targets: %d total direct targets: %d is done: %s server status: %s target status: %s"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            java.lang.String r0 = "multi_config_no_share_target"
            X.0wb.A03(r0, r1)
            java.lang.String r1 = "conf_abort"
            java.lang.String r0 = "pendingMedia.getAllowMultipleConfigures() && shareTarget=null"
            r3.A00(r1, r0)
            X.02m r4 = r3.A01
            int r2 = r3.A00
            r1 = 51052547(0x30b0003, float:4.084844E-37)
            r0 = 105(0x69, float:1.47E-43)
            r4.markerEnd(r1, r2, r0)
            r18 = 0
        L_0x014d:
            return r18
        L_0x014e:
            boolean r2 = r6 instanceof X.1vG
            r28 = r2
            if (r2 == 0) goto L_0x0174
            X.3QR r7 = r1.A1X
            monitor-enter(r7)
            java.lang.String r5 = "FINISH_ENDPOINT"
            java.util.HashMap r2 = r7.A00     // Catch:{ all -> 0x0754 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0754 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0754 }
            r4 = 1
            if (r2 == 0) goto L_0x016a
            int r2 = r2.intValue()     // Catch:{ all -> 0x0754 }
            int r4 = r2 + 1
        L_0x016a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0754 }
            java.util.HashMap r2 = r7.A00     // Catch:{ all -> 0x0754 }
            r2.put(r5, r4)     // Catch:{ all -> 0x0754 }
            monitor-exit(r7)
        L_0x0174:
            r12 = r17
            X.37j r12 = (X.C2373737j) r12
            X.3QF r2 = r1.A1T
            java.util.List r2 = r2.A03()
            java.util.Iterator r23 = r2.iterator()
        L_0x0182:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x01ee
            int r22 = X.AnonymousClass7TG.A0F(r23)
            X.0wc r2 = r12.A01
            java.lang.String r10 = "ig_media_publish_start"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r2, r10)
            boolean r2 = r7.isSampled()
            r5 = 0
            if (r2 == 0) goto L_0x01e5
            android.content.Context r2 = r12.A00
            com.instagram.common.session.UserSession r4 = r12.A02
            X.JbW r14 = new X.JbW
            r14.<init>(r2, r4, r1)
            X.3Q2 r2 = r14.A02
            X.JTS.A1B(r7, r2)
            java.lang.String r15 = java.lang.String.valueOf(r22)
            java.lang.String r2 = "publish_id"
            r7.AAJ(r2, r15)
            X.C59908JbX.A06(r7, r14)
            java.lang.String r15 = X.C59906JbV.A01(r4, r1)
            java.lang.String r2 = "ingest_surface"
            r7.AAJ(r2, r15)
            r2 = r22
            java.lang.String r15 = X.C59906JbV.A02(r4, r1, r2)
            java.lang.String r2 = "target_surface"
            X.C59908JbX.A05(r7, r14, r2, r15)
            X.C59908JbX.A03(r7, r14)
            boolean r2 = r1.A5D
            if (r2 == 0) goto L_0x01e9
            r2 = r5
        L_0x01d1:
            X.JTS.A1C(r7, r2)
            r2 = 0
            java.util.ArrayList r4 = X.C59906JbV.A06(r4, r1, r2)
            r2 = 5216(0x1460, float:7.309E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r7.AAe(r2, r4)
            r7.Cgf()
        L_0x01e5:
            r12.Cjm(r1, r10, r5)
            goto L_0x0182
        L_0x01e9:
            java.util.Map r2 = r14.A07()
            goto L_0x01d1
        L_0x01ee:
            X.0wc r4 = r12.A01
            X.3QD r2 = r1.A6J
            r29 = r2
            r10 = 0
            r2 = r20
            X.0qQ.A0B(r4, r2)
            r5 = r19
            r2 = r29
            X.0qQ.A0B(r2, r5)
            X.L9w r7 = new X.L9w
            r7.<init>()
            java.lang.String r27 = "original_width"
            java.lang.String r26 = "original_height"
            java.lang.String r25 = "source_type"
            r2 = 279(0x117, float:3.91E-43)
            java.lang.String r24 = X.Pxd.A00(r2)
            r2 = 731(0x2db, float:1.024E-42)
            java.lang.String r23 = X.AnonymousClass000.A00(r2)
            r2 = 869(0x365, float:1.218E-42)
            java.lang.String r22 = X.C273654mx.A00(r2)
            java.lang.String r5 = "configure_media_attempt"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r5)
            r2 = 136(0x88, float:1.9E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r4, r2)
            boolean r2 = X.DbT.A1Y(r4)
            if (r2 == 0) goto L_0x032c
            java.lang.String r14 = "0"
            java.lang.String r15 = ""
            java.lang.String r2 = "attempt_source"
            r4.A0R(r2, r15)
            java.lang.String r2 = "media_type"
            r4.A0R(r2, r14)
            java.lang.String r2 = "share_type"
            r4.A0R(r2, r14)
            java.lang.String r2 = "upload_id"
            r4.A0R(r2, r14)
            java.lang.String r2 = "waterfall_id"
            r4.A0R(r2, r14)
            java.lang.String r2 = "connection"
            r4.A0R(r2, r10)
            java.lang.String r2 = "from"
            r4.A0R(r2, r10)
            java.lang.String r2 = "media_id"
            r4.A0R(r2, r10)
            r2 = 1823(0x71f, float:2.555E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0P(r2, r10)
            java.lang.String r14 = r29.toString()
            java.lang.String r2 = "target"
            r4.A0R(r2, r14)
            r2 = r26
            r4.A0Q(r2, r10)
            r2 = r27
            r4.A0Q(r2, r10)
            r2 = r25
            r4.A0R(r2, r10)
            java.lang.Long r14 = r7.A04
            r2 = 805(0x325, float:1.128E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r14)
            java.lang.String r2 = "publish_id"
            r4.A0Q(r2, r10)
            java.lang.String r2 = "sub_share_id"
            r4.A0Q(r2, r10)
            r2 = 37
            java.lang.String r2 = X.Pxd.A00(r2)
            r4.A0Q(r2, r10)
            java.lang.String r2 = "dimension"
            r4.A0Q(r2, r10)
            java.lang.String r2 = "dimension_height"
            r4.A0Q(r2, r10)
            r14 = r10
            r2 = r22
            r4.A0Q(r2, r10)
            java.lang.String r2 = "video_duration"
            r4.A0Q(r2, r10)
            r2 = r23
            r4.A0Q(r2, r10)
            r2 = r24
            r4.A0Q(r2, r10)
            r2 = 375(0x177, float:5.25E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r10)
            java.lang.Integer r2 = r7.A00
            if (r2 == 0) goto L_0x02cb
            java.lang.Long r14 = X.C51969G9p.A0r(r2)
        L_0x02cb:
            r2 = 4508(0x119c, float:6.317E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r14)
            java.lang.String r2 = r7.A05
            java.lang.Long r14 = X.C51972G9s.A0j(r2)
            r2 = 645(0x285, float:9.04E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r14)
            java.lang.Integer r2 = r7.A03
            if (r2 == 0) goto L_0x074d
            java.lang.Long r14 = X.C51969G9p.A0r(r2)
        L_0x02eb:
            r2 = 5025(0x13a1, float:7.042E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r14)
            java.lang.Integer r2 = r7.A01
            if (r2 == 0) goto L_0x074a
            java.lang.Long r14 = X.C51969G9p.A0r(r2)
        L_0x02fc:
            r2 = 4569(0x11d9, float:6.403E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r14)
            java.lang.Integer r2 = r7.A02
            if (r2 == 0) goto L_0x0747
            java.lang.Long r7 = X.C51969G9p.A0r(r2)
        L_0x030d:
            r2 = 1565(0x61d, float:2.193E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r7)
            r2 = 1841(0x731, float:2.58E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0Q(r2, r10)
            java.lang.String r2 = "is_carousel_child"
            r4.A0Q(r2, r10)
            java.lang.String r2 = "target_bitrate_bps"
            r4.A0Q(r2, r10)
            r4.Cgf()
        L_0x032c:
            r12.Cjm(r1, r5, r10)
            if (r28 == 0) goto L_0x035a
            java.util.ArrayList r2 = r1.A0K(r10, r13)
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            boolean r2 = X.0qQ.A0K(r2, r6)
            if (r2 != 0) goto L_0x035a
            java.lang.String r2 = "conf_hand_conf_success"
            r3.A00(r2, r10)
            X.LQw r22 = X.C64155LQw.A00
            X.0iw r2 = r11.A00
            r23 = r10
            r24 = r2
            r25 = r6
            r26 = r6
            r27 = r9
            r28 = r10
            r29 = r4
            r22.A01(r23, r24, r25, r26, r27, r28, r29)
        L_0x035a:
            r25 = 0
            r7 = 0
            r26 = 0
        L_0x035f:
            r2 = r26
            long r4 = (long) r2
            r12 = 1800000(0x1b7740, double:8.89318E-318)
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x068b
            if (r26 < 0) goto L_0x068b
            if (r26 <= 0) goto L_0x03ac
            r0.A04 = r11     // Catch:{ all -> 0x03a3 }
            r0.A05 = r9     // Catch:{ all -> 0x03a3 }
            r0.A07 = r1     // Catch:{ all -> 0x03a3 }
            r0.A08 = r8     // Catch:{ all -> 0x03a3 }
            r0.A09 = r3     // Catch:{ all -> 0x03a3 }
            r0.A0A = r6     // Catch:{ all -> 0x03a3 }
            r2 = r16
            r0.A0B = r2     // Catch:{ all -> 0x03a3 }
            r2 = r17
            r0.A0C = r2     // Catch:{ all -> 0x03a3 }
            r0.A0D = r7     // Catch:{ all -> 0x03a3 }
            r2 = 0
            r0.A0E = r2     // Catch:{ all -> 0x03a5 }
            r0.A06 = r2     // Catch:{ all -> 0x03a5 }
            r2 = 0
            r0.A00 = r2     // Catch:{ all -> 0x03a5 }
            r2 = r25
            r0.A01 = r2     // Catch:{ all -> 0x03a5 }
            r2 = r26
            r0.A02 = r2     // Catch:{ all -> 0x03a5 }
            r2 = r20
            r0.A03 = r2     // Catch:{ all -> 0x03a5 }
            java.lang.Object r4 = X.C241603Pv.A01(r0, r4)     // Catch:{ all -> 0x03a5 }
            r2 = r18
            if (r4 == r2) goto L_0x014d
            r28 = 0
            r2 = r9
            goto L_0x03b1
        L_0x03a3:
            r10 = move-exception
            goto L_0x03a6
        L_0x03a5:
            r10 = move-exception
        L_0x03a6:
            r2 = r9
            r4 = 0
            r28 = 0
            goto L_0x06a0
        L_0x03ac:
            r2 = r9
            r26 = 0
            r28 = 0
        L_0x03b1:
            java.lang.String r9 = "ConfigureMediaStep"
            if (r6 == 0) goto L_0x03b9
            r5 = r6
        L_0x03b6:
            if (r16 != 0) goto L_0x03d2
            goto L_0x03c9
        L_0x03b9:
            java.util.Map r5 = r2.A0L     // Catch:{ all -> 0x0686 }
            com.instagram.pendingmedia.model.constants.ShareType r4 = r1.A0E()     // Catch:{ all -> 0x0684 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0684 }
            X.1ut r5 = (X.1ut) r5     // Catch:{ all -> 0x0684 }
            if (r5 != 0) goto L_0x03b6
            goto L_0x0678
        L_0x03c9:
            com.instagram.pendingmedia.model.constants.ShareType r10 = r1.A0E()     // Catch:{ all -> 0x03ce }
            goto L_0x03d4
        L_0x03ce:
            r10 = move-exception
            r4 = 0
            goto L_0x06a0
        L_0x03d2:
            r10 = r16
        L_0x03d4:
            java.lang.String r27 = X.AnonymousClass7TG.A0j()     // Catch:{ all -> 0x0676 }
            r9 = 0
            r4 = r27
            X.1QX r12 = X.C63379Kw0.A00(r5, r10, r2, r4, r9)     // Catch:{ all -> 0x0674 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x0672 }
            r9 = 36318084542502767(0x81071b0014176f, double:3.0310411336425125E-306)
            boolean r4 = X.182.A06(r4, r8, r9)     // Catch:{ all -> 0x0672 }
            if (r4 == 0) goto L_0x042a
            com.instagram.pendingmedia.service.common.ParsingSyncHttpService r9 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A00     // Catch:{ all -> 0x0672 }
            r0.A04 = r11     // Catch:{ all -> 0x0672 }
            r0.A05 = r2     // Catch:{ all -> 0x0672 }
            r0.A07 = r1     // Catch:{ all -> 0x0672 }
            r0.A08 = r8     // Catch:{ all -> 0x0672 }
            r0.A09 = r3     // Catch:{ all -> 0x0688 }
            r0.A0A = r6     // Catch:{ all -> 0x0670 }
            r4 = r16
            r0.A0B = r4     // Catch:{ all -> 0x0670 }
            r4 = r17
            r0.A0C = r4     // Catch:{ all -> 0x0670 }
            r0.A0D = r7     // Catch:{ all -> 0x0670 }
            r0.A0E = r5     // Catch:{ all -> 0x0670 }
            r4 = r27
            r0.A06 = r4     // Catch:{ all -> 0x0670 }
            r4 = r28
            r0.A00 = r4     // Catch:{ all -> 0x0670 }
            r4 = r25
            r0.A01 = r4     // Catch:{ all -> 0x0670 }
            r4 = r26
            r0.A02 = r4     // Catch:{ all -> 0x0670 }
            r4 = r19
            r0.A03 = r4     // Catch:{ all -> 0x0670 }
            java.lang.Object r4 = r9.A02(r12, r8, r5, r0)     // Catch:{ all -> 0x0670 }
            r9 = r18
            if (r4 != r9) goto L_0x0424
            goto L_0x0757
        L_0x0424:
            X.L6w r4 = (X.C63790L6w) r4     // Catch:{ all -> 0x0427 }
            goto L_0x042e
        L_0x0427:
            r10 = move-exception
            goto L_0x069f
        L_0x042a:
            X.L6w r4 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A01(r12, r8, r5)     // Catch:{ all -> 0x0670 }
        L_0x042e:
            X.0iw r9 = r11.A00     // Catch:{ all -> 0x066e }
            r37 = r9
            r10 = r20
            r9 = r27
            boolean r36 = X.DbW.A1S(r10, r9, r1)     // Catch:{ all -> 0x066e }
            r10 = r19
            r9 = r37
            int r23 = X.C51970G9q.A08(r10, r8, r9)     // Catch:{ all -> 0x066e }
            boolean r9 = X.AnonymousClass8PU.A0C(r1, r6)     // Catch:{ all -> 0x066e }
            if (r9 == 0) goto L_0x04b4
            com.instagram.pendingmedia.model.constants.ShareType r10 = r1.A0E()     // Catch:{ all -> 0x066e }
            java.lang.String r12 = r1.A3z     // Catch:{ all -> 0x066e }
            java.lang.String r22 = X.C2373637i.A01(r1)     // Catch:{ all -> 0x066e }
            java.lang.String r15 = r1.A0I()     // Catch:{ all -> 0x066e }
            r9 = r20
            X.0qQ.A0B(r10, r9)     // Catch:{ all -> 0x066e }
            if (r12 == 0) goto L_0x0484
            com.instagram.user.model.User r9 = X.AnonymousClass7TF.A0Q(r8)     // Catch:{ all -> 0x066e }
            X.16V r14 = r9.A0J()     // Catch:{ all -> 0x066e }
            com.instagram.pendingmedia.model.constants.ShareType r9 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE     // Catch:{ all -> 0x066e }
            if (r10 == r9) goto L_0x0475
            com.instagram.pendingmedia.model.constants.ShareType r9 = com.instagram.pendingmedia.model.constants.ShareType.IGTV     // Catch:{ all -> 0x066e }
            if (r10 != r9) goto L_0x0484
            java.lang.String r9 = "video_feed_composer"
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x066e }
            if (r9 == 0) goto L_0x0484
        L_0x0475:
            X.0Aj r13 = X.C64189LSw.A00(r8)     // Catch:{ all -> 0x066e }
            java.lang.String r10 = "request"
            java.lang.String r12 = X.C64189LSw.A01(r13, r14, r10, r12)     // Catch:{ all -> 0x066e }
            r10 = r22
            X.C64189LSw.A02(r13, r12, r10, r15)     // Catch:{ all -> 0x066e }
        L_0x0484:
            java.lang.String r9 = r1.A3z     // Catch:{ all -> 0x066e }
            java.lang.String r32 = X.C2373637i.A01(r1)     // Catch:{ all -> 0x066e }
            java.lang.String r33 = r1.A0I()     // Catch:{ all -> 0x066e }
            r34 = 0
            java.lang.String r30 = "request"
            r29 = r8
            r31 = r9
            X.C63394KwF.A00(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x066e }
            X.1Xj r9 = r1.A1C     // Catch:{ all -> 0x066e }
            if (r9 == 0) goto L_0x04a3
            java.lang.String r32 = r9.A30()     // Catch:{ all -> 0x066e }
            if (r32 != 0) goto L_0x04a5
        L_0x04a3:
            java.lang.String r32 = ""
        L_0x04a5:
            X.1iA r9 = r1.A1G     // Catch:{ all -> 0x066e }
            int r9 = r9.A00     // Catch:{ all -> 0x066e }
            java.lang.String r33 = "share_sheet"
            r30 = r37
            r31 = r27
            r34 = r9
            X.LT0.A02(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x066e }
        L_0x04b4:
            X.LQw r29 = X.C64155LQw.A00     // Catch:{ all -> 0x066e }
            X.0eP r9 = X.C64155LQw.A00(r4)     // Catch:{ all -> 0x066e }
            java.lang.Object r12 = r9.A00     // Catch:{ all -> 0x066e }
            X.2ZL r12 = (X.2ZL) r12     // Catch:{ all -> 0x066e }
            java.lang.Object r9 = r9.A01     // Catch:{ all -> 0x066e }
            X.K1X r9 = (X.K1X) r9     // Catch:{ all -> 0x066e }
            int r13 = r9.mStatusCode     // Catch:{ all -> 0x066e }
            r10 = 200(0xc8, float:2.8E-43)
            java.lang.String r15 = "loop_http_re_upload_"
            if (r13 == r10) goto L_0x0626
            r10 = 202(0xca, float:2.83E-43)
            if (r13 == r10) goto L_0x060b
            r14 = 1
            r7 = 400(0x190, float:5.6E-43)
            if (r13 != r7) goto L_0x04e2
            java.lang.String r7 = r9.getErrorMessage()     // Catch:{ all -> 0x0608 }
            if (r7 == 0) goto L_0x04e2
            java.lang.Boolean r10 = r9.A01     // Catch:{ all -> 0x0608 }
            boolean r7 = X.AnonymousClass7TF.A1Y(r10, r14)     // Catch:{ all -> 0x0608 }
            if (r7 == 0) goto L_0x04e2
            goto L_0x04e3
        L_0x04e2:
            r14 = 0
        L_0x04e3:
            if (r14 == 0) goto L_0x0504
            X.3QQ r7 = r1.A1d     // Catch:{ all -> 0x0501 }
            int r10 = r7.A00     // Catch:{ all -> 0x0501 }
            r7 = 10
            boolean r7 = X.AnonymousClass7TF.A1T(r10, r7)
            if (r7 == 0) goto L_0x0504
            r5 = r25
            java.lang.String r7 = X.002.A0O(r15, r5)     // Catch:{ all -> 0x0501 }
            r5 = 0
            r3.A00(r7, r5)     // Catch:{ all -> 0x0501 }
            X.55U r7 = X.C63381Kw2.A00(r4, r2)     // Catch:{ all -> 0x0501 }
            goto L_0x0663
        L_0x0501:
            r10 = move-exception
            goto L_0x06a0
        L_0x0504:
            java.io.IOException r7 = r4.A02     // Catch:{ all -> 0x0608 }
            r36 = r7
            r7 = r20
            X.AnonymousClass7TF.A1C(r2, r7, r5)     // Catch:{ all -> 0x0641 }
            r7 = r23
            X.0qQ.A0B(r12, r7)     // Catch:{ all -> 0x0641 }
            X.3Q2 r10 = r2.A0D     // Catch:{ all -> 0x0641 }
            java.lang.String r24 = "Failed on configure"
            r7 = r24
            X.55U r7 = r2.A01(r9, r12, r7)     // Catch:{ all -> 0x0641 }
            com.instagram.common.session.UserSession r12 = r2.A0C     // Catch:{ all -> 0x0641 }
            r35 = r12
            boolean r12 = r10.A5e     // Catch:{ all -> 0x0641 }
            if (r12 == 0) goto L_0x053e
            X.1Ng r12 = X.AnonymousClass1Nd.A00(r35)     // Catch:{ all -> 0x0641 }
            r30 = 0
            java.lang.String r32 = r9.getErrorMessage()     // Catch:{ all -> 0x0641 }
            X.INp r13 = new X.INp     // Catch:{ all -> 0x0641 }
            r29 = r13
            r31 = r30
            r33 = r30
            r34 = r20
            r29.<init>(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0641 }
            r12.A00(r13)     // Catch:{ all -> 0x0641 }
        L_0x053e:
            r12 = r35
            r5.DCv(r9, r12, r10)     // Catch:{ all -> 0x0641 }
            boolean r5 = X.AnonymousClass8PU.A0C(r10, r6)     // Catch:{ all -> 0x0641 }
            if (r5 == 0) goto L_0x05d6
            com.instagram.pendingmedia.model.constants.ShareType r12 = r10.A0E()     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = r10.A3z     // Catch:{ all -> 0x0641 }
            r13 = r5
            java.lang.String r5 = X.C2373637i.A01(r10)     // Catch:{ all -> 0x0641 }
            java.lang.String r15 = r10.A0I()     // Catch:{ all -> 0x0641 }
            r14 = r12
            r12 = r35
            X.C64189LSw.A03(r12, r14, r13, r5, r15)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = r10.A3z     // Catch:{ all -> 0x0641 }
            java.lang.String r32 = X.C2373637i.A01(r10)     // Catch:{ all -> 0x0641 }
            java.lang.String r33 = r10.A0I()     // Catch:{ all -> 0x0641 }
            r34 = 0
            java.lang.String r30 = "failure"
            r31 = r5
            r29 = r12
            X.C63394KwF.A00(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0641 }
            X.1Xj r5 = r10.A1C     // Catch:{ all -> 0x0641 }
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x057f
            java.lang.String r33 = r5.A30()     // Catch:{ all -> 0x0641 }
            if (r33 != 0) goto L_0x0581
        L_0x057f:
            r33 = r12
        L_0x0581:
            X.1iA r5 = r10.A1G     // Catch:{ all -> 0x0641 }
            int r5 = r5.A00     // Catch:{ all -> 0x0641 }
            java.lang.String r23 = r9.getErrorMessage()     // Catch:{ all -> 0x0641 }
            if (r23 != 0) goto L_0x058d
            r23 = r12
        L_0x058d:
            java.lang.String r22 = r9.getErrorSource()     // Catch:{ all -> 0x0641 }
            if (r22 != 0) goto L_0x0595
            r22 = r12
        L_0x0595:
            java.lang.String r15 = r9.getErrorBody()     // Catch:{ all -> 0x0641 }
            if (r15 != 0) goto L_0x059c
            r15 = r12
        L_0x059c:
            java.lang.String r14 = "share_sheet"
            java.lang.Integer r31 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0641 }
            r29 = r37
            r30 = r35
            r32 = r27
            r34 = r14
            X.0xI r13 = X.LT0.A00(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "fb_ig_client_failure_"
            r12 = r5
            java.lang.String r14 = X.002.A0R(r12, r14)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "event"
            r12 = r5
            r13.A0C(r12, r14)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "exception_message"
            r12 = r5
            r5 = r23
            r13.A0C(r12, r5)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "exception_class"
            r12 = r5
            r5 = r22
            r13.A0C(r12, r5)     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "exception_stack"
            r12 = r5
            r13.A0C(r12, r15)     // Catch:{ all -> 0x0641 }
            r5 = r35
            X.DbU.A1R(r13, r5)     // Catch:{ all -> 0x0641 }
        L_0x05d6:
            int r5 = r9.getStatusCode()     // Catch:{ all -> 0x0641 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0641 }
            java.lang.String r13 = r9.getErrorMessage()     // Catch:{ all -> 0x0641 }
            java.lang.String r12 = r9.getErrorSource()     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = r9.getErrorBody()     // Catch:{ all -> 0x0641 }
            r15 = r24
            java.lang.Object[] r12 = new java.lang.Object[]{r15, r14, r13, r12, r5}     // Catch:{ all -> 0x0641 }
            java.lang.String r5 = "%s:%s Message:%s Source:%s Body:%s"
            java.lang.String r33 = X.0mp.A06(r5, r12)     // Catch:{ all -> 0x0641 }
            X.37k r12 = r2.A0E     // Catch:{ all -> 0x0641 }
            X.55S r5 = r7.A01     // Catch:{ all -> 0x0641 }
            r29 = r12
            r30 = r5
            r31 = r10
            r32 = r6
            r34 = r36
            r29.EFk(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0641 }
            goto L_0x0663
        L_0x0608:
            r10 = move-exception
            goto L_0x06a0
        L_0x060b:
            int r5 = r2.A02     // Catch:{ all -> 0x0641 }
            int r5 = r5 + 1
            r2.A02 = r5     // Catch:{ all -> 0x0641 }
            java.lang.Integer r5 = r9.A03     // Catch:{ all -> 0x0622 }
            if (r5 == 0) goto L_0x061a
            int r5 = r5.intValue()     // Catch:{ all -> 0x0622 }
            goto L_0x061b
        L_0x061a:
            r5 = 0
        L_0x061b:
            int r5 = r5 * 1000
            r26 = r5
            r28 = 1
            goto L_0x0663
        L_0x0622:
            r10 = move-exception
            r28 = 1
            goto L_0x06a0
        L_0x0626:
            java.lang.String r12 = "media_needs_reupload"
            java.lang.String r10 = r9.getErrorMessage()     // Catch:{ all -> 0x066c }
            boolean r10 = r12.equalsIgnoreCase(r10)     // Catch:{ all -> 0x066c }
            if (r10 == 0) goto L_0x0643
            r5 = r25
            java.lang.String r7 = X.002.A0O(r15, r5)     // Catch:{ all -> 0x0641 }
            r5 = 0
            r3.A00(r7, r5)     // Catch:{ all -> 0x0641 }
            X.55U r7 = X.C63381Kw2.A00(r4, r2)     // Catch:{ all -> 0x0641 }
            goto L_0x0663
        L_0x0641:
            r10 = move-exception
            goto L_0x06a0
        L_0x0643:
            java.lang.String r12 = "loop_http_hand_conf_success_"
            r10 = r25
            java.lang.String r12 = X.002.A0O(r12, r10)     // Catch:{ all -> 0x066c }
            r10 = 0
            r3.A00(r12, r10)     // Catch:{ all -> 0x066c }
            r10 = r17
            r10.EGC(r1)     // Catch:{ all -> 0x066c }
            r30 = r9
            r31 = r37
            r32 = r5
            r33 = r6
            r34 = r2
            r35 = r27
            r29.A01(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x066a }
        L_0x0663:
            X.C63378Kvz.A00(r9, r2)     // Catch:{ all -> 0x0668 }
            r9 = r2
            goto L_0x06e6
        L_0x0668:
            r10 = move-exception
            goto L_0x06a0
        L_0x066a:
            r10 = move-exception
            goto L_0x06a0
        L_0x066c:
            r10 = move-exception
            goto L_0x06a0
        L_0x066e:
            r10 = move-exception
            goto L_0x06a0
        L_0x0670:
            r10 = move-exception
            goto L_0x0689
        L_0x0672:
            r10 = move-exception
            goto L_0x0689
        L_0x0674:
            r10 = move-exception
            goto L_0x0689
        L_0x0676:
            r10 = move-exception
            goto L_0x0689
        L_0x0678:
            r4 = r21
            X.0KC.A0C(r9, r4)     // Catch:{ all -> 0x0682 }
            java.lang.RuntimeException r4 = X.AnonymousClass7TE.A15(r21)     // Catch:{ all -> 0x0682 }
            throw r4     // Catch:{ all -> 0x0682 }
        L_0x0682:
            r10 = move-exception
            goto L_0x0689
        L_0x0684:
            r10 = move-exception
            goto L_0x0689
        L_0x0686:
            r10 = move-exception
            goto L_0x0689
        L_0x0688:
            r10 = move-exception
        L_0x0689:
            r4 = 0
            goto L_0x06a0
        L_0x068b:
            java.lang.String r4 = "cool down too long(ms):"
            r2 = r26
            java.lang.String r2 = X.002.A0O(r4, r2)     // Catch:{ all -> 0x0698 }
            java.lang.RuntimeException r2 = X.AnonymousClass7TE.A15(r2)     // Catch:{ all -> 0x0698 }
            throw r2     // Catch:{ all -> 0x0698 }
        L_0x0698:
            r10 = move-exception
            r2 = r9
            r4 = 0
            r28 = 0
            goto L_0x06a0
        L_0x069e:
            r10 = move-exception
        L_0x069f:
            r4 = 0
        L_0x06a0:
            X.0iw r5 = r11.A00
            r7 = r20
            boolean r9 = X.DbW.A1S(r7, r5, r2)
            java.lang.String r7 = r5.getModuleName()
            java.lang.String r5 = "MediaUploader Failed configure step"
            X.0KC.A0F(r7, r5, r10)
            if (r4 == 0) goto L_0x0744
            X.2ZL r7 = r4.A00
        L_0x06b5:
            java.lang.String r13 = "Failed on configure"
            X.0qQ.A0B(r13, r9)
            X.55V r5 = X.AnonymousClass55U.A09
            X.1Cn r4 = r2.A0H
            X.55U r7 = r5.A02(r7, r4, r13, r10)
            r2.A04 = r7
            X.37k r12 = r2.A0E
            X.3Q2 r9 = r2.A0D
            java.lang.String r4 = r10.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r13, r4}
            java.lang.String r4 = "%s:%s"
            java.lang.String r33 = X.0mp.A06(r4, r5)
            r32 = 0
            X.55S r4 = r7.A01
            r34 = r10
            r29 = r12
            r30 = r4
            r31 = r9
            r29.EFk(r30, r31, r32, r33, r34)
            r9 = r2
        L_0x06e6:
            if (r28 == 0) goto L_0x0731
            int r25 = r25 + 1
            r5 = 5
            r4 = r25
            if (r4 < r5) goto L_0x035f
            boolean r4 = r1.A0x()
            if (r4 != 0) goto L_0x035f
            com.instagram.pendingmedia.model.constants.ShareType r5 = r1.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r4 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            boolean r4 = X.AnonymousClass7TF.A1W(r5, r4)
            if (r4 != 0) goto L_0x035f
            boolean r4 = r1.A0v()
            if (r4 == 0) goto L_0x0712
            java.lang.String r5 = "feed"
            java.lang.String r4 = r1.A2b
            boolean r5 = r5.equals(r4)
            r4 = 1
            if (r5 != 0) goto L_0x0713
        L_0x0712:
            r4 = 0
        L_0x0713:
            if (r4 != 0) goto L_0x035f
            java.lang.String r4 = "Failed on configure: Reply: Server needs too many 202 retries"
            java.lang.String r0 = "configure_fail"
            r3.A00(r0, r4)
            X.55S r0 = X.AnonymousClass55S.A0M
            X.55U r7 = r2.A02(r0, r4)
            r11 = 0
            java.lang.RuntimeException r13 = X.AnonymousClass7TE.A15(r4)
            X.55S r0 = r7.A01
            r8 = r17
            r9 = r0
            r10 = r1
            r12 = r4
            r8.EFk(r9, r10, r11, r12, r13)
        L_0x0731:
            java.lang.String r1 = "conf_end"
            r0 = 0
            r3.A00(r1, r0)
            X.02m r4 = r3.A01
            int r2 = r3.A00
            r1 = 51052547(0x30b0003, float:4.084844E-37)
            r0 = r19
            r4.markerEnd(r1, r2, r0)
            return r7
        L_0x0744:
            r7 = 0
            goto L_0x06b5
        L_0x0747:
            r7 = r10
            goto L_0x030d
        L_0x074a:
            r14 = r10
            goto L_0x02fc
        L_0x074d:
            r14 = r10
            goto L_0x02eb
        L_0x0750:
            r16 = 0
            goto L_0x00e1
        L_0x0754:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0757:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.igapi.ConfigureMediaStep.A01(X.LP8, com.instagram.pendingmedia.service.igapi.ConfigureMediaStep, X.4D7):java.lang.Object");
    }
}
