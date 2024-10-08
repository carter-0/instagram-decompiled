package X;

import java.util.List;

/* renamed from: X.9cF  reason: invalid class name and case insensitive filesystem */
public final class C381739cF extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final List A05;
    public final List A06;

    public C381739cF(String str, String str2, List list, List list2, List list3, List list4, boolean z) {
        0qQ.A0B(list, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = list2;
        this.A05 = list3;
        this.A06 = list4;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381739cF) {
                C381739cF r5 = (C381739cF) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))))));
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return A07 + i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ContentFilterDictionarySyncedPatternsModel(dictionaryKey=");
        A1A.append(this.A00);
        A1A.append(", syncedVersion=");
        A1A.append(this.A01);
        A1A.append(", blockedPatternsAdded=");
        A1A.append(this.A02);
        A1A.append(", blockedPatternsRemoved=");
        A1A.append(this.A03);
        A1A.append(", allowedPatternsAdded=");
        A1A.append(this.A05);
        A1A.append(", allowedPatternsRemoved=");
        A1A.append(this.A06);
        A1A.append(", isDiff=");
        A1A.append(this.A04);
        return AnonymousClass7TG.A0p(A1A);
    }
}
