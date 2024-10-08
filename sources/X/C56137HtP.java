package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.HtP  reason: case insensitive filesystem */
public final class C56137HtP {
    public final int A00;
    public final Drawable A01;
    public final C56060Hs9 A02;
    public final C54717HPw A03;
    public final C54718HPx A04;
    public final Integer A05;
    public final String A06;

    public C56137HtP(Drawable drawable, C56060Hs9 hs9, C54717HPw hPw, C54718HPx hPx, Integer num, String str, int i) {
        0qQ.A0B(str, 6);
        this.A04 = hPx;
        this.A03 = hPw;
        this.A00 = i;
        this.A05 = num;
        this.A01 = drawable;
        this.A06 = str;
        this.A02 = hs9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56137HtP) {
                C56137HtP htP = (C56137HtP) obj;
                if (!0qQ.A0K(this.A04, htP.A04) || !0qQ.A0K(this.A03, htP.A03) || this.A00 != htP.A00 || !0qQ.A0K(this.A05, htP.A05) || !0qQ.A0K(this.A01, htP.A01) || !0qQ.A0K(this.A06, htP.A06) || !0qQ.A0K(this.A02, htP.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A01, (((AnonymousClass7TF.A07(this.A03, A0K) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31)) + AnonymousClass7TE.A0L(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProfilePhotoStyleValues(roundingOptions=");
        A1A.append(this.A04);
        A1A.append(", borderOptions=");
        A1A.append(this.A03);
        A1A.append(", imageSizeDp=");
        A1A.append(this.A00);
        A1A.append(", backgroundColor=");
        A1A.append(this.A05);
        A1A.append(", photoOverlay=");
        A1A.append(this.A01);
        A1A.append(", attributionLabel=");
        A1A.append(this.A06);
        A1A.append(", badgeAddOn=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
