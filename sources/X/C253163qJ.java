package X;

import android.text.TextUtils;

/* renamed from: X.3qJ  reason: invalid class name and case insensitive filesystem */
public final class C253163qJ extends AnonymousClass0T0 {
    public final int A00;
    public final TextUtils.TruncateAt A01;
    public final C244063aa A02;
    public final 2WX A03;
    public final CharSequence A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final 0sP A07;
    public final 0sL A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253163qJ) {
                C253163qJ r5 = (C253163qJ) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A08, r5.A08) || this.A02 != r5.A02 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A04.hashCode() * 31) + this.A00) * 31) + this.A01.hashCode()) * 31;
        0sP r0 = this.A07;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C62320sa r02 = this.A06;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C62320sa r03 = this.A05;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        0sL r04 = this.A08;
        int hashCode5 = (hashCode4 + (r04 == null ? 0 : r04.hashCode())) * 31;
        C244063aa r05 = this.A02;
        if (r05 != null) {
            i = r05.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.A03.hashCode();
    }

    public C253163qJ(TextUtils.TruncateAt truncateAt, C244063aa r2, 2WX r3, CharSequence charSequence, C62320sa r5, C62320sa r6, 0sP r7, 0sL r8, int i) {
        this.A04 = charSequence;
        this.A00 = i;
        this.A01 = truncateAt;
        this.A07 = r7;
        this.A06 = r5;
        this.A05 = r6;
        this.A08 = r8;
        this.A02 = r2;
        this.A03 = r3;
    }
}
