package X;

import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import java.util.List;

/* renamed from: X.Jxb  reason: case insensitive filesystem */
public final class C61125Jxb extends AnonymousClass0T0 implements MWV {
    public final TextPostAppBottomSheetCTAType A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61125Jxb) {
                C61125Jxb jxb = (C61125Jxb) obj;
                if (this.A00 != jxb.A00 || !0qQ.A0K(this.A03, jxb.A03) || this.A04 != jxb.A04 || !0qQ.A0K(this.A01, jxb.A01) || !0qQ.A0K(this.A02, jxb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00));
        return C41845B3m.A01(this.A02, (AnonymousClass7TF.A09(this.A04, A07) + AnonymousClass7TG.A0E(this.A01)) * 31);
    }

    public C61125Jxb(TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, String str, String str2, List list, boolean z) {
        AnonymousClass7TG.A1O(textPostAppBottomSheetCTAType, list);
        0qQ.A0B(str2, 5);
        this.A00 = textPostAppBottomSheetCTAType;
        this.A03 = list;
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
    }
}
