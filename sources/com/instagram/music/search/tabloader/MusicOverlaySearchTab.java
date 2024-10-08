package com.instagram.music.search.tabloader;

import X.0qQ;
import X.C64181LSn;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;

public final class MusicOverlaySearchTab implements Parcelable {
    public static final MusicOverlaySearchTab A03 = new MusicOverlaySearchTab(2131967820, "boost_audio_browser");
    public static final MusicOverlaySearchTab A04 = new MusicOverlaySearchTab(2131967812, "browse");
    public static final MusicOverlaySearchTab A05 = new MusicOverlaySearchTab(2131967821, "clips_browse");
    public static final MusicOverlaySearchTab A06 = new MusicOverlaySearchTab(2131967814, "genres");
    public static final MusicOverlaySearchTab A07 = new MusicOverlaySearchTab(2131967815, "gallery");
    public static final MusicOverlaySearchTab A08 = new MusicOverlaySearchTab(2131967816, "moods");
    public static final MusicOverlaySearchTab A09 = new MusicOverlaySearchTab(C64181LSn.A03("playlists", "bookmarked", "Saved"), (MusicBrowserCategoryModel) null, 2131967819);
    public static final MusicOverlaySearchTab A0A = new MusicOverlaySearchTab(2131967817, "saved_music");
    public static final MusicOverlaySearchTab A0B = new MusicOverlaySearchTab(2131967818, "saved_original_audio");
    public static final MusicOverlaySearchTab A0C = new MusicOverlaySearchTab(2131967821, "stories_browse");
    public static final MusicOverlaySearchTab A0D = new MusicOverlaySearchTab(2131967821, "trending");
    public static final Parcelable.Creator CREATOR = LVO.A00(58);
    public final int A00;
    public final MusicBrowseCategory A01;
    public final MusicBrowserCategoryModel A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public MusicOverlaySearchTab(MusicBrowseCategory musicBrowseCategory, MusicBrowserCategoryModel musicBrowserCategoryModel, int i) {
        this.A00 = i;
        this.A01 = musicBrowseCategory;
        this.A02 = musicBrowserCategoryModel;
    }

    public MusicOverlaySearchTab(int i, String str) {
        this(C64181LSn.A01(str), (MusicBrowserCategoryModel) null, i);
    }
}
