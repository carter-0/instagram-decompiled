package com.meta.metaai.imagine.service;

import X.0eP;
import X.0qQ;
import X.1vm;
import X.1vn;
import X.1vo;
import X.2IS;
import X.AnonymousClass7TE;
import X.C56316HwT;
import X.C62637KjI;
import X.C69416Nky;
import X.LOt;
import X.XXv;
import android.content.Context;
import com.meta.foa.session.FoaUserSession;

public final class ImagineNetworkService {
    public static final LOt A04 = new LOt(C62637KjI.A0T, 100, true);
    public static final 0eP A05 = AnonymousClass7TE.A1L(576, 1024);
    public static final 0eP A06 = new 0eP(768, 768);
    public static final 0eP A07 = AnonymousClass7TE.A1L(1080, 1920);
    public static final 0eP A08 = new 0eP(1280, 1280);
    public final Context A00;
    public final 1vo A01;
    public final FoaUserSession A02;
    public final C69416Nky A03;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(android.graphics.Bitmap r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = X.C58075Il7.A02(r3, r10)
            if (r0 == 0) goto L_0x0022
            r7 = r10
            X.Il7 r7 = (X.C58075Il7) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r4) goto L_0x002a
            goto L_0x0044
        L_0x0022:
            r0 = 42
            X.Il7 r7 = new X.Il7
            r7.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r10, (int) r3, (int) r0)
            goto L_0x0015
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.0eS.A00(r1)
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 44
            X.MGC r0 = new X.MGC     // Catch:{ Exception -> 0x004a }
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r8, (X.AnonymousClass4D7) r5, (int) r1)     // Catch:{ Exception -> 0x004a }
            r7.A00 = r4     // Catch:{ Exception -> 0x004a }
            java.lang.Object r1 = X.I3P.A00(r7, r0, r2)     // Catch:{ Exception -> 0x004a }
            if (r1 != r6) goto L_0x0047
            return r6
        L_0x0044:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x004a }
        L_0x0047:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004a }
            return r1
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A06(android.graphics.Bitmap, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r4 = 1
            boolean r0 = X.C58075Il7.A02(r4, r8)
            if (r0 == 0) goto L_0x00aa
            r5 = r8
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00aa
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0083
            if (r0 != r4) goto L_0x00b8
            X.0eS.A00(r1)
        L_0x0022:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0031
            X.HQf r1 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
        L_0x002c:
            X.5sO r3 = X.C41845B3m.A0c(r1)
            return r3
        L_0x0031:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b3
            X.3lr r3 = X.C41848B3p.A16(r1)
            r5 = 0
            if (r3 == 0) goto L_0x007c
            java.lang.Class<X.BW7> r2 = X.BW7.class
            java.lang.String r1 = "xfb_genai_imagine_summarize_prompt_for_intents(prompt:$prompt)"
            r0 = 1604122615(0x5f9cf7f7, float:2.2621561E19)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x007c
            java.lang.Class<X.BW6> r2 = X.BW6.class
            java.lang.String r1 = "response"
            r0 = -2090400567(0xffffffff836704c9, float:-6.789029E-37)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = "summarized_prompt"
            java.lang.String r3 = r1.A07(r0)
            java.lang.String r0 = "request_id"
            java.lang.String r2 = r1.getOptionalStringField(r4, r0)
            java.lang.String r0 = "response_id"
            java.lang.String r1 = r1.A09(r0)
            if (r3 == 0) goto L_0x007c
            X.Hst r0 = new X.Hst
            r0.<init>(r3, r2, r1)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x007c:
            r0 = 0
            X.HIf r1 = new X.HIf
            r1.<init>(r5, r0)
            goto L_0x002c
        L_0x0083:
            X.0eS.A00(r1)
            java.lang.Class<X.CxP> r0 = X.C45489CxP.class
            java.lang.Object r2 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00bd }
            X.DGB r2 = (X.DGB) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00bd }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "prompt"
            boolean r0 = X.C41848B3p.A1Z(r1, r0, r7)
            r2.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r1 = r2.build()
            X.1vo r0 = r6.A01
            X.0qQ.A0A(r1)
            r5.A00 = r4
            java.lang.Object r1 = X.C55228HeJ.A00(r0, r1, r5)
            if (r1 != r3) goto L_0x0022
            return r3
        L_0x00aa:
            r0 = 42
            X.Il7 r5 = new X.Il7
            r5.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r8, (int) r4, (int) r0)
            goto L_0x0015
        L_0x00b3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bd:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A09(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r14 == null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.HMY r19, com.meta.metaai.imagine.service.ImagineNetworkService r20, X.C56146HtY r21, X.C56146HtY r22, X.AnonymousClass4D7 r23) {
        /*
            r4 = r21
            r3 = 38
            r5 = r23
            boolean r0 = X.C66139MDr.A01(r3, r5)
            r9 = r20
            if (r0 == 0) goto L_0x0144
            r8 = r5
            X.MDr r8 = (X.C66139MDr) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0144
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r8.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            r10 = 0
            if (r0 == 0) goto L_0x00d3
            if (r0 != r6) goto L_0x016b
            java.lang.Object r4 = r8.A01
            X.HtY r4 = (X.C56146HtY) r4
            X.0eS.A00(r1)
        L_0x002f:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0159
            X.3lr r3 = X.C41848B3p.A16(r1)
            if (r3 == 0) goto L_0x00cc
            java.lang.Class<X.BWD> r2 = X.BWD.class
            java.lang.String r1 = "xfb_genai_imagine_regenerate_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = 1504390849(0x59ab2ec1, float:6.0229534E15)
            X.3lr r3 = r3.A04(r2, r1, r0)
            if (r3 == 0) goto L_0x00cc
            java.lang.Class<X.BWC> r2 = X.BWC.class
            java.lang.String r1 = "response"
            r0 = -1220327283(0xffffffffb743488d, float:-1.1639798E-5)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r7 = X.00k.A0J(r0)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x00cd
            java.lang.Class<X.BWB> r2 = X.BWB.class
            r5 = 0
            java.lang.String r1 = "XFBGenAIImagineResultSuccess"
            r0 = -1536728967(0xffffffffa4676079, float:-5.0171856E-17)
            X.3lr r3 = r7.reinterpretIfFulfillsType(r5, r1, r2, r0)
            if (r3 == 0) goto L_0x00cd
            java.lang.Class<X.BWA> r2 = X.BWA.class
            java.lang.String r1 = "imagine_result_success"
            r0 = -880072831(0xffffffffcb8b2781, float:-1.8239234E7)
            X.3lr r3 = r3.getOptionalTreeField(r5, r1, r2, r0)
        L_0x0076:
            java.lang.Class<X.BW9> r2 = X.BW9.class
            java.lang.String r1 = "XFBGenAIImagineResultGenericError"
            r0 = -1599717002(0xffffffffa0a64176, float:-2.8164812E-19)
            X.3lr r1 = r7.reinterpretIfFulfillsType(r6, r1, r2, r0)
            if (r3 == 0) goto L_0x00d1
            java.lang.String r0 = "uri"
            java.lang.String r13 = r3.A07(r0)
            java.lang.String r0 = "image_id"
            java.lang.String r14 = r3.A09(r0)
            if (r14 != 0) goto L_0x0093
        L_0x0091:
            java.lang.String r14 = ""
        L_0x0093:
            if (r13 == 0) goto L_0x014b
            java.lang.String r15 = r4.A05
            java.lang.String r0 = "response_id"
            java.lang.String r18 = r3.getOptionalStringField(r6, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r19 = r3.A0A(r0)
            X.EX8 r2 = X.EX8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 4
            java.lang.String r0 = "media_type"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)
            X.EX8 r0 = (X.EX8) r0
            java.lang.Integer r11 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A02(r0)
            X.0eP r0 = r4.A0C
            java.lang.Integer r12 = r4.A01
            r23 = 0
            X.HtY r9 = new X.HtY
            r16 = r10
            r17 = r10
            r20 = r10
            r21 = r10
            r22 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.3Ih r7 = X.C41845B3m.A0d(r9)
            return r7
        L_0x00cc:
            r7 = r10
        L_0x00cd:
            r3 = r10
            if (r7 != 0) goto L_0x0076
            r1 = r10
        L_0x00d1:
            r13 = r10
            goto L_0x0091
        L_0x00d3:
            X.0eS.A00(r1)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "media_id"
            X.0Df r5 = X.C41845B3m.A03(r2, r1, r0)
            r0 = r22
            if (r22 == 0) goto L_0x00ff
            java.lang.String r1 = r0.A04
        L_0x00e6:
            java.lang.String r0 = "previous_media_id"
            X.0Df.A00(r5, r1, r0)
            int r1 = r19.ordinal()
            if (r1 == r6) goto L_0x00fc
            r0 = 0
            if (r1 != r0) goto L_0x0176
            java.lang.String r1 = "VERTICAL"
        L_0x00f6:
            java.lang.String r0 = "orientation"
            X.0Df.A00(r5, r1, r0)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r1 = "SQUARE"
            goto L_0x00f6
        L_0x00ff:
            r1 = r10
            goto L_0x00e6
        L_0x0101:
            java.lang.Class<X.CxQ> r3 = X.C45490CxQ.class
            java.lang.String r1 = "create"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0170 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0170 }
            java.lang.Object r3 = r1.invoke(r10, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0170 }
            X.DGC r3 = (X.DGC) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0170 }
            X.2IS r2 = r3.A00
            java.lang.String r1 = "params"
            X.2IV r0 = r2.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r5, r1)
            r3.A01 = r6
            A05(r2, r9)
            X.1vo r5 = r9.A01
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 30000(0x7530, double:1.4822E-319)
            long r1 = r2.toSeconds(r0)
            int r0 = (int) r1
            X.1Ef r0 = r3.setNetworkTimeoutSeconds(r0)
            r8.A01 = r4
            r8.A00 = r6
            java.lang.Object r1 = X.C55228HeJ.A00(r5, r0, r8)
            if (r1 != r7) goto L_0x002f
            return r7
        L_0x0144:
            X.MDr r8 = new X.MDr
            r8.<init>(r9, r5, r3)
            goto L_0x001c
        L_0x014b:
            if (r1 == 0) goto L_0x0153
            java.lang.String r0 = "message"
            java.lang.String r10 = r1.A07(r0)
        L_0x0153:
            X.HIf r0 = new X.HIf
            r0.<init>(r10, r6)
            goto L_0x0161
        L_0x0159:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0166
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
        L_0x0161:
            X.5sO r7 = X.C41845B3m.A0c(r0)
            return r7
        L_0x0166:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0170:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0176:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A00(X.HMY, com.meta.metaai.imagine.service.ImagineNetworkService, X.HtY, X.HtY, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r14 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (r8 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        if (r8 != null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.HMY r20, com.meta.metaai.imagine.service.ImagineNetworkService r21, X.C56146HtY r22, X.AnonymousClass4D7 r23) {
        /*
            r2 = r22
            r3 = r20
            r5 = 19
            r6 = r23
            boolean r0 = X.C66131MDj.A01(r5, r6)
            r10 = r21
            if (r0 == 0) goto L_0x0160
            r9 = r6
            X.MDj r9 = (X.C66131MDj) r9
            int r4 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0160
            int r4 = r4 - r1
            r9.A00 = r4
        L_0x001e:
            java.lang.Object r1 = r9.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r5 = 1
            if (r0 == 0) goto L_0x011d
            if (r0 != r5) goto L_0x0171
            java.lang.Object r3 = r9.A02
            X.HMY r3 = (X.HMY) r3
            java.lang.Object r2 = r9.A01
            X.HtY r2 = (X.C56146HtY) r2
            X.0eS.A00(r1)
        L_0x0034:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0114
            X.3lr r8 = X.C41848B3p.A16(r1)
            r9 = 0
            if (r8 == 0) goto L_0x0107
            java.lang.Class<X.BVZ> r4 = X.BVZ.class
            java.lang.String r1 = "xfb_genai_imagine_animate_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = 1923652378(0x72a89b1a, float:6.6791665E30)
            X.3lr r6 = r8.A04(r4, r1, r0)
            if (r6 == 0) goto L_0x0107
            java.lang.Class<X.BVX> r4 = X.BVX.class
            java.lang.String r1 = "response"
            r0 = -572574047(0xffffffffdddf36a1, float:-2.01052752E18)
            com.google.common.collect.ImmutableList r0 = r6.A06(r4, r1, r0)
            if (r0 == 0) goto L_0x0107
            java.lang.Object r6 = X.00k.A0J(r0)
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0107
            java.lang.Class<X.BVW> r4 = X.BVW.class
            r7 = 0
            java.lang.String r1 = "XFBGenAIImagineResultSuccess"
            r0 = -342492653(0xffffffffeb95fa13, float:-3.6262178E26)
            X.3lr r6 = r6.reinterpretIfFulfillsType(r7, r1, r4, r0)
            if (r6 == 0) goto L_0x0107
            java.lang.Class<X.BVV> r4 = X.BVV.class
            java.lang.String r1 = "imagine_result_success"
            r0 = -1072416508(0xffffffffc0143904, float:-2.31598)
            X.3lr r4 = r6.getOptionalTreeField(r7, r1, r4, r0)
        L_0x007c:
            java.lang.Class<X.BVZ> r7 = X.BVZ.class
            r6 = 2
            java.lang.String r1 = "xfb_genai_imagine_animate_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = 1923652378(0x72a89b1a, float:6.6791665E30)
            X.3lr r1 = r8.getOptionalTreeField(r6, r1, r7, r0)
            if (r1 == 0) goto L_0x010c
            java.lang.String r0 = "tracking"
            java.lang.String r20 = r1.getOptionalStringField(r6, r0)
        L_0x0090:
            java.lang.Class<X.BVZ> r6 = X.BVZ.class
            java.lang.String r1 = "xfb_genai_imagine_animate_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = 1923652378(0x72a89b1a, float:6.6791665E30)
            X.3lr r8 = r8.A04(r6, r1, r0)
            if (r8 == 0) goto L_0x0111
            java.lang.Class<X.BVY> r7 = X.BVY.class
            r6 = 3
            java.lang.String r1 = "user_interactions"
            r0 = -1709934196(0xffffffff9a14798c, float:-3.0703867E-23)
            X.3lr r0 = r8.getOptionalTreeField(r6, r1, r7, r0)
            if (r0 == 0) goto L_0x0111
            java.lang.String r21 = X.C41845B3m.A0k(r0)
        L_0x00af:
            if (r4 == 0) goto L_0x0105
            java.lang.String r0 = "uri"
            java.lang.String r13 = r4.A07(r0)
            java.lang.String r0 = "image_id"
            java.lang.String r14 = r4.A09(r0)
            if (r14 != 0) goto L_0x00c1
        L_0x00bf:
            java.lang.String r14 = ""
        L_0x00c1:
            if (r13 == 0) goto L_0x00f8
            java.lang.String r15 = r2.A05
            r10 = 0
            java.lang.String r0 = "response_id"
            java.lang.String r18 = r4.getOptionalStringField(r5, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r19 = r4.A0A(r0)
            X.EX8 r6 = X.EX8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 4
            java.lang.String r1 = "media_type"
            java.lang.Enum r0 = r4.getOptionalEnumField(r5, r1, r6)
            X.EX8 r0 = (X.EX8) r0
            java.lang.Integer r11 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A02(r0)
            java.lang.Enum r0 = r4.getOptionalEnumField(r5, r1, r6)
            X.EX8 r0 = (X.EX8) r0
            X.0eP r22 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A04(r3, r0)
            java.lang.Integer r12 = r2.A01
            r23 = 0
            X.HtY r9 = new X.HtY
            r16 = r10
            r17 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00f8:
            X.DJm r0 = X.C46029DJm.A00
            if (r9 != 0) goto L_0x0167
            java.lang.Object r0 = r0.invoke()
        L_0x0100:
            X.5sO r8 = X.C41845B3m.A0c(r0)
            return r8
        L_0x0105:
            r13 = r9
            goto L_0x00bf
        L_0x0107:
            r4 = r9
            if (r8 == 0) goto L_0x010c
            goto L_0x007c
        L_0x010c:
            r20 = r9
            if (r8 == 0) goto L_0x0111
            goto L_0x0090
        L_0x0111:
            r21 = r9
            goto L_0x00af
        L_0x0114:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x016c
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
            goto L_0x0100
        L_0x011d:
            X.0eS.A00(r1)
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "previous_image_id"
            X.0Df r7 = r4.A02()
            X.C41848B3p.A1M(r7, r1, r0)
            java.lang.Class<X.CxJ> r4 = X.C45483CxJ.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r6 = X.C41847B3o.A17(r4, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0176 }
            X.DG6 r6 = (X.DG6) r6     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0176 }
            X.2IS r4 = r6.A00
            java.lang.String r1 = "params"
            X.2IV r0 = r4.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r7, r1)
            r6.A01 = r5
            A05(r4, r10)
            X.1vo r1 = r10.A01
            com.facebook.pando.PandoGraphQLRequest r0 = r6.build()
            X.0qQ.A07(r0)
            r9.A01 = r2
            r9.A02 = r3
            r9.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r1, r0, r9)
            if (r1 != r8) goto L_0x0034
            return r8
        L_0x0160:
            X.MDj r9 = new X.MDj
            r9.<init>(r10, r6, r5)
            goto L_0x001e
        L_0x0167:
            X.3Ih r8 = X.C41845B3m.A0d(r9)
            return r8
        L_0x016c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0176:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A01(X.HMY, com.meta.metaai.imagine.service.ImagineNetworkService, X.HtY, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.HMY r21, com.meta.metaai.imagine.service.ImagineNetworkService r22, java.lang.String r23, X.AnonymousClass4D7 r24, int r25) {
        /*
            r2 = r23
            r4 = r21
            r5 = 20
            r6 = r24
            boolean r0 = X.C66131MDj.A01(r5, r6)
            r8 = r22
            if (r0 == 0) goto L_0x0144
            r7 = r6
            X.MDj r7 = (X.C66131MDj) r7
            int r3 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0144
            int r3 = r3 - r1
            r7.A00 = r3
        L_0x001e:
            java.lang.Object r1 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x00f4
            if (r0 != r5) goto L_0x0169
            java.lang.Object r4 = r7.A02
            X.HMY r4 = (X.HMY) r4
            java.lang.Object r2 = r7.A01
            java.lang.String r2 = (java.lang.String) r2
            X.0eS.A00(r1)
        L_0x0034:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0151
            X.3lr r10 = X.C41848B3p.A16(r1)
            r12 = 0
            if (r10 == 0) goto L_0x014b
            java.lang.Class<X.BVp> r9 = X.C42220BVp.class
            java.lang.String r8 = "xfb_genai_imagine_flash_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r7 = -2055749959(0xffffffff8577beb9, float:-1.16489144E-35)
            X.3lr r6 = r10.A04(r9, r8, r7)
            if (r6 == 0) goto L_0x00f2
            java.lang.Class<X.BVn> r3 = X.C42218BVn.class
            r11 = 0
            java.lang.String r1 = "response"
            r0 = 1623911254(0x60caeb56, float:1.16975E20)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r11, r1, r3, r0)
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r6 = X.00k.A0J(r0)
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x00f2
            java.lang.Class<X.BVm> r3 = X.C42217BVm.class
            java.lang.String r1 = "XFBGenAIImagineResultSuccess"
            r0 = -1432832138(0xffffffffaa98b776, float:-2.7127926E-13)
            X.3lr r6 = r6.reinterpretIfFulfillsType(r11, r1, r3, r0)
            if (r6 == 0) goto L_0x00f2
            java.lang.Class<X.BVl> r3 = X.C42216BVl.class
            java.lang.String r1 = "imagine_result_success"
            r0 = -1941348654(0xffffffff8c495ed2, float:-1.5513011E-31)
            X.3lr r6 = r6.getOptionalTreeField(r11, r1, r3, r0)
        L_0x007c:
            r3 = 2
            X.3lr r1 = r10.getOptionalTreeField(r3, r8, r9, r7)
            if (r1 == 0) goto L_0x00ef
            java.lang.String r0 = "tracking"
            java.lang.String r22 = r1.getOptionalStringField(r3, r0)
        L_0x0089:
            X.3lr r8 = r10.getOptionalTreeField(r3, r8, r9, r7)
            if (r8 == 0) goto L_0x00ec
            java.lang.Class<X.BVo> r7 = X.C42219BVo.class
            r3 = 3
            java.lang.String r1 = "user_interactions"
            r0 = 600717573(0x23ce3905, float:2.2358713E-17)
            X.3lr r0 = r8.getOptionalTreeField(r3, r1, r7, r0)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r23 = X.C41845B3m.A0k(r0)
        L_0x00a1:
            if (r6 == 0) goto L_0x014b
            java.lang.String r0 = "uri"
            java.lang.String r15 = r6.A07(r0)
            java.lang.String r0 = "image_id"
            java.lang.String r16 = r6.A09(r0)
            if (r15 == 0) goto L_0x015a
            if (r16 == 0) goto L_0x015a
            java.lang.String r0 = "response_id"
            java.lang.String r20 = r6.getOptionalStringField(r5, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r21 = r6.A0A(r0)
            X.EX8 r5 = X.EX8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 4
            java.lang.String r1 = "media_type"
            java.lang.Enum r0 = r6.getOptionalEnumField(r3, r1, r5)
            X.EX8 r0 = (X.EX8) r0
            java.lang.Integer r13 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A02(r0)
            java.lang.Enum r0 = r6.getOptionalEnumField(r3, r1, r5)
            X.EX8 r0 = (X.EX8) r0
            X.0eP r24 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A04(r4, r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r25 = 0
            X.HtY r11 = new X.HtY
            r18 = r12
            r19 = r12
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.3Ih r6 = X.C41845B3m.A0d(r11)
            return r6
        L_0x00ec:
            r23 = r12
            goto L_0x00a1
        L_0x00ef:
            r22 = r12
            goto L_0x0089
        L_0x00f2:
            r6 = r12
            goto L_0x007c
        L_0x00f4:
            X.0eS.A00(r1)
            X.QNI r9 = new X.QNI
            r9.<init>()
            java.lang.String r0 = "prompt"
            r9.A07(r2, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r0 = r25
            r3.<init>(r0)
            java.lang.String r1 = "seed"
            X.0Df r0 = r9.A02()
            X.0Df.A00(r0, r3, r1)
            X.C41848B3p.A1N(r9)
            java.lang.Class<X.CxM> r3 = X.C45486CxM.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r3 = X.C41847B3o.A17(r3, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x016e }
            X.DG9 r3 = (X.DG9) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x016e }
            X.2IS r1 = r3.A00
            java.lang.String r0 = "params"
            r1.A00(r9, r0)
            r3.A01 = r5
            A05(r1, r8)
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            r0 = 5000(0x1388, double:2.4703E-320)
            X.1Ef r1 = r3.setMaxToleratedCacheAgeMs(r0)
            X.1vo r0 = r8.A01
            r7.A01 = r2
            r7.A02 = r4
            r7.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r0, r1, r7)
            if (r1 != r6) goto L_0x0034
            return r6
        L_0x0144:
            X.MDj r7 = new X.MDj
            r7.<init>(r8, r6, r5)
            goto L_0x001e
        L_0x014b:
            X.CTa r0 = new X.CTa
            r0.<init>()
            goto L_0x015f
        L_0x0151:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0164
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
            goto L_0x015f
        L_0x015a:
            X.HIe r0 = new X.HIe
            r0.<init>()
        L_0x015f:
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x0164:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x016e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A03(X.HMY, com.meta.metaai.imagine.service.ImagineNetworkService, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r13 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        if (r8 != null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.meta.metaai.imagine.service.ImagineNetworkService r19, X.C56146HtY r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r3 = r20
            r4 = 37
            r5 = r22
            boolean r0 = X.C66139MDr.A01(r4, r5)
            r9 = r19
            if (r0 == 0) goto L_0x0171
            r7 = r5
            X.MDr r7 = (X.C66139MDr) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0171
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x010d
            if (r0 != r5) goto L_0x01a3
            java.lang.Object r3 = r7.A01
            X.HtY r3 = (X.C56146HtY) r3
            X.0eS.A00(r1)
        L_0x002e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0191
            X.3lr r8 = X.C41848B3p.A16(r1)
            r9 = 0
            if (r8 == 0) goto L_0x0106
            java.lang.Class<X.BVi> r2 = X.C42213BVi.class
            java.lang.String r1 = "xfb_genai_imagine_edit_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = -1370750670(0xffffffffae4c0132, float:-4.638529E-11)
            X.3lr r4 = r8.A04(r2, r1, r0)
            if (r4 == 0) goto L_0x0106
            java.lang.Class<X.BVg> r2 = X.C42211BVg.class
            java.lang.String r1 = "response"
            r0 = 1012696995(0x3c5c87a3, float:0.013460073)
            com.google.common.collect.ImmutableList r0 = r4.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.Object r7 = X.00k.A0J(r0)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x0107
            java.lang.Class<X.BVf> r2 = X.C42210BVf.class
            r6 = 0
            java.lang.String r1 = "XFBGenAIImagineResultSuccess"
            r0 = 1135235918(0x43aa534e, float:340.65082)
            X.3lr r4 = r7.reinterpretIfFulfillsType(r6, r1, r2, r0)
            if (r4 == 0) goto L_0x0107
            java.lang.Class<X.BVe> r2 = X.C42209BVe.class
            java.lang.String r1 = "imagine_result_success"
            r0 = 1560324221(0x5d00a87d, float:5.7942483E17)
            X.3lr r4 = r4.getOptionalTreeField(r6, r1, r2, r0)
        L_0x0076:
            java.lang.Class<X.BVd> r2 = X.C42208BVd.class
            java.lang.String r1 = "XFBGenAIImagineResultGenericError"
            r0 = 1638272682(0x61a60eaa, float:3.8290202E20)
            X.3lr r2 = r7.reinterpretIfFulfillsType(r5, r1, r2, r0)
        L_0x0081:
            if (r8 == 0) goto L_0x00fe
            java.lang.Class<X.BVi> r7 = X.C42213BVi.class
            r6 = 2
            java.lang.String r1 = "xfb_genai_imagine_edit_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = -1370750670(0xffffffffae4c0132, float:-4.638529E-11)
            X.3lr r1 = r8.getOptionalTreeField(r6, r1, r7, r0)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "tracking"
            java.lang.String r19 = r1.getOptionalStringField(r6, r0)
        L_0x0097:
            java.lang.Class<X.BVi> r6 = X.C42213BVi.class
            java.lang.String r1 = "xfb_genai_imagine_edit_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = -1370750670(0xffffffffae4c0132, float:-4.638529E-11)
            X.3lr r8 = r8.A04(r6, r1, r0)
            if (r8 == 0) goto L_0x0103
            java.lang.Class<X.BVh> r7 = X.C42212BVh.class
            r6 = 3
            java.lang.String r1 = "user_interactions"
            r0 = 1162384310(0x454893b6, float:3209.232)
            X.3lr r0 = r8.getOptionalTreeField(r6, r1, r7, r0)
            if (r0 == 0) goto L_0x0103
            java.lang.String r20 = X.C41845B3m.A0k(r0)
        L_0x00b6:
            if (r4 == 0) goto L_0x00fc
            java.lang.String r0 = "uri"
            java.lang.String r12 = r4.A07(r0)
            java.lang.String r0 = "image_id"
            java.lang.String r13 = r4.A09(r0)
            if (r13 != 0) goto L_0x00c8
        L_0x00c6:
            java.lang.String r13 = ""
        L_0x00c8:
            if (r12 == 0) goto L_0x0178
            java.lang.String r14 = r3.A05
            java.lang.String r0 = "response_id"
            java.lang.String r17 = r4.getOptionalStringField(r5, r0)
            java.lang.String r0 = "request_id"
            java.lang.String r18 = r4.A0A(r0)
            X.EX8 r2 = X.EX8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 4
            java.lang.String r0 = "media_type"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r2)
            X.EX8 r0 = (X.EX8) r0
            java.lang.Integer r10 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A02(r0)
            X.0eP r0 = r3.A0C
            java.lang.Integer r11 = r3.A01
            r22 = 0
            X.HtY r8 = new X.HtY
            r15 = r9
            r16 = r9
            r21 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.3Ih r6 = X.C41845B3m.A0d(r8)
            return r6
        L_0x00fc:
            r12 = r9
            goto L_0x00c6
        L_0x00fe:
            r19 = r9
            if (r8 == 0) goto L_0x0103
            goto L_0x0097
        L_0x0103:
            r20 = r9
            goto L_0x00b6
        L_0x0106:
            r7 = r9
        L_0x0107:
            r4 = r9
            if (r7 != 0) goto L_0x0076
            r2 = r9
            goto L_0x0081
        L_0x010d:
            X.0eS.A00(r1)
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "prompt"
            r2 = r21
            X.0Df r8 = X.C41845B3m.A03(r1, r2, r0)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "previous_image_id"
            X.C41848B3p.A1M(r8, r1, r0)
            java.lang.String r0 = r3.A08
            if (r0 != 0) goto L_0x0140
            X.Nky r1 = X.C69416Nky.A0I
            X.Nky r0 = X.C69416Nky.A0K
            X.Nky[] r0 = new X.C69416Nky[]{r1, r0}
            java.util.Set r1 = X.0sc.A07(r0)
            X.Nky r0 = r9.A03
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = "USER_UPLOADED_IMG_MSG"
            java.lang.String r0 = "previous_media_id_source"
            X.0Df.A00(r8, r1, r0)
        L_0x0140:
            java.lang.Class<X.CxL> r2 = X.C45485CxL.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r4 = X.C41847B3o.A17(r2, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01a8 }
            X.DG8 r4 = (X.DG8) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01a8 }
            X.2IS r2 = r4.A00
            java.lang.String r1 = "params"
            X.2IV r0 = r2.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r8, r1)
            r4.A01 = r5
            A05(r2, r9)
            X.1vo r1 = r9.A01
            com.facebook.pando.PandoGraphQLRequest r0 = r4.build()
            X.0qQ.A07(r0)
            r7.A01 = r3
            r7.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r1, r0, r7)
            if (r1 != r6) goto L_0x002e
            return r6
        L_0x0171:
            X.MDr r7 = new X.MDr
            r7.<init>(r9, r5, r4)
            goto L_0x001c
        L_0x0178:
            if (r2 == 0) goto L_0x0187
            java.lang.String r0 = "user_visible_message"
            java.lang.String r9 = r2.A0B(r0)
            r1 = 3
            java.lang.String r0 = "allow_retry"
            boolean r5 = r2.getCoercedBooleanField(r1, r0)
        L_0x0187:
            X.HIf r0 = new X.HIf
            r0.<init>(r9, r5)
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x0191:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x019e
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x019e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A04(com.meta.metaai.imagine.service.ImagineNetworkService, X.HtY, java.lang.String, X.4D7):java.lang.Object");
    }

    public static void A05(2IS r2, ImagineNetworkService imagineNetworkService) {
        r2.A04("surface", XXv.A00(imagineNetworkService.A03).toString());
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6 = X.C42206BVb.class;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 47
            boolean r0 = X.ME5.A03(r3, r12)
            if (r0 == 0) goto L_0x00af
            r6 = r12
            X.ME5 r6 = (X.ME5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 1
            r7 = 2
            if (r0 == 0) goto L_0x0067
            if (r0 != r8) goto L_0x00b8
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r5 = 0
            if (r0 == 0) goto L_0x005e
            X.3lr r9 = X.C41848B3p.A16(r1)
            if (r9 == 0) goto L_0x005d
            java.lang.Class<X.BVb> r6 = X.C42206BVb.class
            java.lang.String r4 = "xfb_genai_imagine_upload_user_photo_for_intents(params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r3 = 985914320(0x3ac3dbd0, float:0.0014942829)
            X.3lr r2 = r9.getOptionalTreeField(r7, r4, r6, r3)
            if (r2 == 0) goto L_0x005d
            X.NkZ r1 = X.C69395NkZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r2.getOptionalEnumField(r8, r0, r1)
            X.NkZ r0 = (X.C69395NkZ) r0
            if (r0 == 0) goto L_0x005d
            int r0 = r0.ordinal()
            if (r0 != r7) goto L_0x005d
            X.3lr r1 = r9.getOptionalTreeField(r7, r4, r6, r3)
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "imagine_image_ent"
            java.lang.String r5 = r1.A07(r0)
        L_0x005d:
            return r5
        L_0x005e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            X.0eS.A00(r1)
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 1680(0x690, float:2.354E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Df r4 = X.C41845B3m.A03(r1, r11, r0)
            java.lang.Class<X.CxK> r2 = X.C45484CxK.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r3 = X.C41847B3o.A17(r2, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00bd }
            X.DG7 r3 = (X.DG7) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00bd }
            X.2IS r2 = r3.A00
            java.lang.String r1 = "params"
            X.2IV r0 = r2.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r4, r1)
            r3.A01 = r8
            A05(r2, r10)
            X.1vo r4 = r10.A01
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 30000(0x7530, double:1.4822E-319)
            long r1 = r2.toSeconds(r0)
            int r0 = (int) r1
            X.1Ef r0 = r3.setNetworkTimeoutSeconds(r0)
            r6.A00 = r8
            java.lang.Object r1 = X.C55228HeJ.A00(r4, r0, r6)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x00af:
            r0 = 42
            X.ME5 r6 = new X.ME5
            r6.<init>(r10, r12, r3, r0)
            goto L_0x0016
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bd:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A07(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 48
            boolean r0 = X.ME5.A03(r3, r10)
            if (r0 == 0) goto L_0x008a
            r4 = r10
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r5) goto L_0x00a4
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0092
            X.3lr r4 = X.C41848B3p.A16(r1)
            if (r4 == 0) goto L_0x0051
            java.lang.Class<X.BW4> r3 = X.BW4.class
            r2 = 0
            r0 = 831(0x33f, float:1.164E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 874804770(0x34247622, float:1.5316667E-7)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "has_memu_profile"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            return r6
        L_0x0051:
            r0 = 0
            goto L_0x0048
        L_0x0053:
            X.0eS.A00(r1)
            java.lang.Class<X.CxO> r0 = X.C45488CxO.class
            java.lang.Object r2 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00a9 }
            X.DFl r2 = (X.C45931DFl) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00a9 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "user_id"
            boolean r0 = X.C41848B3p.A1Z(r1, r0, r9)
            r2.A02 = r0
            X.1vo r7 = r8.A01
            X.1Ef r2 = r2.build()
            r0 = 0
            X.1Ef r3 = r2.setMaxToleratedCacheAgeMs(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 30000(0x7530, double:1.4822E-319)
            long r1 = r2.toSeconds(r0)
            int r0 = (int) r1
            X.1Ef r0 = r3.setNetworkTimeoutSeconds(r0)
            r4.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r7, r0, r4)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x008a:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x0092:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009f
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x009f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a9:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A08(java.lang.String, X.4D7):java.lang.Object");
    }

    public ImagineNetworkService(Context context, FoaUserSession foaUserSession, C69416Nky nky) {
        this.A00 = context;
        this.A02 = foaUserSession;
        this.A03 = nky;
        1vn A012 = 1vm.A01(C56316HwT.A00(foaUserSession));
        0qQ.A07(A012);
        this.A01 = A012;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (r7 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.HMY r16, com.meta.metaai.imagine.service.ImagineNetworkService r17, java.lang.Integer r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22, boolean r23) {
        /*
            r14 = r19
            r15 = r20
            r2 = r16
            r4 = 25
            r5 = r22
            boolean r0 = X.C66147MDz.A02(r4, r5)
            r7 = r17
            if (r0 == 0) goto L_0x01a5
            r6 = r5
            X.MDz r6 = (X.C66147MDz) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x01a5
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x0020:
            java.lang.Object r1 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0135
            if (r0 != r3) goto L_0x01fe
            java.lang.Object r2 = r6.A03
            X.HMY r2 = (X.HMY) r2
            java.lang.Object r15 = r6.A02
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r6.A01
            java.lang.String r14 = (java.lang.String) r14
            X.0eS.A00(r1)
        L_0x003a:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01ec
            X.3lr r7 = X.C41848B3p.A16(r1)
            r9 = 0
            if (r7 == 0) goto L_0x012d
            java.lang.Class<X.BVw> r4 = X.C42227BVw.class
            java.lang.String r1 = "xfb_genai_imagine_for_intents(gen_ai_prompt_submission_event_id:$gen_ai_prompt_submission_event_id,params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r0 = 890604726(0x35158cb6, float:5.5711587E-7)
            X.3lr r5 = r7.A04(r4, r1, r0)
            if (r5 == 0) goto L_0x012d
            java.lang.Class<X.BVu> r4 = X.C42225BVu.class
            java.lang.String r1 = "response"
            r0 = -1953284148(0xffffffff8b933fcc, float:-5.671833E-32)
            com.google.common.collect.ImmutableList r0 = r5.A06(r4, r1, r0)
            if (r0 == 0) goto L_0x012d
            java.lang.Object r6 = X.00k.A0J(r0)
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x012e
            java.lang.Class<X.BVt> r4 = X.C42224BVt.class
            r8 = 0
            java.lang.String r1 = "XFBGenAIImagineResultSuccess"
            r0 = -66945801(0xfffffffffc027cf7, float:-2.7101327E36)
            X.3lr r5 = r6.reinterpretIfFulfillsType(r8, r1, r4, r0)
            if (r5 == 0) goto L_0x012e
            java.lang.Class<X.BVs> r4 = X.C42223BVs.class
            java.lang.String r1 = "imagine_result_success"
            r0 = 367438014(0x15e6a8be, float:9.316249E-26)
            X.3lr r0 = r5.getOptionalTreeField(r8, r1, r4, r0)
        L_0x0082:
            java.lang.Class<X.BVr> r5 = X.C42222BVr.class
            java.lang.String r4 = "XFBGenAIImagineResultGenericError"
            r1 = 999512372(0x3b935934, float:0.004496718)
            X.3lr r4 = r6.reinterpretIfFulfillsType(r3, r4, r5, r1)
            if (r0 == 0) goto L_0x0132
            java.lang.String r1 = "uri"
            java.lang.String r12 = r0.A07(r1)
            java.lang.String r1 = "image_id"
            java.lang.String r13 = r0.A09(r1)
            if (r13 != 0) goto L_0x009f
        L_0x009d:
            java.lang.String r13 = ""
        L_0x009f:
            if (r7 == 0) goto L_0x0125
            java.lang.Class<X.BVw> r8 = X.C42227BVw.class
            r6 = 2
            java.lang.String r5 = "xfb_genai_imagine_for_intents(gen_ai_prompt_submission_event_id:$gen_ai_prompt_submission_event_id,params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r1 = 890604726(0x35158cb6, float:5.5711587E-7)
            X.3lr r5 = r7.getOptionalTreeField(r6, r5, r8, r1)
            if (r5 == 0) goto L_0x0125
            java.lang.String r1 = "tracking"
            java.lang.String r19 = r5.getOptionalStringField(r6, r1)
        L_0x00b5:
            java.lang.Class<X.BVw> r6 = X.C42227BVw.class
            java.lang.String r5 = "xfb_genai_imagine_for_intents(gen_ai_prompt_submission_event_id:$gen_ai_prompt_submission_event_id,params:$params,surface:$surface,surface_string_override:$surface_string_override)"
            r1 = 890604726(0x35158cb6, float:5.5711587E-7)
            X.3lr r8 = r7.A04(r6, r5, r1)
            if (r8 == 0) goto L_0x012a
            java.lang.Class<X.BVv> r7 = X.C42226BVv.class
            r6 = 3
            java.lang.String r5 = "user_interactions"
            r1 = -1322737022(0xffffffffb128a282, float:-2.4539593E-9)
            X.3lr r1 = r8.getOptionalTreeField(r6, r5, r7, r1)
            if (r1 == 0) goto L_0x012a
            java.lang.String r20 = X.C41845B3m.A0k(r1)
        L_0x00d4:
            if (r0 == 0) goto L_0x0122
            r5 = 6
            java.lang.String r1 = "is_media_personalized"
            boolean r22 = r0.getCoercedBooleanField(r5, r1)
        L_0x00dd:
            if (r12 == 0) goto L_0x01ba
            java.lang.String r1 = "response_id"
            java.lang.String r17 = r0.getOptionalStringField(r3, r1)
            java.lang.String r1 = "request_id"
            java.lang.String r18 = r0.A0A(r1)
            X.EX8 r4 = X.EX8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 4
            java.lang.String r1 = "media_type"
            java.lang.Enum r5 = r0.getOptionalEnumField(r3, r1, r4)
            X.EX8 r5 = (X.EX8) r5
            java.lang.Integer r10 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A02(r5)
            java.lang.Enum r1 = r0.getOptionalEnumField(r3, r1, r4)
            X.EX8 r1 = (X.EX8) r1
            X.0eP r21 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A04(r2, r1)
            r2 = 5
            java.lang.String r1 = "imagine_type"
            java.lang.String r4 = r0.getOptionalStringField(r2, r1)
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r2)
            int r3 = r2.length
            r1 = 0
        L_0x0111:
            if (r1 >= r3) goto L_0x01ac
            r11 = r2[r1]
            java.lang.String r0 = X.LKT.A00(r11)
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x01ae
            int r1 = r1 + 1
            goto L_0x0111
        L_0x0122:
            r22 = 0
            goto L_0x00dd
        L_0x0125:
            r19 = r9
            if (r7 == 0) goto L_0x012a
            goto L_0x00b5
        L_0x012a:
            r20 = r9
            goto L_0x00d4
        L_0x012d:
            r6 = r9
        L_0x012e:
            r0 = r9
            if (r6 != 0) goto L_0x0082
            r4 = r9
        L_0x0132:
            r12 = r9
            goto L_0x009d
        L_0x0135:
            X.0eS.A00(r1)
            X.QNI r8 = new X.QNI
            r8.<init>()
            java.lang.String r0 = "prompt"
            r8.A07(r14, r0)
            X.C41848B3p.A1N(r8)
            int r1 = r2.ordinal()
            if (r1 == r3) goto L_0x016c
            r0 = 0
            if (r1 != r0) goto L_0x0209
            java.lang.String r1 = "VERTICAL"
        L_0x0150:
            java.lang.String r0 = "orientation"
            r8.A07(r1, r0)
            java.lang.String r1 = X.LKT.A00(r18)
            java.lang.String r0 = "intent"
            r8.A07(r1, r0)
            if (r23 != 0) goto L_0x016f
            java.lang.String r0 = "memu"
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "blocked_intents"
            r8.A05(r0, r1)
            goto L_0x016f
        L_0x016c:
            java.lang.String r1 = "SQUARE"
            goto L_0x0150
        L_0x016f:
            java.lang.Class<X.CxN> r4 = X.C45487CxN.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r4 = X.C41847B3o.A17(r4, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0203 }
            X.DGA r4 = (X.DGA) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0203 }
            X.2IS r1 = r4.A00
            java.lang.String r0 = "params"
            r1.A00(r8, r0)
            r4.A01 = r3
            A05(r1, r7)
            java.lang.String r0 = "gen_ai_prompt_submission_event_id"
            r8 = r21
            r1.A04(r0, r8)
            X.1vo r1 = r7.A01
            com.facebook.pando.PandoGraphQLRequest r0 = r4.build()
            X.0qQ.A07(r0)
            r6.A01 = r14
            r6.A02 = r15
            r6.A03 = r2
            r6.A00 = r3
            java.lang.Object r1 = X.C55228HeJ.A00(r1, r0, r6)
            if (r1 != r5) goto L_0x003a
            return r5
        L_0x01a5:
            X.MDz r6 = new X.MDz
            r6.<init>(r7, r5, r4)
            goto L_0x0020
        L_0x01ac:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x01ae:
            X.HtY r8 = new X.HtY
            r16 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.3Ih r5 = X.C41845B3m.A0d(r8)
            return r5
        L_0x01ba:
            if (r4 == 0) goto L_0x01d5
            X.XRP r2 = X.XRP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "error_type"
            java.lang.Enum r1 = r4.getOptionalEnumField(r1, r0, r2)
        L_0x01c5:
            X.XRP r0 = X.XRP.MEMU_NO_PROFILE
            if (r1 != r0) goto L_0x01d7
            java.lang.String r0 = "message"
            java.lang.String r1 = r4.A07(r0)
            X.CTd r0 = new X.CTd
            r0.<init>(r1)
            goto L_0x01f4
        L_0x01d5:
            r1 = r9
            goto L_0x01c5
        L_0x01d7:
            if (r4 == 0) goto L_0x01e6
            java.lang.String r0 = "user_visible_message"
            java.lang.String r9 = r4.A0B(r0)
            r1 = 3
            java.lang.String r0 = "allow_retry"
            boolean r3 = r4.getCoercedBooleanField(r1, r0)
        L_0x01e6:
            X.HIf r0 = new X.HIf
            r0.<init>(r9, r3)
            goto L_0x01f4
        L_0x01ec:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f9
            X.HQf r0 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A01(r1)
        L_0x01f4:
            X.5sO r5 = X.C41845B3m.A0c(r0)
            return r5
        L_0x01f9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0203:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0209:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkService.A02(X.HMY, com.meta.metaai.imagine.service.ImagineNetworkService, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }
}
