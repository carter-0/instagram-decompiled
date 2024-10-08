package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.TpS  reason: case insensitive filesystem */
public final class C14078TpS {
    public AutoplayLayout A00;
    public final X6I A01;
    public final X6I A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C51801G2k(this, 21));
    public final X6I A04;
    public final UserSession A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.instagram.autoplay.models.AutoplayConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.autoplay.models.AutoplayConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.instagram.autoplay.models.AutoplayConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.instagram.autoplay.models.AutoplayConfiguration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C14078TpS r6, com.instagram.autoplay.models.AutoplayConfigRoot r7) {
        /*
            java.util.List r0 = r7.autoplayConfigurations     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x0006:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0051 }
            r5 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x0051 }
            r0 = r3
            com.instagram.autoplay.models.AutoplayConfiguration r0 = (com.instagram.autoplay.models.AutoplayConfiguration) r0     // Catch:{ Exception -> 0x0051 }
            com.instagram.autoplay.models.AutoplayLayout r2 = r0.layout     // Catch:{ Exception -> 0x0051 }
            com.instagram.autoplay.models.AutoplayLayout r1 = r6.A00     // Catch:{ Exception -> 0x0051 }
            r0 = 0
            if (r2 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0006
            goto L_0x0020
        L_0x001f:
            r3 = r5
        L_0x0020:
            com.instagram.autoplay.models.AutoplayConfiguration r3 = (com.instagram.autoplay.models.AutoplayConfiguration) r3     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x0029
            java.util.List r0 = r3.autoplayCustomizations     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            java.util.List r0 = r7.autoplayConfigurations     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002f:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x0051 }
            r0 = r3
            com.instagram.autoplay.models.AutoplayConfiguration r0 = (com.instagram.autoplay.models.AutoplayConfiguration) r0     // Catch:{ Exception -> 0x0051 }
            com.instagram.autoplay.models.AutoplayLayout r2 = r0.layout     // Catch:{ Exception -> 0x0051 }
            com.instagram.autoplay.models.AutoplayLayout r1 = com.instagram.autoplay.models.AutoplayLayout.UNKNOWN     // Catch:{ Exception -> 0x0051 }
            r0 = 0
            if (r2 != r1) goto L_0x0044
            r0 = 1
        L_0x0044:
            if (r0 == 0) goto L_0x002f
            r5 = r3
        L_0x0047:
            com.instagram.autoplay.models.AutoplayConfiguration r5 = (com.instagram.autoplay.models.AutoplayConfiguration) r5     // Catch:{ Exception -> 0x0051 }
            if (r5 == 0) goto L_0x004e
            java.util.List r0 = r5.autoplayCustomizations     // Catch:{ Exception -> 0x0051 }
            return r0
        L_0x004e:
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x0051 }
            return r0
        L_0x0051:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "failed to get customizations: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AutoplayLoggingService"
            X.0KC.A0C(r0, r1)
            X.0eM r0 = r6.A03
            java.lang.Object r2 = r0.getValue()
            X.0fA r2 = (X.0fA) r2
            r1 = 126117213(0x784655d, float:1.9920729E-34)
            java.lang.String r0 = "getCustomizationsFail"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.ERJ(r3)
            r0.report()
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14078TpS.A00(X.TpS, com.instagram.autoplay.models.AutoplayConfigRoot):java.util.List");
    }

    public final AutoplayConfigRoot A01() {
        AutoplayConfigRoot Atw;
        AutoplayConfigRoot Atw2;
        X6I x6i = this.A02;
        if (x6i.BAr() && (Atw2 = x6i.Atw()) != null) {
            return Atw2;
        }
        X6I x6i2 = this.A01;
        if (x6i2.BAr() && (Atw = x6i2.Atw()) != null && (!A00(this, Atw).isEmpty())) {
            return Atw;
        }
        X6I x6i3 = this.A04;
        if (x6i3.Atw() != null) {
            AutoplayConfigRoot Atw3 = x6i3.Atw();
            0qQ.A0A(Atw3);
            return Atw3;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public C14078TpS(X6I x6i, X6I x6i2, X6I x6i3, AutoplayLayout autoplayLayout, UserSession userSession) {
        this.A05 = userSession;
        this.A04 = x6i;
        this.A01 = x6i2;
        this.A02 = x6i3;
        this.A00 = autoplayLayout;
    }
}
