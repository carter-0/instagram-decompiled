package X;

import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4V {
    public static Map A00(OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (originalSoundConsumptionInfoIntf.Ay9() != null) {
            A1H.put("display_media_id", originalSoundConsumptionInfoIntf.Ay9());
        }
        originalSoundConsumptionInfoIntf.isBookmarked();
        A1H.put("is_bookmarked", Boolean.valueOf(originalSoundConsumptionInfoIntf.isBookmarked()));
        originalSoundConsumptionInfoIntf.isTrendingInClips();
        A1H.put("is_trending_in_clips", Boolean.valueOf(originalSoundConsumptionInfoIntf.isTrendingInClips()));
        if (originalSoundConsumptionInfoIntf.getShouldMuteAudioReason() != null) {
            A1H.put("should_mute_audio_reason", originalSoundConsumptionInfoIntf.getShouldMuteAudioReason());
        }
        if (originalSoundConsumptionInfoIntf.BuG() != null) {
            MusicMuteAudioReason BuG = originalSoundConsumptionInfoIntf.BuG();
            if (BuG != null) {
                str = BuG.A00;
            } else {
                str = null;
            }
            A1H.put("should_mute_audio_reason_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
