package X;

import com.instagram.android.R;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GrH  reason: case insensitive filesystem */
public final class C53602GrH extends AnonymousClass0T0 implements JRE {
    public final int A00;
    public final int A01 = R.dimen.abc_edit_text_inset_bottom_material;
    public final int A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
    public final MidCardLayoutType A03;
    public final C266444Yx A04;
    public final ImageUrl A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final JNH A0A;
    public final String A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53602GrH) {
                C53602GrH grH = (C53602GrH) obj;
                if (!0qQ.A0K(this.A0B, grH.A0B) || !0qQ.A0K(this.A08, grH.A08) || !0qQ.A0K(this.A07, grH.A07) || !0qQ.A0K(this.A05, grH.A05) || this.A0C != grH.A0C || !0qQ.A0K(this.A06, grH.A06) || !0qQ.A0K(this.A04, grH.A04) || this.A02 != grH.A02 || this.A01 != grH.A01 || this.A00 != grH.A00 || this.A09 != grH.A09 || this.A03 != grH.A03 || !0qQ.A0K(this.A0A, grH.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53602GrH(MidCardLayoutType midCardLayoutType, C266444Yx r5, ImageUrl imageUrl, JNH jnh, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A0B = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = imageUrl;
        this.A0C = z;
        this.A06 = str4;
        this.A04 = r5;
        this.A00 = i;
        this.A09 = true;
        this.A03 = midCardLayoutType;
        this.A0A = jnh;
    }

    public final int Alh() {
        return this.A00;
    }

    public final String Anz() {
        return this.A06;
    }

    public final int AtW() {
        return this.A01;
    }

    public final ImageUrl BGK() {
        return this.A05;
    }

    public final int BJV() {
        return this.A02;
    }

    public final MidCardLayoutType BT0() {
        return this.A03;
    }

    public final JNH BZm() {
        return this.A0A;
    }

    public final boolean CRX() {
        return this.A0C;
    }

    public final String getMediaId() {
        return this.A0B;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0C, ((((((AnonymousClass7TG.A0E(this.A0B) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        return AnonymousClass7TE.A0N(this.A0A, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A09, (((((((AnonymousClass7TF.A08(this.A06, A092) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31)));
    }
}
