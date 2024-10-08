package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7g  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16825V7g {
    public static Map A00(XB5 xb5) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xb5.Aab() != null) {
            linkedHashMap.put("alacorn_session_id", xb5.Aab());
        }
        if (xb5.AbE() != null) {
            linkedHashMap.put("allows_saving", xb5.AbE());
        }
        if (xb5.getArtistId() != null) {
            linkedHashMap.put("artist_id", xb5.getArtistId());
        }
        if (xb5.getAudioClusterId() != null) {
            linkedHashMap.put("audio_cluster_id", xb5.getAudioClusterId());
        }
        if (xb5.Afe() != null) {
            linkedHashMap.put("beats", xb5.Afe());
        }
        if (xb5.AkO() != null) {
            linkedHashMap.put(AnonymousClass000.A00(4562), xb5.AkO());
        }
        String str2 = null;
        if (xb5.Arq() != null) {
            ImageUrl Arq = xb5.Arq();
            if (Arq != null) {
                str = Arq.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("cover_artwork_thumbnail_uri", str);
        }
        if (xb5.Arr() != null) {
            ImageUrl Arr = xb5.Arr();
            if (Arr != null) {
                str2 = Arr.getUrl();
            }
            linkedHashMap.put("cover_artwork_uri", str2);
        }
        if (xb5.getDashManifest() != null) {
            linkedHashMap.put("dash_manifest", xb5.getDashManifest());
        }
        if (xb5.Aw6() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1270), xb5.Aw6());
        }
        if (xb5.Aw7() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1271), xb5.Aw7());
        }
        if (xb5.getDisplayArtist() != null) {
            linkedHashMap.put("display_artist", xb5.getDisplayArtist());
        }
        if (xb5.AzI() != null) {
            linkedHashMap.put(TraceFieldType.Duration, xb5.AzI());
        }
        if (xb5.AzJ() != null) {
            linkedHashMap.put("duration_in_ms", xb5.AzJ());
        }
        if (xb5.BBW() != null) {
            linkedHashMap.put("has_lyrics", xb5.BBW());
        }
        if (xb5.BDX() != null) {
            linkedHashMap.put("highlight_start_times_in_ms", xb5.BDX());
        }
        if (xb5.getId() != null) {
            C41845B3m.A0x(xb5.getId(), linkedHashMap);
        }
        User BEv = xb5.BEv();
        if (BEv != null) {
            linkedHashMap.put("ig_artist", BEv.A08());
        }
        if (xb5.CPZ() != null) {
            linkedHashMap.put("is_bookmarked", xb5.CPZ());
        }
        if (xb5.CSt() != null) {
            linkedHashMap.put("is_explicit", xb5.CSt());
        }
        if (xb5.CWa() != null) {
            linkedHashMap.put("is_local_audio", xb5.CWa());
        }
        if (xb5.CWi() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1517), xb5.CWi());
        }
        if (xb5.CYk() != null) {
            linkedHashMap.put("is_original_sound", xb5.CYk());
        }
        if (xb5.BNb() != null) {
            linkedHashMap.put(AnonymousClass000.A00(48), xb5.BNb());
        }
        if (xb5.BZC() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1662), xb5.BZC());
        }
        if (xb5.BhY() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1721), xb5.BhY());
        }
        if (xb5.getProgressiveDownloadUrl() != null) {
            linkedHashMap.put("progressive_download_url", xb5.getProgressiveDownloadUrl());
        }
        if (xb5.Bsl() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1801), xb5.Bsl());
        }
        if (xb5.Bz0() != null) {
            linkedHashMap.put(AnonymousClass000.A00(790), xb5.Bz0());
        }
        if (xb5.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, xb5.getTitle());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
