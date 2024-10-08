package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4U {
    public static Map A00(OriginalSoundDataIntf originalSoundDataIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        originalSoundDataIntf.getAllowCreatorToRename();
        A1H.put("allow_creator_to_rename", Boolean.valueOf(originalSoundDataIntf.getAllowCreatorToRename()));
        if (originalSoundDataIntf.getAudioAssetId() != null) {
            A1H.put("audio_asset_id", originalSoundDataIntf.getAudioAssetId());
        }
        if (originalSoundDataIntf.AdU() != null) {
            A1H.put("audio_asset_start_time_in_ms", originalSoundDataIntf.AdU());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (originalSoundDataIntf.Adc() != null) {
            List<AudioFilterInfoIntf> Adc = originalSoundDataIntf.Adc();
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
        if (originalSoundDataIntf.Adj() != null) {
            List<OriginalAudioPartMetadataIntf> Adj = originalSoundDataIntf.Adj();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adj) {
                if (originalAudioPartMetadataIntf != null) {
                    A1C.add(originalAudioPartMetadataIntf.FHC());
                }
            }
            A1H.put("audio_parts", A1C);
        }
        if (originalSoundDataIntf.Adk() != null) {
            List<OriginalAudioPartMetadataIntf> Adk = originalSoundDataIntf.Adk();
            if (Adk != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 : Adk) {
                    if (originalAudioPartMetadataIntf2 != null) {
                        arrayList.add(originalAudioPartMetadataIntf2.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("audio_parts_by_filter", arrayList);
        }
        if (originalSoundDataIntf.AkO() != null) {
            A1H.put("can_remix_be_shared_to_fb", originalSoundDataIntf.AkO());
        }
        if (originalSoundDataIntf.AkP() != null) {
            A1H.put("can_remix_be_shared_to_fb_expansion", originalSoundDataIntf.AkP());
        }
        if (originalSoundDataIntf.AqB() != null) {
            A1H.put("consumption_info", originalSoundDataIntf.AqB().FHC());
        }
        if (originalSoundDataIntf.getDashManifest() != null) {
            A1H.put("dash_manifest", originalSoundDataIntf.getDashManifest());
        }
        if (originalSoundDataIntf.AzJ() != null) {
            A1H.put("duration_in_ms", originalSoundDataIntf.AzJ());
        }
        if (originalSoundDataIntf.getFormattedClipsMediaCount() != null) {
            A1H.put("formatted_clips_media_count", originalSoundDataIntf.getFormattedClipsMediaCount());
        }
        originalSoundDataIntf.getHideRemixing();
        A1H.put("hide_remixing", Boolean.valueOf(originalSoundDataIntf.getHideRemixing()));
        if (originalSoundDataIntf.BEv() != null) {
            A1H.put("ig_artist", originalSoundDataIntf.BEv().A08());
        }
        originalSoundDataIntf.isAudioAutomaticallyAttributed();
        A1H.put("is_audio_automatically_attributed", Boolean.valueOf(originalSoundDataIntf.isAudioAutomaticallyAttributed()));
        if (originalSoundDataIntf.CRq() != null) {
            A1H.put("is_eligible_for_audio_effects", originalSoundDataIntf.CRq());
        }
        if (originalSoundDataIntf.CSQ() != null) {
            A1H.put("is_eligible_for_vinyl_sticker", originalSoundDataIntf.CSQ());
        }
        originalSoundDataIntf.isExplicit();
        A1H.put("is_explicit", Boolean.valueOf(originalSoundDataIntf.isExplicit()));
        if (originalSoundDataIntf.CYh() != null) {
            A1H.put("is_original_audio_download_eligible", originalSoundDataIntf.CYh());
        }
        if (originalSoundDataIntf.Caw() != null) {
            A1H.put("is_reuse_disabled", originalSoundDataIntf.Caw());
        }
        if (originalSoundDataIntf.Cf2() != null) {
            A1H.put("is_xpost_from_fb", originalSoundDataIntf.Cf2());
        }
        if (originalSoundDataIntf.getMusicCanonicalId() != null) {
            A1H.put("music_canonical_id", originalSoundDataIntf.getMusicCanonicalId());
        }
        if (originalSoundDataIntf.BXg() != null) {
            A1H.put("oa_owner_is_music_artist", originalSoundDataIntf.BXg());
        }
        if (originalSoundDataIntf.BYy() != null) {
            OriginalAudioSubtype BYy = originalSoundDataIntf.BYy();
            0qQ.A0B(BYy, 0);
            A1H.put("original_audio_subtype", BYy.A00);
        }
        if (originalSoundDataIntf.getOriginalAudioTitle() != null) {
            A1H.put("original_audio_title", originalSoundDataIntf.getOriginalAudioTitle());
        }
        if (originalSoundDataIntf.getOriginalMediaId() != null) {
            A1H.put("original_media_id", originalSoundDataIntf.getOriginalMediaId());
        }
        if (originalSoundDataIntf.BZg() != null) {
            A1H.put("overlap_duration_in_ms", originalSoundDataIntf.BZg());
        }
        if (originalSoundDataIntf.BfI() != null) {
            A1H.put("previous_trend_rank", originalSoundDataIntf.BfI());
        }
        if (originalSoundDataIntf.getProgressiveDownloadUrl() != null) {
            A1H.put("progressive_download_url", originalSoundDataIntf.getProgressiveDownloadUrl());
        }
        originalSoundDataIntf.getShouldMuteAudio();
        A1H.put("should_mute_audio", Boolean.valueOf(originalSoundDataIntf.getShouldMuteAudio()));
        if (originalSoundDataIntf.C7I() != null) {
            A1H.put("time_created", originalSoundDataIntf.C7I());
        }
        if (originalSoundDataIntf.C9r() != null) {
            A1H.put("trend_rank", originalSoundDataIntf.C9r());
        }
        if (originalSoundDataIntf.CHN() != null) {
            XpostOriginalSoundFBCreatorInfo CHN = originalSoundDataIntf.CHN();
            if (CHN != null) {
                treeUpdaterJNI = CHN.FHC();
            }
            A1H.put("xpost_fb_creator_info", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
