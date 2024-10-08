package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C66635Ma4;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class TrackDataImpl extends AnonymousClass0T0 implements TrackData, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(50);
    public final Lyrics A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final boolean A0N;
    public final boolean A0O;

    public TrackDataImpl(Lyrics lyrics, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, boolean z, boolean z2) {
        0qQ.A0B(imageUrl2, 6);
        String str16 = str8;
        0qQ.A0B(str16, 14);
        this.A0N = z;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A06 = num;
        this.A0D = str7;
        this.A03 = bool;
        this.A0M = list;
        this.A0E = str16;
        this.A0F = str9;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A0O = z2;
        this.A00 = lyrics;
        this.A0G = str10;
        this.A0H = str11;
        this.A0I = str12;
        this.A0J = str13;
        this.A0K = str14;
        this.A0L = str15;
    }

    public final TrackDataImpl FCv() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackDataImpl) {
                TrackDataImpl trackDataImpl = (TrackDataImpl) obj;
                if (this.A0N != trackDataImpl.A0N || !0qQ.A0K(this.A07, trackDataImpl.A07) || !0qQ.A0K(this.A08, trackDataImpl.A08) || !0qQ.A0K(this.A09, trackDataImpl.A09) || !0qQ.A0K(this.A01, trackDataImpl.A01) || !0qQ.A0K(this.A02, trackDataImpl.A02) || !0qQ.A0K(this.A0A, trackDataImpl.A0A) || !0qQ.A0K(this.A0B, trackDataImpl.A0B) || !0qQ.A0K(this.A0C, trackDataImpl.A0C) || !0qQ.A0K(this.A06, trackDataImpl.A06) || !0qQ.A0K(this.A0D, trackDataImpl.A0D) || !0qQ.A0K(this.A03, trackDataImpl.A03) || !0qQ.A0K(this.A0M, trackDataImpl.A0M) || !0qQ.A0K(this.A0E, trackDataImpl.A0E) || !0qQ.A0K(this.A0F, trackDataImpl.A0F) || !0qQ.A0K(this.A04, trackDataImpl.A04) || !0qQ.A0K(this.A05, trackDataImpl.A05) || this.A0O != trackDataImpl.A0O || !0qQ.A0K(this.A00, trackDataImpl.A00) || !0qQ.A0K(this.A0G, trackDataImpl.A0G) || !0qQ.A0K(this.A0H, trackDataImpl.A0H) || !0qQ.A0K(this.A0I, trackDataImpl.A0I) || !0qQ.A0K(this.A0J, trackDataImpl.A0J) || !0qQ.A0K(this.A0K, trackDataImpl.A0K) || !0qQ.A0K(this.A0L, trackDataImpl.A0L)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        Integer num = this.A06;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A0D);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Number> list = this.A0M;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number intValue : list) {
                parcel.writeInt(intValue.intValue());
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
    }

    public final ImageUrl Arq() {
        return this.A01;
    }

    public final ImageUrl Arr() {
        return this.A02;
    }

    public final String Av6() {
        return this.A0A;
    }

    public final Integer AzJ() {
        return this.A06;
    }

    public final Boolean BBW() {
        return this.A03;
    }

    public final List BDX() {
        return this.A0M;
    }

    public final /* bridge */ /* synthetic */ LyricsIntf BOn() {
        return this.A00;
    }

    public final String Bjs() {
        return this.A0H;
    }

    public final String BpH() {
        return this.A0I;
    }

    public final String CGG() {
        return this.A0L;
    }

    public final Boolean CRq() {
        return this.A04;
    }

    public final Boolean CSQ() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTrackData", C66635Ma4.A00(this));
    }

    public final boolean getAllowsSaving() {
        return this.A0N;
    }

    public final String getArtistId() {
        return this.A07;
    }

    public final String getAudioAssetId() {
        return this.A08;
    }

    public final String getAudioClusterId() {
        return this.A09;
    }

    public final String getDashManifest() {
        return this.A0B;
    }

    public final String getDisplayArtist() {
        return this.A0C;
    }

    public final String getFastStartProgressiveDownloadUrl() {
        return this.A0D;
    }

    public final String getId() {
        return this.A0E;
    }

    public final String getIgUsername() {
        return this.A0F;
    }

    public final String getProgressiveDownloadUrl() {
        return this.A0G;
    }

    public final String getSubtitle() {
        return this.A0J;
    }

    public final String getTitle() {
        return this.A0K;
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int i = 1237;
        if (this.A0N) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A07;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.A08;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageUrl.hashCode();
        }
        int hashCode21 = (((i6 + hashCode4) * 31) + this.A02.hashCode()) * 31;
        String str4 = this.A0A;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i7 = (hashCode21 + hashCode5) * 31;
        String str5 = this.A0B;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str6 = this.A0C;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str7 = this.A0D;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        Boolean bool = this.A03;
        if (bool == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        List list = this.A0M;
        if (list == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list.hashCode();
        }
        int hashCode22 = (((i12 + hashCode11) * 31) + this.A0E.hashCode()) * 31;
        String str8 = this.A0F;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i13 = (hashCode22 + hashCode12) * 31;
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool2.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool3.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        int i16 = 1237;
        if (this.A0O) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        Lyrics lyrics = this.A00;
        if (lyrics == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = lyrics.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        String str9 = this.A0G;
        if (str9 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str9.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        String str10 = this.A0H;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        String str11 = this.A0I;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        String str12 = this.A0J;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        String str13 = this.A0K;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        String str14 = this.A0L;
        if (str14 != null) {
            i3 = str14.hashCode();
        }
        return i23 + i3;
    }

    public final boolean isExplicit() {
        return this.A0O;
    }
}
