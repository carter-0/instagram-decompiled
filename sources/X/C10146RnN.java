package X;

import android.media.AudioAttributes;
import androidx.media3.common.util.Util;

/* renamed from: X.RnN  reason: case insensitive filesystem */
public final class C10146RnN {
    public final AudioAttributes A00;

    public C10146RnN() {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Util.A01;
        if (i >= 29) {
            C9171RRw.A00(usage);
            if (i >= 32) {
                C9172RRx.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
