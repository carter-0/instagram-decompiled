package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KqE  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63023KqE {
    public static Map A00(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (originalAudioPartMetadataIntf.Adc() != null) {
            List<AudioFilterInfoIntf> Adc = originalAudioPartMetadataIntf.Adc();
            if (Adc != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (AudioFilterInfoIntf audioFilterInfoIntf : Adc) {
                    if (audioFilterInfoIntf != null) {
                        arrayList.add(audioFilterInfoIntf.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1122), arrayList);
        }
        originalAudioPartMetadataIntf.Adr();
        A1H.put(C273654mx.A00(1499), Integer.valueOf(originalAudioPartMetadataIntf.Adr()));
        if (originalAudioPartMetadataIntf.Adu() != null) {
            MusicCanonicalType Adu = originalAudioPartMetadataIntf.Adu();
            0qQ.A0B(Adu, 0);
            A1H.put("audio_type", Adu.A00);
        }
        if (originalAudioPartMetadataIntf.getDisplayArtist() != null) {
            A1H.put("display_artist", originalAudioPartMetadataIntf.getDisplayArtist());
        }
        if (originalAudioPartMetadataIntf.getDisplayTitle() != null) {
            A1H.put(C273654mx.A00(143), originalAudioPartMetadataIntf.getDisplayTitle());
        }
        originalAudioPartMetadataIntf.getDurationInMs();
        A1H.put("duration_in_ms", Integer.valueOf(originalAudioPartMetadataIntf.getDurationInMs()));
        User BEv = originalAudioPartMetadataIntf.BEv();
        if (BEv != null) {
            A1H.put("ig_artist", BEv.A08());
        }
        originalAudioPartMetadataIntf.isBookmarked();
        A1H.put("is_bookmarked", Boolean.valueOf(originalAudioPartMetadataIntf.isBookmarked()));
        if (originalAudioPartMetadataIntf.CRq() != null) {
            A1H.put("is_eligible_for_audio_effects", originalAudioPartMetadataIntf.CRq());
        }
        originalAudioPartMetadataIntf.isExplicit();
        A1H.put("is_explicit", Boolean.valueOf(originalAudioPartMetadataIntf.isExplicit()));
        if (originalAudioPartMetadataIntf.getMusicCanonicalId() != null) {
            A1H.put("music_canonical_id", originalAudioPartMetadataIntf.getMusicCanonicalId());
        }
        originalAudioPartMetadataIntf.Bag();
        A1H.put(C273654mx.A00(3114), Integer.valueOf(originalAudioPartMetadataIntf.Bag()));
        if (originalAudioPartMetadataIntf.C72() != null) {
            A1H.put("thumbnail_uri", originalAudioPartMetadataIntf.C72().getUrl());
        }
        return 0Yt.A0B(A1H);
    }
}
