package X;

import java.util.Arrays;

/* renamed from: X.FBd  reason: case insensitive filesystem */
public final class C49879FBd {
    public final String A00;
    public final String A01;
    public final String A02;
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

    public final boolean equals(Object obj) {
        C49879FBd fBd;
        if (obj instanceof C49879FBd) {
            fBd = (C49879FBd) obj;
        } else {
            fBd = null;
        }
        if (fBd == null || !DbY.A1b(this, fBd) || this.A0C != fBd.A0C || this.A0B != fBd.A0B || !0qQ.A0K(this.A0A, fBd.A0A) || !0qQ.A0K(this.A08, fBd.A08) || !0qQ.A0K(this.A00, fBd.A00) || !0qQ.A0K(this.A05, fBd.A05) || !0qQ.A0K(this.A07, fBd.A07) || !0qQ.A0K(this.A06, fBd.A06) || !0qQ.A0K(this.A02, fBd.A02) || !0qQ.A0K(this.A04, fBd.A04) || !0qQ.A0K(this.A01, fBd.A01) || !0qQ.A0K(this.A03, fBd.A03) || !0qQ.A0K(this.A09, fBd.A09)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0B), this.A0A, this.A08, this.A00, this.A05, this.A07, this.A06, this.A02, this.A04, this.A01, this.A03, this.A09});
    }

    public C49879FBd(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        this.A0C = z;
        this.A0B = z2;
        this.A0A = str;
        this.A08 = str2;
        this.A00 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A02 = str7;
        this.A04 = str8;
        this.A01 = str9;
        this.A03 = str10;
        this.A09 = str11;
    }

    public C49879FBd() {
        this.A0C = false;
        this.A0B = false;
        this.A0A = null;
        this.A08 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A09 = null;
    }
}
