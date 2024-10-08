package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C44227Cao;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class MusicNoteResponseInfo extends AnonymousClass0T0 implements Parcelable, MusicNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376389Hu(76);
    public final MusicInfo A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;

    public MusicNoteResponseInfo(MusicInfo musicInfo, User user, Boolean bool, Boolean bool2, Integer num, String str) {
        0qQ.A0B(musicInfo, 3);
        this.A02 = bool;
        this.A03 = bool2;
        this.A00 = musicInfo;
        this.A04 = num;
        this.A01 = user;
        this.A05 = str;
    }

    public final MusicNoteResponseInfo F6Z(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicNoteResponseInfo) {
                MusicNoteResponseInfo musicNoteResponseInfo = (MusicNoteResponseInfo) obj;
                if (!0qQ.A0K(this.A02, musicNoteResponseInfo.A02) || !0qQ.A0K(this.A03, musicNoteResponseInfo.A03) || !0qQ.A0K(this.A00, musicNoteResponseInfo.A00) || !0qQ.A0K(this.A04, musicNoteResponseInfo.A04) || !0qQ.A0K(this.A01, musicNoteResponseInfo.A01) || !0qQ.A0K(this.A05, musicNoteResponseInfo.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A03;
        int hashCode2 = (((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.A00.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        User user = this.A01;
        int hashCode4 = (hashCode3 + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
    }

    public final MusicInfo BUr() {
        return this.A00;
    }

    public final Integer BXH() {
        return this.A04;
    }

    public final User BYz() {
        return this.A01;
    }

    public final String Brj() {
        return this.A05;
    }

    public final Boolean Can() {
        return this.A02;
    }

    public final Boolean CcP() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicNoteResponseInfo", C44227Cao.A00(this));
    }
}
