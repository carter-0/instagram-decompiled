package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.5Nv  reason: invalid class name and case insensitive filesystem */
public final class C284765Nv extends C266114Xp {
    public float A00;
    public long A01 = -9223372036854775807L;
    public long A02;
    public final HeroPlayerSetting A03;

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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C284765Nv(android.content.Context r15, android.os.Handler r16, X.AnonymousClass4PH r17, X.AnonymousClass2SB r18, com.facebook.video.heroplayer.setting.HeroPlayerSetting r19, X.AnonymousClass4PB r20, X.AnonymousClass4Q2 r21, X.C284785Nx r22, X.C256823wP r23, boolean r24) {
        /*
            r14 = this;
            r2 = r19
            boolean r13 = r2.A2r
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14.A01 = r0
            r14.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284765Nv.<init>(android.content.Context, android.os.Handler, X.4PH, X.2SB, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.4PB, X.4Q2, X.5Nx, X.3wP, boolean):void");
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
