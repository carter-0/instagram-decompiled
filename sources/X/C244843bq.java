package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3bq  reason: invalid class name and case insensitive filesystem */
public final class C244843bq implements AnonymousClass2T6 {
    public final int A00;
    public final C251263mp A01;
    public final 2V1 A02;
    public final 2TR A03;
    public final C243243Xz A04;
    public final C244793bl A05;
    public final AnonymousClass3XI A06;
    public final List A07;
    public final AtomicReference A08;
    public final boolean A09;
    public final C243153Xp A0A;

    public C244843bq(C251263mp r2, 2V1 r3, 2TR r4, C243153Xp r5, C243243Xz r6, C244793bl r7, AnonymousClass3XI r8, List list, int i, boolean z) {
        0qQ.A0B(r5, 4);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A0A = r5;
        this.A06 = r8;
        this.A09 = z;
        this.A00 = i;
        this.A07 = list;
        this.A05 = r7;
        this.A04 = r6;
        this.A08 = new AtomicReference(r5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C244843bq) {
                C244843bq r5 = (C244843bq) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A06, r5.A06) || this.A09 != r5.A09 || this.A00 != r5.A00 || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResolveResult(node=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(840));
        sb.append(this.A02);
        sb.append(AnonymousClass000.A00(2006));
        sb.append(this.A01);
        sb.append(", cache=");
        sb.append(this.A0A);
        sb.append(", treeState=");
        sb.append(this.A06);
        sb.append(", isPartialResult=");
        sb.append(this.A09);
        sb.append(AnonymousClass000.A00(2053));
        sb.append(this.A00);
        sb.append(", eventHandlers=");
        sb.append(this.A07);
        sb.append(", outputs=");
        sb.append(this.A05);
        sb.append(", contextForResuming=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final boolean CYv() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        2TR r0 = this.A03;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode4 = ((((((((hashCode * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        int i3 = (((hashCode4 + i2) * 31) + this.A00) * 31;
        List list = this.A07;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        C244793bl r02 = this.A05;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C243243Xz r03 = this.A04;
        if (r03 != null) {
            i = r03.hashCode();
        }
        return i5 + i;
    }
}
