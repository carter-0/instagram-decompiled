package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C66566MWu;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.MMS;
import X.MVC;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import java.util.List;

public final class MusicSearchPlaylist implements Parcelable, MVC {
    public C66566MWu A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(MMS.A00(this, 13));

    public final AudioBrowserCategoryType AmL() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String valueOf;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(A00().BEO(), i);
        parcel.writeString(JTP.A0s(this));
        if (A00().BdL() == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(A00().BdL());
        }
        parcel.writeString(valueOf);
        parcel.writeList(JTO.A15(this.A01));
        parcel.writeString(JTQ.A0b(this));
    }

    public final C66566MWu A00() {
        C66566MWu mWu = this.A00;
        if (mWu != null) {
            return mWu;
        }
        0qQ.A0F("data");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List Bf2() {
        return JTO.A15(this.A01);
    }

    public MusicSearchPlaylist(C66566MWu mWu) {
        this.A00 = mWu;
    }

    public final MusicSearchPlaylistType A01() {
        AudioBrowserPlaylistType BdL = A00().BdL();
        if (BdL != null) {
            int ordinal = BdL.ordinal();
            if (ordinal == 1) {
                return MusicSearchPlaylistType.ARTIST_SPOTLIGHT;
            }
            if (ordinal == 4) {
                return MusicSearchPlaylistType.FOR_YOU;
            }
            if (ordinal == 5) {
                return MusicSearchPlaylistType.NUMBERED;
            }
            if (ordinal == 8) {
                return MusicSearchPlaylistType.SPOTIFY;
            }
            if (ordinal == 9) {
                return MusicSearchPlaylistType.SPOTIFY_RECENTLY_PLAYED;
            }
        }
        return MusicSearchPlaylistType.DEFAULT;
    }

    public final String getId() {
        return JTP.A0s(this);
    }

    public final String getTitle() {
        return JTQ.A0b(this);
    }
}
