package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4Po  reason: invalid class name and case insensitive filesystem */
public final class C264354Po extends C264364Pp {
    public float A00;
    public long A01 = -9223372036854775807L;
    public long A02;
    public final HeroPlayerSetting A03;

    public C264354Po(Context context, Handler handler, AnonymousClass4PH r15, AnonymousClass2SB r16, HeroPlayerSetting heroPlayerSetting, AnonymousClass4PB r18, AnonymousClass4Q2 r19, C265114Sp r20, C256823wP r21, boolean z) {
        super(context, handler, r15, r16, r18, r19, r20, r21, z);
        this.A03 = heroPlayerSetting;
    }

    public final void CIs(int i, Object obj) {
        if (i == 2) {
            float floatValue = ((Number) obj).floatValue();
            this.A00 = floatValue;
            if (floatValue > 0.0f) {
                this.A02 = SystemClock.elapsedRealtime();
            }
        }
        super.CIs(i, obj);
    }

    public final boolean CSi() {
        if (this.A03.A0x.A00 && CaO()) {
            return super.CSi();
        }
        if (this.A00 <= 0.0f || SystemClock.elapsedRealtime() - this.A02 < 1000 || super.CSi()) {
            return true;
        }
        return false;
    }

    public final boolean CaO() {
        long j = this.A01;
        if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
            return super.CaO();
        }
        return true;
    }

    public final void A0I() {
        super.A0I();
        this.A01 = -9223372036854775807L;
    }

    public final void A0L(long j, boolean z) {
        this.A01 = -9223372036854775807L;
        super.A0L(j, z);
    }

    public final void A0M(boolean z, boolean z2) {
        this.A01 = -9223372036854775807L;
        super.A0M(z, z2);
    }
}
