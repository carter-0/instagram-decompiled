package X;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6bD  reason: invalid class name and case insensitive filesystem */
public final class C310536bD extends 2Cn {
    public final /* synthetic */ C310516bB A00;

    public C310536bD(C310516bB r1) {
        this.A00 = r1;
    }

    public final void onFail(Exception exc) {
        C310516bB.A00(this.A00);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        C310516bB r3 = this.A00;
        r3.A03 = file.getAbsolutePath();
        ((Dialog) r3.A09.getValue()).dismiss();
        UserSession userSession = r3.A06;
        Class<TransparentModalActivity> cls = TransparentModalActivity.class;
        Bundle bundle = new Bundle();
        bundle.putString("arg_music_pick_template_file_path", r3.A03);
        28D r6 = r3.A00;
        if (r6 == null) {
            str = "cameraEntryPoint";
        } else {
            bundle.putSerializable("arg_music_pick_camera_entry_point", r6);
            MusicPickStickerModel musicPickStickerModel = r3.A02;
            if (musicPickStickerModel == null) {
                str = "musicPickStickerModel";
            } else {
                MusicPickStickerModel A002 = musicPickStickerModel.A00();
                ArrayList A1M = 0sr.A1M(new User[]{AnonymousClass0t1.A01.A01(userSession)});
                A1M.addAll(A002.A00.A09);
                StoryMusicPickTappableData storyMusicPickTappableData = A002.A00;
                TrackData trackData = storyMusicPickTappableData.A04;
                String str2 = storyMusicPickTappableData.A05;
                StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
                String str3 = storyMusicPickTappableData.A06;
                String str4 = storyMusicPickTappableData.A07;
                OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
                int i = storyMusicPickTappableData.A00;
                String str5 = storyMusicPickTappableData.A08;
                String str6 = str4;
                String str7 = str3;
                String str8 = str2;
                TrackData trackData2 = trackData;
                StoryTemplateAssetDict storyTemplateAssetDict = storyMusicPickTappableData.A03;
                StoryMusicPickTappableData A003 = C63029KqK.A00(originalSoundData, storyPromptDisablementState, storyTemplateAssetDict, trackData2, str8, str7, str6, str5, A1M, i);
                A002.A00 = A003;
                int i2 = A003.A00 + 1;
                TrackData trackData3 = A003.A04;
                String str9 = A003.A05;
                StoryPromptDisablementState storyPromptDisablementState2 = A003.A02;
                List list = A003.A09;
                String str10 = A003.A06;
                String str11 = A003.A07;
                A002.A00 = C63029KqK.A00(A003.A01, storyPromptDisablementState2, A003.A03, trackData3, str9, str10, str11, A003.A08, list, i2);
                bundle.putParcelable("arg_music_pick_model", A002);
                MusicPickReelTag musicPickReelTag = r3.A01;
                if (musicPickReelTag == null) {
                    str = "reelTag";
                } else {
                    bundle.putParcelable("arg_music_pick_reel_tag", musicPickReelTag);
                    r3.A03 = null;
                    FragmentActivity fragmentActivity = r3.A05;
                    AnonymousClass6W8.A02(fragmentActivity, bundle, userSession, cls, "reel_music_pick_participation").A0C(fragmentActivity);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
