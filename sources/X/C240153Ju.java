package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.3Ju  reason: invalid class name and case insensitive filesystem */
public final class C240153Ju extends AnonymousClass0T0 implements AnonymousClass1qK {
    public 1sy A00;
    public AnonymousClass34A A01;
    public SearchContext A02;
    public HashMap A03;
    public final 1Xj A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240153Ju) {
                C240153Ju r5 = (C240153Ju) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31;
        1sy r0 = this.A00;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        AnonymousClass34A r02 = this.A01;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        HashMap hashMap = this.A03;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode3 + i;
    }

    public C240153Ju(1Xj r1, 1sy r2, AnonymousClass34A r3, SearchContext searchContext, HashMap hashMap) {
        this.A04 = r1;
        this.A02 = searchContext;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = hashMap;
    }
}
