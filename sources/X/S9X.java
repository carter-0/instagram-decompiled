package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class S9X {
    public static long A00(Context context, C13725Tfv tfv, C266714aE r10, C10862RzN rzN) {
        MediaComposition mediaComposition = rzN.A08;
        if (mediaComposition != null) {
            return Q1Z.A00(tfv, r10, mediaComposition);
        }
        File file = rzN.A0D;
        if (file != null) {
            long j = rzN.A04;
            if (j < 0) {
                j = 0;
            }
            long j2 = rzN.A00;
            if (j2 < 0) {
                Uri fromFile = Uri.fromFile(file);
                0qQ.A0B(fromFile, 0);
                C7232Q0d A01 = SRj.A01(context, fromFile, false);
                if (A01 == null) {
                    return -1;
                }
                j2 = A01.A07;
            }
            return TimeUnit.MILLISECONDS.toMicros(j2 - j);
        }
        throw new Exception("No input data source provided");
    }

    public static void A01(C13860Tig tig, C10862RzN rzN) {
        MediaComposition mediaComposition = rzN.A08;
        if (mediaComposition != null) {
            tig.ETq(mediaComposition);
            return;
        }
        File file = rzN.A0D;
        if (file != null) {
            tig.ETs(file);
            tig.EpM(Pxe.A0V(TimeUnit.MILLISECONDS, rzN.A04, rzN.A00));
            return;
        }
        throw new Exception("No valid data source provided");
    }
}
