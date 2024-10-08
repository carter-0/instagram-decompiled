package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class S8R {
    public static final Map A01(Context context, MediaComposition mediaComposition, boolean z) {
        Number number;
        if (!(mediaComposition == null || (number = (Number) 00k.A0A(A00(mediaComposition, z))) == null)) {
            C266794aM A04 = mediaComposition.A04(C266714aE.AUDIO, number.intValue());
            if (A04 != null) {
                long A01 = Q1Z.A01(new SrT(context, C9955RkA.A00), A04);
                if (Long.valueOf(A01) != null) {
                    0Ym r2 = new 0Ym(1);
                    r2.put("video_duration", String.valueOf(TimeUnit.MICROSECONDS.toMillis(A01)));
                    return 0se.A0N(r2);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return null;
    }

    public static final HashSet A00(MediaComposition mediaComposition, boolean z) {
        int A02;
        HashSet A1F = AnonymousClass7TE.A1F();
        if (z && (A02 = mediaComposition.A02(C266714aE.AUDIO, "video_audio_0")) != -1) {
            AnonymousClass7TF.A1M(A1F, A02);
        }
        return A1F;
    }
}
