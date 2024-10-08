package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

/* renamed from: X.3qm  reason: invalid class name and case insensitive filesystem */
public final class C253433qm extends AnonymousClass0T0 implements C253443qn {
    public final C282085Bj A00;
    public final IgUserBioLinkTypeEnum A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final C253433qm FD6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253433qm) {
                C253433qm r5 = (C253433qm) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || this.A0B != r5.A0B || this.A0C != r5.A0C || !0qQ.A0K(this.A07, r5.A07) || this.A01 != r5.A01 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C253433qm(C282085Bj r2, IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        0qQ.A0B(str5, 8);
        0qQ.A0B(igUserBioLinkTypeEnum, 9);
        0qQ.A0B(str7, 12);
        0qQ.A0B(str8, 13);
        this.A03 = str;
        this.A00 = r2;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A0B = z;
        this.A0C = z2;
        this.A07 = str5;
        this.A01 = igUserBioLinkTypeEnum;
        this.A08 = str6;
        this.A02 = bool;
        this.A09 = str7;
        this.A0A = str8;
    }

    public final String AnT() {
        return this.A03;
    }

    public final C282085Bj B45() {
        return this.A00;
    }

    public final String B9x() {
        return this.A04;
    }

    public final String BEP() {
        return this.A05;
    }

    public final String BGL() {
        return this.A06;
    }

    public final String BMn() {
        return this.A07;
    }

    public final IgUserBioLinkTypeEnum BMt() {
        return this.A01;
    }

    public final String BOm() {
        return this.A08;
    }

    public final Boolean BYO() {
        return this.A02;
    }

    public final boolean CZA() {
        return this.A0B;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserBioLinkDict", C46335Dcd.A00(this));
    }

    public final String getTitle() {
        return this.A09;
    }

    public final String getUrl() {
        return this.A0A;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        C282085Bj r0 = this.A00;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.A06;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0C) {
            i9 = 1231;
        }
        int hashCode7 = (((((i8 + i9) * 31) + this.A07.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str5 = this.A08;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i10 = (hashCode7 + hashCode6) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((i10 + i) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode();
    }

    public final boolean isVerified() {
        return this.A0C;
    }
}
