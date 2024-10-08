package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;

/* renamed from: X.5FS  reason: invalid class name */
public final class AnonymousClass5FS extends AnonymousClass0T0 implements AnonymousClass5FT {
    public final int A00;
    public final long A01;
    public final long A02;
    public final GuideTypeStr A03;
    public final BIR A04;
    public final User A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final AnonymousClass5FS FEA(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5FS) {
                AnonymousClass5FS r8 = (AnonymousClass5FS) obj;
                if (!(this.A08 == r8.A08 && 0qQ.A0K(this.A06, r8.A06) && this.A09 == r8.A09 && this.A01 == r8.A01 && this.A0A == r8.A0A && 0qQ.A0K(this.A04, r8.A04) && this.A00 == r8.A00 && 0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A07, r8.A07) && this.A03 == r8.A03 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass5FS(GuideTypeStr guideTypeStr, BIR bir, User user, String str, String str2, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(user, 8);
        0qQ.A0B(guideTypeStr, 10);
        this.A08 = z;
        this.A06 = str;
        this.A09 = z2;
        this.A01 = j;
        this.A0A = z3;
        this.A04 = bir;
        this.A00 = i;
        this.A05 = user;
        this.A07 = str2;
        this.A03 = guideTypeStr;
        this.A02 = j2;
    }

    public final boolean B5Z() {
        return this.A09;
    }

    public final long BEV() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ DTY BTT() {
        return this.A04;
    }

    public final int BWv() {
        return this.A00;
    }

    public final User BZw() {
        return this.A05;
    }

    public final GuideTypeStr CAN() {
        return this.A03;
    }

    public final long CC8() {
        return this.A02;
    }

    public final boolean CRY() {
        return this.A0A;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGuideSummary", C44744CkD.A00(this));
    }

    public final boolean getCanViewerReshare() {
        return this.A08;
    }

    public final String getDescription() {
        return this.A06;
    }

    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A06;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        long j = this.A01;
        int i7 = (i6 + ((int) (j ^ (j >>> 32)))) * 31;
        int i8 = 1237;
        if (this.A0A) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        BIR bir = this.A04;
        if (bir == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bir.hashCode();
        }
        int hashCode3 = (((((i9 + hashCode2) * 31) + this.A00) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.A02;
        return ((((hashCode3 + i3) * 31) + this.A03.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final AnonymousClass5FT E9l(1E9 r1) {
        return this;
    }
}
