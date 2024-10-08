package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FeedItemType;
import java.util.List;

/* renamed from: X.3IN  reason: invalid class name */
public final class AnonymousClass3IN extends AnonymousClass0T0 implements AnonymousClass3IO {
    public final int A00;
    public final long A01;
    public final FeedItemType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass3IN(FeedItemType feedItemType, String str, String str2, String str3, String str4, List list, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(str, 1);
        0qQ.A0B(feedItemType, 10);
        0qQ.A0B(str2, 12);
        0qQ.A0B(list, 15);
        0qQ.A0B(str3, 16);
        0qQ.A0B(str4, 17);
        this.A03 = str;
        this.A00 = i;
        this.A08 = z;
        this.A09 = z2;
        this.A01 = j;
        this.A0A = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A02 = feedItemType;
        this.A0E = z7;
        this.A04 = str2;
        this.A0F = z8;
        this.A0G = z9;
        this.A07 = list;
        this.A05 = str3;
        this.A06 = str4;
    }

    public final AnonymousClass3IN FEt(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IN) {
                AnonymousClass3IN r8 = (AnonymousClass3IN) obj;
                if (!(0qQ.A0K(this.A03, r8.A03) && this.A00 == r8.A00 && this.A08 == r8.A08 && this.A09 == r8.A09 && this.A01 == r8.A01 && this.A0A == r8.A0A && this.A0B == r8.A0B && this.A0C == r8.A0C && this.A0D == r8.A0D && this.A02 == r8.A02 && this.A0E == r8.A0E && 0qQ.A0K(this.A04, r8.A04) && this.A0F == r8.A0F && this.A0G == r8.A0G && 0qQ.A0K(this.A07, r8.A07) && 0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A06, r8.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AYU() {
        return this.A03;
    }

    public final boolean Azg() {
        return this.A08;
    }

    public final boolean B9g() {
        return this.A09;
    }

    public final long BEV() {
        return this.A01;
    }

    public final boolean BKW() {
        return this.A0B;
    }

    public final boolean BNW() {
        return this.A0C;
    }

    public final boolean BUf() {
        return this.A0D;
    }

    public final FeedItemType BVr() {
        return this.A02;
    }

    public final boolean BWP() {
        return this.A0E;
    }

    public final String BjK() {
        return this.A04;
    }

    public final boolean BwD() {
        return this.A0F;
    }

    public final boolean Bwu() {
        return this.A0G;
    }

    public final List C2t() {
        return this.A07;
    }

    public final String C9L() {
        return this.A06;
    }

    public final boolean Cdo() {
        return this.A0A;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuggestedUsersDict", C44886Cmc.A00(this));
    }

    public final int getDuration() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A01;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0C) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0D) {
            i12 = 1231;
        }
        int hashCode2 = (((i11 + i12) * 31) + this.A02.hashCode()) * 31;
        int i13 = 1237;
        if (this.A0E) {
            i13 = 1231;
        }
        int hashCode3 = (((hashCode2 + i13) * 31) + this.A04.hashCode()) * 31;
        int i14 = 1237;
        if (this.A0F) {
            i14 = 1231;
        }
        int i15 = (hashCode3 + i14) * 31;
        int i16 = 1237;
        if (this.A0G) {
            i16 = 1231;
        }
        return ((((((i15 + i16) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode();
    }

    public final AnonymousClass3IO E9w(1E9 r1) {
        return this;
    }
}
