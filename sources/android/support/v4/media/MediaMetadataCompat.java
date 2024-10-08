package android.support.v4.media;

import X.0yf;
import X.C7216Pzk;
import X.Pxe;
import X.Pxi;
import X.RLD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final 0yf A01;
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(2);
    public final Bundle A00;

    static {
        0yf A0N = Pxe.A0N(0);
        A01 = A0N;
        A0N.put("android.media.metadata.TITLE", 1);
        A0N.put("android.media.metadata.ARTIST", 1);
        A0N.put("android.media.metadata.DURATION", 0);
        A0N.put("android.media.metadata.ALBUM", 1);
        A0N.put("android.media.metadata.AUTHOR", 1);
        A0N.put("android.media.metadata.WRITER", 1);
        A0N.put("android.media.metadata.COMPOSER", 1);
        A0N.put("android.media.metadata.COMPILATION", 1);
        A0N.put("android.media.metadata.DATE", 1);
        A0N.put("android.media.metadata.YEAR", 0);
        A0N.put("android.media.metadata.GENRE", 1);
        A0N.put("android.media.metadata.TRACK_NUMBER", 0);
        A0N.put("android.media.metadata.NUM_TRACKS", 0);
        A0N.put("android.media.metadata.DISC_NUMBER", 0);
        A0N.put("android.media.metadata.ALBUM_ARTIST", 1);
        A0N.put("android.media.metadata.ART", 2);
        A0N.put("android.media.metadata.ART_URI", 1);
        A0N.put("android.media.metadata.ALBUM_ART", 2);
        A0N.put("android.media.metadata.ALBUM_ART_URI", 1);
        A0N.put("android.media.metadata.USER_RATING", 3);
        A0N.put("android.media.metadata.RATING", 3);
        A0N.put("android.media.metadata.DISPLAY_TITLE", 1);
        A0N.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        A0N.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        A0N.put("android.media.metadata.DISPLAY_ICON", 2);
        A0N.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        A0N.put("android.media.metadata.MEDIA_ID", 1);
        A0N.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        A0N.put("android.media.metadata.MEDIA_URI", 1);
        A0N.put("android.media.metadata.ADVERTISEMENT", 0);
        A0N.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = Pxi.A0D(parcel, RLD.class);
    }
}
