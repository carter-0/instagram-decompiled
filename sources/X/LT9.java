package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.List;

public abstract class LT9 {
    public static final AudioPageMetadata A05(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        MusicOverlayStickerModel musicOverlayStickerModel2 = musicOverlayStickerModel;
        0qQ.A0B(musicOverlayStickerModel2, 0);
        String str2 = musicOverlayStickerModel2.A0R;
        Boolean bool = musicOverlayStickerModel2.A0E;
        Boolean A0v = AnonymousClass7TE.A0v();
        if (0qQ.A0K(bool, A0v)) {
            str = musicOverlayStickerModel2.A0S;
        } else {
            str = musicOverlayStickerModel2.A0T;
        }
        String str3 = musicOverlayStickerModel2.A0S;
        String str4 = str3;
        if (!0qQ.A0K(bool, A0v)) {
            str3 = musicOverlayStickerModel2.A0T;
        }
        ImageUrl imageUrl = musicOverlayStickerModel2.A04;
        AudioType audioType = AudioType.MUSIC;
        String str5 = musicOverlayStickerModel2.A0m;
        String str6 = musicOverlayStickerModel2.A0Y;
        MusicDataSource A00 = C59670JTa.A00(musicOverlayStickerModel2);
        boolean A1Z = C51972G9s.A1Z(musicOverlayStickerModel2.A0A);
        boolean z = musicOverlayStickerModel2.A0s;
        boolean A1Z2 = C51972G9s.A1Z(musicOverlayStickerModel2.A0B);
        return new AudioPageMetadata((AudioFilterType) null, imageUrl, (ImageUrl) null, (MusicAttributionConfig) null, audioType, A00, str, str2, str6, str4, str3, musicOverlayStickerModel2.A0e, (String) null, (String) null, (String) null, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, musicOverlayStickerModel2.A0t, A1Z, z, A1Z2, false);
    }

