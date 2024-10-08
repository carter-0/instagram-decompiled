package com.instagram.music.common.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.B4Q;
import X.C376399Hv;
import X.C45436CwH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.User;
import java.util.List;

public final class MusicConsumptionModelImpl extends AnonymousClass0T0 implements MusicConsumptionModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(63);
    public final AudioMutingInfo A00;
    public final MusicMuteAudioReason A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;

    public final MusicConsumptionModelImpl FG6(1E9 r1) {
        return this;
    }

    public final MusicConsumptionModelImpl FG7(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicConsumptionModelImpl) {
                MusicConsumptionModelImpl musicConsumptionModelImpl = (MusicConsumptionModelImpl) obj;
                if (!0qQ.A0K(this.A03, musicConsumptionModelImpl.A03) || !0qQ.A0K(this.A09, musicConsumptionModelImpl.A09) || !0qQ.A0K(this.A0H, musicConsumptionModelImpl.A0H) || !0qQ.A0K(this.A00, musicConsumptionModelImpl.A00) || !0qQ.A0K(this.A04, musicConsumptionModelImpl.A04) || !0qQ.A0K(this.A0D, musicConsumptionModelImpl.A0D) || !0qQ.A0K(this.A0I, musicConsumptionModelImpl.A0I) || !0qQ.A0K(this.A0E, musicConsumptionModelImpl.A0E) || !0qQ.A0K(this.A02, musicConsumptionModelImpl.A02) || !0qQ.A0K(this.A05, musicConsumptionModelImpl.A05) || !0qQ.A0K(this.A06, musicConsumptionModelImpl.A06) || !0qQ.A0K(this.A0A, musicConsumptionModelImpl.A0A) || !0qQ.A0K(this.A0F, musicConsumptionModelImpl.A0F) || !0qQ.A0K(this.A0B, musicConsumptionModelImpl.A0B) || !0qQ.A0K(this.A07, musicConsumptionModelImpl.A07) || this.A0J != musicConsumptionModelImpl.A0J || !0qQ.A0K(this.A0G, musicConsumptionModelImpl.A0G) || this.A01 != musicConsumptionModelImpl.A01 || !0qQ.A0K(this.A08, musicConsumptionModelImpl.A08) || !0qQ.A0K(this.A0C, musicConsumptionModelImpl.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A09;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<Parcelable> list = this.A0H;
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
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0D);
        List<Parcelable> list2 = this.A0I;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Parcelable writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A02, i);
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A06;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.A0A;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0F);
        Integer num3 = this.A0B;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool5 = this.A07;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A01, i);
        Boolean bool6 = this.A08;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Integer num4 = this.A0C;
        if (num4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num4.intValue());
    }

    public MusicConsumptionModelImpl(AudioMutingInfo audioMutingInfo, MusicMuteAudioReason musicMuteAudioReason, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        String str5 = str3;
        0qQ.A0B(str5, 13);
        String str6 = str4;
        0qQ.A0B(str6, 17);
        this.A03 = bool;
        this.A09 = num;
        this.A0H = list;
        this.A00 = audioMutingInfo;
        this.A04 = bool2;
        this.A0D = str;
        this.A0I = list2;
        this.A0E = str2;
        this.A02 = user;
        this.A05 = bool3;
        this.A06 = bool4;
        this.A0A = num2;
        this.A0F = str5;
        this.A0B = num3;
        this.A07 = bool5;
        this.A0J = z;
        this.A0G = str6;
        this.A01 = musicMuteAudioReason;
        this.A08 = bool6;
        this.A0C = num4;
    }

    public final /* bridge */ /* synthetic */ C45436CwH AKe() {
        return new C45436CwH(this);
    }

    public final Boolean Ab6() {
        return this.A03;
    }

    public final Integer AdU() {
        return this.A09;
    }

    public final List Adc() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ AudioMutingInfoIntf Adi() {
        return this.A00;
    }

    public final Boolean AqO() {
        return this.A04;
    }

    public final List Ay7() {
        return this.A0I;
    }

    public final User BEv() {
        return this.A02;
    }

    public final Integer BZg() {
        return this.A0A;
    }

    public final Integer BfI() {
        return this.A0B;
    }

    public final Boolean Bty() {
        return this.A07;
    }

    public final MusicMuteAudioReason BuG() {
        return this.A01;
    }

    public final Boolean BuU() {
        return this.A08;
    }

    public final Integer C9r() {
        return this.A0C;
    }

    public final Boolean CPZ() {
        return this.A05;
    }

    public final Boolean Cde() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicConsumptionInfoDict", B4Q.A00(this));
    }

    public final String getDerivedContentId() {
        return this.A0D;
    }

    public final String getFormattedClipsMediaCount() {
        return this.A0E;
    }

    public final String getPlaceholderProfilePicUrl() {
        return this.A0F;
    }

    public final boolean getShouldMuteAudio() {
        return this.A0J;
    }

    public final String getShouldMuteAudioReason() {
        return this.A0G;
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
        Boolean bool = this.A03;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.A09;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.A0H;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AudioMutingInfo audioMutingInfo = this.A00;
        if (audioMutingInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = audioMutingInfo.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str = this.A0D;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List list2 = this.A0I;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str2 = this.A0E;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        User user = this.A02;
        if (user == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = user.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool4 = this.A06;
        if (bool4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool4.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Integer num2 = this.A0A;
        if (num2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num2.hashCode();
        }
        int hashCode17 = (((i12 + hashCode12) * 31) + this.A0F.hashCode()) * 31;
        Integer num3 = this.A0B;
        if (num3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num3.hashCode();
        }
        int i13 = (hashCode17 + hashCode13) * 31;
        Boolean bool5 = this.A07;
        if (bool5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool5.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        int i15 = 1237;
        if (this.A0J) {
            i15 = 1231;
        }
        int hashCode18 = (((i14 + i15) * 31) + this.A0G.hashCode()) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A01;
        if (musicMuteAudioReason == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = musicMuteAudioReason.hashCode();
        }
        int i16 = (hashCode18 + hashCode15) * 31;
        Boolean bool6 = this.A08;
        if (bool6 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool6.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Integer num4 = this.A0C;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return i17 + i;
    }

    public final MusicConsumptionModel EAF(1E9 r1) {
        return this;
    }
}
