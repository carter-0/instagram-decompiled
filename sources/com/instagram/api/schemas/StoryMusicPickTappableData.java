package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44413CeX;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class StoryMusicPickTappableData extends AnonymousClass0T0 implements Parcelable, StoryMusicPickTappableDataIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(97);
    public final int A00;
    public final OriginalSoundData A01;
    public final StoryPromptDisablementState A02;
    public final StoryTemplateAssetDict A03;
    public final TrackData A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final StoryMusicPickTappableData FAV(1E9 r1) {
        return this;
    }

    public final StoryMusicPickTappableData FAW(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryMusicPickTappableData) {
                StoryMusicPickTappableData storyMusicPickTappableData = (StoryMusicPickTappableData) obj;
                if (!0qQ.A0K(this.A04, storyMusicPickTappableData.A04) || !0qQ.A0K(this.A05, storyMusicPickTappableData.A05) || this.A02 != storyMusicPickTappableData.A02 || !0qQ.A0K(this.A09, storyMusicPickTappableData.A09) || !0qQ.A0K(this.A06, storyMusicPickTappableData.A06) || !0qQ.A0K(this.A07, storyMusicPickTappableData.A07) || !0qQ.A0K(this.A01, storyMusicPickTappableData.A01) || this.A00 != storyMusicPickTappableData.A00 || !0qQ.A0K(this.A08, storyMusicPickTappableData.A08) || !0qQ.A0K(this.A03, storyMusicPickTappableData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A09);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
    }

    public final TrackData AdQ() {
        return this.A04;
    }

    public final String Ae0() {
        return this.A05;
    }

    public final StoryPromptDisablementState Axh() {
        return this.A02;
    }

    public final List B3f() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZB() {
        return this.A01;
    }

    public final int Bak() {
        return this.A00;
    }

    public final String Ben() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ StoryTemplateAssetDictIntf C4X() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryMusicPickTappableData", C44413CeX.A00(this));
    }

    public final String getId() {
        return this.A06;
    }

    public final String getMediaId() {
        return this.A07;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A05, AnonymousClass7TG.A0C(this.A04) * 31))));
        return AnonymousClass7TE.A0N(this.A03, (((((AnonymousClass7TF.A08(this.A07, A082) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + C41845B3m.A00(this.A08)) * 31);
    }

    public StoryMusicPickTappableData(OriginalSoundData originalSoundData, StoryPromptDisablementState storyPromptDisablementState, StoryTemplateAssetDict storyTemplateAssetDict, TrackData trackData, String str, String str2, String str3, String str4, List list, int i) {
        AnonymousClass7TG.A1Q(str, storyPromptDisablementState);
        AnonymousClass7TG.A1R(list, str2);
        0qQ.A0B(str3, 6);
        0qQ.A0B(storyTemplateAssetDict, 10);
        this.A04 = trackData;
        this.A05 = str;
        this.A02 = storyPromptDisablementState;
        this.A09 = list;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = originalSoundData;
        this.A00 = i;
        this.A08 = str4;
        this.A03 = storyTemplateAssetDict;
    }

    public final StoryMusicPickTappableDataIntf E8k(1E9 r1) {
        return this;
    }
}
