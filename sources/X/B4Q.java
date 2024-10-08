package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4Q {
    public static Map A00(MusicConsumptionModel musicConsumptionModel) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (musicConsumptionModel.Ab6() != null) {
            A1H.put("allow_media_creation_with_music", musicConsumptionModel.Ab6());
        }
        if (musicConsumptionModel.AdU() != null) {
            A1H.put("audio_asset_start_time_in_ms", musicConsumptionModel.AdU());
        }
        String str = null;
        if (musicConsumptionModel.Adc() != null) {
            List<AudioFilterInfoIntf> Adc = musicConsumptionModel.Adc();
            if (Adc != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (AudioFilterInfoIntf audioFilterInfoIntf : Adc) {
                    if (audioFilterInfoIntf != null) {
                        arrayList2.add(audioFilterInfoIntf.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("audio_filter_infos", arrayList2);
        }
        if (musicConsumptionModel.Adi() != null) {
            AudioMutingInfoIntf Adi = musicConsumptionModel.Adi();
            if (Adi != null) {
                treeUpdaterJNI = Adi.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("audio_muting_info", treeUpdaterJNI);
        }
        if (musicConsumptionModel.AqO() != null) {
            A1H.put("contains_lyrics", musicConsumptionModel.AqO());
        }
        if (musicConsumptionModel.getDerivedContentId() != null) {
            A1H.put("derived_content_id", musicConsumptionModel.getDerivedContentId());
        }
        if (musicConsumptionModel.Ay7() != null) {
            List<AudioMetadataLabels> Ay7 = musicConsumptionModel.Ay7();
            if (Ay7 != null) {
                arrayList = AnonymousClass7TG.A0r(Ay7);
                for (AudioMetadataLabels audioMetadataLabels : Ay7) {
                    0qQ.A0B(audioMetadataLabels, 0);
                    arrayList.add(audioMetadataLabels.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("display_labels", arrayList);
        }
        if (musicConsumptionModel.getFormattedClipsMediaCount() != null) {
            A1H.put("formatted_clips_media_count", musicConsumptionModel.getFormattedClipsMediaCount());
        }
        User BEv = musicConsumptionModel.BEv();
        if (BEv != null) {
            A1H.put("ig_artist", BEv.A08());
        }
        if (musicConsumptionModel.CPZ() != null) {
            A1H.put("is_bookmarked", musicConsumptionModel.CPZ());
        }
        if (musicConsumptionModel.Cde() != null) {
            A1H.put("is_trending_in_clips", musicConsumptionModel.Cde());
        }
        if (musicConsumptionModel.BZg() != null) {
            A1H.put("overlap_duration_in_ms", musicConsumptionModel.BZg());
        }
        if (musicConsumptionModel.getPlaceholderProfilePicUrl() != null) {
            A1H.put("placeholder_profile_pic_url", musicConsumptionModel.getPlaceholderProfilePicUrl());
        }
        if (musicConsumptionModel.BfI() != null) {
            A1H.put("previous_trend_rank", musicConsumptionModel.BfI());
        }
        if (musicConsumptionModel.Bty() != null) {
            A1H.put("should_allow_music_editing", musicConsumptionModel.Bty());
        }
        musicConsumptionModel.getShouldMuteAudio();
        A1H.put("should_mute_audio", Boolean.valueOf(musicConsumptionModel.getShouldMuteAudio()));
        if (musicConsumptionModel.getShouldMuteAudioReason() != null) {
            A1H.put("should_mute_audio_reason", musicConsumptionModel.getShouldMuteAudioReason());
        }
        if (musicConsumptionModel.BuG() != null) {
            MusicMuteAudioReason BuG = musicConsumptionModel.BuG();
            if (BuG != null) {
                str = BuG.A00;
            }
            A1H.put("should_mute_audio_reason_type", str);
        }
        if (musicConsumptionModel.BuU() != null) {
            A1H.put("should_render_soundwave", musicConsumptionModel.BuU());
        }
        if (musicConsumptionModel.C9r() != null) {
            A1H.put("trend_rank", musicConsumptionModel.C9r());
        }
        return 0Yt.A0B(A1H);
    }
}
