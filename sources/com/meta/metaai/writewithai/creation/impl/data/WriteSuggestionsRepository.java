package com.meta.metaai.writewithai.creation.impl.data;

import X.0Cp;
import X.0Df;
import X.C56568I1x;
import X.C56661I6q;
import X.I3J;
import android.app.Application;
import com.facebook.proxygen.TraceFieldType;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.service.WriteWithAINetworkService;
import java.util.concurrent.TimeUnit;

public final class WriteSuggestionsRepository {
    public final Application A00;
    public final 0Cp A01 = new 0Cp(TimeUnit.MINUTES, 100);
    public final FoaUserSession A02;
    public final C56661I6q A03;
    public final WriteWithAINetworkService A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r15, X.C56568I1x r16, X.AnonymousClass4D7 r17) {
        /*
            r9 = r15
            r0 = r16
            r5 = 16
            r6 = r17
            boolean r1 = X.ME1.A02(r5, r6)
            if (r1 == 0) goto L_0x00f8
            r4 = r6
            X.ME1 r4 = (X.ME1) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00f8
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001b:
            java.lang.Object r1 = r4.A06
            X.1Hj r3 = X.1Hj.A02
            int r7 = r4.A00
            java.lang.String r2 = ""
            r6 = 3
            r5 = 2
            r8 = 1
            r11 = 0
            if (r7 == 0) goto L_0x006b
            if (r7 == r8) goto L_0x00ae
            if (r7 == r5) goto L_0x005f
            if (r7 != r6) goto L_0x00ff
            java.lang.Object r5 = r4.A03
            X.JMY r5 = (X.JMY) r5
            java.lang.Object r0 = r4.A02
            X.I1x r0 = (X.C56568I1x) r0
            java.lang.Object r9 = r4.A01
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r9 = (com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository) r9
            X.0eS.A00(r1)
        L_0x003e:
            java.lang.String r1 = (java.lang.String) r1
        L_0x0040:
            if (r1 == 0) goto L_0x005e
            X.IdM r5 = (X.C57595IdM) r5
            java.lang.String r4 = r5.A00
            X.0Cp r3 = r9.A01
            r3.A01(r4, r1)
            X.IdM r3 = new X.IdM
            r3.<init>(r1, r2)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.HtJ r2 = new X.HtJ
            r5 = r11
            r6 = r11
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            X.I1x r11 = X.C56568I1x.A00(r2, r0)
        L_0x005e:
            return r11
        L_0x005f:
            X.0eS.A00(r1)
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "getComposerType"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x006b:
            X.0eS.A00(r1)
            X.HtJ r1 = r0.A02
            X.JMY r5 = r1.A00
            boolean r1 = r5 instanceof X.C57594IdL
            if (r1 == 0) goto L_0x00cb
            X.IdL r5 = (X.C57594IdL) r5
            java.util.List r1 = r5.A00
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r7 = r1.iterator()
            r6 = r5
        L_0x0083:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0104
            java.lang.String r15 = X.AnonymousClass7TE.A18(r7)
            X.KjI r13 = X.C62637KjI.A0L
            r4.A01 = r9
            r4.A02 = r0
            r4.A03 = r5
            r4.A04 = r7
            r4.A05 = r5
            r4.A00 = r8
            X.4CZ r1 = X.AnonymousClass12W.A01
            r17 = 40
            X.MGk r12 = new X.MGk
            r14 = r9
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r1 = X.1Eo.A00(r4, r1, r12)
            if (r1 != r3) goto L_0x00c3
            return r3
        L_0x00ae:
            java.lang.Object r6 = r4.A05
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r4.A04
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r5 = r4.A03
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r0 = r4.A02
            X.I1x r0 = (X.C56568I1x) r0
            java.lang.Object r9 = r4.A01
            X.0eS.A00(r1)
        L_0x00c3:
            if (r1 != 0) goto L_0x00c6
            r1 = r2
        L_0x00c6:
            r6.add(r1)
            r6 = r5
            goto L_0x0083
        L_0x00cb:
            boolean r1 = r5 instanceof X.C57595IdM
            if (r1 == 0) goto L_0x005e
            r1 = r5
            X.IdM r1 = (X.C57595IdM) r1
            java.lang.String r10 = r1.A00
            X.0Cp r1 = r15.A01
            java.lang.Object r1 = r1.A00(r10)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0040
            X.KjI r8 = X.C62637KjI.A0g
            r4.A01 = r15
            r4.A02 = r0
            r4.A03 = r5
            r4.A00 = r6
            X.4CZ r1 = X.AnonymousClass12W.A01
            r12 = 41
            X.MGk r7 = new X.MGk
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r1 = X.1Eo.A00(r4, r1, r7)
            if (r1 != r3) goto L_0x003e
            return r3
        L_0x00f8:
            X.ME1 r4 = new X.ME1
            r4.<init>(r15, r6, r5)
            goto L_0x001b
        L_0x00ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0104:
            java.util.List r6 = (java.util.List) r6
            X.IdL r2 = new X.IdL
            r2.<init>(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.HtJ r1 = new X.HtJ
            r4 = r11
            r5 = r11
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            X.I1x r11 = X.C56568I1x.A00(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository.A01(com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository, X.I1x, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C56568I1x r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r8 = 0
            r10 = 0
            r4 = 35
            boolean r0 = X.ME0.A02(r4, r13)
            if (r0 == 0) goto L_0x0066
            r3 = r13
            X.ME0 r3 = (X.ME0) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r7 = r3.A05
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r9 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r9) goto L_0x00ec
            java.lang.Object r10 = r3.A04
            java.lang.Object r8 = r3.A03
            java.lang.Object r12 = r3.A02
            X.I1x r12 = (X.C56568I1x) r12
            java.lang.Object r5 = r3.A01
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r5 = (com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository) r5
            X.0eS.A00(r7)
        L_0x0032:
            com.meta.metaai.writewithai.service.WriteWithAINetworkService r4 = r5.A04
            boolean r6 = X.DbW.A1S(r9, r12, r8)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            X.HtJ r0 = r12.A02
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "initial_content"
            X.0Df r3 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.Object r1 = A00(r3, r12, r8, r10, r10)
            java.lang.String r0 = "user_selected_prompt"
            X.0Df.A00(r3, r1, r0)
            X.1vo r8 = r4.A01
            goto L_0x006c
        L_0x0050:
            X.0eS.A00(r7)
            r3.A01 = r11
            r3.A02 = r12
            r3.A03 = r8
            r3.A04 = r8
            r3.A00 = r9
            java.lang.Object r7 = A01(r11, r12, r3)
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r5 = r11
            goto L_0x0032
        L_0x0066:
            X.ME0 r3 = new X.ME0
            r3.<init>(r11, r13, r4)
            goto L_0x0018
        L_0x006c:
            java.lang.Class<X.HuG> r2 = X.C56187HuG.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            java.lang.Object r2 = r1.invoke(r4, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            X.IIA r2 = (X.IIA) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e5 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            X.DbW.A18(r3, r1, r0)
            r2.A01 = r9
            com.facebook.pando.PandoGraphQLRequest r2 = r2.build()
            r0 = 0
            X.1Ef r1 = r2.setMaxToleratedCacheAgeMs(r0)
            r3 = 42
            X.MHK r0 = new X.MHK
            r0.<init>(r8, r1, r4, r3)
            X.032 r1 = X.AnonymousClass0Zq.A00(r0)
            r0 = 4
            X.IkK r2 = new X.IkK
            r2.<init>(r1, r0)
            r1 = 47
            X.MHj r0 = new X.MHj
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r1, (int) r3)
            X.0rj r1 = new X.0rj
            r1.<init>(r0, r2)
            r0 = 3
            X.IkM r3 = new X.IkM
            r3.<init>(r0, r7, r1, r12)
            r1 = 8
            X.ImE r0 = new X.ImE
            r0.<init>(r5, r4, r1)
            X.0rn r2 = new X.0rn
            r2.<init>(r0, r3)
            r1 = 9
            X.ImE r0 = new X.ImE
            r0.<init>(r5, r4, r1)
            X.0fv r3 = new X.0fv
            r3.<init>(r0, r2, r6)
            r1 = 19
            X.MHh r0 = new X.MHh
            r0.<init>(r5, r4, r1)
            X.0ro r2 = new X.0ro
            r2.<init>(r0, r3)
            r0 = 26
            X.ImP r1 = X.C58103ImP.A01(r5, r4, r0)
            X.0pz r0 = new X.0pz
            r0.<init>(r1, r2)
            return r0
        L_0x00e5:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository.A04(X.I1x, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r7 = 0
            r9 = 0
            r11 = 0
            r4 = 36
            boolean r0 = X.ME0.A02(r4, r13)
            if (r0 == 0) goto L_0x0067
            r3 = r13
            X.ME0 r3 = (X.ME0) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r8 = r3.A05
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r10 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r10) goto L_0x00ed
            java.lang.Object r11 = r3.A04
            java.lang.Object r9 = r3.A03
            java.lang.Object r7 = r3.A02
            X.I1x r7 = (X.C56568I1x) r7
            java.lang.Object r5 = r3.A01
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r5 = (com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository) r5
            X.0eS.A00(r8)
        L_0x0033:
            com.meta.metaai.writewithai.service.WriteWithAINetworkService r4 = r5.A04
            boolean r6 = X.DbW.A1S(r10, r7, r9)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            X.HtJ r0 = r7.A02
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "initial_content"
            X.0Df r3 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.Object r1 = A00(r3, r7, r9, r11, r11)
            java.lang.String r0 = "user_selected_prompt"
            X.0Df.A00(r3, r1, r0)
            X.1vo r9 = r4.A01
            goto L_0x006d
        L_0x0051:
            X.0eS.A00(r8)
            r3.A01 = r12
            r3.A02 = r7
            r3.A03 = r7
            r3.A04 = r7
            r3.A00 = r10
            java.lang.Object r8 = A01(r12, r7, r3)
            if (r8 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r5 = r12
            goto L_0x0033
        L_0x0067:
            X.ME0 r3 = new X.ME0
            r3.<init>(r12, r13, r4)
            goto L_0x0019
        L_0x006d:
            java.lang.Class<X.HuH> r2 = X.C56188HuH.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            java.lang.Object r2 = r1.invoke(r4, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            X.IIB r2 = (X.IIB) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00e6 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            X.DbW.A18(r3, r1, r0)
            r2.A01 = r10
            com.facebook.pando.PandoGraphQLRequest r2 = r2.build()
            r0 = 0
            X.1Ef r1 = r2.setMaxToleratedCacheAgeMs(r0)
            r3 = 42
            X.MHK r0 = new X.MHK
            r0.<init>(r9, r1, r4, r3)
            X.032 r1 = X.AnonymousClass0Zq.A00(r0)
            r0 = 5
            X.IkK r2 = new X.IkK
            r2.<init>(r1, r0)
            r1 = 48
            X.MHj r0 = new X.MHj
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r1, (int) r3)
            X.0rj r1 = new X.0rj
            r1.<init>(r0, r2)
            r0 = 4
            X.IkM r3 = new X.IkM
            r3.<init>(r0, r8, r1, r7)
            r1 = 10
            X.ImE r0 = new X.ImE
            r0.<init>(r5, r4, r1)
            X.0rn r2 = new X.0rn
            r2.<init>(r0, r3)
            r1 = 11
            X.ImE r0 = new X.ImE
            r0.<init>(r5, r4, r1)
            X.0fv r3 = new X.0fv
            r3.<init>(r0, r2, r6)
            r1 = 20
            X.MHh r0 = new X.MHh
            r0.<init>(r5, r4, r1)
            X.0ro r2 = new X.0ro
            r2.<init>(r0, r3)
            r0 = 27
            X.ImP r1 = X.C58103ImP.A01(r5, r4, r0)
            X.0pz r0 = new X.0pz
            r0.<init>(r1, r2)
            return r0
        L_0x00e6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository.A05(X.4D7):java.lang.Object");
    }

    public /* synthetic */ WriteSuggestionsRepository(Application application, FoaUserSession foaUserSession, C56661I6q i6q) {
        WriteWithAINetworkService writeWithAINetworkService = new WriteWithAINetworkService(application, foaUserSession);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A03 = i6q;
        this.A04 = writeWithAINetworkService;
    }

    public static Object A00(0Df r2, C56568I1x i1x, Object obj, Object obj2, Object obj3) {
        0Df.A00(r2, Integer.valueOf(i1x.A00), "output_quantity");
        0Df.A00(r2, obj, TraceFieldType.RequestID);
        0Df.A00(r2, i1x.A07, "surface_session_id");
        0Df.A00(r2, I3J.A01(i1x.A05), "target_surface");
        if (obj2 == null) {
            return "";
        }
        return obj3;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0165, code lost:
        if (r8 != r11) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C56568I1x r19, java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r18 = this;
            r4 = r19
            r5 = r20
            r6 = r21
            r3 = 34
            r7 = r22
            boolean r0 = X.ME0.A02(r3, r7)
            r10 = r18
            if (r0 == 0) goto L_0x0168
            r9 = r7
            X.ME0 r9 = (X.ME0) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0168
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0020:
            java.lang.Object r8 = r9.A05
            X.1Hj r11 = X.1Hj.A02
            int r1 = r9.A00
            r7 = 2
            r0 = 1
            r15 = 0
            if (r1 == 0) goto L_0x0122
            if (r1 == r0) goto L_0x0137
            if (r1 != r7) goto L_0x01e7
            java.lang.Object r3 = r9.A02
            X.I1x r3 = (X.C56568I1x) r3
            java.lang.Object r2 = r9.A01
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r2 = (com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository) r2
            X.0eS.A00(r8)
        L_0x003a:
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r1 = r8 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x016f
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r6 = r8.A00
            X.3lr r6 = (X.C250663lr) r6
            java.lang.Class<X.BWc> r5 = X.C42233BWc.class
            r1 = 4264(0x10a8, float:5.975E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            r1 = -854904454(0xffffffffcd0b317a, float:-1.4595472E8)
            X.3lr r4 = r6.A03(r5, r4, r1)
            if (r4 == 0) goto L_0x011f
            java.lang.Class<X.BWb> r8 = X.C42232BWb.class
            r6 = 6
            r1 = 4173(0x104d, float:5.848E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r1)
            r1 = 637637488(0x26019370, float:4.495568E-16)
            X.3lr r5 = r4.getOptionalTreeField(r6, r5, r8, r1)
            if (r5 == 0) goto L_0x011f
            java.lang.String r1 = "strong_id__"
            java.lang.String r8 = r5.A07(r1)
        L_0x006f:
            X.I6q r11 = r2.A03
            if (r4 == 0) goto L_0x0178
            java.lang.String r14 = "query_end"
            X.C56661I6q.A02(r11, r14)
            java.lang.String r13 = "metagen_request_id"
            java.lang.String r1 = r4.A0A(r13)
            java.lang.String r12 = "unknown"
            if (r1 != 0) goto L_0x0083
            r1 = r12
        L_0x0083:
            java.lang.String r9 = "request_id"
            X.C56661I6q.A04(r11, r9, r1)
            java.lang.String r6 = "metagen_response_id"
            java.lang.String r1 = r4.A0B(r6)
            if (r1 != 0) goto L_0x0091
            r1 = r12
        L_0x0091:
            java.lang.String r5 = "response_id"
            X.C56661I6q.A04(r11, r5, r1)
            java.lang.String r2 = "query_first_chunk_received"
            X.C56661I6q.A02(r11, r2)
            java.lang.String r10 = "error_message"
            java.lang.String r1 = r4.getOptionalStringField(r0, r10)
            if (r1 == 0) goto L_0x00af
            X.C56661I6q.A04(r11, r10, r1)
            X.C56661I6q.A00(r11)
            X.C56661I6q.A05(r11, r10, r1)
            X.C56661I6q.A01(r11)
        L_0x00af:
            X.C56661I6q.A03(r11, r14)
            java.lang.String r1 = r4.A0A(r13)
            if (r1 != 0) goto L_0x00b9
            r1 = r12
        L_0x00b9:
            X.C56661I6q.A05(r11, r9, r1)
            java.lang.String r1 = r4.A0B(r6)
            if (r1 == 0) goto L_0x00c3
            r12 = r1
        L_0x00c3:
            X.C56661I6q.A05(r11, r5, r12)
            X.C56661I6q.A03(r11, r2)
            java.lang.Class<X.BWa> r9 = X.C42231BWa.class
            r6 = 0
            java.lang.String r5 = "response"
            r2 = -2063036060(0xffffffff85089164, float:-6.421393E-36)
            X.3lr r12 = r4.getOptionalTreeField(r6, r5, r9, r2)
            if (r12 == 0) goto L_0x00e5
            java.lang.String r1 = "suggestions"
            com.google.common.collect.ImmutableList r1 = r12.getRequiredCompactedStringListField(r6, r1)
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00f3
        L_0x00e5:
            java.lang.String r1 = "empty_response"
            X.C56661I6q.A04(r11, r10, r1)
            X.C56661I6q.A05(r11, r10, r1)
            X.C56661I6q.A00(r11)
            X.C56661I6q.A01(r11)
        L_0x00f3:
            X.3lr r2 = r4.getOptionalTreeField(r6, r5, r9, r2)
            if (r2 == 0) goto L_0x0178
            java.lang.String r1 = "suggestions"
            com.google.common.collect.ImmutableList r1 = r2.getRequiredCompactedStringListField(r6, r1)
            if (r1 == 0) goto L_0x0178
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x0109:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01be
            java.lang.String r5 = X.AnonymousClass7TE.A18(r6)
            X.0qQ.A0A(r5)
            X.Hsk r1 = new X.Hsk
            r1.<init>(r5, r8)
            r2.add(r1)
            goto L_0x0109
        L_0x011f:
            r8 = r15
            goto L_0x006f
        L_0x0122:
            X.0eS.A00(r8)
            r9.A01 = r10
            r9.A02 = r4
            r9.A03 = r5
            r9.A04 = r6
            r9.A00 = r0
            java.lang.Object r8 = A01(r10, r4, r9)
            if (r8 == r11) goto L_0x0167
            r2 = r10
            goto L_0x014a
        L_0x0137:
            java.lang.Object r6 = r9.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r9.A03
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r9.A02
            X.I1x r4 = (X.C56568I1x) r4
            java.lang.Object r2 = r9.A01
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r2 = (com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository) r2
            X.0eS.A00(r8)
        L_0x014a:
            r3 = r8
            X.I1x r3 = (X.C56568I1x) r3
            X.I6q r1 = r2.A03
            r1.A06()
            com.meta.metaai.writewithai.service.WriteWithAINetworkService r1 = r2.A04
            if (r3 == 0) goto L_0x0157
            r4 = r3
        L_0x0157:
            r9.A01 = r2
            r9.A02 = r3
            r9.A03 = r15
            r9.A04 = r15
            r9.A00 = r7
            java.lang.Object r8 = r1.A01(r4, r5, r6, r9)
            if (r8 != r11) goto L_0x003a
        L_0x0167:
            return r11
        L_0x0168:
            X.ME0 r9 = new X.ME0
            r9.<init>(r10, r7, r3)
            goto L_0x0020
        L_0x016f:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01af
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0178:
            X.0sn r2 = X.0sn.A00
            if (r4 != 0) goto L_0x01be
            r1 = r15
        L_0x017d:
            X.I1f r11 = new X.I1f
            r11.<init>(r1, r0)
            if (r4 == 0) goto L_0x01ba
            java.lang.String r0 = "metagen_request_id"
            java.lang.String r12 = r4.A0A(r0)
            java.lang.String r0 = "metagen_response_id"
            java.lang.String r13 = r4.A0B(r0)
            java.lang.String r0 = "tracking"
            java.lang.String r14 = r4.A0C(r0)
        L_0x0196:
            if (r3 == 0) goto L_0x01b8
            X.HtJ r0 = r3.A02
            X.JMY r1 = r0.A00
        L_0x019c:
            boolean r0 = r1 instanceof X.C57595IdM
            if (r0 == 0) goto L_0x01a4
            X.IdM r1 = (X.C57595IdM) r1
            java.lang.String r15 = r1.A00
        L_0x01a4:
            X.I1r r10 = new X.I1r
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.3Ih r8 = X.C41845B3m.A0d(r10)
        L_0x01af:
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01cb
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r11 = r8.A00
            return r11
        L_0x01b8:
            r1 = r15
            goto L_0x019c
        L_0x01ba:
            r12 = r15
            r13 = r15
            r14 = r15
            goto L_0x0196
        L_0x01be:
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r4.getOptionalStringField(r0, r1)
            java.lang.String r0 = "can_retry"
            boolean r0 = r4.getCoercedBooleanField(r7, r0)
            goto L_0x017d
        L_0x01cb:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01e2
            r13 = 0
            X.0sn r17 = X.0sn.A00
            r0 = 1
            X.I1f r12 = new X.I1f
            r12.<init>(r13, r0)
            X.I1r r11 = new X.I1r
            r14 = r13
            r15 = r13
            r16 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L_0x01e2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository.A02(X.I1x, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C56568I1x r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r4 = 8
            boolean r0 = X.C58075Il7.A02(r4, r9)
            if (r0 == 0) goto L_0x008c
            r3 = r9
            X.Il7 r3 = (X.C58075Il7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 != r4) goto L_0x00c0
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0094
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r5 = r2.A00
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.BWw> r3 = X.C42253BWw.class
            r2 = 2
            r0 = 4271(0x10af, float:5.985E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1806813829(0xffffffff944e357b, float:-1.0410889E-26)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r2, r1, r3, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r5.next()
            X.3lr r2 = (X.C250663lr) r2
            r0 = 355(0x163, float:4.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r2.getOptionalStringField(r4, r0)
            java.lang.String r1 = ""
            if (r3 != 0) goto L_0x0066
            r3 = r1
        L_0x0066:
            r0 = 3748(0xea4, float:5.252E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r2.A07(r0)
            if (r2 != 0) goto L_0x0073
            r2 = r1
        L_0x0073:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Ht1 r0 = new X.Ht1
            r0.<init>(r3, r1, r2)
            r6.add(r0)
            goto L_0x004b
        L_0x007e:
            X.0eS.A00(r2)
            com.meta.metaai.writewithai.service.WriteWithAINetworkService r0 = r7.A04
            r3.A00 = r4
            java.lang.Object r2 = r0.A02(r8, r3)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x008c:
            r0 = 42
            X.Il7 r3 = new X.Il7
            r3.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r9, (int) r4, (int) r0)
            goto L_0x0016
        L_0x0094:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009d:
            X.I1a r0 = new X.I1a
            r0.<init>(r6)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x00a6:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00af
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            return r1
        L_0x00af:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bb
            X.0sn r0 = X.0sn.A00
            X.I1a r1 = new X.I1a
            r1.<init>(r0)
            return r1
        L_0x00bb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository.A03(X.I1x, X.4D7):java.lang.Object");
    }
}
