package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4SK  reason: invalid class name */
public final class AnonymousClass4SK implements AnonymousClass4SL {
    public float A00 = 1.2f;
    public long A01;
    public long A02 = -9223372036854775807L;
    public final HeroPlayerSetting A03;

    public final float BVz(217 r12, float f, int i) {
        int i2 = r12.A0A - i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A02;
        if (j == -9223372036854775807L || j + 200 < elapsedRealtime) {
            this.A02 = elapsedRealtime;
            long j2 = this.A01 + ((long) i2);
            this.A01 = j2;
            int i3 = r12.A0U;
            if (i3 > 0) {
                this.A01 = Math.min((long) i3, Math.max((long) (-i3), j2));
            }
        }
        double d = r12.A01;
        float f2 = this.A00;
        double d2 = (double) f2;
        this.A00 = Math.max(0.5f, f2 * 0.95f);
        return (float) ((1.0d - ((d * d2) * ((double) i2))) - ((r12.A00 * d2) * ((double) this.A01)));
    }

    public AnonymousClass4SK(HeroPlayerSetting heroPlayerSetting) {
        this.A03 = heroPlayerSetting;
    }
}
