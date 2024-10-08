package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Jvd  reason: case insensitive filesystem */
public final class C61039Jvd extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3 == com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61039Jvd(com.instagram.api.schemas.MonetizationEligibilityDecision r3, boolean r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r0 = 0
            r2.A00 = r0
            r2.A00 = r0
            r2.<init>()
            r2.A03 = r4
            r2.A01 = r3
            r2.A06 = r0
            r2.A02 = r5
            r2.A04 = r6
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
            if (r3 == r0) goto L_0x001b
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE
            r0 = 0
            if (r3 != r1) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61039Jvd.<init>(com.instagram.api.schemas.MonetizationEligibilityDecision, boolean, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61039Jvd) {
                    C61039Jvd jvd = (C61039Jvd) obj;
                    if (jvd.A00 == 0 && this.A03 == jvd.A03 && this.A01 == jvd.A01 && this.A06 == jvd.A06 && this.A02 == jvd.A02) {
                        z = this.A04;
                        z2 = jvd.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61039Jvd) {
                    C61039Jvd jvd2 = (C61039Jvd) obj;
                    if (jvd2.A00 == 1 && 0qQ.A0K(this.A01, jvd2.A01) && this.A03 == jvd2.A03 && this.A02 == jvd2.A02 && this.A05 == jvd2.A05 && this.A04 == jvd2.A04) {
                        z = this.A06;
                        z2 = jvd2.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61039Jvd) {
                    C61039Jvd jvd3 = (C61039Jvd) obj;
                    if (jvd3.A00 == 2 && this.A01 == jvd3.A01 && this.A03 == jvd3.A03 && this.A06 == jvd3.A06 && this.A02 == jvd3.A02 && this.A04 == jvd3.A04) {
                        z = this.A05;
                        z2 = jvd3.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        boolean z;
        String str;
        switch (this.A00) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, C51965G9l.A05(this.A03))));
                z = this.A04;
                break;
            case 1:
                A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TG.A0C(this.A01) * 31))));
                z = this.A06;
                break;
            default:
                int A0M = AnonymousClass7TE.A0M(this.A01);
                switch (A0M) {
                    case 1:
                        str = "TOOL";
                        break;
                    case 2:
                        str = "TRIM";
                        break;
                    case 3:
                        str = "COVER";
                        break;
                    case 4:
                        str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                    default:
                        str = "FILTER";
                        break;
                }
                A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A03, C51968G9o.A0F(str, A0M)))));
                z = this.A05;
                break;
        }
        return DbS.A06(z, A09);
    }

    public C61039Jvd(C272024jy r2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = 1;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = z2;
        this.A05 = z3;
        this.A04 = z4;
        this.A06 = z5;
    }

    public C61039Jvd(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = 2;
        this.A01 = num;
        this.A03 = z;
        this.A06 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A05 = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61039Jvd() {
        this((C272024jy) null, false, false, false, false, false);
        this.A00 = 1;
    }
}
