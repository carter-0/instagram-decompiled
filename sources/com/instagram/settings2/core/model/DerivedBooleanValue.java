package com.instagram.settings2.core.model;

import X.0sn;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21249XQu;
import X.C64185LSs;
import X.C65624Lx1;
import X.C66419MQz;
import java.util.List;

public final class DerivedBooleanValue extends C64185LSs {
    public final C21249XQu A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DerivedBooleanValue) && this.A00 == ((DerivedBooleanValue) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final C66419MQz A05() {
        return C65624Lx1.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        r3 = X.C41845B3m.A0d(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 47
            boolean r0 = X.C66138MDq.A02(r3, r8)
            if (r0 == 0) goto L_0x00d2
            r4 = r8
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d2
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0106
            java.lang.Object r2 = r4.A01
            com.instagram.settings2.core.model.DerivedBooleanValue r2 = (com.instagram.settings2.core.model.DerivedBooleanValue) r2
            X.0eS.A00(r3)
        L_0x0026:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d9
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0031:
            X.0eS.A00(r3)
            X.XQu r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r1
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0050;
                case 2: goto L_0x0046;
                case 3: goto L_0x0092;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00b9;
                case 6: goto L_0x0059;
                case 7: goto L_0x006b;
                case 8: goto L_0x0097;
                case 9: goto L_0x00ae;
                case 10: goto L_0x0085;
                case 11: goto L_0x0062;
                default: goto L_0x0041;
            }
        L_0x0041:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            goto L_0x00cf
        L_0x0050:
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            boolean r0 = r0.A1p()
            goto L_0x00c7
        L_0x0059:
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            boolean r0 = r0.A1k()
            goto L_0x00c7
        L_0x0062:
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            boolean r0 = r0.isVerified()
            goto L_0x00c7
        L_0x006b:
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            java.lang.Boolean r0 = r0.A0K()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            goto L_0x00c7
        L_0x0078:
            X.4Cl r0 = X.DbV.A0k(r6)
            java.lang.Boolean r0 = r0.COg()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            goto L_0x00c7
        L_0x0085:
            X.4Cl r0 = X.DbV.A0k(r6)
            java.lang.Boolean r0 = r0.Ccr()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            goto L_0x00c7
        L_0x0092:
            boolean r0 = X.2R8.A00(r6)
            goto L_0x00c7
        L_0x0097:
            X.3FW r0 = new X.3FW
            r0.<init>(r6)
            com.instagram.user.model.User r0 = r0.A01
            boolean r0 = r0.A1Z()
            goto L_0x00c7
        L_0x00a3:
            X.9BG r1 = X.AnonymousClass9BG.A01(r6)
            java.lang.String r0 = r6.A06
            boolean r0 = r1.A05(r0)
            goto L_0x00c7
        L_0x00ae:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362988ir.A01(r0, r6)
            goto L_0x00c7
        L_0x00b9:
            X.0wX r0 = r6.A03
            android.content.Context r0 = r0.A06()
            X.SP0 r0 = X.SP0.A00(r0)
            boolean r0 = r0.A03()
        L_0x00c7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x00cf:
            r2 = r5
            goto L_0x0026
        L_0x00d2:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x00d9:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0101
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to get derived boolean value: "
            r1.append(r0)
            X.XQu r0 = r2.A00
            r1.append(r0)
            r0 = 1984(0x7c0, float:2.78E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0101:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.DerivedBooleanValue.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.4D7):java.lang.Object");
    }

    public final List A08() {
        return 0sn.A00;
    }

    public DerivedBooleanValue(C21249XQu xQu) {
        this.A00 = xQu;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { ");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
