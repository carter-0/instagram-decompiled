package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4S4  reason: invalid class name */
public final class AnonymousClass4S4 implements C264374Pq {
    public AnonymousClass4P7 A00 = AnonymousClass4P7.A03;
    public long A01;
    public long A02;
    public boolean A03;
    public final C697227w A04;

    public final void A00() {
        if (!this.A03) {
            this.A01 = SystemClock.elapsedRealtime();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(Bds());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A02 = j;
        if (this.A03) {
            this.A01 = SystemClock.elapsedRealtime();
        }
    }

    public final AnonymousClass4P7 BdA() {
        return this.A00;
    }

    public final long Bds() {
        long j;
        long j2 = this.A02;
        if (!this.A03) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
        AnonymousClass4P7 r4 = this.A00;
        if (r4.A01 == 1.0f) {
            j = Util.A07(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) r4.A02);
        }
        return j2 + j;
    }

    public final void Efz(AnonymousClass4P7 r3) {
        if (this.A03) {
            A02(Bds());
        }
        this.A00 = r3;
    }

    public AnonymousClass4S4(C697227w r2) {
        this.A04 = r2;
    }
}
