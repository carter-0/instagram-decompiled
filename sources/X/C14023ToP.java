package X;

import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ToP  reason: case insensitive filesystem */
public abstract /* synthetic */ class C14023ToP {
    public static Map A00(AudioMutingInfoIntf audioMutingInfoIntf) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        audioMutingInfoIntf.Ab2();
        linkedHashMap.put("allow_audio_editing", Boolean.valueOf(audioMutingInfoIntf.Ab2()));
        audioMutingInfoIntf.BV8();
        linkedHashMap.put("mute_audio", Boolean.valueOf(audioMutingInfoIntf.BV8()));
        if (audioMutingInfoIntf.BV9() != null) {
            MusicMuteAudioReason BV9 = audioMutingInfoIntf.BV9();
            if (BV9 != null) {
                str = BV9.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("mute_reason", str);
        }
        if (audioMutingInfoIntf.BVA() != null) {
            linkedHashMap.put("mute_reason_str", audioMutingInfoIntf.BVA());
        }
        audioMutingInfoIntf.Bvg();
        linkedHashMap.put("show_muted_audio_toast", Boolean.valueOf(audioMutingInfoIntf.Bvg()));
        return 0Yt.A0B(linkedHashMap);
    }
}
