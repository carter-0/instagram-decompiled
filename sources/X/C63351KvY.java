package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.KvY  reason: case insensitive filesystem */
public abstract class C63351KvY {
    public static final Bundle A00(UserSession userSession, MusicAssetModel musicAssetModel) {
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("music_profile_should_open_for_editing", true);
        A09.putParcelable("music_profile_open_for_editing_audio_track", new AudioOverlayTrack(musicAssetModel, musicAssetModel.A05(), musicAssetModel.A00));
        return A09;
    }
}
