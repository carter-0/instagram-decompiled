package X;

import android.text.Layout;

/* renamed from: X.5Hq  reason: invalid class name and case insensitive filesystem */
public final class C283435Hq extends AnonymousClass0T0 {
    public final Layout A00;
    public final AnonymousClass9IE A01;
    public final C247733gp A02;
    public final AnonymousClass3ZH A03;
    public final C245833dY A04;
    public final AnonymousClass3W1 A05;
    public final boolean A06;
    public final boolean A07;
    public final 1sy A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283435Hq) {
                C283435Hq r5 = (C283435Hq) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || this.A08 != r5.A08 || this.A07 != r5.A07 || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.A09.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A08.hashCode()) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        return ((i2 + i3) * 31) + this.A04.hashCode();
    }

    public C283435Hq(Layout layout, AnonymousClass9IE r2, C247733gp r3, AnonymousClass3ZH r4, C245833dY r5, AnonymousClass3W1 r6, 1sy r7, String str, boolean z, boolean z2) {
        this.A09 = str;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A00 = layout;
        this.A08 = r7;
        this.A07 = z;
        this.A06 = z2;
        this.A04 = r5;
    }
}
