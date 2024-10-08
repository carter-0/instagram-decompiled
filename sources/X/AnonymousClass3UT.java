package X;

import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import java.io.IOException;

/* renamed from: X.3UT  reason: invalid class name */
public abstract class AnonymousClass3UT {
    public static AudioMutingInfo parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            String str2 = null;
            while (r15.A1J() != 16L.A09) {
                String A0q = r15.A0q();
                r15.A1J();
                if ("allow_audio_editing".equals(A0q)) {
                    bool = Boolean.valueOf(r15.A0d());
                } else if ("mute_audio".equals(A0q)) {
                    bool2 = Boolean.valueOf(r15.A0d());
                } else if ("mute_reason".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    musicMuteAudioReason = 1sE.A00(str);
                } else if ("mute_reason_str".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("show_muted_audio_toast".equals(A0q)) {
                    bool3 = Boolean.valueOf(r15.A0d());
                }
                r15.A0z();
            }
            if (bool == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("allow_audio_editing", "AudioMutingInfo");
            } else if (bool2 == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("mute_audio", "AudioMutingInfo");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("mute_reason_str", "AudioMutingInfo");
            } else if (bool3 != null || !(r15 instanceof 0c9)) {
                return new AudioMutingInfo(musicMuteAudioReason, str2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                ((0c9) r15).A03.A00("show_muted_audio_toast", "AudioMutingInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AudioMutingInfo audioMutingInfo) {
        r2.A0c();
        r2.A0S("allow_audio_editing", audioMutingInfo.A02);
        r2.A0S("mute_audio", audioMutingInfo.A03);
        MusicMuteAudioReason musicMuteAudioReason = audioMutingInfo.A00;
        if (musicMuteAudioReason != null) {
            r2.A0R("mute_reason", musicMuteAudioReason.A00);
        }
        String str = audioMutingInfo.A01;
        if (str != null) {
            r2.A0R("mute_reason_str", str);
        }
        r2.A0S("show_muted_audio_toast", audioMutingInfo.A04);
        r2.A0Z();
    }
}
