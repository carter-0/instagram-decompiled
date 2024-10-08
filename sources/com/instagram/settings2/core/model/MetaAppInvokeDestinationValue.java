package com.instagram.settings2.core.model;

import X.00k;
import X.018;
import X.0qQ;
import X.0sr;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C50957Flk;
import X.C63416Kwc;
import X.C64185LSs;
import X.C66419MQz;
import java.util.ArrayList;
import java.util.List;

public final class MetaAppInvokeDestinationValue extends C64185LSs {
    public final C64185LSs A00;
    public final C64185LSs A01;
    public final C64185LSs A02;
    public final C64185LSs A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAppInvokeDestinationValue) {
                MetaAppInvokeDestinationValue metaAppInvokeDestinationValue = (MetaAppInvokeDestinationValue) obj;
                if (!0qQ.A0K(this.A01, metaAppInvokeDestinationValue.A01) || !0qQ.A0K(this.A03, metaAppInvokeDestinationValue.A03) || !0qQ.A0K(this.A02, metaAppInvokeDestinationValue.A02) || !0qQ.A0K(this.A00, metaAppInvokeDestinationValue.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C66419MQz A05() {
        return C50957Flk.A00;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r8 != r7) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r10, com.instagram.settings2.core.session.AbstractValueResolverImpl r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r3 = 29
            boolean r0 = X.ME0.A02(r3, r12)
            if (r0 == 0) goto L_0x00c7
            r6 = r12
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c7
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r8 = r6.A05
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 4
            r4 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r1) goto L_0x0054
            if (r0 == r2) goto L_0x0073
            if (r0 == r4) goto L_0x0098
            if (r0 != r5) goto L_0x00ce
            java.lang.Object r4 = r6.A03
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r2 = r6.A02
            X.EV3 r2 = (X.EV3) r2
            java.lang.Object r3 = r6.A01
            java.lang.String r3 = (java.lang.String) r3
            X.0eS.A00(r8)
        L_0x0039:
            java.lang.String r8 = (java.lang.String) r8
            X.Dtu r0 = new X.Dtu
            r0.<init>(r2, r3, r8, r4)
            return r0
        L_0x0041:
            X.0eS.A00(r8)
            X.LSs r0 = r9.A01
            r6.A01 = r9
            r6.A02 = r11
            r6.A00 = r1
            java.lang.Object r8 = r11.A01(r0, r6)
            if (r8 == r7) goto L_0x0072
            r1 = r9
            goto L_0x005f
        L_0x0054:
            java.lang.Object r11 = r6.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r11 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r11
            java.lang.Object r1 = r6.A01
            com.instagram.settings2.core.model.MetaAppInvokeDestinationValue r1 = (com.instagram.settings2.core.model.MetaAppInvokeDestinationValue) r1
            X.0eS.A00(r8)
        L_0x005f:
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            X.LSs r0 = r1.A03
            r6.A01 = r1
            r6.A02 = r11
            r6.A03 = r3
            r6.A00 = r2
            java.lang.Object r8 = r11.A01(r0, r6)
            if (r8 != r7) goto L_0x0082
        L_0x0072:
            return r7
        L_0x0073:
            java.lang.Object r3 = r6.A03
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r6.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r11 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r11
            java.lang.Object r1 = r6.A01
            com.instagram.settings2.core.model.MetaAppInvokeDestinationValue r1 = (com.instagram.settings2.core.model.MetaAppInvokeDestinationValue) r1
            X.0eS.A00(r8)
        L_0x0082:
            r2 = r8
            X.EV3 r2 = (X.EV3) r2
            X.LSs r0 = r1.A02
            r6.A01 = r1
            r6.A02 = r11
            r6.A03 = r3
            r6.A04 = r2
            r6.A00 = r4
            java.lang.Object r8 = r11.A01(r0, r6)
            if (r8 != r7) goto L_0x00ab
            return r7
        L_0x0098:
            java.lang.Object r2 = r6.A04
            X.EV3 r2 = (X.EV3) r2
            java.lang.Object r3 = r6.A03
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r6.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r11 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r11
            java.lang.Object r1 = r6.A01
            com.instagram.settings2.core.model.MetaAppInvokeDestinationValue r1 = (com.instagram.settings2.core.model.MetaAppInvokeDestinationValue) r1
            X.0eS.A00(r8)
        L_0x00ab:
            r4 = r8
            java.util.HashMap r4 = (java.util.HashMap) r4
            X.LSs r1 = r1.A00
            r6.A01 = r3
            r6.A02 = r2
            r6.A03 = r4
            r0 = 0
            r6.A04 = r0
            r6.A00 = r5
            if (r1 == 0) goto L_0x00c4
            java.lang.Object r8 = r11.A01(r1, r6)
            if (r8 != r7) goto L_0x0039
            return r7
        L_0x00c4:
            r8 = 0
            goto L_0x0039
        L_0x00c7:
            X.ME0 r6 = new X.ME0
            r6.<init>(r9, r12, r3)
            goto L_0x0016
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.MetaAppInvokeDestinationValue.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.4D7):java.lang.Object");
    }

    public final List A08() {
        List<C64185LSs> A1P = 0sr.A1P(new C64185LSs[]{this.A01, this.A03, this.A02, this.A00});
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C64185LSs A002 : A1P) {
            018.A16(C63416Kwc.A00(A002), A1C);
        }
        return 00k.A0W(A1C);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A01))) + AnonymousClass7TG.A0C(this.A00);
    }

    public MetaAppInvokeDestinationValue(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3, C64185LSs lSs4) {
        this.A01 = lSs;
        this.A03 = lSs2;
        this.A02 = lSs3;
        this.A00 = lSs4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
