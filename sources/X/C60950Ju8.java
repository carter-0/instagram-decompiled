package X;

import com.instagram.api.schemas.ContentAppreciationDisclaimerType;
import java.util.List;

/* renamed from: X.Ju8  reason: case insensitive filesystem */
public final class C60950Ju8 extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final ContentAppreciationDisclaimerType A02;
    public final List A03;
    public final boolean A04;
    public final List A05;
    public final boolean A06;

    public C60950Ju8(ContentAppreciationDisclaimerType contentAppreciationDisclaimerType, List list, List list2, int i, long j, boolean z, boolean z2) {
        DbW.A1N(contentAppreciationDisclaimerType, 3, list2);
        this.A00 = i;
        this.A06 = z;
        this.A02 = contentAppreciationDisclaimerType;
        this.A05 = list;
        this.A03 = list2;
        this.A04 = z2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60950Ju8) {
                C60950Ju8 ju8 = (C60950Ju8) obj;
                if (!(this.A00 == ju8.A00 && this.A06 == ju8.A06 && this.A02 == ju8.A02 && 0qQ.A0K(this.A05, ju8.A05) && 0qQ.A0K(this.A03, ju8.A03) && this.A04 == ju8.A04 && this.A01 == ju8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A06, this.A00 * 31);
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A07(this.A02, A09) + AnonymousClass7TG.A0C(this.A05)) * 31)) + C51968G9o.A03(this.A01);
    }
}
