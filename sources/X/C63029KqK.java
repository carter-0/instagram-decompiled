package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import java.util.List;

/* renamed from: X.KqK  reason: case insensitive filesystem */
public abstract class C63029KqK {
    public static StoryMusicPickTappableData A00(OriginalSoundDataIntf originalSoundDataIntf, StoryPromptDisablementState storyPromptDisablementState, StoryTemplateAssetDictIntf storyTemplateAssetDictIntf, TrackData trackData, String str, String str2, String str3, String str4, List list, int i) {
        TrackDataImpl trackDataImpl;
        OriginalSoundData originalSoundData = null;
        1E9 A0p = C41847B3o.A0p();
        if (trackData != null) {
            trackDataImpl = trackData.FCv();
        } else {
            trackDataImpl = null;
        }
        if (originalSoundDataIntf != null) {
            originalSoundData = originalSoundDataIntf.F7E(A0p);
        }
        return new StoryMusicPickTappableData(originalSoundData, storyPromptDisablementState, storyTemplateAssetDictIntf.FBV(), trackDataImpl, str, str2, str3, str4, list, i);
    }
}
