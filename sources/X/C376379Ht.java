package X;

import com.instagram.api.schemas.ImmutablePandoAudioMutingInfo;
import com.instagram.api.schemas.ImmutablePandoMusicInfo;
import com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.ImmutablePandoNotePogVideoDict;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.model.mediasize.ImmutablePandoAdditionalCandidates;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoSpriteSheetInfoCandidates;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;

/* renamed from: X.9Ht  reason: invalid class name and case insensitive filesystem */
public final class C376379Ht extends C3035269k {
    public final int A00;

    public C376379Ht(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoAudioMutingInfo[i];
            case 1:
                return new ImmutablePandoMusicInfo[i];
            case 2:
                return new ImmutablePandoMusicNoteResponseInfo[i];
            case 3:
                return new ImmutablePandoNoteEmojiReactionInfo[i];
            case 4:
                return new ImmutablePandoNotePogVideoDict[i];
            case 5:
                return new ImmutablePandoTrackData[i];
            case 6:
                return new ImmutablePandoAdditionalCandidates[i];
            case 7:
                return new ImmutablePandoImageInfo[i];
            case 8:
                return new ImmutablePandoSpriteSheetInfoCandidates[i];
            case 9:
                return new ImmutablePandoVideoVersion[i];
            case 10:
                return new ImmutablePandoMusicConsumptionModel[i];
            default:
                return new ImmutablePandoFriendshipStatus[i];
        }
    }
}
