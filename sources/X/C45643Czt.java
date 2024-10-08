package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Czt  reason: case insensitive filesystem */
public abstract class C45643Czt {
    public static StoryMusicPickTappableData parseFromJson(16F r22) {
        String str;
        16F r6 = r22;
        0qQ.A0B(r6, 0);
        try {
            Integer num = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            TrackDataImpl trackDataImpl = null;
            String str2 = null;
            StoryPromptDisablementState storyPromptDisablementState = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            OriginalSoundData originalSoundData = null;
            String str5 = null;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r6);
                } else if ("author_user_pk".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("disablement_state".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    storyPromptDisablementState = C281995Aj.A00(str);
                } else if ("facepile_top_participants".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("media_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r6.A1P();
                    }
                } else if ("original_sound_info".equals(A17)) {
                    originalSoundData = 1dk.parseFromJson(r6);
                } else if ("participant_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("prefilled_music_search_text".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r6.A1P();
                    }
                } else if ("template_asset".equals(A17)) {
                    storyTemplateAssetDict = D00.parseFromJson(r6);
                }
                r6.A0z();
            }
            if (str2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("author_user_pk", r6, "StoryMusicPickTappableData");
            } else if (storyPromptDisablementState == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("disablement_state", r6, "StoryMusicPickTappableData");
            } else if (arrayList == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facepile_top_participants", r6, "StoryMusicPickTappableData");
            } else if (str3 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6, "StoryMusicPickTappableData");
            } else if (str4 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r6, "StoryMusicPickTappableData");
            } else if (num == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("participant_count", r6, "StoryMusicPickTappableData");
            } else if (storyTemplateAssetDict != null || !(r6 instanceof 0c9)) {
                return new StoryMusicPickTappableData(originalSoundData, storyPromptDisablementState, storyTemplateAssetDict, trackDataImpl, str2, str3, str4, str5, arrayList, num.intValue());
            } else {
                AnonymousClass7TF.A1L("template_asset", r6, "StoryMusicPickTappableData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, StoryMusicPickTappableData storyMusicPickTappableData) {
        r2.A0c();
        TrackData trackData = storyMusicPickTappableData.A04;
        if (trackData != null) {
            r2.A0q(MediaStreamTrack.AUDIO_TRACK_KIND);
            AnonymousClass3UP.A00(r2, trackData.FCv());
        }
        String str = storyMusicPickTappableData.A05;
        if (str != null) {
            r2.A0R("author_user_pk", str);
        }
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        if (storyPromptDisablementState != null) {
            r2.A0R("disablement_state", storyPromptDisablementState.A00);
        }
        List list = storyMusicPickTappableData.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "facepile_top_participants", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r2, A0s);
            }
            r2.A0Y();
        }
        C41846B3n.A0y(r2, storyMusicPickTappableData.A06);
        C41846B3n.A11(r2, storyMusicPickTappableData.A07);
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        if (originalSoundData != null) {
            r2.A0q("original_sound_info");
            1dk.A00(r2, originalSoundData);
        }
        r2.A0P("participant_count", storyMusicPickTappableData.A00);
        String str2 = storyMusicPickTappableData.A08;
        if (str2 != null) {
            r2.A0R("prefilled_music_search_text", str2);
        }
        StoryTemplateAssetDict storyTemplateAssetDict = storyMusicPickTappableData.A03;
        if (storyTemplateAssetDict != null) {
            r2.A0q("template_asset");
            D00.A00(r2, storyTemplateAssetDict);
        }
        r2.A0Z();
    }
}
