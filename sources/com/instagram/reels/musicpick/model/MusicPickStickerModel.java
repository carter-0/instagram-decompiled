package com.instagram.reels.musicpick.model;

import X.0qQ;
import X.0sn;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C273914nO;
import X.C2802350v;
import X.C281995Aj;
import X.C317876nz;
import X.C317886o0;
import X.C318046oG;
import X.C63029KqK;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

public final class MusicPickStickerModel implements Parcelable, C2802350v {
    public static final Parcelable.Creator CREATOR = LVO.A00(99);
    public StoryMusicPickTappableData A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public MusicPickStickerModel(List list) {
        this(new StoryMusicPickTappableData((OriginalSoundData) null, C281995Aj.A00(String.valueOf(0)), new StoryTemplateAssetDict((ImageInfo) null, (ImageInfo) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null), (TrackData) null, "", "", "", (String) null, list, 0));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final MusicPickStickerModel A00() {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        int i = storyMusicPickTappableData.A00;
        return new MusicPickStickerModel(C63029KqK.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, storyMusicPickTappableData.A08, list, i));
    }

    public final void A01(OriginalSoundData originalSoundData) {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        int i = storyMusicPickTappableData.A00;
        String str4 = storyMusicPickTappableData.A08;
        this.A00 = C63029KqK.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, str4, list, i);
    }

    public final void A02(TrackData trackData) {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        int i = storyMusicPickTappableData.A00;
        this.A00 = C63029KqK.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, storyMusicPickTappableData.A08, list, i);
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A10;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        C317876nz r0 = C317876nz.A1e;
        A0C.A06 = C317886o0.A06(C318046oG.PLACEHOLDER_STICKER, "placeholder_sticker_id").A01();
        return A0C;
    }

    public MusicPickStickerModel(StoryMusicPickTappableData storyMusicPickTappableData) {
        0qQ.A0B(storyMusicPickTappableData, 1);
        this.A00 = storyMusicPickTappableData;
        this.A01 = AnonymousClass7TF.A1W(storyMusicPickTappableData.A02, StoryPromptDisablementState.DISABLED) ? 1 : 0;
        this.A02 = storyMusicPickTappableData.A06;
        String str = storyMusicPickTappableData.A07;
        this.A03 = str == null ? "" : str;
    }

    public MusicPickStickerModel() {
        this((List) 0sn.A00);
    }
}
