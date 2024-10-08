package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ma4  reason: case insensitive filesystem */
public abstract /* synthetic */ class C66635Ma4 {
    public static Map A00(TrackData trackData) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        trackData.getAllowsSaving();
        A1H.put("allows_saving", Boolean.valueOf(trackData.getAllowsSaving()));
        if (trackData.getArtistId() != null) {
            A1H.put("artist_id", trackData.getArtistId());
        }
        if (trackData.getAudioAssetId() != null) {
            A1H.put("audio_asset_id", trackData.getAudioAssetId());
        }
        if (trackData.getAudioClusterId() != null) {
            A1H.put("audio_cluster_id", trackData.getAudioClusterId());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (trackData.Arq() != null) {
            ImageUrl Arq = trackData.Arq();
            if (Arq != null) {
                str = Arq.getUrl();
            } else {
                str = null;
            }
            A1H.put("cover_artwork_thumbnail_uri", str);
        }
        if (trackData.Arr() != null) {
            A1H.put("cover_artwork_uri", trackData.Arr().getUrl());
        }
        if (trackData.Av6() != null) {
            A1H.put("dark_message", trackData.Av6());
        }
        if (trackData.getDashManifest() != null) {
            A1H.put("dash_manifest", trackData.getDashManifest());
        }
        if (trackData.getDisplayArtist() != null) {
            A1H.put("display_artist", trackData.getDisplayArtist());
        }
        if (trackData.AzJ() != null) {
            A1H.put("duration_in_ms", trackData.AzJ());
        }
        if (trackData.getFastStartProgressiveDownloadUrl() != null) {
            A1H.put("fast_start_progressive_download_url", trackData.getFastStartProgressiveDownloadUrl());
        }
        if (trackData.BBW() != null) {
            A1H.put("has_lyrics", trackData.BBW());
        }
        if (trackData.BDX() != null) {
            A1H.put("highlight_start_times_in_ms", trackData.BDX());
        }
        if (trackData.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, trackData.getId());
        }
        if (trackData.getIgUsername() != null) {
            A1H.put("ig_username", trackData.getIgUsername());
        }
        if (trackData.CRq() != null) {
            A1H.put("is_eligible_for_audio_effects", trackData.CRq());
        }
        if (trackData.CSQ() != null) {
            A1H.put("is_eligible_for_vinyl_sticker", trackData.CSQ());
        }
        trackData.isExplicit();
        A1H.put("is_explicit", Boolean.valueOf(trackData.isExplicit()));
        if (trackData.BOn() != null) {
            LyricsIntf BOn = trackData.BOn();
            if (BOn != null) {
                treeUpdaterJNI = BOn.FHC();
            }
            A1H.put("lyrics", treeUpdaterJNI);
        }
        if (trackData.getProgressiveDownloadUrl() != null) {
            A1H.put("progressive_download_url", trackData.getProgressiveDownloadUrl());
        }
        if (trackData.Bjs() != null) {
            A1H.put("reactive_audio_download_url", trackData.Bjs());
        }
        if (trackData.BpH() != null) {
            A1H.put("sanitized_title", trackData.BpH());
        }
        if (trackData.getSubtitle() != null) {
            A1H.put("subtitle", trackData.getSubtitle());
        }
        if (trackData.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, trackData.getTitle());
        }
        if (trackData.CGG() != null) {
            A1H.put("web_30s_preview_download_url", trackData.CGG());
        }
        return 0Yt.A0B(A1H);
    }
}
