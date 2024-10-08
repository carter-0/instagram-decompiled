package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5DX  reason: invalid class name */
public final class AnonymousClass5DX extends AnonymousClass0T0 implements AnonymousClass5DY {
    public final AnonymousClass5DW A00;
    public final AnonymousClass5DW A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Float A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public AnonymousClass5DX(AnonymousClass5DW r2, AnonymousClass5DW r3, Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 7);
        0qQ.A0B(str6, 14);
        this.A07 = str;
        this.A05 = num;
        this.A06 = num2;
        this.A0E = z;
        this.A02 = bool;
        this.A03 = bool2;
        this.A08 = str2;
        this.A09 = str3;
        this.A00 = r2;
        this.A0A = str4;
        this.A01 = r3;
        this.A0B = str5;
        this.A04 = f;
        this.A0C = str6;
        this.A0D = str7;
    }

    public final AnonymousClass5DX F2b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5DX) {
                AnonymousClass5DX r5 = (AnonymousClass5DX) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || this.A0E != r5.A0E || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C45448Cwb AK9() {
        return new C45448Cwb(this);
    }

    public final Integer BG7() {
        return this.A05;
    }

    public final Integer BGQ() {
        return this.A06;
    }

    public final String BRI() {
        return this.A08;
    }

    public final String Bxn() {
        return this.A09;
    }

    public final AnonymousClass5DW Bxp() {
        return this.A00;
    }

    public final String Bxs() {
        return this.A0A;
    }

    public final AnonymousClass5DW BzX() {
        return this.A01;
    }

    public final String BzY() {
        return this.A0B;
    }

    public final Float Bzb() {
        return this.A04;
    }

    public final String Bzp() {
        return this.A0C;
    }

    public final boolean CbA() {
        return this.A0E;
    }

    public final Boolean CbB() {
        return this.A02;
    }

    public final Boolean Cdc() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCutoutSticker", CX3.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final String getStrongId() {
        return this.A0D;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11 = this.A07.hashCode() * 31;
        Integer num = this.A05;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode11 + hashCode) * 31;
        Integer num2 = this.A06;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0E) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        Boolean bool = this.A02;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int hashCode12 = (((i6 + hashCode4) * 31) + this.A08.hashCode()) * 31;
        String str = this.A09;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i7 = (hashCode12 + hashCode5) * 31;
        AnonymousClass5DW r0 = this.A00;
        if (r0 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r0.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str2 = this.A0A;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        AnonymousClass5DW r02 = this.A01;
        if (r02 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r02.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str3 = this.A0B;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        Float f = this.A04;
        if (f == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = f.hashCode();
        }
        int hashCode13 = (((i11 + hashCode10) * 31) + this.A0C.hashCode()) * 31;
        String str4 = this.A0D;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode13 + i;
    }
}
