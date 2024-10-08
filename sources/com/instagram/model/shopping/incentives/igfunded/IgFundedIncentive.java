package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C63335KvI;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class IgFundedIncentive extends AnonymousClass0T0 implements IgFundedIncentiveIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(98);
    public final IgFundedIncentiveBannerButton A00;
    public final IgFundedIncentiveBannerButton A01;
    public final IgFundedIncentiveBannerIconType A02;
    public final IgFundedIncentiveNuxDisplayStyle A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public IgFundedIncentive(IgFundedIncentiveBannerButton igFundedIncentiveBannerButton, IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2, IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType, IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1F(str, 4, str2);
        0qQ.A0B(igFundedIncentiveNuxDisplayStyle, 12);
        0qQ.A0B(str5, 15);
        this.A02 = igFundedIncentiveBannerIconType;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = str;
        this.A0B = list;
        this.A00 = igFundedIncentiveBannerButton;
        this.A0C = z;
        this.A07 = str2;
        this.A0D = z2;
        this.A08 = str3;
        this.A09 = str4;
        this.A03 = igFundedIncentiveNuxDisplayStyle;
        this.A01 = igFundedIncentiveBannerButton2;
        this.A0E = z3;
        this.A0A = str5;
    }

    public final IgFundedIncentive FFV() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentive) {
                IgFundedIncentive igFundedIncentive = (IgFundedIncentive) obj;
                if (this.A02 != igFundedIncentive.A02 || !0qQ.A0K(this.A04, igFundedIncentive.A04) || !0qQ.A0K(this.A05, igFundedIncentive.A05) || !0qQ.A0K(this.A06, igFundedIncentive.A06) || !0qQ.A0K(this.A0B, igFundedIncentive.A0B) || !0qQ.A0K(this.A00, igFundedIncentive.A00) || this.A0C != igFundedIncentive.A0C || !0qQ.A0K(this.A07, igFundedIncentive.A07) || this.A0D != igFundedIncentive.A0D || !0qQ.A0K(this.A08, igFundedIncentive.A08) || !0qQ.A0K(this.A09, igFundedIncentive.A09) || this.A03 != igFundedIncentive.A03 || !0qQ.A0K(this.A01, igFundedIncentive.A01) || this.A0E != igFundedIncentive.A0E || !0qQ.A0K(this.A0A, igFundedIncentive.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = this.A02;
        if (igFundedIncentiveBannerIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerIconType.writeToParcel(parcel, i);
        }
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        parcel.writeString(this.A06);
        List list = this.A0B;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A1F = C41848B3p.A1F(parcel, list);
            while (A1F.hasNext()) {
                C41847B3o.A1I(parcel, A1F, i);
            }
        }
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = this.A00;
        if (igFundedIncentiveBannerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerButton.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        this.A03.writeToParcel(parcel, i);
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = this.A01;
        if (igFundedIncentiveBannerButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerButton2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A0A);
    }

    public final IgFundedIncentiveBannerIconType AfB() {
        return this.A02;
    }

    public final Integer Ard() {
        return this.A04;
    }

    public final Integer Are() {
        return this.A05;
    }

    public final List Awm() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ IgFundedIncentiveBannerButtonIntf B62() {
        return this.A00;
    }

    public final boolean BBV() {
        return this.A0C;
    }

    public final String BGl() {
        return this.A07;
    }

    public final String BXa() {
        return this.A08;
    }

    public final String BXb() {
        return this.A09;
    }

    public final IgFundedIncentiveNuxDisplayStyle BXc() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ IgFundedIncentiveBannerButtonIntf BqQ() {
        return this.A01;
    }

    public final boolean Bum() {
        return this.A0E;
    }

    public final boolean CY9() {
        return this.A0D;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingIGFundedIncentiveBanner", C63335KvI.A00(this));
    }

    public final String getDescription() {
        return this.A06;
    }

    public final String getTitle() {
        return this.A0A;
    }

    public final int hashCode() {
        String str = this.A06;
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A09(this.A0C, (((AnonymousClass7TF.A08(str, ((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31));
        IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = this.A03;
        return C41845B3m.A01(this.A0A, AnonymousClass7TF.A09(this.A0E, (AnonymousClass7TF.A07(igFundedIncentiveNuxDisplayStyle, (((AnonymousClass7TF.A09(this.A0D, A082) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }
}
