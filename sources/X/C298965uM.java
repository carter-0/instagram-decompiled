package X;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.5uM  reason: invalid class name and case insensitive filesystem */
public final class C298965uM {
    public final AudioAttributes A00;

    public C298965uM(AnonymousClass4QB r4) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(r4.A01);
        int i = Util.A00;
        if (i >= 29) {
            C298975uN.A00(usage);
            if (i >= 32) {
                C298985uO.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
