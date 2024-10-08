package com.instagram.music.common.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.B5Q;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class MusicOverlayStickerModel extends AnonymousClass0T0 implements MusicOverlayStickerModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(65);
    public final AudioMutingInfo A00;
    public final MusicMuteAudioReason A01;
    public final MusicProduct A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final User A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final List A0o;
    public final List A0p;
    public final List A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;

    public final MusicOverlayStickerModel FG8(1E9 r1) {
        return this;
    }

    public final MusicOverlayStickerModel FG9(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicOverlayStickerModel) {
                MusicOverlayStickerModel musicOverlayStickerModel = (MusicOverlayStickerModel) obj;
                if (!0qQ.A0K(this.A0Q, musicOverlayStickerModel.A0Q) || !0qQ.A0K(this.A06, musicOverlayStickerModel.A06) || this.A0r != musicOverlayStickerModel.A0r || !0qQ.A0K(this.A0R, musicOverlayStickerModel.A0R) || !0qQ.A0K(this.A0S, musicOverlayStickerModel.A0S) || !0qQ.A0K(this.A0K, musicOverlayStickerModel.A0K) || !0qQ.A0K(this.A0L, musicOverlayStickerModel.A0L) || !0qQ.A0K(this.A0T, musicOverlayStickerModel.A0T) || !0qQ.A0K(this.A0o, musicOverlayStickerModel.A0o) || !0qQ.A0K(this.A00, musicOverlayStickerModel.A00) || !0qQ.A0K(this.A0U, musicOverlayStickerModel.A0U) || !0qQ.A0K(this.A07, musicOverlayStickerModel.A07) || !0qQ.A0K(this.A03, musicOverlayStickerModel.A03) || !0qQ.A0K(this.A04, musicOverlayStickerModel.A04) || !0qQ.A0K(this.A0V, musicOverlayStickerModel.A0V) || !0qQ.A0K(this.A0W, musicOverlayStickerModel.A0W) || !0qQ.A0K(this.A0X, musicOverlayStickerModel.A0X) || !0qQ.A0K(this.A0M, musicOverlayStickerModel.A0M) || !0qQ.A0K(this.A0Y, musicOverlayStickerModel.A0Y) || !0qQ.A0K(this.A0p, musicOverlayStickerModel.A0p) || !0qQ.A0K(this.A0N, musicOverlayStickerModel.A0N) || !0qQ.A0K(this.A0Z, musicOverlayStickerModel.A0Z) || !0qQ.A0K(this.A0a, musicOverlayStickerModel.A0a) || !0qQ.A0K(this.A08, musicOverlayStickerModel.A08) || !0qQ.A0K(this.A09, musicOverlayStickerModel.A09) || !0qQ.A0K(this.A0q, musicOverlayStickerModel.A0q) || !0qQ.A0K(this.A0b, musicOverlayStickerModel.A0b) || !0qQ.A0K(this.A05, musicOverlayStickerModel.A05) || !0qQ.A0K(this.A0c, musicOverlayStickerModel.A0c) || !0qQ.A0K(this.A0A, musicOverlayStickerModel.A0A) || !0qQ.A0K(this.A0B, musicOverlayStickerModel.A0B) || !0qQ.A0K(this.A0C, musicOverlayStickerModel.A0C) || this.A0s != musicOverlayStickerModel.A0s || !0qQ.A0K(this.A0D, musicOverlayStickerModel.A0D) || !0qQ.A0K(this.A0E, musicOverlayStickerModel.A0E) || !0qQ.A0K(this.A0F, musicOverlayStickerModel.A0F) || !0qQ.A0K(this.A0d, musicOverlayStickerModel.A0d) || this.A02 != musicOverlayStickerModel.A02 || !0qQ.A0K(this.A0e, musicOverlayStickerModel.A0e) || !0qQ.A0K(this.A0O, musicOverlayStickerModel.A0O) || !0qQ.A0K(this.A0G, musicOverlayStickerModel.A0G) || !0qQ.A0K(this.A0f, musicOverlayStickerModel.A0f) || !0qQ.A0K(this.A0g, musicOverlayStickerModel.A0g) || !0qQ.A0K(this.A0h, musicOverlayStickerModel.A0h) || !0qQ.A0K(this.A0i, musicOverlayStickerModel.A0i) || !0qQ.A0K(this.A0H, musicOverlayStickerModel.A0H) || this.A0t != musicOverlayStickerModel.A0t || !0qQ.A0K(this.A0j, musicOverlayStickerModel.A0j) || this.A01 != musicOverlayStickerModel.A01 || !0qQ.A0K(this.A0I, musicOverlayStickerModel.A0I) || !0qQ.A0K(this.A0J, musicOverlayStickerModel.A0J) || !0qQ.A0K(this.A0k, musicOverlayStickerModel.A0k) || !0qQ.A0K(this.A0l, musicOverlayStickerModel.A0l) || !0qQ.A0K(this.A0m, musicOverlayStickerModel.A0m) || !0qQ.A0K(this.A0P, musicOverlayStickerModel.A0P) || !0qQ.A0K(this.A0n, musicOverlayStickerModel.A0n)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0Q);
        Boolean bool = this.A06;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        Integer num = this.A0K;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A0L;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0T);
        List<Parcelable> list = this.A0o;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0U);
        Boolean bool2 = this.A07;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0X);
        Integer num3 = this.A0M;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A0Y);
        List<Parcelable> list2 = this.A0p;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Parcelable writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        }
        Integer num4 = this.A0N;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0a);
        Boolean bool3 = this.A08;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A09;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        List<Number> list3 = this.A0q;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Number intValue : list3) {
                parcel.writeInt(intValue.intValue());
            }
        }
        parcel.writeString(this.A0b);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0c);
        Boolean bool5 = this.A0A;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A0B;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A0C;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0s ? 1 : 0);
        Boolean bool8 = this.A0D;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.A0E;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.A0F;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0d);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0e);
        Integer num5 = this.A0O;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool11 = this.A0G;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0g);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0i);
        Boolean bool12 = this.A0H;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeString(this.A0j);
        parcel.writeParcelable(this.A01, i);
        Boolean bool13 = this.A0I;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.A0J;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0k);
        parcel.writeString(this.A0l);
        parcel.writeString(this.A0m);
        Integer num6 = this.A0P;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.A0n);
    }

    public final String Aab() {
        return this.A0Q;
    }

    public final Boolean Ab6() {
        return this.A06;
    }

    public final Integer AdU() {
        return this.A0K;
    }

    public final Integer AdV() {
        return this.A0L;
    }

    public final List Adc() {
        return this.A0o;
    }

    public final /* bridge */ /* synthetic */ AudioMutingInfoIntf Adi() {
        return this.A00;
    }

    public final String AiB() {
        return this.A0U;
    }

    public final Boolean AqO() {
        return this.A07;
    }

    public final ImageUrl Arq() {
        return this.A03;
    }

    public final ImageUrl Arr() {
        return this.A04;
    }

    public final String Av6() {
        return this.A0V;
    }

    public final Integer AwQ() {
        return this.A0M;
    }

    public final List Ay7() {
        return this.A0p;
    }

    public final Integer AzJ() {
        return this.A0N;
    }

    public final Boolean BBW() {
        return this.A08;
    }

    public final Boolean BDF() {
        return this.A09;
    }

    public final List BDX() {
        return this.A0q;
    }

    public final User BEv() {
        return this.A05;
    }

    public final String BNb() {
        return this.A0d;
    }

    public final MusicProduct BUy() {
        return this.A02;
    }

    public final Integer BZg() {
        return this.A0O;
    }

    public final Boolean BcJ() {
        return this.A0G;
    }

    public final String Bjs() {
        return this.A0h;
    }

    public final String BpH() {
        return this.A0i;
    }

    public final Boolean Bty() {
        return this.A0H;
    }

    public final MusicMuteAudioReason BuG() {
        return this.A01;
    }

    public final Boolean BuU() {
        return this.A0I;
    }

    public final Boolean Bur() {
        return this.A0J;
    }

    public final Integer C9r() {
        return this.A0P;
    }

    public final String CGG() {
        return this.A0n;
    }

    public final Boolean CPZ() {
        return this.A0A;
    }

    public final Boolean CRq() {
        return this.A0B;
    }

    public final Boolean CSQ() {
        return this.A0C;
    }

    public final Boolean CWa() {
        return this.A0D;
    }

    public final Boolean CYk() {
        return this.A0E;
    }

    public final Boolean Cde() {
        return this.A0F;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFlattenedMusicInfo", B5Q.A00(this));
    }

    public final boolean getAllowsSaving() {
        return this.A0r;
    }

    public final String getArtistId() {
        return this.A0R;
    }

    public final String getAudioAssetId() {
        return this.A0S;
    }

    public final String getAudioClusterId() {
        return this.A0T;
    }

    public final String getDashManifest() {
        return this.A0W;
    }

    public final String getDerivedContentId() {
        return this.A0X;
    }

    public final String getDisplayArtist() {
        return this.A0Y;
    }

    public final String getFastStartProgressiveDownloadUrl() {
        return this.A0Z;
    }

    public final String getFormattedClipsMediaCount() {
        return this.A0a;
    }

    public final String getId() {
        return this.A0b;
    }

    public final String getIgUsername() {
        return this.A0c;
    }

    public final String getOriginalMediaId() {
        return this.A0e;
    }

    public final String getPlaceholderProfilePicUrl() {
        return this.A0f;
    }

    public final String getProgressiveDownloadUrl() {
        return this.A0g;
    }

    public final boolean getShouldMuteAudio() {
        return this.A0t;
    }

    public final String getShouldMuteAudioReason() {
        return this.A0j;
    }

    public final String getSubtitle() {
        return this.A0k;
    }

    public final String getTag() {
        return this.A0l;
    }

    public final String getTitle() {
        return this.A0m;
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
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        String str = this.A0Q;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.A06;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0r) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str2 = this.A0R;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str3 = this.A0S;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Integer num = this.A0K;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        Integer num2 = this.A0L;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str4 = this.A0T;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        List list = this.A0o;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        AudioMutingInfo audioMutingInfo = this.A00;
        if (audioMutingInfo == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = audioMutingInfo.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str5 = this.A0U;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        Boolean bool2 = this.A07;
        if (bool2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool2.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        ImageUrl imageUrl = this.A03;
        if (imageUrl == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = imageUrl.hashCode();
        }
        int hashCode49 = (((i14 + hashCode12) * 31) + this.A04.hashCode()) * 31;
        String str6 = this.A0V;
        if (str6 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str6.hashCode();
        }
        int i15 = (hashCode49 + hashCode13) * 31;
        String str7 = this.A0W;
        if (str7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str7.hashCode();
        }
        int i16 = (i15 + hashCode14) * 31;
        String str8 = this.A0X;
        if (str8 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str8.hashCode();
        }
        int i17 = (i16 + hashCode15) * 31;
        Integer num3 = this.A0M;
        if (num3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num3.hashCode();
        }
        int i18 = (i17 + hashCode16) * 31;
        String str9 = this.A0Y;
        if (str9 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str9.hashCode();
        }
        int i19 = (i18 + hashCode17) * 31;
        List list2 = this.A0p;
        if (list2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list2.hashCode();
        }
        int i20 = (i19 + hashCode18) * 31;
        Integer num4 = this.A0N;
        if (num4 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num4.hashCode();
        }
        int i21 = (i20 + hashCode19) * 31;
        String str10 = this.A0Z;
        if (str10 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str10.hashCode();
        }
        int i22 = (i21 + hashCode20) * 31;
        String str11 = this.A0a;
        if (str11 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str11.hashCode();
        }
        int i23 = (i22 + hashCode21) * 31;
        Boolean bool3 = this.A08;
        if (bool3 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool3.hashCode();
        }
        int i24 = (i23 + hashCode22) * 31;
        Boolean bool4 = this.A09;
        if (bool4 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool4.hashCode();
        }
        int i25 = (i24 + hashCode23) * 31;
        List list3 = this.A0q;
        if (list3 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = list3.hashCode();
        }
        int hashCode50 = (((i25 + hashCode24) * 31) + this.A0b.hashCode()) * 31;
        User user = this.A05;
        if (user == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = user.hashCode();
        }
        int i26 = (hashCode50 + hashCode25) * 31;
        String str12 = this.A0c;
        if (str12 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str12.hashCode();
        }
        int i27 = (i26 + hashCode26) * 31;
        Boolean bool5 = this.A0A;
        if (bool5 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = bool5.hashCode();
        }
        int i28 = (i27 + hashCode27) * 31;
        Boolean bool6 = this.A0B;
        if (bool6 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = bool6.hashCode();
        }
        int i29 = (i28 + hashCode28) * 31;
        Boolean bool7 = this.A0C;
        if (bool7 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = bool7.hashCode();
        }
        int i30 = (i29 + hashCode29) * 31;
        int i31 = 1237;
        if (this.A0s) {
            i31 = 1231;
        }
        int i32 = (i30 + i31) * 31;
        Boolean bool8 = this.A0D;
        if (bool8 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool8.hashCode();
        }
        int i33 = (i32 + hashCode30) * 31;
        Boolean bool9 = this.A0E;
        if (bool9 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = bool9.hashCode();
        }
        int i34 = (i33 + hashCode31) * 31;
        Boolean bool10 = this.A0F;
        if (bool10 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = bool10.hashCode();
        }
        int i35 = (i34 + hashCode32) * 31;
        String str13 = this.A0d;
        if (str13 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str13.hashCode();
        }
        int i36 = (i35 + hashCode33) * 31;
        MusicProduct musicProduct = this.A02;
        if (musicProduct == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = musicProduct.hashCode();
        }
        int i37 = (i36 + hashCode34) * 31;
        String str14 = this.A0e;
        if (str14 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str14.hashCode();
        }
        int i38 = (i37 + hashCode35) * 31;
        Integer num5 = this.A0O;
        if (num5 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = num5.hashCode();
        }
        int i39 = (i38 + hashCode36) * 31;
        Boolean bool11 = this.A0G;
        if (bool11 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = bool11.hashCode();
        }
        int hashCode51 = (((i39 + hashCode37) * 31) + this.A0f.hashCode()) * 31;
        String str15 = this.A0g;
        if (str15 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = str15.hashCode();
        }
        int i40 = (hashCode51 + hashCode38) * 31;
        String str16 = this.A0h;
        if (str16 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = str16.hashCode();
        }
        int i41 = (i40 + hashCode39) * 31;
        String str17 = this.A0i;
        if (str17 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = str17.hashCode();
        }
        int i42 = (i41 + hashCode40) * 31;
        Boolean bool12 = this.A0H;
        if (bool12 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = bool12.hashCode();
        }
        int i43 = (i42 + hashCode41) * 31;
        int i44 = 1237;
        if (this.A0t) {
            i44 = 1231;
        }
        int hashCode52 = (((i43 + i44) * 31) + this.A0j.hashCode()) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A01;
        if (musicMuteAudioReason == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = musicMuteAudioReason.hashCode();
        }
        int i45 = (hashCode52 + hashCode42) * 31;
        Boolean bool13 = this.A0I;
        if (bool13 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = bool13.hashCode();
        }
        int i46 = (i45 + hashCode43) * 31;
        Boolean bool14 = this.A0J;
        if (bool14 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = bool14.hashCode();
        }
        int i47 = (i46 + hashCode44) * 31;
        String str18 = this.A0k;
        if (str18 == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = str18.hashCode();
        }
        int i48 = (i47 + hashCode45) * 31;
        String str19 = this.A0l;
        if (str19 == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = str19.hashCode();
        }
        int i49 = (i48 + hashCode46) * 31;
        String str20 = this.A0m;
        if (str20 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = str20.hashCode();
        }
        int i50 = (i49 + hashCode47) * 31;
        Integer num6 = this.A0P;
        if (num6 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = num6.hashCode();
        }
        int i51 = (i50 + hashCode48) * 31;
        String str21 = this.A0n;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return i51 + i;
    }

    public final boolean isExplicit() {
        return this.A0s;
    }

    public final MusicOverlayStickerModelIntf EAG(1E9 r1) {
        return this;
    }

    public MusicOverlayStickerModel(AudioMutingInfo audioMutingInfo, MusicMuteAudioReason musicMuteAudioReason, MusicProduct musicProduct, ImageUrl imageUrl, ImageUrl imageUrl2, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(imageUrl2, 14);
        String str25 = str12;
        0qQ.A0B(str25, 27);
        String str26 = str16;
        0qQ.A0B(str26, 42);
        String str27 = str20;
        0qQ.A0B(str27, 48);
        this.A0Q = str;
        this.A06 = bool;
        this.A0r = z;
        this.A0R = str2;
        this.A0S = str3;
        this.A0K = num;
        this.A0L = num2;
        this.A0T = str4;
        this.A0o = list;
        this.A00 = audioMutingInfo;
        this.A0U = str5;
        this.A07 = bool2;
        this.A03 = imageUrl;
        this.A04 = imageUrl2;
        this.A0V = str6;
        this.A0W = str7;
        this.A0X = str8;
        this.A0M = num3;
        this.A0Y = str9;
        this.A0p = list2;
        this.A0N = num4;
        this.A0Z = str10;
        this.A0a = str11;
        this.A08 = bool3;
        this.A09 = bool4;
        this.A0q = list3;
        this.A0b = str25;
        this.A05 = user;
        this.A0c = str13;
        this.A0A = bool5;
        this.A0B = bool6;
        this.A0C = bool7;
        this.A0s = z2;
        this.A0D = bool8;
        this.A0E = bool9;
        this.A0F = bool10;
        this.A0d = str14;
        this.A02 = musicProduct;
        this.A0e = str15;
        this.A0O = num5;
        this.A0G = bool11;
        this.A0f = str26;
        this.A0g = str17;
        this.A0h = str18;
        this.A0i = str19;
        this.A0H = bool12;
        this.A0t = z3;
        this.A0j = str27;
        this.A01 = musicMuteAudioReason;
        this.A0I = bool13;
        this.A0J = bool14;
        this.A0k = str21;
        this.A0l = str22;
        this.A0m = str23;
        this.A0P = num6;
        this.A0n = str24;
    }
}
