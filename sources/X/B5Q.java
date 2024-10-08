package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B5Q {
    public static Map A00(MusicOverlayStickerModelIntf musicOverlayStickerModelIntf) {
        String str;
        ArrayList arrayList;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (musicOverlayStickerModelIntf.Aab() != null) {
            A1H.put("alacorn_session_id", musicOverlayStickerModelIntf.Aab());
        }
        if (musicOverlayStickerModelIntf.Ab6() != null) {
            A1H.put("allow_media_creation_with_music", musicOverlayStickerModelIntf.Ab6());
        }
        musicOverlayStickerModelIntf.getAllowsSaving();
        A1H.put("allows_saving", Boolean.valueOf(musicOverlayStickerModelIntf.getAllowsSaving()));
        if (musicOverlayStickerModelIntf.getArtistId() != null) {
            A1H.put("artist_id", musicOverlayStickerModelIntf.getArtistId());
        }
        if (musicOverlayStickerModelIntf.getAudioAssetId() != null) {
            A1H.put("audio_asset_id", musicOverlayStickerModelIntf.getAudioAssetId());
        }
        if (musicOverlayStickerModelIntf.AdU() != null) {
            A1H.put("audio_asset_start_time_in_ms", musicOverlayStickerModelIntf.AdU());
        }
        if (musicOverlayStickerModelIntf.AdV() != null) {
            A1H.put(AnonymousClass000.A00(1120), musicOverlayStickerModelIntf.AdV());
        }
        if (musicOverlayStickerModelIntf.getAudioClusterId() != null) {
            A1H.put("audio_cluster_id", musicOverlayStickerModelIntf.getAudioClusterId());
        }
        String str3 = null;
        if (musicOverlayStickerModelIntf.Adc() != null) {
            List<AudioFilterInfoIntf> Adc = musicOverlayStickerModelIntf.Adc();
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
        if (musicOverlayStickerModelIntf.Adi() != null) {
            AudioMutingInfoIntf Adi = musicOverlayStickerModelIntf.Adi();
            if (Adi != null) {
                treeUpdaterJNI = Adi.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("audio_muting_info", treeUpdaterJNI);
        }
        if (musicOverlayStickerModelIntf.AiB() != null) {
            A1H.put(AnonymousClass000.A00(134), musicOverlayStickerModelIntf.AiB());
        }
        if (musicOverlayStickerModelIntf.AqO() != null) {
            A1H.put("contains_lyrics", musicOverlayStickerModelIntf.AqO());
        }
        if (musicOverlayStickerModelIntf.Arq() != null) {
            ImageUrl Arq = musicOverlayStickerModelIntf.Arq();
            if (Arq != null) {
                str2 = Arq.getUrl();
            } else {
                str2 = null;
            }
            A1H.put("cover_artwork_thumbnail_uri", str2);
        }
        if (musicOverlayStickerModelIntf.Arr() != null) {
            A1H.put("cover_artwork_uri", musicOverlayStickerModelIntf.Arr().getUrl());
        }
        if (musicOverlayStickerModelIntf.Av6() != null) {
            A1H.put("dark_message", musicOverlayStickerModelIntf.Av6());
        }
        if (musicOverlayStickerModelIntf.getDashManifest() != null) {
            A1H.put("dash_manifest", musicOverlayStickerModelIntf.getDashManifest());
        }
        if (musicOverlayStickerModelIntf.getDerivedContentId() != null) {
            A1H.put("derived_content_id", musicOverlayStickerModelIntf.getDerivedContentId());
        }
        if (musicOverlayStickerModelIntf.AwQ() != null) {
            A1H.put(C273654mx.A00(137), musicOverlayStickerModelIntf.AwQ());
        }
        if (musicOverlayStickerModelIntf.getDisplayArtist() != null) {
            A1H.put("display_artist", musicOverlayStickerModelIntf.getDisplayArtist());
        }
        if (musicOverlayStickerModelIntf.Ay7() != null) {
            List<AudioMetadataLabels> Ay7 = musicOverlayStickerModelIntf.Ay7();
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
        if (musicOverlayStickerModelIntf.AzJ() != null) {
            A1H.put("duration_in_ms", musicOverlayStickerModelIntf.AzJ());
        }
        if (musicOverlayStickerModelIntf.getFastStartProgressiveDownloadUrl() != null) {
            A1H.put("fast_start_progressive_download_url", musicOverlayStickerModelIntf.getFastStartProgressiveDownloadUrl());
        }
        if (musicOverlayStickerModelIntf.getFormattedClipsMediaCount() != null) {
            A1H.put("formatted_clips_media_count", musicOverlayStickerModelIntf.getFormattedClipsMediaCount());
        }
        if (musicOverlayStickerModelIntf.BBW() != null) {
            A1H.put("has_lyrics", musicOverlayStickerModelIntf.BBW());
        }
        if (musicOverlayStickerModelIntf.BDF() != null) {
            A1H.put("hide_remixing", musicOverlayStickerModelIntf.BDF());
        }
        if (musicOverlayStickerModelIntf.BDX() != null) {
            A1H.put("highlight_start_times_in_ms", musicOverlayStickerModelIntf.BDX());
        }
        if (musicOverlayStickerModelIntf.getId() != null) {
            C41845B3m.A0x(musicOverlayStickerModelIntf.getId(), A1H);
        }
        User BEv = musicOverlayStickerModelIntf.BEv();
        if (BEv != null) {
            A1H.put("ig_artist", BEv.A08());
        }
        if (musicOverlayStickerModelIntf.getIgUsername() != null) {
            A1H.put("ig_username", musicOverlayStickerModelIntf.getIgUsername());
        }
        if (musicOverlayStickerModelIntf.CPZ() != null) {
            A1H.put("is_bookmarked", musicOverlayStickerModelIntf.CPZ());
        }
        if (musicOverlayStickerModelIntf.CRq() != null) {
            A1H.put("is_eligible_for_audio_effects", musicOverlayStickerModelIntf.CRq());
        }
        if (musicOverlayStickerModelIntf.CSQ() != null) {
            A1H.put("is_eligible_for_vinyl_sticker", musicOverlayStickerModelIntf.CSQ());
        }
        musicOverlayStickerModelIntf.isExplicit();
        A1H.put("is_explicit", Boolean.valueOf(musicOverlayStickerModelIntf.isExplicit()));
        if (musicOverlayStickerModelIntf.CWa() != null) {
            A1H.put("is_local_audio", musicOverlayStickerModelIntf.CWa());
        }
        if (musicOverlayStickerModelIntf.CYk() != null) {
            A1H.put("is_original_sound", musicOverlayStickerModelIntf.CYk());
        }
        if (musicOverlayStickerModelIntf.Cde() != null) {
            A1H.put("is_trending_in_clips", musicOverlayStickerModelIntf.Cde());
        }
        if (musicOverlayStickerModelIntf.BNb() != null) {
            A1H.put(AnonymousClass000.A00(48), musicOverlayStickerModelIntf.BNb());
        }
        if (musicOverlayStickerModelIntf.BUy() != null) {
            MusicProduct BUy = musicOverlayStickerModelIntf.BUy();
            if (BUy != null) {
                str = BUy.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(324), str);
        }
        if (musicOverlayStickerModelIntf.getOriginalMediaId() != null) {
            A1H.put("original_media_id", musicOverlayStickerModelIntf.getOriginalMediaId());
        }
        if (musicOverlayStickerModelIntf.BZg() != null) {
            A1H.put("overlap_duration_in_ms", musicOverlayStickerModelIntf.BZg());
        }
        if (musicOverlayStickerModelIntf.BcJ() != null) {
            A1H.put(AnonymousClass000.A00(1684), musicOverlayStickerModelIntf.BcJ());
        }
        if (musicOverlayStickerModelIntf.getPlaceholderProfilePicUrl() != null) {
            A1H.put("placeholder_profile_pic_url", musicOverlayStickerModelIntf.getPlaceholderProfilePicUrl());
        }
        if (musicOverlayStickerModelIntf.getProgressiveDownloadUrl() != null) {
            A1H.put("progressive_download_url", musicOverlayStickerModelIntf.getProgressiveDownloadUrl());
        }
        if (musicOverlayStickerModelIntf.Bjs() != null) {
            A1H.put(C66579MXk.A00(25), musicOverlayStickerModelIntf.Bjs());
        }
        if (musicOverlayStickerModelIntf.BpH() != null) {
            A1H.put("sanitized_title", musicOverlayStickerModelIntf.BpH());
        }
        if (musicOverlayStickerModelIntf.Bty() != null) {
            A1H.put("should_allow_music_editing", musicOverlayStickerModelIntf.Bty());
        }
        musicOverlayStickerModelIntf.getShouldMuteAudio();
        A1H.put("should_mute_audio", Boolean.valueOf(musicOverlayStickerModelIntf.getShouldMuteAudio()));
        if (musicOverlayStickerModelIntf.getShouldMuteAudioReason() != null) {
            A1H.put("should_mute_audio_reason", musicOverlayStickerModelIntf.getShouldMuteAudioReason());
        }
        if (musicOverlayStickerModelIntf.BuG() != null) {
            MusicMuteAudioReason BuG = musicOverlayStickerModelIntf.BuG();
            if (BuG != null) {
                str3 = BuG.A00;
            }
            A1H.put("should_mute_audio_reason_type", str3);
        }
        if (musicOverlayStickerModelIntf.BuU() != null) {
            A1H.put("should_render_soundwave", musicOverlayStickerModelIntf.BuU());
        }
        if (musicOverlayStickerModelIntf.Bur() != null) {
            A1H.put(AnonymousClass000.A00(1816), musicOverlayStickerModelIntf.Bur());
        }
        if (musicOverlayStickerModelIntf.getSubtitle() != null) {
            A1H.put("subtitle", musicOverlayStickerModelIntf.getSubtitle());
        }
        if (musicOverlayStickerModelIntf.getTag() != null) {
            A1H.put("tag", musicOverlayStickerModelIntf.getTag());
        }
        if (musicOverlayStickerModelIntf.getTitle() != null) {
            C41845B3m.A12(musicOverlayStickerModelIntf.getTitle(), A1H);
        }
        if (musicOverlayStickerModelIntf.C9r() != null) {
            A1H.put("trend_rank", musicOverlayStickerModelIntf.C9r());
        }
        if (musicOverlayStickerModelIntf.CGG() != null) {
            A1H.put("web_30s_preview_download_url", musicOverlayStickerModelIntf.CGG());
        }
        return 0Yt.A0B(A1H);
    }
}
