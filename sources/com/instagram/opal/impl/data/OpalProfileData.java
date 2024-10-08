package com.instagram.opal.impl.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.C253833rU;
import X.C41848B3p;
import X.C51965G9l;
import X.C51973G9u;
import X.C51974G9v;
import X.C62520KhB;
import X.DbS;
import X.DbT;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class OpalProfileData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(70);
    public final int A00;
    public final C62520KhB A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpalProfileData) {
                OpalProfileData opalProfileData = (OpalProfileData) obj;
                if (this.A09 != opalProfileData.A09 || !0qQ.A0K(this.A05, opalProfileData.A05) || !0qQ.A0K(this.A07, opalProfileData.A07) || !0qQ.A0K(this.A04, opalProfileData.A04) || !0qQ.A0K(this.A06, opalProfileData.A06) || !0qQ.A0K(this.A03, opalProfileData.A03) || this.A0C != opalProfileData.A0C || !0qQ.A0K(this.A02, opalProfileData.A02) || this.A01 != opalProfileData.A01 || this.A0B != opalProfileData.A0B || this.A00 != opalProfileData.A00 || !0qQ.A0K(this.A08, opalProfileData.A08) || this.A0A != opalProfileData.A0A) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A02);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A08);
        while (A1F.hasNext()) {
            ((OpalAudienceSelectorRepository.OpalAudience) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public static /* synthetic */ OpalProfileData A00(OpalProfileData opalProfileData, C62520KhB khB, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        List list2 = list;
        int i3 = i;
        boolean z5 = z2;
        C62520KhB khB2 = khB;
        String str6 = str5;
        boolean z6 = z;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        String str11 = null;
        int i4 = i2;
        if ((i2 & 1) != 0) {
            z3 = opalProfileData.A09;
        } else {
            z3 = false;
        }
        if ((i2 & 2) != 0) {
            str10 = opalProfileData.A05;
        }
        if ((i2 & 4) != 0) {
            str9 = opalProfileData.A07;
        }
        if ((i2 & 8) != 0) {
            str8 = opalProfileData.A04;
        }
        if ((i2 & 16) != 0) {
            str11 = opalProfileData.A06;
        }
        if ((i2 & 32) != 0) {
            str7 = opalProfileData.A03;
        }
        if ((i2 & 64) != 0) {
            z6 = opalProfileData.A0C;
        }
        if ((i4 & 128) != 0) {
            str6 = opalProfileData.A02;
        }
        if ((i4 & 256) != 0) {
            khB2 = opalProfileData.A01;
        }
        if ((i4 & 512) != 0) {
            z5 = opalProfileData.A0B;
        }
        if ((i4 & 1024) != 0) {
            i3 = opalProfileData.A00;
        }
        if ((i4 & C249703kE.FLAG_MOVED) != 0) {
            list2 = opalProfileData.A08;
        }
        if ((i4 & 4096) != 0) {
            z4 = opalProfileData.A0A;
        } else {
            z4 = false;
        }
        C51974G9v.A1P(str10, str9, str8, str11);
        AnonymousClass7TF.A1F(str6, 7, khB2);
        0qQ.A0B(list2, 11);
        return new OpalProfileData(khB2, str10, str9, str8, str11, str7, str6, list2, i3, z3, z6, z5, z4);
    }

    public final ImageUrl A01() {
        boolean z = this.A0C;
        String str = null;
        String str2 = this.A03;
        if (z) {
            if (str2 != null) {
                return C253833rU.A00(DbT.A09(str2), -1, -1);
            }
        } else if (str2 != null) {
            return C253833rU.A01(new File(str2));
        } else {
            str = this.A06;
        }
        return DbS.A0V(str);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A05, C51965G9l.A05(this.A09))));
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A08(this.A06, A082) + AnonymousClass7TG.A0E(this.A03)) * 31)));
        return DbS.A06(this.A0A, AnonymousClass7TF.A07(this.A08, (AnonymousClass7TF.A09(this.A0B, A072) + this.A00) * 31));
    }

    public OpalProfileData(C62520KhB khB, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C51974G9v.A1M(str, str2, str3);
        C51973G9u.A0t(5, str4, str6, khB);
        0qQ.A0B(list, 12);
        this.A09 = z;
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A0C = z2;
        this.A02 = str6;
        this.A01 = khB;
        this.A0B = z3;
        this.A00 = i;
        this.A08 = list;
        this.A0A = z4;
    }
}
