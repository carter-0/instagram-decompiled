package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Gly  reason: case insensitive filesystem */
public final class C53312Gly extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final C46519DgM A01;
    public final Reel A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53312Gly) {
                C53312Gly gly = (C53312Gly) obj;
                if (!0qQ.A0K(this.A05, gly.A05) || !0qQ.A0K(this.A00, gly.A00) || !0qQ.A0K(this.A03, gly.A03) || !0qQ.A0K(this.A04, gly.A04) || this.A01 != gly.A01 || this.A08 != gly.A08 || this.A07 != gly.A07 || this.A06 != gly.A06 || !0qQ.A0K(this.A02, gly.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31))))) + AnonymousClass7TE.A0L(this.A02);
    }

    public C53312Gly(ImageUrl imageUrl, C46519DgM dgM, Reel reel, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = dgM;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A02 = reel;
    }
}