    public static final AudioPageMetadata A06(String str) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        return new AudioPageMetadata((AudioFilterType) null, (ImageUrl) null, (ImageUrl) null, (MusicAttributionConfig) null, (AudioType) null, (MusicDataSource) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false);
    }

    public static final AudioPageMetadata A00(Context context, AudioFilterType audioFilterType, C2606046i r31, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C2606046i r0 = r31;
        String artistId = r0.getArtistId();
        String assetId = r0.getAssetId();
        String audioAssetId = r0.getAudioAssetId();
        String assetId2 = r0.getAssetId();
        ImageUrl AdY = r0.AdY();
        AudioType Adv = r0.Adv();
        Context context2 = context;
        String ACv = r0.ACv(context2);
        String AcV = r0.AcV();
        return new AudioPageMetadata(audioFilterType, AdY, (ImageUrl) null, r0.Col(context2), Adv, r0.BUq(), assetId, artistId, AcV, audioAssetId, assetId2, str, str2, str3, str4, (String) null, ACv, (String) null, str5, str8, (String) null, str6, str7, r0.BYx(), false, z, r0.COz(), r0.CP0(), r0.isEligibleForAudioEffects(), z2);
    }

    public static final AudioPageMetadata A03(TrackData trackData, boolean z) {
        int i;
        Number number;
        TrackData trackData2 = trackData;
        String artistId = trackData2.getArtistId();
        String audioClusterId = trackData2.getAudioClusterId();
        String audioAssetId = trackData2.getAudioAssetId();
        String audioClusterId2 = trackData2.getAudioClusterId();
        ImageUrl Arr = trackData2.Arr();
        AudioType audioType = AudioType.MUSIC;
        String title = trackData2.getTitle();
        String displayArtist = trackData2.getDisplayArtist();
        boolean isExplicit = trackData2.isExplicit();
        boolean A1Z = C51972G9s.A1Z(trackData2.CRq());
        boolean z2 = z;
        MusicAssetModel A01 = MusicAssetModel.A01(trackData2, z2);
        List BDX = trackData2.BDX();
        if (BDX == null || (number = (Number) 00k.A0J(BDX)) == null) {
            i = 0;
        } else {
            i = number.intValue();
        }
        return new AudioPageMetadata((AudioFilterType) null, Arr, (ImageUrl) null, new MusicAttributionConfig((AudioFilterType) null, A01, (String) null, (String) null, i, false, true), audioType, (MusicDataSource) null, audioClusterId, artistId, displayArtist, audioAssetId, audioClusterId2, (String) null, (String) null, (String) null, (String) null, (String) null, title, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, z2, isExplicit, A1Z, false);
    }

    public static final AudioPageMetadata A04(C66569MWx mWx, String str) {
        int i;
        Number number;
        String BfO = mWx.BfO();
        String id = mWx.getId();
        String audioClusterId = mWx.getAudioClusterId();
        ImageUrl As3 = mWx.As3();
        ImageUrl As5 = mWx.As5();
        AudioType CAc = mWx.CAc();
        String title = mWx.getTitle();
        String artistId = mWx.getArtistId();
        String displayArtist = mWx.getDisplayArtist();
        MusicDataSource BUq = mWx.BUq();
        boolean isBookmarked = mWx.isBookmarked();
        boolean isExplicit = mWx.isExplicit();
        boolean isEligibleForAudioEffects = mWx.isEligibleForAudioEffects();
        MusicAssetModel A02 = MusicAssetModel.A02(mWx);
        List BDX = mWx.BDX();
        if (BDX == null || (number = (Number) 00k.A0J(BDX)) == null) {
            i = 0;
        } else {
            i = number.intValue();
        }
        return new AudioPageMetadata((AudioFilterType) null, As3, As5, new MusicAttributionConfig((AudioFilterType) null, A02, (String) null, (String) null, i, false, true), CAc, BUq, BfO, artistId, displayArtist, id, audioClusterId, (String) null, (String) null, (String) null, (String) null, (String) null, title, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, false, false, isBookmarked, isExplicit, isEligibleForAudioEffects, false);
    }

    public static final AudioPageMetadata A01(AudioFilterType audioFilterType, OriginalSoundDataIntf originalSoundDataIntf, boolean z) {
        String id = originalSoundDataIntf.BEv().getId();
        String audioAssetId = originalSoundDataIntf.getAudioAssetId();
        String audioAssetId2 = originalSoundDataIntf.getAudioAssetId();
        String audioAssetId3 = originalSoundDataIntf.getAudioAssetId();
        return new AudioPageMetadata(audioFilterType, originalSoundDataIntf.BEv().Bh3(), (ImageUrl) null, (MusicAttributionConfig) null, AudioType.ORIGINAL_AUDIO, (MusicDataSource) null, audioAssetId, id, originalSoundDataIntf.BEv().getUsername(), audioAssetId2, audioAssetId3, (String) null, (String) null, (String) null, (String) null, (String) null, originalSoundDataIntf.getOriginalAudioTitle(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, z, originalSoundDataIntf.isExplicit(), C51972G9s.A1Z(originalSoundDataIntf.CRq()), false);
    }

    public static final AudioPageMetadata A02(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf) {
        String str;
        AudioType audioType;
        AudioFilterType audioFilterType;
        AudioFilterInfoIntf audioFilterInfoIntf;
        String musicCanonicalId = originalAudioPartMetadataIntf.getMusicCanonicalId();
        String musicCanonicalId2 = originalAudioPartMetadataIntf.getMusicCanonicalId();
        String musicCanonicalId3 = originalAudioPartMetadataIntf.getMusicCanonicalId();
        if (originalAudioPartMetadataIntf.Adu() == MusicCanonicalType.A04) {
            str = originalAudioPartMetadataIntf.getDisplayArtist();
        } else {
            User BEv = originalAudioPartMetadataIntf.BEv();
            if (BEv != null) {
                str = BEv.getUsername();
            } else {
                str = "";
            }
        }
        String displayTitle = originalAudioPartMetadataIntf.getDisplayTitle();
        int ordinal = originalAudioPartMetadataIntf.Adu().ordinal();
        if (ordinal == 1) {
            audioType = AudioType.MUSIC;
        } else if (ordinal == 2) {
            audioType = AudioType.ORIGINAL_AUDIO;
        } else if (ordinal != 0) {
            throw AnonymousClass7TE.A1K();
        } else {
            throw AnonymousClass7TF.A0W(AnonymousClass000.A00(128), originalAudioPartMetadataIntf.Adu().A00);
        }
        ImageUrl C72 = originalAudioPartMetadataIntf.C72();
        boolean isBookmarked = originalAudioPartMetadataIntf.isBookmarked();
        boolean isExplicit = originalAudioPartMetadataIntf.isExplicit();
        boolean A1Z = C51972G9s.A1Z(originalAudioPartMetadataIntf.CRq());
        List Adc = originalAudioPartMetadataIntf.Adc();
        if (Adc == null || (audioFilterInfoIntf = (AudioFilterInfoIntf) 00k.A0J(Adc)) == null) {
            audioFilterType = null;
        } else {
            audioFilterType = audioFilterInfoIntf.B5w();
        }
        return new AudioPageMetadata(audioFilterType, C72, (ImageUrl) null, (MusicAttributionConfig) null, audioType, (MusicDataSource) null, musicCanonicalId, (String) null, str, musicCanonicalId2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, displayTitle, (String) null, (String) null, musicCanonicalId3, (String) null, (String) null, (String) null, (String) null, false, false, isBookmarked, isExplicit, A1Z, false);
    }
}
