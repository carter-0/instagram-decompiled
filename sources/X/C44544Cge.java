package X;

import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cge  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44544Cge {
    public static Map A00(TrackMetadata trackMetadata) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        trackMetadata.getAllowMediaCreationWithMusic();
        A1H.put("allow_media_creation_with_music", Boolean.valueOf(trackMetadata.getAllowMediaCreationWithMusic()));
        if (trackMetadata.Ay7() != null) {
            List<AudioMetadataLabels> Ay7 = trackMetadata.Ay7();
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
        if (trackMetadata.Ay8() != null) {
            A1H.put("display_media_id", trackMetadata.Ay8());
        }
        if (trackMetadata.getFormattedClipsMediaCount() != null) {
            A1H.put("formatted_clips_media_count", trackMetadata.getFormattedClipsMediaCount());
        }
        trackMetadata.isBookmarked();
        A1H.put("is_bookmarked", Boolean.valueOf(trackMetadata.isBookmarked()));
        if (trackMetadata.Cde() != null) {
            A1H.put("is_trending_in_clips", trackMetadata.Cde());
        }
        if (trackMetadata.BfI() != null) {
            A1H.put("previous_trend_rank", trackMetadata.BfI());
        }
        if (trackMetadata.C9r() != null) {
            A1H.put("trend_rank", trackMetadata.C9r());
        }
        return 0Yt.A0B(A1H);
    }
}
