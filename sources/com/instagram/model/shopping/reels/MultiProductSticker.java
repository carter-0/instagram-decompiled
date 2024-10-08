package com.instagram.model.shopping.reels;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CnP;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class MultiProductSticker extends AnonymousClass0T0 implements Parcelable, MultiProductStickerIntf {
    public static final Parcelable.Creator CREATOR = new LVO(26);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final MultiProductSticker FFe(1E9 r1) {
        return this;
    }

    public final MultiProductSticker FFf(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultiProductSticker) {
                MultiProductSticker multiProductSticker = (MultiProductSticker) obj;
                if (!0qQ.A0K(this.A01, multiProductSticker.A01) || !0qQ.A0K(this.A00, multiProductSticker.A00) || !0qQ.A0K(this.A08, multiProductSticker.A08) || !0qQ.A0K(this.A02, multiProductSticker.A02) || !0qQ.A0K(this.A09, multiProductSticker.A09) || !0qQ.A0K(this.A0A, multiProductSticker.A0A) || !0qQ.A0K(this.A03, multiProductSticker.A03) || !0qQ.A0K(this.A04, multiProductSticker.A04) || !0qQ.A0K(this.A05, multiProductSticker.A05) || !0qQ.A0K(this.A06, multiProductSticker.A06) || !0qQ.A0K(this.A07, multiProductSticker.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        C41848B3p.A1I(parcel, this.A00);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A02);
        List list2 = this.A09;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G2 = C41848B3p.A1G(parcel, list2);
            while (A1G2.hasNext()) {
                C41847B3o.A1I(parcel, A1G2, i);
            }
        }
        List list3 = this.A0A;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G3 = C41848B3p.A1G(parcel, list3);
            while (A1G3.hasNext()) {
                C41847B3o.A1I(parcel, A1G3, i);
            }
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public final List BN4() {
        return this.A08;
    }

    public final List BUc() {
        return this.A09;
    }

    public final List Bzq() {
        return this.A0A;
    }

    public final String C5C() {
        return this.A04;
    }

    public final String C5b() {
        return this.A05;
    }

    public final String CDo() {
        return this.A07;
    }

    public final Boolean CYe() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryMultiProductStickerTappableData", CnP.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getMediaId() {
        return this.A02;
    }

    public final String getText() {
        return this.A03;
    }

    public final String getUserId() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public MultiProductSticker(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3) {
        this.A01 = str;
        this.A00 = bool;
        this.A08 = list;
        this.A02 = str2;
        this.A09 = list2;
        this.A0A = list3;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
    }

    public final MultiProductStickerIntf EA8(1E9 r1) {
        return this;
    }
}
