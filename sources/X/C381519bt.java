package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import java.util.List;

/* renamed from: X.9bt  reason: invalid class name and case insensitive filesystem */
public final class C381519bt extends AnonymousClass0T0 {
    public final MediaGenAIDetectionMethod A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381519bt) {
                C381519bt r5 = (C381519bt) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A02))) * 31 * 31 * 31 * 31 * 31;
        return AnonymousClass7TF.A07(this.A00, (((AnonymousClass7TF.A07(this.A03, A07) + AnonymousClass7TG.A0E(this.A01)) * 31 * 31 * 31) + C54732HQn.A00()) * 31) * 31 * 31 * 31 * 31;
    }

    public C381519bt(MediaGenAIDetectionMethod mediaGenAIDetectionMethod, String str, String str2, List list, List list2, List list3) {
        AnonymousClass7TG.A1U(str, list, list2);
        0qQ.A0B(list3, 9);
        this.A02 = str;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = list3;
        this.A01 = str2;
        this.A00 = mediaGenAIDetectionMethod;
    }
}
