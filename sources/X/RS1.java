package X;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public abstract class RS1 {
    public static ImmutableList A00(SIH sih) {
        int i;
        ImmutableList.Builder builder = ImmutableList.builder();
        C249803kO it = SRK.A04.keySet().iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            int i2 = Util.A01;
            if (intValue == 20) {
                i = 30;
            } else if (intValue == 22) {
                i = 31;
            } else if (intValue != 30) {
                switch (intValue) {
                    case 2:
                    case 3:
                        i = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 21;
                        break;
                    case 7:
                    case 8:
                        i = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        i = 28;
                        break;
                    default:
                        switch (intValue) {
                            case 14:
                                i = 25;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                                break;
                            default:
                                i = Integer.MAX_VALUE;
                                break;
                        }
                        i = 28;
                        break;
                }
            } else {
                i = 34;
            }
            if (i2 >= i) {
                AudioFormat build = new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build();
                C10146RnN rnN = sih.A00;
                if (rnN == null) {
                    rnN = new C10146RnN();
                    sih.A00 = rnN;
                }
                if (AudioTrack.isDirectPlaybackSupported(build, rnN.A00)) {
                    builder.add(number);
                }
            }
        }
        builder.add(C66580MXl.A0q());
        return builder.build();
    }
}
