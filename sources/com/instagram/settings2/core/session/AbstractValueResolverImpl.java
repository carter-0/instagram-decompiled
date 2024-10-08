package com.instagram.settings2.core.session;

import X.C51972G9s;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class AbstractValueResolverImpl {
    public final SettingsRepository A00;
    public final String A01;
    public final UserSession A02;
    public final Map A03;
    public final ReentrantReadWriteLock A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.0ry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.0ry} */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C61079JwH r9, X.AnonymousClass4D7 r10, X.0Yh r11) {
        /*
            r8 = this;
            r4 = 36
            boolean r0 = X.ME9.A03(r4, r10)
            if (r0 == 0) goto L_0x008b
            r2 = r10
            X.ME9 r2 = (X.ME9) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x008b
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r4 = r2.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r6) goto L_0x00b6
            if (r0 == r7) goto L_0x0095
            if (r0 != r5) goto L_0x0090
            java.lang.Object r11 = r2.A02
            X.0ry r11 = (X.C62230ry) r11
            java.lang.Object r9 = r2.A01
            X.0eS.A00(r4)
        L_0x0030:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00db
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x003f:
            X.0eS.A00(r4)
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = X.JTQ.A1V(r0, r11)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage<kotlin.String>"
            if (r0 == 0) goto L_0x005b
            com.instagram.settings2.core.data.SettingsRepository r0 = r8.A00
            X.0qQ.A0C(r9, r1)
            X.ME9.A01(r9, r11, r2, r6)
            java.lang.Object r4 = r0.A07(r9, r2)
            if (r4 != r3) goto L_0x00bf
            return r3
        L_0x005b:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.JTQ.A1V(r0, r11)
            if (r0 == 0) goto L_0x0072
            com.instagram.settings2.core.data.SettingsRepository r0 = r8.A00
            X.0qQ.A0C(r9, r1)
            X.ME9.A01(r9, r11, r2, r7)
            java.lang.Object r4 = r0.A07(r9, r2)
            if (r4 != r3) goto L_0x009e
            return r3
        L_0x0072:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1V(r0, r11)
            if (r0 == 0) goto L_0x0132
            com.instagram.settings2.core.data.SettingsRepository r1 = r8.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage<kotlin.Boolean>"
            X.0qQ.A0C(r9, r0)
            X.ME9.A01(r9, r11, r2, r5)
            java.lang.Object r4 = r1.A05(r9, r2)
            if (r4 != r3) goto L_0x0030
            return r3
        L_0x008b:
            X.ME9 r2 = X.ME9.A00(r8, r10, r4)
            goto L_0x0016
        L_0x0090:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0095:
            java.lang.Object r11 = r2.A02
            X.0ry r11 = (X.C62230ry) r11
            java.lang.Object r9 = r2.A01
            X.0eS.A00(r4)
        L_0x009e:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00db
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x00ad:
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r0 = r0.A00
            goto L_0x00d7
        L_0x00b6:
            java.lang.Object r11 = r2.A02
            X.0ry r11 = (X.C62230ry) r11
            java.lang.Object r9 = r2.A01
            X.0eS.A00(r4)
        L_0x00bf:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00fa
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = X.JTO.A0w(r0)
        L_0x00d7:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x00db:
            boolean r0 = r4 instanceof X.C297815sO
            java.lang.String r2 = ", from "
            if (r0 != 0) goto L_0x011e
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0119
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r1 = r4.A00
            r0 = r11
            X.0Yh r0 = (X.0Yh) r0
            java.lang.Class r0 = r0.A00
            boolean r0 = X.0q1.A02(r0, r1)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "null cannot be cast to non-null type T of com.instagram.settings2.core.session.AbstractValueResolverImpl.setting"
            X.0qQ.A0C(r1, r0)
            return r1
        L_0x00fa:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00db
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0103:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r1)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = ", is not instance of "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r11, r0, r1)
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>(r0)
            throw r1
        L_0x0119:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r9, r2, r1)
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        L_0x0132:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r11)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.AbstractValueResolverImpl.A00(X.JwH, X.4D7, X.0ry):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C64185LSs r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 35
            boolean r0 = X.ME9.A03(r3, r7)
            if (r0 == 0) goto L_0x006c
            r4 = r7
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 != r1) goto L_0x0071
            java.lang.Object r2 = r4.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r2 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r2
            java.lang.Object r6 = r4.A01
            X.LSs r6 = (X.C64185LSs) r6
            X.0eS.A00(r3)
        L_0x002c:
            if (r3 != 0) goto L_0x0030
            X.LLn r3 = X.C64069LLn.A00
        L_0x0030:
            X.MQz r1 = r6.A06()
            X.Lx3 r0 = X.C65626Lx3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0041
            java.util.Map r0 = r2.A03
            r0.put(r6, r3)
        L_0x0041:
            X.LLn r0 = X.C64069LLn.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x004a
            r3 = 0
        L_0x004a:
            return r3
        L_0x004b:
            X.0eS.A00(r3)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A04
            boolean r0 = r0.isWriteLocked()
            if (r0 == 0) goto L_0x0076
            java.util.Map r0 = r5.A03
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L_0x0041
            com.instagram.common.session.UserSession r0 = r5.A02
            X.ME9.A01(r6, r5, r4, r1)
            java.lang.Object r3 = r6.A07(r0, r5, r4)
            if (r3 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r2 = r5
            goto L_0x002c
        L_0x006c:
            X.ME9 r4 = X.ME9.A00(r5, r7, r3)
            goto L_0x0016
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0076:
            java.lang.String r0 = "This method must be called within a write lock"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.AbstractValueResolverImpl.A01(X.LSs, X.4D7):java.lang.Object");
    }

    public AbstractValueResolverImpl(UserSession userSession, SettingsRepository settingsRepository, String str, Map map, ReentrantReadWriteLock reentrantReadWriteLock) {
        C51972G9s.A1B(map, settingsRepository);
        this.A03 = map;
        this.A04 = reentrantReadWriteLock;
        this.A02 = userSession;
        this.A00 = settingsRepository;
        this.A01 = str;
    }
}
