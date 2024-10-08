package X;

import com.facebook.msys.mci.TraceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class MeP {
    public final C71088Obj A00;
    public final C62320sa A01;
    public final 0sP A02;
    public final 0sL A03;
    public final PDK A04;
    public final PDJ A05;
    public final C62320sa A06;
    public final 0sP A07;

    public static final long A00(UserSession userSession, C66886MeO meO, MeP meP) {
        Integer num;
        0sP r0 = meP.A02;
        String str = meO.A0A;
        AnonymousClass69F r5 = (AnonymousClass69F) r0.invoke(str);
        if (C51967G9n.A03(meO.A07, 0) != 0) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0N;
        }
        long ExJ = r5.ExJ(num);
        String str2 = meO.A09;
        if (str2 != null) {
            r5.EdQ(str2, ExJ);
        }
        C254703su r02 = meO.A02;
        if (r02 != null) {
            r5.EdP(ExJ, TimeUnit.MICROSECONDS.toMillis(r02.C7c()));
        }
        r5.Ehq(str, ExJ);
        DirectThreadKey directThreadKey = meO.A04;
        String str3 = directThreadKey.A00;
        if (str3 != null) {
            r5.ESg(str3, ExJ);
        }
        AnonymousClass3U9 r3 = meO.A03;
        if (!(r3 == null && (r3 = 1bJ.A00(userSession).B33(directThreadKey)) == null)) {
            r5.EoZ(ExJ, r3.CUG());
            r5.EoY(AnonymousClass48O.A00(r3.C6a()), ExJ);
        }
        String str4 = meO.A01;
        if (str4 != null) {
            r5.Ef1(str4, ExJ);
        }
        String str5 = meO.A0B;
        if (str5 != null) {
            r5.Ejt(str5, ExJ);
        }
        r5.Clr(ExJ, "sync_received");
        return ExJ;
    }

    public static final void A01(UserSession userSession, C68149N2p n2p, MeP meP) {
        C66877MeD meD;
        C74409PuP puP;
        Long A002;
        String str;
        MeP meP2 = meP;
        0sP r6 = meP2.A02;
        C68149N2p n2p2 = n2p;
        String str2 = n2p2.A04;
        AnonymousClass69F r3 = (AnonymousClass69F) r6.invoke(str2);
        C68161N3b n3b = n2p2.A01;
        if (n3b != null) {
            0sL r0 = meP2.A03;
            0sL r20 = r0;
            UserSession userSession2 = userSession;
            String A022 = C70125Nxf.A00((AnonymousClass2Ep) r0.invoke(userSession2, n3b.A0A), n2p2).A02();
            if (A022 != null) {
                r3.EeF(A022, n2p2.A00);
            }
            C71088Obj obj = meP2.A00;
            OWE owe = C66880MeH.A03;
            Integer num = AnonymousClass05K.A0C;
            C66880MeH A012 = owe.A01(n2p2, num);
            AnonymousClass6BJ r14 = A012.A01;
            boolean z = r14.A0Q;
            if (z) {
                C66879MeF meF = A012.A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession2), C273654mx.A00(2841));
                if (A0e.isSampled()) {
                    A0e.AAJ("app_startup_type", C64031Cc.A09.toString());
                    if (14i.A08()) {
                        str = AppStateModule.APP_STATE_BACKGROUND;
                    } else {
                        str = "foreground";
                    }
                    A0e.AAJ("app_state", str);
                    String valueOf = String.valueOf(r14.A03);
                    A0e.AAJ("recipient_id", valueOf);
                    A0e.AAJ("push_identifier", r14.A0F);
                    A0e.AAJ("push_type", r14.A06.name());
                    C66580MXl.A1J(A0e, meF.A06);
                    A0e.A7p("is_vm_active", meF.A01);
                    C66581MXm.A1H(A0e, z);
                    A0e.A7p("is_bg_account", Boolean.valueOf(C282435Db.A02(valueOf)));
                    int intValue = r14.A07.intValue();
                    int i = 2;
                    if (intValue != 0) {
                        i = 4;
                        if (intValue != 1) {
                            i = AnonymousClass972.MUTABLE_FLAG_MASK;
                        }
                    }
                    if (i != Integer.MIN_VALUE) {
                        AnonymousClass7TE.A1W(A0e, "render_target", i);
                    } else {
                        A0e.AAJ("render_target", (String) null);
                    }
                    A0e.AAe("feature_tags", r14.A0N);
                    A0e.AAJ("reason", meF.A03);
                    A0e.A7p("is_bg_account", Boolean.valueOf(C282435Db.A02(valueOf)));
                    A0e.Cgf();
                }
                C71088Obj.A01(userSession2, obj, A012, (String) null, "ARMADILLO_NOTIFICATIONS_CLIENT_NOTIFICATION_CREATED");
            } else {
                C71088Obj.A00(userSession2, obj, A012, (String) null, 1);
            }
            OGB ogb = new OGB((C61410nE) meP2.A06.invoke(), meP2.A07, r20);
            Integer num2 = n3b.A04;
            if (num2 == num || num2 == AnonymousClass05K.A0N) {
                meD = new C66877MeD((C74410PuQ) null);
            } else {
                meD = C66876MeC.A00(userSession2, n2p2, JTO.A15(ogb.A00));
                if (meD.A00 == null) {
                    meD = C66876MeC.A00(userSession2, n3b, JTO.A15(ogb.A01));
                }
            }
            C74410PuQ puQ = meD.A00;
            if (puQ == null) {
                long j = n2p2.A00;
                ((AnonymousClass69F) r6.invoke(str2)).Clr(j, "rendering_policy_checked");
                0qQ.A07(C282375Cv.A00(userSession2));
                String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(14, n3b.A07);
                if (traceIdForAliasId != null) {
                    C282375Cv.A03(traceIdForAliasId, (List) null, 14, 237, 0);
                }
                if (AnonymousClass0oH.A01(C51966G9m.A0P(userSession2))) {
                    puP = meP2.A05;
                } else {
                    puP = meP2.A04;
                }
                C74409PuP puP2 = puP;
                ((AnonymousClass69F) r6.invoke(str2)).Clr(j, "rendering_surface_checked");
                C66880MeH A013 = owe.A01(n2p2, puP2.Bll());
                AnonymousClass6BJ r32 = A013.A01;
                if (r32.A0Q) {
                    String str3 = A013.A02.A05;
                    String A003 = C370448wU.A00(r32.A07);
                    AnonymousClass65V r1 = ((AnonymousClass65S) obj.A03.invoke(userSession2)).A01;
                    if (!(!r1.A01 || str3 == null || (A002 = AnonymousClass65V.A00(r1, str3)) == null)) {
                        r1.A00.flowAnnotate(A002.longValue(), "rendering_surface", A003);
                    }
                }
                puP2.D8t(userSession2, n2p2);
                return;
            }
            obj.A05(userSession2, owe.A01(n2p2, num), 002.A0R("rendering eligibility policy failure: ", puQ.AUf(userSession2)), 1024);
            return;
        }
        throw AnonymousClass7TE.A1K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r11.A2P != true) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        if (r1.equals(r0) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1.equals("❤️") != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012d, code lost:
        r0 = X.PDI.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.session.UserSession r31, X.C70572OBu r32, X.MeP r33, java.lang.Integer r34) {
        /*
            r8 = r32
            X.MeO r3 = r8.A01
            r5 = r31
            r4 = r33
            long r6 = A00(r5, r3, r4)
            X.0sL r1 = r4.A03
            X.0sa r0 = r4.A01
            X.Me6 r9 = new X.Me6
            r9.<init>(r0, r1)
            r12 = 0
            java.lang.String r0 = r3.A0A
            r33 = r0
            X.2Eq r0 = r3.A03
            r16 = r0
            com.instagram.model.direct.DirectThreadKey r0 = r3.A04
            java.lang.String r10 = r0.A00
            X.46u r2 = r8.A00
            java.lang.Long r1 = r2.A01
            long r22 = X.DbY.A04(r1)
            java.lang.String r21 = r2.A00()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r12)
            java.lang.Integer r1 = r3.A07
            r32 = r1
            X.Me7 r1 = new X.Me7
            r15 = r1
            r18 = r32
            r19 = r33
            r20 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.0eM r9 = r9.A00
            java.util.List r9 = X.JTO.A15(r9)
            X.MeD r1 = X.C66876MeC.A00(r5, r1, r9)
            X.PuQ r10 = r1.A00
            boolean r1 = X.DbW.A1a(r10)
            r9 = 0
            if (r1 == 0) goto L_0x0175
            X.0sP r10 = r4.A02
            r1 = r33
            java.lang.Object r10 = r10.invoke(r1)
            X.69F r10 = (X.AnonymousClass69F) r10
            java.lang.String r1 = "eligibility_policy_checked"
            r10.Clr(r6, r1)
            r10 = 1
            java.lang.String r15 = r3.A08     // Catch:{ Nnl -> 0x0145 }
            if (r15 == 0) goto L_0x0137
            int r1 = r15.length()     // Catch:{ Nnl -> 0x0145 }
            if (r1 == 0) goto L_0x0137
            java.lang.String r13 = r0.A00     // Catch:{ Nnl -> 0x0145 }
            if (r13 == 0) goto L_0x0130
            int r0 = r13.length()     // Catch:{ Nnl -> 0x0145 }
            if (r0 == 0) goto L_0x0130
            X.3su r11 = r3.A02     // Catch:{ Nnl -> 0x0145 }
            if (r11 == 0) goto L_0x0090
            java.lang.String r24 = r11.A0f()     // Catch:{ Nnl -> 0x0145 }
        L_0x0081:
            java.lang.Long r0 = r2.A01     // Catch:{ Nnl -> 0x0145 }
            if (r0 == 0) goto L_0x0093
            long r0 = r0.longValue()     // Catch:{ Nnl -> 0x0145 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Nnl -> 0x0145 }
            long r28 = r14.toMillis(r0)     // Catch:{ Nnl -> 0x0145 }
            goto L_0x0095
        L_0x0090:
            r24 = r9
            goto L_0x0081
        L_0x0093:
            r28 = 0
        L_0x0095:
            if (r11 == 0) goto L_0x009d
            boolean r0 = r11.A2P     // Catch:{ Nnl -> 0x0145 }
            r30 = 1
            if (r0 == r10) goto L_0x009f
        L_0x009d:
            r30 = 0
        L_0x009f:
            java.lang.Boolean r14 = r3.A05     // Catch:{ Nnl -> 0x0145 }
            if (r11 == 0) goto L_0x00bd
            java.lang.Long r11 = r11.A1L     // Catch:{ Nnl -> 0x0145 }
        L_0x00a5:
            java.lang.String r26 = r2.A00()     // Catch:{ Nnl -> 0x0145 }
            java.lang.String r1 = r2.A02     // Catch:{ Nnl -> 0x0145 }
            if (r1 == 0) goto L_0x00d4
            int r0 = r1.length()     // Catch:{ Nnl -> 0x0145 }
            if (r0 == 0) goto L_0x00d4
            int r2 = r1.hashCode()     // Catch:{ Nnl -> 0x0145 }
            r0 = -1466192994(0xffffffffa89bab9e, float:-1.7282884E-14)
            if (r2 == r0) goto L_0x00d1
            goto L_0x00bf
        L_0x00bd:
            r11 = r9
            goto L_0x00a5
        L_0x00bf:
            r0 = 10084(0x2764, float:1.413E-41)
            if (r2 == r0) goto L_0x00ce
            r0 = 377643(0x5c32b, float:5.2919E-40)
            if (r2 == r0) goto L_0x0125
            r0 = 1457762904(0x56e3b258, float:1.2517756E14)
            if (r2 != r0) goto L_0x00ec
            goto L_0x00e4
        L_0x00ce:
            java.lang.String r0 = "❤"
            goto L_0x00e6
        L_0x00d1:
            java.lang.String r0 = "\\u{2764}\\u{FE0F}"
            goto L_0x00e6
        L_0x00d4:
            java.lang.String r1 = r2.A04     // Catch:{ Nnl -> 0x0145 }
            if (r1 == 0) goto L_0x013e
            int r0 = r1.length()     // Catch:{ Nnl -> 0x0145 }
            if (r0 == 0) goto L_0x013e
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0145 }
            r0.<init>(r1, r10)     // Catch:{ Nnl -> 0x0145 }
            goto L_0x00f3
        L_0x00e4:
            java.lang.String r0 = "\\u{2764}"
        L_0x00e6:
            boolean r0 = r1.equals(r0)     // Catch:{ Nnl -> 0x0145 }
            if (r0 != 0) goto L_0x012d
        L_0x00ec:
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0145 }
            r0.<init>(r1, r12)     // Catch:{ Nnl -> 0x0145 }
        L_0x00f1:
            X.Prd r0 = (X.C74249Prd) r0     // Catch:{ Nnl -> 0x0145 }
        L_0x00f3:
            java.lang.String r1 = r3.A09     // Catch:{ Nnl -> 0x0145 }
            if (r16 == 0) goto L_0x00fb
            boolean r12 = r16.CWe()     // Catch:{ Nnl -> 0x0145 }
        L_0x00fb:
            X.N3b r17 = new X.N3b     // Catch:{ Nnl -> 0x0145 }
            r21 = r34
            r27 = r1
            r31 = r12
            r18 = r16
            r19 = r0
            r20 = r14
            r22 = r11
            r23 = r15
            r25 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31)     // Catch:{ Nnl -> 0x0145 }
            X.N2p r0 = new X.N2p     // Catch:{ Nnl -> 0x0145 }
            r10 = r0
            r11 = r17
            r12 = r32
            r13 = r33
            r14 = r6
            r10.<init>(r11, r12, r13, r14)     // Catch:{ Nnl -> 0x0145 }
            X.OTB r2 = new X.OTB     // Catch:{ Nnl -> 0x0145 }
            r2.<init>((X.C68149N2p) r0)     // Catch:{ Nnl -> 0x0145 }
            goto L_0x014b
        L_0x0125:
            java.lang.String r0 = "❤️"
            boolean r0 = r1.equals(r0)     // Catch:{ Nnl -> 0x0145 }
            if (r0 == 0) goto L_0x00ec
        L_0x012d:
            X.PDI r0 = X.PDI.A00     // Catch:{ Nnl -> 0x0145 }
            goto L_0x00f1
        L_0x0130:
            java.lang.String r0 = "thread id null or empty."
            X.Nnl r0 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0145 }
            goto L_0x0144
        L_0x0137:
            java.lang.String r0 = "message id null or empty."
            X.Nnl r0 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0145 }
            goto L_0x0144
        L_0x013e:
            java.lang.String r0 = "emoji and super react type are null or empty."
            X.Nnl r0 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0145 }
        L_0x0144:
            throw r0     // Catch:{ Nnl -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            X.OTB r2 = new X.OTB
            r2.<init>((X.C69541Nnl) r0)
        L_0x014b:
            X.N2p r0 = r2.A00
            if (r0 == 0) goto L_0x0153
            A01(r5, r0, r4)
            return
        L_0x0153:
            X.Obj r3 = r4.A00
            java.lang.String r1 = "mapping error: "
            X.Nnl r0 = r2.A01
            if (r0 == 0) goto L_0x0165
            java.lang.Throwable r0 = r0.getCause()
            if (r0 == 0) goto L_0x0165
            java.lang.String r9 = r0.getMessage()
        L_0x0165:
            java.lang.String r2 = X.002.A0R(r1, r9)
            X.OWE r1 = X.C66880MeH.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.MeH r0 = r1.A03(r8, r0, r6)
            r3.A04(r5, r0, r2)
            return
        L_0x0175:
            X.Obj r3 = r4.A00
            java.lang.String r0 = "message eligibility policy failure: "
            if (r10 == 0) goto L_0x017f
            java.lang.String r9 = r10.AUf(r5)
        L_0x017f:
            java.lang.String r2 = X.002.A0R(r0, r9)
            X.OWE r1 = X.C66880MeH.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.MeH r0 = r1.A03(r8, r0, r6)
            r3.A03(r5, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MeP.A03(com.instagram.common.session.UserSession, X.OBu, X.MeP, java.lang.Integer):void");
    }

    public MeP(C71088Obj obj, PDK pdk, PDJ pdj, C62320sa r5, C62320sa r6, 0sP r7, 0sP r8, 0sL r9) {
        C51974G9v.A1P(r5, r9, r6, r7);
        0qQ.A0B(r8, 8);
        this.A06 = r5;
        this.A03 = r9;
        this.A01 = r6;
        this.A07 = r7;
        this.A05 = pdj;
        this.A04 = pdk;
        this.A00 = obj;
        this.A02 = r8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.N8Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: X.N8Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v111, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v225, resolved type: X.N8Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v239, resolved type: X.N8Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v243, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v244, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v245, resolved type: X.N8Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v255, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v28, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v29, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v259, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v30, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v260, resolved type: X.N8X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v263, resolved type: X.N8X} */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.N8Y] */
    /* JADX WARNING: type inference failed for: r0v43, types: [X.Prd] */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.N8W] */
    /* JADX WARNING: type inference failed for: r0v82, types: [X.N8Y] */
    /* JADX WARNING: type inference failed for: r0v84, types: [X.N8W] */
    /* JADX WARNING: type inference failed for: r0v94, types: [X.N8Z] */
    /* JADX WARNING: type inference failed for: r0v126, types: [X.N8Z] */
    /* JADX WARNING: type inference failed for: r0v135, types: [X.N8Z] */
    /* JADX WARNING: type inference failed for: r0v140 */
    /* JADX WARNING: type inference failed for: r0v141, types: [X.Prd] */
    /* JADX WARNING: type inference failed for: r0v157, types: [X.N8Z] */
    /* JADX WARNING: type inference failed for: r0v168, types: [X.Prd] */
    /* JADX WARNING: type inference failed for: r0v174, types: [X.N8W] */
    /* JADX WARNING: type inference failed for: r0v226, types: [X.N8Z] */
    /* JADX WARNING: type inference failed for: r0v237 */
    /* JADX WARNING: type inference failed for: r0v238, types: [X.Prd] */
    /* JADX WARNING: type inference failed for: r0v241, types: [X.N8Y] */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03dd, code lost:
        if (r0.A0T == true) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03f2, code lost:
        if (((X.C331377Qt) r3).A01() != false) goto L_0x03f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0331 A[Catch:{ Nnl -> 0x0804 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0338 A[Catch:{ Nnl -> 0x0804 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x06a4 A[Catch:{ Nnl -> 0x0804 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r34, X.C66886MeO r35, X.MeP r36, java.lang.Integer r37) {
        /*
            r5 = r34
            r2 = r35
            r6 = r36
            long r16 = A00(r5, r2, r6)
            X.0sL r1 = r6.A03
            X.0sa r0 = r6.A01
            X.Me6 r3 = new X.Me6
            r3.<init>(r0, r1)
            java.lang.String r0 = r2.A0A
            r36 = r0
            X.2Eq r0 = r2.A03
            r18 = r0
            com.instagram.model.direct.DirectThreadKey r9 = r2.A04
            java.lang.String r7 = r9.A00
            X.3su r1 = r2.A02
            if (r1 == 0) goto L_0x0071
            long r26 = r1.C7c()
        L_0x0027:
            java.lang.String r0 = r2.A0B
            r29 = r0
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.A2O
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
        L_0x0033:
            java.lang.Integer r0 = r2.A07
            r35 = r0
            X.Me7 r4 = new X.Me7
            r19 = r4
            r20 = r18
            r22 = r0
            r23 = r36
            r24 = r7
            r25 = r29
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            X.0eM r0 = r3.A00
            java.util.List r0 = X.JTO.A15(r0)
            X.MeD r0 = X.C66876MeC.A00(r5, r4, r0)
            X.PuQ r3 = r0.A00
            boolean r0 = X.DbW.A1a(r3)
            r8 = 0
            if (r0 == 0) goto L_0x0836
            X.0sP r3 = r6.A02
            r0 = r36
            java.lang.Object r7 = r3.invoke(r0)
            X.69F r7 = (X.AnonymousClass69F) r7
            java.lang.String r0 = "eligibility_policy_checked"
            r3 = r16
            r7.Clr(r3, r0)
            r7 = 1
            goto L_0x0074
        L_0x006e:
            r21 = 0
            goto L_0x0033
        L_0x0071:
            r26 = 0
            goto L_0x0027
        L_0x0074:
            java.lang.String r0 = r2.A08     // Catch:{ Nnl -> 0x0804 }
            r19 = r0
            if (r0 == 0) goto L_0x07ef
            int r0 = r19.length()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x07ef
            java.lang.String r15 = r9.A00     // Catch:{ Nnl -> 0x0804 }
            if (r15 == 0) goto L_0x07e8
            int r0 = r15.length()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x07e8
            if (r1 == 0) goto L_0x0749
            X.2FW r4 = r1.A10     // Catch:{ Nnl -> 0x0804 }
            X.Nxe r0 = X.C70124Nxe.$redex_init_class     // Catch:{ Nnl -> 0x0804 }
            int r0 = r4.ordinal()     // Catch:{ Nnl -> 0x0804 }
            switch(r0) {
                case 2: goto L_0x0262;
                case 3: goto L_0x02bc;
                case 4: goto L_0x03cf;
                case 5: goto L_0x0536;
                case 11: goto L_0x0704;
                case 12: goto L_0x0414;
                case 14: goto L_0x0517;
                case 18: goto L_0x0666;
                case 20: goto L_0x04c0;
                case 21: goto L_0x0623;
                case 22: goto L_0x035b;
                case 23: goto L_0x0553;
                case 24: goto L_0x05b8;
                case 29: goto L_0x0685;
                case 41: goto L_0x06e2;
                case 46: goto L_0x0449;
                case 49: goto L_0x05da;
                case 57: goto L_0x00a9;
                case 59: goto L_0x06c4;
                case 96: goto L_0x06f6;
                default: goto L_0x0097;
            }     // Catch:{ Nnl -> 0x0804 }
        L_0x0097:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Message Content Type not supported: "
            java.lang.String r4 = X.AnonymousClass7TG.A0m(r4, r0, r3)     // Catch:{ Nnl -> 0x0804 }
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x00a9:
            X.N1Z r14 = r2.A00     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r1.A1R()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x00bc
            X.NjB r3 = X.C69310NjB.STICKER     // Catch:{ Nnl -> 0x0804 }
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((X.C69310NjB) r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x00b8:
            X.Prd r0 = (X.C74249Prd) r0     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x00bc:
            java.lang.Object r13 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r1.A1a()     // Catch:{ Nnl -> 0x0804 }
            r12 = 2
            r11 = 0
            r10 = 3
            r3 = 0
            if (r0 == 0) goto L_0x0153
            boolean r0 = r13 instanceof java.util.List     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0142
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ Nnl -> 0x0804 }
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Nnl -> 0x0804 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ Nnl -> 0x0804 }
            java.util.Iterator r20 = r0.iterator()     // Catch:{ Nnl -> 0x0804 }
        L_0x00db:
            boolean r0 = r20.hasNext()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0121
            java.lang.Object r14 = r20.next()     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r14 instanceof X.C254873tC     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x00db
            X.3tC r14 = (X.C254873tC) r14     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = r14.A0u     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x00db
            int r4 = r0.length()     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x00db
            android.net.Uri r4 = X.0cp.A03(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x011f
            java.lang.String r0 = "is_video"
            boolean r0 = r4.getBooleanQueryParameter(r0, r11)     // Catch:{ Nnl -> 0x0804 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x0105:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r14.A0X     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x010c
            r10.add(r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x010c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = X.0qQ.A0K(r4, r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x011c
            X.NjB r0 = X.C69310NjB.VIDEO     // Catch:{ Nnl -> 0x0804 }
        L_0x0118:
            r9.add(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x00db
        L_0x011c:
            X.NjB r0 = X.C69310NjB.PHOTO     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0118
        L_0x011f:
            r4 = r8
            goto L_0x0105
        L_0x0121:
            boolean r0 = X.DbT.A1b(r9)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0142
            X.0Tu r0 = X.0Tu.A05     // Catch:{ Nnl -> 0x0804 }
            r3 = 36328465477156206(0x81108c00003d6e, double:3.037606078518016E-306)
            boolean r0 = X.182.A06(r0, r5, r3)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x013b
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((java.util.List) r9, (java.util.List) r10)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x013b:
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((java.util.List) r9)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x00b8
        L_0x0142:
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Stack without valid content: "
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r13 == 0) goto L_0x0251
            java.lang.Class r3 = r13.getClass()     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0251
        L_0x0153:
            r9 = 0
            if (r14 == 0) goto L_0x0218
            X.Nl3 r4 = X.C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "content_type"
            java.lang.Enum r0 = r14.A04(r0, r4)     // Catch:{ Nnl -> 0x0804 }
            X.Nl3 r0 = (X.C69421Nl3) r0     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0169
            int r0 = r0.ordinal()     // Catch:{ Nnl -> 0x0804 }
            switch(r0) {
                case 1: goto L_0x017e;
                case 2: goto L_0x018a;
                case 3: goto L_0x0184;
                case 4: goto L_0x0187;
                case 5: goto L_0x0181;
                case 6: goto L_0x0169;
                case 7: goto L_0x0169;
                case 8: goto L_0x0169;
                case 9: goto L_0x0169;
                case 10: goto L_0x0169;
                case 11: goto L_0x018a;
                default: goto L_0x0169;
            }     // Catch:{ Nnl -> 0x0804 }
        L_0x0169:
            r23 = 0
            X.Nl2 r4 = X.C69420Nl2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "action_type"
            java.lang.Enum r0 = r14.A04(r0, r4)     // Catch:{ Nnl -> 0x0804 }
            X.Nl2 r0 = (X.C69420Nl2) r0     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x019f
            int r4 = r0.ordinal()     // Catch:{ Nnl -> 0x0804 }
            if (r4 == r7) goto L_0x019d
            goto L_0x018d
        L_0x017e:
            X.Njn r9 = X.C69348Njn.NOTE     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0169
        L_0x0181:
            X.Njn r9 = X.C69348Njn.POST     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0169
        L_0x0184:
            X.Njn r9 = X.C69348Njn.PROFILE     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0169
        L_0x0187:
            X.Njn r9 = X.C69348Njn.REEL     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0169
        L_0x018a:
            X.Njn r9 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0169
        L_0x018d:
            r0 = 4
            if (r4 == r0) goto L_0x019a
            if (r4 == r12) goto L_0x0197
            if (r4 != r10) goto L_0x019f
            X.Niq r23 = X.C69290Niq.REACT     // Catch:{ Nnl -> 0x0804 }
            goto L_0x019f
        L_0x0197:
            X.Niq r23 = X.C69290Niq.REPLY     // Catch:{ Nnl -> 0x0804 }
            goto L_0x019f
        L_0x019a:
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
            goto L_0x019f
        L_0x019d:
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
        L_0x019f:
            if (r9 == 0) goto L_0x0218
            if (r23 == 0) goto L_0x0218
            int r4 = r23.ordinal()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = ""
            if (r4 == r10) goto L_0x01eb
            if (r4 == r12) goto L_0x01e5
            if (r4 == r11) goto L_0x01b3
            if (r4 != r7) goto L_0x025c
            r4 = r8
            goto L_0x01fd
        L_0x01b3:
            X.Njn r4 = X.C69348Njn.REEL     // Catch:{ Nnl -> 0x0804 }
            if (r9 != r4) goto L_0x01d8
            X.3tC r4 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01d8
            java.lang.String r4 = r4.A0u     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01d8
            android.net.Uri r10 = X.0cp.A03(r4)     // Catch:{ Nnl -> 0x0804 }
            if (r10 == 0) goto L_0x01d8
            java.lang.String r4 = "reel_owner_id"
            java.lang.String r10 = r10.getQueryParameter(r4)     // Catch:{ Nnl -> 0x0804 }
            if (r10 == 0) goto L_0x01d8
            java.lang.String r4 = r1.A1u     // Catch:{ Nnl -> 0x0804 }
            boolean r4 = X.0qQ.A0K(r4, r10)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01d8
            r11 = 1
        L_0x01d8:
            java.lang.String r4 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01dd
            r0 = r4
        L_0x01dd:
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            X.N8W r4 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r4.<init>(r0, r10)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x01fd
        L_0x01e5:
            java.lang.String r4 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01f8
            r0 = r4
            goto L_0x01f8
        L_0x01eb:
            java.lang.String r4 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x01f0
            r0 = r4
        L_0x01f0:
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            X.N8W r4 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r4.<init>(r0, r10)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x01fd
        L_0x01f8:
            X.N8Y r4 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r4.<init>(r0, r11)     // Catch:{ Nnl -> 0x0804 }
        L_0x01fd:
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r3 = r0.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x0205:
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r4
            r24 = r9
            r25 = r3
            r26 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x00b8
        L_0x0218:
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Generic XMA unsupported: "
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r13 == 0) goto L_0x0224
            goto L_0x0226
        L_0x0224:
            r0 = r8
            goto L_0x022a
        L_0x0226:
            java.lang.Class r0 = r13.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x022a:
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = " contentType:"
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r14 == 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r0 = r8
            goto L_0x023f
        L_0x0237:
            X.Nl3 r4 = X.C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "content_type"
            java.lang.Enum r0 = r14.A04(r0, r4)     // Catch:{ Nnl -> 0x0804 }
        L_0x023f:
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = " actionType:"
            r9.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r14 == 0) goto L_0x0251
            X.Nl2 r3 = X.C69420Nl2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "action_type"
            java.lang.Enum r3 = r14.A04(r0, r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x0251:
            java.lang.String r3 = X.AnonymousClass7TF.A0i(r3, r9)     // Catch:{ Nnl -> 0x0804 }
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r3, r12)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x00b8
        L_0x025c:
            X.Wub r3 = X.AnonymousClass7TE.A1K()     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x0262:
            monitor-enter(r1)     // Catch:{ Nnl -> 0x0804 }
            java.util.List r0 = r1.A28     // Catch:{ all -> 0x02b8 }
            monitor-exit(r1)     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x029b
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Nnl -> 0x0804 }
        L_0x026e:
            boolean r0 = r4.hasNext()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x029b
            java.lang.Object r0 = r4.next()     // Catch:{ Nnl -> 0x0804 }
            com.instagram.direct.model.mentions.MentionedEntity r0 = (com.instagram.direct.model.mentions.MentionedEntity) r0     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r3 = r0.A03     // Catch:{ Nnl -> 0x0804 }
            com.instagram.user.model.User r0 = X.AnonymousClass0eD.A00(r5)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0295
            java.lang.Long r0 = r0.BST()     // Catch:{ Nnl -> 0x0804 }
        L_0x0286:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0298
            goto L_0x0297
        L_0x0295:
            r0 = r8
            goto L_0x0286
        L_0x0297:
            r9 = r0
        L_0x0298:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y     // Catch:{ Nnl -> 0x0804 }
            goto L_0x02b1
        L_0x029b:
            X.5FV r4 = r1.A0G()     // Catch:{ Nnl -> 0x0804 }
            X.5FV r3 = X.AnonymousClass5FV.GiftWrap     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 != r3) goto L_0x02a9
            if (r0 == 0) goto L_0x02af
            r9 = r0
            goto L_0x02af
        L_0x02a9:
            if (r0 == 0) goto L_0x02ac
            r9 = r0
        L_0x02ac:
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            goto L_0x02b1
        L_0x02af:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ Nnl -> 0x0804 }
        L_0x02b1:
            X.N8W r0 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r9, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x02b8:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x02bc:
            java.lang.Object r4 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r4 instanceof X.C300925yB     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x02e7
            X.5yB r4 = (X.C300925yB) r4     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r4.A05()     // Catch:{ Nnl -> 0x0804 }
            if (r0 != 0) goto L_0x0307
            X.1iA r4 = r4.A01     // Catch:{ Nnl -> 0x0804 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ Nnl -> 0x0804 }
            if (r4 == r0) goto L_0x030a
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Pending Media type not supported: "
            r3.append(r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x02d9:
            java.lang.String r4 = X.AnonymousClass7TF.A0i(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x02e3:
            X.Prd r0 = (X.C74249Prd) r0     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x02e7:
            boolean r0 = r4 instanceof X.1Xj     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x033e
            X.1Xj r4 = (X.1Xj) r4     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r4.CeS()     // Catch:{ Nnl -> 0x0804 }
            if (r0 != 0) goto L_0x0307
            boolean r0 = r4.A5p()     // Catch:{ Nnl -> 0x0804 }
            if (r0 != 0) goto L_0x030a
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Media type not supported: "
            r3.append(r0)     // Catch:{ Nnl -> 0x0804 }
            X.1iA r4 = r4.BR7()     // Catch:{ Nnl -> 0x0804 }
            goto L_0x02d9
        L_0x0307:
            X.NjB r9 = X.C69310NjB.VIDEO     // Catch:{ Nnl -> 0x0804 }
            goto L_0x030c
        L_0x030a:
            X.NjB r9 = X.C69310NjB.PHOTO     // Catch:{ Nnl -> 0x0804 }
        L_0x030c:
            X.0Tu r0 = X.0Tu.A05     // Catch:{ Nnl -> 0x0804 }
            r3 = 36328465477156206(0x81108c00003d6e, double:3.037606078518016E-306)
            boolean r0 = X.182.A06(r0, r5, r3)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0338
            X.1Xj r0 = r1.A0s     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0338
            com.instagram.model.mediasize.ImageInfo r0 = r0.A1p()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0338
            java.util.List r0 = r0.Al9()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0338
            java.lang.Object r3 = X.00k.A0J(r0)     // Catch:{ Nnl -> 0x0804 }
            com.instagram.common.typedurl.ImageUrlBase r3 = (com.instagram.common.typedurl.ImageUrlBase) r3     // Catch:{ Nnl -> 0x0804 }
            if (r3 == 0) goto L_0x0338
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((com.instagram.common.typedurl.ImageUrl) r3, (X.C69310NjB) r9)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0338:
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((X.C69310NjB) r9)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x02e3
        L_0x033e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Media Message Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x034a
            goto L_0x034c
        L_0x034a:
            r0 = 0
            goto L_0x0350
        L_0x034c:
            java.lang.Class r0 = r4.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x0350:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r0, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x035b:
            X.7Q3 r9 = r1.A0O()     // Catch:{ Nnl -> 0x0804 }
            X.7Q3 r0 = r1.A0O()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x03c7
            if (r9 == 0) goto L_0x039f
            int r4 = r9.ordinal()     // Catch:{ Nnl -> 0x0804 }
            r3 = 5
            r0 = 2
            if (r4 == r3) goto L_0x0372
            if (r4 != r0) goto L_0x039f
            goto L_0x03b0
        L_0x0372:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.REPLY     // Catch:{ Nnl -> 0x0804 }
            java.lang.Object r3 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            r0 = 170(0xaa, float:2.38E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ Nnl -> 0x0804 }
            X.0qQ.A0C(r3, r0)     // Catch:{ Nnl -> 0x0804 }
            X.7FN r3 = (X.AnonymousClass7FN) r3     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r4 = r3.A0A     // Catch:{ Nnl -> 0x0804 }
            X.0qQ.A07(r4)     // Catch:{ Nnl -> 0x0804 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            X.N8W r3 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r4, r0)     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r3
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x03c3
        L_0x039f:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Reel share type not supported: "
            java.lang.String r4 = X.AnonymousClass7TG.A0m(r9, r0, r3)     // Catch:{ Nnl -> 0x0804 }
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x03c3
        L_0x03b0:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
        L_0x03c3:
            X.Prd r0 = (X.C74249Prd) r0     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x03c7:
            java.lang.String r0 = "reelShareType is null."
            X.Nnl r3 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x03cf:
            java.lang.Object r3 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r3 instanceof X.C271374ik     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x03e8
            X.4ik r3 = (X.C271374ik) r3     // Catch:{ Nnl -> 0x0804 }
            X.4iq r0 = r3.A04     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x03f4
            boolean r0 = r0.A0T     // Catch:{ Nnl -> 0x0804 }
            if (r0 != r7) goto L_0x03f4
        L_0x03df:
            X.NjB r3 = X.C69310NjB.RAVEN_PHOTO     // Catch:{ Nnl -> 0x0804 }
        L_0x03e1:
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((X.C69310NjB) r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x03e8:
            boolean r0 = r3 instanceof X.C331377Qt     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x03f7
            X.7Qt r3 = (X.C331377Qt) r3     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r3.A01()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x03df
        L_0x03f4:
            X.NjB r3 = X.C69310NjB.RAVEN_VIDEO     // Catch:{ Nnl -> 0x0804 }
            goto L_0x03e1
        L_0x03f7:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Expiring Media Message Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r3 == 0) goto L_0x0403
            goto L_0x0405
        L_0x0403:
            r0 = 0
            goto L_0x0409
        L_0x0405:
            java.lang.Class r0 = r3.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x0409:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r0, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x0414:
            java.lang.Object r3 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r3 instanceof com.instagram.model.direct.gifs.DirectAnimatedMedia     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x042c
            com.instagram.model.direct.gifs.DirectAnimatedMedia r3 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r3     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r3.A06     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0429
            X.NjB r3 = X.C69310NjB.STICKER     // Catch:{ Nnl -> 0x0804 }
        L_0x0422:
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((X.C69310NjB) r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0429:
            X.NjB r3 = X.C69310NjB.GIF     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0422
        L_0x042c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Animated Media Message Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r3 == 0) goto L_0x0438
            goto L_0x043a
        L_0x0438:
            r0 = 0
            goto L_0x043e
        L_0x043a:
            java.lang.Class r0 = r3.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x043e:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r0, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x0449:
            java.lang.Object r9 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r9 instanceof X.AnonymousClass77X     // Catch:{ Nnl -> 0x0804 }
            r4 = 0
            if (r0 == 0) goto L_0x04a6
            X.77X r9 = (X.AnonymousClass77X) r9     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = r9.A03     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Nnl -> 0x0804 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x048d
            X.Niq r23 = X.C69290Niq.REACT     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r10 = r9.A03     // Catch:{ Nnl -> 0x0804 }
            if (r10 == 0) goto L_0x049e
            int r0 = r10.length()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x049e
            r0 = 0
            X.N8Y r3 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r10, r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x046e:
            X.Njn r24 = X.C69348Njn.REEL     // Catch:{ Nnl -> 0x0804 }
            X.1Xj r0 = r9.A01     // Catch:{ Nnl -> 0x0804 }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x047c
            java.lang.String r4 = r0.getUsername()     // Catch:{ Nnl -> 0x0804 }
        L_0x047c:
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r3
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x048d:
            java.lang.String r3 = r9.A04     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "tag"
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x049a
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
            goto L_0x049c
        L_0x049a:
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
        L_0x049c:
            r3 = r8
            goto L_0x046e
        L_0x049e:
            java.lang.String r0 = "emoji reaction from clip share null or empty"
            X.Nnl r3 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x04a6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Clip share Message Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r9 == 0) goto L_0x04b5
            java.lang.Class r4 = r9.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x04b5:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r4, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x04c0:
            java.lang.Object r9 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r9)     // Catch:{ Nnl -> 0x0804 }
            r3 = 0
            if (r0 != 0) goto L_0x04e4
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Media Share Message Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r9 == 0) goto L_0x04d9
            java.lang.Class r3 = r9.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x04d9:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r3, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x04e4:
            X.9JI r9 = (X.AnonymousClass9JI) r9     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r4 = r9.A03     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r4)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x04fb
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
        L_0x04f2:
            java.lang.Object r0 = r9.A00     // Catch:{ Nnl -> 0x0804 }
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ Nnl -> 0x0804 }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x04fe
        L_0x04fb:
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            goto L_0x04f2
        L_0x04fe:
            if (r0 == 0) goto L_0x0504
            java.lang.String r3 = r0.getUsername()     // Catch:{ Nnl -> 0x0804 }
        L_0x0504:
            X.Njn r24 = X.C69348Njn.POST     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0517:
            java.lang.Object r3 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r3 instanceof X.C2609947v     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0526
            X.NjB r3 = X.C69310NjB.AUDIO     // Catch:{ Nnl -> 0x0804 }
            X.N8Z r0 = new X.N8Z     // Catch:{ Nnl -> 0x0804 }
            r0.<init>((X.C69310NjB) r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0526:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected Voice Media Content class type: "
            r1.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r3 == 0) goto L_0x0533
            goto L_0x07f6
        L_0x0533:
            r0 = 0
            goto L_0x07fa
        L_0x0536:
            java.lang.Object r4 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0550
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Nnl -> 0x0804 }
            int r0 = r0.length()     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0550
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Nnl -> 0x0804 }
        L_0x0547:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ Nnl -> 0x0804 }
            X.N8W r0 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0550:
            java.lang.String r4 = "❤"
            goto L_0x0547
        L_0x0553:
            X.2FW r10 = r1.A0z     // Catch:{ Nnl -> 0x0804 }
            if (r10 != 0) goto L_0x0559
            r3 = -1
            goto L_0x055d
        L_0x0559:
            int r3 = r10.ordinal()     // Catch:{ Nnl -> 0x0804 }
        L_0x055d:
            r9 = 2
            java.lang.String r4 = ""
            if (r3 == r9) goto L_0x0597
            r0 = 9
            if (r3 == r0) goto L_0x0577
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Xma reel share type not supported: "
            java.lang.String r3 = X.AnonymousClass7TG.A0m(r10, r0, r3)     // Catch:{ Nnl -> 0x0804 }
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r3, r9)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0577:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.REACT     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0580
            r4 = r0
        L_0x0580:
            r9 = 0
            X.N8Y r3 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r4, r9)     // Catch:{ Nnl -> 0x0804 }
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r3
            r25 = r8
            r26 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0597:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.REPLY     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x05a0
            r4 = r0
        L_0x05a0:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            X.N8W r3 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r4, r0)     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r3
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x05b8:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r4 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 != 0) goto L_0x05c2
            java.lang.String r4 = ""
        L_0x05c2:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Nnl -> 0x0804 }
            X.N8W r3 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r4, r0)     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r3
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x05da:
            java.lang.Object r4 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r3 = r1.A1p     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "tagged_reel"
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0620
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
        L_0x05e8:
            boolean r0 = r4 instanceof X.C300925yB     // Catch:{ Nnl -> 0x0804 }
            if (r0 != 0) goto L_0x061e
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x061e
            java.lang.String r9 = r0.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x05f4:
            X.0Tu r0 = X.0Tu.A05     // Catch:{ Nnl -> 0x0804 }
            r3 = 36328465477156206(0x81108c00003d6e, double:3.037606078518016E-306)
            boolean r0 = X.182.A06(r0, r5, r3)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x061c
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x061c
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r0.A0X     // Catch:{ Nnl -> 0x0804 }
        L_0x0609:
            X.Njn r24 = X.C69348Njn.REEL     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r3
            r22 = r8
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x061c:
            r3 = r8
            goto L_0x0609
        L_0x061e:
            r9 = r8
            goto L_0x05f4
        L_0x0620:
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            goto L_0x05e8
        L_0x0623:
            java.lang.String r3 = r1.A1p     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "tagged_feed_post"
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0663
            X.Niq r23 = X.C69290Niq.TAG     // Catch:{ Nnl -> 0x0804 }
        L_0x062f:
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0661
            java.lang.String r9 = r0.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x0637:
            X.0Tu r0 = X.0Tu.A05     // Catch:{ Nnl -> 0x0804 }
            r3 = 36328465477156206(0x81108c00003d6e, double:3.037606078518016E-306)
            boolean r0 = X.182.A06(r0, r5, r3)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x065f
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x065f
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r0.A0X     // Catch:{ Nnl -> 0x0804 }
        L_0x064c:
            X.Njn r24 = X.C69348Njn.POST     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r3
            r22 = r8
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x065f:
            r3 = r8
            goto L_0x064c
        L_0x0661:
            r9 = r8
            goto L_0x0637
        L_0x0663:
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            goto L_0x062f
        L_0x0666:
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x0683
            java.lang.String r3 = r0.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x066e:
            X.Njn r24 = X.C69348Njn.PROFILE     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0683:
            r3 = 0
            goto L_0x066e
        L_0x0685:
            X.3tC r9 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            r3 = 0
            if (r9 == 0) goto L_0x06af
            java.lang.String r0 = r9.A0u     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x06af
            android.net.Uri r4 = X.0cp.A03(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x06af
            java.lang.String r0 = "reel_owner_id"
            java.lang.String r4 = r4.getQueryParameter(r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x069c:
            java.lang.String r3 = r9.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x069e:
            X.Njn r24 = X.C69348Njn.STORY     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x06b3
            java.lang.String r0 = r1.A1u     // Catch:{ Nnl -> 0x0804 }
            boolean r0 = X.0qQ.A0K(r0, r4)     // Catch:{ Nnl -> 0x0804 }
            r26 = 1
            if (r0 != 0) goto L_0x06b5
            goto L_0x06b3
        L_0x06af:
            r4 = r8
            if (r9 == 0) goto L_0x069e
            goto L_0x069c
        L_0x06b3:
            r26 = 0
        L_0x06b5:
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x06c4:
            X.3tC r0 = X.C3266377o.A01(r1)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x06e0
            java.lang.String r3 = r0.A11     // Catch:{ Nnl -> 0x0804 }
        L_0x06cc:
            X.Njn r24 = X.C69348Njn.LOCATION     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x06e0:
            r3 = 0
            goto L_0x06cc
        L_0x06e2:
            X.Njn r24 = X.C69348Njn.AR_EFFECT     // Catch:{ Nnl -> 0x0804 }
            X.Niq r23 = X.C69290Niq.SHARE     // Catch:{ Nnl -> 0x0804 }
            r26 = 0
            X.N8X r0 = new X.N8X     // Catch:{ Nnl -> 0x0804 }
            r20 = r0
            r21 = r8
            r22 = r8
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x06f6:
            java.lang.String r4 = r1.A1q     // Catch:{ Nnl -> 0x0804 }
            if (r4 != 0) goto L_0x06fc
            java.lang.String r4 = ""
        L_0x06fc:
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ Nnl -> 0x0804 }
            X.N8W r0 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0704:
            java.lang.Object r4 = r1.A1T     // Catch:{ Nnl -> 0x0804 }
            r0 = 7
            boolean r0 = X.C376649Iu.A00(r0, r4)     // Catch:{ Nnl -> 0x0804 }
            if (r0 == 0) goto L_0x072c
            X.9Iu r4 = (X.C376649Iu) r4     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r4 = r4.A01     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x0723
            int r0 = r4.length()     // Catch:{ Nnl -> 0x0804 }
            if (r0 <= 0) goto L_0x0723
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ Nnl -> 0x0804 }
            X.N8W r0 = new X.N8W     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x0720:
            X.Prd r0 = (X.C74249Prd) r0     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0751
        L_0x0723:
            java.lang.String r4 = "Misinging text from LINK for DirectLink"
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0720
        L_0x072c:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Unexpected LINK Message Content class type: "
            r3.append(r0)     // Catch:{ Nnl -> 0x0804 }
            if (r4 == 0) goto L_0x0738
            goto L_0x073a
        L_0x0738:
            r0 = 0
            goto L_0x073e
        L_0x073a:
            java.lang.Class r0 = r4.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x073e:
            java.lang.String r4 = X.AnonymousClass7TF.A0i(r0, r3)     // Catch:{ Nnl -> 0x0804 }
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0720
        L_0x0749:
            java.lang.String r4 = "Unknown message type - message is null"
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x0751:
            boolean r3 = r0 instanceof X.N8X     // Catch:{ Nnl -> 0x0804 }
            if (r3 == 0) goto L_0x0784
            r3 = r0
            X.N8X r3 = (X.N8X) r3     // Catch:{ Nnl -> 0x0804 }
            X.Njn r9 = r3.A03     // Catch:{ Nnl -> 0x0804 }
            X.Niq r4 = r3.A02     // Catch:{ Nnl -> 0x0804 }
            java.util.Set r3 = r9.A00     // Catch:{ Nnl -> 0x0804 }
            boolean r3 = r3.contains(r4)     // Catch:{ Nnl -> 0x0804 }
            if (r3 != 0) goto L_0x0784
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = "Invalid type "
            r3.append(r0)     // Catch:{ Nnl -> 0x0804 }
            r3.append(r9)     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = " with action "
            r3.append(r0)     // Catch:{ Nnl -> 0x0804 }
            r3.append(r4)     // Catch:{ Nnl -> 0x0804 }
            java.lang.String r0 = " for XmaMessageTypeData"
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r0, r3)     // Catch:{ Nnl -> 0x0804 }
            r3 = 2
            X.N8Y r0 = new X.N8Y     // Catch:{ Nnl -> 0x0804 }
            r0.<init>(r4, r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x0784:
            r9 = 0
            if (r1 == 0) goto L_0x0788
            goto L_0x078d
        L_0x0788:
            r27 = r8
            r31 = 0
            goto L_0x079b
        L_0x078d:
            java.lang.String r27 = r1.A0f()     // Catch:{ Nnl -> 0x0804 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Nnl -> 0x0804 }
            long r3 = r1.C7c()     // Catch:{ Nnl -> 0x0804 }
            long r31 = r10.toMillis(r3)     // Catch:{ Nnl -> 0x0804 }
        L_0x079b:
            java.lang.Boolean r3 = r2.A06     // Catch:{ Nnl -> 0x0804 }
            boolean r33 = X.AnonymousClass7TF.A1Y(r3, r7)     // Catch:{ Nnl -> 0x0804 }
            java.lang.Boolean r4 = r2.A05     // Catch:{ Nnl -> 0x0804 }
            if (r1 == 0) goto L_0x07a7
            java.lang.Long r9 = r1.A1L     // Catch:{ Nnl -> 0x0804 }
        L_0x07a7:
            java.lang.String r3 = r2.A09     // Catch:{ Nnl -> 0x0804 }
            if (r1 == 0) goto L_0x07de
            java.lang.Boolean r1 = r1.A0X()     // Catch:{ Nnl -> 0x0804 }
            if (r1 == 0) goto L_0x07de
            boolean r34 = r1.booleanValue()     // Catch:{ Nnl -> 0x0804 }
        L_0x07b5:
            X.N3b r20 = new X.N3b     // Catch:{ Nnl -> 0x0804 }
            r24 = r37
            r28 = r15
            r30 = r3
            r21 = r18
            r22 = r0
            r23 = r4
            r25 = r9
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)     // Catch:{ Nnl -> 0x0804 }
            X.N2p r0 = new X.N2p     // Catch:{ Nnl -> 0x0804 }
            r9 = r0
            r10 = r20
            r11 = r35
            r12 = r36
            r13 = r16
            r9.<init>(r10, r11, r12, r13)     // Catch:{ Nnl -> 0x0804 }
            X.OTB r3 = new X.OTB     // Catch:{ Nnl -> 0x0804 }
            r3.<init>((X.C68149N2p) r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x080a
        L_0x07de:
            if (r18 == 0) goto L_0x07e5
            boolean r34 = r18.CWe()     // Catch:{ Nnl -> 0x0804 }
            goto L_0x07b5
        L_0x07e5:
            r34 = 0
            goto L_0x07b5
        L_0x07e8:
            java.lang.String r0 = "thread id null or empty."
            X.Nnl r3 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x07ef:
            java.lang.String r0 = "message id null or empty."
            X.Nnl r3 = X.C69541Nnl.A00(r0)     // Catch:{ Nnl -> 0x0804 }
            goto L_0x0803
        L_0x07f6:
            java.lang.Class r0 = r3.getClass()     // Catch:{ Nnl -> 0x0804 }
        L_0x07fa:
            java.lang.IllegalArgumentException r0 = X.C66582MXn.A0j(r0, r1)     // Catch:{ Nnl -> 0x0804 }
            X.Nnl r3 = new X.Nnl     // Catch:{ Nnl -> 0x0804 }
            r3.<init>(r0)     // Catch:{ Nnl -> 0x0804 }
        L_0x0803:
            throw r3     // Catch:{ Nnl -> 0x0804 }
        L_0x0804:
            r0 = move-exception
            X.OTB r3 = new X.OTB
            r3.<init>((X.C69541Nnl) r0)
        L_0x080a:
            X.N2p r0 = r3.A00
            if (r0 == 0) goto L_0x0812
            A01(r5, r0, r6)
            return
        L_0x0812:
            X.Obj r7 = r6.A00
            java.lang.String r1 = "mapping error: "
            X.Nnl r0 = r3.A01
            if (r0 == 0) goto L_0x0824
            java.lang.Throwable r0 = r0.getCause()
            if (r0 == 0) goto L_0x0824
            java.lang.String r8 = r0.getMessage()
        L_0x0824:
            java.lang.String r6 = X.002.A0R(r1, r8)
            X.OWE r4 = X.C66880MeH.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r0 = r16
            X.MeH r0 = r4.A02(r2, r3, r0)
            r7.A04(r5, r0, r6)
            return
        L_0x0836:
            X.Obj r7 = r6.A00
            java.lang.String r0 = "message eligibility policy failure: "
            if (r3 == 0) goto L_0x0840
            java.lang.String r8 = r3.AUf(r5)
        L_0x0840:
            java.lang.String r6 = X.002.A0R(r0, r8)
            X.OWE r4 = X.C66880MeH.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r0 = r16
            X.MeH r0 = r4.A02(r2, r3, r0)
            r7.A03(r5, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MeP.A02(com.instagram.common.session.UserSession, X.MeO, X.MeP, java.lang.Integer):void");
    }
}
